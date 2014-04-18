package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemQualifierSet'. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A collection of Qualifiers</B>'
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
public class ISWbemQualifierSetProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemQualifierSet, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemQualifierSet.class;

  public ISWbemQualifierSetProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemQualifierSet.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemQualifierSetProxy() {}

  public ISWbemQualifierSetProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemQualifierSet.IID);
  }

  protected ISWbemQualifierSetProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemQualifierSetProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * item. Get a named Qualifier from this collection
   *
   * @param     name The name (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemQualifier
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifier item  (
              String name,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemQualifier zz_retVal[] = { null };
    Object zz_parameters[] = { name, new Integer(iFlags), zz_retVal };
    vtblInvoke("item", 8, zz_parameters);
    return (wbemdisp.ISWbemQualifier)zz_retVal[0];
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
   * add. Add a Qualifier to this collection
   *
   * @param     strName The strName (in)
   * @param     varVal A Variant (in)
   * @param     bPropagatesToSubclass The bPropagatesToSubclass (in, optional, pass true if not required)
   * @param     bPropagatesToInstance The bPropagatesToInstance (in, optional, pass true if not required)
   * @param     bIsOverridable The bIsOverridable (in, optional, pass true if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemQualifier
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifier add  (
              String strName,
              Object varVal,
              boolean bPropagatesToSubclass,
              boolean bPropagatesToInstance,
              boolean bIsOverridable,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemQualifier zz_retVal[] = { null };
    Object zz_parameters[] = { strName, varVal == null ? new Variant("varVal") : varVal, new Boolean(bPropagatesToSubclass), new Boolean(bPropagatesToInstance), new Boolean(bIsOverridable), new Integer(iFlags), zz_retVal };
    vtblInvoke("add", 10, zz_parameters);
    return (wbemdisp.ISWbemQualifier)zz_retVal[0];
  }

  /**
   * remove. Remove a Qualifier from this collection
   *
   * @param     strName The strName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void remove  (
              String strName,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object zz_retVal[] = { null };
    Object zz_parameters[] = { strName, new Integer(iFlags), zz_retVal };
    vtblInvoke("remove", 11, zz_parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("9b16ed16-d3df-11d1-8b08-00600806d9b6", wbemdisp.ISWbemQualifierSetProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemQualifierSetProxy.class.getResource("ISWbemQualifierSetProxy.MemberDesc.xml")));
  }
}
