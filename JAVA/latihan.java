public class latihan{
    public static void main(String[] args) {

        System.out.println("=== TIPE DATA ===");

        String nama = "Ryan Hinta";
        int umur = 18;
        float tinggi = 1.65f;
        double berat = 67.43d;
        char golonganDarah = 'O';
        
        System.out.println("Nama:" + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Berat: " + berat);
        System.out.println("Golongan Darah: " + golonganDarah);

        System.out.println("=== BOOLEAN ===");
        
        boolean tiketMasuk = true;
        boolean pakaian = true;
        if(tiketMasuk && pakaian){
            System.out.println("Masuk");
        }else{
            System.out.println("Dilarang Masuk");
        }
        boolean ktp = true;
        boolean ktm = false;
        if(ktp || ktm){
            System.out.println("Jalan");
        }else{
            System.out.println("Dilarang Jalan");
        }
        boolean hujan = true;
        if(!hujan){
            System.out.println("Keluar");
        }else{
            System.out.println("Dilarang Keluar");
        }

        System.out.println("=== MATH ===");

        int a = 10;
        int b = 2;
        
        System.out.println("Penjumlahan: " + (a+b));
        System.out.println("Pengurangan: " + (a-b));
        System.out.println("Perkalian: " + (a*b));
        System.out.println("Pembagian: " + (a/b));

        System.out.println("=== FUNGSI ===");

        // FUNGSI 
        int x = 20;
        
        x += 5;
        System.out.println("Penjumlahan: " + x);
        x -= 2;
        System.out.println("Pengurangan: " + x);
        x *= 5;
        System.out.println("Perkalian: " + x);
        x /= 2;
        System.out.println("Pembagian: " + x);


        System.out.println("=== IF & ELSE ===");

        int lapar = 3; // 1 makan di rumah, 2 beli jajan, 3 tidak makan
        if(lapar == 1){
            System.out.println("Makan di rumah");
        }else if(lapar == 2){
            System.out.println("Jajan di luar");
        }else if(lapar == 3){
            System.out.println("Masak sendiri");
        }else{
            System.out.println("Tidak Makan");
        }

        // SHORT HAND IF ELSE
        int waktu = 20;
        String result = (waktu < 20) ? "Good Day" : "Good night";
        System.out.println(result);

        

    }
} 
