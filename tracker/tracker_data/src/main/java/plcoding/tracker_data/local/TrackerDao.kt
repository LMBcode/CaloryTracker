package plcoding.tracker_data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import plcoding.tracker_data.local.entity.TrackedFoodEntity


@Dao
interface TrackerDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTrackedFood(trackedFoodEntity: TrackedFoodEntity)


    @Delete
    suspend fun deleteTrackedFood(trackedFoodEntity: TrackedFoodEntity)

    @Query("""
        SELECT *
        FROM trackedfoodentity
        WHERE dayOfMonth = :day and month =:month AND year = :year
    """)
    fun getFoodsForDate(day: Int, month: Int , year: Int): Flow<List<TrackedFoodEntity>>
}