 import java.util.Scanner;
 class Question1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark of math:");
        int a1 = sc.nextInt();
        System.out.print("Enter mark of chemistry:");
        int a2 = sc.nextInt();
        System.out.print("Enter mark of physics:");
        int a3 = sc.nextInt();
        System.out.print("Enter mark of hindi:");
        int a4 = sc.nextInt();
        System.out.print("Enter mark of english:");
        int a5 = sc.nextInt();
        int total=a1+a2+a3+a4+a5;
        double per =((float)total/500)*100;
        System.out.println("Percentage:"+per);
         
        if (per>=85){
            System.out.println("Excellence");
        }
      else  if (per>=70){
            System.out.println("Very Good");

        }
        else  if (per>=55){
            System.out.println(" Good");
            
        }
        else  if (per>=45){
            System.out.println("Poor");
            
        }
        else{
            System.out.println("Poor");
        }
        System.out.println("================================");
    }
    
}
