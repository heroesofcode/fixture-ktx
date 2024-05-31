package data

sealed class State {
    data object Loading
    data class Success(val name: String) : State()
    data object Error
}

data class SealedData(
    val data: State
)
