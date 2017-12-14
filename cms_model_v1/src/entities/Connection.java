/**
 */
package entities;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entities.Connection#getName <em>Name</em>}</li>
 *   <li>{@link entities.Connection#getRefered <em>Refered</em>}</li>
 * </ul>
 *
 * @see entities.EntitiesPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entities.EntitiesPackage#getConnection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entities.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Refered</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entities.Skeleton#getReferedTo <em>Refered To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered</em>' reference.
	 * @see #setRefered(Skeleton)
	 * @see entities.EntitiesPackage#getConnection_Refered()
	 * @see entities.Skeleton#getReferedTo
	 * @model opposite="referedTo" required="true"
	 * @generated
	 */
	Skeleton getRefered();

	/**
	 * Sets the value of the '{@link entities.Connection#getRefered <em>Refered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refered</em>' reference.
	 * @see #getRefered()
	 * @generated
	 */
	void setRefered(Skeleton value);

} // Connection
