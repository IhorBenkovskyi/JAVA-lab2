package Serialize;

import lab2.Employee;
import java.io.*;

public class SerializeTXT {
    public void serialize(Employee obj, File file) throws IOException {
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(obj.toString());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Employee deserialize(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String name = reader.readLine();
            String address = reader.readLine();
            int salary = Integer.parseInt(reader.readLine());
            String position = reader.readLine();
            return new Employee.Builder()
                    .setName(name)
                    .setAddress(address)
                    .setSalary(salary)
                    .setPosition(position)
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
