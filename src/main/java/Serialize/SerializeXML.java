package Serialize;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import lab2.Employee;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeXML {
    XmlMapper mapper;

    public SerializeXML() {
        mapper = new XmlMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public void serialize(Employee obj, File file) throws IOException {
        try {
            mapper.writeValue(file, obj);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Employee deserialize(File file) throws RuntimeException {
        try {
            return mapper.readValue(file, Employee.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
