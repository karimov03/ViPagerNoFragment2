package com.example.viewpager2.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager2.Class.PagerData
import com.example.viewpager2.databinding.ItempagerBinding

class PagerAdapter(val list: ArrayList<PagerData.Pager>): PagerAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemPagerBinding =
            ItempagerBinding.inflate(LayoutInflater.from(container.context), container, false)
        itemPagerBinding.pagerImage.setBackgroundResource(list[position].image)
        itemPagerBinding.pagerName.text = list[position].name
        itemPagerBinding.pagerAbout.text = list[position].aabout
        container.addView(itemPagerBinding.root)
        return itemPagerBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}