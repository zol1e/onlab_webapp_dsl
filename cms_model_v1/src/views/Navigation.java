/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Navigation#getBlockNavigationItems <em>Block Navigation Items</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getNavigation()
 * @model
 * @generated
 */
public interface Navigation extends Block {
	/**
	 * Returns the value of the '<em><b>Block Navigation Items</b></em>' reference list.
	 * The list contents are of type {@link views.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Navigation Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Navigation Items</em>' reference list.
	 * @see views.ViewsPackage#getNavigation_BlockNavigationItems()
	 * @model
	 * @generated
	 */
	EList<Block> getBlockNavigationItems();

} // Navigation
