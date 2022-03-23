package br.com.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pedidos.domain.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
