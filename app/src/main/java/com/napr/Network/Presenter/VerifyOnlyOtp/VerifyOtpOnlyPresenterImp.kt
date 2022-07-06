package com.Tappchat.Presenter.GetAllStatus

import com.napr.Network.Interactor.LoadListener
import com.napr.Network.Presenter.MainPresenter
import com.napr.Network.Presenter.VerifyOnlyOtp.VerifyOtpOnlyPresenter
import com.napr.Network.view.MainView


class VerifyOtpOnlyPresenterImp(private var settingView: MainView?, private var mobileNO: String?, private var otp: String?) : LoadListener<Any>,
    MainPresenter<MainView> {
    override fun onAuthFailer(errorMessage: String?) {
        settingView!!.authFailure(errorMessage!!)


    }

    override fun init() {

        settingView!!.showLoadingLayout()
        var   mainInteractor = VerifyOtpOnlyPresenter(mobileNO!!,otp!!)
        mainInteractor!!.loadItems(this)
    }

    override fun onSuccess(`object`: Any) {
        settingView!!.hideLoadingLayout()
        settingView!!.showSuccess(`object`)
    }

    override fun unSubscribe() {
        this.settingView = null
    }



    override fun onFailure(errorMessage: String) {
        settingView!!.hideLoadingLayout()
        settingView!!.showFailure(errorMessage)
    }

    override fun subscribe(mainView: MainView) {

    }
}
