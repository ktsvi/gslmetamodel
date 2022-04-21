/**
 */
package gamamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exportfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Exportfile#getFileName <em>File Name</em>}</li>
 *   <li>{@link gamamodel.Exportfile#getFileType <em>File Type</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getExportfile()
 * @model
 * @generated
 */
public interface Exportfile extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see gamamodel.GamamodelPackage#getExportfile_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link gamamodel.Exportfile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * The default value is <code>"csv"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see #setFileType(String)
	 * @see gamamodel.GamamodelPackage#getExportfile_FileType()
	 * @model default="csv"
	 * @generated
	 */
	String getFileType();

	/**
	 * Sets the value of the '{@link gamamodel.Exportfile#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(String value);

} // Exportfile
