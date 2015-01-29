package wbemdisp;

import com.linar.jintegra.*;

/**
 * COM Class 'SWbemServices'. Generated 21.04.2014 14:38:46
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description '<B>A connection to a Namespace</B>'
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
public class SWbemServices implements com.linar.jintegra.RemoteObjRef, wbemdisp.ISWbemServices {

  private static final String CLSID = "04b83d63-21ae-11d2-8b33-00600806d9b6";

  protected String getJintegraVersion() { return "64 BETA"; }

  // Interface delegates
  private wbemdisp.ISWbemServicesProxy d_ISWbemServicesProxy = null;

  /** Access this COM class's wbemdisp.ISWbemServices interface */
  public wbemdisp.ISWbemServices getAsISWbemServices() { return d_ISWbemServicesProxy; }

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
  public static SWbemServices getActiveObject() throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemServices(com.linar.jintegra.Dispatch.getActiveObject(CLSID));
  }

  /**
   * bindUsingMoniker. Bind to a running instance of this class using the supplied ObjRef moniker
   *
   * @return    A reference to the running object.
   * @param     moniker The ObjRef Moniker (Created using Windows CreateObjrefMoniker() and IMoniker->GetDisplayName).
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static SWbemServices bindUsingMoniker(String moniker) throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemServices(com.linar.jintegra.Dispatch.bindUsingMoniker(moniker));
  }

  /** J-Integra for COM internal method */
  public com.linar.jintegra.Dispatch getJintegraDispatch() {  return d_ISWbemServicesProxy; }
  /**
   * Construct a SWbemServices using a reference to such an object returned from a COM server
   * @param     obj an object returned from a COM server
   * @exception java.io.IOException if there are problems communicating via DCOM 
   */
  public SWbemServices(Object obj) throws java.io.IOException {
    d_ISWbemServicesProxy = new wbemdisp.ISWbemServicesProxy(obj);
  }

  /**
   * Release a SWbemServices.
   */
  public void release() {
    com.linar.jintegra.Cleaner.release(d_ISWbemServicesProxy);
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
      return d_ISWbemServicesProxy.getPropertyByName(name);
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
      return d_ISWbemServicesProxy.getPropertyByName(name, rhs);
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
    return d_ISWbemServicesProxy.invokeMethodByName(name, parameters);
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
    return d_ISWbemServicesProxy.invokeMethodByName(name, new Object[]{});
  }

  /**
   * Get. Get a single Class or Instance
   *
   * @param     strObjectPath The strObjectPath (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject Get  (
              String strObjectPath,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.Get(strObjectPath,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * GetAsync. Get a single Class or Instance asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strObjectPath The strObjectPath (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void GetAsync  (
              Object objWbemSink,
              String strObjectPath,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.GetAsync(objWbemSink,strObjectPath,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Delete. Delete a Class or Instance
   *
   * @param     strObjectPath The strObjectPath (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Delete  (
              String strObjectPath,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.Delete(strObjectPath,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * DeleteAsync. Delete a Class or Instance asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strObjectPath The strObjectPath (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void DeleteAsync  (
              Object objWbemSink,
              String strObjectPath,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.DeleteAsync(objWbemSink,strObjectPath,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * InstancesOf. Enumerate the Instances of a Class
   *
   * @param     strClass The strClass (in)
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet InstancesOf  (
              String strClass,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.InstancesOf(strClass,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * InstancesOfAsync. Enumerate the Instances of a Class asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strClass The strClass (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void InstancesOfAsync  (
              Object objWbemSink,
              String strClass,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.InstancesOfAsync(objWbemSink,strClass,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * SubclassesOf. Enumerate the subclasses of a Class
   *
   * @param     strSuperclass The strSuperclass (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet SubclassesOf  (
              String strSuperclass,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.SubclassesOf(strSuperclass,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * SubclassesOfAsync. Enumerate the subclasses of a Class asynchronously 
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strSuperclass The strSuperclass (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SubclassesOfAsync  (
              Object objWbemSink,
              String strSuperclass,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.SubclassesOfAsync(objWbemSink,strSuperclass,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecQuery. Execute a Query
   *
   * @param     strQuery The strQuery (in)
   * @param     strQueryLanguage The strQueryLanguage (in, optional, pass WQL if not required)
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet ExecQuery  (
              String strQuery,
              String strQueryLanguage,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.ExecQuery(strQuery,strQueryLanguage,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecQueryAsync. Execute an asynchronous Query
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strQuery The strQuery (in)
   * @param     strQueryLanguage The strQueryLanguage (in, optional, pass WQL if not required)
   * @param     lFlags The lFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void ExecQueryAsync  (
              Object objWbemSink,
              String strQuery,
              String strQueryLanguage,
              int lFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.ExecQueryAsync(objWbemSink,strQuery,strQueryLanguage,lFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * AssociatorsOf. Get the Associators of a class or instance
   *
   * @param     strObjectPath The strObjectPath (in)
   * @param     strAssocClass The strAssocClass (in, optional, pass  if not required)
   * @param     strResultClass The strResultClass (in, optional, pass  if not required)
   * @param     strResultRole The strResultRole (in, optional, pass  if not required)
   * @param     strRole The strRole (in, optional, pass  if not required)
   * @param     bClassesOnly The bClassesOnly (in, optional, pass false if not required)
   * @param     bSchemaOnly The bSchemaOnly (in, optional, pass false if not required)
   * @param     strRequiredAssocQualifier The strRequiredAssocQualifier (in, optional, pass  if not required)
   * @param     strRequiredQualifier The strRequiredQualifier (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet AssociatorsOf  (
              String strObjectPath,
              String strAssocClass,
              String strResultClass,
              String strResultRole,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredAssocQualifier,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.AssociatorsOf(strObjectPath,strAssocClass,strResultClass,strResultRole,strRole,bClassesOnly,bSchemaOnly,strRequiredAssocQualifier,strRequiredQualifier,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * AssociatorsOfAsync. Get the Associators of a class or instance asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strObjectPath The strObjectPath (in)
   * @param     strAssocClass The strAssocClass (in, optional, pass  if not required)
   * @param     strResultClass The strResultClass (in, optional, pass  if not required)
   * @param     strResultRole The strResultRole (in, optional, pass  if not required)
   * @param     strRole The strRole (in, optional, pass  if not required)
   * @param     bClassesOnly The bClassesOnly (in, optional, pass false if not required)
   * @param     bSchemaOnly The bSchemaOnly (in, optional, pass false if not required)
   * @param     strRequiredAssocQualifier The strRequiredAssocQualifier (in, optional, pass  if not required)
   * @param     strRequiredQualifier The strRequiredQualifier (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void AssociatorsOfAsync  (
              Object objWbemSink,
              String strObjectPath,
              String strAssocClass,
              String strResultClass,
              String strResultRole,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredAssocQualifier,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.AssociatorsOfAsync(objWbemSink,strObjectPath,strAssocClass,strResultClass,strResultRole,strRole,bClassesOnly,bSchemaOnly,strRequiredAssocQualifier,strRequiredQualifier,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ReferencesTo. Get the References to a class or instance
   *
   * @param     strObjectPath The strObjectPath (in)
   * @param     strResultClass The strResultClass (in, optional, pass  if not required)
   * @param     strRole The strRole (in, optional, pass  if not required)
   * @param     bClassesOnly The bClassesOnly (in, optional, pass false if not required)
   * @param     bSchemaOnly The bSchemaOnly (in, optional, pass false if not required)
   * @param     strRequiredQualifier The strRequiredQualifier (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet ReferencesTo  (
              String strObjectPath,
              String strResultClass,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.ReferencesTo(strObjectPath,strResultClass,strRole,bClassesOnly,bSchemaOnly,strRequiredQualifier,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ReferencesToAsync. Get the References to a class or instance asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strObjectPath The strObjectPath (in)
   * @param     strResultClass The strResultClass (in, optional, pass  if not required)
   * @param     strRole The strRole (in, optional, pass  if not required)
   * @param     bClassesOnly The bClassesOnly (in, optional, pass false if not required)
   * @param     bSchemaOnly The bSchemaOnly (in, optional, pass false if not required)
   * @param     strRequiredQualifier The strRequiredQualifier (in, optional, pass  if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void ReferencesToAsync  (
              Object objWbemSink,
              String strObjectPath,
              String strResultClass,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.ReferencesToAsync(objWbemSink,strObjectPath,strResultClass,strRole,bClassesOnly,bSchemaOnly,strRequiredQualifier,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecNotificationQuery. Execute a Query to receive Notifications
   *
   * @param     strQuery The strQuery (in)
   * @param     strQueryLanguage The strQueryLanguage (in, optional, pass WQL if not required)
   * @param     iFlags The iFlags (in, optional, pass 48 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemEventSource
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemEventSource ExecNotificationQuery  (
              String strQuery,
              String strQueryLanguage,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.ExecNotificationQuery(strQuery,strQueryLanguage,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecNotificationQueryAsync. Execute an asynchronous Query to receive Notifications
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strQuery The strQuery (in)
   * @param     strQueryLanguage The strQueryLanguage (in, optional, pass WQL if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void ExecNotificationQueryAsync  (
              Object objWbemSink,
              String strQuery,
              String strQueryLanguage,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.ExecNotificationQueryAsync(objWbemSink,strQuery,strQueryLanguage,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecMethod. Execute a Method
   *
   * @param     strObjectPath The strObjectPath (in)
   * @param     strMethodName The strMethodName (in)
   * @param     objWbemInParameters A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject ExecMethod  (
              String strObjectPath,
              String strMethodName,
              Object objWbemInParameters,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.ExecMethod(strObjectPath,strMethodName,objWbemInParameters,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecMethodAsync. Execute a Method asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strObjectPath The strObjectPath (in)
   * @param     strMethodName The strMethodName (in)
   * @param     objWbemInParameters A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void ExecMethodAsync  (
              Object objWbemSink,
              String strObjectPath,
              String strMethodName,
              Object objWbemInParameters,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemServicesProxy.ExecMethodAsync(objWbemSink,strObjectPath,strMethodName,objWbemInParameters,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getSecurity_. The Security Configurator for this Object
   *
   * @return    A reference to a wbemdisp.ISWbemSecurity
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemSecurity getSecurity_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemServicesProxy.getSecurity_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

}
