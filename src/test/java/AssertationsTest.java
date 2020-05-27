import entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertationsTest {
    @Test
    public void test(){
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);

//        Assertions.assertEquals("Erro de comparacao", 1);
        Assertions.assertEquals(0.51234, 0.512, 0.001);
        Assertions.assertEquals(Math.PI, 3.14, 0.01);

        int i = 5;
        Integer i2 = 5;
        Assertions.assertEquals(Integer.valueOf(i), i2);
        Assertions.assertEquals(i, i2.intValue());

        Assertions.assertEquals("bola", "bola");
        Assertions.assertNotEquals("bola", "casa");
        Assertions.assertTrue("bola".equalsIgnoreCase("Bola"));
        Assertions.assertTrue("bola".startsWith("bo"));

        User u1 = new User("Usuario 1");
        User u2 = new User("Usuario 1");
        User u3 = null;

//        Assertions.assertEquals(u1, u2);

        Assertions.assertSame(u2, u2);
        Assertions.assertNotSame(u1, u2);

        Assertions.assertNull(u3);
        Assertions.assertNotNull(u2);
    }
}
