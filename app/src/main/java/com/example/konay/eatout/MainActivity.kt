package com.example.konay.eatout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import java.util.Random

class MainActivity : AppCompatActivity() {
    val random = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val restaurant = arrayOf("つけ麺凌駕", "らーめん凌駕", "こころ", "マクドナルド", "婆娑羅", "四川屋台", "新源", "サイゼリヤ", "一食", "二食", "歌志軒", "王将", "CoCo壱", "昼顔", "たんや", "松屋")
        button.setOnClickListener {
            var index = rand(0,restaurant.size)
            textview.text=restaurant[index]
        }
    }
    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }

}
