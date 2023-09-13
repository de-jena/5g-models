/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Placeholder for identification of signal groups. Exact identifcation attribute follows when more complete RailML files are available.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId <em>Signal Group Id</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getSignalGroup()
 * @model
 * @generated
 */
public interface SignalGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group Id</em>' attribute.
	 * @see #setSignalGroupId(String)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getSignalGroup_SignalGroupId()
	 * @model required="true"
	 * @generated
	 */
	String getSignalGroupId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId <em>Signal Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Group Id</em>' attribute.
	 * @see #getSignalGroupId()
	 * @generated
	 */
	void setSignalGroupId(String value);

} // SignalGroup
