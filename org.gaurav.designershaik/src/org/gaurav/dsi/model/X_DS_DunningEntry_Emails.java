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
/** Generated Model - DO NOT CHANGE */
package org.gaurav.dsi.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for DS_DunningEntry_Emails
 *  @author iDempiere (generated) 
 *  @version Release 4.1 - $Id$ */
public class X_DS_DunningEntry_Emails extends PO implements I_DS_DunningEntry_Emails, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170806L;

    /** Standard Constructor */
    public X_DS_DunningEntry_Emails (Properties ctx, int DS_DunningEntry_Emails_ID, String trxName)
    {
      super (ctx, DS_DunningEntry_Emails_ID, trxName);
      /** if (DS_DunningEntry_Emails_ID == 0)
        {
			setDS_DunningEntry_Emails_ID (0);
        } */
    }

    /** Load Constructor */
    public X_DS_DunningEntry_Emails (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_DS_DunningEntry_Emails[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DunningRunEntry getC_DunningRunEntry() throws RuntimeException
    {
		return (org.compiere.model.I_C_DunningRunEntry)MTable.get(getCtx(), org.compiere.model.I_C_DunningRunEntry.Table_Name)
			.getPO(getC_DunningRunEntry_ID(), get_TrxName());	}

	/** Set Dunning Run Entry.
		@param C_DunningRunEntry_ID 
		Dunning Run Entry
	  */
	public void setC_DunningRunEntry_ID (int C_DunningRunEntry_ID)
	{
		if (C_DunningRunEntry_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_DunningRunEntry_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_DunningRunEntry_ID, Integer.valueOf(C_DunningRunEntry_ID));
	}

	/** Get Dunning Run Entry.
		@return Dunning Run Entry
	  */
	public int getC_DunningRunEntry_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningRunEntry_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Dunning Entry Emails.
		@param DS_DunningEntry_Emails_ID Dunning Entry Emails	  */
	public void setDS_DunningEntry_Emails_ID (int DS_DunningEntry_Emails_ID)
	{
		if (DS_DunningEntry_Emails_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_DS_DunningEntry_Emails_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_DS_DunningEntry_Emails_ID, Integer.valueOf(DS_DunningEntry_Emails_ID));
	}

	/** Get Dunning Entry Emails.
		@return Dunning Entry Emails	  */
	public int getDS_DunningEntry_Emails_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DS_DunningEntry_Emails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DS_DunningEntry_Emails_UU.
		@param DS_DunningEntry_Emails_UU DS_DunningEntry_Emails_UU	  */
	public void setDS_DunningEntry_Emails_UU (String DS_DunningEntry_Emails_UU)
	{
		set_Value (COLUMNNAME_DS_DunningEntry_Emails_UU, DS_DunningEntry_Emails_UU);
	}

	/** Get DS_DunningEntry_Emails_UU.
		@return DS_DunningEntry_Emails_UU	  */
	public String getDS_DunningEntry_Emails_UU () 
	{
		return (String)get_Value(COLUMNNAME_DS_DunningEntry_Emails_UU);
	}

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}
}