package umbjm.ft.inf.mydigitalprinting.produk.idcard

data class SpecIdcard(
    val idPesanan: String?= null,
    val userID: String? = null,
    val idCard: String? = null,
    val harga: String? = null,
    val namaProject: String?= null,
    val satuSisi: Boolean? = false,
    val duaSisi: Boolean? = false,
    val keterangan: String? = null,
    val sisiBelakang: String? = null,
    val keteranganTambahan: String? = null,
    val image: String? = ""
)
