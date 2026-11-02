
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;

import model.BMI;

public class KalkuBMIController {

    @FXML
    private ComboBox<String> cbGender;

    @FXML
    private TextField txtTinggi;

    @FXML
    private TextField txtBerat;

    @FXML
    private Label lblHasil;

    // Mengisi pilihan gender
    @FXML
    public void initialize() {
        cbGender.setItems(
            FXCollections.observableArrayList(
                "Laki-laki",
                "Perempuan"
            )
        );
    }

    @FXML
    private void hitungBmi() {

        try {
            // Mengambil input
            double tinggi = Double.parseDouble(
                txtTinggi.getText()
            );

            double berat = Double.parseDouble(
                txtBerat.getText()
            );

            String gender = cbGender.getValue();

            // Membuat objek BMI
            BMI bmi = new BMI(
                berat, tinggi, gender
            );


            double hasil = bmi.hitungBMI();

            String kategori = bmi.getKategori();

            lblHasil.setText(
                String.format(
                "BMI: %.2f\nKategori: %s",
                hasil, kategori
    )
);

        } catch (NumberFormatException e) {
            lblHasil.setText(
                "Masukkan angka yang valid!"
            );

        } catch (IllegalArgumentException e) {
            lblHasil.setText(e.getMessage());
        }
    }
}
