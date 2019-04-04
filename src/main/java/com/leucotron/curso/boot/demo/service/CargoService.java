/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.service;

import com.leucotron.curso.boot.demo.domain.Cargo;
import java.util.List;

/**
 *
 * @author vinicius
 */
public interface CargoService {
    
    void salvar(Cargo cargo);
    
    void editar(Cargo cargo);
    
    void excluir(Long id);
    
    Cargo buscarPorId(Long id);
    
    List<Cargo> buscarTodos();
}
