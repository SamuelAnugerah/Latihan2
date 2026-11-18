
class StudentGrader {
    public double hitungNilaiAkhir(
        double tugas, double uts, double uas
    ) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

class GradeReport {
    public void cetakLaporan(String nama, double nilai) {
        System.out.println("===== LAPORAN NILAI =====");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Akhir: " + nilai);

        if (nilai >= 85) {
            System.out.println("Predikat: A");
        } else if (nilai >= 75) {
            System.out.println("Predikat: B");
        } else if (nilai >= 65) {
            System.out.println("Predikat: C");
        } else {
            System.out.println("Predikat: D");
        }
    }
}

class GradeRepository {
    public void simpanDatabase(String nama, double nilai) {
        System.out.println(
            "Menyimpan data " + nama +
            " dengan nilai " + nilai + " ke database."
        );
    }
}

public class Main {
    public static void main(String[] args) {
        StudentGrader grader = new StudentGrader();
        GradeReport report = new GradeReport();
        GradeRepository repository = new GradeRepository();

        String nama = "Samuel";

        double tugas = 80;
        double uts = 85;
        double uas = 90;

        double nilaiAkhir =
            grader.hitungNilaiAkhir(tugas, uts, uas);

        report.cetakLaporan(nama, nilaiAkhir);

        repository.simpanDatabase(nama, nilaiAkhir);
    }
}
