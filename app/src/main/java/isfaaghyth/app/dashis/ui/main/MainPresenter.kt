package isfaaghyth.app.dashis.ui.main

import isfaaghyth.app.dashis.base.BasePresenter
import isfaaghyth.app.dashis.data.DataManager
import isfaaghyth.app.dashis.data.model.Insis
import isfaaghyth.app.dashis.data.model.Insisses
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
class MainPresenter(val dataManager: DataManager): BasePresenter<MainActivityView>() {

    fun getInsisses(uuid: String, token: String) {
        routes().getInsis(uuid, token).enqueue(object : Callback<Insisses> {
            override fun onFailure(call: Call<Insisses>, t: Throwable) {
                catchError(t)
            }

            override fun onResponse(call: Call<Insisses>, response: Response<Insisses>) {
                if (response.isSuccessful) {
                    response.body()?.value?.let { view().getInsis(it) }
                }
            }
        })
    }

}