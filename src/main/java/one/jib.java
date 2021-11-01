package one;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jib {
    public String job() throws IOException {

        String url = "http://java2s.com";
        URL request_url = new URL(url);
        HttpURLConnection http_conn = (HttpURLConnection) request_url.openConnection();
        http_conn.setConnectTimeout(100000);
        http_conn.setReadTimeout(100000);
        http_conn.setInstanceFollowRedirects(true);

        System.out.println(String.valueOf(http_conn.getResponseCode()));
        System.out.println(String.valueOf(http_conn.getResponseMessage()));
        System.out.println(String.valueOf(http_conn.getHeaderField("Date")));
        System.out.println(String.valueOf(http_conn.getHeaderField("Date")));


        Map<String, List<String>> headers = http_conn.getHeaderFields();
        Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();
        for (Map.Entry<String, List<String>> entry : entrySet) {
            String headerName = entry.getKey();
            System.out.println("Header Name:" + headerName);
            List<String> headerValues = entry.getValue();
            for (String value : headerValues) {
                System.out.print("Header value:" + value);
            }
            System.out.println();
            System.out.println("Request method is " + http_conn.getRequestMethod());


////        SocketAddress addr = new InetSocketAddress("104.248.63.17",30588);
////        Proxy proxy = new Proxy(Proxy.Type.SOCKS, addr);
//        final URL url = new URL("http://ya.ru");
//        final HttpURLConnection connectionDone = (HttpURLConnection) url.openConnection();
//        connectionDone.setRequestMethod("GET");
//        connectionDone.setConnectTimeout(15000);
//        connectionDone.setRequestProperty("Content-Type", "application/json");
//
//
//        try (final BufferedReader in = new BufferedReader(new InputStreamReader(connectionDone.getInputStream()))) {
//            String inputLine;
//            final StringBuilder content = new StringBuilder();
//            while ((inputLine = in.readLine()) != null) {
//                content.append(inputLine);
//            }
//            return content.toString();
//
//        }
//        catch (final Exception ex){
//            ex.printStackTrace();
//            System.out.println("Метод запроса: " +
//                    connectionDone.getRequestMethod());
//            System.out.println("Ответное сообщение: " +
//                    connectionDone.getResponseMessage());
//            return "";
//       }

            return url;
        }
        return url;
    }
}

