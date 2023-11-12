import java.util.Scanner;

/**
 * Pemilihan2Percobaan1_13
 */
public class Pemilihan2Percobaan1_13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun : ");
        int tahun = input13.nextInt() ;
        
        if ((tahun % 4) == 0) {
            if ((tahun % 100) ==0 || ((tahun % 400) ==0)){ 
                System.out.println("Tahun Kabisat");
                // if ((tahun % 400) ==0) {
                //     System.out.println("Tahun Kabisat");
                // }
            } else {
            System.out.println("Bukan Tahun Kabisat");
            }
        } 
    }
}