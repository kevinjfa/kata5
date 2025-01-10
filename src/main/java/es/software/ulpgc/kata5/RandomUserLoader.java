package es.software.ulpgc.kata5;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class RandomUserLoader implements UserLoader {
    public JSONObject load() {
        try {
            URL url = new URL("https://randomuser.me/api");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");
            Scanner sc = new Scanner(con.getInputStream());
            String response = sc.useDelimiter("\\A").next();
            JSONObject json = new JSONObject(response);
            JSONArray res = json.getJSONArray("results");
            JSONObject userObject = res.getJSONObject(0);
            return userObject;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
