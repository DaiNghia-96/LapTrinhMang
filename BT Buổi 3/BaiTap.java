import java.util.Scanner;

public class BaiTap{
    public static void main(String[] args) {
        System.out.println("Helloworld");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap x = ");

        int x = sc.nextInt();

        for(int i = 0; i<=9; i++)
        {
            System.out.println(x + "Nhan" + i + "=" +(x*i));
        }

    }
}