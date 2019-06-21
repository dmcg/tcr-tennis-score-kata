class Score(private val p1: Int, private val p2: Int) {
    override fun toString(): String = when {
        p1 == p2 && p1 == 3-> "deuce"
        p1 == p2 -> "${p1.toTennis()} all"
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

