/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.service;

import com.leucotron.curso.boot.demo.dao.FuncionarioDao;
import com.leucotron.curso.boot.demo.domain.Funcionario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vinicius
 */

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService{
    
    @Autowired
    private FuncionarioDao dao;
    
    @Transactional(readOnly = false)
    @Override
    public void salvar(Funcionario funcionario) {
        
        dao.save(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Funcionario funcionario) {
        
        dao.update(funcionario);
    }
    
    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        
        dao.delete(id);
    }
    
    @Override
    public Funcionario buscarPorId(Long id) {

        return dao.findById(id);
    }
    
    @Override
    public List<Funcionario> buscarTodos() {

        return dao.findAll();
    }
    
}
