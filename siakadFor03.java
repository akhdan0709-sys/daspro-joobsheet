import java.util.Scanner;
public class siakadFor03{
    public static void main(String[]args){
    Scanner Sc = new Scanner (System.in);
    double nilai,tertinggi = 0,terendah = 100;
    int lulus = 0, tidakLulus = 0;

    for (int i = 1; i <= 10; i++){
        System.out.print("Masukan Nilai Mahasiswa ke-" +i +":");
        nilai = Sc.nextDouble();
        if (nilai > tertinggi){
            tertinggi = nilai;
        } 
        if (nilai < terendah){
            terendah = nilai;
        }
        if (lulus <= 60){
            lulus++;
        } else {
            tidakLulus++;
        }
    } 
     System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Lulus :" + lulus);
        System.out.print("Tidak LULUS :" + tidakLulus);
    }
}