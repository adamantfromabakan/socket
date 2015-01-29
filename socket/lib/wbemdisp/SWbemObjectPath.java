package wbemdisp;

import com.linar.jintegra.*;

/**
 * COM Class 'SWbemObjectPath'. Generated 21.04.2014 14:38:46
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description '<B>Object Path</B>'
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
public class SWbemObjectPath implements com.linar.jintegra.RemoteObjRef, wbemdisp.ISWbemObjectPath {

  private static final String CLSID = "5791bc26-ce9c-11d1-97bf-0000f81e849c";

  protected String getJintegraVersion() { return "64 BETA"; }

  // Interface delegates
  private wbemdisp.ISWbemObjectPathProxy d_ISWbemObjectPathProxy = null;

  /** Access this COM class's wbemdisp.ISWbemObjectPath interface */
  public wbemdisp.ISWbemObjectPath getAsISWbemObjectPath() { return d_ISWbemObjectPathProxy; }

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
  public static SWbemObjectPath getActiveObject() throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemObjectPath(com.linar.jintegra.Dispatch.getActiveObject(CLSID));
  }

  /**
   * bindUsingMoniker. Bind to a running instance of this class using the supplied ObjRef moniker
   *
   * @return    A reference to the running object.
   * @param     moniker The ObjRef Moniker (Created using Windows CreateObjrefMoniker() and IMoniker->GetDisplayName).
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static SWbemObjectPath bindUsingMoniker(String moniker) throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemObjectPath(com.linar.jintegra.Dispatch.bindUsingMoniker(moniker));
  }

  /** J-Integra for COM internal method */
  public com.linar.jintegra.Dispatch getJintegraDispatch() {  return d_ISWbemObjectPathProxy; }

  /**
   * Constructs a SWbemObjectPath on the local host.
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public SWbemObjectPath() throws java.io.IOException, java.net.UnknownHostException {
    this("localhost");
  }

  /**
   * Construct a SWbemObjectPath on specified host.
   * @param     host  the host on which the object should be created
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public SWbemObjectPath(String host) throws java.io.IOException, java.net.UnknownHostException {
    d_ISWbemObjectPathProxy = new wbemdisp.ISWbemObjectPathProxy(CLSID, host, null);
  }

  /**
   * Construct a SWbemObjectPath using a reference to such an object returned from a COM server
   * @param     obj an object returned from a COM server
   * @exception java.io.IOException if there are problems communicating via DCOM 
   */
  public SWbemObjectPath(Object obj) throws java.io.IOException {
    d_ISWbemObjectPathProxy = new wbemdisp.ISWbemObjectPathProxy(obj);
  }

  /**
   * Release a SWbemObjectPath.
   */
  public void release() {
    com.linar.jintegra.Cleaner.release(d_ISWbemObjectPathProxy);
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
      return d_ISWbemObjectPathProxy.getPropertyByName(name);
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
      return d_ISWbemObjectPathProxy.getPropertyByName(name, rhs);
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
    return d_ISWbemObjectPathProxy.invokeMethodByName(name, parameters);
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
    return d_ISWbemObjectPathProxy.invokeMethodByName(name, new Object[]{});
  }

  /**
   * getPath. The full path
   *
   * @return    The strPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getPath  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getPath();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setPath. The full path
   *
   * @param     strPath The strPath (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setPath  (
              String strPath) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setPath(strPath);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getRelPath. The relative path
   *
   * @return    The strRelPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getRelPath  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getRelPath();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setRelPath. The relative path
   *
   * @param     strRelPath The strRelPath (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setRelPath  (
              String strRelPath) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setRelPath(strRelPath);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getServer. The name of the Server
   *
   * @return    The strServer
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getServer  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getServer();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setServer. The name of the Server
   *
   * @param     strServer The strServer (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setServer  (
              String strServer) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setServer(strServer);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getNamespace. The Namespace path
   *
   * @return    The strNamespace
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getNamespace  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getNamespace();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setNamespace. The Namespace path
   *
   * @param     strNamespace The strNamespace (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setNamespace  (
              String strNamespace) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setNamespace(strNamespace);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getParentNamespace. The parent Namespace path
   *
   * @return    The strParentNamespace
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getParentNamespace  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getParentNamespace();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getDisplayName. The Display Name for this path
   *
   * @return    The strDisplayName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getDisplayName  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getDisplayName();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setDisplayName. The Display Name for this path
   *
   * @param     strDisplayName The strDisplayName (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDisplayName  (
              String strDisplayName) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setDisplayName(strDisplayName);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ав=getClass. The Class name
   *
   * @return    The strClass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String ав=getClass  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.ав=getClass();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setClass. The Class name
   *
   * @param     strClass The strClass (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setClass  (
              String strClass) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setClass(strClass);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isClass. Indicates whether this path addresses a Class
   *
   * @return    The bIsClass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isClass  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.isClass();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * SetAsClass. Coerce this path to address a Class
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetAsClass  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.SetAsClass();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isSingleton. Indicates whether this path addresses a Singleton Instance
   *
   * @return    The bIsSingleton
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSingleton  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.isSingleton();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * SetAsSingleton. Coerce this path to address a Singleton Instance
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetAsSingleton  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.SetAsSingleton();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getKeys. The collection of Key value bindings for this path
   *
   * @return    A reference to a wbemdisp.ISWbemNamedValueSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemNamedValueSet getKeys  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getKeys();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getSecurity_. Defines the security components of this path
   *
   * @return    A reference to a wbemdisp.ISWbemSecurity
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemSecurity getSecurity_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getSecurity_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getLocale. Defines locale component of this path
   *
   * @return    The strLocale
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getLocale  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getLocale();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setLocale. Defines locale component of this path
   *
   * @param     strLocale The strLocale (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setLocale  (
              String strLocale) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setLocale(strLocale);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getAuthority. Defines authentication authority component of this path
   *
   * @return    The strAuthority
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getAuthority  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectPathProxy.getAuthority();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setAuthority. Defines authentication authority component of this path
   *
   * @param     strAuthority The strAuthority (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setAuthority  (
              String strAuthority) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectPathProxy.setAuthority(strAuthority);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

}
