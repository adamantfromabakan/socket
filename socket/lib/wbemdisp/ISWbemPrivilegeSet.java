package wbemdisp;

/**
 * COM Interface 'ISWbemPrivilegeSet'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A collection of Privilege Overrides</B>'
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
public interface ISWbemPrivilegeSet {
  /**
   * get_NewEnum. 
   *
   * @return    An enumeration.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Enumeration get_NewEnum  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Item. Get a named Privilege from this collection
   *
   * @param     iPrivilege A wbemdisp.WbemPrivilegeEnum constant (in)
   * @return    A reference to a wbemdisp.ISWbemPrivilege
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilege Item  (
              int iPrivilege) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCount. The number of items in this collection
   *
   * @return    The iCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCount  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Add. Add a Privilege to this collection
   *
   * @param     iPrivilege A wbemdisp.WbemPrivilegeEnum constant (in)
   * @param     bIsEnabled The bIsEnabled (in, optional, pass true if not required)
   * @return    A reference to a wbemdisp.ISWbemPrivilege
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilege Add  (
              int iPrivilege,
              boolean bIsEnabled) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Remove. Remove a Privilege from this collection
   *
   * @param     iPrivilege A wbemdisp.WbemPrivilegeEnum constant (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Remove  (
              int iPrivilege) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * DeleteAll. Delete all items in this collection
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void DeleteAll  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * AddAsString. Add a named Privilege to this collection
   *
   * @param     strPrivilege The strPrivilege (in)
   * @param     bIsEnabled The bIsEnabled (in, optional, pass true if not required)
   * @return    A reference to a wbemdisp.ISWbemPrivilege
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemPrivilege AddAsString  (
              String strPrivilege,
              boolean bIsEnabled) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID26ee67bf_5804_11d2_8b4a_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemPrivilegeSetProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "26ee67bf-5804-11d2-8b4a-00600806d9b6";
  String DISPID__4_GET_NAME = "get_NewEnum";
  String DISPID_0_NAME = "Item";
  String DISPID_1_GET_NAME = "getCount";
  String DISPID_2_NAME = "Add";
  String DISPID_3_NAME = "Remove";
  String DISPID_4_NAME = "DeleteAll";
  String DISPID_5_NAME = "AddAsString";
}
