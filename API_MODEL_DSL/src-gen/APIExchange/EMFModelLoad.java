//The following code can be used to load an existing model.
package APIExchange; 
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate.Factory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import model.BlockOfResult;
import model.Country;
import model.ModelFactory;
import model.ModelPackage;
import model.Period;
import model.Query;

/**
 * @author Idrissa SI
 * This class allows to load a created instance of Query model and BlockOfResult  
 * 
 * */
public class EMFModelLoad {


	/**
	 * @author Idrissa SI
	 * @return {@link BlockOfResult}
	 * load created BlockOfResult model instance
	 * */
	public BlockOfResult load() {
		// Initialize the model
		ModelPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .query extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("result", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI
				.createURI("../API_MODEL_DSL/result/My2.result"), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		BlockOfResult result = (BlockOfResult) resource.getContents().get(0);
		return result;
	}

	
	/**
	 * @author Idrissa SI
	 * @return {@link Query}
	 * load created Query model instance
	 * */
	public Query loadQuery() {
		// Initialize the model
		ModelPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("query", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI("../API_MODEL_DSL/query/requete.query"), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node

		Query query =  (Query) resource.getContents().get(0);
		System.out.println("xcxcxc" +query);
		return query;
	}

}