public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23();

        mhs1.nim = "244107060130";
        mhs1.nama = "Sadam Putra";
        mhs1.kelas = "2E";
        mhs1.ipk = 4.0;

        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja(mhs1.ipk));

        mhs1.ubahKelas("2B");
        mhs1.updateIpk(3.8);

        mhs1.tampilkanInformasi();
        Mahasiswa23 mhs2 = new Mahasiswa23("2414210023", "Sadam", "2A", 3.7);
        mhs2.tampilkanInformasi();
        
        
    }
}
