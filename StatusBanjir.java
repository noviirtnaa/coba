public class StatusBanjir {
    private String status;
    private int tinggi_banjir;

    // Constructor
    public StatusBanjir(int tinggi_banjir) {
        this.tinggi_banjir = tinggi_banjir;
        check_status(); // Memanggil metode untuk menentukan status saat objek dibuat
    }

    // Method untuk menentukan status berdasarkan tinggi banjir
    public void check_status() {
        if (tinggi_banjir >= 0 && tinggi_banjir <= 25) {
            status = "Amannnn";
        } else if (tinggi_banjir >= 26 && tinggi_banjir <= 50) {
            status = "SIAGA I";
        } else if (tinggi_banjir >= 51 && tinggi_banjir <= 100) {
            status = "AWASSS";
        } else {
            status = "Data tidak valid";
        }
    }

    // Method untuk menampilkan atribut tinggi banjir dan status
    public void show_attributes() {
        System.out.println("Tinggi Banjir adalah: " + tinggi_banjir + " cm");
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        // Contoh instansiasi objek
        StatusBanjir banjir1 = new StatusBanjir(40);
        banjir1.show_attributes();

        StatusBanjir banjir2 = new StatusBanjir(10);
        banjir2.show_attributes();

        StatusBanjir banjir3 = new StatusBanjir(70);
        banjir3.show_attributes();
    }
}