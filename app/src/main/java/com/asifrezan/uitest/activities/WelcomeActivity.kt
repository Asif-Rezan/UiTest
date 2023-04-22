package com.asifrezan.uitest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.view.GestureDetectorCompat
import androidx.viewpager.widget.ViewPager
import com.asifrezan.uitest.MainActivity
import com.asifrezan.uitest.R
import com.asifrezan.uitest.adapter.MyPagerAdapter
import com.asifrezan.uitest.fregments.*
import com.google.android.material.tabs.TabLayout

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.activity_welcome)


        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)


        val adapter = MyPagerAdapter(supportFragmentManager)
        adapter.addFragment(WelcomeFragment(), "First")
        adapter.addFragment(DeleveryFragment(), "Second")
        adapter.addFragment(GroceryFragment(),"Third")
        adapter.addFragment(StartMainActivityHelperFragment(),"Fourth")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)












    }
}