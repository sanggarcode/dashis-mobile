package isfaaghyth.app.dashis.ui.login

import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.base.BaseActivity
import isfaaghyth.app.dashis.data.DataManager

class LoginActivity : BaseActivity<LoginPresenter>() {

    private val dataManager = DataManager()
    override fun presenter(): LoginPresenter = LoginPresenter(dataManager)

    override fun contentView(): Int = R.layout.activity_login

    override fun onCreated() {

    }

}
