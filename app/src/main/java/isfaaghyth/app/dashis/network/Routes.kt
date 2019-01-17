package isfaaghyth.app.dashis.network

import isfaaghyth.app.dashis.data.model.Insisses
import isfaaghyth.app.dashis.data.model.StudentAuth
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
interface Routes {

    @POST("api/v1/mahasiswa/auth")
    @FormUrlEncoded
    fun studentAuth(
            @Field("email") email: String,
            @Field("password") password: String
    ): Call<StudentAuth>

    @GET("api/v1/insis/{uuid}")
    fun getInsis(
            @Path("uuid") uuid: String,
            @Header("Authorization") token: String
    ): Call<Insisses>

}