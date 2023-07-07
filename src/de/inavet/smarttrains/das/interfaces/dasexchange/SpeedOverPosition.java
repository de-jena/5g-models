/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.Position;
import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Over Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse, Geschwindigkeit über Position
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeedOverPosition extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected ValueItem speed;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeedOverPosition() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.SPEED_OVER_POSITION;
	}

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' reference.
	 * @see #setSpeed(ValueItem)
	 * @generated
	 */
	public ValueItem getSpeed() {
		if (speed != null && ((EObject)speed).eIsProxy()) {
			InternalEObject oldSpeed = speed;
			speed = (ValueItem)eResolveProxy(oldSpeed);
			if (speed != oldSpeed) {
			}
		}
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueItem basicGetSpeed() {
		return speed;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSpeed the new value of the '<em>Speed</em>' reference.
	 * @see #getSpeed()
	 * @generated
	 */
	public void setSpeed(ValueItem newSpeed) {
		speed = newSpeed;
	}

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @generated
	 */
	public Position getPosition() {
		if (position != null && ((EObject)position).eIsProxy()) {
			InternalEObject oldPosition = position;
			position = (Position)eResolveProxy(oldPosition);
			if (position != oldPosition) {
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPosition the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		position = newPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.SPEED_OVER_POSITION__SPEED:
				if (resolve) return getSpeed();
				return basicGetSpeed();
			case DasexchangePackage.SPEED_OVER_POSITION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DasexchangePackage.SPEED_OVER_POSITION__SPEED:
				setSpeed((ValueItem)newValue);
				return;
			case DasexchangePackage.SPEED_OVER_POSITION__POSITION:
				setPosition((Position)newValue);
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
			case DasexchangePackage.SPEED_OVER_POSITION__SPEED:
				setSpeed((ValueItem)null);
				return;
			case DasexchangePackage.SPEED_OVER_POSITION__POSITION:
				setPosition((Position)null);
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
			case DasexchangePackage.SPEED_OVER_POSITION__SPEED:
				return speed != null;
			case DasexchangePackage.SPEED_OVER_POSITION__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

} // SpeedOverPosition
