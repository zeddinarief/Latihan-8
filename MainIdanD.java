package Interface;
import java.util.Scanner;
public class MainIdanD {
    public static void main(String[] args) {
     IdanD id = new IdanD();   
     Scanner in = new Scanner(System.in);
     double angka;
        System.out.print("Angka = ");
        angka = in.nextDouble();
        if (angka % 1 == 0){
            System.out.print(angka);
            id.I1();
        }else{
            System.out.print(angka);
            id.D1();
        }
    }    
}
