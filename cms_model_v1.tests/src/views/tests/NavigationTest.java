/**
 */
package views.tests;

import junit.textui.TestRunner;

import views.Navigation;
import views.ViewsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationTest extends BlockTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NavigationTest.class);
	}

	/**
	 * Constructs a new Navigation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Navigation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Navigation getFixture() {
		return (Navigation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createNavigation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NavigationTest
