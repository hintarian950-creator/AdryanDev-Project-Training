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

        // OPERATOR PENUGASAN
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

        int lapar = 3; // 1 makan di rumah, 2 beli jajan, 3 Masak sendiri, 4 Tidak Makan
        if(lapar == 1){
            System.out.println("Makan di rumah");
        }else if(lapar == 2){
            System.out.println("Jajan di luar");
        }else if(lapar == 3){
            System.out.println("Masak sendiri");
        }else{
            System.out.println("Tidak Makan");
        }

        // SHORT HAND IF ELSE (Penulisan Kondisi Lebih singkat)
        int waktu = 20;
        String result = (waktu < 20) ? "Good Day" : "Good night";
        System.out.println(result);

        // NESTED IF (Pengecekan Lebih detail)
        String akun = "Ryan Hinta";
        String password = "ryanhinta";

        if(akun.equals("Ryan Hinta")){
            if(password.equals("ryanhinta")){
                System.out.println("Akun Ditemukan");
            }else{
                System.out.println("Password Salah");
            }
        } else{
            System.out.println("Akun tidak ditemukan");
        }

        // Logical Operators in Conditions (AND &&)
        int one = 100;
        int two = 33;
        int three = 200;
        if(one > two && two >  three){
            System.out.println("Keduanya Benar");
        }else{
            System.out.println("Semua salah");
        }

        // CONTOH LAINNYA MENGGUNAKAN && (AND)
        int usia = 20;
        boolean punyaKtp = true;
        if(usia >= 17 && punyaKtp){
            System.out.println("Boleh Mendaftar"); // << Karena Punya Ktp bernilai True
        }else{
            System.out.println("Tidak Boleh Mendaftar"); // << Jika Nilainya False
        }

        // Logical Operators in Conditions (OR ||)
        int n = 100;
        int m = 50;
        int q = 300;
        if(n > m || m > q){
            System.out.println("Benar");
        }else{
            System.out.println("Semua Salah");
        }

        // CONTOH LAINNYA MENGGUNAKAN OR (||)
        int age = 50;
        boolean pelajar = true;
        if(age >= 50 || pelajar){
            System.out.println("Dapat Diskon");
        }else{
            System.out.println("Tidak Dapat Diskon");
        }

        // Logical Operators in Conditions (NOT !)
        boolean sudahLogin = false
        ;
        if(!sudahLogin){
            System.out.println("Belum Login");
        }else{
            System.out.println("Sudah login");
        }

        
        System.out.println("=== SWITCH ===");

        int hari = 9;
        switch(hari){
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            default:
                System.out.println("Tidak ada");
        }   

    }
}
 
