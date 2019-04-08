package com.template.android.di.module

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.template.android.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {
    @Provides
    @Singleton
    internal fun provideSharedPrefernces(): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return application
    }
}