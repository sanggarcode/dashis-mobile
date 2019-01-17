package isfaaghyth.app.dashis.ui.login

import isfaaghyth.app.dashis.base.BasePresenter
import isfaaghyth.app.dashis.data.DataManager
import isfaaghyth.app.dashis.data.model.StudentAuth
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
class LoginPresenter(val dataManager: DataManager): BasePresenter<LoginActivityView>() {

    fun login(email: String, password: String) {
        routes().studentAuth(email, password).enqueue(object : Callback<StudentAuth> {
            override fun onFailure(call: Call<StudentAuth>, t: Throwable) {
                catchError(t)
            }

            override fun onResponse(call: Call<StudentAuth>, response: Response<StudentAuth>) {
                response.body()?.let { view().onLoginSuccess(it) }
            }
        })
    }

}