package cn.ching.addemo.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import cn.ching.addemo.fragment.BannerFragment
import cn.ching.addemo.fragment.InterstitialFragment
import cn.ching.addemo.fragment.NativeExpressFragment

/**
 * pager adapter
 * Created by ching on 2017/9/27.
 */
class AdPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    private val fragmentList = arrayListOf<Fragment>()
    private val title = arrayOf("banner","interstitial","NativeExpress")

    init {
        val banner = BannerFragment()
        val inter = InterstitialFragment()
        val native = NativeExpressFragment()
        fragmentList.add(banner)
        fragmentList.add(inter)
        fragmentList.add(native)
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return title[position]
    }
}