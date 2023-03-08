package com.kooapps.stackybird.asd
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application



class Iowowisjxc(ocxivjijijokdosk: Application): ViewModel() {
    val reookslpdapx = ocxivjijijokdosk.packageManager


    fun kidoskhucx(dokeowko: String): Boolean {
        try {
            reookslpdapx.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun gkokopllxpcvlpokokkosd(teiuwijjiw: String) {
        OneSignal.setExternalUserId(
            teiuwijjiw,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(hcvkcovo: JSONObject) {
                    try {
                        if (hcvkcovo.has("push") && hcvkcovo.getJSONObject("push").has("success")) {
                            val epllpwlplq = hcvkcovo.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $epllpwlplq"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hcvkcovo.has("email") && hcvkcovo.getJSONObject("email").has("success")) {
                            val coocvpxod =
                                hcvkcovo.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $coocvpxod"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hcvkcovo.has("sms") && hcvkcovo.getJSONObject("sms").has("success")) {
                            val tdijijicjixjizjijcs = hcvkcovo.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $tdijijicjixjizjijcs"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    fun fokrokdlppf(gkokkvobijhuvhubf: WebView): WebSettings{
        val roekokw = gkokkvobijhuvhubf.settings
        roekokw.displayZoomControls = false
        roekokw.mediaPlaybackRequiresUserGesture = false
        roekokw.loadWithOverviewMode = true
        roekokw.javaScriptCanOpenWindowsAutomatically = true
        roekokw.builtInZoomControls = true
        roekokw.userAgentString = roekokw.userAgentString.replace("; wv", "")
        roekokw.allowContentAccess = true
        roekokw.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        roekokw.domStorageEnabled = true
        roekokw.setSupportZoom(true)
        roekokw.allowContentAccess = true
        roekokw.setSupportMultipleWindows(false)
        roekokw.useWideViewPort = true
        roekokw.pluginState = WebSettings.PluginState.ON
        roekokw.allowFileAccess = true
        roekokw.cacheMode = WebSettings.LOAD_DEFAULT
        roekokw.allowFileAccess = true
        roekokw.javaScriptEnabled = true

        return roekokw
    }




}