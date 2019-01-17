package isfaaghyth.app.dashis.base

import android.util.Log
import isfaaghyth.app.dashis.network.Network
import isfaaghyth.app.dashis.network.Routes

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
open class BasePresenter<V: BaseView>: BasePresenterInteractor<V> {

    private lateinit var routes: Routes
    private lateinit var view: V

    override fun view(): V = view
    protected fun routes(): Routes = routes

    override fun finishRequest() {
        Log.d("TAG", "finishRequest()")
    }

    override fun catchError(error: Throwable) {
        Log.d("TAG", "${error.message}")
    }

    override fun attachView(view: V) {
        this.view = view
        routes = Network.services
    }

    override fun dettachView() {

    }

}