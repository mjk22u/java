package simpleTest.simPleTest;

import com.google.gson.JsonObject;

public class AppTest {
    public static JsonObject main(JsonObject args) {
        String name = "World";
        String place = "Naver";
        if (args.has("name"))
            name = args.getAsJsonPrimitive("name").getAsString();
        if (args.has("place")) {
			place = args.getAsJsonPrimitive("place").getAsString();
		}

        JsonObject response = new JsonObject();
        response.addProperty("payload", "Hello, " + name + "in" + place + "!");
        return response;
    }
}
