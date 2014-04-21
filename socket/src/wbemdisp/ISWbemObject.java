package wbemdisp;

/**
 * COM Interface 'ISWbemObject'. Generated 18.04.2014 15:20:21
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
public interface ISWbemObject extends java.io.Serializable {
  /**
   * put_. Save this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectPath put_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * putAsync_. Save this Object asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void putAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * delete_. Delete this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void delete_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * deleteAsync_. Delete this Object asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void deleteAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * instances_. Return all instances of this Class
   *
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet instances_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * instancesAsync_. Return all instances of this Class asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void instancesAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * subclasses_. Enumerate subclasses of this Class
   *
   * @param     iFlags The iFlags (in, optional, pass 16 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet subclasses_  (
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * subclassesAsync_. Enumerate subclasses of this Class asynchronously
   *
   * @param     objWbemSink A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     objWbemAsyncContext A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void subclassesAsync_  (
              Object objWbemSink,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * associators_. Get the Associators of this Object
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
  public wbemdisp.ISWbemObjectSet associators_  (
              String strAssocClass,
              String strResultClass,
              String strResultRole,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredAssocQualifier,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * associatorsAsync_. Get the Associators of this Object asynchronously
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
  public void associatorsAsync_  (
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
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * references_. Get the References to this Object
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
  public wbemdisp.ISWbemObjectSet references_  (
              String strResultClass,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * referencesAsync_. Get the References to this Object asynchronously
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
  public void referencesAsync_  (
              Object objWbemSink,
              String strResultClass,
              String strRole,
              boolean bClassesOnly,
              boolean bSchemaOnly,
              String strRequiredQualifier,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * execMethod_. Execute a Method of this Object
   *
   * @param     strMethodName The strMethodName (in)
   * @param     objWbemInParameters A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject execMethod_  (
              String strMethodName,
              Object objWbemInParameters,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * execMethodAsync_. Execute a Method of this Object asynchronously
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
  public void execMethodAsync_  (
              Object objWbemSink,
              String strMethodName,
              Object objWbemInParameters,
              int iFlags,
              Object objWbemNamedValueSet,
              Object objWbemAsyncContext) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * clone_. Clone this Object
   *
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject clone_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getObjectText_. Get the MOF text of this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    The strObjectText
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getObjectText_  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * spawnDerivedClass_. Create a subclass of this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject spawnDerivedClass_  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * spawnInstance_. Create an Instance of this Object
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject spawnInstance_  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * compareTo_. Compare this Object with another
   *
   * @param     objWbemObject A reference to another Automation Object (IDispatch) (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    The bResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean compareTo_  (
              Object objWbemObject,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getQualifiers_. The collection of Qualifiers of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemQualifierSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifierSet getQualifiers_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getProperties_. The collection of Properties of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemPropertySet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPropertySet getProperties_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getMethods_. The collection of Methods of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemMethodSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemMethodSet getMethods_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getDerivation_. An array of strings describing the class derivation heirarchy, in most-derived-from order (the first element in the array defines the superclass and the last element defines the dynasty class).
   *
   * @return    A Variant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getDerivation_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getPath_. The path of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemObjectPath
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectPath getPath_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getSecurity_. The Security Configurator for this Object
   *
   * @return    A reference to a wbemdisp.ISWbemSecurity
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemSecurity getSecurity_  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID76a6415a_cb41_11d1_8b02_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemObjectProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "76a6415a-cb41-11d1-8b02-00600806d9b6";
  String DISPID_1_NAME = "put_";
  String DISPID_2_NAME = "putAsync_";
  String DISPID_3_NAME = "delete_";
  String DISPID_4_NAME = "deleteAsync_";
  String DISPID_5_NAME = "instances_";
  String DISPID_6_NAME = "instancesAsync_";
  String DISPID_7_NAME = "subclasses_";
  String DISPID_8_NAME = "subclassesAsync_";
  String DISPID_9_NAME = "associators_";
  String DISPID_10_NAME = "associatorsAsync_";
  String DISPID_11_NAME = "references_";
  String DISPID_12_NAME = "referencesAsync_";
  String DISPID_13_NAME = "execMethod_";
  String DISPID_14_NAME = "execMethodAsync_";
  String DISPID_15_NAME = "clone_";
  String DISPID_16_NAME = "getObjectText_";
  String DISPID_17_NAME = "spawnDerivedClass_";
  String DISPID_18_NAME = "spawnInstance_";
  String DISPID_19_NAME = "compareTo_";
  String DISPID_20_GET_NAME = "getQualifiers_";
  String DISPID_21_GET_NAME = "getProperties_";
  String DISPID_22_GET_NAME = "getMethods_";
  String DISPID_23_GET_NAME = "getDerivation_";
  String DISPID_24_GET_NAME = "getPath_";
  String DISPID_25_GET_NAME = "getSecurity_";
}
