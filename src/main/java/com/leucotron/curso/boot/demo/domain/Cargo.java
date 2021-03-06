/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.domain;

import java.util.List;
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
    
    @OneToMany(mappedBy = "cargo") // Lado (cargo) é o lado fraco da tabela.
    private List<Funcionario> funcionarios;

    
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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
}
