package isfaaghyth.app.dashis.ui.main

import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.base.BaseActivity
import isfaaghyth.app.dashis.data.DataManager

class MainActivity : BaseActivity<MainPresenter>() {

    private val dataManager = DataManager()
    override fun presenter(): MainPresenter = MainPresenter(dataManager)

    override fun contentView(): Int = R.layout.activity_main

    override fun onCreated() {

    }

}
