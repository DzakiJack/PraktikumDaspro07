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

             if (status == 1) {
             hasil = "Dana penghargaan diberikan";
         } else {
             hasil = "Dana penghargaan tidak diberikan.";
         }

         if (dokumen == 0) {
             kurang = "Dokumen tidak lengkap (kurang 4 dokumen). ";
         } else if (dokumen == 1) {
             kurang = "Dokumen tidak lengkap (kurang 3 dokumen). ";
         } else if (dokumen == 2) {
             kurang = "Dokumen tidak lengkap (kurang 2 dokumen). ";
         } else if (dokumen == 3) {
             kurang = "Dokumen tidak lengkap (kurang 1 dokumen). ";
         } else if (dokumen <= 4 && juara > 3 ) {
             kurang = "Syarat tidak terpenuhi. ";
         } else {
             kurang = "Syarat terpenuhi. ";
         }

         if (juara != 0 && juara != 1 && juara != 2 && juara != 3) {
             penjelasanJuara = "Peringkat juara tidak valid. ";
         } else {
             penjelasanJuara = "Peringkat juara valid. ";
         }


         scanner.close();

         System.out.println("Status : " + penjelasanJuara + kurang + hasil);
    


        }
    }
}