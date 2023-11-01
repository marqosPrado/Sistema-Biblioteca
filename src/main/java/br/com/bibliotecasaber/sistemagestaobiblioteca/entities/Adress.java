package br.com.bibliotecasaber.sistemagestaobiblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "adress")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "adress_id")
    private String addresId;
    private String street;
    private String neighborhood;
    private String number;
    private String complement;
    @Column(name = "zip_code")
    private String zipCode;
    private String city;

    public Adress(String street, String neighborhood,
                  String number, String complement, String zipCode, String city) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
        this.complement = complement;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Adress() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
