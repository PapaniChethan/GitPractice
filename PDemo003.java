import java.util.Scanner;
public class PDemo003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Third number: ");
        int num3 = sc.nextInt();

        if((num1 > num2)&&(num1 > num3)){
            System.out.println(num1 +" is Greater.");
        }else if((num2 > num1)&&(num2 > num3)){
            System.out.println(num2 +" is Greater.");
        }else if((num3 > num1)&&(num3 > num2)){
            System.out.println(num3 +" is Greater.");
        }else{
            System.out.println("All are Equal");
        }
        
    }
    
}
