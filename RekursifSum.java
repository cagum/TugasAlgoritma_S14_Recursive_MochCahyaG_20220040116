import java.util.Scanner;

public class Rekursif2 {
    public static int hitungJumlahAngka(int bilangan) {
        if (bilangan == 0) {
            return 0;
        } else {
            return (bilangan % 10) + hitungJumlahAngka(bilangan / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        int hasil = hitungJumlahAngka(bilangan);
        System.out.println("Jumlah angka dalam bilangan " + bilangan + " adalah " + hasil);
    }
}
