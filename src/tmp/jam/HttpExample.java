package tmp.jam;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpExample {
    private final String USER_AGENT = "Mozilla/5.0";
    private final String JSON_TYPE = "application/json";
    private final String OAUTH = "OAuth oiLt4wAIVwrZek21o7NlrMgTe0BJehGRFSOzVOSo";

    public void sendGet() throws Exception {
        String url = "http://localhost:3000/OData/OData.svc/Groups(3)/ContentItems";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");

        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept", JSON_TYPE);
        con.setRequestProperty("Authorization", OAUTH);

        int responseCode = con.getResponseCode();
        System.out.println(responseCode);

    }


    public static void main(String[] args) {
        HttpExample he = new HttpExample();
        try {
            he.sendGet();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
