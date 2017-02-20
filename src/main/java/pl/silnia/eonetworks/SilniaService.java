package pl.silnia.eonetworks;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SilniaService {
    int sln;
    Integer n = 1;
    private ArrayList<Integer> todos = new ArrayList<Integer>();

    public List<Integer> getAll() {
        return new ArrayList<Integer>(todos);
    }


    public int licz(Integer n) {                         //POST

        int silnia = 1;

        for (int i = 2; i <= n; i++)
            silnia = silnia * i;
        todos.add(silnia);
        return silnia;
    }
}
