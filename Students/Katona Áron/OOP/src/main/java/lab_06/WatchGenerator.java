package lab_06;

import java.util.*;

public class WatchGenerator {
    private static final String[] BRANDS = {"Apple", "Armani", "Rolex", "Xiaomi"};
    private static final int PRICE_BOUND = 200;

    public static List<Watch> generateWatches(int numberOfWatches) {
        List<Watch> watches = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < numberOfWatches; i++) {
            Watch watch = new Watch();
            watch.setBrandName(BRANDS[random.nextInt(BRANDS.length)]);
            watch.setPrice(random.nextDouble() + Math.abs(random.nextInt(PRICE_BOUND)));
            watches.add(watch);
        }

        return watches;
    }

    public static Map<String, List<Watch>> generateWatchDictionary(List<Watch> watches) {
        Map<String, List<Watch>> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(String.valueOf(c), new ArrayList<>());
            map.put(String.valueOf(c).toUpperCase(), new ArrayList<>());
        }

        for (Watch watch : watches) {
            map.get(watch.getBrandName().substring(0, 1)).add(watch);
        }
        return map;
    }
}
