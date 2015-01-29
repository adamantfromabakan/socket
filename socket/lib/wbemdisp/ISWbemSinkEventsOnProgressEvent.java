package wbemdisp;

import com.linar.jintegra.*;

/**
 * Event Class 'ISWbemSinkEventsOnProgressEvent'. Generated 21.04.2014 14:38:48
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb<P>'
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 *
 * Generator Options:
 *   AwtForOcxs = False
 *   PromptForTypeLibraries = False
 *   RetryOnReject = False
 *   IDispatchOnly = False
 *   GenBeanInfo = False
 *   LowerCaseMemberNames = False
 *   TreatInStarAsIn = False
 *   ArraysAsObjects = False
 *   OmitRestrictedMethods = False
 *   ClashPrefix = ав=
 *   ImplementConflictingInterfaces = False
 *   DontRenameSameMethods = False
 *   RenameConflictingInterfaceMethods = False
 *   ReuseMethods = False
 *
 * Command Line Only Options:
 *   MakeClsidsPublic = False
 *   DontOverwrite = False
 */
public class ISWbemSinkEventsOnProgressEvent extends java.util.EventObject {
  public ISWbemSinkEventsOnProgressEvent(Object source) { super(source); }
  public void init(int iUpperBound, int iCurrent, String strMessage, wbemdisp.ISWbemNamedValueSet objWbemAsyncContext) {
    this.iUpperBound = iUpperBound;
    this.iCurrent = iCurrent;
    this.strMessage = strMessage;
    this.objWbemAsyncContext = objWbemAsyncContext;
  }

  int iUpperBound;
  public final int getIUpperBound() { return iUpperBound; }
  int iCurrent;
  public final int getICurrent() { return iCurrent; }
  String strMessage;
  public final String getStrMessage() { return strMessage; }
  wbemdisp.ISWbemNamedValueSet objWbemAsyncContext;
  public final wbemdisp.ISWbemNamedValueSet getObjWbemAsyncContext() { return objWbemAsyncContext; }
}