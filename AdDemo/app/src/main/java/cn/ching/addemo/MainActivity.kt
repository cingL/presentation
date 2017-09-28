package cn.ching.addemo

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import cn.ching.addemo.adapter.AdPagerAdapter
import com.google.android.gms.ads.MobileAds


class MainActivity : AppCompatActivity() {

    var viewpager: ViewPager? = null
    var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initial AdMob
        MobileAds.initialize(this, "ca-app-pub-8800945911816873~3153224998")

        viewpager = findViewById(R.id.viewpager)
        tabLayout = findViewById(R.id.tab_layout)

        tabLayout?.setupWithViewPager(viewpager)
        viewpager?.adapter = AdPagerAdapter(supportFragmentManager)
        viewpager?.offscreenPageLimit = 2

    }


}


