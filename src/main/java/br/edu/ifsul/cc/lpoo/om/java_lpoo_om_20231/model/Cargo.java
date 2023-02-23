
package br.edu.ifsul.cc.lpoo.om.java_lpoo_om_20231.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "tb_cargo")
public class Cargo implements Serializable{
    
    @Id
    private Integer id;
    @Column(nullable = false, length = 300)
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
            
    public Cargo(){
        
    }
}
