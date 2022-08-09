import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class fileTest {
    File m;

    @BeforeEach
    void setUp(){
        m = new File();

    }

    @Test
    void getSize(){
        m.getInput();
        assertEquals(m.getSize(),25);
    }

}
