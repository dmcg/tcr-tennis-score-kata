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

    @Test fun `3 - 0 is 40 love`() {
        assertEquals("40 love", Score(3, 0).toString())
    }

    @Test fun `3 - 3 is deuce`() {
        assertEquals("deuce", Score(3, 3).toString())
    }

    @Test fun `4 - 3 is advantage player 1`() {
        assertEquals("advantage player 1", Score(4, 3).toString())
    }

    @Test fun `3 - 4 is advantage player 2`() {
        assertEquals("advantage player 2", Score(3, 4).toString())
    }

    @Test fun `4 - 4 is deuce`() {
        assertEquals("deuce", Score(4, 4).toString())
    }

    @Test fun `5 - 4 is advantage player 1`() {
        assertEquals("advantage player 1", Score(5, 4).toString())
    }

    @Test fun `4 - 5 is advantage player 2`() {
        assertEquals("advantage player 2", Score(4, 5).toString())
    }

    @Test fun `player 1 score increment`() {
        assertEquals(Score(1, 0), Score(0, 0).p1WinsPoint())
    }

}

