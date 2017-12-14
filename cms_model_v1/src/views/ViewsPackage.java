/**
 */
package views;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link views.impl.ViewBaseImpl <em>View Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewBaseImpl
	 * @see views.impl.ViewsPackageImpl#getViewBase()
	 * @generated
	 */
	int VIEW_BASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BASE__PAGES = 1;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BASE__BLOCKS = 2;

	/**
	 * The number of structural features of the '<em>View Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.PageImpl
	 * @see views.impl.ViewsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Block Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BLOCK_HOLDERS = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.BlockHolderImpl <em>Block Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.BlockHolderImpl
	 * @see views.impl.ViewsPackageImpl#getBlockHolder()
	 * @generated
	 */
	int BLOCK_HOLDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_HOLDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_HOLDER__DEFAULT_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Navigation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_HOLDER__NAVIGATION_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_HOLDER__STYLE = 3;

	/**
	 * The number of structural features of the '<em>Block Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_HOLDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Block Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_HOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.BlockImpl
	 * @see views.impl.ViewsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Block Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_HOLDERS = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ListImpl
	 * @see views.impl.ViewsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Block Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BLOCK_HOLDERS = BLOCK__BLOCK_HOLDERS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__STYLE = BLOCK__STYLE;

	/**
	 * The feature id for the '<em><b>Skeletons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SKELETONS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Bones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LIST_BONES = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewImpl
	 * @see views.impl.ViewsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Block Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BLOCK_HOLDERS = BLOCK__BLOCK_HOLDERS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__STYLE = BLOCK__STYLE;

	/**
	 * The feature id for the '<em><b>Skeleton</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SKELETON = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Bones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_BONES = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_CONNECTIONS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.NavigationImpl <em>Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.NavigationImpl
	 * @see views.impl.ViewsPackageImpl#getNavigation()
	 * @generated
	 */
	int NAVIGATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Block Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__BLOCK_HOLDERS = BLOCK__BLOCK_HOLDERS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__STYLE = BLOCK__STYLE;

	/**
	 * The feature id for the '<em><b>Block Navigation Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__BLOCK_NAVIGATION_ITEMS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link views.ViewBase <em>View Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Base</em>'.
	 * @see views.ViewBase
	 * @generated
	 */
	EClass getViewBase();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.ViewBase#getName()
	 * @see #getViewBase()
	 * @generated
	 */
	EAttribute getViewBase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ViewBase#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see views.ViewBase#getPages()
	 * @see #getViewBase()
	 * @generated
	 */
	EReference getViewBase_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ViewBase#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see views.ViewBase#getBlocks()
	 * @see #getViewBase()
	 * @generated
	 */
	EReference getViewBase_Blocks();

	/**
	 * Returns the meta object for class '{@link views.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see views.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link views.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Page#getBlockHolders <em>Block Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Holders</em>'.
	 * @see views.Page#getBlockHolders()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_BlockHolders();

	/**
	 * Returns the meta object for class '{@link views.BlockHolder <em>Block Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Holder</em>'.
	 * @see views.BlockHolder
	 * @generated
	 */
	EClass getBlockHolder();

	/**
	 * Returns the meta object for the attribute '{@link views.BlockHolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.BlockHolder#getName()
	 * @see #getBlockHolder()
	 * @generated
	 */
	EAttribute getBlockHolder_Name();

	/**
	 * Returns the meta object for the reference '{@link views.BlockHolder#getDefaultBlock <em>Default Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Block</em>'.
	 * @see views.BlockHolder#getDefaultBlock()
	 * @see #getBlockHolder()
	 * @generated
	 */
	EReference getBlockHolder_DefaultBlock();

	/**
	 * Returns the meta object for the reference '{@link views.BlockHolder#getNavigationTarget <em>Navigation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Navigation Target</em>'.
	 * @see views.BlockHolder#getNavigationTarget()
	 * @see #getBlockHolder()
	 * @generated
	 */
	EReference getBlockHolder_NavigationTarget();

	/**
	 * Returns the meta object for the attribute '{@link views.BlockHolder#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see views.BlockHolder#getStyle()
	 * @see #getBlockHolder()
	 * @generated
	 */
	EAttribute getBlockHolder_Style();

	/**
	 * Returns the meta object for class '{@link views.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see views.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link views.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Block#getBlockHolders <em>Block Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Holders</em>'.
	 * @see views.Block#getBlockHolders()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_BlockHolders();

	/**
	 * Returns the meta object for the attribute '{@link views.Block#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see views.Block#getStyle()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Style();

	/**
	 * Returns the meta object for class '{@link views.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see views.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the reference list '{@link views.List#getSkeletons <em>Skeletons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skeletons</em>'.
	 * @see views.List#getSkeletons()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Skeletons();

	/**
	 * Returns the meta object for the reference list '{@link views.List#getListBones <em>List Bones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Bones</em>'.
	 * @see views.List#getListBones()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ListBones();

	/**
	 * Returns the meta object for the reference '{@link views.List#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see views.List#getView()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_View();

	/**
	 * Returns the meta object for class '{@link views.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see views.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference '{@link views.View#getSkeleton <em>Skeleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skeleton</em>'.
	 * @see views.View#getSkeleton()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Skeleton();

	/**
	 * Returns the meta object for the reference list '{@link views.View#getViewBones <em>View Bones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View Bones</em>'.
	 * @see views.View#getViewBones()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewBones();

	/**
	 * Returns the meta object for the reference list '{@link views.View#getViewConnections <em>View Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View Connections</em>'.
	 * @see views.View#getViewConnections()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewConnections();

	/**
	 * Returns the meta object for class '{@link views.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation</em>'.
	 * @see views.Navigation
	 * @generated
	 */
	EClass getNavigation();

	/**
	 * Returns the meta object for the reference list '{@link views.Navigation#getBlockNavigationItems <em>Block Navigation Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Block Navigation Items</em>'.
	 * @see views.Navigation#getBlockNavigationItems()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_BlockNavigationItems();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link views.impl.ViewBaseImpl <em>View Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewBaseImpl
		 * @see views.impl.ViewsPackageImpl#getViewBase()
		 * @generated
		 */
		EClass VIEW_BASE = eINSTANCE.getViewBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_BASE__NAME = eINSTANCE.getViewBase_Name();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_BASE__PAGES = eINSTANCE.getViewBase_Pages();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_BASE__BLOCKS = eINSTANCE.getViewBase_Blocks();

		/**
		 * The meta object literal for the '{@link views.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.PageImpl
		 * @see views.impl.ViewsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Block Holders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__BLOCK_HOLDERS = eINSTANCE.getPage_BlockHolders();

		/**
		 * The meta object literal for the '{@link views.impl.BlockHolderImpl <em>Block Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.BlockHolderImpl
		 * @see views.impl.ViewsPackageImpl#getBlockHolder()
		 * @generated
		 */
		EClass BLOCK_HOLDER = eINSTANCE.getBlockHolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_HOLDER__NAME = eINSTANCE.getBlockHolder_Name();

		/**
		 * The meta object literal for the '<em><b>Default Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_HOLDER__DEFAULT_BLOCK = eINSTANCE.getBlockHolder_DefaultBlock();

		/**
		 * The meta object literal for the '<em><b>Navigation Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_HOLDER__NAVIGATION_TARGET = eINSTANCE.getBlockHolder_NavigationTarget();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_HOLDER__STYLE = eINSTANCE.getBlockHolder_Style();

		/**
		 * The meta object literal for the '{@link views.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.BlockImpl
		 * @see views.impl.ViewsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Block Holders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCK_HOLDERS = eINSTANCE.getBlock_BlockHolders();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__STYLE = eINSTANCE.getBlock_Style();

		/**
		 * The meta object literal for the '{@link views.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ListImpl
		 * @see views.impl.ViewsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Skeletons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__SKELETONS = eINSTANCE.getList_Skeletons();

		/**
		 * The meta object literal for the '<em><b>List Bones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__LIST_BONES = eINSTANCE.getList_ListBones();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__VIEW = eINSTANCE.getList_View();

		/**
		 * The meta object literal for the '{@link views.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewImpl
		 * @see views.impl.ViewsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Skeleton</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SKELETON = eINSTANCE.getView_Skeleton();

		/**
		 * The meta object literal for the '<em><b>View Bones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_BONES = eINSTANCE.getView_ViewBones();

		/**
		 * The meta object literal for the '<em><b>View Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_CONNECTIONS = eINSTANCE.getView_ViewConnections();

		/**
		 * The meta object literal for the '{@link views.impl.NavigationImpl <em>Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.NavigationImpl
		 * @see views.impl.ViewsPackageImpl#getNavigation()
		 * @generated
		 */
		EClass NAVIGATION = eINSTANCE.getNavigation();

		/**
		 * The meta object literal for the '<em><b>Block Navigation Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__BLOCK_NAVIGATION_ITEMS = eINSTANCE.getNavigation_BlockNavigationItems();

	}

} //ViewsPackage
