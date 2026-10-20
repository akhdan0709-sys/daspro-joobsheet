import java.util.Scanner;
public class siakadWHILE03 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner (System.in);
    int nilai,jml;
    int i = 0;

        System.out.print("Masukan julmlah Mahasiswa :");
        jml = Sc.nextInt();
    
    while (i < jml) {

        System.out.println("Masukan NIlai Mahasiswa ke-" + (i+1) + ":");
        nilai = Sc.nextInt();

            if (nilai < 0 || nilai > 100){
                System.out.println("NIlai Tidak Vali. Masukan NIlai Yang VALID!");
                continue;
            }
            if (nilai > 80 && nilai <= 100){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "adalah A");
                System.out.println("Bagus Pertahankan NIlainya");
            } else if (nilai > 73 && nilai <= 80){
                System.out.println("NIlai MAhasiswa ke-" + (i+1 + "adalah B+"));
            } else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "adalah B");
            } else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai MAhasiswa ke-" + (i+1) + "adalah C+");
            } else if (nilai > 50 && nilai <= 60){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "adalah C");
            } else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "adalah D");
            } else {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "adalah E");
            }
         i++;
    }
    
    }
}