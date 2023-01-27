package exam20230127;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {

	public static void main(String[] args) {
		Company company = new Company(100, "Apple", "Apple Computer Inc. 1 infinite Loop", "Cupertino", "CA", "95014");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
		String Json = gson.toJson(company);
		
		System.out.println(Json);

		
	}
}
