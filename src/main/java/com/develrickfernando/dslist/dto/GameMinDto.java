package com.develrickfernando.dslist.dto;



import com.develrickfernando.dslist.entities.Game;

import java.util.Objects;

public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String  imgUrl;
    private String shortDescription;

    public GameMinDto(){}


    public GameMinDto(Game game){
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
    }



    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public Integer getYear(){
        return year;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    public String getImgUrl(){
        return imgUrl;
    }

    public void setImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
    }

    public String getShortDescription(){
        return shortDescription;
    }

    public void setShortDescription(String shortDescription){
        this.shortDescription = shortDescription;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if(obj == this) return true;
        if (this.getClass() != obj.getClass()) return false;
        GameMinDto gameDto = (GameMinDto) obj;
        if (id.equals(gameDto.getId())) return true;
        return false;
    }
}
