package br.com.bibliotecasaber.sistemagestaobiblioteca.DTOs;

import br.com.bibliotecasaber.sistemagestaobiblioteca.entities.Address;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

public record CreateCustomerDTO(
        @NotBlank(message = "First name is mandatory")
        String firstName,
        @NotBlank(message = "Last name is mandatory")
        String lastName,
        @Email(message = "Email is not valid")
        String email,
        @NotBlank(message = "Address is mandatory")
        List<Address> addresses
) {

}
