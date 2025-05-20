package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.security.SecureRandom;
import java.util.Objects;
import jakarta.persistence.Entity;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @Column(name = "game_year")
    private int year;
    private String ganre;
    private  String platform;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescripition;

    public Game(){
    }

    public Game(long id, String title, int year, String ganre, String platform, Double score, String imgUrl, String shortDescription, String longDescripition) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.ganre = ganre;
        this.platform = platform;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescripition = longDescripition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGanre() {
        return ganre;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescripition() {
        return longDescripition;
    }

    public void setLongDescripition(String longDescripition) {
        this.longDescripition = longDescripition;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Game other = (Game) obj;
        return Objects.equals(id, other.id);

    }
}
