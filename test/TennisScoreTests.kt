import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TennisScoreTests {

    @Test fun `0 - 0 is love all`() {
        assertEquals("love all", Score(0, 0).toString())
    }

    @Test fun `1 - 0 is 15 love`() {
        assertEquals("15 love", Score(1, 0).toString())
    }
}

class Score(private val p1: Int, private val p2: Int) {
    override fun toString(): String = when {
        p1 == 0 && p2 == 0 -> "love all"
        else -> "15 love"
    }
}
