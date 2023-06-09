package tracker.search

import com.plcoding.tracker_domain.model.TrackableFood

data class SearchState(
    val query : String = "",
    val isHintVisible: Boolean = false,
    val isSearching: Boolean = false,
    val trackableFoods : List<TrackableFoodUiState> = emptyList()
)