package com.template.android

import android.app.Application
import com.crashlytics.android.Crashlytics
import com.crashlytics.android.core.CrashlyticsCore
import com.squareup.leakcanary.LeakCanary
import com.template.android.di.component.ApplicationComponent
import com.template.android.di.component.DaggerApplicationComponent
import com.template.android.di.module.ApplicationModule
import io.fabric.sdk.android.Fabric

class BaseApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {

        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)

        initializeAppComponent()
        configureCrashReporting()
    }

    private fun configureCrashReporting() {
        val crashlyticsCore = CrashlyticsCore.Builder()
            .disabled(BuildConfig.DEBUG)
            .build()
        Fabric.with(this, Crashlytics.Builder().core(crashlyticsCore).build())
    }

    private fun initializeAppComponent() {
        applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this)).build()
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}
