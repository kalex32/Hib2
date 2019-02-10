package net.lukashik.hibernate;

import net.lukashik.hibernate.dao.DeveloperDAO;
import net.lukashik.hibernate.dao.hibernate.HibernateDeveloperDaoImpl;
import net.lukashik.hibernate.model.Developer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeveloperRunner {


//    public static SessionFactory sessionFactory = null;
////
////    public static void main(String[] args) {
////
////        sessionFactory = new Configuration().configure().buildSessionFactory();
////
////
//////        System.out.println("Developers");
//////        System.out.println(developers);
////
////        DeveloperRunner developerRunner = new DeveloperRunner();
////
////
////        System.out.println("Adding Developers");
////
////        developerRunner.addDeveloper("Vasa", "Pupkin", "Java", 3);
////        developerRunner.addDeveloper("Masa", "Pupkin", "C++", 2);
////        developerRunner.addDeveloper("Basa", "Pupkin", "PHP", 1);
////
////
////        System.out.println("Список разработчиков");
////
////
////        List<Developer> developers = developerRunner.listDevelopers();
////
////        for (Developer developer: developers){
////            System.out.println(developer);
////        }
////
////        developerRunner.updateDeveloper(2, 10);
////        developerRunner.removeDeveloper(4);
////
////
////        developers = developerRunner.listDevelopers();
////        for (Developer developer: developers){
////            System.out.println(developer);
////        }
////
////
////    }
////
////    public  List<Developer> listDevelopers() {
////        Session session = sessionFactory.openSession();
////        Transaction transaction = null;
////        transaction = session.beginTransaction();
////
////        List<Developer> result = session.createQuery("FROM Developer").list();
////
////        transaction.commit();
////        session.close();
////        return result;
////    }
////
////    public void addDeveloper(String firstName, String lastName, String specialty, int ex) {
////        Session session = sessionFactory.openSession();
////        Transaction transaction = null;
////        transaction = session.beginTransaction();
////
////        Developer developer = new Developer(firstName, lastName, specialty, ex);
////
////        session.save(developer);
////        transaction.commit();
////        session.close();
////    }
////
////    public void updateDeveloper(int id, int ex) {
////        Session session = sessionFactory.openSession();
////        Transaction transaction = null;
////        transaction = session.beginTransaction();
////
////        Developer developer = session.get(Developer.class, id);
////        developer.setExperience(ex);
////
////        session.update(developer);
////
////        transaction.commit();
////        session.close();
////    }
////
////    public void removeDeveloper(int id) {
////        Session session = sessionFactory.openSession();
////        Transaction transaction = null;
////        transaction = session.beginTransaction();
////
////        Developer developer = session.get(Developer.class, id);
////
////        session.delete(developer);
////
////        transaction.commit();
////        session.close();
////    }

    public static void main(String[] args) {
        DeveloperDAO developerDAO = new HibernateDeveloperDaoImpl();
        List<Developer>developers = (List<Developer>) developerDAO.getAll();
        System.out.println(developers);

        Developer developer = ((HibernateDeveloperDaoImpl) developerDAO).getByID(2);

        System.out.println(developer);



    }


}
