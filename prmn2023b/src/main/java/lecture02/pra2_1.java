package lecture02;
import java.util.Scanner;
public class pra2_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name1=input.next();
        int num=input.nextInt();

        System.out.printf("氏名：%s、学籍番号：b%d",name1,num);
    }
}
