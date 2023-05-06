import java.util.*;
public class ScannerClass {

    public static void main(String[] args)
    {
        int age;
        float num;
        String str1,str2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name:");
        str1 = sc.nextLine();

        System.out.print("Enter surname:");
        str2 = sc.nextLine();

        System.out.print("Enter age:");
        age = sc.nextInt();

        System.out.print("Enter number in float:");
        num = sc.nextFloat(); 

        System.out.print("\n");
        System.out.println("Name:" + str1);
        System.out.println("Surname:" + str2);
        System.out.println("Age:" + age);
        System.out.println("Number in Float:" + num);
        sc.close();
    }
    
}
