/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.service;

import com.leucotron.curso.boot.demo.dao.CargoDao;
import com.leucotron.curso.boot.demo.domain.Cargo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vinicius
 */

@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService{
    
    
    @Autowired
    private CargoDao dao;
    
    

    @Override
    public void salvar(Cargo cargo) {
        
        dao.save(cargo);
    }

    @Override
    public void editar(Cargo cargo) {
        
        dao.update(cargo);
    }

    @Override
    public void excluir(Long id) {
        
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Cargo buscarPorId(Long id) {
        
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Cargo> buscarTodos() {

        return dao.findAll();
    }

    @Override
    public boolean cargoTemFuncionarios(Long id) {
        
        if(buscarPorId(id).getFuncionarios().isEmpty()){
            return false;
        }
        
        return true;
    }
    
}
