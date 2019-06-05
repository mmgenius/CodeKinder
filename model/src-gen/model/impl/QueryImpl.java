/**
 */
package model.impl;

import java.util.Collection;

import model.BlockOfResult;
import model.Country;
import model.ModelPackage;
import model.Period;
import model.Query;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.QueryImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link model.impl.QueryImpl#getInd <em>Ind</em>}</li>
 *   <li>{@link model.impl.QueryImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link model.impl.QueryImpl#getBlockofresult <em>Blockofresult</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends MinimalEObjectImpl.Container implements Query {
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> country;

	/**
	 * The default value of the '{@link #getInd() <em>Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInd()
	 * @generated
	 * @ordered
	 */
	protected static final String IND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInd() <em>Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInd()
	 * @generated
	 * @ordered
	 */
	protected String ind = IND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getBlockofresult() <em>Blockofresult</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockofresult()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockOfResult> blockofresult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountry() {
		if (country == null) {
			country = new EObjectContainmentEList<Country>(Country.class, this, ModelPackage.QUERY__COUNTRY);
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInd() {
		return ind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInd(String newInd) {
		String oldInd = ind;
		ind = newInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY__IND, oldInd, ind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY__PERIOD,
					oldPeriod, newPeriod);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject) period).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.QUERY__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject) newPeriod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.QUERY__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockOfResult> getBlockofresult() {
		if (blockofresult == null) {
			blockofresult = new EObjectContainmentEList<BlockOfResult>(BlockOfResult.class, this,
					ModelPackage.QUERY__BLOCKOFRESULT);
		}
		return blockofresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.QUERY__COUNTRY:
			return ((InternalEList<?>) getCountry()).basicRemove(otherEnd, msgs);
		case ModelPackage.QUERY__PERIOD:
			return basicSetPeriod(null, msgs);
		case ModelPackage.QUERY__BLOCKOFRESULT:
			return ((InternalEList<?>) getBlockofresult()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.QUERY__COUNTRY:
			return getCountry();
		case ModelPackage.QUERY__IND:
			return getInd();
		case ModelPackage.QUERY__PERIOD:
			return getPeriod();
		case ModelPackage.QUERY__BLOCKOFRESULT:
			return getBlockofresult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.QUERY__COUNTRY:
			getCountry().clear();
			getCountry().addAll((Collection<? extends Country>) newValue);
			return;
		case ModelPackage.QUERY__IND:
			setInd((String) newValue);
			return;
		case ModelPackage.QUERY__PERIOD:
			setPeriod((Period) newValue);
			return;
		case ModelPackage.QUERY__BLOCKOFRESULT:
			getBlockofresult().clear();
			getBlockofresult().addAll((Collection<? extends BlockOfResult>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.QUERY__COUNTRY:
			getCountry().clear();
			return;
		case ModelPackage.QUERY__IND:
			setInd(IND_EDEFAULT);
			return;
		case ModelPackage.QUERY__PERIOD:
			setPeriod((Period) null);
			return;
		case ModelPackage.QUERY__BLOCKOFRESULT:
			getBlockofresult().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.QUERY__COUNTRY:
			return country != null && !country.isEmpty();
		case ModelPackage.QUERY__IND:
			return IND_EDEFAULT == null ? ind != null : !IND_EDEFAULT.equals(ind);
		case ModelPackage.QUERY__PERIOD:
			return period != null;
		case ModelPackage.QUERY__BLOCKOFRESULT:
			return blockofresult != null && !blockofresult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ind: ");
		result.append(ind);
		result.append(')');
		return result.toString();
	}

} //QueryImpl
