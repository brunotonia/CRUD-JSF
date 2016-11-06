package br.com.brunotonia.supertrunfo.mb;

import br.com.brunotonia.supertrunfo.dao.CarroDAO;
import br.com.brunotonia.supertrunfo.vo.Carro;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "carroBean")
@ViewScoped
public class CarroBean implements java.io.Serializable {
    
    private Carro carro;
    private List lista;
    private Integer idCarro;
    
    public CarroBean() {
        this.carro = new Carro();
        this.lista = new CarroDAO().listar();
        this.idCarro = 0;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
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
        this.carro = new Carro();
        this.lista = new CarroDAO().listar();
    }
    
    public void adicionar(ActionEvent actionEvent) {
        carro.setImagem(" ");
        new CarroDAO().adicionar(carro);
        preparar(actionEvent);
    }
    
    public void editar(ActionEvent actionEvent) {
        new CarroDAO().editar(carro);
        preparar(actionEvent);
    }
    
    public void excluir(ActionEvent actionEvent) {
        new CarroDAO().excluir(carro);
        preparar(actionEvent);
    }
    
}
