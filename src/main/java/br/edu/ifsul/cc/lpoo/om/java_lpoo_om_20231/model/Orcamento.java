package br.edu.ifsul.cc.lpoo.om.java_lpoo_om_20231.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
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

@Entity
@Table(name = "tb_orcamento")
public class Orcamento implements Serializable{
    
    @Id
    private Integer id;
    
    @Column(nullable = false, length = 200)
    private String observacoes;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;
    
    @Column(nullable = false)
    private Cliente cliente;
    
    @Column(nullable = false)
    private Veiculo veiculo;
    
    @Column(nullable = false)
    private List<Peca> peca;
    
    @Column(nullable = false)
    private List<MaoObra> maoObra;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Peca> getPeca() {
        return peca;
    }

    public void setPeca(List<Peca> peca) {
        this.peca = peca;
    }

    public List<MaoObra> getMaoObra() {
        return maoObra;
    }

    public void setMaoObra(List<MaoObra> maoObra) {
        this.maoObra = maoObra;
    }
    
    public Orcamento(){
        
    }
    
}
