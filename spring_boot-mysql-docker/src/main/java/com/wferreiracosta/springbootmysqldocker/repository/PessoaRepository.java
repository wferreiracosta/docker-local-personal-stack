package com.wferreiracosta.springbootmysqldocker.repository;

import com.wferreiracosta.springbootmysqldocker.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
  
}
