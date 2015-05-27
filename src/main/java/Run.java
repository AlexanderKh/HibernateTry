import entity.Exam;
import entity.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Run {

    public static void main(String[] args){
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        applySettings(configuration.getProperties());
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(Student.class);
        List<Student> studentList = criteria.list();
        for (Student student : studentList){
            System.out.println(student.toString());
            float sum = 0;
            for (Exam exam : student.getExams()){
                System.out.println(exam);
                sum += exam.getMark();
            }
            sum = sum / student.getExams().size();
            System.out.println("Average mark: " + sum);
            System.out.println("------------");
        }
        session.close();
        factory.close();
    }
}
