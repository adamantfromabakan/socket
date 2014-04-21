package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemRefresher'. Generated 18.04.2014 15:20:22
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Collection of Refreshable Objects</B>'
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
public class ISWbemRefresherProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemRefresher, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemRefresher.class;

  public ISWbemRefresherProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemRefresher.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemRefresherProxy() {}

  public ISWbemRefresherProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemRefresher.IID);
  }

  protected ISWbemRefresherProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemRefresherProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * item. Get an item from this refresher
   *
   * @param     iIndex The iIndex (in)
   * @return    A reference to a wbemdisp.ISWbemRefreshableItem
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefreshableItem item  (
              int iIndex) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemRefreshableItem zz_retVal[] = { null };
    Object zz_parameters[] = { new Integer(iIndex), zz_retVal };
    vtblInvoke("item", 8, zz_parameters);
    return (wbemdisp.ISWbemRefreshableItem)zz_retVal[0];
  }

  /**
   * getCount. The number of items in this refresher
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
   * add. Add a refreshable instance to this refresher
   *
   * @param     objWbemServices A reference to a wbemdisp.ISWbemServicesEx (in)
   * @param     bsInstancePath The bsInstancePath (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemRefreshableItem
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefreshableItem add  (
              wbemdisp.ISWbemServicesEx objWbemServices,
              String bsInstancePath,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemRefreshableItem zz_retVal[] = { null };
    Object zz_parameters[] = { objWbemServices, bsInstancePath, new Integer(iFlags), objWbemNamedValueSet, zz_retVal };
    vtblInvoke("add", 10, zz_parameters);
    return (wbemdisp.ISWbemRefreshableItem)zz_retVal[0];
  }

  /**
   * addEnum. Add a refreshable enumerator to this refresher
   *
   * @param     objWbemServices A reference to a wbemdisp.ISWbemServicesEx (in)
   * @param     bsClassName The bsClassName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemRefreshableItem
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefreshableItem addEnum  (
              wbemdisp.ISWbemServicesEx objWbemServices,
              String bsClassName,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemRefreshableItem zz_retVal[] = { null };
    Object zz_parameters[] = { objWbemServices, bsClassName, new Integer(iFlags), objWbemNamedValueSet, zz_retVal };
    vtblInvoke("addEnum", 11, zz_parameters);
    return (wbemdisp.ISWbemRefreshableItem)zz_retVal[0];
  }

  /**
   * remove. Remove an item from this refresher
   *
   * @param     iIndex The iIndex (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void remove  (
              int iIndex,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object zz_retVal[] = { null };
    Object zz_parameters[] = { new Integer(iIndex), new Integer(iFlags), zz_retVal };
    vtblInvoke("remove", 12, zz_parameters);
    return;
  }

  /**
   * refresh. Refresh all items in this collection
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void refresh  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object zz_retVal[] = { null };
    Object zz_parameters[] = { new Integer(iFlags), zz_retVal };
    vtblInvoke("refresh", 13, zz_parameters);
    return;
  }

  /**
   * isAutoReconnect. Whether to attempt auto-reconnection to a remote provider
   *
   * @return    The bCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isAutoReconnect  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean zz_retVal[] = { false };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("isAutoReconnect", 14, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * setAutoReconnect. Whether to attempt auto-reconnection to a remote provider
   *
   * @param     bCount The bCount (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setAutoReconnect  (
              boolean bCount) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object zz_retVal[] = { null };
    Object zz_parameters[] = { new Boolean(bCount), zz_retVal };
    vtblInvoke("setAutoReconnect", 15, zz_parameters);
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
    vtblInvoke("deleteAll", 16, zz_parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("14d8250e-d9c2-11d3-b38f-00105a1f473a", wbemdisp.ISWbemRefresherProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemRefresherProxy.class.getResource("ISWbemRefresherProxy.MemberDesc.xml")));
  }
}
