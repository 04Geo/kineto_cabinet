package org.sda.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.sda.entities.*;

import java.util.Properties;

public class HibernateUtils {
    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/kinetocabinet";
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "GCozmaRoot";

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration myConfiguration = new Configuration();
            Properties settings = new Properties();
            settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            settings.put(Environment.URL, DATABASE_HOST);
            settings.put(Environment.USER, DATABASE_USERNAME);
            settings.put(Environment.PASS, DATABASE_PASSWORD);
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            settings.put(Environment.SHOW_SQL, "false");
            myConfiguration.setProperties(settings);
            myConfiguration.addAnnotatedClass(Pacient.class);
            myConfiguration.addAnnotatedClass(Angajat.class);
            myConfiguration.addAnnotatedClass(Medic.class);
            myConfiguration.addAnnotatedClass(Abonament.class);
            myConfiguration.addAnnotatedClass(Specializare.class);
            myConfiguration.addAnnotatedClass(Diagnostic.class);
            myConfiguration.addAnnotatedClass(FisaPacient.class);
            myConfiguration.addAnnotatedClass(InregistrareAbonament.class);
            myConfiguration.addAnnotatedClass(Programare.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(myConfiguration.getProperties()).build();
            sessionFactory = myConfiguration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }


}
