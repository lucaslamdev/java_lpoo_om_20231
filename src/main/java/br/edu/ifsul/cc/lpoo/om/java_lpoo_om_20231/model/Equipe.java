package br.edu.ifsul.cc.lpoo.om.java_lpoo_om_20231.model;

import java.util.List;

/**
 *
 * @author lucas
 */
public class Equipe {
    
    private Integer id;
    private String nome;
    private String especialidades;
    private List<Funcionario> funcionarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public Equipe(){
        
    }
    
}
