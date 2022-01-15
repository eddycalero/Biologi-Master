package com.controll;

import com.modell.AccesoAleatorio;
import com.modell.User;
import com.views.NewUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Eddy
 */
public class NewUserControll implements ActionListener {

    private NewUser user;

    public NewUserControll(NewUser user) {
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Guardar Usuario":
                String nombre = user.txtnombre.getText().trim();
                if (nombre.isEmpty()) {
                    user.txtnombre.setHelperText("Ingrese un Usuario");

                }
                String password = user.txtpassword.getText().trim();
                if (password.isEmpty()) {
                    user.txtpassword.setHelperText("Ingrese una Contrasena");
                    return;
                }
                try {
                    AccesoAleatorio.crearFileUser(new File("personas.Dat"));
                    AccesoAleatorio.CrearUser(new User(nombre, password));
                    AccesoAleatorio.cerrar();
                    user.txtnombre.setHelperText("El Nombre se Guardo Correctamente");
                    user.txtpassword.setHelperText("La Contrasena se Guardo Correctamente");
                } catch (IOException ex) {

                }
                break;

        }
    }

}
