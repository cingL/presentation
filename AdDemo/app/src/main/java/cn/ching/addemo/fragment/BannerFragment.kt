package cn.ching.addemo.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cn.ching.addemo.R
import cn.ching.addemo.createAdRequest
import com.google.android.gms.ads.AdView


/**
 * A simple [Fragment] subclass.
 * show banner advertise
 */
class BannerFragment : Fragment() {

    var adView: AdView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater!!.inflate(R.layout.fragment_banner, container, false)
        adView = root.findViewById(R.id.adView)
        return root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        adView?.loadAd(createAdRequest())
    }
}
