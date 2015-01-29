package wbemdisp;

/**
 * COM Interface 'ISWbemDateTime'. Generated 21.04.2014 14:38:48
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A Datetime</B>'
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
public interface ISWbemDateTime {
  /**
   * getValue. The DMTF datetime
   *
   * @return    The strValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getValue  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setValue. The DMTF datetime
   *
   * @param     strValue The strValue (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setValue  (
              String strValue) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getYear. The Year component of the value (must be in the range 0-9999)
   *
   * @return    The iYear
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getYear  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setYear. The Year component of the value (must be in the range 0-9999)
   *
   * @param     iYear The iYear (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setYear  (
              int iYear) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isYearSpecified. Whether the Year component is specified
   *
   * @return    The bYearSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isYearSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setYearSpecified. Whether the Year component is specified
   *
   * @param     bYearSpecified The bYearSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setYearSpecified  (
              boolean bYearSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getMonth. The Month component of the value (must be in the range 1-12)
   *
   * @return    The iMonth
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMonth  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setMonth. The Month component of the value (must be in the range 1-12)
   *
   * @param     iMonth The iMonth (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMonth  (
              int iMonth) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isMonthSpecified. Whether the Month component is specified
   *
   * @return    The bMonthSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMonthSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setMonthSpecified. Whether the Month component is specified
   *
   * @param     bMonthSpecified The bMonthSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMonthSpecified  (
              boolean bMonthSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
   *
   * @return    The iDay
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getDay  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
   *
   * @param     iDay The iDay (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDay  (
              int iDay) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isDaySpecified. Whether the Day component is specified
   *
   * @return    The bDaySpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isDaySpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setDaySpecified. Whether the Day component is specified
   *
   * @param     bDaySpecified The bDaySpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDaySpecified  (
              boolean bDaySpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getHours. The Hours component of the value (must be in the range 0-23)
   *
   * @return    The iHours
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getHours  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setHours. The Hours component of the value (must be in the range 0-23)
   *
   * @param     iHours The iHours (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setHours  (
              int iHours) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isHoursSpecified. Whether the Hours component is specified
   *
   * @return    The bHoursSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isHoursSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setHoursSpecified. Whether the Hours component is specified
   *
   * @param     bHoursSpecified The bHoursSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setHoursSpecified  (
              boolean bHoursSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getMinutes. The Minutes component of the value (must be in the range 0-59)
   *
   * @return    The iMinutes
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMinutes  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setMinutes. The Minutes component of the value (must be in the range 0-59)
   *
   * @param     iMinutes The iMinutes (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMinutes  (
              int iMinutes) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isMinutesSpecified. Whether the Minutes component is specified
   *
   * @return    The bMinutesSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMinutesSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setMinutesSpecified. Whether the Minutes component is specified
   *
   * @param     bMinutesSpecified The bMinutesSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMinutesSpecified  (
              boolean bMinutesSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getSeconds. The Seconds component of the value (must be in the range 0-59)
   *
   * @return    The iSeconds
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getSeconds  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setSeconds. The Seconds component of the value (must be in the range 0-59)
   *
   * @param     iSeconds The iSeconds (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setSeconds  (
              int iSeconds) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isSecondsSpecified. Whether the Seconds component is specified
   *
   * @return    The bSecondsSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSecondsSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setSecondsSpecified. Whether the Seconds component is specified
   *
   * @param     bSecondsSpecified The bSecondsSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setSecondsSpecified  (
              boolean bSecondsSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
   *
   * @return    The iMicroseconds
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMicroseconds  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
   *
   * @param     iMicroseconds The iMicroseconds (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMicroseconds  (
              int iMicroseconds) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isMicrosecondsSpecified. Whether the Microseconds component is specified
   *
   * @return    The bMicrosecondsSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMicrosecondsSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setMicrosecondsSpecified. Whether the Microseconds component is specified
   *
   * @param     bMicrosecondsSpecified The bMicrosecondsSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMicrosecondsSpecified  (
              boolean bMicrosecondsSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getUTC. The UTC component of the value (must be in the range -720 to 720)
   *
   * @return    The iUTC
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getUTC  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setUTC. The UTC component of the value (must be in the range -720 to 720)
   *
   * @param     iUTC The iUTC (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setUTC  (
              int iUTC) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isUTCSpecified. Whether the UTC component is specified
   *
   * @return    The bUTCSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isUTCSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setUTCSpecified. Whether the UTC component is specified
   *
   * @param     bUTCSpecified The bUTCSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setUTCSpecified  (
              boolean bUTCSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * isInterval. Indicates whether this value describes an absolute date and time or is an interval
   *
   * @return    The bIsInterval
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isInterval  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setIsInterval. Indicates whether this value describes an absolute date and time or is an interval
   *
   * @param     bIsInterval The bIsInterval (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setIsInterval  (
              boolean bIsInterval) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * GetVarDate. Retrieve value in Variant compatible (VT_DATE) format
   *
   * @param     bIsLocal The bIsLocal (in, optional, pass true if not required)
   * @return    The dVarDate
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Date GetVarDate  (
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * SetVarDate. Set the value using Variant compatible (VT_DATE) format
   *
   * @param     dVarDate The dVarDate (in)
   * @param     bIsLocal The bIsLocal (in, optional, pass true if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetVarDate  (
              java.util.Date dVarDate,
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * GetFileTime. Retrieve value in FILETIME compatible string representation
   *
   * @param     bIsLocal The bIsLocal (in, optional, pass true if not required)
   * @return    The strFileTime
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String GetFileTime  (
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * SetFileTime. Set the value using FILETIME compatible string representation
   *
   * @param     strFileTime The strFileTime (in)
   * @param     bIsLocal The bIsLocal (in, optional, pass true if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void SetFileTime  (
              String strFileTime,
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID5e97458a_cf77_11d3_b38f_00105a1f473a = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemDateTimeProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "5e97458a-cf77-11d3-b38f-00105a1f473a";
  String DISPID_0_GET_NAME = "getValue";
  String DISPID_0_PUT_NAME = "setValue";
  String DISPID_1_GET_NAME = "getYear";
  String DISPID_1_PUT_NAME = "setYear";
  String DISPID_2_GET_NAME = "isYearSpecified";
  String DISPID_2_PUT_NAME = "setYearSpecified";
  String DISPID_3_GET_NAME = "getMonth";
  String DISPID_3_PUT_NAME = "setMonth";
  String DISPID_4_GET_NAME = "isMonthSpecified";
  String DISPID_4_PUT_NAME = "setMonthSpecified";
  String DISPID_5_GET_NAME = "getDay";
  String DISPID_5_PUT_NAME = "setDay";
  String DISPID_6_GET_NAME = "isDaySpecified";
  String DISPID_6_PUT_NAME = "setDaySpecified";
  String DISPID_7_GET_NAME = "getHours";
  String DISPID_7_PUT_NAME = "setHours";
  String DISPID_8_GET_NAME = "isHoursSpecified";
  String DISPID_8_PUT_NAME = "setHoursSpecified";
  String DISPID_9_GET_NAME = "getMinutes";
  String DISPID_9_PUT_NAME = "setMinutes";
  String DISPID_10_GET_NAME = "isMinutesSpecified";
  String DISPID_10_PUT_NAME = "setMinutesSpecified";
  String DISPID_11_GET_NAME = "getSeconds";
  String DISPID_11_PUT_NAME = "setSeconds";
  String DISPID_12_GET_NAME = "isSecondsSpecified";
  String DISPID_12_PUT_NAME = "setSecondsSpecified";
  String DISPID_13_GET_NAME = "getMicroseconds";
  String DISPID_13_PUT_NAME = "setMicroseconds";
  String DISPID_14_GET_NAME = "isMicrosecondsSpecified";
  String DISPID_14_PUT_NAME = "setMicrosecondsSpecified";
  String DISPID_15_GET_NAME = "getUTC";
  String DISPID_15_PUT_NAME = "setUTC";
  String DISPID_16_GET_NAME = "isUTCSpecified";
  String DISPID_16_PUT_NAME = "setUTCSpecified";
  String DISPID_17_GET_NAME = "isInterval";
  String DISPID_17_PUT_NAME = "setIsInterval";
  String DISPID_18_NAME = "GetVarDate";
  String DISPID_19_NAME = "SetVarDate";
  String DISPID_20_NAME = "GetFileTime";
  String DISPID_21_NAME = "SetFileTime";
}
