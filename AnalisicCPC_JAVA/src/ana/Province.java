package ana;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Province {

	
	public static void main(String[] args) throws IOException {

		FileWriter fw = null;
		StringBuffer sb = new StringBuffer();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
		        new FileInputStream("txtyuan.txt")));
		        for (String line = br.readLine(); line != null; line = br.readLine()) {
		        	sb.append(line + "\n");
		        	
		        }
		   
		        
		        
		        JSONTokener  jsonParser = new JSONTokener(sb.toString());
		        JSONObject jsonObject = null;
		        try {
		            jsonObject = (JSONObject) jsonParser.nextValue();


		            JSONObject Location = jsonObject.getJSONObject("Location");
		            JSONArray CountryRegion = Location.getJSONArray("CountryRegion");


		            JSONObject china = CountryRegion.getJSONObject(0);

		            JSONArray State = china.getJSONArray("State");

		            
		            fw = new FileWriter("province.txt",true);
		            
		            fw.write("{\"province\":[");

		            for (int i = 0 ; i < State.length() ; i++){
		                JSONObject temp = State.getJSONObject(i);
		                System.out.println( "State-Name: " + temp.getString("Name"));
		                
		                
		                //fw = new FileWriter("d://test.txt",true);
		                fw.write("{\"name\":\"" + temp.getString("Name") + "\"},");


		            }
		            fw.write("]}");
		            
		            fw.close();
		            
		        
		        
	  } catch (JSONException e) {
          e.printStackTrace();
      }

	


		        
		 
	}

}
