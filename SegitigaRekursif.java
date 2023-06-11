import java.util.Scanner;

public class SegitigaRekursif {
    public static void cetakSegitiga(int tinggi, int baris, int bintang) {
        if (baris > tinggi) {
            return;
        }

        if (bintang <= baris) {
            System.out.print("o ");
            cetakSegitiga(tinggi, baris, bintang + 1);
        } else {
            System.out.println();
            cetakSegitiga(tinggi, baris + 1, 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        cetakSegitiga(tinggi, 1, 1);
    }
}
