/**
 */
package views.impl;

import entities.Bone;
import entities.Connection;
import entities.Skeleton;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import views.View;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ViewImpl#getSkeleton <em>Skeleton</em>}</li>
 *   <li>{@link views.impl.ViewImpl#getViewBones <em>View Bones</em>}</li>
 *   <li>{@link views.impl.ViewImpl#getViewConnections <em>View Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends BlockImpl implements View {
	/**
	 * The cached value of the '{@link #getSkeleton() <em>Skeleton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkeleton()
	 * @generated
	 * @ordered
	 */
	protected Skeleton skeleton;

	/**
	 * The cached value of the '{@link #getViewBones() <em>View Bones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBones()
	 * @generated
	 * @ordered
	 */
	protected EList<Bone> viewBones;

	/**
	 * The cached value of the '{@link #getViewConnections() <em>View Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> viewConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skeleton getSkeleton() {
		if (skeleton != null && skeleton.eIsProxy()) {
			InternalEObject oldSkeleton = (InternalEObject)skeleton;
			skeleton = (Skeleton)eResolveProxy(oldSkeleton);
			if (skeleton != oldSkeleton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.VIEW__SKELETON, oldSkeleton, skeleton));
			}
		}
		return skeleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skeleton basicGetSkeleton() {
		return skeleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkeleton(Skeleton newSkeleton) {
		Skeleton oldSkeleton = skeleton;
		skeleton = newSkeleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW__SKELETON, oldSkeleton, skeleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bone> getViewBones() {
		if (viewBones == null) {
			viewBones = new EObjectResolvingEList<Bone>(Bone.class, this, ViewsPackage.VIEW__VIEW_BONES);
		}
		return viewBones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getViewConnections() {
		if (viewConnections == null) {
			viewConnections = new EObjectResolvingEList<Connection>(Connection.class, this, ViewsPackage.VIEW__VIEW_CONNECTIONS);
		}
		return viewConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.VIEW__SKELETON:
				if (resolve) return getSkeleton();
				return basicGetSkeleton();
			case ViewsPackage.VIEW__VIEW_BONES:
				return getViewBones();
			case ViewsPackage.VIEW__VIEW_CONNECTIONS:
				return getViewConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.VIEW__SKELETON:
				setSkeleton((Skeleton)newValue);
				return;
			case ViewsPackage.VIEW__VIEW_BONES:
				getViewBones().clear();
				getViewBones().addAll((Collection<? extends Bone>)newValue);
				return;
			case ViewsPackage.VIEW__VIEW_CONNECTIONS:
				getViewConnections().clear();
				getViewConnections().addAll((Collection<? extends Connection>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.VIEW__SKELETON:
				setSkeleton((Skeleton)null);
				return;
			case ViewsPackage.VIEW__VIEW_BONES:
				getViewBones().clear();
				return;
			case ViewsPackage.VIEW__VIEW_CONNECTIONS:
				getViewConnections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.VIEW__SKELETON:
				return skeleton != null;
			case ViewsPackage.VIEW__VIEW_BONES:
				return viewBones != null && !viewBones.isEmpty();
			case ViewsPackage.VIEW__VIEW_CONNECTIONS:
				return viewConnections != null && !viewConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewImpl
