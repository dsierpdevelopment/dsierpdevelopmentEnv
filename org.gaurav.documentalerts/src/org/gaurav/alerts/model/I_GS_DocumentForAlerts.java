/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.gaurav.alerts.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;
import org.gaurav.payroll.model.I_GS_HR_Employee;
import org.gaurav.payroll.model.I_HR_Documents;

/** Generated Interface for GS_DocumentForAlerts
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_GS_DocumentForAlerts 
{

    /** TableName=GS_DocumentForAlerts */
    public static final String Table_Name = "GS_DocumentForAlerts";

    /** AD_Table_ID=1000187 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Image_ID */
    public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";

	/** Set Image.
	  * Image or Icon
	  */
	public void setAD_Image_ID (int AD_Image_ID);

	/** Get Image.
	  * Image or Icon
	  */
	public int getAD_Image_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name GS_DocumentForAlerts_ID */
    public static final String COLUMNNAME_GS_DocumentForAlerts_ID = "GS_DocumentForAlerts_ID";

	/** Set Alert Document	  */
	public void setGS_DocumentForAlerts_ID (int GS_DocumentForAlerts_ID);

	/** Get Alert Document	  */
	public int getGS_DocumentForAlerts_ID();

    /** Column name GS_DocumentForAlerts_UU */
    public static final String COLUMNNAME_GS_DocumentForAlerts_UU = "GS_DocumentForAlerts_UU";

	/** Set GS_DocumentForAlerts_UU	  */
	public void setGS_DocumentForAlerts_UU (String GS_DocumentForAlerts_UU);

	/** Get GS_DocumentForAlerts_UU	  */
	public String getGS_DocumentForAlerts_UU();

    /** Column name GS_HR_Employee_ID */
    public static final String COLUMNNAME_GS_HR_Employee_ID = "GS_HR_Employee_ID";

	/** Set Employee Details	  */
	public void setGS_HR_Employee_ID (int GS_HR_Employee_ID);

	/** Get Employee Details	  */
	public int getGS_HR_Employee_ID();

	public I_GS_HR_Employee getGS_HR_Employee() throws RuntimeException;

    /** Column name GS_HR_IssuedBy */
    public static final String COLUMNNAME_GS_HR_IssuedBy = "GS_HR_IssuedBy";

	/** Set Issued By.
	  * Issued by this place
	  */
	public void setGS_HR_IssuedBy (String GS_HR_IssuedBy);

	/** Get Issued By.
	  * Issued by this place
	  */
	public String getGS_HR_IssuedBy();

    /** Column name HR_Doc_ExpiryDate */
    public static final String COLUMNNAME_HR_Doc_ExpiryDate = "HR_Doc_ExpiryDate";

	/** Set Expiry Date.
	  * Expiry Date
	  */
	public void setHR_Doc_ExpiryDate (Timestamp HR_Doc_ExpiryDate);

	/** Get Expiry Date.
	  * Expiry Date
	  */
	public Timestamp getHR_Doc_ExpiryDate();

    /** Column name HR_Doc_IssueDate */
    public static final String COLUMNNAME_HR_Doc_IssueDate = "HR_Doc_IssueDate";

	/** Set Issue Date.
	  * Issue Date
	  */
	public void setHR_Doc_IssueDate (Timestamp HR_Doc_IssueDate);

	/** Get Issue Date.
	  * Issue Date
	  */
	public Timestamp getHR_Doc_IssueDate();

    /** Column name HR_DocNumber */
    public static final String COLUMNNAME_HR_DocNumber = "HR_DocNumber";

	/** Set Document No.
	  * Identity/Document No
	  */
	public void setHR_DocNumber (String HR_DocNumber);

	/** Get Document No.
	  * Identity/Document No
	  */
	public String getHR_DocNumber();

    /** Column name HR_Documents_ID */
    public static final String COLUMNNAME_HR_Documents_ID = "HR_Documents_ID";

	/** Set Documents	  */
	public void setHR_Documents_ID (int HR_Documents_ID);

	/** Get Documents	  */
	public int getHR_Documents_ID();

	public I_HR_Documents getHR_Documents() throws RuntimeException;

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
