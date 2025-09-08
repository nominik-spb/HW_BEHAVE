import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;

    public Randoms(int min, int max) {
        max -= min;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    //...
}
