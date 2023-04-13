package mx.edu.utez.talenting.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.AttributeConverter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StringListConverter implements AttributeConverter<List<String>, String> {
    private final Type listType = new TypeToken<ArrayList<String>>(){}.getType();
    @Override
    public String convertToDatabaseColumn(List<String> list) {
        return new Gson().toJson(list);
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        return new Gson().fromJson(s, listType);
    }
}
