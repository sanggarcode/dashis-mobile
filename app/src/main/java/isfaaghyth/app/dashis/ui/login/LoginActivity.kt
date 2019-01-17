package isfaaghyth.app.dashis.ui.login

import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.base.BaseActivity
import isfaaghyth.app.dashis.data.DataManager
import isfaaghyth.app.dashis.data.model.StudentAuth

class LoginActivity : BaseActivity<LoginPresenter>(), LoginActivityView {

    private val dataManager = DataManager()
    override fun presenter(): LoginPresenter = LoginPresenter(dataManager)

    override fun contentView(): Int = R.layout.activity_login

    override fun onCreated() {
        val email = ""
        val password = ""
        presenter().login(email, password)
    }

    override fun onLoginSuccess(result: StudentAuth) {

    }

}
