package br.univille.cademeututor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.cademeututor.model.UserMember;

public interface UserRepository extends JpaRepository<UserMember, Long> {
    UserMember findByName(String name);
    UserMember findByNameAndPassword(String name, String password);
}
