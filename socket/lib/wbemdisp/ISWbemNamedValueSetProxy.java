package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemNamedValueSet'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A collection of named values</B>'
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
public class ISWbemNamedValueSetProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemNamedValueSet, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemNamedValueSet.class;

  public ISWbemNamedValueSetProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemNamedValueSet.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemNamedValueSetProxy() {}

  public ISWbemNamedValueSetProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemNamedValueSet.IID);
  }

  protected ISWbemNamedValueSetProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemNamedValueSetProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
    java.util.Enumeration ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("get_NewEnum", 7, ��=parameters);
    return (java.util.Enumeration)��=retVal[0];
  }

  /**
   * Item. Get a named value from this Collection
   *
   * @param     strName The strName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemNamedValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemNamedValue Item  (
              String strName,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemNamedValue ��=retVal[] = { null };
    Object ��=parameters[] = { strName, new Integer(iFlags), ��=retVal };
    vtblInvoke("Item", 8, ��=parameters);
    return (wbemdisp.ISWbemNamedValue)��=retVal[0];
  }

  /**
   * getCount. The number of items in this collection
   *
   * @return    The iCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCount  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getCount", 9, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * Add. Add a named value to this collection
   *
   * @param     strName The strName (in)
   * @param     varValue A Variant (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemNamedValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemNamedValue Add  (
              String strName,
              Object varValue,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemNamedValue ��=retVal[] = { null };
    Object ��=parameters[] = { strName, varValue == null ? new Variant("varValue") : varValue, new Integer(iFlags), ��=retVal };
    vtblInvoke("Add", 10, ��=parameters);
    return (wbemdisp.ISWbemNamedValue)��=retVal[0];
  }

  /**
   * Remove. Remove a named value from this collection
   *
   * @param     strName The strName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Remove  (
              String strName,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strName, new Integer(iFlags), ��=retVal };
    vtblInvoke("Remove", 11, ��=parameters);
    return;
  }

  /**
   * Clone. Make a copy of this collection
   *
   * @return    A reference to a wbemdisp.ISWbemNamedValueSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemNamedValueSet Clone  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemNamedValueSet ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("Clone", 12, ��=parameters);
    return (wbemdisp.ISWbemNamedValueSet)��=retVal[0];
  }

  /**
   * DeleteAll. Delete all items in this collection
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void DeleteAll  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("DeleteAll", 13, ��=parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("cf2376ea-ce8c-11d1-8b05-00600806d9b6", wbemdisp.ISWbemNamedValueSetProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemNamedValueSetProxy.class.getResource("ISWbemNamedValueSetProxy.MemberDesc.xml")));
  }
}
