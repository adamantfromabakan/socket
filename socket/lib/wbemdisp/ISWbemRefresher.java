package wbemdisp;

/**
 * COM Interface 'ISWbemRefresher'. Generated 18.04.2014 15:20:22
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Collection of Refreshable Objects</B>'
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
public interface ISWbemRefresher extends java.io.Serializable {
  /**
   * get_NewEnum. 
   *
   * @return    An enumeration.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Enumeration get_NewEnum  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * item. Get an item from this refresher
   *
   * @param     iIndex The iIndex (in)
   * @return    A reference to a wbemdisp.ISWbemRefreshableItem
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefreshableItem item  (
              int iIndex) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCount. The number of items in this refresher
   *
   * @return    The iCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCount  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * add. Add a refreshable instance to this refresher
   *
   * @param     objWbemServices A reference to a wbemdisp.ISWbemServicesEx (in)
   * @param     bsInstancePath The bsInstancePath (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemRefreshableItem
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefreshableItem add  (
              wbemdisp.ISWbemServicesEx objWbemServices,
              String bsInstancePath,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * addEnum. Add a refreshable enumerator to this refresher
   *
   * @param     objWbemServices A reference to a wbemdisp.ISWbemServicesEx (in)
   * @param     bsClassName The bsClassName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @param     objWbemNamedValueSet A reference to another Automation Object (IDispatch) (in, optional, pass IDispatch if not required)
   * @return    A reference to a wbemdisp.ISWbemRefreshableItem
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefreshableItem addEnum  (
              wbemdisp.ISWbemServicesEx objWbemServices,
              String bsClassName,
              int iFlags,
              Object objWbemNamedValueSet) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * remove. Remove an item from this refresher
   *
   * @param     iIndex The iIndex (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void remove  (
              int iIndex,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * refresh. Refresh all items in this collection
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void refresh  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isAutoReconnect. Whether to attempt auto-reconnection to a remote provider
   *
   * @return    The bCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isAutoReconnect  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setAutoReconnect. Whether to attempt auto-reconnection to a remote provider
   *
   * @param     bCount The bCount (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setAutoReconnect  (
              boolean bCount) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * deleteAll. Delete all items in this collection
   *
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void deleteAll  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID14d8250e_d9c2_11d3_b38f_00105a1f473a = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemRefresherProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "14d8250e-d9c2-11d3-b38f-00105a1f473a";
  String DISPID__4_GET_NAME = "get_NewEnum";
  String DISPID_0_NAME = "item";
  String DISPID_1_GET_NAME = "getCount";
  String DISPID_2_NAME = "add";
  String DISPID_3_NAME = "addEnum";
  String DISPID_4_NAME = "remove";
  String DISPID_5_NAME = "refresh";
  String DISPID_6_GET_NAME = "isAutoReconnect";
  String DISPID_6_PUT_NAME = "setAutoReconnect";
  String DISPID_7_NAME = "deleteAll";
}
