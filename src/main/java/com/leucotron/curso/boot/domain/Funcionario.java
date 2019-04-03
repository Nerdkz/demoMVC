/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 *
 * @author vinicius
 */

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long>{
    
    @Column(nullable = false, unique = true)
    private String nome;
    
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;
    
    @Column(name = "data_entrada", nullable = false, unique = true)
    private LocalDate dataEntrada;
}
