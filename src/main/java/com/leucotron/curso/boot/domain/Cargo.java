/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author vinicius
 */

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {
    
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
