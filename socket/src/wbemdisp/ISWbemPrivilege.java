package wbemdisp;

/**
 * COM Interface 'ISWbemPrivilege'. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Privilege Override</B>'
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
public interface ISWbemPrivilege extends java.io.Serializable {
  /**
   * isEnabled. Whether the Privilege is to be enabled or disabled
   *
   * @return    The bIsEnabled
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isEnabled  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setIsEnabled. Whether the Privilege is to be enabled or disabled
   *
   * @param     bIsEnabled The bIsEnabled (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setIsEnabled  (
              boolean bIsEnabled) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getName. The name of the Privilege
   *
   * @return    The strDisplayName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getName  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getDisplayName. The display name of the Privilege
   *
   * @return    The strDisplayName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getDisplayName  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getIdentifier. The Privilege identifier
   *
   * @return    A wbemdisp.WbemPrivilegeEnum constant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getIdentifier  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID26ee67bd_5804_11d2_8b4a_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemPrivilegeProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "26ee67bd-5804-11d2-8b4a-00600806d9b6";
  String DISPID_0_GET_NAME = "isEnabled";
  String DISPID_0_PUT_NAME = "setIsEnabled";
  String DISPID_1_GET_NAME = "getName";
  String DISPID_2_GET_NAME = "getDisplayName";
  String DISPID_3_GET_NAME = "getIdentifier";
}
