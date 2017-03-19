import static java.lang.System.*;

/**
 * Created by User on 17.03.2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Trafic {

    public static void main(String[] args) throws IOException
    {
        Trafic t = new Trafic();
        t.Init();
    }

    public void Init()
    {
        List<Lighting> list = new ArrayList<Lighting>();

        list.add(new Section("красный", this.getDuration("Длительность для красного (минут):")));

        list.add(new Section("желтый", this.getDuration("Длительность для желтого (минут):")));

        list.add(new Section("зеленый", this.getDuration("Длительность для зеленого (минут):")));

        TraficManager tm = new TraficManager(list);
        tm.Start();
    }

    private int getDuration(String message)
    {
        try
        {
            System.out.print(message);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String buff = reader.readLine();

            return Integer.parseInt(buff);
        } catch (IOException e) {
            System.out.println(e);
            return 1;
        }
    }

}
