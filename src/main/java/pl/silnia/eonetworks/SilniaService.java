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

//    public BigInteger silnia(int n) {
//        System.out.println(k);
//        if (n == 0) {return k;}
//
//        else {
//            c = (silnia(n).multiply(BigInteger.valueOf(n)  ).multiply  (BigInteger.valueOf(n - 1)) )   ;
//
//            output.add(c);
//            m = output1.get(output1.size() - 1);
//            output.add(m);
//        }
//        return c;
//    }


    public BigInteger silnia1(int n) {
        BigInteger factorial = BigInteger.ONE;

        BigInteger factz = BigInteger.valueOf(n);
        output.add(c);
        System.out.println(output);
        if (n == 0) {
            return factorial;

        } else {

            c = factz.multiply(silnia1(n - 1));
            return factz.multiply(silnia1(n - 1));
        }



    }

    public static void main(String[] args) {
        SilniaService lol = new SilniaService();
        lol.silnia1(5);
    }
}