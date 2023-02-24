package br.edu.ifsul.cc.lpoo.om.java_lpoo_om_20231.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
public abstract class Pessoa implements Serializable {
    
    @Id
    private String cpf;
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = false, length = 20)
    private String senha;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_nacimento;
    
    @Column(nullable = false, length = 8)
    private String cep;
    
    @Column(nullable = false, length = 50)
    private String complemento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getData_nacimento() {
        return data_nacimento;
    }

    public void setData_nacimento(Calendar data_nacimento) {
        this.data_nacimento = data_nacimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public Pessoa(){
        
    }
}
