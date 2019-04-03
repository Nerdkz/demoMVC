/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vinicius
 */

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
    
    @GetMapping("/cadastrar")
    public String cadastar(){
        return "/funcionario/cadastro";
    }
    
    @GetMapping("/listar")
    public String listar(){
        return "/funcionario/lista";
    }
    
}
