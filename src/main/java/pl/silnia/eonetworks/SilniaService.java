package pl.silnia.eonetworks;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SilniaService {
int m;
    int c;
    private List<Integer> output1 = new ArrayList<Integer>();


    private ArrayList<Integer> output = new ArrayList<Integer>();

    public List<Integer> getAll() {
        return new ArrayList<Integer>(output);
    }


    public int liczIteracja(Integer n) {                         //POST

        int silnia = 1;

        for (int i = 2; i <= n; i++)
            silnia = silnia * i;
        output.add(silnia);
        return silnia;
    }

    public int silnia(int n) {
        if (n == 0) {return 1;}

            else {
            c = (n * silnia(n - 1));
            output1.add(c);
            m = output1.get(output1.size() - 1);
            output.add(m);
        }
            return c;

    }
}





