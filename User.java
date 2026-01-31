import java.util.Scanner;
class User{
    public static void main(String [] args){
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Number is:"+num);
    }
}