package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemSecurity'. Generated 21.04.2014 14:38:47
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
public class ISWbemSecurityProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemSecurity, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemSecurity.class;

  public ISWbemSecurityProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemSecurity.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemSecurityProxy() {}

  public ISWbemSecurityProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemSecurity.IID);
  }

  protected ISWbemSecurityProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemSecurityProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * getImpersonationLevel. The security impersonation level
   *
   * @return    A wbemdisp.WbemImpersonationLevelEnum constant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getImpersonationLevel  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ав=retVal[] = { 0 };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getImpersonationLevel", 7, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * setImpersonationLevel. The security impersonation level
   *
   * @param     iImpersonationLevel A wbemdisp.WbemImpersonationLevelEnum constant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setImpersonationLevel  (
              int iImpersonationLevel) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iImpersonationLevel), ав=retVal };
    vtblInvoke("setImpersonationLevel", 8, ав=parameters);
    return;
  }

  /**
   * getAuthenticationLevel. The security authentication level
   *
   * @return    A wbemdisp.WbemAuthenticationLevelEnum constant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getAuthenticationLevel  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ав=retVal[] = { 0 };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getAuthenticationLevel", 9, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * setAuthenticationLevel. The security authentication level
   *
   * @param     iAuthenticationLevel A wbemdisp.WbemAuthenticationLevelEnum constant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setAuthenticationLevel  (
              int iAuthenticationLevel) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iAuthenticationLevel), ав=retVal };
    vtblInvoke("setAuthenticationLevel", 10, ав=parameters);
    return;
  }

  /**
   * getPrivileges. The collection of privileges for this object
   *
   * @return    A reference to a wbemdisp.ISWbemPrivilegeSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilegeSet getPrivileges  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemPrivilegeSet ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getPrivileges", 11, ав=parameters);
    return (wbemdisp.ISWbemPrivilegeSet)ав=retVal[0];
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("b54d66e6-2287-11d2-8b33-00600806d9b6", wbemdisp.ISWbemSecurityProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemSecurityProxy.class.getResource("ISWbemSecurityProxy.MemberDesc.xml")));
  }
}
