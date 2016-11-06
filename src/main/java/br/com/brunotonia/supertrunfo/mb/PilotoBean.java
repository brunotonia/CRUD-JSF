package br.com.brunotonia.supertrunfo.mb;

import br.com.brunotonia.supertrunfo.dao.PilotoDAO;
import br.com.brunotonia.supertrunfo.vo.Piloto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "pilotoBean")
@ViewScoped
public class PilotoBean implements java.io.Serializable {
    
    private Piloto piloto;
    private List lista;
    private Integer idCarro;
    
    public PilotoBean() {
        this.piloto = new Piloto();
        this.lista = new PilotoDAO().listar();
        this.idCarro = 0;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto carro) {
        this.piloto = carro;
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public Integer getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }
    
    public void preparar(ActionEvent actionEvent) {
        this.piloto = new Piloto();
        this.lista = new PilotoDAO().listar();
    }
    
    public void adicionar(ActionEvent actionEvent) {
        new PilotoDAO().adicionar(piloto);
        preparar(actionEvent);
    }
    
    public void editar(ActionEvent actionEvent) {
        new PilotoDAO().editar(piloto);
        preparar(actionEvent);
    }
    
    public void excluir(ActionEvent actionEvent) {
        new PilotoDAO().excluir(piloto);
        preparar(actionEvent);
    }
    
}
