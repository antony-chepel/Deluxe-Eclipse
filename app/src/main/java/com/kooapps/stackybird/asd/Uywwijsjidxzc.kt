package com.kooapps.stackybird.asd
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Looper
import android.os.Environment
import android.webkit.*
import android.util.Log
import android.provider.MediaStore
import android.os.Bundle
import android.os.Handler
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.bkovbkokonkoko
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.fpllplppxclvplpxcvkodjif
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.rpleplpwplwlplpslpd
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.net.Uri
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import java.text.SimpleDateFormat


import java.util.*





class Uywwijsjidxzc : AppCompatActivity() {
    lateinit var udsjifok: WebView
    private var rerokekokoksd: String? = null
    private val gghvhuuhchu by viewModel<Iowowisjxc>(
        named("BeamModel")
    )
    var rpelewls = ""
    private var tyvgjcjivd = false
    private var elplpsalpdokxkoc: ValueCallback<Array<Uri>>? = null
    private  val gcyvhu = 1

    override fun onActivityResult(uviicjjd: Int, rlpllpsad: Int, ygcvuxhhvud: Intent?) {

        if (uviicjjd != gcyvhu || elplpsalpdokxkoc == null) {
            super.onActivityResult(uviicjjd, rlpllpsad, ygcvuxhhvud)
            return
        }
        var nvnmcijjijfid: Array<Uri>? = null

        if (rlpllpsad == RESULT_OK) {
            if (ygcvuxhhvud == null) {
                if (rerokekokoksd != null) {
                    nvnmcijjijfid = arrayOf(Uri.parse(rerokekokoksd))
                }
            } else {
                val rokkepllplsd = ygcvuxhhvud.dataString
                if (rokkepllplsd != null) {
                    nvnmcijjijfid = arrayOf(Uri.parse(rokkepllplsd))
                }
            }
        }
        elplpsalpdokxkoc!!.onReceiveValue(nvnmcijjijfid)
        elplpsalpdokxkoc = null
        return
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        udsjifok = WebView(this)
        setContentView(udsjifok)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(udsjifok, true)
        gghvhuuhchu.fokrokdlppf(udsjifok)

        udsjifok.webViewClient = Hjsiisisuxuc()
        udsjifok.webChromeClient = Tppqppqowkkosd()
        udsjifok.loadUrl(fodsoosijuhcvhu())
    }




    fun focokxoklpv(plelplpw: String?) {
        if (!plelplpw!!.contains("t.me")) {

            if (rpelewls == "") {
                rpelewls = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    plelplpw
                ).toString()

                val nhcuhvygdgsg = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val sokdokokkoxc = nhcuhvygdgsg.edit()
                sokdokokkoxc.putString("SAVED_URL", plelplpw)
                sokdokokkoxc.apply()
            }
        }
    }

    inner class Tppqppqowkkosd : WebChromeClient() {

        override fun onShowFileChooser(
            hcbvdjdijs: WebView?,
            rpleplpllpskodkox: ValueCallback<Array<Uri>>?,
            kofokrok: FileChooserParams?
        ): Boolean {
            elplpsalpdokxkoc?.onReceiveValue(null)
            elplpsalpdokxkoc = rpleplpllpskodkox
            var cnnvmjxhudhu: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cnnvmjxhudhu!!.resolveActivity(packageManager) != null) {
                var dpsllpepl: File? = null
                try {
                    dpsllpepl = recxuvhuhd()
                    cnnvmjxhudhu.putExtra("PhotoPath", rerokekokoksd)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (dpsllpepl != null) {
                    rerokekokoksd = "file:" + dpsllpepl.absolutePath
                    cnnvmjxhudhu.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(dpsllpepl)
                    )
                } else {
                    cnnvmjxhudhu = null
                }
            }
            val dpfkooke = Intent(Intent.ACTION_GET_CONTENT)
            dpfkooke.addCategory(Intent.CATEGORY_OPENABLE)
            dpfkooke.type = "image/*"
            val ycvhuhuxcv: Array<Intent?> = cnnvmjxhudhu?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val apllqplp = Intent(Intent.ACTION_CHOOSER)
            apllqplp.putExtra(Intent.EXTRA_INTENT, dpfkooke)
            apllqplp.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            apllqplp.putExtra(Intent.EXTRA_INITIAL_INTENTS, ycvhuhuxcv)
            startActivityForResult(apllqplp, gcyvhu)
            return true
        }

        fun recxuvhuhd(): File? {
            val ncjivjjijidhuhufhudhu = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val forkokeokkwijsjid = "JPEG_" + ncjivjjijidhuhufhudhu + "_"
            val wpqplwlpsd = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                forkokeokkwijsjid,
                ".jpg",
                wpqplwlpsd
            )
        }
    }
    private fun fodsoosijuhcvhu(): String {
        val hfueijdi = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val jckvkooijfjicv = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val tokokror = hfueijdi.getString(fpllplppxclvplpxcvkodjif, null)
        val spelrlppldlpfokokcv = hfueijdi.getString(rpleplpwplwlplpslpd, null)
        val apzppxock = hfueijdi.getString(bkovbkokonkoko, null)
        when (hfueijdi.getString("WebInt", null)) {
            "campaign" -> {
                gghvhuuhchu.gkokopllxpcvlpokokkosd(spelrlppldlpfokokcv.toString())
            }
            "deepLink" -> {
                gghvhuuhchu.gkokopllxpcvlpokokkosd(spelrlppldlpfokokcv.toString())
            }
            "deepLinkNOApps" -> {
                gghvhuuhchu.gkokopllxpcvlpokokkosd(tokokror.toString())
            }
            "geo" -> {
                gghvhuuhchu.gkokopllxpcvlpokokkosd(tokokror.toString())
            }
        }
        return jckvkooijfjicv.getString("SAVED_URL", apzppxock).toString()
    }

    inner class Hjsiisisuxuc: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (gghvhuuhchu.kidoskhucx(url)) {

                    val gcvijijxijjid = Intent(Intent.ACTION_VIEW)
                    gcvijijxijjid.data = Uri.parse(url)
                    startActivity(gcvijijxijjid)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            focokxoklpv(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Uywwijsjidxzc, description, Toast.LENGTH_SHORT).show()
        }
    }



    override fun onBackPressed() {

        if (udsjifok.canGoBack()) {
            if (tyvgjcjivd) {
                udsjifok.stopLoading()
                udsjifok.loadUrl(rpelewls)
            }
            this.tyvgjcjivd = true
            udsjifok.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                tyvgjcjivd = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


}

