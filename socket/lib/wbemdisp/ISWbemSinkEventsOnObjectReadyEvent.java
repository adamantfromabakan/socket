package wbemdisp;

import com.linar.jintegra.*;

/**
 * Event Class 'ISWbemSinkEventsOnObjectReadyEvent'. Generated 21.04.2014 14:38:48
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
 *   ClashPrefix = ��=
 *   ImplementConflictingInterfaces = False
 *   DontRenameSameMethods = False
 *   RenameConflictingInterfaceMethods = False
 *   ReuseMethods = False
 *
 * Command Line Only Options:
 *   MakeClsidsPublic = False
 *   DontOverwrite = False
 */
public class ISWbemSinkEventsOnObjectReadyEvent extends java.util.EventObject {
  public ISWbemSinkEventsOnObjectReadyEvent(Object source) { super(source); }
  public void init(wbemdisp.ISWbemObject objWbemObject, wbemdisp.ISWbemNamedValueSet objWbemAsyncContext) {
    this.objWbemObject = objWbemObject;
    this.objWbemAsyncContext = objWbemAsyncContext;
  }

  wbemdisp.ISWbemObject objWbemObject;
  public final wbemdisp.ISWbemObject getObjWbemObject() { return objWbemObject; }
  wbemdisp.ISWbemNamedValueSet objWbemAsyncContext;
  public final wbemdisp.ISWbemNamedValueSet getObjWbemAsyncContext() { return objWbemAsyncContext; }
}