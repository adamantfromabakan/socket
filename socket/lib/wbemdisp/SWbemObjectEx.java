package wbemdisp;

import com.linar.jintegra.*;

/**
 * COM Class 'SWbemObjectEx'. Generated 21.04.2014 14:38:46
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description '<B>A Class or Instance</B>'
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
public class SWbemObjectEx implements com.linar.jintegra.RemoteObjRef, wbemdisp.ISWbemObjectEx {

  private static final String CLSID = "d6bdafb2-9435-491f-bb87-6aa0f0bc31a2";

  protected String getJintegraVersion() { return "64 BETA"; }

  // Interface delegates
  private wbemdisp.ISWbemObjectExProxy d_ISWbemObjectExProxy = null;

  /** Access this COM class's wbemdisp.ISWbemObjectEx interface */
  public wbemdisp.ISWbemObjectEx getAsISWbemObjectEx() { return d_ISWbemObjectExProxy; }

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
  public static SWbemObjectEx getActiveObject() throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemObjectEx(com.linar.jintegra.Dispatch.getActiveObject(CLSID));
  }

  /**
   * bindUsingMoniker. Bind to a running instance of this class using the supplied ObjRef moniker
   *
   * @return    A reference to the running object.
   * @param     moniker The ObjRef Moniker (Created using Windows CreateObjrefMoniker() and IMoniker->GetDisplayName).
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static SWbemObjectEx bindUsingMoniker(String moniker) throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemObjectEx(com.linar.jintegra.Dispatch.bindUsingMoniker(moniker));
  }

  /** J-Integra for COM internal method */
  public com.linar.jintegra.Dispatch getJintegraDispatch() {  return d_ISWbemObjectExProxy; }
  /**
   * Construct a SWbemObjectEx using a reference to such an object returned from a COM server
   * @param     obj an object returned from a COM server
   * @exception java.io.IOException if there are problems communicating via DCOM 
   */
  public SWbemObjectEx(Object obj) throws java.io.IOException {
    d_ISWbemObjectExProxy = new wbemdisp.ISWbemObjectExProxy(obj);
  }

  /**
   * Release a SWbemObjectEx.
   */
  public void release() {
    com.linar.jintegra.Cleaner.release(d_ISWbemObjectExProxy);
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
      return d_ISWbemObjectExProxy.getPropertyByName(name);
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
      return d_ISWbemObjectExProxy.getPropertyByName(name, rhs);
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
    return d_ISWbemObjectExProxy.invokeMethodByName(name, parameters);
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
    return d_ISWbemObjectExProxy.invokeMethodByName(name, new Object[]{});
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.Refresh_(iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getSystemProperties_. The collection of System Properties of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemPropertySet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPropertySet getSystemProperties_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.getSystemProperties_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.GetText_(iObjectTextFormat,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.SetFromText_(bsText,iObjectTextFormat,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Put_. Save this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectPath Put_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.Put_(iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * PutAsync_. Save this Object asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void PutAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.PutAsync_(objWbemSink,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Delete_. Delete this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Delete_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.Delete_(iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * DeleteAsync_. Delete this Object asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void DeleteAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.DeleteAsync_(objWbemSink,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Instances_. Return all instances of this Class
   *
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet Instances_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.Instances_(iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * InstancesAsync_. Return all instances of this Class asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void InstancesAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.InstancesAsync_(objWbemSink,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Subclasses_. Enumerate subclasses of this Class
   *
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet Subclasses_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.Subclasses_(iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * SubclassesAsync_. Enumerate subclasses of this Class asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SubclassesAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.SubclassesAsync_(objWbemSink,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Associators_. Get the Associators of this Object
   *
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
  public wbemdisp.ISWbemObjectSet Associators_  (
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
      return d_ISWbemObjectExProxy.Associators_(strAssocClass,strResultClass,strResultRole,strRole,bClassesOnly,bSchemaOnly,strRequiredAssocQualifier,strRequiredQualifier,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * AssociatorsAsync_. Get the Associators of this Object asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
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
  public void AssociatorsAsync_  (
              Object objWbemSink,
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
      d_ISWbemObjectExProxy.AssociatorsAsync_(objWbemSink,strAssocClass,strResultClass,strResultRole,strRole,bClassesOnly,bSchemaOnly,strRequiredAssocQualifier,strRequiredQualifier,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * References_. Get the References to this Object
   *
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
  public wbemdisp.ISWbemObjectSet References_  (
              String strResultClass,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.References_(strResultClass,strRole,bClassesOnly,bSchemaOnly,strRequiredQualifier,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ReferencesAsync_. Get the References to this Object asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
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
  public void ReferencesAsync_  (
              Object objWbemSink,
              String strResultClass,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.ReferencesAsync_(objWbemSink,strResultClass,strRole,bClassesOnly,bSchemaOnly,strRequiredQualifier,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecMethod_. Execute a Method of this Object
   *
   * @param     strMethodName The strMethodName (in)
   * @param     objWbemInParameters A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject ExecMethod_  (
              String strMethodName,
              Object objWbemInParameters,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.ExecMethod_(strMethodName,objWbemInParameters,iFlags,objWbemNamedValueSet);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * ExecMethodAsync_. Execute a Method of this Object asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     strMethodName The strMethodName (in)
   * @param     objWbemInParameters A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void ExecMethodAsync_  (
              Object objWbemSink,
              String strMethodName,
              Object objWbemInParameters,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemObjectExProxy.ExecMethodAsync_(objWbemSink,strMethodName,objWbemInParameters,iFlags,objWbemNamedValueSet,objWbemAsyncContext);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * Clone_. Clone this Object
   *
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject Clone_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.Clone_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * GetObjectText_. Get the MOF text of this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    The strObjectText
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String GetObjectText_  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.GetObjectText_(iFlags);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * SpawnDerivedClass_. Create a subclass of this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject SpawnDerivedClass_  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.SpawnDerivedClass_(iFlags);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * SpawnInstance_. Create an Instance of this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject SpawnInstance_  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.SpawnInstance_(iFlags);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * CompareTo_. Compare this Object with another
   *
   * @param     objWbemObject A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    The bResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean CompareTo_  (
              Object objWbemObject,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.CompareTo_(objWbemObject,iFlags);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getQualifiers_. The collection of Qualifiers of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemQualifierSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifierSet getQualifiers_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.getQualifiers_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getProperties_. The collection of Properties of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemPropertySet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPropertySet getProperties_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.getProperties_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getMethods_. The collection of Methods of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemMethodSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemMethodSet getMethods_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.getMethods_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getDerivation_. An array of strings describing the class derivation heirarchy, in most-derived-from order (the first element in the array defines the superclass and the last element defines the dynasty class).
   *
   * @return    A Variant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getDerivation_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.getDerivation_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getPath_. The path of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemObjectPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectPath getPath_  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemObjectExProxy.getPath_();
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
      return d_ISWbemObjectExProxy.getSecurity_();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

}
