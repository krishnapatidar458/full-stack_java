import java.io.*;
import java.util.Scanner;

class takeInputUsingNumberOfMethods {
    public static void main(String[] args) throws IOException{
        System.out.print("Enter a number: ");
        // int num = System.in.read();
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.print(num);
    }
}