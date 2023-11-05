package lecture02;

public class Password {
    boolean password_hantei(String[][] array, String password,int i) {
        if (array[i][1].equals(password)) {
            System.out.println("ログイン完了");
            return true;
        }
        System.out.println("不正なアクセスです");
        System.exit(0);
        return false;
    }
}