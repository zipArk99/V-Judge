import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

    static String CorrectSum(String str){
        String strArray[]= str.split("\\+",0);
        Arrays.sort(strArray);
        return String.join("+",strArray);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    
        String s=input.nextLine();
        System.out.print(CorrectSum(s));

        
    }
    
}
