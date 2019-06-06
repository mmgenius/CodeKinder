//The following code can be used to load an existing model.

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


public class EMFModelLoad {
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
                .createURI("result/My2.result"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        BlockOfResult result = (BlockOfResult) resource.getContents().get(0);
        return result;
    }
    
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
        Resource resource = resSet.getResource(URI.createURI("query/requete.query"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
   ;
        Query query =  (Query) resource.getContents().get(0);
        System.out.println("xcxcxc" +query);
        return query;
    }

}