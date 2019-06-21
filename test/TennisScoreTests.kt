import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TennisScoreTests {

    @Test fun `0 - 0 is love all`() {
        assertEquals("love all", Score(0, 0).toString())
    }

    @Test fun `1 - 0 is 15 love`() {
        assertEquals("15 love", Score(1, 0).toString())
    }

    @Test fun `0 - 1 is love 15`() {
        assertEquals("love 15", Score(0, 1).toString())
    }

    @Test fun `1 - 1 is 15 all`() {
        assertEquals("15 all", Score(1, 1).toString())
    }

    @Test fun `2 - 0 is 30 love`() {
        assertEquals("30 love", Score(2, 0).toString())
    }
}

