/**
 */
package entities;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skeleton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entities.Skeleton#getName <em>Name</em>}</li>
 *   <li>{@link entities.Skeleton#getBones <em>Bones</em>}</li>
 *   <li>{@link entities.Skeleton#getConnections <em>Connections</em>}</li>
 *   <li>{@link entities.Skeleton#getReferedTo <em>Refered To</em>}</li>
 * </ul>
 *
 * @see entities.EntitiesPackage#getSkeleton()
 * @model
 * @generated
 */
public interface Skeleton extends EObject {
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
	 * @see entities.EntitiesPackage#getSkeleton_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entities.Skeleton#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bones</b></em>' containment reference list.
	 * The list contents are of type {@link entities.Bone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bones</em>' containment reference list.
	 * @see entities.EntitiesPackage#getSkeleton_Bones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bone> getBones();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link entities.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see entities.EntitiesPackage#getSkeleton_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Refered To</b></em>' reference list.
	 * The list contents are of type {@link entities.Connection}.
	 * It is bidirectional and its opposite is '{@link entities.Connection#getRefered <em>Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered To</em>' reference list.
	 * @see entities.EntitiesPackage#getSkeleton_ReferedTo()
	 * @see entities.Connection#getRefered
	 * @model opposite="refered"
	 * @generated
	 */
	EList<Connection> getReferedTo();

} // Skeleton
