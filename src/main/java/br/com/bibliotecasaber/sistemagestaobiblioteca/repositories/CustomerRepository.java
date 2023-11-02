package br.com.bibliotecasaber.sistemagestaobiblioteca.repositories;

import br.com.bibliotecasaber.sistemagestaobiblioteca.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
