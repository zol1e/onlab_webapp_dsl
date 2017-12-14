/**
 */
package entities;

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
 * @see entities.EntitiesFactory
 * @model kind="package"
 * @generated
 */
public interface EntitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "entities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntitiesPackage eINSTANCE = entities.impl.EntitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link entities.impl.SkeletonImpl <em>Skeleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.SkeletonImpl
	 * @see entities.impl.EntitiesPackageImpl#getSkeleton()
	 * @generated
	 */
	int SKELETON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON__BONES = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON__CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Refered To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON__REFERED_TO = 3;

	/**
	 * The number of structural features of the '<em>Skeleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Skeleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entities.impl.BoneImpl <em>Bone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.BoneImpl
	 * @see entities.impl.EntitiesPackageImpl#getBone()
	 * @generated
	 */
	int BONE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONE__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Bone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entities.impl.EntityBaseImpl <em>Entity Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.EntityBaseImpl
	 * @see entities.impl.EntitiesPackageImpl#getEntityBase()
	 * @generated
	 */
	int ENTITY_BASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Skeletons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BASE__SKELETONS = 1;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BASE__DATATYPES = 2;

	/**
	 * The number of structural features of the '<em>Entity Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entities.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.ConnectionImpl
	 * @see entities.impl.EntitiesPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REFERED = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entities.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.DataTypeImpl
	 * @see entities.impl.EntitiesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link entities.Skeleton <em>Skeleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeleton</em>'.
	 * @see entities.Skeleton
	 * @generated
	 */
	EClass getSkeleton();

	/**
	 * Returns the meta object for the attribute '{@link entities.Skeleton#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entities.Skeleton#getName()
	 * @see #getSkeleton()
	 * @generated
	 */
	EAttribute getSkeleton_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link entities.Skeleton#getBones <em>Bones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bones</em>'.
	 * @see entities.Skeleton#getBones()
	 * @see #getSkeleton()
	 * @generated
	 */
	EReference getSkeleton_Bones();

	/**
	 * Returns the meta object for the containment reference list '{@link entities.Skeleton#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see entities.Skeleton#getConnections()
	 * @see #getSkeleton()
	 * @generated
	 */
	EReference getSkeleton_Connections();

	/**
	 * Returns the meta object for the reference list '{@link entities.Skeleton#getReferedTo <em>Refered To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refered To</em>'.
	 * @see entities.Skeleton#getReferedTo()
	 * @see #getSkeleton()
	 * @generated
	 */
	EReference getSkeleton_ReferedTo();

	/**
	 * Returns the meta object for class '{@link entities.Bone <em>Bone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bone</em>'.
	 * @see entities.Bone
	 * @generated
	 */
	EClass getBone();

	/**
	 * Returns the meta object for the attribute '{@link entities.Bone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entities.Bone#getName()
	 * @see #getBone()
	 * @generated
	 */
	EAttribute getBone_Name();

	/**
	 * Returns the meta object for the reference '{@link entities.Bone#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see entities.Bone#getDatatype()
	 * @see #getBone()
	 * @generated
	 */
	EReference getBone_Datatype();

	/**
	 * Returns the meta object for class '{@link entities.EntityBase <em>Entity Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Base</em>'.
	 * @see entities.EntityBase
	 * @generated
	 */
	EClass getEntityBase();

	/**
	 * Returns the meta object for the attribute '{@link entities.EntityBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entities.EntityBase#getName()
	 * @see #getEntityBase()
	 * @generated
	 */
	EAttribute getEntityBase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link entities.EntityBase#getSkeletons <em>Skeletons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skeletons</em>'.
	 * @see entities.EntityBase#getSkeletons()
	 * @see #getEntityBase()
	 * @generated
	 */
	EReference getEntityBase_Skeletons();

	/**
	 * Returns the meta object for the containment reference list '{@link entities.EntityBase#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see entities.EntityBase#getDatatypes()
	 * @see #getEntityBase()
	 * @generated
	 */
	EReference getEntityBase_Datatypes();

	/**
	 * Returns the meta object for class '{@link entities.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see entities.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link entities.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entities.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the reference '{@link entities.Connection#getRefered <em>Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refered</em>'.
	 * @see entities.Connection#getRefered()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Refered();

	/**
	 * Returns the meta object for class '{@link entities.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see entities.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link entities.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entities.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntitiesFactory getEntitiesFactory();

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
		 * The meta object literal for the '{@link entities.impl.SkeletonImpl <em>Skeleton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.SkeletonImpl
		 * @see entities.impl.EntitiesPackageImpl#getSkeleton()
		 * @generated
		 */
		EClass SKELETON = eINSTANCE.getSkeleton();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKELETON__NAME = eINSTANCE.getSkeleton_Name();

		/**
		 * The meta object literal for the '<em><b>Bones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKELETON__BONES = eINSTANCE.getSkeleton_Bones();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKELETON__CONNECTIONS = eINSTANCE.getSkeleton_Connections();

		/**
		 * The meta object literal for the '<em><b>Refered To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKELETON__REFERED_TO = eINSTANCE.getSkeleton_ReferedTo();

		/**
		 * The meta object literal for the '{@link entities.impl.BoneImpl <em>Bone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.BoneImpl
		 * @see entities.impl.EntitiesPackageImpl#getBone()
		 * @generated
		 */
		EClass BONE = eINSTANCE.getBone();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BONE__NAME = eINSTANCE.getBone_Name();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BONE__DATATYPE = eINSTANCE.getBone_Datatype();

		/**
		 * The meta object literal for the '{@link entities.impl.EntityBaseImpl <em>Entity Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.EntityBaseImpl
		 * @see entities.impl.EntitiesPackageImpl#getEntityBase()
		 * @generated
		 */
		EClass ENTITY_BASE = eINSTANCE.getEntityBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BASE__NAME = eINSTANCE.getEntityBase_Name();

		/**
		 * The meta object literal for the '<em><b>Skeletons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BASE__SKELETONS = eINSTANCE.getEntityBase_Skeletons();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BASE__DATATYPES = eINSTANCE.getEntityBase_Datatypes();

		/**
		 * The meta object literal for the '{@link entities.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.ConnectionImpl
		 * @see entities.impl.EntitiesPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Refered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__REFERED = eINSTANCE.getConnection_Refered();

		/**
		 * The meta object literal for the '{@link entities.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.DataTypeImpl
		 * @see entities.impl.EntitiesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

	}

} //EntitiesPackage
