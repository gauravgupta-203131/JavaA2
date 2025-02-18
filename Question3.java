import java.util.Scanner;
public class Question3 {
public static void main(String arr[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int age=sc.nextInt();
    if(age>=18){
        System.out.println("Enter your weight in kg:");
        int w = sc.nextInt();
        if(w>=50){
            System.out.println("you are eligible for donate blood");
        
        }
        else{
            System.out.println("you are not eligible for donate blood weight less than 50");
        }
    }
    else{
        System.out.println("your age is less than 18");
        
    }
    System.out.println("****************************************");
}
    
}
