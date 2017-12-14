/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.Block;
import views.BlockHolder;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.BlockHolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link views.impl.BlockHolderImpl#getDefaultBlock <em>Default Block</em>}</li>
 *   <li>{@link views.impl.BlockHolderImpl#getNavigationTarget <em>Navigation Target</em>}</li>
 *   <li>{@link views.impl.BlockHolderImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockHolderImpl extends MinimalEObjectImpl.Container implements BlockHolder {
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
	 * The cached value of the '{@link #getDefaultBlock() <em>Default Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBlock()
	 * @generated
	 * @ordered
	 */
	protected Block defaultBlock;

	/**
	 * The cached value of the '{@link #getNavigationTarget() <em>Navigation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationTarget()
	 * @generated
	 * @ordered
	 */
	protected BlockHolder navigationTarget;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.BLOCK_HOLDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.BLOCK_HOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getDefaultBlock() {
		if (defaultBlock != null && defaultBlock.eIsProxy()) {
			InternalEObject oldDefaultBlock = (InternalEObject)defaultBlock;
			defaultBlock = (Block)eResolveProxy(oldDefaultBlock);
			if (defaultBlock != oldDefaultBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.BLOCK_HOLDER__DEFAULT_BLOCK, oldDefaultBlock, defaultBlock));
			}
		}
		return defaultBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetDefaultBlock() {
		return defaultBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultBlock(Block newDefaultBlock) {
		Block oldDefaultBlock = defaultBlock;
		defaultBlock = newDefaultBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.BLOCK_HOLDER__DEFAULT_BLOCK, oldDefaultBlock, defaultBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockHolder getNavigationTarget() {
		if (navigationTarget != null && navigationTarget.eIsProxy()) {
			InternalEObject oldNavigationTarget = (InternalEObject)navigationTarget;
			navigationTarget = (BlockHolder)eResolveProxy(oldNavigationTarget);
			if (navigationTarget != oldNavigationTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.BLOCK_HOLDER__NAVIGATION_TARGET, oldNavigationTarget, navigationTarget));
			}
		}
		return navigationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockHolder basicGetNavigationTarget() {
		return navigationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationTarget(BlockHolder newNavigationTarget) {
		BlockHolder oldNavigationTarget = navigationTarget;
		navigationTarget = newNavigationTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.BLOCK_HOLDER__NAVIGATION_TARGET, oldNavigationTarget, navigationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.BLOCK_HOLDER__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.BLOCK_HOLDER__NAME:
				return getName();
			case ViewsPackage.BLOCK_HOLDER__DEFAULT_BLOCK:
				if (resolve) return getDefaultBlock();
				return basicGetDefaultBlock();
			case ViewsPackage.BLOCK_HOLDER__NAVIGATION_TARGET:
				if (resolve) return getNavigationTarget();
				return basicGetNavigationTarget();
			case ViewsPackage.BLOCK_HOLDER__STYLE:
				return getStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.BLOCK_HOLDER__NAME:
				setName((String)newValue);
				return;
			case ViewsPackage.BLOCK_HOLDER__DEFAULT_BLOCK:
				setDefaultBlock((Block)newValue);
				return;
			case ViewsPackage.BLOCK_HOLDER__NAVIGATION_TARGET:
				setNavigationTarget((BlockHolder)newValue);
				return;
			case ViewsPackage.BLOCK_HOLDER__STYLE:
				setStyle((String)newValue);
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
			case ViewsPackage.BLOCK_HOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewsPackage.BLOCK_HOLDER__DEFAULT_BLOCK:
				setDefaultBlock((Block)null);
				return;
			case ViewsPackage.BLOCK_HOLDER__NAVIGATION_TARGET:
				setNavigationTarget((BlockHolder)null);
				return;
			case ViewsPackage.BLOCK_HOLDER__STYLE:
				setStyle(STYLE_EDEFAULT);
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
			case ViewsPackage.BLOCK_HOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewsPackage.BLOCK_HOLDER__DEFAULT_BLOCK:
				return defaultBlock != null;
			case ViewsPackage.BLOCK_HOLDER__NAVIGATION_TARGET:
				return navigationTarget != null;
			case ViewsPackage.BLOCK_HOLDER__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
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
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //BlockHolderImpl
