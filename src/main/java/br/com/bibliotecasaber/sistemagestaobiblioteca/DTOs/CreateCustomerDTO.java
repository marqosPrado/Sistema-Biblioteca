package br.com.bibliotecasaber.sistemagestaobiblioteca.DTOs;

import br.com.bibliotecasaber.sistemagestaobiblioteca.entities.Address;

import java.util.List;

public record CreateCustomerDTO(String firstName, String lastName, String email, List<Address> addresses) {
}
