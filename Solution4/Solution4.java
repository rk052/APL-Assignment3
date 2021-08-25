import java.util.Scanner;

public class Solution4 {
    static int binaryToDecimal(String binary,int i)
    {
        int n = binary.length();
        if (i == n-1)
            return binary.charAt(i) - '0';

        return ((binary.charAt(i) - '0') << (n-i-1)) + binaryToDecimal(binary, i+1);
    }

    public static void main(String args[]){
        String binary;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the binary number");
        binary= sc.nextLine();

        int i=0;
        System.out.println(binaryToDecimal(binary,i));

    }
}
