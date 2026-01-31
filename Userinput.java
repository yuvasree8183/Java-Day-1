import java.util.Scanner;
class Userinput{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=sc.nextDouble();
        float c=sc.nextFloat();
        String str1=sc.next();
        System.out.println("Value of Integer(a):"+a);
        System.out.println("Value of Double(b):"+b);
        System.out.println("Value of Float(c):"+c);
        System.out.println("String word:"+str1);
    }

}
