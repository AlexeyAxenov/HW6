import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
//HW6
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();


        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("332663")
                .addQueryParameter("apikey","U2supnJ6luhCWZ7mG2N1stgz14eEguXH")
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .build();


        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
