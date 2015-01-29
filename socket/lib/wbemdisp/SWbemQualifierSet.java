package wbemdisp;

import com.linar.jintegra.*;

/**
 * COM Class 'SWbemQualifierSet'. Generated 21.04.2014 14:38:46
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description '<B>A collection of Qualifiers</B>'
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
public class SWbemQualifierSet implements com.linar.jintegra.RemoteObjRef, wbemdisp.ISWbemQualifierSet {

  private static final String CLSID = "04b83d5e-21ae-11d2-8b33-00600806d9b6";

  protected String getJintegraVersion() { return "64 BETA"; }

  // Interface delegates
  private wbemdisp.ISWbemQualifierSetProxy d_ISWbemQualifierSetProxy = null;

  /** Access this COM class's wbemdisp.ISWbemQualifierSet interface */
  public wbemdisp.ISWbemQualifierSet getAsISWbemQualifierSet() { return d_ISWbemQualifierSetProxy; }

  /** Compare this object with another */
  public boolean equals(Object o) { 
	if(java.beans.Beans.isDesignTime()) return super.equals(o);
	else return getJintegraDispatch() == null ? false : getJintegraDispatch().equals(o);
  }


  /** the hashcode for this object */
  public int hashCode() { return getJintegraDispatch() == null ? 0 : getJintegraDispatch().hashCode(); }

   /**
   * getActiveObject. Get a reference to a running instance of this class on the current machine using native code.
   *                  <B>Uses native code (See GetActiveObject() in MS doc) and thus can only be used on MS Windows</B>
   *
   * @return    A reference to the running object.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static SWbemQualifierSet getActiveObject() throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemQualifierSet(com.linar.jintegra.Dispatch.getActiveObject(CLSID));
  }

  /**
   * bindUsingMoniker. Bind to a running instance of this class using the supplied ObjRef moniker
   *
   * @return    A reference to the running object.
   * @param     moniker The ObjRef Moniker (Created using Windows CreateObjrefMoniker() and IMoniker->GetDisplayName).
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static SWbemQualifierSet bindUsingMoniker(String moniker) throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemQualifierSet(com.linar.jintegra.Dispatch.bindUsingMoniker(moniker));
  }

  /** J-Integra for COM internal method */
  public com.linar.jintegra.Dispatch getJintegraDispatch() {  return d_ISWbemQualifierSetProxy; }
  /**
   * Construct a SWbemQualifierSet using a reference to such an object returned from a COM server
   * @param     obj an object returned from a COM server
   * @exception java.io.IOException if there are problems communicating via DCOM 
   */
  public SWbemQualifierSet(Object obj) throws java.io.IOException {
    d_ISWbemQualifierSetProxy = new wbemdisp.ISWbemQualifierSetProxy(obj);
  }

  /**
   * Release a SWbemQualifierSet.
   */
  public void release() {
    com.linar.jintegra.Cleaner.release(d_ISWbemQualifierSetProxy);
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
    try {
      return d_ISWbemQualifierSetProxy.getPropertyByName(name);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    } catch(NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.fillInStackTrace();
      throw noSuchFieldException;
    }
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name and a parameter
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @param     rhs A parameter used when getting the proxy.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name, Object rhs) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemQualifierSetProxy.getPropertyByName(name, rhs);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    } catch(NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.fillInStackTrace();
      throw noSuchFieldException;
    }
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked.
   * @param     parameters One element for each parameter. Use primitive type wrappers.
   *            to pass primitive types (eg Integer to pass an int).
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name, Object[] parameters) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    return d_ISWbemQualifierSetProxy.invokeMethodByName(name, parameters);
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked.
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    return d_ISWbemQualifierSetProxy.invokeMethodByName(name, new Object[]{});
  }

  /**
   * get_NewEnum. 
   *
   * @return    An enumeration.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Enumeration get_NewEnum  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemQualifierSetProxy.get_NewEnum();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Item. Get a named Qualifier from this collection
   *
   * @param     name The name (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemQualifier
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifier Item  (
              String name,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemQualifierSetProxy.Item(name,iFlags);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getCount. The number of items in this collection
   *
   * @return    The iCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCount  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemQualifierSetProxy.getCount();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Add. Add a Qualifier to this collection
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
  public wbemdisp.ISWbemQualifier Add  (
              String strName,
              Object varVal,
              boolean bPropagatesToSubclass,
              boolean bPropagatesToInstance,
              boolean bIsOverridable,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemQualifierSetProxy.Add(strName,varVal,bPropagatesToSubclass,bPropagatesToInstance,bIsOverridable,iFlags);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Remove. Remove a Qualifier from this collection
   *
   * @param     strName The strName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Remove  (
              String strName,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemQualifierSetProxy.Remove(strName,iFlags);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

}
