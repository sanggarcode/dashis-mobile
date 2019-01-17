package isfaaghyth.app.dashis.ui.main

import isfaaghyth.app.dashis.base.BaseView
import isfaaghyth.app.dashis.data.model.Insis

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
interface MainActivityView: BaseView {
    fun getInsis(insisses: List<Insis>)
}