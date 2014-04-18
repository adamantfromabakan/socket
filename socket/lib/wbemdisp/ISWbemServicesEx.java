package wbemdisp;

/**
 * COM Interface 'ISWbemServicesEx'. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A connection to a Namespace</B>'
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
public interface ISWbemServicesEx extends wbemdisp.ISWbemServices, java.io.Serializable {
  /**
   * put. Save the Object to this Namespace
   *
   * @param     objWbemObject A reference to a wbemdisp.ISWbemObjectEx (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectPath put  (
              wbemdisp.ISWbemObjectEx objWbemObject,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * putAsync. Save the Object to this Namespace asynchronously
   *
   * @param     objWbemSink A reference to a wbemdisp.ISWbemSink (in)
   * @param     objWbemObject A reference to a wbemdisp.ISWbemObjectEx (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void putAsync  (
              wbemdisp.ISWbemSink objWbemSink,
              wbemdisp.ISWbemObjectEx objWbemObject,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IIDd2f68443_85dc_427e_91d8_366554cc754c = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemServicesExProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "d2f68443-85dc-427e-91d8-366554cc754c";
  String DISPID_20_NAME = "put";
  String DISPID_21_NAME = "putAsync";
}
