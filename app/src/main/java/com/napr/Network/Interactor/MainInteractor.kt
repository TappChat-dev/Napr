package com.napr.Network.Interactor



/**
 * Created by Deepak kumar on 12-10-2017.
 */

interface MainInteractor {
    fun loadItems(loadListener: LoadListener<Any>)
}
