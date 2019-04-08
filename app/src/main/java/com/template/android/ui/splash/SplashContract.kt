package com.template.android.ui.splash

import com.template.android.ui.base.presenter.BasePresenter
import com.template.android.ui.base.view.BaseViewContract
import com.template.android.ui.splash.interactor.SplashInteractor

interface SplashContract {
    interface Presenter<V : View, I : SplashInteractor> : BasePresenter<V, I> {

    }

    interface View : BaseViewContract {

    }
}