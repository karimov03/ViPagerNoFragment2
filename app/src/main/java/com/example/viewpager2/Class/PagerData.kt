package com.example.viewpager2.Class

import com.example.viewpager2.R

object PagerData {
    data class Pager(
        val image:Int,
        val name:String,
        val aabout:String
    )

    val PagerList=ArrayList<Pager>()

    fun AddList(){
        PagerList.add(Pager(R.drawable.img1,"Click va Paymega o’tish xizmati","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        PagerList.add(Pager(R.drawable.img2,"Barcha operatorlar bo’yicha statistika","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        PagerList.add(Pager(R.drawable.img3,"Tariflarni filtrlash","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        PagerList.add(Pager(R.drawable.img4,"Yangi imkoniyatlar","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))

    }
}