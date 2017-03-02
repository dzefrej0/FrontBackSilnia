package pl.silnia.eonetworks.TEST;




import junit.framework.Assert;
import org.junit.Test;
import pl.silnia.eonetworks.SilniaService;

import java.math.BigInteger;

public class SilniaServiceTest {
SilniaService silniaService = new SilniaService();


    @Test
    public void ShouldReturnRightNumber()throws Exception{
        int a = 4;
        int wynik = 24;
        boolean czy = false;
        BigInteger silnia =silniaService.obliczSilniaRekurencja(a);
    Assert.assertTrue(silnia.equals(wynik));
    Assert.assertFalse("mesydz",czy);

    }
}
