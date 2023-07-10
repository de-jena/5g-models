/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Time Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getValues <em>Values</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup <em>Signal Group</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimeVector()
 * @model
 * @generated
 */
public interface ReleaseTimeVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimeVector_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<Double> getValues();

	/**
	 * Returns the value of the '<em><b>Signal Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group</em>' containment reference.
	 * @see #setSignalGroup(SignalGroup)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimeVector_SignalGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalGroup getSignalGroup();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup <em>Signal Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Group</em>' containment reference.
	 * @see #getSignalGroup()
	 * @generated
	 */
	void setSignalGroup(SignalGroup value);

} // ReleaseTimeVector
