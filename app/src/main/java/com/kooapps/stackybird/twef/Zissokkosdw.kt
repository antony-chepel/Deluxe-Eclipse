package com.kooapps.stackybird.twef
import android.app.Application
import com.kooapps.stackybird.bvicijjicf.diskofkoe
import com.kooapps.stackybird.bvicijjicf.irooeojiijdjfsf
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.fpllplppxclvplpxcvkodjif
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.ncnxjnvjnjnxcjijisdji
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.xiziiz
import org.koin.android.ext.koin.androidContext
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*
import android.content.Context
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.aplaslplpx



class Zissokkosdw: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(xiziiz)

        val siajduhwhu = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val oskijduhhuhuchucij = getSharedPreferences("PREFS_NAME", 0)

        val hdtsty = MyTracker.getTrackerParams()
        val appqookwkoosidjjix = MyTracker.getTrackerConfig()
        val ycytxvhud = MyTracker.getInstanceId(this)
        appqookwkoosidjjix.isTrackingLaunchEnabled = true
        val xzock = UUID.randomUUID().toString()

        if (oskijduhhuhuchucij.getBoolean("my_first_time", true)) {
            hdtsty.setCustomUserId(xzock)
            siajduhwhu.edit().putString(fpllplppxclvplpxcvkodjif, xzock).apply()
            siajduhwhu.edit().putString(aplaslplpx, ycytxvhud).apply()
            oskijduhhuhuchucij.edit().putBoolean("my_first_time", false).apply()
        } else {
            val zkkicuhuvhcjifd = siajduhwhu.getString(fpllplppxclvplpxcvkodjif, xzock)
            hdtsty.setCustomUserId(zkkicuhuvhcjifd)
        }
        MyTracker.initTracker(ncnxjnvjnjnxcjijisdji, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Zissokkosdw)
            modules(
                listOf(
                    irooeojiijdjfsf, diskofkoe
                )
            )
        }
    }
}