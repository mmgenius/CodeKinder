/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Query#getCountry <em>Country</em>}</li>
 *   <li>{@link model.Query#getInd <em>Ind</em>}</li>
 *   <li>{@link model.Query#getPeriod <em>Period</em>}</li>
 *   <li>{@link model.Query#getBlockofresult <em>Blockofresult</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link model.Country}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see model.ModelPackage#getQuery_Country()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Country> getCountry();

	/**
	 * Returns the value of the '<em><b>Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ind</em>' attribute.
	 * @see #setInd(String)
	 * @see model.ModelPackage#getQuery_Ind()
	 * @model
	 * @generated
	 */
	String getInd();

	/**
	 * Sets the value of the '{@link model.Query#getInd <em>Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ind</em>' attribute.
	 * @see #getInd()
	 * @generated
	 */
	void setInd(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see model.ModelPackage#getQuery_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link model.Query#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Blockofresult</b></em>' containment reference list.
	 * The list contents are of type {@link model.BlockOfResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockofresult</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockofresult</em>' containment reference list.
	 * @see model.ModelPackage#getQuery_Blockofresult()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BlockOfResult> getBlockofresult();

} // Query
