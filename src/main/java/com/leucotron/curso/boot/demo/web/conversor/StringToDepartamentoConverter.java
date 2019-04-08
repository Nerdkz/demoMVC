/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.web.conversor;

import com.leucotron.curso.boot.demo.domain.Departamento;
import com.leucotron.curso.boot.demo.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author vinicius
 */

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {

    @Autowired
    private DepartamentoService service;
    
    @Override
    public Departamento convert(String text) {
        
        if(text.isEmpty()){
            
            return null;
        }
        
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }
    
}
