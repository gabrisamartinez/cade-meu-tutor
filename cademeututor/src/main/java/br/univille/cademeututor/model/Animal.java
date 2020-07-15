package br.univille.cademeututor.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 1000)
    private String name;

    @Column(length = 4)
    private int age;
    @Column(length = 100)
    private String color;

    @Column(length = 5)
    private Boolean hurt;

    @Column(length = 5)
    private Boolean identification;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="animal_kind_id")
    private AnimalKind animalKind;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getHurt() {
        return hurt;
    }

    public void setHurt(Boolean hurt) {
        this.hurt = hurt;
    }

    public Boolean getIdentification() {
        return identification;
    }

    public void setIdentification(Boolean identification) {
        this.identification = identification;
    }

    public AnimalKind getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(AnimalKind animalKind) {
        this.animalKind = animalKind;
    }

    
}