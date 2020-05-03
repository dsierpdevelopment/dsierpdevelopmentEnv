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
package org.gaurav.dsi.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for DS_B2B_Configuration
 *  @author iDempiere (generated) 
 *  @version Release 4.1
 */
@SuppressWarnings("all")
public interface I_DS_B2B_Configuration 
{

    /** TableName=DS_B2B_Configuration */
    public static final String Table_Name = "DS_B2B_Configuration";

    /** AD_Table_ID=1000074 */
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

    /** Column name AD_PrintFormat_ID */
    public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";

	/** Set Print Format.
	  * Data Print Format
	  */
	public void setAD_PrintFormat_ID (int AD_PrintFormat_ID);

	/** Get Print Format.
	  * Data Print Format
	  */
	public int getAD_PrintFormat_ID();

	public org.compiere.model.I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

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

    /** Column name DS_B2B_Configuration_ID */
    public static final String COLUMNNAME_DS_B2B_Configuration_ID = "DS_B2B_Configuration_ID";

	/** Set B2B configuration	  */
	public void setDS_B2B_Configuration_ID (int DS_B2B_Configuration_ID);

	/** Get B2B configuration	  */
	public int getDS_B2B_Configuration_ID();

    /** Column name DS_B2B_Configuration_UU */
    public static final String COLUMNNAME_DS_B2B_Configuration_UU = "DS_B2B_Configuration_UU";

	/** Set DS_B2B_Configuration_UU	  */
	public void setDS_B2B_Configuration_UU (String DS_B2B_Configuration_UU);

	/** Get DS_B2B_Configuration_UU	  */
	public String getDS_B2B_Configuration_UU();

    /** Column name DS_SftpHost */
    public static final String COLUMNNAME_DS_SftpHost = "DS_SftpHost";

	/** Set Sftp Host.
	  * Sftp host for B2B file upload
	  */
	public void setDS_SftpHost (String DS_SftpHost);

	/** Get Sftp Host.
	  * Sftp host for B2B file upload
	  */
	public String getDS_SftpHost();

    /** Column name DS_SftpPassword */
    public static final String COLUMNNAME_DS_SftpPassword = "DS_SftpPassword";

	/** Set Sftp Password.
	  * Sftp password for B2B file upload
	  */
	public void setDS_SftpPassword (String DS_SftpPassword);

	/** Get Sftp Password.
	  * Sftp password for B2B file upload
	  */
	public String getDS_SftpPassword();

    /** Column name DS_SftpPort */
    public static final String COLUMNNAME_DS_SftpPort = "DS_SftpPort";

	/** Set Sftp Port.
	  * Sftp port for B2B file upload
	  */
	public void setDS_SftpPort (int DS_SftpPort);

	/** Get Sftp Port.
	  * Sftp port for B2B file upload
	  */
	public int getDS_SftpPort();

    /** Column name DS_SftpUser */
    public static final String COLUMNNAME_DS_SftpUser = "DS_SftpUser";

	/** Set Sftp User.
	  * Sftp user for B2B file upload
	  */
	public void setDS_SftpUser (String DS_SftpUser);

	/** Get Sftp User.
	  * Sftp user for B2B file upload
	  */
	public String getDS_SftpUser();

    /** Column name DS_SftpWorkingDir */
    public static final String COLUMNNAME_DS_SftpWorkingDir = "DS_SftpWorkingDir";

	/** Set Sftp Working Director.
	  * Sftp working directory to upload the files
	  */
	public void setDS_SftpWorkingDir (String DS_SftpWorkingDir);

	/** Get Sftp Working Director.
	  * Sftp working directory to upload the files
	  */
	public String getDS_SftpWorkingDir();

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

    /** Column name R_MailText_ID */
    public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";

	/** Set Mail Template.
	  * Text templates for mailings
	  */
	public void setR_MailText_ID (int R_MailText_ID);

	/** Get Mail Template.
	  * Text templates for mailings
	  */
	public int getR_MailText_ID();

	public org.compiere.model.I_R_MailText getR_MailText() throws RuntimeException;

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
