package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemQualifier'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Qualifier</B>'
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
public class ISWbemQualifierProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemQualifier, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemQualifier.class;

  public ISWbemQualifierProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemQualifier.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemQualifierProxy() {}

  public ISWbemQualifierProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemQualifier.IID);
  }

  protected ISWbemQualifierProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemQualifierProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
   * getValue. The value of this Qualifier
   *
   * @return    A Variant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getValue  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getValue", 7, ав=parameters);
    return (Object)ав=retVal[0];
  }

  /**
   * setValue. The value of this Qualifier
   *
   * @param     varValue A Variant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setValue  (
              Object varValue) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { varValue == null ? new Variant("varValue") : varValue, ав=retVal };
    vtblInvoke("setValue", 8, ав=parameters);
    return;
  }

  /**
   * getName. The name of this Qualifier
   *
   * @return    The strName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getName  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getName", 9, ав=parameters);
    return (String)ав=retVal[0];
  }

  /**
   * isLocal. Indicates whether this Qualifier is local or propagated
   *
   * @return    The bIsLocal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isLocal  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ав=retVal[] = { false };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("isLocal", 10, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * isPropagatesToSubclass. Determines whether this Qualifier can propagate to subclasses
   *
   * @return    The bPropagatesToSubclass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isPropagatesToSubclass  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ав=retVal[] = { false };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("isPropagatesToSubclass", 11, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * setPropagatesToSubclass. Determines whether this Qualifier can propagate to subclasses
   *
   * @param     bPropagatesToSubclass The bPropagatesToSubclass (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setPropagatesToSubclass  (
              boolean bPropagatesToSubclass) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Boolean(bPropagatesToSubclass), ав=retVal };
    vtblInvoke("setPropagatesToSubclass", 12, ав=parameters);
    return;
  }

  /**
   * isPropagatesToInstance. Determines whether this Qualifier can propagate to instances
   *
   * @return    The bPropagatesToInstance
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isPropagatesToInstance  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ав=retVal[] = { false };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("isPropagatesToInstance", 13, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * setPropagatesToInstance. Determines whether this Qualifier can propagate to instances
   *
   * @param     bPropagatesToInstance The bPropagatesToInstance (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setPropagatesToInstance  (
              boolean bPropagatesToInstance) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Boolean(bPropagatesToInstance), ав=retVal };
    vtblInvoke("setPropagatesToInstance", 14, ав=parameters);
    return;
  }

  /**
   * isOverridable. Determines whether this Qualifier can be overridden where propagated
   *
   * @return    The bIsOverridable
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isOverridable  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ав=retVal[] = { false };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("isOverridable", 15, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * setIsOverridable. Determines whether this Qualifier can be overridden where propagated
   *
   * @param     bIsOverridable The bIsOverridable (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setIsOverridable  (
              boolean bIsOverridable) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Boolean(bIsOverridable), ав=retVal };
    vtblInvoke("setIsOverridable", 16, ав=parameters);
    return;
  }

  /**
   * isAmended. Determines whether the value of this Qualifier has been amended
   *
   * @return    The bIsAmended
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isAmended  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ав=retVal[] = { false };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("isAmended", 17, ав=parameters);
    return ав=retVal[0];
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("79b05932-d3b7-11d1-8b06-00600806d9b6", wbemdisp.ISWbemQualifierProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemQualifierProxy.class.getResource("ISWbemQualifierProxy.MemberDesc.xml")));
  }
}
