package br.com.brunotonia.supertrunfo.vo;
// Generated 02/11/2016 21:46:38 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Piloto generated by hbm2java
 */
@Entity
@Table(name = "piloto", schema = "public")
public class Piloto implements java.io.Serializable {

    private Long id;
    private String nome;
    private String pais;
    private Integer titulos;
    private Integer corridas;
    private Integer poles;
    private Integer vitorias;

    public Piloto() {
    }

    public Piloto(Long id, String nome, String pais, Integer titulos, Integer corridas, Integer poles, Integer vitorias) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.titulos = titulos;
        this.corridas = corridas;
        this.poles = poles;
        this.vitorias = vitorias;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "nome", nullable = false, length = 30)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "pais", nullable = false, length = 30)
    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Column(name = "titulos", nullable = false)
    public Integer getTitulos() {
        return this.titulos;
    }

    public void setTitulos(Integer titulos) {
        this.titulos = titulos;
    }

    @Column(name = "corridas", nullable = false)
    public Integer getCorridas() {
        return this.corridas;
    }

    public void setCorridas(Integer corridas) {
        this.corridas = corridas;
    }

    @Column(name = "poles", nullable = false)
    public Integer getPoles() {
        return this.poles;
    }

    public void setPoles(Integer poles) {
        this.poles = poles;
    }

    @Column(name = "vitorias", nullable = false)
    public Integer getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

}
