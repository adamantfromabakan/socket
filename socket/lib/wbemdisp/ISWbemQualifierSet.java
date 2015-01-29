package wbemdisp;

/**
 * COM Interface 'ISWbemQualifierSet'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A collection of Qualifiers</B>'
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
public interface ISWbemQualifierSet {
  /**
   * get_NewEnum. 
   *
   * @return    An enumeration.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Enumeration get_NewEnum  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Item. Get a named Qualifier from this collection
   *
   * @param     name The name (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemQualifier
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifier Item  (
              String name,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCount. The number of items in this collection
   *
   * @return    The iCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCount  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Add. Add a Qualifier to this collection
   *
   * @param     strName The strName (in)
   * @param     varVal A Variant (in)
   * @param     bPropagatesToSubclass The bPropagatesToSubclass (in, optional, pass true if not required)
   * @param     bPropagatesToInstance The bPropagatesToInstance (in, optional, pass true if not required)
   * @param     bIsOverridable The bIsOverridable (in, optional, pass true if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemQualifier
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemQualifier Add  (
              String strName,
              Object varVal,
              boolean bPropagatesToSubclass,
              boolean bPropagatesToInstance,
              boolean bIsOverridable,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Remove. Remove a Qualifier from this collection
   *
   * @param     strName The strName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Remove  (
              String strName,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID9b16ed16_d3df_11d1_8b08_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemQualifierSetProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "9b16ed16-d3df-11d1-8b08-00600806d9b6";
  String DISPID__4_GET_NAME = "get_NewEnum";
  String DISPID_0_NAME = "Item";
  String DISPID_1_GET_NAME = "getCount";
  String DISPID_2_NAME = "Add";
  String DISPID_3_NAME = "Remove";
}
