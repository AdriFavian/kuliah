import java.util.Scanner;

public class PemilihanPercobaan218 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Nilai UAS  : ");
        float uas = input18.nextFloat();
        System.out.print("Nilai UTS  : ");
        float uts = input18.nextFloat();
        System.out.print("Nilai Kuis :  ");
        float kuis = input18.nextFloat();
        System.out.print("Nilai Tugas: ");
        float tugas = input18.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String messageRemidi = total < 65 ? "Remidi" : "Tidak Remidi";

        String message;
        if (total > 80 && total <= 100) {
            message = "A (sangat baik)";
        } else if (total > 73 && total <= 80) {
            message = "B+ (lebih dari baik)";
        } else if (total > 65 && total <= 73) {
            message = "B (baik)";
        } else if (total > 60 && total <= 65) {
            message = "C+ (lebih dari cukup)";
        } else if (total > 50 && total <= 60) {
            message = "C (cukup)";
        } else if (total > 39 && total <= 50) {
            message = "D (kurang)";
        } else {
            message = "E (gagal)";
        }

        System.out.println("Nilai akhir = " + total + " dengan nilai huruf: " + message + ", sehingga " + messageRemidi);
    }
}
