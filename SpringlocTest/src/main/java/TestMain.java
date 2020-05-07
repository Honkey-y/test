import com.sun.javaws.ui.ApplicationIconGenerator;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*Lesson lesson = new Lesson();
        lesson.setName("gbf");
        lesson.setId(1);

        Student student = new Student();

        student.setLesson(lesson);

        Lesson lesson1 = student.getLesson();
        lesson1.printLesson();*/
        Student student = (Student) context.getBean("student");
        Lesson lesson = student.getLesson();

        lesson.printLesson();
        System.out.println(student.getName());
    }
}
