package lab_06;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static final int NR_OF_LISTS = 10;

    public static void main(String[] args) {
        List<Watch> watches = WatchGenerator.generateWatches(NR_OF_LISTS);

        List<Watch> watchesUnderAHundredRON = watches.stream()
                .filter(watch -> watch.getPrice() < 100)
                .collect(Collectors.toList());

        List<Watch> watchesOverAHundredRON = watches.stream()
                .filter(watch -> watch.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println("watches = " + watches);
        System.out.println("watchesUnderAHundredRON = " + watchesUnderAHundredRON);
        System.out.println("watchesOverAHundredRON = " + watchesOverAHundredRON);

        Map<String, List<Watch>> map = WatchGenerator.generateWatchDictionary(watches);
        System.out.println("map = " + map);
    }


}
