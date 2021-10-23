package com.microtabela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microtabela.model.TabelaModel;

public interface TabelaRepository extends JpaRepository<TabelaModel, Long> {

}
