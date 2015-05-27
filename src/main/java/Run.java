import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Run {

    public static void main(String[] args){
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        applySettings(configuration.getProperties());
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        session.beginTransaction();
        Student student = new Student();
        student.setFirstName("petrov");
        student.setLastName("vetal");
        student.setMark(12);
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

}
