package data

data class User(
    val name: String,
    val age: Int,
    val isMarriage: Boolean,
    val height: Double,
    val weight: Float,
    val childNumber: Long?
)

data class Group(
    val users: List<User>
)