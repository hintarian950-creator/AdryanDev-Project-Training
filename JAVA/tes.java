import java.math.BigDecimal;

public class tes {
    public static void main(String[] args){
        System.out.println("== Daftar Belanja Hari ini ==");
        int totalBelanja = 10;
        BigDecimal hargaPerItem = new BigDecimal("20.000");
        BigDecimal totalHarga = BigDecimal.valueOf(totalBelanja).multiply(hargaPerItem);

        System.out.println("Total Belanja: " + totalBelanja`);
        System.out.println("Total Harga: Rp " + totalHarga  );
    }
}
