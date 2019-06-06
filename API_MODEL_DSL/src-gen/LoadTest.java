import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import model.BlockOfResult;
import model.Country;
import model.ModelFactory;
import model.ModelPackage;
import model.Query;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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
		EMFModelLoad loader = new EMFModelLoad();
		JSONArray result = new JSONArray(sResult);
		JSONArray data = result.getJSONArray(1);
		for (int i = 0; i < data.length(); i++) {
			JSONObject jsonobject = data.getJSONObject(i);
			String country= jsonobject.getJSONObject("country").getString("id") ;
			int date = jsonobject.getInt("date");
			int value = jsonobject.getInt("value") ;
			System.out.println( country+ " " + date + " "  + value ); 
			// jsonobject.getJSONObject("country").getString("id");

			BlockOfResult res = loader.load();

			ModelPackage.eINSTANCE.eClass();
			// Retrieve the default factory singleton
			ModelFactory factory = ModelFactory.eINSTANCE;

			Country count = factory.createCountry();
			count.setName(country);

			res.setCountry(count);
			res.setValue(value+"");
			res.setYear(date);
			query.getBlockofresult().add(res);

		}


		return query;		
	}


	public static void main(String[] args) throws IOException {
		// Loading the existing model
		EMFModelLoad loader = new EMFModelLoad();
		Query test = loader.loadQuery();
		System.out.println(dslBootstrap(test));
		System.out.println("=======");
		System.out.println(test.getBlockofresult().get(0));
	}
	
	
	/**
	 * @param test
	 * @throws IOException
	 */
	public static String dslBootstrap(Query test) throws IOException {
		String retour = "";
		System.out.println(serializeQuery(test));
		System.out.println(APICommunication.sendGET(serializeQuery(test)));
		parseResponse(APICommunication.sendGET(serializeQuery(test)), test);

		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("query", new XMIResourceFactoryImpl());

		m.put("result", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		//        Resource resource = resSet.createResource(URI
		//                .createURI("result/My2.result"));

		// create a resource
		Resource resourceQuery = resSet.createResource(URI
				.createURI("query/My2.query"));

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resourceQuery.getContents().add(test);
		try {
			ByteArrayOutputStream  ba = new ByteArrayOutputStream();
			resourceQuery.save(ba,Collections.EMPTY_MAP);
			System.out.println(ba.toString());
			retour =  ba.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}

}
