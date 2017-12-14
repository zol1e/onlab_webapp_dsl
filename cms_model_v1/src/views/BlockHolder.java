/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.BlockHolder#getName <em>Name</em>}</li>
 *   <li>{@link views.BlockHolder#getDefaultBlock <em>Default Block</em>}</li>
 *   <li>{@link views.BlockHolder#getNavigationTarget <em>Navigation Target</em>}</li>
 *   <li>{@link views.BlockHolder#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getBlockHolder()
 * @model
 * @generated
 */
public interface BlockHolder extends EObject {
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
	 * @see views.ViewsPackage#getBlockHolder_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link views.BlockHolder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Default Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Block</em>' reference.
	 * @see #setDefaultBlock(Block)
	 * @see views.ViewsPackage#getBlockHolder_DefaultBlock()
	 * @model
	 * @generated
	 */
	Block getDefaultBlock();

	/**
	 * Sets the value of the '{@link views.BlockHolder#getDefaultBlock <em>Default Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Block</em>' reference.
	 * @see #getDefaultBlock()
	 * @generated
	 */
	void setDefaultBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Navigation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Target</em>' reference.
	 * @see #setNavigationTarget(BlockHolder)
	 * @see views.ViewsPackage#getBlockHolder_NavigationTarget()
	 * @model
	 * @generated
	 */
	BlockHolder getNavigationTarget();

	/**
	 * Sets the value of the '{@link views.BlockHolder#getNavigationTarget <em>Navigation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Target</em>' reference.
	 * @see #getNavigationTarget()
	 * @generated
	 */
	void setNavigationTarget(BlockHolder value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see views.ViewsPackage#getBlockHolder_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link views.BlockHolder#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

} // BlockHolder
