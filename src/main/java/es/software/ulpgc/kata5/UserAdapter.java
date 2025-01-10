package es.software.ulpgc.kata5;

import org.json.JSONObject;

public interface UserAdapter {
    User adapt(JSONObject o);
}
