package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemObjectEx'. Generated 21.04.2014 14:38:48
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Class or Instance</B>'
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
public class ISWbemObjectExProxy extends wbemdisp.ISWbemObjectProxy implements wbemdisp.ISWbemObjectEx, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemObjectEx.class;

  public ISWbemObjectExProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemObjectEx.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemObjectExProxy() {}

  public ISWbemObjectExProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemObjectEx.IID);
  }

  protected ISWbemObjectExProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemObjectExProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * Refresh_. Refresh this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Refresh_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Refresh_", 32, ав=parameters);
    return;
  }

  /**
   * getSystemProperties_. The collection of System Properties of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemPropertySet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPropertySet getSystemProperties_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemPropertySet ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getSystemProperties_", 33, ав=parameters);
    return (wbemdisp.ISWbemPropertySet)ав=retVal[0];
  }

  /**
   * GetText_. Retrieve a textual representation of this Object
   *
   * @param     iObjectTextFormat A wbemdisp.WbemObjectTextFormatEnum constant (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    The bsText
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String GetText_  (
              int iObjectTextFormat,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iObjectTextFormat), new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("GetText_", 34, ав=parameters);
    return (String)ав=retVal[0];
  }

  /**
   * SetFromText_. Set this Object using the supplied textual representation
   *
   * @param     bsText The bsText (in)
   * @param     iObjectTextFormat A wbemdisp.WbemObjectTextFormatEnum constant (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetFromText_  (
              String bsText,
              int iObjectTextFormat,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { bsText, new Integer(iObjectTextFormat), new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("SetFromText_", 35, ав=parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("269ad56a-8a67-4129-bc8c-0506dcfe9880", wbemdisp.ISWbemObjectExProxy.class, "76a6415a-cb41-11d1-8b02-00600806d9b6", 32, MemberDesc.parseMemberDescFile(ISWbemObjectExProxy.class.getResource("ISWbemObjectExProxy.MemberDesc.xml")));
  }
}
