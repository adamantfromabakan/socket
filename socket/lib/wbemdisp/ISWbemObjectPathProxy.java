package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemObjectPath'. Generated 21.04.2014 14:38:47
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
public class ISWbemObjectPathProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemObjectPath, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemObjectPath.class;

  public ISWbemObjectPathProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemObjectPath.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemObjectPathProxy() {}

  public ISWbemObjectPathProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemObjectPath.IID);
  }

  protected ISWbemObjectPathProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemObjectPathProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
    super(CLSID, iid, host, authInfo);
  }

  public void addListener(String iidStr, Object theListener, Object theSource) throws java.io.IOException {
    super.addListener(iidStr, theListener, theSource);
  }

  public void removeListener(String iidStr, Object theListener) throws java.io.IOException {
    super.removeListener(iidStr, theListener);
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant parameters[] = {};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name and a parameter value
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @param     rhs Parameter used when getting the property.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name, Object rhs) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant parameters[] = {rhs == null ? new Variant("rhs", 10, 0x80020004L) : new Variant("rhs", 12, rhs)};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @param     parameters One element for each parameter.  Use primitive type wrappers
   *            to pass primitive types (eg Integer to pass an int).
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name, Object[] parameters) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant variantParameters[] = new com.linar.jintegra.Variant[parameters.length];
    for(int i = 0; i < parameters.length; i++) {
      variantParameters[i] = parameters[i] == null ? new Variant("p" + i, 10, 0x80020004L) :
	                                                   new Variant("p" + i, 12, parameters[i]);
    }
    try {
      return super.invoke(name, super.getDispatchIdOfName(name), 1, variantParameters).getVARIANT();
    } catch(NoSuchFieldException nsfe) {
      throw new NoSuchMethodException("There is no method called " + name);
    }
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
      return invokeMethodByName(name, new Object[]{});
  }

  /**
   * getPath. The full path
   *
   * @return    The strPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getPath  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getPath", 7, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setPath. The full path
   *
   * @param     strPath The strPath (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setPath  (
              String strPath) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strPath, ��=retVal };
    vtblInvoke("setPath", 8, ��=parameters);
    return;
  }

  /**
   * getRelPath. The relative path
   *
   * @return    The strRelPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getRelPath  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getRelPath", 9, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setRelPath. The relative path
   *
   * @param     strRelPath The strRelPath (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setRelPath  (
              String strRelPath) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strRelPath, ��=retVal };
    vtblInvoke("setRelPath", 10, ��=parameters);
    return;
  }

  /**
   * getServer. The name of the Server
   *
   * @return    The strServer
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getServer  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getServer", 11, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setServer. The name of the Server
   *
   * @param     strServer The strServer (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setServer  (
              String strServer) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strServer, ��=retVal };
    vtblInvoke("setServer", 12, ��=parameters);
    return;
  }

  /**
   * getNamespace. The Namespace path
   *
   * @return    The strNamespace
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getNamespace  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getNamespace", 13, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setNamespace. The Namespace path
   *
   * @param     strNamespace The strNamespace (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setNamespace  (
              String strNamespace) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strNamespace, ��=retVal };
    vtblInvoke("setNamespace", 14, ��=parameters);
    return;
  }

  /**
   * getParentNamespace. The parent Namespace path
   *
   * @return    The strParentNamespace
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getParentNamespace  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getParentNamespace", 15, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * getDisplayName. The Display Name for this path
   *
   * @return    The strDisplayName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getDisplayName  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getDisplayName", 16, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setDisplayName. The Display Name for this path
   *
   * @param     strDisplayName The strDisplayName (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDisplayName  (
              String strDisplayName) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strDisplayName, ��=retVal };
    vtblInvoke("setDisplayName", 17, ��=parameters);
    return;
  }

  /**
   * ��=getClass. The Class name
   *
   * @return    The strClass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String ��=getClass  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("��=getClass", 18, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setClass. The Class name
   *
   * @param     strClass The strClass (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setClass  (
              String strClass) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strClass, ��=retVal };
    vtblInvoke("setClass", 19, ��=parameters);
    return;
  }

  /**
   * isClass. Indicates whether this path addresses a Class
   *
   * @return    The bIsClass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isClass  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isClass", 20, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * SetAsClass. Coerce this path to address a Class
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetAsClass  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("SetAsClass", 21, ��=parameters);
    return;
  }

  /**
   * isSingleton. Indicates whether this path addresses a Singleton Instance
   *
   * @return    The bIsSingleton
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSingleton  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isSingleton", 22, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * SetAsSingleton. Coerce this path to address a Singleton Instance
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetAsSingleton  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("SetAsSingleton", 23, ��=parameters);
    return;
  }

  /**
   * getKeys. The collection of Key value bindings for this path
   *
   * @return    A reference to a wbemdisp.ISWbemNamedValueSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemNamedValueSet getKeys  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemNamedValueSet ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getKeys", 24, ��=parameters);
    return (wbemdisp.ISWbemNamedValueSet)��=retVal[0];
  }

  /**
   * getSecurity_. Defines the security components of this path
   *
   * @return    A reference to a wbemdisp.ISWbemSecurity
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemSecurity getSecurity_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemSecurity ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getSecurity_", 25, ��=parameters);
    return (wbemdisp.ISWbemSecurity)��=retVal[0];
  }

  /**
   * getLocale. Defines locale component of this path
   *
   * @return    The strLocale
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getLocale  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getLocale", 26, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setLocale. Defines locale component of this path
   *
   * @param     strLocale The strLocale (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setLocale  (
              String strLocale) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strLocale, ��=retVal };
    vtblInvoke("setLocale", 27, ��=parameters);
    return;
  }

  /**
   * getAuthority. Defines authentication authority component of this path
   *
   * @return    The strAuthority
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getAuthority  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getAuthority", 28, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setAuthority. Defines authentication authority component of this path
   *
   * @param     strAuthority The strAuthority (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setAuthority  (
              String strAuthority) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strAuthority, ��=retVal };
    vtblInvoke("setAuthority", 29, ��=parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("5791bc27-ce9c-11d1-97bf-0000f81e849c", wbemdisp.ISWbemObjectPathProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemObjectPathProxy.class.getResource("ISWbemObjectPathProxy.MemberDesc.xml")));
  }
}
