package wbemdisp;

/**
 * COM Interface 'ISWbemObjectPath'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>An Object path</B>'
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
public interface ISWbemObjectPath {
  /**
   * getPath. The full path
   *
   * @return    The strPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getPath  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setPath. The full path
   *
   * @param     strPath The strPath (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setPath  (
              String strPath) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getRelPath. The relative path
   *
   * @return    The strRelPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getRelPath  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setRelPath. The relative path
   *
   * @param     strRelPath The strRelPath (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setRelPath  (
              String strRelPath) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getServer. The name of the Server
   *
   * @return    The strServer
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getServer  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setServer. The name of the Server
   *
   * @param     strServer The strServer (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setServer  (
              String strServer) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getNamespace. The Namespace path
   *
   * @return    The strNamespace
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getNamespace  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setNamespace. The Namespace path
   *
   * @param     strNamespace The strNamespace (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setNamespace  (
              String strNamespace) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getParentNamespace. The parent Namespace path
   *
   * @return    The strParentNamespace
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getParentNamespace  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getDisplayName. The Display Name for this path
   *
   * @return    The strDisplayName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getDisplayName  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setDisplayName. The Display Name for this path
   *
   * @param     strDisplayName The strDisplayName (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDisplayName  (
              String strDisplayName) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * ав=getClass. The Class name
   *
   * @return    The strClass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String ав=getClass  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setClass. The Class name
   *
   * @param     strClass The strClass (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setClass  (
              String strClass) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isClass. Indicates whether this path addresses a Class
   *
   * @return    The bIsClass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isClass  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * SetAsClass. Coerce this path to address a Class
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetAsClass  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isSingleton. Indicates whether this path addresses a Singleton Instance
   *
   * @return    The bIsSingleton
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSingleton  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * SetAsSingleton. Coerce this path to address a Singleton Instance
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetAsSingleton  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getKeys. The collection of Key value bindings for this path
   *
   * @return    A reference to a wbemdisp.ISWbemNamedValueSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemNamedValueSet getKeys  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getSecurity_. Defines the security components of this path
   *
   * @return    A reference to a wbemdisp.ISWbemSecurity
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemSecurity getSecurity_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getLocale. Defines locale component of this path
   *
   * @return    The strLocale
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getLocale  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setLocale. Defines locale component of this path
   *
   * @param     strLocale The strLocale (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setLocale  (
              String strLocale) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getAuthority. Defines authentication authority component of this path
   *
   * @return    The strAuthority
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getAuthority  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setAuthority. Defines authentication authority component of this path
   *
   * @param     strAuthority The strAuthority (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setAuthority  (
              String strAuthority) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID5791bc27_ce9c_11d1_97bf_0000f81e849c = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemObjectPathProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "5791bc27-ce9c-11d1-97bf-0000f81e849c";
  String DISPID_0_GET_NAME = "getPath";
  String DISPID_0_PUT_NAME = "setPath";
  String DISPID_1_GET_NAME = "getRelPath";
  String DISPID_1_PUT_NAME = "setRelPath";
  String DISPID_2_GET_NAME = "getServer";
  String DISPID_2_PUT_NAME = "setServer";
  String DISPID_3_GET_NAME = "getNamespace";
  String DISPID_3_PUT_NAME = "setNamespace";
  String DISPID_4_GET_NAME = "getParentNamespace";
  String DISPID_5_GET_NAME = "getDisplayName";
  String DISPID_5_PUT_NAME = "setDisplayName";
  String DISPID_6_GET_NAME = "ав=getClass";
  String DISPID_6_PUT_NAME = "setClass";
  String DISPID_7_GET_NAME = "isClass";
  String DISPID_8_NAME = "SetAsClass";
  String DISPID_9_GET_NAME = "isSingleton";
  String DISPID_10_NAME = "SetAsSingleton";
  String DISPID_11_GET_NAME = "getKeys";
  String DISPID_12_GET_NAME = "getSecurity_";
  String DISPID_13_GET_NAME = "getLocale";
  String DISPID_13_PUT_NAME = "setLocale";
  String DISPID_14_GET_NAME = "getAuthority";
  String DISPID_14_PUT_NAME = "setAuthority";
}
