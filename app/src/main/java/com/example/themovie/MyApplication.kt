package com.example.themovie

import android.app.Application
import com.example.themovie.core.di.databaseModule
import com.example.themovie.core.di.networkModule
import com.example.themovie.core.di.repositoryModule
import com.example.themovie.di.useCaseModule
import com.example.themovie.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}