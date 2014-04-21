package wbemdisp;

import com.linar.jintegra.*;

/**
 * Event Class 'ISWbemSinkEventsOnCompletedEvent'. Generated 18.04.2014 15:20:21
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
 *   LowerCaseMemberNames = True
 *   TreatInStarAsIn = False
 *   ArraysAsObjects = False
 *   OmitRestrictedMethods = False
 *   ClashPrefix = zz_
 *   ImplementConflictingInterfaces = False
 *   DontRenameSameMethods = False
 *   RenameConflictingInterfaceMethods = False
 *   ReuseMethods = False
 *
 * Command Line Only Options:
 *   MakeClsidsPublic = False
 *   DontOverwrite = False
 */
public class ISWbemSinkEventsOnCompletedEvent extends java.util.EventObject {
  public ISWbemSinkEventsOnCompletedEvent(Object source) { super(source); }
  public void init(int iHResult, wbemdisp.ISWbemObject objWbemErrorObject, wbemdisp.ISWbemNamedValueSet objWbemAsyncContext) {
    this.iHResult = iHResult;
    this.objWbemErrorObject = objWbemErrorObject;
    this.objWbemAsyncContext = objWbemAsyncContext;
  }

  int iHResult;
  public final int getIHResult() { return iHResult; }
  wbemdisp.ISWbemObject objWbemErrorObject;
  public final wbemdisp.ISWbemObject getObjWbemErrorObject() { return objWbemErrorObject; }
  wbemdisp.ISWbemNamedValueSet objWbemAsyncContext;
  public final wbemdisp.ISWbemNamedValueSet getObjWbemAsyncContext() { return objWbemAsyncContext; }
}