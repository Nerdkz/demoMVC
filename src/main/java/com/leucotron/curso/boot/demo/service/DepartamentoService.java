/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.service;

import com.leucotron.curso.boot.demo.domain.Departamento;
import java.util.List;

/**
 *
 * @author vinicius
 */
public interface DepartamentoService {
    
    void salvar(Departamento departamento);
    
    void editar(Departamento departamento);
    
    void excluir(Long id);
    
    Departamento buscarPorId(Long id);
    
    List<Departamento> buscarTodos();

    boolean departamentoTemCargos(Long id);
}
