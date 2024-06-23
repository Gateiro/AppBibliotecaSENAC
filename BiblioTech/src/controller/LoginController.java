/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.LoginModel;
import view.BookView;
import classes.Person;
import view.ReaderView;

/**
 *
 * 
 */
public class LoginController {
    
    
    LoginModel loginModel = new LoginModel();
    Person person = new Person();
    
    public LoginController(String username, String password) {

        person.setPersonEmail(username);
        person.setPersonPassword(password);
        
        if(loginModel.checkCredentials(person.getPersonEmail(), person.getPersonPassword())){
             //new BookView().setVisible(true);
             new ReaderView().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
        }
        
    }
}
