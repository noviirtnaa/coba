public class waktu {
    private int jam;
    private int menit;
    private int detik;

    // Constructor untuk menginisialisasi atribut dengan nilai tertentu
    public waktu(int jam, int menit, int detik) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            this.jam = 0;
        }

        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            this.menit = 0;
        }

        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            this.detik = 0;
        }
    }

    // Method untuk mendapatkan nilai jam
    public int getJam() {
        return jam;
    }

    // Method untuk mendapatkan nilai menit
    public int getMenit() {
        return menit;
    }

    // Method untuk mendapatkan nilai detik
    public int getDetik() {
        return detik;
    }

    // Method untuk mencetak waktu dalam format jam:menit:detik
    public void cetakWaktu() {
        System.out.println("Waktu saat ini: " + jam + ":" + menit + ":" + detik);
    }

    public static void main(String[] args) {
        waktu waktu = new waktu(15, 29, 45);
        waktu.cetakWaktu();

        System.out.println("Jam: " + waktu.getJam());
        System.out.println("Menit: " + waktu.getMenit());
        System.out.println("Detik: " + waktu.getDetik());
    }
}