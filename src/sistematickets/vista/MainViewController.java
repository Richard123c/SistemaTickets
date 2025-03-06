/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematickets.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
/**
 *
 * @author Lenovo
 */
public class MainViewController {
    
    @FXML
    private Button botonSaludo;
    
    @FXML
    private void initialize() {
    botonSaludo.setOnAction(event -> {
        System.out.println("¡Hola, javaFX!");
    });
    
    }
}
