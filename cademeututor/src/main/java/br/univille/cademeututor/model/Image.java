package br.univille.cademeututor.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String externalPath;

    @Column(length = 100)
    private String externalRepository;

    @OneToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
    private Declare declare;

    public String getExternalPath() {
        return externalPath;
    }

    public void setExternalPath(String externalPath) {
        this.externalPath = externalPath;
    }

    public String getExternalRepository() {
        return externalRepository;
    }

    public void setExternalRepository(String externalRepository) {
        this.externalRepository = externalRepository;
    }

    public Declare getDeclare() {
        return declare;
    }

    public void setDeclare(Declare declare) {
        this.declare = declare;
    }
}