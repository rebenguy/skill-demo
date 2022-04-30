import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {

    @Test
    public void expandSize() {
        assertEquals(20,SkillDemo.expand(3,6,20));
    }
}
