package com.nhomo.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhomo.algamoney.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
