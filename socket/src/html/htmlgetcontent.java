package html;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class htmlgetcontent {

   public static void main(String[] args) {
      String str_host;
      if(args[0] == "") {
      	 str_host = "http://2ip.ru";
      } else {
         str_host = args[0];
      }

      String str_codepage;
      if(args[1] == "") {
         str_codepage = "utf-8";
      } else {
         str_codepage = args[1];
      }

      String str_path;
      if(args[2] == "") {
         str_path = "C:/SERVER/ADAMANT/";
      } else {
         str_path = args[2];
      }

      String str_file;
      if(args[3] == "") {
         str_file = "ip.html";
      } else {
         str_file = args[2];
      }

      try {
         File e = new File(str_path, str_file);

         try {
            BufferedWriter e1 = new BufferedWriter(new FileWriter(e, false), 16384);
            e1.write(getContentOfHTTPPage(str_host, str_codepage));
            e1.close();
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public static String getContentOfHTTPPage(String pageAddress, String codePage) throws Exception {
      StringBuilder sb = new StringBuilder();
      URL pageURL = new URL(pageAddress);
      URLConnection uc = pageURL.openConnection();
      BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream(), codePage));

      String inputLine;
      try {
         while((inputLine = br.readLine()) != null) {
            sb.append(inputLine);
            System.out.println(inputLine);
         }
      } finally {
         br.close();
      }

      return sb.toString();
   }
}
