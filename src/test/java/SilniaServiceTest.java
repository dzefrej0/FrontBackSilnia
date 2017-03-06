import org.junit.Assert;
import org.junit.Test;
import pl.silnia.eonetworks.SilniaService;



import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.math.BigInteger;

public class SilniaServiceTest {
SilniaService silniaService = new SilniaService();

    @Test
    public void ShouldReturnRightNumberRecursion()throws Exception{
        int a = 12;
        BigInteger silnia = silniaService.obliczSilniaRekurencja(a);
    assertEquals(silnia.intValue(),479001600);

    }
    @Test
    public void shouldReturnRightNumberIterating()throws Exception{

        BigInteger silnia1 = silniaService.liczIteracja(12);
        assertEquals(silnia1.intValue(),479001600);
    }
}
