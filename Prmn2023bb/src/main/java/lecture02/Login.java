package lecture02;

public class Login {
    void message(String name,String number,String name_1,String number_1){
        if(name.equals(name_1)){
            if(number.equals(number_1)){
                System.out.println("ログイン成功！");
            }else{
                System.out.println("ログイン失敗…");
            }
        }else{
            System.out.println("ログイン失敗…");
        }
    }
}

