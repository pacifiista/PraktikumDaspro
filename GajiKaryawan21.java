import java.util.Scanner;

public class GajiKaryawan21 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Deklarasi
    int gajiPokok, tunjTrans=600000, tunjMakan=400000, bonus, totalGaji;
    

    // Input
    System.out.print("Masukkan gaji pokok anda: ");
    gajiPokok = sc.nextInt();

    // Proses
    bonus = (int)0.05*gajiPokok; //bonus 5%
    totalGaji=gajiPokok+tunjMakan+tunjTrans+bonus-(int)(0.1*gajiPokok); //pajak 10%

    // Output
    System.out.println("Bonus yang anda dapatkan adalah: Rp. " + bonus);
    System.out.println("Total Gaji anda adalah: Rp. " +totalGaji);

    }
}
