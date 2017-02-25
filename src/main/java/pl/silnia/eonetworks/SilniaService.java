package pl.silnia.eonetworks;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
@Service
public class SilniaService {
    BigInteger m;
    BigInteger c;
    BigInteger z;
    BigInteger k = BigInteger.ONE;

    private List<BigInteger> output1 = new ArrayList<BigInteger>();

    private ArrayList<Integer> outputInt = new ArrayList<Integer>();

    private ArrayList<BigInteger> output = new ArrayList<BigInteger>();

    public List<BigInteger> getAll() {
        return new ArrayList<BigInteger>(output);
    }


    public BigInteger liczIteracja(Integer n) {                         //POST

        BigInteger silnia = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            silnia = silnia.multiply(BigInteger.valueOf(i));
        output.add(silnia);
        return silnia;
    }

    public BigInteger silnia1(int n) {
        BigInteger factorial = BigInteger.ONE;
        BigInteger factz = BigInteger.valueOf(n);
        if (n == 0) {
            return factorial;
        } else {
            return factz.multiply(silnia1(n - 1));
        }
    }
    public BigInteger obliczSilniaRekurencja(int n){

output.add(silnia1(n));
        return silnia1(n);
    }


    public static void main(String[] args) {
        SilniaService lol = new SilniaService();
        System.out.println(lol.silnia1(6));
    }
}