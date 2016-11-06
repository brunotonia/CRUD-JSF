package br.com.brunotonia.supertrunfo.dao;

import br.com.brunotonia.supertrunfo.vo.Piloto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class PilotoDAO {
    
    public Boolean adicionar(Piloto piloto) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(piloto);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public Boolean editar(Piloto piloto) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.persist(piloto);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public Boolean excluir(Piloto piloto) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(piloto);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List<Piloto> listar() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Criteria criteriaCarro = session.createCriteria(Piloto.class);
        List<Piloto> lista = criteriaCarro.list();
        session.close();
        return lista;
    }
    
    
}
