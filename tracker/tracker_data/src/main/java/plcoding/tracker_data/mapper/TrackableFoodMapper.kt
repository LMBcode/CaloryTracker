package plcoding.tracker_data.mapper

import com.plcoding.tracker_domain.model.TrackableFood
import plcoding.tracker_data.remote.dto.Product
import kotlin.math.roundToInt

fun Product.toTrackabaleFood() : TrackableFood?{
    val carbsPer100g = nutriments.carbohydrates100g.roundToInt()
    val proteinPer100g = nutriments.proteins100g.roundToInt()
    val fatPer100g = nutriments.fat100g.roundToInt()
    val caloriesPer100g = nutriments.energyKcal100g.roundToInt()
    return TrackableFood(
        name = productName ?: return null,
        carbsper100g = carbsPer100g,
        fatPer100g = fatPer100g,
        caloriesPer100g = caloriesPer100g,
        proteinPer100g = proteinPer100g,
        imageUrl = imageFrontThumbUrl
    )
}
