public class ContohOperator21 {

    public static void main(String[] args) {
    int x = 10;
    System.out.println("x++ =" + x++);
    System.out.println("Setelah evaluasi, x = " + x);
    x = 10;
    System.out.println("==x = " + ++x);
    System.out.println("Setelah evaluasi, x =" + x);
    int y = 12;
    System.out.println(x > y || y == x && y <= x);
    int z = x ^ y;
    System.out.println("Hasil x ^ y adalah " + z);
    z %= 2;
    System.out.println("Hasil akhir " +z);

    // perhitungan manual
    // x = 11
    // y = 12
    //1011
    //1100
    //____
    //0111 -> 7
    }
}