package lecture02;

public class Gakuseki {
    String number;
    Gakuseki(String number){
        this.number=number;
    }
    void hantei(String number_in){
        if(number_in.equals(number)){
            System.out.print("complete!!");
        }else{
            System.out.print("error!!");
        }
    }
}
