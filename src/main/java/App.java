import generator.BeanFactory;
import generator.CustomInstantiationException;
import generator.FieldGenerator;

public class App {
    public static void main( String[] args ) throws CustomInstantiationException {
        BeanFactory<Patient> studentBeanFactory = new BeanFactory<>(Patient.class);
        Patient patient = patientBeanFactory.createObject();
        FieldGenerator<Patient> fieldGeneratorStudent = new FieldGenerator<>(patient);
        fieldGeneratorStudent.execute();
        System.out.println(patient);
        BeanFactory<Cat> patientBeanFactory = new BeanFactory<>(Cat.class);
        Cat cat = catBeanFactory.createObject();
        FieldGenerator<Cat> fieldGeneratorPatient = new FieldGenerator<>(Cat);
        fieldGeneratorPatient.execute();
        System.out.println(cat);
    }
}
