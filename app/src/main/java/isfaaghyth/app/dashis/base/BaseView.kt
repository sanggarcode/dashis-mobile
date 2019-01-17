package isfaaghyth.app.dashis.base

import android.support.annotation.StringRes

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
interface BaseView {
    fun showLoading(message: String)
    fun showLoading()
    fun hideLoading()
    fun onError(message: String?)
    fun onError(@StringRes resId: Int)
    fun onInfo(message: String?)
    fun onInfo(@StringRes resId: Int)
    fun onWarning(message: String?)
    fun onWarning(@StringRes resId: Int)
    fun isNetworkConnected(): Boolean
    fun hideKeyboard()
    fun authorized()
}