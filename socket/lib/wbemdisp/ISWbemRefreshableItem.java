package wbemdisp;

/**
 * COM Interface 'ISWbemRefreshableItem'. Generated 18.04.2014 15:20:22
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A single item in a Refresher</B>'
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
public interface ISWbemRefreshableItem extends java.io.Serializable {
  /**
   * getIndex. The index of this item in the parent refresher
   *
   * @return    The iIndex
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getIndex  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getRefresher. The parent refresher
   *
   * @return    A reference to a wbemdisp.ISWbemRefresher
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemRefresher getRefresher  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isSet. Whether this item represents a single object or an object set
   *
   * @return    The bIsSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSet  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getObject. The object
   *
   * @return    A reference to a wbemdisp.ISWbemObjectEx
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectEx getObject  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getObjectSet. The object set
   *
   * @return    A reference to a wbemdisp.ISWbemObjectSet
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemObjectSet getObjectSet  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * remove. Remove this item from the parent refresher
   *
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void remove  (
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID5ad4bf92_daab_11d3_b38f_00105a1f473a = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemRefreshableItemProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "5ad4bf92-daab-11d3-b38f-00105a1f473a";
  String DISPID_1_GET_NAME = "getIndex";
  String DISPID_2_GET_NAME = "getRefresher";
  String DISPID_3_GET_NAME = "isSet";
  String DISPID_4_GET_NAME = "getObject";
  String DISPID_5_GET_NAME = "getObjectSet";
  String DISPID_6_NAME = "remove";
}
