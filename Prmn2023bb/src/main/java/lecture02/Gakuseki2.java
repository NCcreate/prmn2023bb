package lecture02;

public class Gakuseki2 {
    int hantei(String[][] array,String gakuseki2){
        for(int i = 0;i < 5;i++){
            if(array[i][0].equals(gakuseki2)){
                System.out.print("パスワードを入力してください：");
                return i;
            }
        }
        System.out.println("error!");
        System.exit(0);
        return 0;
    }
}
