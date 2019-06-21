class Score(private val p1: Int, private val p2: Int) {
    override fun toString(): String = when {
        p1 == p2 && p1 >= 3-> "deuce"
        p1 == p2 -> "${p1.toTennis()} all"
        p1 >= 4 && p2 == p1 - 1 -> "advantage player 1"
        p2 >= 4 && p1 == p2 - 1 -> "advantage player 2"
        p1 == 4 && p2 == 5 -> "advantage player 2"
        else -> "${p1.toTennis()} ${p2.toTennis()}"
    }
}

private fun Int.toTennis() = when (this) {
    0 -> "love"
    1 -> "15"
    2 -> "30"
    3 -> "40"
    else -> error("$this is not a tennis score")
}

