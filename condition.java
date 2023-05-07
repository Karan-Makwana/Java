import java.util.*;
public class condition {
    public static void main(String[] args)
    {

        
        // if(age >= 18)
        // {
        //     System.out.println("You are adult");
        // }
        // else{
        //     System.out.println("You are not adult");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulo");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        
        System.out.println("enter 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();

        switch(choice){
            case 1 : System.out.println("Additon is:"+(num1+num2));
                     break;
                    
            case 2 : System.out.println("Substraction is:"+(num1-num2));
                     break;
            
            case 3 : System.out.println("Multiplication is:"+(num1*num2));
                     break;
            
            case 4 : System.out.println("Division is:"+(num1/num2));
                     break;

            case 5 : System.out.println("Modulo is:"+(num1%num2));
                     break;

            default : System.out.println("Invalid choice");
                      break;
        }
        sc.close();
    }
}
