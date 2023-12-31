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
package org.gaurav.payroll.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for GS_HR_MonthlySalary
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_GS_HR_MonthlySalary extends PO implements I_GS_HR_MonthlySalary, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210321L;

    /** Standard Constructor */
    public X_GS_HR_MonthlySalary (Properties ctx, int GS_HR_MonthlySalary_ID, String trxName)
    {
      super (ctx, GS_HR_MonthlySalary_ID, trxName);
      /** if (GS_HR_MonthlySalary_ID == 0)
        {
			setGS_HR_MonthlySalary_ID (0);
			setGS_HR_SalaryMonths_ID (0);
        } */
    }

    /** Load Constructor */
    public X_GS_HR_MonthlySalary (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_GS_HR_MonthlySalary[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException
    {
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_Name)
			.getPO(getC_Year_ID(), get_TrxName());	}

	/** Set Year.
		@param C_Year_ID 
		Calendar Year
	  */
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1) 
			set_Value (COLUMNNAME_C_Year_ID, null);
		else 
			set_Value (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Delete Calculated Salaries.
		@param GS_HR_DeleteSalaries 
		Delete Calculated Salaries
	  */
	public void setGS_HR_DeleteSalaries (String GS_HR_DeleteSalaries)
	{
		set_Value (COLUMNNAME_GS_HR_DeleteSalaries, GS_HR_DeleteSalaries);
	}

	/** Get Delete Calculated Salaries.
		@return Delete Calculated Salaries
	  */
	public String getGS_HR_DeleteSalaries () 
	{
		return (String)get_Value(COLUMNNAME_GS_HR_DeleteSalaries);
	}

	/** Set Monthly Salary.
		@param GS_HR_MonthlySalary_ID Monthly Salary	  */
	public void setGS_HR_MonthlySalary_ID (int GS_HR_MonthlySalary_ID)
	{
		if (GS_HR_MonthlySalary_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_GS_HR_MonthlySalary_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_GS_HR_MonthlySalary_ID, Integer.valueOf(GS_HR_MonthlySalary_ID));
	}

	/** Get Monthly Salary.
		@return Monthly Salary	  */
	public int getGS_HR_MonthlySalary_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GS_HR_MonthlySalary_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GS_HR_MonthlySalary_UU.
		@param GS_HR_MonthlySalary_UU GS_HR_MonthlySalary_UU	  */
	public void setGS_HR_MonthlySalary_UU (String GS_HR_MonthlySalary_UU)
	{
		set_Value (COLUMNNAME_GS_HR_MonthlySalary_UU, GS_HR_MonthlySalary_UU);
	}

	/** Get GS_HR_MonthlySalary_UU.
		@return GS_HR_MonthlySalary_UU	  */
	public String getGS_HR_MonthlySalary_UU () 
	{
		return (String)get_Value(COLUMNNAME_GS_HR_MonthlySalary_UU);
	}

	/** Set Salary Date.
		@param GS_HR_SalaryDate 
		Salary Calculation Date
	  */
	public void setGS_HR_SalaryDate (Timestamp GS_HR_SalaryDate)
	{
		set_Value (COLUMNNAME_GS_HR_SalaryDate, GS_HR_SalaryDate);
	}

	/** Get Salary Date.
		@return Salary Calculation Date
	  */
	public Timestamp getGS_HR_SalaryDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_GS_HR_SalaryDate);
	}

	public I_GS_HR_SalaryMonths getGS_HR_SalaryMonths() throws RuntimeException
    {
		return (I_GS_HR_SalaryMonths)MTable.get(getCtx(), I_GS_HR_SalaryMonths.Table_Name)
			.getPO(getGS_HR_SalaryMonths_ID(), get_TrxName());	}

	/** Set Salary Months.
		@param GS_HR_SalaryMonths_ID Salary Months	  */
	public void setGS_HR_SalaryMonths_ID (int GS_HR_SalaryMonths_ID)
	{
		if (GS_HR_SalaryMonths_ID < 1) 
			set_Value (COLUMNNAME_GS_HR_SalaryMonths_ID, null);
		else 
			set_Value (COLUMNNAME_GS_HR_SalaryMonths_ID, Integer.valueOf(GS_HR_SalaryMonths_ID));
	}

	/** Get Salary Months.
		@return Salary Months	  */
	public int getGS_HR_SalaryMonths_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GS_HR_SalaryMonths_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getGS_HR_SalaryMonths_ID()));
    }

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Year.
		@param Year Year	  */
	public void setYear (int Year)
	{
		set_Value (COLUMNNAME_Year, Integer.valueOf(Year));
	}

	/** Get Year.
		@return Year	  */
	public int getYear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Year);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}