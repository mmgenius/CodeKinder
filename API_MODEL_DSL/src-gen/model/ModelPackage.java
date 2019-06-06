/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CountryImpl
	 * @see model.impl.ModelPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.QueryImpl
	 * @see model.impl.ModelPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__IND = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Blockofresult</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__BLOCKOFRESULT = 3;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PeriodImpl
	 * @see model.impl.ModelPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.BlockOfResultImpl <em>Block Of Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BlockOfResultImpl
	 * @see model.impl.ModelPackageImpl#getBlockOfResult()
	 * @generated
	 */
	int BLOCK_OF_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_RESULT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_RESULT__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_RESULT__COUNTRY = 2;

	/**
	 * The number of structural features of the '<em>Block Of Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block Of Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_RESULT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link model.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see model.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link model.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for class '{@link model.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see model.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Query#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country</em>'.
	 * @see model.Query#getCountry()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Country();

	/**
	 * Returns the meta object for the attribute '{@link model.Query#getInd <em>Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ind</em>'.
	 * @see model.Query#getInd()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Ind();

	/**
	 * Returns the meta object for the containment reference '{@link model.Query#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see model.Query#getPeriod()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Period();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Query#getBlockofresult <em>Blockofresult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockofresult</em>'.
	 * @see model.Query#getBlockofresult()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Blockofresult();

	/**
	 * Returns the meta object for class '{@link model.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see model.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link model.Period#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see model.Period#getBegin()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Begin();

	/**
	 * Returns the meta object for the attribute '{@link model.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see model.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_End();

	/**
	 * Returns the meta object for class '{@link model.BlockOfResult <em>Block Of Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Of Result</em>'.
	 * @see model.BlockOfResult
	 * @generated
	 */
	EClass getBlockOfResult();

	/**
	 * Returns the meta object for the attribute '{@link model.BlockOfResult#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.BlockOfResult#getValue()
	 * @see #getBlockOfResult()
	 * @generated
	 */
	EAttribute getBlockOfResult_Value();

	/**
	 * Returns the meta object for the attribute '{@link model.BlockOfResult#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see model.BlockOfResult#getYear()
	 * @see #getBlockOfResult()
	 * @generated
	 */
	EAttribute getBlockOfResult_Year();

	/**
	 * Returns the meta object for the containment reference '{@link model.BlockOfResult#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see model.BlockOfResult#getCountry()
	 * @see #getBlockOfResult()
	 * @generated
	 */
	EReference getBlockOfResult_Country();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CountryImpl
		 * @see model.impl.ModelPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '{@link model.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.QueryImpl
		 * @see model.impl.ModelPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__COUNTRY = eINSTANCE.getQuery_Country();

		/**
		 * The meta object literal for the '<em><b>Ind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__IND = eINSTANCE.getQuery_Ind();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__PERIOD = eINSTANCE.getQuery_Period();

		/**
		 * The meta object literal for the '<em><b>Blockofresult</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__BLOCKOFRESULT = eINSTANCE.getQuery_Blockofresult();

		/**
		 * The meta object literal for the '{@link model.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PeriodImpl
		 * @see model.impl.ModelPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__BEGIN = eINSTANCE.getPeriod_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link model.impl.BlockOfResultImpl <em>Block Of Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BlockOfResultImpl
		 * @see model.impl.ModelPackageImpl#getBlockOfResult()
		 * @generated
		 */
		EClass BLOCK_OF_RESULT = eINSTANCE.getBlockOfResult();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_OF_RESULT__VALUE = eINSTANCE.getBlockOfResult_Value();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_OF_RESULT__YEAR = eINSTANCE.getBlockOfResult_Year();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_OF_RESULT__COUNTRY = eINSTANCE.getBlockOfResult_Country();

	}

} //ModelPackage
