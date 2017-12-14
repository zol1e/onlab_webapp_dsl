/**
 */
package views;

import entities.Bone;
import entities.Skeleton;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.List#getSkeletons <em>Skeletons</em>}</li>
 *   <li>{@link views.List#getListBones <em>List Bones</em>}</li>
 *   <li>{@link views.List#getView <em>View</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getList()
 * @model
 * @generated
 */
public interface List extends Block {
	/**
	 * Returns the value of the '<em><b>Skeletons</b></em>' reference list.
	 * The list contents are of type {@link entities.Skeleton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeletons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeletons</em>' reference list.
	 * @see views.ViewsPackage#getList_Skeletons()
	 * @model
	 * @generated
	 */
	EList<Skeleton> getSkeletons();

	/**
	 * Returns the value of the '<em><b>List Bones</b></em>' reference list.
	 * The list contents are of type {@link entities.Bone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Bones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Bones</em>' reference list.
	 * @see views.ViewsPackage#getList_ListBones()
	 * @model
	 * @generated
	 */
	EList<Bone> getListBones();

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see views.ViewsPackage#getList_View()
	 * @model required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link views.List#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

} // List
