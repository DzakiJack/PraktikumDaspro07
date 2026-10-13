import java.util.Scanner;

public class StudiKasus207 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       String nama;
       String kegiatan;
       int dokumen, juara, status;
       String kurang, penjelasanJuara, hasil;
       
       System.out.print("Nama mahasiswa : ");
       nama = scanner.nextLine();
       System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
       kegiatan = scanner.nextLine();
         System.out.print("Jumlah dokumen : ");
         dokumen = scanner.nextInt();
         System.out.print("Peringkat juara : ");
         juara = scanner.nextInt();


         if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("MANDIRI")) {
             if (dokumen == 4 && juara == 1) {
                 status = 1;
             } else if (dokumen == 4 && juara == 2) {
                 status = 1;
             } else if (dokumen == 4 && juara == 3) {
                 status = 1;
             } else {
                status = 0;
             } 

        }
    }
}