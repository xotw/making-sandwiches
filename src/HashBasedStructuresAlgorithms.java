import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashBasedStructuresAlgorithms {


    public HashBasedStructuresAlgorithms() {
    }

    public List<Integer> findMissingElements(int[] first, int[] second) {

        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : second) {
            hashSet.add(x);
        }

        for (int x : first) {
            if (!hashSet.contains(x)) {
                missingElements.add(x);
            }
        }

        return missingElements;
    }

    public void displayFrequencyOfEachElement(int[] array) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int x : array) {
            if (!freqMap.containsKey(x)) {
                freqMap.put(x, 1);
            } else {
                freqMap.put(x, freqMap.get(x) + 1);
            }
        }
        freqMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}