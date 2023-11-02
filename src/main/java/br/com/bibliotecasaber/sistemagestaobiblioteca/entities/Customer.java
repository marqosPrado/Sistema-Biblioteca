package br.com.bibliotecasaber.sistemagestaobiblioteca.entities;

import br.com.bibliotecasaber.sistemagestaobiblioteca.DTOs.CreateCustomerDTO;
import br.com.bibliotecasaber.sistemagestaobiblioteca.enums.Role;
import br.com.bibliotecasaber.sistemagestaobiblioteca.enums.Status;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private Role role;

    public Customer(String firstName, String lastName, String email,
                    List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addresses = addresses;
        this.status = Status.ACTIVE;
        this.role = Role.NORMAL_USER;
    }

    public Customer(CreateCustomerDTO customer) {
        setFirstName(customer.firstName());
        setLastName(customer.lastName());
        setEmail(customer.email());
        setAddresses(customer.addresses());
    }

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
