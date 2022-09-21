package praktikum2_ara;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Praktikan
 */
public class Praktikum2_Ara {
    private static Object JOptionpane;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka = 5;
        double angkaDouble = 2.5;
        float angkaFloat = 2.5f;
        long angkaLong = 20L;
        
        char karakter = 'c';
        String kata = "Ilkomp";
        
        boolean kondisi = true;       
        double fromInt = angka;
        int fromDouble =(int) angkaDouble;
                
        System.out.println(angka);
        System.out.println(angkaDouble);
        System.out.println(angkaFloat);
        System.out.println(angkaLong);
        System.out.println(karakter);
        System.out.println(kata);
        System.out.println(kondisi);
        System.out.println(fromInt);
        System.out.println(fromDouble);
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("Tahun angkatan: ");
        int umur = inputUser.nextInt();
        
        inputUser.nextLine();
        
        System.out.println("Nama: ");
        String nama = inputUser.nextLine();
        
        System.out.println("Alamat: ");
        String alamat = inputUser.nextLine();
        
        System.out.println("Nama            : " + nama);
        System.out.println("Tahun angkatan  : " + umur);
        System.out.println("Alamat          : " + alamat);
        
        
       String NAMA = JOptionPane.showInputDialog("Input NAMA anda");
       JOptionPane.showMessageDialog(null, "Hello " + NAMA);
        
        
    }
    
}
