/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;
import utils.Validation;

/**
 *
 *
 */
public class Person {

    private int personId;
    private String personName;
    private int personCpf;
    private int personTel;
    private String personEmail;
    private String personPassword;
    Validation isValid = new Validation();

    /**
     * Construtor vazio padrão para a classe Person.
     */
    public Person() {
        // Construtor vazio padrão
    }

    /**
     * Obtém o ID da pessoa.
     *
     * @return o ID da pessoa.
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Define o ID da pessoa.
     *
     * @param personId o novo ID da pessoa.
     */
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return o nome da pessoa.
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Define o nome da pessoa. Verifica se o nome não está vazio antes de
     * definir.
     *
     * @param personName o novo nome da pessoa.
     */
    public void setPersonName(String personName) {
        if (!isValid.isNotEmpty(personName)) {
            System.out.println("Nome não deve ser vazio");
        }
        this.personName = personName;
    }

    /**
     * Obtém o CPF da pessoa.
     *
     * @return o CPF da pessoa.
     */
    public int getPersonCpf() {
        return personCpf;
    }

    /**
     * Define o CPF da pessoa.
     *
     * @param personCpf o novo CPF da pessoa.
     */
    public void setPersonCpf(int personCpf) {
        this.personCpf = personCpf;
    }

    /**
     * Obtém o telefone da pessoa.
     *
     * @return o telefone da pessoa.
     */
    public int getPersonTel() {
        return personTel;
    }

    /**
     * Define o telefone da pessoa.
     *
     * @param personTel o novo telefone da pessoa.
     */
    public void setPersonTel(int personTel) {
        this.personTel = personTel;
    }

    /**
     * Obtém o email da pessoa.
     *
     * @return o email da pessoa.
     */
    public String getPersonEmail() {
        return personEmail;
    }

    /**
     * Define o email da pessoa. Verifica se o email não está vazio e se é
     * válido antes de definir.
     *
     * @param personEmail o novo email da pessoa.
     */
    public void setPersonEmail(String personEmail) {
        if (!isValid.isNotEmpty(personEmail)) {
             JOptionPane.showMessageDialog(null, "Email não deve ser vazio");

        }

        if (!isValid.isValidEmail(personEmail)) {
            JOptionPane.showMessageDialog(null, "Email deve ser valido");
 
        }
        this.personEmail = personEmail;
    }

    /**
     * Obtém a senha da pessoa.
     *
     * @return a senha da pessoa.
     */
    public String getPersonPassword() {
        return personPassword;
    }

    /**
     * Define a senha da pessoa.
     *
     * @param personPassword a nova senha da pessoa.
     */
    public void setPersonPassword(String personPassword) {
        if (!isValid.isNotEmpty(personPassword)) {
            JOptionPane.showMessageDialog(null, "Senha não deve ser vazia");
        }
        this.personPassword = personPassword;
    }
}
