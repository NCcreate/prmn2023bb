package lecture02;
import java.util.Scanner;
public class pracI {
    public static void main(String[] args) {
        String number = "B2220920";
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください：");
        String gakuseki = scan.next();

        Gakuseki g = new Gakuseki();
        g.hanbetu(number,gakuseki);
    }
}
