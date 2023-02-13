import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program4 {

  

    static long findDifference(List<Long> array, long target) {
        long counter=0;
        HashMap<Long,Long> hashMap=new HashMap<Long,Long>();
        for(long element : array){
            hashMap.put(element, element);
        }

        for(long element:hashMap.values()){
            
            if((element-target)>0){
                if(hashMap.containsKey(element-target)){
                    counter++;
                }
            }
        }
     
        return counter;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Long> array = new ArrayList<Long>();
        long size = input.nextLong();
        long target = input.nextLong();

        for (int i = 0; i < size; i++) {
            array.add(input.nextLong());
        }

        System.out.print(findDifference(array, target));

    }

}
