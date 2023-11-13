package lecture02;

public class Keisan {

    int sum=0;
    void goukei(int[] num){

        for(int i=0;i<5;i++){
            sum=sum+num[i];
        }
        System.out.println("合計値:"+sum);

    }
    void hantei(){
        if(sum>=100){
            System.out.print("great!!");
        }else if(sum>=50){
            System.out.print("big");
        }else{
            System.out.print("small");
        }
    }
}
