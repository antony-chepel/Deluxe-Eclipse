package com.kooapps.stackybird.bvicijjicf

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kooapps.stackybird.asd.Iowowisjxc
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val diskofkoe = module {

    single  <Rwopqopopqkwoksd> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Rwopqopopqkwoksd::class.java)
    }

    single <Uowowkqplplwplsd> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Uowowkqplplwplsd::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://deluxeeclipse.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Fdplwlpw(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Iowkwokksijxchus(get(named("HostInter")))
    }
    single{
        rplelwlplpskodokokxock()
    }
    single (named("SharedPreferences")) {
        hvncijijijfdg(androidApplication())
    }
}

fun hvncijijijfdg(gokokdkffeijeijf: Application): SharedPreferences {
    return gokokdkffeijeijf.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun rplelwlplpskodokokxock(): Gson {
    return GsonBuilder().create()
}

val irooeojiijdjfsf = module {
    viewModel (named("MainModel")){
        Opsiwuhsd((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Iowowisjxc(get())
    }
}