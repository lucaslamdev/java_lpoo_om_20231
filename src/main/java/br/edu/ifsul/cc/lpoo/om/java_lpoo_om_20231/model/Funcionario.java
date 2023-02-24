package br.edu.ifsul.cc.lpoo.om.java_lpoo_om_20231.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;


/**
 *
 * @author lucas
 */
@Entity
@DiscriminatorValue("F")
public class Funcionario extends Pessoa{
    
    private String numero_ctps;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_admissao;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_demissao;
    
    @Column(nullable = false)
    private Cargo cargo;

    @ManyToMany
    @JoinTable(name = "tb_funcionario_curso", 
            joinColumns = {
                @JoinColumn(name = "pessoa_cpf")}, //agregacao, vai gerar uma tabela associativa.
            inverseJoinColumns = {
                @JoinColumn(name = "curso_id")})
    private List<Curso> cursos;

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Calendar data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Calendar getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Calendar data_demissao) {
        this.data_demissao = data_demissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public Funcionario(){
        
    }
    
}
