import java.util.Scanner;

public class Toko25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalBeforeDiscount = 0;
        double totalDiscount = 0;

        System.out.print("Masukkan nama pelanggan: ");
        String customerName = scanner.nextLine();

        String inputAnother;
        do {
            System.out.print("Masukkan nama produk: ");
            String productName = scanner.nextLine();
            System.out.print("Masukkan kuantitas: ");
            int quantity = scanner.nextInt();
            System.out.print("Masukkan harga satuan: ");
            double price = scanner.nextDouble();
            System.out.print("Masukkan diskon (%): ");
            double discount = scanner.nextDouble();

            totalBeforeDiscount += quantity * price;
            totalDiscount += quantity * price * (discount / 100);

            System.out.print("Apakah Anda ingin menambahkan produk lagi? (ya/tidak): ");
            inputAnother = scanner.next();
            scanner.nextLine(); // membersihkan buffer
        } while (inputAnother.equalsIgnoreCase("ya"));

        double totalToPay = totalBeforeDiscount - totalDiscount;

        System.out.println("Nama Pelanggan: " + customerName);
        System.out.println("Total Harga Sebelum Diskon: " + totalBeforeDiscount);
        System.out.println("Total Diskon: " + totalDiscount);
        System.out.println("Total Akhir yang Harus Dibayar: " + totalToPay);
        
    }
}
