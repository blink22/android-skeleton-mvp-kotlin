package com.template.android.ui.base.view

import androidx.appcompat.app.AppCompatActivity
import com.template.android.di.component.ActivityComponent

abstract class BaseActivity : AppCompatActivity() {
    var activityComponent: ActivityComponent? = null
        private set
}