package com.napr.Network.Presenter


/**
 * Created by Deepak Tyagi on 27-09-2017.
 */

interface MainPresenter<T> {
    fun init()
    fun subscribe(t: T)
    fun unSubscribe()
}
