package lecture02;
import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        String[][] array = {{"B2220920","apple"},{"B2222160","banana"},{"B2221890","berry"},{"B2222210","orange"},{"B2221330","grape"}};

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください：");
        String gakuseki2 = scan.next();
        Gakuseki2 g = new Gakuseki2();
        int i = g.hantei(array,gakuseki2);

        String password = scan.next();
        Password p = new Password();
        p.password_hantei(array,password,i);
    }
}
