import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

public class APIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		try 
		{
			CallHello2();
		}
		catch(Exception ex)
		{
			System.out.println("Hello");
		}
	}

	
	private static void CallHello() throws IOException
	{
		URL url = new URL("http://localhost:50307/api/Address/Hello");
		
		
		CredentialsProvider provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials credentials
		 = new UsernamePasswordCredentials("user1", "user1Pass");
		provider.setCredentials(AuthScope.ANY, credentials);
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");	
		con.setRequestProperty("Accept", "application/json");
        if (con.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : " + con.getResponseCode());
        }
        InputStreamReader in = new InputStreamReader(con.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }
        con.disconnect();		
	}

	private static void CallHello2() throws IOException
	{
		URL url = new URL("http://localhost:50307/api/Address/Hello");
		
		
		CredentialsProvider provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials credentials
		 = new UsernamePasswordCredentials("user1", "user1Pass");
		provider.setCredentials(AuthScope.ANY, credentials);
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");	
		con.setRequestProperty("Accept", "application/json");
        if (con.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : " + con.getResponseCode());
        }
        InputStreamReader in = new InputStreamReader(con.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }
        con.disconnect();		
	}


	//	private static void CallHelloAuth() throws IOException
//	{
//        String url = "http://localhost:8080/RestfulWebServices/order-inventory/order/1016";
//        String name = "java2novice";
//        String password = "Simple4u!";
//        String authString = name + ":" + password;
//        String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
//        System.out.println("Base64 encoded auth string: " + authStringEnc);
//        Client restClient = Client.create();
//        WebResource webResource = restClient.resource(url);
//        ClientResponse resp = webResource.accept("application/json")
//                                         .header("Authorization", "Basic " + authStringEnc)
//                                         .get(ClientResponse.class);
//        if(resp.getStatus() != 200){
//            System.err.println("Unable to connect to the server");
//        }
//        String output = resp.getEntity(String.class);
//        System.out.println("response: "+output);
//	}
}
