package lecture02;
import java.util.Scanner;
public class Gakuhantei {
    Scanner input=new Scanner(System.in);
    void hantei(String[][] pregaku){
        String pass;
        System.out.print("学籍番号を入力してください:");
        String gakuseki=input.next();
        for(int i=0;i< pregaku.length;i++){
            if(gakuseki.equals(pregaku[i][0])){
                System.out.println("パスワードを入力してください:");
                pass=input.next();
                if(pass.equals(pregaku[i][1])){
                    System.out.print("ログイン完了");
                    System.exit(0);
                }else{
                    System.out.print("不正なアクセス");
                    System.exit(0);
                }
            }
        }
        System.out.print("error!!");
        System.exit(0);

    }
}
