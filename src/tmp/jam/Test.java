package tmp.jam;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.File;


public class Test {

    private final static String USER_AGENT = "Mozilla/5.0";
    private final static String JSON_TYPE = "application/json";
    private final static String OAUTH = "OAuth oiLt4wAIVwrZek21o7NlrMgTe0BJehGRFSOzVOSo";
    private final static String CTYPE = "multipart/form-data";


    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost("http://localhost:3000/OData/OData.svc/Groups(3)/ContentItems");
        uploadFile.addHeader("Accept", JSON_TYPE);
        uploadFile.addHeader("Authorization", OAUTH);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addBinaryBody("file",
                new File("/Users/i309511/Downloads/messi.jpeg"),
                ContentType.create("image/jpeg"),
                "messi.jpeg");

        HttpEntity multipart = builder.build();

        uploadFile.setEntity(multipart);

        try {
            HttpResponse response = httpClient.execute(uploadFile);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
