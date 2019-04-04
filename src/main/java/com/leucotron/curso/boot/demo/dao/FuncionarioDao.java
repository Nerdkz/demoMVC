/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.dao;

import com.leucotron.curso.boot.demo.domain.Funcionario;
import java.util.List;

/**
 *
 * @author vinicius
 */
public interface FuncionarioDao {
    
    void save(Funcionario funcionario);
    
    void update(Funcionario funcionario);
    
    void delete(Long id);
    
    Funcionario findById(Long id);
    
    List<Funcionario> findAll();
}
