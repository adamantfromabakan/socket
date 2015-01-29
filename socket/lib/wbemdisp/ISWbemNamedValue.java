package wbemdisp;

/**
 * COM Interface 'ISWbemNamedValue'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A named value</B>'
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
public interface ISWbemNamedValue {
  /**
   * getValue. The Value of this Named element
   *
   * @return    A Variant
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getValue  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setValue. The Value of this Named element
   *
   * @param     varValue A Variant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setValue  (
              Object varValue) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getName. The Name of this Value
   *
   * @return    The strName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getName  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID76a64164_cb41_11d1_8b02_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemNamedValueProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "76a64164-cb41-11d1-8b02-00600806d9b6";
  String DISPID_0_GET_NAME = "getValue";
  String DISPID_0_PUT_NAME = "setValue";
  String DISPID_2_GET_NAME = "getName";
}
