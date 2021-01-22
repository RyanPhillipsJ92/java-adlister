package models;

import java.util.Date;

public class Quote {

    private long idNo;
    private Author author;
    private String content;

    public Quote(){}

    public long getIdNo() {
        return idNo;
    }

    public void setIdNo(long idNo) {
        this.idNo = idNo;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
