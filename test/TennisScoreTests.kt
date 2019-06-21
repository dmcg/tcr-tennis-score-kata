import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TennisScoreTests {

    @Test fun `0 - 0 is love all`() {
        assertEquals("love all", Score(0, 0).toString())
    }
}

class Score(p1: Int, p2: Int) {
    override fun toString(): String = "love all"
}
