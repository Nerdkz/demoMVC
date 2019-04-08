/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.web.controller;

import com.leucotron.curso.boot.demo.domain.Departamento;
import com.leucotron.curso.boot.demo.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sun.font.AttributeValues;

/**
 *
 * @author vinicius
 */

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
    
    @Autowired
    private DepartamentoService service;
    
    @GetMapping("/cadastrar")
    public String cadastar(Departamento departamento){
        return "/departamento/cadastro";
    }
    
    @GetMapping("/listar")
    public String listar(ModelMap model){
        
        model.addAttribute("departamentos", service.buscarTodos());
        return "/departamento/lista";
    }
    
    @PostMapping("/salvar")
    public String salvar(Departamento departamento, RedirectAttributes attr){
        
        service.salvar(departamento);
        attr.addFlashAttribute("success", "Departamento inserido com sucesso.");
        return "redirect:/departamentos/cadastrar";
    }
    
    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model){
        
        model.addAttribute("departamento", service.buscarPorId(id));
        return "/departamento/cadastro";
    }
    
    @PostMapping("/editar")
    public String editar(Departamento departamento, RedirectAttributes attr){
    
        service.editar(departamento);
        attr.addFlashAttribute("success", "Departamento editado com sucesso.");
        return "redirect:/departamentos/cadastrar";
    }
    
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, ModelMap model){
        
        if(service.departamentoTemCargos(id)){
            
            model.addAttribute("fail", "Departamento não removido. Possui cargo(s) vinculado(s)." );
        }
        
        else{
            
            service.excluir(id);
            model.addAttribute("success", "Departamento excluído com sucesso.");
        }
        
        return listar(model);
    }
}
