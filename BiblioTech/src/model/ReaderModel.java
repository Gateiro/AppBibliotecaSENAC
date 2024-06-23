/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class ReaderModel {

    private Map<Integer, Map<String, String>> readerMap; // HashMap para armazenar livros

    public ReaderModel() {
        this.readerMap = new HashMap<>();
        initializeDatabase(); // Inicializa o bookMap com alguns livros pré-cadastrados
    }

    private void initializeDatabase() {
        // Cria um novo HashMap para armazenar os detalhes do livro
        Map<String, String> reader1Details = new HashMap<>();
        reader1Details.put("readerId", "1");
        reader1Details.put("readerName", "Gandalf the Gray");
        reader1Details.put("readerCpf", "45034562738");
        reader1Details.put("readerTel", "1599676554");
        reader1Details.put("readerEmail", "gandalf.gray@istari.com");
        // Adiciona o primeiro leitor ao leitorMap usando o Cpf como chave
        readerMap.put(123456789, reader1Details);

        // Cria um novo HashMap para armazenar os detalhes do segundo livro
        Map<String, String> reader2Details = new HashMap<>();
        reader2Details.put("readerId", "2");
        reader2Details.put("readerName", "Saruman the White");
        reader2Details.put("readerCpf", "45627387392");
        reader2Details.put("readerTel", "1598372748");
        reader2Details.put("readerEmail", "sauron.white@ainur.com");
        // Adiciona o segundo livro ao bookMap usando o ISBN como chave
        readerMap.put(987654321, reader2Details);
    }
    
        public void addReader(int readerId, String readerName, String readerCpf, String readerTel, String readerEmail) {
        
        // Verifica se o livro já existe pelo ISBN
        if (!readerMap.containsKey(readerId)) {
            // Cria um novo HashMap para armazenar os detalhes do livro
            //String bookisRent = String.valueOf(bookIsRent);
            Map<String, String> bookDetails = new HashMap<>();
            bookDetails.put("readerId", Integer.toString(readerId));
            bookDetails.put("readerName", readerName);
            bookDetails.put("readerCpf", readerCpf);
            bookDetails.put("readerTel", readerTel);
            bookDetails.put("readerEmail", readerEmail);
            // Adiciona o livro ao bookMap usando o ISBN como chave
            readerMap.put(readerId, bookDetails);
            JOptionPane.showMessageDialog(null, "Leitor inserido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Leitor já existe");
        }
    }

    public Map listReaders() {
        return readerMap;
    }
}
