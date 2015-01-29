package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemRefreshableItem'. Generated 21.04.2014 14:38:48
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A single item in a Refresher</B>'
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
public class ISWbemRefreshableItemProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemRefreshableItem, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemRefreshableItem.class;

  public ISWbemRefreshableItemProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemRefreshableItem.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemRefreshableItemProxy() {}

  public ISWbemRefreshableItemProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemRefreshableItem.IID);
  }

  protected ISWbemRefreshableItemProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemRefreshableItemProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * getIndex. The index of this item in the parent refresher
   *
   * @return    The iIndex
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getIndex  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ав=retVal[] = { 0 };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getIndex", 7, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * getRefresher. The parent refresher
   *
   * @return    A reference to a wbemdisp.ISWbemRefresher
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefresher getRefresher  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemRefresher ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getRefresher", 8, ав=parameters);
    return (wbemdisp.ISWbemRefresher)ав=retVal[0];
  }

  /**
   * isSet. Whether this item represents a single object or an object set
   *
   * @return    The bIsSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSet  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ав=retVal[] = { false };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("isSet", 9, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * getObject. The object
   *
   * @return    A reference to a wbemdisp.ISWbemObjectEx
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectEx getObject  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectEx ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getObject", 10, ав=parameters);
    return (wbemdisp.ISWbemObjectEx)ав=retVal[0];
  }

  /**
   * getObjectSet. The object set
   *
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet getObjectSet  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getObjectSet", 11, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
  }

  /**
   * Remove. Remove this item from the parent refresher
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Remove  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), ав=retVal };
    vtblInvoke("Remove", 12, ав=parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("5ad4bf92-daab-11d3-b38f-00105a1f473a", wbemdisp.ISWbemRefreshableItemProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemRefreshableItemProxy.class.getResource("ISWbemRefreshableItemProxy.MemberDesc.xml")));
  }
}
