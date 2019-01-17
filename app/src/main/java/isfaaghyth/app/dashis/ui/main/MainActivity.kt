package isfaaghyth.app.dashis.ui.main

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.base.BaseActivity
import isfaaghyth.app.dashis.data.DataManager
import isfaaghyth.app.dashis.data.model.Insis
import isfaaghyth.app.dashis.ui.adapter.InsisAdapter
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<MainPresenter>(), MainActivityView {

    private val insisses = arrayListOf<Insis>()
    private val adapter = InsisAdapter(insisses)

    private val presenter by inject<MainPresenter>()
    override fun presenter(): MainPresenter = presenter
    override fun contentView(): Int = R.layout.activity_main

    override fun onCreated() {
        presenter().attachView(this)

        val lstInsis = findViewById<RecyclerView>(R.id.lstInsis)

        lstInsis.layoutManager = LinearLayoutManager(this)
        lstInsis.adapter = adapter

        val uuid = intent.getStringExtra("uuid")
        val token = intent.getStringExtra("token")
        presenter().getInsisses(uuid, token)
    }

    override fun getInsis(insisses: List<Insis>) {
        this.insisses.clear()
        this.insisses.addAll(insisses)
        this.adapter.notifyDataSetChanged()
    }

}
