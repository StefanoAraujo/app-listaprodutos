package saitam.listaprodutos;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetHttpJSON {

    public static JSONObject getJSONObjectFromURL(String urlString) throws IOException, JSONException {

        HttpURLConnection urlConnection = null;

        URL url = new URL(urlString);

        urlConnection = (HttpURLConnection) url.openConnection();

        urlConnection.setRequestMethod("GET");
        urlConnection.setReadTimeout(10000); /* milliseconds */
        urlConnection.setConnectTimeout(15000); /* milliseconds */

        urlConnection.setDoOutput(true);

        urlConnection.connect();

        BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));

        char[] buffer = new char[1024];

        String jsonString = new String();

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line+"\n");
        }
        br.close();

        jsonString = sb.toString();

        Log.d("JSON: " +jsonString, "Content");

        return new JSONObject(jsonString);
    }

    public void ExibeProdutos()
    {
        String jsonprodutos = "https://gist.githubusercontent.com/ronanrodrigo/b95b75cfddc6b1cb601d7f806859e1dc/raw/dc973df65664f6997eeba30158d838c4b716204c/products.json";

        try{
            JSONObject jsonObject = getJSONObjectFromURL(jsonprodutos);

            //parser json
            Log.d(jsonObject.toString(), "Content");


        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void ExibeCategorias()
    {
        String jsoncategorias = "https://gist.githubusercontent.com/ronanrodrigo/e84d0d969613fd0ef8f9fd08546f7155/raw/a0611f7e765fa2b745ad9a897296e082a3987f61/categories.json";

        try{
            JSONObject jsonObject = getJSONObjectFromURL(jsoncategorias);

            //parser json
            Log.d(jsonObject.toString(), "Content");


        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
