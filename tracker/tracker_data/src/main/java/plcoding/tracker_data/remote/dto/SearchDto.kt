package plcoding.tracker_data.remote.dto


import com.squareup.moshi.Json

data class SearchDto(
    val products: List<Product>,
)
