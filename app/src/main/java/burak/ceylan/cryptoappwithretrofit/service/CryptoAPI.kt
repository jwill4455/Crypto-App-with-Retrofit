package burak.ceylan.cryptoappwithretrofit.service

import burak.ceylan.cryptoappwithretrofit.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    @GET("prices?key=795b4ee897629cd0a7b68fe93e22ca631afc7175")
    fun getData(): Call<List<CryptoModel>>

}