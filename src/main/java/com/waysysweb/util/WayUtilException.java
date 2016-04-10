//------------------------------------------------------------------------------
//      Compilation Unit Header
//------------------------------------------------------------------------------
//
//  Copyright (c) 1997 Waysys, Inc. All Rights Reserved.
//
//  Permission to use, copy, modify, and distribute this software
//  and its documentation for NON-COMMERCIAL purposes and without
//  fee is hereby granted provided that this copyright notice
//  appears in all copies.
//
//  Waysys MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
//  THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
//  TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
//  PARTICULAR PURPOSE, OR NON-INFRINGEMENT. Waysys SHALL NOT BE LIABLE FOR
//  ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
//  DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
//
//  For further information, contact Waysys Inc. at wshaffer@waysysweb.com
//  or 800-622-5315 (USA).
//
//------------------------------------------------------------------------------
//      Maintenance History
//------------------------------------------------------------------------------
//
//  Person    Date          Change
//  ------    -----------   ----------------------------------------------------
//
//  Shaffer   13-May-1997   File create
//  Shaffer   17-Jun-2000   Package name updated and adapted to JBuilder
//  Shaffer   07-Nov-2006   Adapted to Eclipse environment
//
//
//------------------------------------------------------------------------------
//      Package Declaration
//------------------------------------------------------------------------------

package com.waysysweb.util;

//------------------------------------------------------------------------------
//      Import Declarations
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
//      Public Class Declaration
//------------------------------------------------------------------------------

/**
 * General exceptions an error conditions.
 *
 * @author   William A. Shaffer
 * @version  1.00  02-May-1997
 */

public class WayUtilException extends WayException
{
    /**
     * The serial verion unique identifier for this class
     */
    private static final long serialVersionUID = 9703L;      
    
    /** Minimum error value */
	public final static int MIN_ERROR        =  Integer.MIN_VALUE;
    
    /** Base error number */
	public final static int BASE_ERROR       =  100;
    
    /** Illegal number */
	public final static int ILLEGAL_NUMBER   =  101;
    
    /** Maximum error value */
	public final static int MAX_ERROR        =  Integer.MAX_VALUE;

    /** Error number array */
	private final static int errNum[] =
	{
		MIN_ERROR,
		BASE_ERROR,
		ILLEGAL_NUMBER,
		MAX_ERROR
	};

    /** Error messages */
	private final static String errMessage[] =
	{
		/* MIN_VALUE */ "",
		/* 100 */       "",
		/* 101 */       "Illegal number: %.",
		/* MAX_VALUE */ ""
	};

	/**
	 * Create a WayUtilException
	 *
	 * @param errorNum the number identifying the error.
	 * @param arg an argument inserted into the error message.
	 */
	public WayUtilException(int errorNum, String arg)
	{
		super(errorNum, arg);
	}
	
	/**
	 * Return the error message associated with this exception
	 *
	 */
	public String getMessage()
	{
        String message = buildMessage(errNum, errMessage);
        return message;
	}
}