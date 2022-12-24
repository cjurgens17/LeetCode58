import static org.junit.Assert.*;

public class LC58Test {

    @org.junit.Test
    public void lastWordLength() {

        int actual1 = LC58.lastWordLength("Hello World");
        int actual2 = LC58.lastWordLength("   fly me   to   the moon  ");
        int actual3 = LC58.lastWordLength("luffy is still joyboy");

        assertEquals(5,actual1);
        assertEquals(4,actual2);
        assertEquals(6,actual3);
    }
}