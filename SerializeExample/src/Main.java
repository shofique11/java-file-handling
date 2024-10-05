import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Shofique", 1001);

        FileOutputStream fileOut = new FileOutputStream("employee.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(employee);
        System.out.println("Object serialized and written to employee.ser");

        FileInputStream fileIn = new FileInputStream("employee.ser");
        ObjectInputStream obIn = new ObjectInputStream(fileIn);
        Employee employee1 = null;
        try {
            employee1 = (Employee) obIn.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deserialized Employee:");
        System.out.println("Employee Name: "+ employee1.name);
        System.out.println("Employee Name: "+ employee1.id);
    }
}