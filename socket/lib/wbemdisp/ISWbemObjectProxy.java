package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemObject'. Generated 21.04.2014 14:38:47
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
public class ISWbemObjectProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemObject, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemObject.class;

  public ISWbemObjectProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemObject.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemObjectProxy() {}

  public ISWbemObjectProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemObject.IID);
  }

  protected ISWbemObjectProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemObjectProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectPath ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Put_", 7, ав=parameters);
    return (wbemdisp.ISWbemObjectPath)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("PutAsync_", 8, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Delete_", 9, ав=parameters);
    return;
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("DeleteAsync_", 10, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Instances_", 11, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("InstancesAsync_", 12, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Subclasses_", 13, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("SubclassesAsync_", 14, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { strAssocClass, strResultClass, strResultRole, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredAssocQualifier, strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("Associators_", 15, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strAssocClass, strResultClass, strResultRole, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredAssocQualifier, strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("AssociatorsAsync_", 16, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectSet ав=retVal[] = { null };
    Object ав=parameters[] = { strResultClass, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("References_", 17, ав=parameters);
    return (wbemdisp.ISWbemObjectSet)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strResultClass, strRole, new Boolean(bClassesOnly), new Boolean(bSchemaOnly), strRequiredQualifier, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("ReferencesAsync_", 18, ав=parameters);
    return;
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObject ав=retVal[] = { null };
    Object ав=parameters[] = { strMethodName, objWbemInParameters, new Integer(iFlags), objWbemNamedValueSet, ав=retVal };
    vtblInvoke("ExecMethod_", 19, ав=parameters);
    return (wbemdisp.ISWbemObject)ав=retVal[0];
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { objWbemSink, strMethodName, objWbemInParameters, new Integer(iFlags), objWbemNamedValueSet, objWbemAsyncContext, ав=retVal };
    vtblInvoke("ExecMethodAsync_", 20, ав=parameters);
    return;
  }

  /**
   * Clone_. Clone this Object
   *
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject Clone_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObject ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("Clone_", 21, ав=parameters);
    return (wbemdisp.ISWbemObject)ав=retVal[0];
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
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), ав=retVal };
    vtblInvoke("GetObjectText_", 22, ав=parameters);
    return (String)ав=retVal[0];
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
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObject ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), ав=retVal };
    vtblInvoke("SpawnDerivedClass_", 23, ав=parameters);
    return (wbemdisp.ISWbemObject)ав=retVal[0];
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
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObject ав=retVal[] = { null };
    Object ав=parameters[] = { new Integer(iFlags), ав=retVal };
    vtblInvoke("SpawnInstance_", 24, ав=parameters);
    return (wbemdisp.ISWbemObject)ав=retVal[0];
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
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ав=retVal[] = { false };
    Object ав=parameters[] = { objWbemObject, new Integer(iFlags), ав=retVal };
    vtblInvoke("CompareTo_", 25, ав=parameters);
    return ав=retVal[0];
  }

  /**
   * getQualifiers_. The collection of Qualifiers of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemQualifierSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifierSet getQualifiers_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemQualifierSet ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getQualifiers_", 26, ав=parameters);
    return (wbemdisp.ISWbemQualifierSet)ав=retVal[0];
  }

  /**
   * getProperties_. The collection of Properties of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemPropertySet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPropertySet getProperties_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemPropertySet ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getProperties_", 27, ав=parameters);
    return (wbemdisp.ISWbemPropertySet)ав=retVal[0];
  }

  /**
   * getMethods_. The collection of Methods of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemMethodSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemMethodSet getMethods_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemMethodSet ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getMethods_", 28, ав=parameters);
    return (wbemdisp.ISWbemMethodSet)ав=retVal[0];
  }

  /**
   * getDerivation_. An array of strings describing the class derivation heirarchy, in most-derived-from order (the first element in the array defines the superclass and the last element defines the dynasty class).
   *
   * @return    A Variant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getDerivation_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getDerivation_", 29, ав=parameters);
    return (Object)ав=retVal[0];
  }

  /**
   * getPath_. The path of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemObjectPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectPath getPath_  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    wbemdisp.ISWbemObjectPath ав=retVal[] = { null };
    Object ав=parameters[] = { ав=retVal };
    vtblInvoke("getPath_", 30, ав=parameters);
    return (wbemdisp.ISWbemObjectPath)ав=retVal[0];
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
    vtblInvoke("getSecurity_", 31, ав=parameters);
    return (wbemdisp.ISWbemSecurity)ав=retVal[0];
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("76a6415a-cb41-11d1-8b02-00600806d9b6", wbemdisp.ISWbemObjectProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemObjectProxy.class.getResource("ISWbemObjectProxy.MemberDesc.xml")));
  }
}
