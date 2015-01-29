package wbemdisp;

/**
 * COM Interface 'ISWbemProperty'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Property</B>'
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
public interface ISWbemProperty {
  /**
   * getValue. The value of this Property
   *
   * @return    A Variant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getValue  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setValue. The value of this Property
   *
   * @param     varValue A Variant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setValue  (
              Object varValue) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getName. The name of this Property
   *
   * @return    The strName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getName  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isLocal. Indicates whether this Property is local or propagated
   *
   * @return    The bIsLocal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isLocal  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getOrigin. The originating class of this Property
   *
   * @return    The strOrigin
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getOrigin  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCIMType. The CIM Type of this Property
   *
   * @return    A wbemdisp.WbemCimtypeEnum constant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCIMType  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getQualifiers_. The collection of Qualifiers of this Property
   *
   * @return    A reference to a wbemdisp.ISWbemQualifierSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifierSet getQualifiers_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isArray. Indicates whether this Property is an array type
   *
   * @return    The bIsArray
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isArray  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID1a388f98_d4ba_11d1_8b09_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemPropertyProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "1a388f98-d4ba-11d1-8b09-00600806d9b6";
  String DISPID_0_GET_NAME = "getValue";
  String DISPID_0_PUT_NAME = "setValue";
  String DISPID_1_GET_NAME = "getName";
  String DISPID_2_GET_NAME = "isLocal";
  String DISPID_3_GET_NAME = "getOrigin";
  String DISPID_4_GET_NAME = "getCIMType";
  String DISPID_5_GET_NAME = "getQualifiers_";
  String DISPID_6_GET_NAME = "isArray";
}
