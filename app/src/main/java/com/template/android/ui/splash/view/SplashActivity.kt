package com.template.android.ui.splash.view

import android.os.Bundle
import com.template.android.R
import com.template.android.ui.base.view.BaseActivity
import com.template.android.util.extension.addFragment

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        addFragment(SplashFragment.newInstance(), R.id.fragment_container)
    }
}