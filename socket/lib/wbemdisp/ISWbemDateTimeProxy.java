package wbemdisp;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'ISWbemDateTime'. Generated 21.04.2014 14:38:48
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
 *   ClashPrefix = ��=
 *   ImplementConflictingInterfaces = False
 *   DontRenameSameMethods = False
 *   RenameConflictingInterfaceMethods = False
 *   ReuseMethods = False
 *
 * Command Line Only Options:
 *   MakeClsidsPublic = False
 *   DontOverwrite = False
 */
public class ISWbemDateTimeProxy extends com.linar.jintegra.Dispatch implements wbemdisp.ISWbemDateTime, java.io.Serializable {

  protected String getJintegraVersion() { return "64 BETA"; }

  static { wbemdisp.JIntegraInit.init(); }

  public static final Class targetClass = ISWbemDateTime.class;

  public ISWbemDateTimeProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, ISWbemDateTime.IID, host, authInfo);
  }

  /** For internal use only */
  public ISWbemDateTimeProxy() {}

  public ISWbemDateTimeProxy(Object obj) throws java.io.IOException {
    super(obj, ISWbemDateTime.IID);
  }

  protected ISWbemDateTimeProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected ISWbemDateTimeProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
    super(CLSID, iid, host, authInfo);
  }

  public void addListener(String iidStr, Object theListener, Object theSource) throws java.io.IOException {
    super.addListener(iidStr, theListener, theSource);
  }

  public void removeListener(String iidStr, Object theListener) throws java.io.IOException {
    super.removeListener(iidStr, theListener);
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant parameters[] = {};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name and a parameter value
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @param     rhs Parameter used when getting the property.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name, Object rhs) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant parameters[] = {rhs == null ? new Variant("rhs", 10, 0x80020004L) : new Variant("rhs", 12, rhs)};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @param     parameters One element for each parameter.  Use primitive type wrappers
   *            to pass primitive types (eg Integer to pass an int).
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name, Object[] parameters) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant variantParameters[] = new com.linar.jintegra.Variant[parameters.length];
    for(int i = 0; i < parameters.length; i++) {
      variantParameters[i] = parameters[i] == null ? new Variant("p" + i, 10, 0x80020004L) :
	                                                   new Variant("p" + i, 12, parameters[i]);
    }
    try {
      return super.invoke(name, super.getDispatchIdOfName(name), 1, variantParameters).getVARIANT();
    } catch(NoSuchFieldException nsfe) {
      throw new NoSuchMethodException("There is no method called " + name);
    }
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
      return invokeMethodByName(name, new Object[]{});
  }

  /**
   * getValue. The DMTF datetime
   *
   * @return    The strValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getValue  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getValue", 7, ��=parameters);
    return (String)��=retVal[0];
  }

  /**
   * setValue. The DMTF datetime
   *
   * @param     strValue The strValue (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setValue  (
              String strValue) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strValue, ��=retVal };
    vtblInvoke("setValue", 8, ��=parameters);
    return;
  }

  /**
   * getYear. The Year component of the value (must be in the range 0-9999)
   *
   * @return    The iYear
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getYear  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getYear", 9, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setYear. The Year component of the value (must be in the range 0-9999)
   *
   * @param     iYear The iYear (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setYear  (
              int iYear) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iYear), ��=retVal };
    vtblInvoke("setYear", 10, ��=parameters);
    return;
  }

  /**
   * isYearSpecified. Whether the Year component is specified
   *
   * @return    The bYearSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isYearSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isYearSpecified", 11, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setYearSpecified. Whether the Year component is specified
   *
   * @param     bYearSpecified The bYearSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setYearSpecified  (
              boolean bYearSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bYearSpecified), ��=retVal };
    vtblInvoke("setYearSpecified", 12, ��=parameters);
    return;
  }

  /**
   * getMonth. The Month component of the value (must be in the range 1-12)
   *
   * @return    The iMonth
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMonth  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getMonth", 13, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setMonth. The Month component of the value (must be in the range 1-12)
   *
   * @param     iMonth The iMonth (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMonth  (
              int iMonth) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iMonth), ��=retVal };
    vtblInvoke("setMonth", 14, ��=parameters);
    return;
  }

  /**
   * isMonthSpecified. Whether the Month component is specified
   *
   * @return    The bMonthSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMonthSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isMonthSpecified", 15, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setMonthSpecified. Whether the Month component is specified
   *
   * @param     bMonthSpecified The bMonthSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMonthSpecified  (
              boolean bMonthSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bMonthSpecified), ��=retVal };
    vtblInvoke("setMonthSpecified", 16, ��=parameters);
    return;
  }

  /**
   * getDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
   *
   * @return    The iDay
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getDay  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getDay", 17, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
   *
   * @param     iDay The iDay (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDay  (
              int iDay) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iDay), ��=retVal };
    vtblInvoke("setDay", 18, ��=parameters);
    return;
  }

  /**
   * isDaySpecified. Whether the Day component is specified
   *
   * @return    The bDaySpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isDaySpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isDaySpecified", 19, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setDaySpecified. Whether the Day component is specified
   *
   * @param     bDaySpecified The bDaySpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDaySpecified  (
              boolean bDaySpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bDaySpecified), ��=retVal };
    vtblInvoke("setDaySpecified", 20, ��=parameters);
    return;
  }

  /**
   * getHours. The Hours component of the value (must be in the range 0-23)
   *
   * @return    The iHours
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getHours  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getHours", 21, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setHours. The Hours component of the value (must be in the range 0-23)
   *
   * @param     iHours The iHours (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setHours  (
              int iHours) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iHours), ��=retVal };
    vtblInvoke("setHours", 22, ��=parameters);
    return;
  }

  /**
   * isHoursSpecified. Whether the Hours component is specified
   *
   * @return    The bHoursSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isHoursSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isHoursSpecified", 23, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setHoursSpecified. Whether the Hours component is specified
   *
   * @param     bHoursSpecified The bHoursSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setHoursSpecified  (
              boolean bHoursSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bHoursSpecified), ��=retVal };
    vtblInvoke("setHoursSpecified", 24, ��=parameters);
    return;
  }

  /**
   * getMinutes. The Minutes component of the value (must be in the range 0-59)
   *
   * @return    The iMinutes
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMinutes  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getMinutes", 25, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setMinutes. The Minutes component of the value (must be in the range 0-59)
   *
   * @param     iMinutes The iMinutes (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMinutes  (
              int iMinutes) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iMinutes), ��=retVal };
    vtblInvoke("setMinutes", 26, ��=parameters);
    return;
  }

  /**
   * isMinutesSpecified. Whether the Minutes component is specified
   *
   * @return    The bMinutesSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMinutesSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isMinutesSpecified", 27, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setMinutesSpecified. Whether the Minutes component is specified
   *
   * @param     bMinutesSpecified The bMinutesSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMinutesSpecified  (
              boolean bMinutesSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bMinutesSpecified), ��=retVal };
    vtblInvoke("setMinutesSpecified", 28, ��=parameters);
    return;
  }

  /**
   * getSeconds. The Seconds component of the value (must be in the range 0-59)
   *
   * @return    The iSeconds
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getSeconds  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getSeconds", 29, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setSeconds. The Seconds component of the value (must be in the range 0-59)
   *
   * @param     iSeconds The iSeconds (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setSeconds  (
              int iSeconds) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iSeconds), ��=retVal };
    vtblInvoke("setSeconds", 30, ��=parameters);
    return;
  }

  /**
   * isSecondsSpecified. Whether the Seconds component is specified
   *
   * @return    The bSecondsSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSecondsSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isSecondsSpecified", 31, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setSecondsSpecified. Whether the Seconds component is specified
   *
   * @param     bSecondsSpecified The bSecondsSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setSecondsSpecified  (
              boolean bSecondsSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bSecondsSpecified), ��=retVal };
    vtblInvoke("setSecondsSpecified", 32, ��=parameters);
    return;
  }

  /**
   * getMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
   *
   * @return    The iMicroseconds
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMicroseconds  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getMicroseconds", 33, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
   *
   * @param     iMicroseconds The iMicroseconds (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMicroseconds  (
              int iMicroseconds) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iMicroseconds), ��=retVal };
    vtblInvoke("setMicroseconds", 34, ��=parameters);
    return;
  }

  /**
   * isMicrosecondsSpecified. Whether the Microseconds component is specified
   *
   * @return    The bMicrosecondsSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMicrosecondsSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isMicrosecondsSpecified", 35, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setMicrosecondsSpecified. Whether the Microseconds component is specified
   *
   * @param     bMicrosecondsSpecified The bMicrosecondsSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMicrosecondsSpecified  (
              boolean bMicrosecondsSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bMicrosecondsSpecified), ��=retVal };
    vtblInvoke("setMicrosecondsSpecified", 36, ��=parameters);
    return;
  }

  /**
   * getUTC. The UTC component of the value (must be in the range -720 to 720)
   *
   * @return    The iUTC
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getUTC  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int ��=retVal[] = { 0 };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("getUTC", 37, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setUTC. The UTC component of the value (must be in the range -720 to 720)
   *
   * @param     iUTC The iUTC (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setUTC  (
              int iUTC) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Integer(iUTC), ��=retVal };
    vtblInvoke("setUTC", 38, ��=parameters);
    return;
  }

  /**
   * isUTCSpecified. Whether the UTC component is specified
   *
   * @return    The bUTCSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isUTCSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isUTCSpecified", 39, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setUTCSpecified. Whether the UTC component is specified
   *
   * @param     bUTCSpecified The bUTCSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setUTCSpecified  (
              boolean bUTCSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bUTCSpecified), ��=retVal };
    vtblInvoke("setUTCSpecified", 40, ��=parameters);
    return;
  }

  /**
   * isInterval. Indicates whether this value describes an absolute date and time or is an interval
   *
   * @return    The bIsInterval
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isInterval  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    boolean ��=retVal[] = { false };
    Object ��=parameters[] = { ��=retVal };
    vtblInvoke("isInterval", 41, ��=parameters);
    return ��=retVal[0];
  }

  /**
   * setIsInterval. Indicates whether this value describes an absolute date and time or is an interval
   *
   * @param     bIsInterval The bIsInterval (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setIsInterval  (
              boolean bIsInterval) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bIsInterval), ��=retVal };
    vtblInvoke("setIsInterval", 42, ��=parameters);
    return;
  }

  /**
   * GetVarDate. Retrieve value in Variant compatible (VT_DATE) format
   *
   * @param     bIsLocal The bIsLocal (in, optional, pass true if not required)
   * @return    The dVarDate
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Date GetVarDate  (
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException{
    java.util.Date ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bIsLocal), ��=retVal };
    vtblInvoke("GetVarDate", 43, ��=parameters);
    return (java.util.Date)��=retVal[0];
  }

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
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { dVarDate, new Boolean(bIsLocal), ��=retVal };
    vtblInvoke("SetVarDate", 44, ��=parameters);
    return;
  }

  /**
   * GetFileTime. Retrieve value in FILETIME compatible string representation
   *
   * @param     bIsLocal The bIsLocal (in, optional, pass true if not required)
   * @return    The strFileTime
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String GetFileTime  (
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String ��=retVal[] = { null };
    Object ��=parameters[] = { new Boolean(bIsLocal), ��=retVal };
    vtblInvoke("GetFileTime", 45, ��=parameters);
    return (String)��=retVal[0];
  }

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
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException{
    Object ��=retVal[] = { null };
    Object ��=parameters[] = { strFileTime, new Boolean(bIsLocal), ��=retVal };
    vtblInvoke("SetFileTime", 46, ��=parameters);
    return;
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
      com.linar.jintegra.InterfaceDesc.add("5e97458a-cf77-11d3-b38f-00105a1f473a", wbemdisp.ISWbemDateTimeProxy.class, null, 7, MemberDesc.parseMemberDescFile(ISWbemDateTimeProxy.class.getResource("ISWbemDateTimeProxy.MemberDesc.xml")));
  }
}
