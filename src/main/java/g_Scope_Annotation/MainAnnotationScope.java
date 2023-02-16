package g_Scope_Annotation;

import com.example.spring_core.items_and_objects.annotaion.StudentAnnotation;
import com.example.spring_core.items_and_objects.annotaion.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotationScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Scope_annotation/applicationContextScope.xml");

        //Singletone
        StudentAnnotation student = context.getBean("student",StudentAnnotation.class);
        StudentAnnotation student2 = context.getBean("student",StudentAnnotation.class);
        System.out.println(student == student2);
        System.out.println(student);
        System.out.println(student2);

        //Scope Prototype
        Teacher teacher = context.getBean("teacher", Teacher.class);
        Teacher teacher2 = context.getBean("teacher", Teacher.class);
        System.out.println(teacher == teacher2);
        System.out.println(teacher);
        System.out.println(teacher2);

    }
}
