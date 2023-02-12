package com.example.SqlRocks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Card {
    @Id
    private int cardno;
    private int fine;
    private int issuedate;



    @OneToOne //telling that it is a one to one association
    @JoinColumn //joint by adding a foreign key to coloumn//by default foreign key is primary key of parent table
    User user;




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


//    public Card() {
//    }
//
//    public Card(int cardno, int fine, int issuedate) {
//        this.cardno = cardno;
//        this.fine = fine;
//        this.issuedate = issuedate;
//    }
//
//    public int getCardno() {
//        return cardno;
//    }

    public void setCardno(int cardno) {
        this.cardno = cardno;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(int issuedate) {
        this.issuedate = issuedate;
    }
}
