package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemSinkEvents'. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A sink for events arising from asynchronous operations</B>'
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
public class ISWbemSinkEventsProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemSinkEvents, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemSinkEvents.class;

  public ISWbemSinkEventsProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemSinkEvents.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemSinkEventsProxy() {}

  public ISWbemSinkEventsProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemSinkEvents.IID);
  }

  protected ISWbemSinkEventsProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemSinkEventsProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * onObjectReady. Event triggered when an Object is available
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void onObjectReady  (wbemdisp.ISWbemSinkEventsOnObjectReadyEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException{
    com.linar.jintegra.Variant[] parameters = {new Variant("theEvent.objWbemObject", 9, theEvent.objWbemObject),
                                         new Variant("theEvent.objWbemAsyncContext", 9, theEvent.objWbemAsyncContext),};
    invoke("onObjectReady", 1, 1, parameters);
    return;
  }

  /**
   * onCompleted. Event triggered when an asynchronous operation is completed
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void onCompleted  (wbemdisp.ISWbemSinkEventsOnCompletedEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException{
    com.linar.jintegra.Variant[] parameters = {new Variant("theEvent.iHResult", 3, theEvent.iHResult),
                                         new Variant("theEvent.objWbemErrorObject", 9, theEvent.objWbemErrorObject),
                                         new Variant("theEvent.objWbemAsyncContext", 9, theEvent.objWbemAsyncContext),};
    invoke("onCompleted", 2, 1, parameters);
    return;
  }

  /**
   * onProgress. Event triggered to report the progress of an asynchronous operation
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void onProgress  (wbemdisp.ISWbemSinkEventsOnProgressEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException{
    com.linar.jintegra.Variant[] parameters = {new Variant("theEvent.iUpperBound", 3, theEvent.iUpperBound),
                                         new Variant("theEvent.iCurrent", 3, theEvent.iCurrent),
                                         new Variant("theEvent.strMessage", 8, theEvent.strMessage),
                                         new Variant("theEvent.objWbemAsyncContext", 9, theEvent.objWbemAsyncContext),};
    invoke("onProgress", 3, 1, parameters);
    return;
  }

  /**
   * onObjectPut. Event triggered when an object path is available following a Put operation
   *
   * @param     theEvent The event
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void onObjectPut  (wbemdisp.ISWbemSinkEventsOnObjectPutEvent theEvent) throws java.io.IOException, com.linar.jintegra.AutomationException{
    com.linar.jintegra.Variant[] parameters = {new Variant("theEvent.objWbemObjectPath", 9, theEvent.objWbemObjectPath),
                                         new Variant("theEvent.objWbemAsyncContext", 9, theEvent.objWbemAsyncContext),};
    invoke("onObjectPut", 4, 1, parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
    com.linar.jintegra.InterfaceDesc.add("75718ca0-f029-11d1-a1ac-00c04fb6c223", wbemdisp.ISWbemSinkEventsProxy.class, null, 0, null );
  }
}
