package lecture02;
import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Preregi regi=new Preregi();
        Gakuhantei login=new Gakuhantei();
        String[][] list= regi.gakuregi();
        login.hantei(list);
    }
}
