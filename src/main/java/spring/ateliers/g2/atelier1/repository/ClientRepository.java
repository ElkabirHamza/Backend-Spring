package spring.ateliers.g2.atelier1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.ateliers.g2.atelier1.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>	{

}
