package Modules;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PayloadManager {

    private Auth auth;

    public String createPayload() {
        auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String payload = objectMapper.writeValueAsString(auth);
            System.out.println(payload);
            return payload;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
