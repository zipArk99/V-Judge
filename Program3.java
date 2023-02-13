import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Program3 {

    static long swappable(List<Long> array) {
        HashMap<Long, Long> hashMap = new HashMap<Long, Long>();
        long arrayLength = array.size();
        for (int i = 0; i < array.size(); i++) {
            if (hashMap.containsKey(array.get((int)i))) {
                hashMap.put(array.get(i), hashMap.get(array.get(i)) + 1);
            } else {

                hashMap.put(array.get((int)i), 1L);

            }
        }
        long totalCombinations = ((arrayLength) * (arrayLength - 1)) / 2;

        for (long value : hashMap.values()) {
            if (value != 1) {
                totalCombinations -= ((value) * (value - 1)) / 2;
            }
        }
        return totalCombinations ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Long> array = new ArrayList<Long>();
        long size = input.nextLong();
        for (long i = 0; i < size; i++) {
            array.add(input.nextLong());
        }
        System.out.println(swappable(array));
    }

}
