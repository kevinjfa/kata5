package es.software.ulpgc.kata5;

import org.json.JSONObject;

import java.sql.Date;

public class RandomUserAdapter implements UserAdapter {
    public User adapt(JSONObject user) {
        String name = user.getJSONObject("name").getString("first");
        String surname = user.getJSONObject("name").getString("last");
        Date date = Date.valueOf(user.getJSONObject("dob").getString("date").split("T")[0]);
        String email = user.getString("email");
        return new User(name, surname, date, email);
    }
}
