package isfaaghyth.app.dashis.network

import isfaaghyth.app.dashis.data.model.Insisses
import isfaaghyth.app.dashis.data.model.StudentAuth
import retrofit2.Call
import retrofit2.http.POST

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
interface Routes {

    @POST("api/v1/mahasiswa/auth")
    fun studentAuth(
            email: String,
            password: String
    ): Call<StudentAuth>

    @POST("api/v1/insis/{uuid}")
    fun getInsis(
            uuid: String
    ): Call<Insisses>

}