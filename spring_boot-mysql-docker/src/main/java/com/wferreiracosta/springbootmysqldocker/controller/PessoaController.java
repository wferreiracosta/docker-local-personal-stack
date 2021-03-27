package com.wferreiracosta.springbootmysqldocker.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.wferreiracosta.springbootmysqldocker.controller.dto.PessoaDTO;
import com.wferreiracosta.springbootmysqldocker.model.Pessoa;
import com.wferreiracosta.springbootmysqldocker.repository.PessoaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

  private final PessoaRepository pessoaRepository;

  public PessoaController(PessoaRepository pessoaRepository) {
    this.pessoaRepository = pessoaRepository;
  }

  @GetMapping("/")
  public List<PessoaDTO> findAll() {
    List<Pessoa> pessoas = this.pessoaRepository.findAll();
    return pessoas
      .stream()
      .map((p) -> PessoaDTO.converter(p))
      .collect(Collectors.toList());
  }

  @GetMapping("/helloworld")
  public String helloWorld() {
    return "Hello World";
  }

}
