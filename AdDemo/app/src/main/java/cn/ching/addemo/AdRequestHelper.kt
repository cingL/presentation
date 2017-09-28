package cn.ching.addemo

import com.google.android.gms.ads.AdRequest

/**
 * create ad request with test device number
 * Created by ching on 2017/9/27.
 */
fun createAdRequest(): AdRequest {
    return AdRequest.Builder().addTestDevice("ABF8675B648915C1F8AA6ABBE639AF5E").build()
}