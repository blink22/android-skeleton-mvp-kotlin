package com.template.android.ui.base.presenter

import com.template.android.ui.base.interactor.BaseInteractor
import com.template.android.ui.base.view.BaseViewContract
import io.reactivex.disposables.CompositeDisposable

abstract class BasePresenterImp<V : BaseViewContract, I : BaseInteractor> internal constructor(
    protected var interactor: I?,
    protected val compositeDisposable: CompositeDisposable? = null
) : BasePresenter<V, I> {

    protected var view: V? = null

    override fun attachView(view: V?) {
        this.view = view
    }

    override fun dropView() {
        compositeDisposable?.dispose()
        this.view = null
        this.interactor = null
    }

}