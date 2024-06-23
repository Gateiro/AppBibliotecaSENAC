/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import classes.Person;
import java.util.Map;
import model.ReaderModel;

/**
 *
 *
 */
public class ReaderController {

    ReaderModel createReader = new ReaderModel();
    private Person person = new Person();
    
    public ReaderController() {

    }

    public void addReader(int readerId, String readerName, String readerCpf, String readerTel, String readerEmail)
    {
        person.setPersonCpf(readerId);
        person.setPersonName(readerName);
        person.setPersonCpf(readerId);
        person.setPersonTel(readerId);
        person.setPersonEmail(readerEmail);
                        
        createReader.addReader(readerId, readerName, readerCpf, readerTel, readerEmail);
                
    }

    public Map listReaders() {
        return createReader.listReaders();
    }
}
