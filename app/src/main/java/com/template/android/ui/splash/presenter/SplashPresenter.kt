package com.template.android.ui.splash.presenter

import com.template.android.ui.base.presenter.BasePresenterImp
import com.template.android.ui.splash.SplashContract
import com.template.android.ui.splash.interactor.SplashInteractor
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SplashPresenter<V : SplashContract.View, I : SplashInteractor> @Inject constructor(
    interactor: I,
    compositeDisposable: CompositeDisposable
) :
    BasePresenterImp<V, I>(interactor = interactor, compositeDisposable = compositeDisposable),
    SplashContract.Presenter<V, I> {

}