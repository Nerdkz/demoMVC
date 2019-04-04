/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.service;

import com.leucotron.curso.boot.demo.domain.Funcionario;
import java.util.List;

/**
 *
 * @author vinicius
 */
public interface FuncionarioService {
    
    void salvar(Funcionario funcionario);
    
    void editar(Funcionario funcionario);
    
    void excluir(Long id);
    
    Funcionario buscarPorId(Long id);
    
    List<Funcionario> buscarTodos();
    
}
