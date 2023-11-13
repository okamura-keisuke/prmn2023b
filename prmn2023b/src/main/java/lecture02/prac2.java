package lecture02;
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] num=new int[5];
        Keisan ken=new Keisan();

        for(int i=0;i<5;i++){
            System.out.print("数字 "+(i+1)+"つ目");
            num[i]=input.nextInt();
        }

        ken.goukei(num);
        ken.hantei();
    }
}
