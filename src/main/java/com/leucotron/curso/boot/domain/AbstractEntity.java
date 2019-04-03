/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.curso.boot.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author vinicius
 */

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {  
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractEntity<?> other = (AbstractEntity<?>) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id =" + id;
    }
    
}
