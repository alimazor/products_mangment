package com.products_managment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Product implements Serializable {

    //Declaration des variables
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;
    private String referenceProduct;
    private String libelleProduct;
    private String descriptionProduct;
    private Integer quantiteProduct;
    private Double priceProduct;


    public Product(){
        super();
    }

    public Product(String referenceProduct, String libelleProduct, String descriptionProduct, Integer quantiteProduct, Double priceProduct) {
        this.referenceProduct = referenceProduct;
        this.libelleProduct = libelleProduct;
        this.descriptionProduct = descriptionProduct;
        this.quantiteProduct = quantiteProduct;
        this.priceProduct = priceProduct;
    }


    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getReferenceProduct() {
        return referenceProduct;
    }

    public void setReferenceProduct(String referenceProduct) {
        this.referenceProduct = referenceProduct;
    }

    public String getLibelleProduct() {
        return libelleProduct;
    }

    public void setLibelleProduct(String libelleProduct) {
        this.libelleProduct = libelleProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public Integer getQuantiteProduct() {
        return quantiteProduct;
    }

    public void setQuantiteProduct(Integer quantiteProduct) {
        this.quantiteProduct = quantiteProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }
}
