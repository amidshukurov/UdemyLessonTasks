package jsontoxml;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;


public class JsonToXml {
    public void addFieldNameToYaml(@NotNull StringBuilder yaml, String fieldName,

                                   int depth, boolean isFirstInArray) {

        if (yaml.length() > 0) {

            yaml.append("\n");

            int requiredDepth = (isFirstInArray) ? depth - 1 : depth;

            for (int i = 0; i < requiredDepth; i++) {

                yaml.append("  ");

            }

            if (isFirstInArray) {

                yaml.append("- ");

            }

        }

        yaml.append(fieldName);

        yaml.append(": ");

    }



    public void appendNodeToYaml(@NotNull JsonNode node, StringBuilder yaml, int depth,

                                 boolean isArrayItem) {

        Iterator<Map.Entry<String, JsonNode>> fields = node.getFields();

        boolean isFirst = true;

        while (fields.hasNext()) {

            Map.Entry<String, JsonNode> jsonField = fields.next();

            addFieldNameToYaml(yaml, jsonField.getKey(), depth, isArrayItem

                    && isFirst);

            processNode(jsonField.getValue(), yaml, depth + 1);

            isFirst = false;

        }



    }



    public void processNode(@NotNull JsonNode jsonNode, StringBuilder yaml, int depth) {

        if (jsonNode.isValueNode()) {

            yaml.append(jsonNode.asText());

        } else if (jsonNode.isArray()) {

            for (JsonNode arrayItem : jsonNode) {

                appendNodeToYaml(arrayItem, yaml, depth, true);

            }

        } else if (jsonNode.isObject()) {

            appendNodeToYaml(jsonNode, yaml, depth, false);

        }

    }



    public static void main(String[] args) {
        System.out.println("AMid");

        ObjectMapper mapper = new ObjectMapper();

        // String json = "{\"name\":\"mkyong\", \"age\":\"37\"}";



        try {



            // convert JSON string to Map

            // Map<String, String> map = mapper.readValue("D:\\input\\in1.json",

            // Map.class);



            // HashMap<String,Object> result =

            // mapper.readValue("D:\\input\\in1", HashMap.class);

            Map<String, Object> carMap = mapper.readValue(new File(

                            "C:\\Users\\User\\Desktop\\json.json"),

                    new TypeReference<Map<String, Object>>() {

                    });



            JsonNode actualObj = mapper.readTree("C:\\Users\\User\\Desktop\\json.json");



            System.out.println(carMap.get("verifiableCredential"));

            // it works

            // Map<String, String> map = mapper.readValue(json, new

            // TypeReference<Map<String, String>>() {});



            // System.out.println(map);



        } catch (IOException e) {

            e.printStackTrace();

        }



    }
}
