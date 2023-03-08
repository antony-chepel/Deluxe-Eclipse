package com.kooapps.stackybird.hgfbdf

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import com.kooapps.stackybird.asd.psaodijsaji
import com.kooapps.stackybird.bvicijjicf.isahudashu
import com.kooapps.stackybird.bvicijjicf.poopsokadkos
import com.kooapps.stackybird.databinding.ActivityOisppxpzocswBinding
import com.kooapps.stackybird.rwerasd.Kwqoqyuxgctftfxcs
import kotlin.random.Random

class Oisppxpzocsw : AppCompatActivity() {
    private var saijdjijix: CountDownTimer? = null
    private lateinit var cixjvjixcji: SharedPreferences

    private lateinit var dokkokowkods : ActivityOisppxpzocswBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dokkokowkods = ActivityOisppxpzocswBinding.inflate(layoutInflater)
        setContentView(dokkokowkods.root)
        cixjvjixcji = getSharedPreferences("scores_del_main", MODE_PRIVATE)
        poopsokadkos = cixjvjixcji.getInt("scores_del_main",0)
        dokkokowkods.oktkokofkodkogkokocv.setOnClickListener {
            sooslxlczozxjiijs()
        }

    }


    private fun civcixviuhsud() = with(dokkokowkods){
        val sdokwko = isahudashu[Random.nextInt(7)]
        val cixjvji = isahudashu[Random.nextInt(7)]
        val dokkooksdkoajiixjc = isahudashu[Random.nextInt(7)]

        val cxijvjidjiijs = psaodijsaji[Random.nextInt(9)]

        val dokkoxczkokozxkosji = poopsokadkos + cxijvjidjiijs
        cixjvjixcji.edit().putInt("scores_del_main",dokkoxczkokozxkosji).apply()

        fokeko.setImageResource(sdokwko)
        xijcvji.setImageResource(cixjvji)
        sopwkoqkokosdji.setImageResource(dokkooksdkoajiixjc)

    }

    private fun sooslxlczozxjiijs() = with(dokkokowkods){
        var fkokodjicjixv = 0
        saijdjijix?.cancel()
        saijdjijix = object : CountDownTimer(4000,100){
            override fun onTick(millisUntilFinished: Long) {
                fkokodjicjixv++
                oktkokofkodkogkokocv.alpha = 0.7f
                oktkokofkodkogkokocv.isClickable = false
                if(fkokodjicjixv>6)fkokodjicjixv = 0
                fokeko.setImageResource(isahudashu[fkokodjicjixv])
                xijcvji.setImageResource(isahudashu[fkokodjicjixv])
                sopwkoqkokosdji.setImageResource(isahudashu[fkokodjicjixv])


            }

            override fun onFinish() {
                oktkokofkodkogkokocv.alpha = 1.0f
                civcixviuhsud()
                Handler().postDelayed({

                    startActivity(
                        Intent(this@Oisppxpzocsw, Kwqoqyuxgctftfxcs::class.java)
                    )
                },1000)




            }

        }.start()
    }





    override fun onDestroy() {
        super.onDestroy()
        saijdjijix?.cancel()
    }
}