import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program1 {

    static int findMedian(List<Integer> array) {
        Collections.sort(array);
        return array.get(array.size() / 2);

    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int size;
    
        size = input.nextInt();

        for (int i = 0; i < size; i++) {
            int x = input.nextInt();
            array.add(x);

        }

        System.out.println(findMedian(array));

    }
}