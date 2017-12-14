/**
 */
package views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Page#getName <em>Name</em>}</li>
 *   <li>{@link views.Page#getBlockHolders <em>Block Holders</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
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
	 * @see views.ViewsPackage#getPage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link views.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Block Holders</b></em>' containment reference list.
	 * The list contents are of type {@link views.BlockHolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Holders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Holders</em>' containment reference list.
	 * @see views.ViewsPackage#getPage_BlockHolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockHolder> getBlockHolders();

} // Page
