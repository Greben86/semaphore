/**
 * Created by User on 17.03.2017.
 */
public class Section implements Lighting {
    // Название секции
    private String name;
    // Длительность сигнала (минут)
    private int Duration;

    public Section(String name, int duration) {
        this.name = name;
        this.Duration = duration;
    }

    @Override
    public void light() {
        for (int i=0; i<this.Duration; i++)
        {
            try {
                // Минутная пауза
                Thread.sleep(1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
