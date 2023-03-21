package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.viewpager2.Adapters.PagerAdapter
import com.example.viewpager2.Class.PagerData
import com.example.viewpager2.databinding.ActivityMainBinding
import com.example.viewpager2.databinding.ItemtabBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var adapter: PagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        PagerData.AddList()
        adapter = PagerAdapter(PagerData.PagerList)
        binding.viewpager.adapter = adapter

        binding.tablayout.setupWithViewPager(binding.viewpager)

        val tabCount = binding.tablayout.tabCount


        for (i in 0 until tabCount) {
            val tabItem = ItemtabBinding.inflate(layoutInflater)
            val tab = binding.tablayout.getTabAt(i)
            tab?.customView = tabItem.root

            if (i == 0) {
                tabItem.imageTab.setImageResource(R.drawable.dot1)
            } else {
                tabItem.imageTab.setImageResource(R.drawable.dot2)

            }


            val binding1 = ItemtabBinding.inflate(layoutInflater)

            binding.tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {

                    val customView = tab?.customView
                    customView?.findViewById<ImageView>(R.id.image_tab)
                        ?.setImageResource(R.drawable.dot1)
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {

                    val customView = tab?.customView
                    customView?.findViewById<ImageView>(R.id.image_tab)
                        ?.setImageResource(R.drawable.dot2)

                }


                override fun onTabReselected(tab: TabLayout.Tab?) {

                }

            })
        }


        var index = 0
        binding.viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {
                index = position
            }

            override fun onPageSelected(position: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
        binding.tvKeyingisi.setOnClickListener {
            when (index) {
                0 -> {
                    binding.viewpager.currentItem = index + 1
                }
                1 -> {
                    binding.viewpager.currentItem = index + 1

                }
                2 -> {
                    binding.viewpager.currentItem = index + 1

                }
                3 -> {
                    binding.viewpager.currentItem = index - 3

                }
            }
            binding.tvOtkazish.setOnClickListener {
                when (index) {
                    0 -> {
                        binding.viewpager.currentItem = tabCount
                    }
                    1 -> {
                        binding.viewpager.currentItem = tabCount

                    }
                    2 -> {
                        binding.viewpager.currentItem = tabCount

                    }
                    3 -> {
                        binding.viewpager.currentItem = tabCount

                    }
                }
            }

        }
    }
}