package cn.ching.addemo.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import cn.ching.addemo.R
import cn.ching.addemo.createAdRequest
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.InterstitialAd


/**
 * A simple [Fragment] subclass.
 * show interstitial advertise
 */
class InterstitialFragment : Fragment() {

    var btn: Button? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val root = inflater!!.inflate(R.layout.fragment_interstitial, container, false)
        btn = root.findViewById(R.id.interstitial)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val interstitialAd = InterstitialAd(context)
        interstitialAd.adUnitId = "ca-app-pub-8800945911816873/3430580687"
        interstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                interstitialAd.loadAd(createAdRequest())//load new ad
            }
        }
        btn?.setOnClickListener { _ ->
            if (interstitialAd.isLoaded) {
                interstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        interstitialAd.loadAd(createAdRequest())

    }
}// Required empty public constructor
