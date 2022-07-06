package com.napr.Network.view



/**
 * Created by Deepak Tyagi on 27-09-2017.
 */

interface MainView {
    fun showLoadingLayout()
    fun hideLoadingLayout()
    fun showSuccess(`object`: Any)
    fun showFailure(error: String)
    fun authFailure(error: String)
}

