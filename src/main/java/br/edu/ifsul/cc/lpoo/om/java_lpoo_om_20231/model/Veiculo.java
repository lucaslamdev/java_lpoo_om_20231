package br.edu.ifsul.cc.lpoo.om.java_lpoo_om_20231.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lucas
 */
@Entity//indica que a classe Veiculo será gerenciada pelo jpa/hibernate.
@Table(name = "tb_veiculo")//define o fomarto do armazenamento (em tabela).
public class Veiculo implements Serializable{ //implementa seriazable para armazenar os dados em instancia (cache)
    @Id//definicao do atributo que será a achave primária (todos @ obtem o primeiro dado/variavel/classe após o mesmo)
    private String placa;
    
    @Column(nullable = false, length = 100)//nullable (preenchimento obrigatório, tamanho 100)
    private String modelo;
    
    @Column(nullable = false)//coluna obrigatoria
    private Integer ano;
    
    @Column(nullable = true)//coluna não obrigatória
    @Temporal(TemporalType.TIMESTAMP)//precisao da data
    private Calendar data_ultimo_servico;

    public Calendar getData_ultimo_servico() {
        return data_ultimo_servico;
    }

    public void setData_ultimo_servico(Calendar data_ultimo_servico) {
        this.data_ultimo_servico = data_ultimo_servico;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    
    public Veiculo(){
        
    }
    
}
