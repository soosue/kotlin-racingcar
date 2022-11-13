package racing.domain

data class Position(val value: Int = MIN_POSITION_VALUE) {

    init {
        require(value >= MIN_POSITION_VALUE)
    }

    fun move(): Position {
        return Position(value + DEFAULT_MOVE_VALUE)
    }

    fun max(other: Position): Position = if (value > other.value) this else other

    companion object {
        private const val MIN_POSITION_VALUE = 0
        private const val DEFAULT_MOVE_VALUE = 1
    }
}
