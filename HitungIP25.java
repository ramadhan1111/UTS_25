import java.util.Scanner;

public class HitungIP25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean lanjutInput = true;

        while (lanjutInput) {
            System.out.print("Masukkan nama mahasiswa: ");
            String namaMahasiswa = input.nextLine();

            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMatkul = input.nextInt();

            int totalSks = 0;
            double totalBobot = 0;
            int jumlahPerbaikan = 0;

            for (int i = 0; i < jumlahMatkul; i++) {
                Scanner inputMatkul = new Scanner(System.in);

                System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
                String namaMatkul = inputMatkul.nextLine();

                System.out.print("Masukkan indeks nilai mata kuliah (A, B+, B, C+, C, D, E) untuk " + namaMatkul + ": ");
                String nilai = inputMatkul.nextLine();

                System.out.print("Masukkan jumlah SKS mata kuliah " + namaMatkul + ": ");
                int sks = inputMatkul.nextInt();

                totalSks += sks;

                switch (nilai) {
                    case "A":
                        totalBobot += 4.0 * sks;
                        break;
                    case "B+":
                        totalBobot += 3.5 * sks;
                        break;
                    case "B":
                        totalBobot += 3.0 * sks;
                        break;
                    case "C+":
                        totalBobot += 2.5 * sks;
                        break;
                    case "C":
                        totalBobot += 2.0 * sks;
                        break;
                    case "D":
                    case "E":
                        jumlahPerbaikan++;
                        break;
                    default:
                        System.out.println("Indeks nilai tidak valid!");
                }
            }

            double IP = totalBobot / totalSks;

            System.out.println("====================================");
            System.out.println("Nama Mahasiswa: " + namaMahasiswa);
            System.out.println("Indeks Prestasi (IP): " + IP);
            System.out.println("Total Mata Kuliah: " + jumlahMatkul);
            System.out.println("Total SKS: " + totalSks);
            System.out.println("Jumlah Mata Kuliah yang Harus Perbaikan/Remidi: " + jumlahPerbaikan);

            System.out.print("Apakah Anda ingin melanjutkan input nilai? (ya/tidak): ");
            input.nextLine(); // membersihkan buffer
            String lanjut = input.nextLine();

            if (lanjut.equalsIgnoreCase("tidak")) {
                lanjutInput = false;
            }
        }
    }
}
