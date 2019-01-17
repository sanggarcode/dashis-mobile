package isfaaghyth.app.dashis.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
abstract class BaseActivity<out P: BasePresenter<*>> : AppCompatActivity(), BaseView {

    private lateinit var presenter: P
    protected abstract fun presenter(): P
    protected abstract fun contentView(): Int
    protected abstract fun onCreated()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(contentView())
        presenter = presenter()

        onCreated()
    }

    override fun showLoading(message: String) {

    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError(message: String?) {

    }

    override fun onError(resId: Int) {

    }

    override fun onInfo(message: String?) {

    }

    override fun onInfo(resId: Int) {

    }

    override fun onWarning(message: String?) {

    }

    override fun onWarning(resId: Int) {

    }

    override fun isNetworkConnected(): Boolean = true

    override fun hideKeyboard() {

    }

    override fun authorized() {

    }

}