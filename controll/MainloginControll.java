package com.controll;

import com.modell.AccesoAleatorio;
import com.views.MainLogin;
import com.views.Menu;
import com.views.NewUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Eddy
 */
public class MainloginControll implements ActionListener {

    private MainLogin login;

    public MainloginControll(MainLogin login) {
        this.login = login;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Acceso": {
                try {
                    checkUser();
                } catch (IOException ex) {

                }
            }
            break;
            case "Nuevo Usuario": {
                NewUser o = new NewUser();
                o.setVisible(true);
                login.setVisible(false);
            }
            break;
        }
    }

    protected boolean checkUser() throws IOException {
        String nombre = login.txtUser.getText().trim();
        String password = login.txtPassword.getText().trim();
        boolean action = true;
        if (nombre.isEmpty() && password.isEmpty()) {
            login.txtUser.setHelperText("Ingrese un Usuario");
            login.txtPassword.setHelperText("Ingrese una contrasena");
            action = false;

        } else {
            AccesoAleatorio.crearFileUser(new File("personas.Dat"));
            int i = AccesoAleatorio.buscarRegistro(nombre);
            if (i == -1) {
                login.txtUser.setHelperText("El Usuario no existe");
                login.txtPassword.setHelperText("La contrasena no existe");
                action = false;
            }
            if (password.isEmpty()) {
                login.txtPassword.setHelperText("Ingrese una contrasena");
                action = false;
            } else {
                Menu l = new Menu();
                l.setVisible(true);
            }
        }

        return action;
    }

}
