/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.LoginModel;
import view.BookView;
import classes.Person;
import javax.swing.JFrame;
import view.NewMenuView;
import view.ReaderView;

/**
 *
 *
 */
public class LoginController {

    /*  */
    LoginModel loginModel = new LoginModel();
    Person person = new Person();

    /**
     * Construtor de loginController.
     *
     * @param username Email digitado pelo usuário.
     * @param password Senha digitada pelo usuário.
     * @return void
     */
    public LoginController(String username, String password) {

        person.setPersonEmail(username);
        person.setPersonPassword(password);

        // Check credenciais chamando o loginModel
        if (loginModel.checkCredentials(person.getPersonEmail(), person.getPersonPassword())) {
            //new BookView().setVisible(true);
            JFrame frame = new JFrame("Minha Aplicação");
            NewMenuView menuView = new NewMenuView();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(menuView);
            frame.pack(); // ajusta o tamanho do frame baseado no conteúdo
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
        }

    }
}
