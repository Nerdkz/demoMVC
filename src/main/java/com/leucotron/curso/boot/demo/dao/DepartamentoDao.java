/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.dao;

import com.leucotron.curso.boot.demo.domain.Departamento;
import java.util.List;

/**
 *
 * @author vinicius
 */

public interface DepartamentoDao {
    
    void save(Departamento departamento);
    
    void update(Departamento departamento);
    
    void delete(Long id);
    
    Departamento findById(Long id);
    
    List<Departamento> findAll();
}
