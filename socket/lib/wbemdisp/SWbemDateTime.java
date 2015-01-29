package wbemdisp;

import com.linar.jintegra.*;

/**
 * COM Class 'SWbemDateTime'. Generated 21.04.2014 14:38:46
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description '<B>Date & Time</B>'
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
public class SWbemDateTime implements com.linar.jintegra.RemoteObjRef, wbemdisp.ISWbemDateTime {

  private static final String CLSID = "47dfbe54-cf76-11d3-b38f-00105a1f473a";

  protected String getJintegraVersion() { return "64 BETA"; }

  // Interface delegates
  private wbemdisp.ISWbemDateTimeProxy d_ISWbemDateTimeProxy = null;

  /** Access this COM class's wbemdisp.ISWbemDateTime interface */
  public wbemdisp.ISWbemDateTime getAsISWbemDateTime() { return d_ISWbemDateTimeProxy; }

  /** Compare this object with another */
  public boolean equals(Object o) { 
	if(java.beans.Beans.isDesignTime()) return super.equals(o);
	else return getJintegraDispatch() == null ? false : getJintegraDispatch().equals(o);
  }


  /** the hashcode for this object */
  public int hashCode() { return getJintegraDispatch() == null ? 0 : getJintegraDispatch().hashCode(); }

   /**
   * getActiveObject. Get a reference to a running instance of this class on the current machine using native code.
   *                  <B>Uses native code (See GetActiveObject() in MS doc) and thus can only be used on MS Windows</B>
   *
   * @return    A reference to the running object.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static SWbemDateTime getActiveObject() throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemDateTime(com.linar.jintegra.Dispatch.getActiveObject(CLSID));
  }

  /**
   * bindUsingMoniker. Bind to a running instance of this class using the supplied ObjRef moniker
   *
   * @return    A reference to the running object.
   * @param     moniker The ObjRef Moniker (Created using Windows CreateObjrefMoniker() and IMoniker->GetDisplayName).
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static SWbemDateTime bindUsingMoniker(String moniker) throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new SWbemDateTime(com.linar.jintegra.Dispatch.bindUsingMoniker(moniker));
  }

  /** J-Integra for COM internal method */
  public com.linar.jintegra.Dispatch getJintegraDispatch() {  return d_ISWbemDateTimeProxy; }

  /**
   * Constructs a SWbemDateTime on the local host.
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public SWbemDateTime() throws java.io.IOException, java.net.UnknownHostException {
    this("localhost");
  }

  /**
   * Construct a SWbemDateTime on specified host.
   * @param     host  the host on which the object should be created
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public SWbemDateTime(String host) throws java.io.IOException, java.net.UnknownHostException {
    d_ISWbemDateTimeProxy = new wbemdisp.ISWbemDateTimeProxy(CLSID, host, null);
  }

  /**
   * Construct a SWbemDateTime using a reference to such an object returned from a COM server
   * @param     obj an object returned from a COM server
   * @exception java.io.IOException if there are problems communicating via DCOM 
   */
  public SWbemDateTime(Object obj) throws java.io.IOException {
    d_ISWbemDateTimeProxy = new wbemdisp.ISWbemDateTimeProxy(obj);
  }

  /**
   * Release a SWbemDateTime.
   */
  public void release() {
    com.linar.jintegra.Cleaner.release(d_ISWbemDateTimeProxy);
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
    try {
      return d_ISWbemDateTimeProxy.getPropertyByName(name);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    } catch(NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.fillInStackTrace();
      throw noSuchFieldException;
    }
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name and a parameter
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @param     rhs A parameter used when getting the proxy.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name, Object rhs) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getPropertyByName(name, rhs);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    } catch(NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.fillInStackTrace();
      throw noSuchFieldException;
    }
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked.
   * @param     parameters One element for each parameter. Use primitive type wrappers.
   *            to pass primitive types (eg Integer to pass an int).
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name, Object[] parameters) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    return d_ISWbemDateTimeProxy.invokeMethodByName(name, parameters);
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked.
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    return d_ISWbemDateTimeProxy.invokeMethodByName(name, new Object[]{});
  }

  /**
   * getValue. The DMTF datetime
   *
   * @return    The strValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getValue  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getValue();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setValue. The DMTF datetime
   *
   * @param     strValue The strValue (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setValue  (
              String strValue) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setValue(strValue);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getYear. The Year component of the value (must be in the range 0-9999)
   *
   * @return    The iYear
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getYear  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getYear();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setYear. The Year component of the value (must be in the range 0-9999)
   *
   * @param     iYear The iYear (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setYear  (
              int iYear) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setYear(iYear);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isYearSpecified. Whether the Year component is specified
   *
   * @return    The bYearSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isYearSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isYearSpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setYearSpecified. Whether the Year component is specified
   *
   * @param     bYearSpecified The bYearSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setYearSpecified  (
              boolean bYearSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setYearSpecified(bYearSpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getMonth. The Month component of the value (must be in the range 1-12)
   *
   * @return    The iMonth
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMonth  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getMonth();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setMonth. The Month component of the value (must be in the range 1-12)
   *
   * @param     iMonth The iMonth (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMonth  (
              int iMonth) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setMonth(iMonth);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isMonthSpecified. Whether the Month component is specified
   *
   * @return    The bMonthSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMonthSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isMonthSpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setMonthSpecified. Whether the Month component is specified
   *
   * @param     bMonthSpecified The bMonthSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMonthSpecified  (
              boolean bMonthSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setMonthSpecified(bMonthSpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
   *
   * @return    The iDay
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getDay  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getDay();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setDay. The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
   *
   * @param     iDay The iDay (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDay  (
              int iDay) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setDay(iDay);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isDaySpecified. Whether the Day component is specified
   *
   * @return    The bDaySpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isDaySpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isDaySpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setDaySpecified. Whether the Day component is specified
   *
   * @param     bDaySpecified The bDaySpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setDaySpecified  (
              boolean bDaySpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setDaySpecified(bDaySpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getHours. The Hours component of the value (must be in the range 0-23)
   *
   * @return    The iHours
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getHours  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getHours();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setHours. The Hours component of the value (must be in the range 0-23)
   *
   * @param     iHours The iHours (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setHours  (
              int iHours) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setHours(iHours);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isHoursSpecified. Whether the Hours component is specified
   *
   * @return    The bHoursSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isHoursSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isHoursSpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setHoursSpecified. Whether the Hours component is specified
   *
   * @param     bHoursSpecified The bHoursSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setHoursSpecified  (
              boolean bHoursSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setHoursSpecified(bHoursSpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getMinutes. The Minutes component of the value (must be in the range 0-59)
   *
   * @return    The iMinutes
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMinutes  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getMinutes();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setMinutes. The Minutes component of the value (must be in the range 0-59)
   *
   * @param     iMinutes The iMinutes (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMinutes  (
              int iMinutes) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setMinutes(iMinutes);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isMinutesSpecified. Whether the Minutes component is specified
   *
   * @return    The bMinutesSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMinutesSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isMinutesSpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setMinutesSpecified. Whether the Minutes component is specified
   *
   * @param     bMinutesSpecified The bMinutesSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMinutesSpecified  (
              boolean bMinutesSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setMinutesSpecified(bMinutesSpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getSeconds. The Seconds component of the value (must be in the range 0-59)
   *
   * @return    The iSeconds
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getSeconds  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getSeconds();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setSeconds. The Seconds component of the value (must be in the range 0-59)
   *
   * @param     iSeconds The iSeconds (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setSeconds  (
              int iSeconds) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setSeconds(iSeconds);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isSecondsSpecified. Whether the Seconds component is specified
   *
   * @return    The bSecondsSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isSecondsSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isSecondsSpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setSecondsSpecified. Whether the Seconds component is specified
   *
   * @param     bSecondsSpecified The bSecondsSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setSecondsSpecified  (
              boolean bSecondsSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setSecondsSpecified(bSecondsSpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
   *
   * @return    The iMicroseconds
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getMicroseconds  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getMicroseconds();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setMicroseconds. The Microseconds component of the value (must be in the range 0-999999)
   *
   * @param     iMicroseconds The iMicroseconds (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMicroseconds  (
              int iMicroseconds) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setMicroseconds(iMicroseconds);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isMicrosecondsSpecified. Whether the Microseconds component is specified
   *
   * @return    The bMicrosecondsSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isMicrosecondsSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isMicrosecondsSpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setMicrosecondsSpecified. Whether the Microseconds component is specified
   *
   * @param     bMicrosecondsSpecified The bMicrosecondsSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setMicrosecondsSpecified  (
              boolean bMicrosecondsSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setMicrosecondsSpecified(bMicrosecondsSpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getUTC. The UTC component of the value (must be in the range -720 to 720)
   *
   * @return    The iUTC
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getUTC  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.getUTC();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setUTC. The UTC component of the value (must be in the range -720 to 720)
   *
   * @param     iUTC The iUTC (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setUTC  (
              int iUTC) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setUTC(iUTC);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isUTCSpecified. Whether the UTC component is specified
   *
   * @return    The bUTCSpecified
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isUTCSpecified  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isUTCSpecified();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setUTCSpecified. Whether the UTC component is specified
   *
   * @param     bUTCSpecified The bUTCSpecified (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setUTCSpecified  (
              boolean bUTCSpecified) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setUTCSpecified(bUTCSpecified);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * isInterval. Indicates whether this value describes an absolute date and time or is an interval
   *
   * @return    The bIsInterval
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public boolean isInterval  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.isInterval();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setIsInterval. Indicates whether this value describes an absolute date and time or is an interval
   *
   * @param     bIsInterval The bIsInterval (in)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void setIsInterval  (
              boolean bIsInterval) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.setIsInterval(bIsInterval);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
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
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.GetVarDate(bIsLocal);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
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
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.SetVarDate(dVarDate,bIsLocal);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
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
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_ISWbemDateTimeProxy.GetFileTime(bIsLocal);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
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
              boolean bIsLocal) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      d_ISWbemDateTimeProxy.SetFileTime(strFileTime,bIsLocal);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

}
