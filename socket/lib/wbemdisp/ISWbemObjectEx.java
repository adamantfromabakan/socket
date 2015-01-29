package wbemdisp;

/**
 * COM Interface 'ISWbemObjectEx'. Generated 21.04.2014 14:38:48
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
public interface ISWbemObjectEx extends wbemdisp.ISWbemObject {
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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getSystemProperties_. The collection of System Properties of this Object
   *
   * @return    A reference to a wbemdisp.ISWbemPropertySet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPropertySet getSystemProperties_  () throws java.io.IOException, com.linar.jintegra.AutomationException;

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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

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
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID269ad56a_8a67_4129_bc8c_0506dcfe9880 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemObjectExProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "269ad56a-8a67-4129-bc8c-0506dcfe9880";
  String DISPID_26_NAME = "Refresh_";
  String DISPID_27_GET_NAME = "getSystemProperties_";
  String DISPID_28_NAME = "GetText_";
  String DISPID_29_NAME = "SetFromText_";
}
