import java.util.Scanner;

public class StudiKasus1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gajiPokok, tunjanganAnak, jmlAnak, totalTunjanganAnak;
        double persentaseSimpananDana =0.05, totalPotongan, gajiBersih;

        System.out.println("Masukkan gaji pokok anda : ");
        gajiPokok = input.nextInt();
        System.out.println("Masukkan tunjangan anak anda: ");
        tunjanganAnak = input.nextInt();
        System.out.println("Masukkan jumlah anak anda: ");
        jmlAnak = input.nextInt();

        totalTunjanganAnak = jmlAnak*tunjanganAnak;
        totalPotongan = gajiPokok*persentaseSimpananDana;
        gajiBersih = gajiPokok+totalTunjanganAnak-totalPotongan;

        System.out.println("Tunjangan anak anda adalah " +totalTunjanganAnak);
        System.out.println("Simpanan dana anda adalah "+totalPotongan);
        System.out.println("Gaji bersih anda adalah " +gajiBersih);
    }
}
    