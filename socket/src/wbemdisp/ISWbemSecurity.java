package wbemdisp;

/**
 * COM Interface 'ISWbemSecurity'. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Security Configurator</B>'
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
public interface ISWbemSecurity extends java.io.Serializable {
  /**
   * getImpersonationLevel. The security impersonation level
   *
   * @return    A wbemdisp.WbemImpersonationLevelEnum constant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getImpersonationLevel  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setImpersonationLevel. The security impersonation level
   *
   * @param     iImpersonationLevel A wbemdisp.WbemImpersonationLevelEnum constant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setImpersonationLevel  (
              int iImpersonationLevel) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getAuthenticationLevel. The security authentication level
   *
   * @return    A wbemdisp.WbemAuthenticationLevelEnum constant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getAuthenticationLevel  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setAuthenticationLevel. The security authentication level
   *
   * @param     iAuthenticationLevel A wbemdisp.WbemAuthenticationLevelEnum constant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setAuthenticationLevel  (
              int iAuthenticationLevel) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getPrivileges. The collection of privileges for this object
   *
   * @return    A reference to a wbemdisp.ISWbemPrivilegeSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilegeSet getPrivileges  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IIDb54d66e6_2287_11d2_8b33_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemSecurityProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "b54d66e6-2287-11d2-8b33-00600806d9b6";
  String DISPID_1_GET_NAME = "getImpersonationLevel";
  String DISPID_1_PUT_NAME = "setImpersonationLevel";
  String DISPID_2_GET_NAME = "getAuthenticationLevel";
  String DISPID_2_PUT_NAME = "setAuthenticationLevel";
  String DISPID_3_GET_NAME = "getPrivileges";
}
