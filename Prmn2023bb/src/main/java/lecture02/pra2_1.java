package lecture02;

import java.util.Scanner;

public class pra2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("名前を入力してください:");
        String name = scan.nextLine();
        System.out.print("学籍番号を入力してください:");
        String number = scan.nextLine();

        System.out.println("入力された名前は:" + name);
        System.out.println("入力された学籍番号は:" + number);
    }
}
