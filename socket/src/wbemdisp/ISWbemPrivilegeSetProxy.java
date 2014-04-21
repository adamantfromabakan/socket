package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemPrivilegeSet'. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A collection of Privilege Overrides</B>'
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
public class ISWbemPrivilegeSetProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemPrivilegeSet, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemPrivilegeSet.class;

  public ISWbemPrivilegeSetProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemPrivilegeSet.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemPrivilegeSetProxy() {}

  public ISWbemPrivilegeSetProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemPrivilegeSet.IID);
  }

  protected ISWbemPrivilegeSetProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemPrivilegeSetProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * get_NewEnum. 
   *
   * @return    An enumeration.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Enumeration get_NewEnum  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    java.util.Enumeration zz_retVal[] = { null };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("get_NewEnum", 7, zz_parameters);
    return (java.util.Enumeration)zz_retVal[0];
  }

  /**
   * item. Get a named Privilege from this collection
   *
   * @param     iPrivilege A wbemdisp.WbemPrivilegeEnum constant (in)
   * @return    A reference to a wbemdisp.ISWbemPrivilege
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilege item  (
              int iPrivilege) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemPrivilege zz_retVal[] = { null };
    Object zz_parameters[] = { new Integer(iPrivilege), zz_retVal };
    vtblInvoke("item", 8, zz_parameters);
    return (wbemdisp.ISWbemPrivilege)zz_retVal[0];
  }

  /**
   * getCount. The number of items in this collection
   *
   * @return    The iCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCount  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("getCount", 9, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * add. Add a Privilege to this collection
   *
   * @param     iPrivilege A wbemdisp.WbemPrivilegeEnum constant (in)
   * @param     bIsEnabled The bIsEnabled (in, optional, pass true if not required)
   * @return    A reference to a wbemdisp.ISWbemPrivilege
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilege add  (
              int iPrivilege,
              boolean bIsEnabled) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemPrivilege zz_retVal[] = { null };
    Object zz_parameters[] = { new Integer(iPrivilege), new Boolean(bIsEnabled), zz_retVal };
    vtblInvoke("add", 10, zz_parameters);
    return (wbemdisp.ISWbemPrivilege)zz_retVal[0];
  }

  /**
   * remove. Remove a Privilege from this collection
   *
   * @param     iPrivilege A wbemdisp.WbemPrivilegeEnum constant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void remove  (
              int iPrivilege) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object zz_retVal[] = { null };
    Object zz_parameters[] = { new Integer(iPrivilege), zz_retVal };
    vtblInvoke("remove", 11, zz_parameters);
    return;
  }

  /**
   * deleteAll. Delete all items in this collection
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void deleteAll  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object zz_retVal[] = { null };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("deleteAll", 12, zz_parameters);
    return;
  }

  /**
   * addAsString. Add a named Privilege to this collection
   *
   * @param     strPrivilege The strPrivilege (in)
   * @param     bIsEnabled The bIsEnabled (in, optional, pass true if not required)
   * @return    A reference to a wbemdisp.ISWbemPrivilege
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilege addAsString  (
              String strPrivilege,
              boolean bIsEnabled) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemPrivilege zz_retVal[] = { null };
    Object zz_parameters[] = { strPrivilege, new Boolean(bIsEnabled), zz_retVal };
    vtblInvoke("addAsString", 13, zz_parameters);
    return (wbemdisp.ISWbemPrivilege)zz_retVal[0];
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("26ee67bf-5804-11d2-8b4a-00600806d9b6", wbemdisp.ISWbemPrivilegeSetProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemPrivilegeSetProxy.class.getResource("ISWbemPrivilegeSetProxy.MemberDesc.xml")));
  }
}
