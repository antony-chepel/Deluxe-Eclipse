package com.kooapps.stackybird.rwerasd

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import com.kooapps.stackybird.R
import com.kooapps.stackybird.asd.xcozk
import com.kooapps.stackybird.bvicijjicf.fodgkodf
import com.kooapps.stackybird.bvicijjicf.sokadokdasosk
import com.kooapps.stackybird.databinding.ActivityKwqoqyuxgctftfxcsBinding
import com.kooapps.stackybird.wwqsda.Iusiwijsuhhuxczs
import kotlin.random.Random

class Kwqoqyuxgctftfxcs : AppCompatActivity() {
    var gokkookdskofkosjixjizcji = true
    var dplelpwpl = 0
    private lateinit var sdwko: SharedPreferences
    var xcuhvhuxc = 0
    private lateinit var hcxbbvxbhxhc : ActivityKwqoqyuxgctftfxcsBinding
    var xcijvjixjijxcvdhuhud = ArrayList<Int>()
    var frokeokwkokosad = 1
    var alpalpskokoxkoczjizjixhushu = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hcxbbvxbhxhc = ActivityKwqoqyuxgctftfxcsBinding.inflate(layoutInflater)
        setContentView(hcxbbvxbhxhc.root)
        sdwko = getSharedPreferences("scores_deluxe", MODE_PRIVATE)
    }



    fun gyxcvgydshu(oaskdkow: ImageView, gyxcvgydhu: Int) {
        if (frokeokwkokosad == 1) {
            oaskdkow.setImageResource(R.drawable.del_ecl_2)
            val txcyvxchu = sokadokdasosk[Random.nextInt(7)]
            alpalpskokoxkoczjizjixhushu += txcyvxchu
            hcxbbvxbhxhc.tvWldScore.text = "Deluxe bonus : $alpalpskokoxkoczjizjixhushu mini scores"
            sdwko.edit().putInt("scores_deluxe",alpalpskokoxkoczjizjixhushu).apply()
            xcozk.add(gyxcvgydhu)
            xcijvjixjijxcvdhuhud.add(gyxcvgydhu)
            oaskdkow.isEnabled = false
            val uhijdwjijidwjisd = icxjvjixuhudshu()
            if (uhijdwjijidwjisd == 1) {
                Handler().postDelayed(Runnable { jixcijzhucxhuzs() }, 2000)
            }

        } else {
            oaskdkow.setImageResource(R.drawable.del_ecl_2)
            frokeokwkokosad = 1
            fodgkodf.add(gyxcvgydhu)
            val fdkokosdko = sokadokdasosk[Random.nextInt(7)]
            alpalpskokoxkoczjizjixhushu += fdkokosdko
            hcxbbvxbhxhc.tvWldScore.text = "Deluxe bonus : $alpalpskokoxkoczjizjixhushu"
            sdwko.edit().putInt("scores_deluxe",alpalpskokoxkoczjizjixhushu).apply()
            xcijvjixjijxcvdhuhud.add(gyxcvgydhu)
            oaskdkow.isEnabled = false
            val cxvjixjicvjixcji = icxjvjixuhudshu()
            if (cxvjixjicvjixcji == 1)
                Handler().postDelayed(Runnable { jixcijzhucxhuzs() }, 4000)
        }

    }








    fun icxjvjixuhudshu(): Int {
        if ((xcozk.contains(1) && xcozk.contains(2) && xcozk.contains(3)) || (xcozk.contains(
                1
            ) && xcozk.contains(4) && xcozk.contains(7)) ||
            (xcozk.contains(3) && xcozk.contains(6) && xcozk.contains(9)) || (xcozk.contains(
                7
            ) && xcozk.contains(8) && xcozk.contains(9)) ||
            (xcozk.contains(4) && xcozk.contains(5) && xcozk.contains(6)) || (xcozk.contains(
                1
            ) && xcozk.contains(5) && xcozk.contains(9)) ||
            xcozk.contains(3) && xcozk.contains(5) && xcozk.contains(7) || (xcozk.contains(2) && xcozk.contains(
                5
            ) && xcozk.contains(8))
        ) {
            dplelpwpl += 1
            hcxivjjiidj()

            startActivity(Intent(this@Kwqoqyuxgctftfxcs, Iusiwijsuhhuxczs::class.java))
            return 1


        } else if ((fodgkodf.contains(1) && fodgkodf.contains(2) && fodgkodf.contains(3)) || (fodgkodf.contains(
                1
            ) && fodgkodf.contains(4) && fodgkodf.contains(7)) ||
            (fodgkodf.contains(3) && fodgkodf.contains(6) && fodgkodf.contains(9)) || (fodgkodf.contains(
                7
            ) && fodgkodf.contains(8) && fodgkodf.contains(9)) ||
            (fodgkodf.contains(4) && fodgkodf.contains(5) && fodgkodf.contains(6)) || (fodgkodf.contains(
                1
            ) && fodgkodf.contains(5) && fodgkodf.contains(9)) ||
            fodgkodf.contains(3) && fodgkodf.contains(5) && fodgkodf.contains(7) || (fodgkodf.contains(2) && fodgkodf.contains(
                5
            ) && fodgkodf.contains(8))
        ) {
            xcuhvhuxc += 1

            hcxivjjiidj()

            startActivity(Intent(this@Kwqoqyuxgctftfxcs, Iusiwijsuhhuxczs::class.java))
            return 1
        } else if (xcijvjixjijxcvdhuhud.contains(1) && xcijvjixjijxcvdhuhud.contains(2) && xcijvjixjijxcvdhuhud.contains(3) && xcijvjixjijxcvdhuhud.contains(
                4
            ) && xcijvjixjijxcvdhuhud.contains(5) && xcijvjixjijxcvdhuhud.contains(6) && xcijvjixjijxcvdhuhud.contains(7) &&
            xcijvjixjijxcvdhuhud.contains(8) && xcijvjixjijxcvdhuhud.contains(9)
        ) {
            startActivity(Intent(this@Kwqoqyuxgctftfxcs, Iusiwijsuhhuxczs::class.java))
            return 1

        }
        return 0
    }

    fun tdyshuwjisd(rokewko: View) {
        if (gokkookdskofkosjixjizcji) {
            val zxijcizj = rokewko as ImageView
            var sdokwkoosdk = 0

            when (zxijcizj.id) {
                R.id.button -> sdokwkoosdk = 1
                R.id.button2 -> sdokwkoosdk = 2
                R.id.button3 -> sdokwkoosdk = 3
                R.id.button4 -> sdokwkoosdk = 4
                R.id.button5 -> sdokwkoosdk = 5
                R.id.button6 -> sdokwkoosdk = 6
                R.id.button7 -> sdokwkoosdk = 7
                R.id.button8 -> sdokwkoosdk = 8
                R.id.button9 -> sdokwkoosdk = 9

            }
            gokkookdskofkosjixjizcji = false;
            Handler().postDelayed(Runnable { gokkookdskofkosjixjizcji = true }, 600)
            gyxcvgydshu(zxijcizj, sdokwkoosdk)

        }
    }

    fun hcxivjjiidj() =with(hcxbbvxbhxhc) {
        for (i in 1..9) {
            val sdiojaji = when (i) {
                1 -> button
                2 -> button2
                3 -> button3
                4 -> button4
                5 -> button5
                6 -> button6
                7 -> button7
                8 -> button8
                9 -> button9
                else -> {
                    button
                }

            }
            if (sdiojaji.isEnabled == true)
                sdiojaji.isEnabled = false
        }
    }

    fun jixcijzhucxhuzs() = with(hcxbbvxbhxhc) {
        xcozk.clear()
        fodgkodf.clear()
        xcijvjixjijxcvdhuhud.clear()
        frokeokwkokosad = 1;
        for (i in 1..9) {
            var jizxcjis: ImageView?
            jizxcjis = when (i) {
                1 -> button
                2 -> button2
                3 -> button3
                4 -> button4
                5 -> button5
                6 -> button6
                7 -> button7
                8 -> button8
                9 -> button9
                else -> {
                    button
                }
            }
            jizxcjis.setImageResource(0)
            jizxcjis.isEnabled = true
        }
    }
}