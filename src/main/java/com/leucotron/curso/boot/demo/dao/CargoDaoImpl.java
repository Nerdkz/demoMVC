/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.demo.dao;

import com.leucotron.curso.boot.demo.domain.Cargo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vinicius
 */

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
