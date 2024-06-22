/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.Book;
import java.util.Map;
import model.BookModel;

/**
 *
 * @author william.ogibram
 */
public class BookController {
        private Book book = new Book();
        BookModel createBook = new BookModel();
    
    public BookController() {
        //createBook.addBook(bookId, bookIsbn, bookTitle, bookAythor, bookDatePublish);
        //createBook.addBook(bookId, bookIsbn, bookTitle, bookAythor, bookDatePublish);
    }

    public void addBook(int bookId, int bookIsbn, String bookTitle, String bookAuthor, String bookDatePublish, boolean bookIsRent)
    {
        book.setBookId(bookId);
        book.setIsbnId(bookIsbn);
        book.setBookTitle(bookTitle);
        book.setBookAuthor(bookAuthor);
        book.setBookDatePublish(bookDatePublish);
        book.setBookIsRent(bookIsRent);
        
        
        
        createBook.addBook(book.getBookId(), book.getIsbnId(), book.getBookTitle(), book.getBookAuthor(), book.getBookDatePublish(), book.getBookIsRent());
                
    }
    
    public Map listBook()
    {
        return createBook.listBook();
    }
}
