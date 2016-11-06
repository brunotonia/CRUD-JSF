package br.com.brunotonia.supertrunfo.dao;

import br.com.brunotonia.supertrunfo.vo.Carro;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class CarroDAO {
    
    public Boolean adicionar(Carro carro) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(carro);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public Boolean editar(Carro carro) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.persist(carro);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public Boolean excluir(Carro carro) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(carro);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List<Carro> listar() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Criteria criteriaCarro = session.createCriteria(Carro.class);
        List<Carro> lista = criteriaCarro.list();
        session.close();
        return lista;
    }
    
    
}
