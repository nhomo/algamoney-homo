package com.nhomo.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhomo.algamoney.model.Lancamento;
import com.nhomo.algamoney.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
