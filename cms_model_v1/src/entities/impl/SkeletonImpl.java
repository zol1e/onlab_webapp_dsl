/**
 */
package entities.impl;

import entities.Bone;
import entities.Connection;
import entities.EntitiesPackage;
import entities.Skeleton;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skeleton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entities.impl.SkeletonImpl#getName <em>Name</em>}</li>
 *   <li>{@link entities.impl.SkeletonImpl#getBones <em>Bones</em>}</li>
 *   <li>{@link entities.impl.SkeletonImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link entities.impl.SkeletonImpl#getReferedTo <em>Refered To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkeletonImpl extends MinimalEObjectImpl.Container implements Skeleton {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBones() <em>Bones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBones()
	 * @generated
	 * @ordered
	 */
	protected EList<Bone> bones;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getReferedTo() <em>Refered To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> referedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkeletonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitiesPackage.Literals.SKELETON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitiesPackage.SKELETON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bone> getBones() {
		if (bones == null) {
			bones = new EObjectContainmentEList<Bone>(Bone.class, this, EntitiesPackage.SKELETON__BONES);
		}
		return bones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, EntitiesPackage.SKELETON__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getReferedTo() {
		if (referedTo == null) {
			referedTo = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, EntitiesPackage.SKELETON__REFERED_TO, EntitiesPackage.CONNECTION__REFERED);
		}
		return referedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitiesPackage.SKELETON__REFERED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferedTo()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitiesPackage.SKELETON__BONES:
				return ((InternalEList<?>)getBones()).basicRemove(otherEnd, msgs);
			case EntitiesPackage.SKELETON__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case EntitiesPackage.SKELETON__REFERED_TO:
				return ((InternalEList<?>)getReferedTo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntitiesPackage.SKELETON__NAME:
				return getName();
			case EntitiesPackage.SKELETON__BONES:
				return getBones();
			case EntitiesPackage.SKELETON__CONNECTIONS:
				return getConnections();
			case EntitiesPackage.SKELETON__REFERED_TO:
				return getReferedTo();
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
			case EntitiesPackage.SKELETON__NAME:
				setName((String)newValue);
				return;
			case EntitiesPackage.SKELETON__BONES:
				getBones().clear();
				getBones().addAll((Collection<? extends Bone>)newValue);
				return;
			case EntitiesPackage.SKELETON__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case EntitiesPackage.SKELETON__REFERED_TO:
				getReferedTo().clear();
				getReferedTo().addAll((Collection<? extends Connection>)newValue);
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
			case EntitiesPackage.SKELETON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntitiesPackage.SKELETON__BONES:
				getBones().clear();
				return;
			case EntitiesPackage.SKELETON__CONNECTIONS:
				getConnections().clear();
				return;
			case EntitiesPackage.SKELETON__REFERED_TO:
				getReferedTo().clear();
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
			case EntitiesPackage.SKELETON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntitiesPackage.SKELETON__BONES:
				return bones != null && !bones.isEmpty();
			case EntitiesPackage.SKELETON__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case EntitiesPackage.SKELETON__REFERED_TO:
				return referedTo != null && !referedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SkeletonImpl
