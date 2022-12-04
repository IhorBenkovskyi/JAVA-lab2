package lab2;

import Serialize.SerializeJSON;
import Serialize.SerializeTXT;
import Serialize.SerializeXML;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lab2.Employee;

import java.io.File;

public class Main {
        public static void main(String[] args) throws JsonProcessingException {
            Employee e1 = new Employee.Builder()
                    .setName("Taras")
                    .setAddress("Lviv")
                    .setSalary(1000)
                    .setPosition("Manager").build();

            SerializeTXT serializeTxt = new SerializeTXT();
            SerializeJSON serializeJson = new SerializeJSON();
            SerializeXML serializeXml = new SerializeXML();
            File fTxt = new File("employee.txt");
            File fJson = new File("employee.json");
            File fXml = new File("employee.xml");
            try {
                serializeTxt.serialize(e1, new File(String.valueOf(fTxt)));
                serializeJson.serialize(e1, new File(String.valueOf(fJson)));
                serializeXml.serialize(e1, new File(String.valueOf(fXml)));
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }

            Employee employeeTxt = new Employee();
            Employee employeeJson = new Employee();
            Employee employeeXml = new Employee();

            try {
                employeeTxt = (Employee) serializeTxt.deserialize(fTxt);
                employeeJson = (Employee) serializeJson.deserialize(fJson);
                employeeXml = (Employee) serializeXml.deserialize(fXml);
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }

            System.out.println(employeeTxt);
            System.out.println(employeeJson);
            System.out.println(employeeXml);
        }
}
