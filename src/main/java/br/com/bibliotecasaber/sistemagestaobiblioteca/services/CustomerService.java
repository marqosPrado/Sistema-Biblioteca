package br.com.bibliotecasaber.sistemagestaobiblioteca.services;

import br.com.bibliotecasaber.sistemagestaobiblioteca.repositories.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
