import java.util.Scanner;
public class siakadDoWhile03 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int kopi,teh,roti;
    String namaPelanggan;
    int hargaKopi = 12000;
    int hargaTeh = 7000;
    int hargaRoti = 20000;

    do{
        System.out.print("Masukan Nama Pelanggan (Ketik 'Batal' Untuk Keluar) :");
        namaPelanggan = Sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transaksi di Batalkan");
            break;
        }
        System.out.print("Jumlah Kopi :");
        kopi = Sc.nextInt();
        System.err.print("Jumlah Teh :");
        teh = Sc.nextInt();
        System.out.print("Jumlah Roti :");
        roti = Sc.nextInt();

        int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.print("Total Yang Harus di Bayar : Rp" + totalHarga);
        Sc.nextLine();
    } while (true);
    }
}
