sealed class Game {

    companion object : () -> Score {
        override fun invoke() = Score(0, 0)
    }
}

data class Score(private val p1: Int, private val p2: Int) : Game() {
    override fun toString(): String = when {
        p1 == p2 && p1 >= 3-> "deuce"
        p1 == p2 -> "${p1.toTennis()} all"
        p1 >= 4 && p2 == p1 - 1 -> "advantage player 1"
        p2 >= 4 && p1 == p2 - 1 -> "advantage player 2"
        else -> "${p1.toTennis()} ${p2.toTennis()}"
    }

    fun p1WinsPoint(): Game = copy(p1 = p1 + 1).resolved()

    fun p2WinsPoint(): Game = copy(p2 = p2 + 1).resolved()

    private fun resolved(): Game = when {
        p1 >= 4 && p1 - p2 >= 2 -> Win(p1, p2)
        p2 >= 4 && p2 - p1 >= 2 -> Win(p1, p2)
        else -> this
    }

    fun apply(ops: Sequence<(Score) -> Game>): Sequence<Game> = sequence {
        var current: Game = this@Score
        yield(current)
        ops.forEach { op ->
            current = (current as? Score)?.let { op(it) } ?: current
            yield(current)
        }
    }
}

data class Win(private val p1: Int, private val p2: Int) : Game() {
    init {
        require(p1 != p2)
    }
    override fun toString() = if (p1 > p2) "player 1 wins" else "player 2 wins"
}

private fun Int.toTennis() = when (this) {
    0 -> "love"
    1 -> "15"
    2 -> "30"
    3 -> "40"
    else -> error("$this is not a tennis score")
}

