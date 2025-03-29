package org.example.Vistas;

import org.example.Model.LibroModel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Libro {
    private JButton btnAceptar;
    private JTextField textField1;

    public Libro() {
        btnAceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                LibroModel libro = new LibroModel();
                libro.setTitulo(textField1.getText());
            }
        });
    }
}
