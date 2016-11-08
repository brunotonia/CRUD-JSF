package br.com.brunotonia.supertrunfo.dao;

import br.com.brunotonia.supertrunfo.vo.Carro;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

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
        catch(HibernateException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public Boolean editar(Carro carro) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(carro);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(HibernateException e) {
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
        catch(HibernateException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List<Carro> listar() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Criteria criteriaCarro = session.createCriteria(Carro.class).addOrder(Order.asc("id"));
        List<Carro> lista = criteriaCarro.list();
        session.close();
        return lista;
    }
    
    
}
