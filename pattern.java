public class pattern {
    public static void main(String[] args){
        /* 
        pattern 1: solid rectangle

        ****
        ****
        ****
        ****

        for(int i=1; i < 5;i++){
            for(int j=1;j<5;j++){
                System.out.print("* ");
            } 
            System.out.println();
        }

        pattern 2: Hollow rectangle
        
        *****
        *   *
        *   *
        *****
        
        int n = 4;
        int m = 5;
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        pattern 3: Half pyramid 
        
        *
        **
        ***
        ****
        *****

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

        pattern 4: Half pyramid

        *****
        ****
        ***
        **
        *

        for(int i = 5; i >= 1; i--){
            for(int j = 1 ; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        

        pattern 5:inverted Half pyramid 180 degree
           *
          **
         ***
        ****

        int n = 4;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

        pattern 6: Half pyramid with number
        
        1
        12
        123
        1234
        12345

        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j =1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        

        pattern 7: inverted  Half pyramid with number

        12345
        1234
        123
        12
        1

        int n = 5;
        for(int i=n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        

        pattern 8:floyd's pattern
        
        1 
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15  

        int n = 5;
        int number = 1; 
        for(int i =1; i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
        

        pattern 9: 0 & 1 triangle
        1 
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if( (i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
        
        pattern 10: solid rohmbus

         *****
        *****
       *****
      *****
     *****

        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        pattern 11: butterfly pattern

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
        
        int n= 4;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

        pattern 11: butterfly pattern

         1 
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5

        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        

        pattern 12: palindrome number pattern

         1
        212
       32123
      4321234
     543212345

        int n = 5;
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =i;j>=1;j--){
                System.out.print(j);
            }
            for(int j =2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */

        int n=5;
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--) {
            for(int j = 1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j = 1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
