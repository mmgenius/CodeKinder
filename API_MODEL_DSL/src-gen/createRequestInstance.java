import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
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
 * This class allows to save a created model instance
 * */
public class createRequestInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Initialize the model
       ModelPackage.eINSTANCE.eClass();
        // Retrieve the default factory singleton
        ModelFactory factory = ModelFactory.eINSTANCE;

        // create the content of the model via this program
        Query query = factory.createQuery();
        Country country1 = factory.createCountry();
        Period period = factory.createPeriod();
        period.setBegin(1960);
        period.setEnd(1960);
        BlockOfResult result1 = factory.createBlockOfResult();
        query.setInd("age");
        query.setPeriod(period);
        country1.setName("fr");
        result1.setCountry(country1);
        result1.setValue("80 ans");
        result1.setYear(period.getBegin());
        query.getBlockofresult().add(result1);
        

        // As of here we preparing to save the model content

        // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("query", new XMIResourceFactoryImpl());

        m.put("result", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI
                .createURI("result/My2.result"));
        
        // create a resource
        Resource resourceQuery = resSet.createResource(URI
                .createURI("query/My2.query"));
        
        


        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resourceQuery.getContents().add(query);
        resource.getContents().add(result1);

        // now save the content.
        try {
        	ByteArrayOutputStream  ba = new ByteArrayOutputStream();
        	
            resource.save(ba,Collections.EMPTY_MAP);
            System.out.println(ba.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}

}
