public class Motor {
    private String aktifitas;
    private int kecepatan;

    // Constructor untuk menginisialisasi atribut
    public Motor(int kecepatan) {
        this.kecepatan = kecepatan;
        cekKecepatan(); // Memanggil metode untuk menentukan aktifitas berdasarkan kecepatan
    }

    // Method untuk menentukan aktifitas berdasarkan kecepatan
    public void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "Parkir";
        } else if (kecepatan == 1) {
            aktifitas = "Jalan";
        } else {
            aktifitas = "Kecepatan tidak valid";
        }
    }

    // Method untuk mencetak semua atribut
    public void cetakAtribut() {
        System.out.println("Aktifitas: " + aktifitas);
        System.out.println("Kecepatan: " + kecepatan);
    }

    public static void main(String[] args) {
        // Contoh instansiasi objek Motor
        Motor motor1 = new Motor(0);
        motor1.cetakAtribut();

        Motor motor2 = new Motor(1);
        motor2.cetakAtribut();

        Motor motor3 = new Motor(2); // Contoh kecepatan yang tidak valid
        motor3.cetakAtribut();
    }
}