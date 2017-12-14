/**
 */
package entities;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entities.EntityBase#getName <em>Name</em>}</li>
 *   <li>{@link entities.EntityBase#getSkeletons <em>Skeletons</em>}</li>
 *   <li>{@link entities.EntityBase#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 *
 * @see entities.EntitiesPackage#getEntityBase()
 * @model
 * @generated
 */
public interface EntityBase extends EObject {
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
	 * @see entities.EntitiesPackage#getEntityBase_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entities.EntityBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Skeletons</b></em>' containment reference list.
	 * The list contents are of type {@link entities.Skeleton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeletons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeletons</em>' containment reference list.
	 * @see entities.EntitiesPackage#getEntityBase_Skeletons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Skeleton> getSkeletons();

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link entities.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see entities.EntitiesPackage#getEntityBase_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatypes();

} // EntityBase
