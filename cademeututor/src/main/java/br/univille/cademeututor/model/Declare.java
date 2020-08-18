package br.univille.cademeututor.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.univille.cademeututor.enums.CategoryDeclareType;

@Entity
public class Declare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String description;

    @Column(length = 100)
    private User user;

    //category
    @Column(length = 100)
    private CategoryDeclareType categoryDeclareType;

    //@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    //@JoinColumn(name="sector_id")
    //private Sector sector;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name="street_id")
    private Street street;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name="animal_id")
    private Animal animal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CategoryDeclareType getCategoryDeclareType() {
        return categoryDeclareType;
    }

    public void setCategoryDeclareType(CategoryDeclareType categoryDeclareType) {
        this.categoryDeclareType = categoryDeclareType;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}