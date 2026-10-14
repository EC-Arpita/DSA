import java.util.Scanner;

public class Pattern7 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n/2 ; i++){
            for(int j=1 ; j<=2*i ; j++){
                System.out.print("* ");
            }
            System.out.println();
            for(int j=1 ; j<=2*i ; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
         sc.close();
    }
}
