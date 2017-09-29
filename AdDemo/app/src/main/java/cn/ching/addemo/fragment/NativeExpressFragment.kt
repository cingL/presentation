package cn.ching.addemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.ching.addemo.R
import cn.ching.addemo.createAdRequest
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.NativeExpressAdView
import com.google.android.gms.ads.VideoController
import com.google.android.gms.ads.VideoOptions

/**
 * A simple [Fragment] subclass.
 * show native express advertise
 */
class NativeExpressFragment : Fragment() {


    var nAdView: NativeExpressAdView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater!!.inflate(R.layout.fragment_native_express, container, false)
        nAdView = root.findViewById(R.id.nativeAdView)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //video setting
//        nAdView?.videoOptions = VideoOptions.Builder().setStartMuted(true).build()
//        nAdView?.videoController?.videoLifecycleCallbacks = object : VideoController.VideoLifecycleCallbacks() {
//            override fun onVideoEnd() {
//                Log.d("TAG", "Video playback is finished.")
//            }
//        }
//        nAdView?.adListener = object : AdListener(){
//            override fun onAdLoaded() {
//                if (nAdView?.videoController!!.hasVideoContent())
//                    Log.d("TAG", "Received an ad that contains a video asset.")
//                else
//                    Log.d("TAG", "Received an ad that does not contain a video asset.")
//            }
//        }

        nAdView?.loadAd(createAdRequest())

    }


}// Required empty public constructor
