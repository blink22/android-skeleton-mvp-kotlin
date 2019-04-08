package com.template.android.ui.base.presenter

import com.template.android.ui.base.interactor.BaseInteractor
import com.template.android.ui.base.view.BaseViewContract

interface BasePresenter<V : BaseViewContract, I : BaseInteractor> {

    fun attachView(view: V?)

    fun dropView()
}