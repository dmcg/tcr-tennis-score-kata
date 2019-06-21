class Score(private val p1: Int, private val p2: Int) {
    override fun toString(): String = when {
        p1 == 0 && p2 == 0 -> "love all"
        p1 == 1 && p2 == 1 -> "15 all"
        else -> "15 love"
    }
}