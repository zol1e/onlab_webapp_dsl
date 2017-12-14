/**
 */
package views.impl;

import entities.Bone;
import entities.Skeleton;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import views.List;
import views.View;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ListImpl#getSkeletons <em>Skeletons</em>}</li>
 *   <li>{@link views.impl.ListImpl#getListBones <em>List Bones</em>}</li>
 *   <li>{@link views.impl.ListImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends BlockImpl implements List {
	/**
	 * The cached value of the '{@link #getSkeletons() <em>Skeletons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkeletons()
	 * @generated
	 * @ordered
	 */
	protected EList<Skeleton> skeletons;

	/**
	 * The cached value of the '{@link #getListBones() <em>List Bones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListBones()
	 * @generated
	 * @ordered
	 */
	protected EList<Bone> listBones;
	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Skeleton> getSkeletons() {
		if (skeletons == null) {
			skeletons = new EObjectResolvingEList<Skeleton>(Skeleton.class, this, ViewsPackage.LIST__SKELETONS);
		}
		return skeletons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bone> getListBones() {
		if (listBones == null) {
			listBones = new EObjectResolvingEList<Bone>(Bone.class, this, ViewsPackage.LIST__LIST_BONES);
		}
		return listBones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject)view;
			view = (View)eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.LIST__VIEW, oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(View newView) {
		View oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.LIST__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.LIST__SKELETONS:
				return getSkeletons();
			case ViewsPackage.LIST__LIST_BONES:
				return getListBones();
			case ViewsPackage.LIST__VIEW:
				if (resolve) return getView();
				return basicGetView();
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
			case ViewsPackage.LIST__SKELETONS:
				getSkeletons().clear();
				getSkeletons().addAll((Collection<? extends Skeleton>)newValue);
				return;
			case ViewsPackage.LIST__LIST_BONES:
				getListBones().clear();
				getListBones().addAll((Collection<? extends Bone>)newValue);
				return;
			case ViewsPackage.LIST__VIEW:
				setView((View)newValue);
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
			case ViewsPackage.LIST__SKELETONS:
				getSkeletons().clear();
				return;
			case ViewsPackage.LIST__LIST_BONES:
				getListBones().clear();
				return;
			case ViewsPackage.LIST__VIEW:
				setView((View)null);
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
			case ViewsPackage.LIST__SKELETONS:
				return skeletons != null && !skeletons.isEmpty();
			case ViewsPackage.LIST__LIST_BONES:
				return listBones != null && !listBones.isEmpty();
			case ViewsPackage.LIST__VIEW:
				return view != null;
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
