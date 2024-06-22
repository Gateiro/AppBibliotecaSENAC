/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class Loan {
    private int loanId;
    private int loanPersonId;
    private int loanBookId;
    private String loanDate;
    private String loanReturn;
    List loanList = new ArrayList();

    /**
     * Construtor para a classe Loan.
     * @param loanId o ID do empréstimo.
     * @param loanPersonId o ID da pessoa que fez o empréstimo.
     * @param loanBookId o ID do livro emprestado.
     * @param loanDate a data do empréstimo.
     * @param loanReturn a data de devolução.
     */
    public Loan(int loanId, int loanPersonId, int loanBookId, String loanDate, String loanReturn) {
        this.loanId = loanId;
        this.loanPersonId = loanPersonId;
        this.loanBookId = loanBookId;
        this.loanDate = loanDate;
        this.loanReturn = loanReturn;
    }

    /**
     * Obtém os detalhes do empréstimo como uma lista.
     * @return uma lista contendo os detalhes do empréstimo.
     */
    public List getLoan() {
        loanList.add(this.loanId);
        loanList.add(this.loanPersonId);
        loanList.add(this.loanBookId);
        loanList.add(this.loanDate);
        loanList.add(this.loanReturn);

        return loanList;
    }
}
