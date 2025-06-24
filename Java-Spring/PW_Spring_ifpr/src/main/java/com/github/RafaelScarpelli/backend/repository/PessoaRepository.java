package com.github.RafaelScarpelli.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.RafaelScarpelli.backend.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}