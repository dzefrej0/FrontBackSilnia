package pl.silnia.eonetworks;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SilniaService {
    private ArrayList<Integer> output = new ArrayList<Integer>();

    public List<Integer> getAll() {
        return new ArrayList<Integer>(output);
    }


    public int licz(Integer n) {                         //POST

        int silnia = 1;

        for (int i = 2; i <= n; i++)
            silnia = silnia * i;
        output.add(silnia);
        return silnia;
    }
}
