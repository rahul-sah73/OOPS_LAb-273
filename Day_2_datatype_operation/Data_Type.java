import java.util.Scanner;

public class Data_Type{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // primitive 

        // byte input 
        System.out.println("input for byte"); 
        byte num0 = sc.nextByte();

        // short input
        System.out.println("input for short "); 
        short num1 = sc.nextShort();
        
       // int input 
        System.out.println("input for int "); 
       int num2 = sc.nextInt();
        
        //long input
        System.out.println("input for long "); 
        long num3 = sc.nextLong();

        // float intput
        System.out.println("input for float "); 
        float num4 = sc.nextFloat();

        // double input 
        System.out.println("input for double "); 
        double num5 = sc.nextDouble();

        //boolen input 
        System.out.println("input for boolen "); 
        boolean num6 = sc.nextBoolean();

        //char input
        System.out.println("input for char"); 
        char chr = sc.next().charAt(0);


        // non primitive 

        // string Input
        System.out.println("name please "); 
        String name1 = sc.next(); // not will not read after space
        System.out.println("another name "); 
        String name2 = sc.nextLine(); // not will  read after space


        System.out.println(num0 + " is equal to 8 bit , and 1 byte = 8 bit  " );
        System.out.println("short cant accept larger values (-32768 - 32768) like "+ num1);
        System.out.println("your integer is "+ num2 );
        System.out.println("this long data type can accept larger values like "+ num3);
        System.out.println("your float num is "+ num4 );
        System.out.println("double is used to store fractional number with high precison like "+ num5);
        System.out.println("boolen is used to store true or false  like num6 is " + num6);
        System.out.println("it will only take 1st letter " + chr);

        System.out.println("Nice to meet you , "+ name1 );
        System.out.println("Nice to meet you , "+ name2 );


    }
}
