package wbemdisp;

/**
 * COM Interface 'ISWbemMethod'. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Method</B>'
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
public interface ISWbemMethod extends java.io.Serializable {
  /**
   * getName. The name of this Method
   *
   * @return    The strName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getName  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getOrigin. The originating class of this Method
   *
   * @return    The strOrigin
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getOrigin  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getInParameters. The in parameters for this Method.
   *
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject getInParameters  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getOutParameters. The out parameters for this Method.
   *
   * @return    A reference to a wbemdisp.ISWbemObject
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObject getOutParameters  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getQualifiers_. The collection of Qualifiers of this Method.
   *
   * @return    A reference to a wbemdisp.ISWbemQualifierSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifierSet getQualifiers_  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID422e8e90_d955_11d1_8b09_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemMethodProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "422e8e90-d955-11d1-8b09-00600806d9b6";
  String DISPID_1_GET_NAME = "getName";
  String DISPID_2_GET_NAME = "getOrigin";
  String DISPID_3_GET_NAME = "getInParameters";
  String DISPID_4_GET_NAME = "getOutParameters";
  String DISPID_5_GET_NAME = "getQualifiers_";
}
