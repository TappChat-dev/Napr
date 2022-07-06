package com.napr.Network.Interactor


/**
 * Created by Deepak kumar on 12-10-2017.
 */

interface LoadListener<T> {

    fun onSuccess(t: T)
    fun onFailure(errorMessage: String)
    fun onAuthFailer(errorMessage: String?)

}
