/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class BookModel {
    
    private Map<Integer, Map<String, String>> bookMap; // HashMap para armazenar livros
    
    public BookModel() {
        this.bookMap = new HashMap<>();
        initializeDatabase(); // Inicializa o bookMap com alguns livros pré-cadastrados
    }
    

    private void initializeDatabase() {
        // Cria um novo HashMap para armazenar os detalhes do livro
        Map<String, String> book1Details = new HashMap<>();
        book1Details.put("bookId", "1");
        book1Details.put("bookTitle", "Senhor dos Anéis: A Sociedade do Anel");
        book1Details.put("bookAuthor", "J.R.R. Tolkien");
        book1Details.put("bookDatePublish", "29/07/1954");
        book1Details.put("bookIsRent", "false");
        // Adiciona o primeiro livro ao bookMap usando o ISBN como chave
        bookMap.put(123456789, book1Details);

        // Cria um novo HashMap para armazenar os detalhes do segundo livro
        Map<String, String> book2Details = new HashMap<>();
        book2Details.put("bookId", "2");
        book2Details.put("bookTitle", "Harry Potter e a Pedra Filosofal");
        book2Details.put("bookAuthor", "J.K. Rowling");
        book2Details.put("bookDatePublish", "26/06/1997");
        book2Details.put("bookIsRent", "false");
        // Adiciona o segundo livro ao bookMap usando o ISBN como chave
        bookMap.put(987654321, book2Details);
    }

    public void addBook(int bookId, int bookIsbn, String bookTitle, String bookAuthor, String bookDatePublish, boolean bookIsRent) {
        
        // Verifica se o livro já existe pelo ISBN
        if (!bookMap.containsKey(bookIsbn)) {
            // Cria um novo HashMap para armazenar os detalhes do livro
            String bookisRent = String.valueOf(bookIsRent);
            Map<String, String> bookDetails = new HashMap<>();
            bookDetails.put("bookId", Integer.toString(bookId));
            bookDetails.put("bookTitle", bookTitle);
            bookDetails.put("bookAuthor", bookAuthor);
            bookDetails.put("bookDatePublish", bookDatePublish);
            bookDetails.put("bookIsRent", bookisRent);
            // Adiciona o livro ao bookMap usando o ISBN como chave
            bookMap.put(bookIsbn, bookDetails);
            JOptionPane.showMessageDialog(null, "Livro inserido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Livro já existe");
        }
    }

    public Map listBook() {
        return bookMap;
    }
}
