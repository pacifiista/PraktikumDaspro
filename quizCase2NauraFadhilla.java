import java.util.Scanner;
public class quizCase2NauraFadhilla {
   public static void main(String[] args) {
    // Nama Program Target kalori 3 jenis olahraga

    Scanner sc = new Scanner(System.in); 
    // Deklarasi
    int durasi, beratBadan, ketinggian, kecepatan; //durasi (menit), beratBadan (kg), ketinggian (meter), kecepatan (km/jam)
    double berlari=0.05, berenang=0.04, bersepeda=0.03, totalKalori, rataRataKalori; //koefisien 3 jenis olahraga berlari,bersepeda,dan berenang
    double kaloriBerlari, KaloriBerenang, kaloriBersepeda, presentaseTarget;

    // Input durasi, beratBadan, ketinggian, kecepatan
    System.out.print("Masukkan durasi olahraga: ");
    durasi = sc.nextInt();
    System.out.print("Masukkan berat badan:");
    beratBadan = sc.nextInt();
    System.out.print("Masukkan Ketinggian lokasi: ");
    ketinggian = sc.nextInt();
    System.out.print("Masukkan kecepatan: ");
    kecepatan = sc.nextInt();

    // Proses
    //Hitung kalori untuk masing-masing olahraga
    kaloriBerlari = (durasi*berlari*beratBadan)+(kecepatan*0.5)+(ketinggian*0.01);
    kaloriBersepeda = (durasi*bersepeda*beratBadan)+(kecepatan*0.5)+(ketinggian*0.01);
    KaloriBerenang = (durasi*berenang*beratBadan)+(kecepatan*0.5)+(ketinggian*0.01);

    //Hitung Total Kalori yang terbakar
    totalKalori = (kaloriBerlari+kaloriBersepeda+KaloriBerenang)*durasi;

    // Rata-rata  kalori yang terbakar per menit
    rataRataKalori = (totalKalori/3)/durasi; //dibagi 3 karena banyaknya jenis olahraga

    // Presentasi target kalori
    presentaseTarget = (rataRataKalori/totalKalori)*100; //dikalikan 100 untuk persentase

    // Output
    System.out.println("Kalori yang terbakar saat berlari ialah: " + kaloriBerlari);
    System.out.println("Kalori yang terbakar saat bersepeda ialah: " + kaloriBersepeda);
    System.out.println("Kalori yang terbakar saat berenang ialah: " + KaloriBerenang);
    System.out.println("Total kalori yang terbakar dari semua aktivitas ialah: " + totalKalori);
    System.out.println("Rata-rata kalori yang terbakar ialah: " + rataRataKalori);
    System.out.println("Persentase kertercapaian target kalori harian: " + presentaseTarget +"%");
    }
} 