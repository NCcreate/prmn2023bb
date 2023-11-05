package lecture02;

import java.util.Scanner;

public class pra2_2 {
    public static void main(String[] args) {
        String name_1 = "Niko";
        String number_1 = "B2220920";
        Scanner scan = new Scanner(System.in);

        System.out.print("名前を入力してください:");
        String name = scan.nextLine();
        System.out.print("学籍番号を入力してください:");
        String number = scan.nextLine();

        Login n = new Login();
        n.message(name,number,name_1,number_1);
    }
}
