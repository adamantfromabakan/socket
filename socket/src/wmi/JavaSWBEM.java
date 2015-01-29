package wmi;

import com.linar.jintegra.*;
import wbemdisp.*;
import java.util.Enumeration;

public class JavaSWBEM {

  public static void main(String args[]){
    // Uncomment this line if JavaSWBEM.java is running on another remote machine.
     //String NtDomain   = "MANAGING_MACHINE_NT_DOMAIN";
     //String NtUser     = "MANAGING_MACHINE_NT_USER";
     //String NtPassword = "MANAGING_MACHINE_NT_PASSWORD";
     String NtDomain   = "office";
     String NtUser     = "kargin_as";
     String NtPassword = "rundlladvapi";
    // Any Windows machine with WMI installed and configured for DCOM access.
    // For this example we use local machine where JavaSWBEM.java is running as the managing machine.
    String managingMachine = "localhost";

    // A Windows machine we need to manage. Can be any machine - can be same as or different from the managing machine.
    //String managedMachine  = "MANAGED_MACHINE_NETWORK_NAME";
    String managedMachine  = "localhost";

    try{
      // Enable logging:
      com.linar.jintegra.Log.logImmediately(3, "jintegra.log");

      // DCOM authentication: Make sure NtDomain, NtUser, NtPassword are valid credentials.
      // Uncomment this line if JavaSWBEM.java remotely accesses WMI:
       com.linar.jintegra.AuthInfo.setDefault(NtDomain, NtUser, NtPassword);

      // Create Service Locator on a Windows machine
      // This Locator object will be obtain WBEM services.
      wbemdisp.SWbemLocator wLoc = new wbemdisp.SWbemLocator(managingMachine);

      // An object representing WBEM services of the managed machine.
      ISWbemServices wbemServices  = null;
      // Obtain the service from the specified machine.
      wbemServices = wLoc.connectServer(
        managedMachine,
        null,
        null,
        null,
        null,
        null,
        0,
        null
      );

      // Get all the Processes running on the machine.
      ISWbemObjectSet processesSet = wbemServices.instancesOf("Win32_Process", 0, null);

      java.util.Enumeration processEnum = processesSet.get_NewEnum();

      try{
        while(true){
        // Get an individual process
        ISWbemObject process = new ISWbemObjectProxy(processEnum.nextElement());
        // Print out process information.
          System.out.println(process.getObjectText_(1));
        }
      }catch(java.util.NoSuchElementException nselex){
        System.out.println("No more processes found");
      }
    }catch(AutomationException aex){
      System.out.println("WMI has raised an exception:");
      aex.printStackTrace();
    }catch(Exception ex){
      ex.printStackTrace();
    }finally{
      // Release all the COM objects:
      com.linar.jintegra.Cleaner.releaseAll();
    }
  }
}
