package wbemdisp;

/**
 * Constants from WbemAuthenticationLevelEnum' enum. Generated 21.04.2014 14:38:46
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>Defines the security authentication level</B>'
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
public interface WbemAuthenticationLevelEnum {
  static final int wbemAuthenticationLevelDefault = 0;
  static final int wbemAuthenticationLevelNone = 1;
  static final int wbemAuthenticationLevelConnect = 2;
  static final int wbemAuthenticationLevelCall = 3;
  static final int wbemAuthenticationLevelPkt = 4;
  static final int wbemAuthenticationLevelPktIntegrity = 5;
  static final int wbemAuthenticationLevelPktPrivacy = 6;
}
