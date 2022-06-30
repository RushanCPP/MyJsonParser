package com.company;


import MJP.parser.JsonParser;
import MJP.parser.ParserException;
import MJP.values.JsonArrayValue;
import MJP.values.JsonValue;

public class Main {
    public static void main(String[] args) {
        String json = "[\"Hello, World!\", \"Hello, World!\", \"Hello, World!\"]";
        JsonParser parser = new JsonParser();
        parser.eat(json);
        try {
            JsonValue value = parser.parse();
            JsonArrayValue arrayValue = (JsonArrayValue) value;
            System.out.println(arrayValue.getValue().get(0));
        } catch (ParserException e) {
            e.printStackTrace();
        }
    }

}