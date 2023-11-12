import java.util.Scanner;

/**
 * Pemilihan2Percobaan2_13
 */
public class Pemilihan2Percobaan2_13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        
        System.out.println("Masukkan sudut : ");
        System.out.print("Sudut 1 : ");
        float sudut1 = input13.nextInt() ;

        System.out.print("Sudut 2 : ");
        float sudut2 = input13.nextInt() ;

        System.out.print("Sudut 3 : ");
        float sudut3 = input13.nextInt() ;
        
        float totalSudut;
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) 
                System.out.print("Segitiga Tersebut Adalah Segitiga Siku-Siku");
            else if ((sudut1 == 60) && (sudut2 == 60)  && (sudut3 == 60))
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
            else if((sudut1 == sudut2)||(sudut1 == sudut3)||(sudut2 == sudut3))
                System.out.print("Segitiga Tersebut Adalah  Segitiga kaki");
            else if((sudut1 != sudut2) || (sudut1 != sudut3)|| (sudut2!= sudut3))
                System.out.println("Segitiga Tersebut adalah Segitiga Sembarang");
            
            
            
        } else 
            System.out.println("Bukan Segitiga");
        
    }
}

