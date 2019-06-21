class Score(private val p1: Int, private val p2: Int) {
    override fun toString(): String = when {
        p1 == 0 && p2 == 0 -> "${p1.toTennis()} all"
        p1 == 1 && p2 == 0 -> "15 love"
        p1 == 0 && p2 == 1 -> "love 15"
        p1 == 1 && p2 == 1 -> "15 all"
        else -> TODO()
    }
}

private fun Int.toTennis() = when (this) {
    0 -> "love"
    1 -> "15"
    2 -> "30"
    3 -> "40"
    else -> error("$this is not a tennis score")
}

