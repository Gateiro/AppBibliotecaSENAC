/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Map;
import model.ReaderModel;

/**
 *
 *
 */
public class ReaderController {

    ReaderModel createReader = new ReaderModel();

    public ReaderController() {

    }

    public void addReader() {

    }

    public Map listReaders() {
        return createReader.listReaders();
    }
}
