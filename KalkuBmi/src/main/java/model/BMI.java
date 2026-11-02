
package model;

public class BMI {

    private double berat;
    private double tinggi;
    private String gender;

    public BMI (double berat, double tinggi, String gender) {
        if (berat <= 0) {
            throw new IllegalArgumentException(
                "Berat badan harus lebih dari 0"
            );
        }

        if (tinggi <= 0) {
            throw new IllegalArgumentException(
                "Tinggi badan harus lebih dari 0"
            );
        }

        if (gender == null || gender.isEmpty()) {
            throw new IllegalArgumentException(
                "Silakan pilih jenis kelamin"
            );
        }

        this.berat = berat;
        this.tinggi = tinggi;
        this.gender = gender;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggi / 100;
        return berat / (tinggiMeter * tinggiMeter);
    }

    public String getKategori() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            return "Berat badan kurang";
        } else if (bmi < 25) {
            return "Berat badan normal";
        } else if (bmi < 30) {
            return "Berat badan berlebih";
        } else {
            return "Obesitas";
        }
    }

    // Getter
    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public String getGender() {
        return gender;
    }
}
