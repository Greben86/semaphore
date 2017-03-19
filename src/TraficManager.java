import java.util.List;

/**
 * Created by User on 17.03.2017.
 */
public class TraficManager {
    // Набор секций светофора
    private List<Lighting> list;

    public TraficManager(List<Lighting> list) {
        this.list = list;
    }

    public void Start()
    {
        while (true)
        {
            for (Lighting s : list)
            {
                System.out.println("Загорелся "+s);
                s.light();
            }
            System.out.println("");
        }
    }
}
