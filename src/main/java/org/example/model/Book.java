package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "TB_TABLE")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;


    @Column(name = "GENRE")
    private String genre;

    @Column(name = "TITLE")
    private String title;



    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
