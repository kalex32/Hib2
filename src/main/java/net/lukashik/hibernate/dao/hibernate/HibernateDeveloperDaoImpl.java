package net.lukashik.hibernate.dao.hibernate;

import net.lukashik.hibernate.dao.DeveloperDAO;
import net.lukashik.hibernate.model.Developer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Collection;
import java.util.List;

public class HibernateDeveloperDaoImpl implements DeveloperDAO {

    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    @Override
    public Collection<Developer> getAll() {
        Session session = sessionFactory.openSession();
        List<Developer> result = session.createQuery("FROM Developer").list();
        session.close();
        return result;
    }

    @Override
    public void save(Developer developer) {
        Session session = sessionFactory.openSession();
        session.save(developer);
        session.close();
    }

    @Override
    public void update(Developer developer) {
        Session session = sessionFactory.openSession();
        session.merge(developer);
        session.close();
    }

    @Override
    public void delete(Developer developer) {
        Session session = sessionFactory.openSession();
        session.delete(developer);
        session.close();
    }

    @Override
    public Developer getByID(Integer id) {
        Developer developer;
        Session session = sessionFactory.openSession();
        developer = session.get(Developer.class, id);

        return developer;
    }
}
