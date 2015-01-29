package wbemdisp;

/**
 * COM Interface 'ISWbemSinkEvents'. Generated 21.04.2014 14:38:48
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A sink for events arising from asynchronous operations</B>'
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
public interface ISWbemSinkEvents extends java.util.EventListener {
  /**
   * OnObjectReady. Event triggered when an Object is available
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void OnObjectReady  (wbemdisp.ISWbemSinkEventsOnObjectReadyEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * OnCompleted. Event triggered when an asynchronous operation is completed
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void OnCompleted  (wbemdisp.ISWbemSinkEventsOnCompletedEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * OnProgress. Event triggered to report the progress of an asynchronous operation
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void OnProgress  (wbemdisp.ISWbemSinkEventsOnProgressEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * OnObjectPut. Event triggered when an object path is available following a Put operation
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void OnObjectPut  (wbemdisp.ISWbemSinkEventsOnObjectPutEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID75718ca0_f029_11d1_a1ac_00c04fb6c223 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemSinkEventsProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "00020400-0000-0000-C000-000000000046";
  String DISPID_1_NAME = "OnObjectReady";
  String DISPID_2_NAME = "OnCompleted";
  String DISPID_3_NAME = "OnProgress";
  String DISPID_4_NAME = "OnObjectPut";
}
