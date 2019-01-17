package isfaaghyth.app.dashis.base

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
interface BasePresenterInteractor<V> {
    fun finishRequest()
    fun catchError(error: Throwable)
    fun attachView(view: V)
    fun dettachView()
    fun view(): V
}