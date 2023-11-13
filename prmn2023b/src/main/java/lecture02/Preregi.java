package lecture02;
import java.util.Scanner;

public class Preregi {
    Scanner input=new Scanner(System.in);

    String[][] gakuregi(){
        System.out.print("事前登録人数:");
        int n=input.nextInt();
        String[][] gakuseki=new String[n][2];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+"人目 学籍番号:");
            gakuseki[i][0]=input.next();
            if(!gakuseki[i][0].matches("^B[0-9]{7}")){//正規表現で入力形式を判定
                System.out.println("正しい形式で学籍番号を入力してください");
                i--;
                continue;
            }
            System.out.print("パスワード:");
            gakuseki[i][1]=input.next();
        }
        return gakuseki;
    }
}
