import java.net.*;
import java.io.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;


class URLCionnectionReader {
    public static void main(String[] args) throws Exception {
        String query = "http://api.openweathermap.org/data/2.5/weather?q=Seoul,kr";
        String key = "f3bd9e33deb06e0deb3a361b0db1e1df" ;
        String queryUrl = query  + "&appid=" + key;
        URL oracle = new URL(queryUrl);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        //StringBuffer json = new StringBuffer(1024);
        String json ="";
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            json += inputLine + "\n";
        }
        in.close();
        System.out.println("output : ");
        System.out.print(json.toString());
        JSONObject objJSON = new JSONObject(json.toString());
        JSONObject coord = objJSON.getJSONObject("coord");
        String lat = coord.get("lat").toString();
        System.out.println("coord: " + lat);
        JSONArray weatherArray = objJSON.getJSONArray("weather");
        JSONObject weather = weatherArray.getJSONObject(1);
        System.out.print("weather: "+ weather.toString());
    }
}
