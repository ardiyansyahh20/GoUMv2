package go.id.diskominfo.POJO

import com.google.gson.annotations.SerializedName

data class Daftar(
        @SerializedName("pesan")
        val pesan: String? = null,
        @SerializedName("kode")
        val kode: String?=null
)