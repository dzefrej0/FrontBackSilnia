package pl.silnia.eonetworks;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SilniaService {

    int c;
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

    public int silnia(int n)

    {


        if (n == 0){


            return 1;
        }

        else{
        c = (n * silnia(n - 1));
            output.add(c);

            return c;

    }}

        }





