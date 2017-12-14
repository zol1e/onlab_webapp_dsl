/**
 */
package views;

import entities.Bone;
import entities.Connection;
import entities.Skeleton;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.View#getSkeleton <em>Skeleton</em>}</li>
 *   <li>{@link views.View#getViewBones <em>View Bones</em>}</li>
 *   <li>{@link views.View#getViewConnections <em>View Connections</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getView()
 * @model
 * @generated
 */
public interface View extends Block {
	/**
	 * Returns the value of the '<em><b>Skeleton</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeleton</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeleton</em>' reference.
	 * @see #setSkeleton(Skeleton)
	 * @see views.ViewsPackage#getView_Skeleton()
	 * @model
	 * @generated
	 */
	Skeleton getSkeleton();

	/**
	 * Sets the value of the '{@link views.View#getSkeleton <em>Skeleton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skeleton</em>' reference.
	 * @see #getSkeleton()
	 * @generated
	 */
	void setSkeleton(Skeleton value);

	/**
	 * Returns the value of the '<em><b>View Bones</b></em>' reference list.
	 * The list contents are of type {@link entities.Bone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Bones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Bones</em>' reference list.
	 * @see views.ViewsPackage#getView_ViewBones()
	 * @model
	 * @generated
	 */
	EList<Bone> getViewBones();

	/**
	 * Returns the value of the '<em><b>View Connections</b></em>' reference list.
	 * The list contents are of type {@link entities.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Connections</em>' reference list.
	 * @see views.ViewsPackage#getView_ViewConnections()
	 * @model
	 * @generated
	 */
	EList<Connection> getViewConnections();

} // View
