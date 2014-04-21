package wbemdisp;

/**
 * COM Interface 'ISWbemQualifier'. Generated 18.04.2014 15:20:21
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
public interface ISWbemQualifier extends java.io.Serializable {
  /**
   * getValue. The value of this Qualifier
   *
   * @return    A Variant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getValue  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setValue. The value of this Qualifier
   *
   * @param     varValue A Variant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setValue  (
              Object varValue) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getName. The name of this Qualifier
   *
   * @return    The strName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getName  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isLocal. Indicates whether this Qualifier is local or propagated
   *
   * @return    The bIsLocal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isLocal  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isPropagatesToSubclass. Determines whether this Qualifier can propagate to subclasses
   *
   * @return    The bPropagatesToSubclass
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isPropagatesToSubclass  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setPropagatesToSubclass. Determines whether this Qualifier can propagate to subclasses
   *
   * @param     bPropagatesToSubclass The bPropagatesToSubclass (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setPropagatesToSubclass  (
              boolean bPropagatesToSubclass) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isPropagatesToInstance. Determines whether this Qualifier can propagate to instances
   *
   * @return    The bPropagatesToInstance
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isPropagatesToInstance  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setPropagatesToInstance. Determines whether this Qualifier can propagate to instances
   *
   * @param     bPropagatesToInstance The bPropagatesToInstance (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setPropagatesToInstance  (
              boolean bPropagatesToInstance) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isOverridable. Determines whether this Qualifier can be overridden where propagated
   *
   * @return    The bIsOverridable
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isOverridable  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setIsOverridable. Determines whether this Qualifier can be overridden where propagated
   *
   * @param     bIsOverridable The bIsOverridable (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setIsOverridable  (
              boolean bIsOverridable) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isAmended. Determines whether the value of this Qualifier has been amended
   *
   * @return    The bIsAmended
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isAmended  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID79b05932_d3b7_11d1_8b06_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemQualifierProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "79b05932-d3b7-11d1-8b06-00600806d9b6";
  String DISPID_0_GET_NAME = "getValue";
  String DISPID_0_PUT_NAME = "setValue";
  String DISPID_1_GET_NAME = "getName";
  String DISPID_2_GET_NAME = "isLocal";
  String DISPID_3_GET_NAME = "isPropagatesToSubclass";
  String DISPID_3_PUT_NAME = "setPropagatesToSubclass";
  String DISPID_4_GET_NAME = "isPropagatesToInstance";
  String DISPID_4_PUT_NAME = "setPropagatesToInstance";
  String DISPID_5_GET_NAME = "isOverridable";
  String DISPID_5_PUT_NAME = "setIsOverridable";
  String DISPID_6_GET_NAME = "isAmended";
}
