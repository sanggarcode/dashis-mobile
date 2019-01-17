package isfaaghyth.app.dashis.ui.login

import isfaaghyth.app.dashis.base.BaseView
import isfaaghyth.app.dashis.data.model.StudentAuth

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
interface LoginActivityView: BaseView {
    fun onLoginSuccess(result: StudentAuth)
}