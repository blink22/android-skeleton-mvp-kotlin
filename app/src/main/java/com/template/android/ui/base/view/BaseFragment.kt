package com.template.android.ui.base.view

import androidx.fragment.app.Fragment
import com.template.android.di.component.ActivityComponent

abstract class BaseFragment : Fragment() {
    var parentActivity: BaseActivity? = null
        private set

    val activityComponent: ActivityComponent?
        get() = parentActivity?.activityComponent

    abstract fun setUp()
}