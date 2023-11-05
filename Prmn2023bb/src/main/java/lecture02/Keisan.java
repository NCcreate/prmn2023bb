package lecture02;

public class Keisan {
    int x = 0;
    void goukei(int[] num){
        for(int j = 0;j < 5;j++){
            x  += num[j];
        }
        System.out.println("合計値" + x);
    }

    void hanbetu(){
        if(x >= 100){
            System.out.println("great!");
        }else if(x >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
