package wbemdisp;

/**
 * Constants from WbemChangeFlagEnum' enum. Generated 18.04.2014 15:20:21
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>Defines semantics of putting a Class or Instance</B>'
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
public interface WbemChangeFlagEnum extends java.io.Serializable {
  static final int wbemChangeFlagCreateOrUpdate = 0;
  static final int wbemChangeFlagUpdateOnly = 1;
  static final int wbemChangeFlagCreateOnly = 2;
  static final int wbemChangeFlagUpdateCompatible = 0;
  static final int wbemChangeFlagUpdateSafeMode = 32;
  static final int wbemChangeFlagUpdateForceMode = 64;
  static final int wbemChangeFlagStrongValidation = 128;
  static final int wbemChangeFlagAdvisory = 65536;
}
