package wbemdisp;

/**
 * COM Interface 'ISWbemLocator'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>Used to obtain Namespace connections</B>'
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
public interface ISWbemLocator {
  /**
   * ConnectServer. Connect to a Namespace
   *
   * @param     strServer The strServer (in, optional, pass . if not required)
   * @param     strNamespace The strNamespace (in, optional, pass  if not required)
   * @param     strUser The strUser (in, optional, pass  if not required)
   * @param     strPassword The strPassword (in, optional, pass  if not required)
   * @param     strLocale The strLocale (in, optional, pass  if not required)
   * @param     strAuthority The strAuthority (in, optional, pass  if not required)
   * @param     iSecurityFlags The iSecurityFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemServices
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemServices ConnectServer  (
              String strServer,
              String strNamespace,
              String strUser,
              String strPassword,
              String strLocale,
              String strAuthority,
              int iSecurityFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getSecurity_. The Security Configurator for this Object
   *
   * @return    A reference to a wbemdisp.ISWbemSecurity
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemSecurity getSecurity_  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID76a6415b_cb41_11d1_8b02_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemLocatorProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "76a6415b-cb41-11d1-8b02-00600806d9b6";
  String DISPID_1_NAME = "ConnectServer";
  String DISPID_2_GET_NAME = "getSecurity_";
}
