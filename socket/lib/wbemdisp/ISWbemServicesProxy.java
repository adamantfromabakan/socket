package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemServices'. Generated 21.04.2014 14:38:46
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A connection to a Namespace</B>'
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
public class ISWbemServicesProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemServices, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemServices.class;

  public ISWbemServicesProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemServices.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemServicesProxy() {}

  public ISWbemServicesProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemServices.IID);
  }

  protected ISWbemServicesProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemServicesProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObject ав=retVal[] = { null };
    Object ав=parameters[] = { strObjectPath, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Get", 7, ав=parameters);
    return (wbemdisp.ISWbemObject)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strObjectPath, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("GetAsync", 8, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { strObjectPath, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Delete", 9, ав=parameters);
    return;
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strObjectPath, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("DeleteAsync", 10, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { strClass, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("InstancesOf", 11, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strClass, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("InstancesOfAsync", 12, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { strSuperclass, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("SubclassesOf", 13, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strSuperclass, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("SubclassesOfAsync", 14, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { strQuery, strQueryLanguage, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("ExecQuery", 15, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strQuery, strQueryLanguage, new Integer(lFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("ExecQueryAsync", 16, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { strObjectPath, strAssocClass, strResultClass, strResultRole, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredAssocQualifier, strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("AssociatorsOf", 17, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strObjectPath, strAssocClass, strResultClass, strResultRole, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredAssocQualifier, strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("AssociatorsOfAsync", 18, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { strObjectPath, strResultClass, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("ReferencesTo", 19, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strObjectPath, strResultClass, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("ReferencesToAsync", 20, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemEventSource ав=retVal[] = { null };
    Object ав=parameters[] = { strQuery, strQueryLanguage, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("ExecNotificationQuery", 21, ав=parameters);
    return (wbemdisp.ISWbemEventSource)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strQuery, strQueryLanguage, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("ExecNotificationQueryAsync", 22, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObject ав=retVal[] = { null };
    Object ав=parameters[] = { strObjectPath, strMethodName, objWbemInParameters, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("ExecMethod", 23, ав=parameters);
    return (wbemdisp.ISWbemObject)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strObjectPath, strMethodName, objWbemInParameters, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("ExecMethodAsync", 24, ав=parameters);
    return;
  }

  /**
   * getSecurity_. The Security Configurator for this Object
   *
   * @return    A reference to a wbemdisp.ISWbemSecurity
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemSecurity getSecurity_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemSecurity ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getSecurity_", 25, ав=parameters);
    return (wbemdisp.ISWbemSecurity)ав=retVal[0];
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("76a6415c-cb41-11d1-8b02-00600806d9b6", wbemdisp.ISWbemServicesProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemServicesProxy.class.getResource("ISWbemServicesProxy.MemberDesc.xml")));
  }
}
