package com.IanFund.java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathbot
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    
    public void Book(){
        
    }
    public void Book(String title, String author, String isbn){
        this.title = title;
        this.author=author;
        this.isbn= isbn;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getIsbn(){
        return this.isbn;
    }
    @Override
    public String toString(){
        return title;
    }
}
