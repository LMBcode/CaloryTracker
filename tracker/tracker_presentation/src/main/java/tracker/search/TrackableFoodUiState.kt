package tracker.search

import com.plcoding.tracker_domain.model.TrackableFood

data class TrackableFoodUiState(
    val food:TrackableFood,
    val isExpanded: Boolean = false,
    val amount:String = ""
)