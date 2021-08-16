package com.udacity.bootstrap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private  String address;
    private String name;

    public Location(){

    }

    public Location(Long id, String address, String  name){
        this.id= id;
        this.name= name;
        this.address= address;
    }

    public  Location(String address, String name){
        this.address= address;
        this.name= name;
    }


    public void setName(String name){
        this.name= name;
    }

    public void setAddress(String address){
        this.address= address;
    }


    public String getAddress(){
        return  this.address;
    }
    public String getName(){
        return this.name;
    }
    public Long getId() {
        return id;
    }

    public  void setId(Long id){
        this.id= id;
    }

}
