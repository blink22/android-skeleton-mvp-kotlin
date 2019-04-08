package com.template.android.di.module

import com.template.android.di.scope.PerActivity
import com.template.android.ui.base.view.BaseActivity
import com.template.android.ui.splash.SplashContract
import com.template.android.ui.splash.interactor.SplashInteractor
import com.template.android.ui.splash.interactor.SplashInteractorImp
import com.template.android.ui.splash.presenter.SplashPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: BaseActivity) {
    @Provides
    @PerActivity
    internal fun provideSplashScreenInteractor(interactor: SplashInteractorImp): SplashInteractor = interactor

    @Provides
    @PerActivity
    internal fun provideSplashScreenPresenter(
        presenter: SplashPresenter<SplashContract.View, SplashInteractor>
    ): SplashContract.Presenter<SplashContract.View, SplashInteractor> = presenter
}