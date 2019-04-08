package com.template.android.ui.splash.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.android.R
import com.template.android.ui.base.view.BaseFragment
import com.template.android.ui.splash.SplashContract
import com.template.android.ui.splash.interactor.SplashInteractor
import com.template.android.ui.splash.presenter.SplashPresenter
import javax.inject.Inject

class SplashFragment : BaseFragment(), SplashContract.View {

    @Inject
    internal lateinit var presenter: SplashPresenter<SplashContract.View, SplashInteractor>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_splash, container, false)

    override fun setUp() {
        setUpDI()
        presenter.attachView(this)
    }

    private fun setUpDI() {
        activityComponent?.inject(this)
    }

    override fun onDestroy() {
        presenter.dropView()
        super.onDestroy()
    }

    companion object {
        fun newInstance() = SplashFragment()
    }
}