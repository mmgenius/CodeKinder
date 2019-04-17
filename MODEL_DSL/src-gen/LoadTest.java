import java.util.Iterator;
import model.BlockOfResult;
import model.Country;
import model.Query;
import org.json.*;

public class LoadTest {

	public static String serializeQuery(Query query) {
		String sQuery="https://api.worldbank.org/v2/country/";
		//Creation de la requete pays.
		for (Iterator<Country> iterator = query.getCountry().iterator(); iterator.hasNext();) 
		{
			Country country = iterator.next();
			sQuery+=country.getName();
			if(iterator.hasNext())
				sQuery+=";";
		}
		sQuery+="/indicator/"+query.getInd()+"?date="+query.getPeriod().getBegin()+":"+query.getPeriod().getEnd()+"&format=json";
		return sQuery;	
	}
	/**
	 * @param args
	 */
	
	public static Query parseResponse(String sResult, Query query) {
		JSONArray result = new JSONArray(sResult);
		JSONArray data = result.getJSONArray(1);
		for (int i = 0; i < data.length(); i++) {
            JSONObject jsonobject = data.getJSONObject(i);
            System.out.println(jsonobject.getInt("value")); 
		}
		BlockOfResult block = new BlockOfResult();
		return query;		
	}
	
	
	public static void main(String[] args) {
		// Loading the existing model
		EMFModelLoad loader = new EMFModelLoad();
		Query test = loader.loadQuery();
		//System.out.println(test.getInd());
		//System.out.println(test.getPeriod());
		//System.out.println(test.get);
		//  System.out.println(test.getPeriod().getEnd());
		System.out.println(serializeQuery(test));

		// We could also iterate over the Articles...


		for (Iterator<BlockOfResult> iterator = test.getBlockofresult().iterator(); iterator.hasNext();) {
			BlockOfResult page = iterator.next();
			System.out.println("result of req : " + page.getValue());
		}

		//  Query query = loader.load();
		BlockOfResult res = loader.load();
		// Accessing the model information
		System.out.println(res.getValue());
		System.out.println(res.getYear());
		System.out.println(res.getCountry().getName());
		//  System.out.println(query.getPeriod());
		// Lets see what info the webpage has
		//        for (Iterator<Country> iterator = res.getCountry().iterator(); iterator
		//                .hasNext();) {
		//        	Country page = iterator.next();
		//            System.out.println("Name of country : " + page.getName());
		//            // We could also iterate over the Articles...
		//        }


	}

}
