package com.titan.clients;

//import com.titan.travelagent.TravelAgentRemote;
//import com.titan.domain.Cabin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.NamingException;

import au.com.project.sample.domain.Currency;

public class Client {
    
    static{
        try {
            loadCurrencies();
        } catch (NamingException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void main(String[] args) throws InterruptedException {
//        try {
//
//            Applicant applicant = new Applicant();
//            Calendar calendar = Calendar.getInstance();
//            calendar.set(Calendar.DAY_OF_MONTH, 10);
//            calendar.set(Calendar.MONTH, Calendar.JUNE);
//            calendar.set(Calendar.YEAR, 1983);
//
//            applicant.setDob(calendar);
//            applicant.setGender(Boolean.TRUE);
//            Context jndiContext = getInitialContext();
//            Object ref = jndiContext.lookup("CurrencyBean/remote");
//            CurrencyDAORemote dao = (CurrencyDAORemote) ref;
//
//            Currency currency = new Currency();
//            currency.setCode("hai");
//            currency.setName("hai");
//
//            dao.createCurrency(currency);
//        } catch (javax.naming.NamingException ne) {
//            ne.printStackTrace();
//        }
    }

    public static Context getInitialContext()
            throws javax.naming.NamingException {
        return new javax.naming.InitialContext();
    }

//    private static void loadCurrencies() throws NamingException {
//        Context jndiContext = getInitialContext();
//        Object ref = jndiContext.lookup("CurrencyBean/remote");
//
//        CurrencyDAORemote dao = (CurrencyDAORemote) ref;
//
//        try {
//            // Open the file that is the first 
//            // command line parameter
//            FileInputStream fstream = new FileInputStream("C:/home/bennet/tech/project/java//jee/workbook/ex04_1 - Copy - Copy/src/main/com/titan/clients/currency.txt");
//            // Get the object of DataInputStream
//            DataInputStream in = new DataInputStream(fstream);
//            BufferedReader br = new BufferedReader(new InputStreamReader(in));
//            String strLine;
//            //Read File Line By Line
//
//            Currency currency = null;
//            while ((strLine = br.readLine()) != null) {
//                // Print the content on the console
//                String string[] = strLine.split("[,]");
//                currency = new Currency();
//                currency.setName(string[0]);
//                currency.setCode(string[1]);
//                dao.createCurrency(currency);
//                System.out.println("Adding...");
//            }
//            //Close the input stream
//            in.close();
//        } catch (Exception e) {//Catch exception if any
//            System.err.println("Error: " + e.getMessage());
//        }
//
//        
//        
//
//
//
//
//    }
    
    private static void loadCurrencies() throws NamingException {
//        Context jndiContext = getInitialContext();
  //      Object ref = jndiContext.lookup("CurrencyBean/remote");

    //    CurrencyDAORemote dao = (CurrencyDAORemote) ref;

        try {
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream("C:/home/bennet/tech/project/java//jee/workbook/ex04_1 - Copy - Copy/src/main/com/titan/clients/cities.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            FileOutputStream fileOutputStream = new FileOutputStream("cities1.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(dataOutputStream));
            Currency currency = null;
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                String string[] = strLine.split("[\\t]");
                System.out.println(string[0] +" : ");
                bufferedWriter.write(string[0]+"\n");
//                currency = new Currency();
  //              currency.setName(string[0]);
    //            currency.setCode(string[1]);
      //          dao.createCurrency(currency);
        //        System.out.println("Adding...");
            }
            bufferedWriter.close();
            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }





    }
}
