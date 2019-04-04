/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.dao;


import com.leucotron.curso.boot.demo.domain.Cargo;
import java.util.List;

/**
 *
 * @author vinicius
 */
public interface CargoDao {
    void save(Cargo cargo);
    
    void update(Cargo cargo);
    
    void delete(Long id);
    
    Cargo findById(Long id);
    
    List<Cargo> findAll();
}
