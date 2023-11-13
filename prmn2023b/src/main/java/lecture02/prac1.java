package lecture02;
import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String number="B2001000";
        System.out.print("学籍番号を入力してください:");
        String gakuseki = input.next();
        //引数付きコンストラクタで事前にある学籍番号をGakusekiクラスに入れている
        Gakuseki gaku = new Gakuseki(number);
        gaku.hantei(gakuseki);
    }
}
