package com.kooapps.stackybird

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybird.bvicijjicf.Opsiwuhsd
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val jcuxivokd by viewModel<Opsiwuhsd>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jcuxivokd.gokkovkocobjibfhuhudfb(this)
    }
}