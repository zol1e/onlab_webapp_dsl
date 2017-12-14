/**
 */
package views.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import views.Block;
import views.Navigation;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.NavigationImpl#getBlockNavigationItems <em>Block Navigation Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationImpl extends BlockImpl implements Navigation {
	/**
	 * The cached value of the '{@link #getBlockNavigationItems() <em>Block Navigation Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockNavigationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blockNavigationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlockNavigationItems() {
		if (blockNavigationItems == null) {
			blockNavigationItems = new EObjectResolvingEList<Block>(Block.class, this, ViewsPackage.NAVIGATION__BLOCK_NAVIGATION_ITEMS);
		}
		return blockNavigationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.NAVIGATION__BLOCK_NAVIGATION_ITEMS:
				return getBlockNavigationItems();
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
			case ViewsPackage.NAVIGATION__BLOCK_NAVIGATION_ITEMS:
				getBlockNavigationItems().clear();
				getBlockNavigationItems().addAll((Collection<? extends Block>)newValue);
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
			case ViewsPackage.NAVIGATION__BLOCK_NAVIGATION_ITEMS:
				getBlockNavigationItems().clear();
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
			case ViewsPackage.NAVIGATION__BLOCK_NAVIGATION_ITEMS:
				return blockNavigationItems != null && !blockNavigationItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationImpl
