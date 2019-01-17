package isfaaghyth.app.dashis.ui.main

import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.base.BaseActivity
import isfaaghyth.app.dashis.data.DataManager
import isfaaghyth.app.dashis.data.model.Insis

class MainActivity : BaseActivity<MainPresenter>(), MainActivityView {

    private val dataManager = DataManager()
    override fun presenter(): MainPresenter = MainPresenter(dataManager)

    override fun contentView(): Int = R.layout.activity_main

    override fun onCreated() {
        val uuid = intent.getStringExtra("uuid")
        val token = intent.getStringExtra("token")
        presenter().getInsisses(uuid)
    }

    override fun getInsis(insisses: List<Insis>) {

    }

}
