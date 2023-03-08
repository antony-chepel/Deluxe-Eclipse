package com.kooapps.stackybird.wwqsda

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybird.asd.tsrasudh
import com.kooapps.stackybird.databinding.ActivityIusiwijsuhhuxczsBinding
import com.kooapps.stackybird.hgfbdf.Oisppxpzocsw
import kotlin.random.Random

class Iusiwijsuhhuxczs : AppCompatActivity() {
      private lateinit var scres_bonus_del : SharedPreferences
      private lateinit var scres_main_del : SharedPreferences
      private lateinit var saodijwjidw : ActivityIusiwijsuhhuxczsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        saodijwjidw = ActivityIusiwijsuhhuxczsBinding.inflate(layoutInflater)
        setContentView(saodijwjidw.root)
        scres_bonus_del = getSharedPreferences("scores_deluxe", MODE_PRIVATE)
        scres_main_del = getSharedPreferences("scores_del_main", MODE_PRIVATE)
        uasijdwd()
    }


    private fun uasijdwd() = with(saodijwjidw){
       val saijdji =  scres_main_del.getInt("scores_del_main",100)
       val xcivjixc = scres_bonus_del.getInt("scores_del_main",2)
        val adwdsasdw = tsrasudh[Random.nextInt(6)]
        val dokekoqkowko = xcivjixc * saijdji + adwdsasdw

        uxchvhuxchuvhuxhudij.text = "Deluxe bonuses - $xcivjixc x"
        ozxokckoxzkojis.text = "Your deluxe scores - $dokekoqkowko"
        wooqoqiwjjisdhu.setOnClickListener {
            startActivity(Intent(this@Iusiwijsuhhuxczs,Oisppxpzocsw::class.java))
        }
    }
}