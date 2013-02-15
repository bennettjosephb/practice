package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Currency;
import au.com.project.sample.process.CurrencyController;
import java.util.List;

public class CurrencyControllerImpl  implements CurrencyController{

    public void createCurrency(Currency currency){}

    public void editCurrency(Currency currency){}

    public void removeCurrency(Currency currency){}

//    public void updateSalary(Long salary, Currency currency){}
//
//    public void updateCurrency(String location, Location applicant){}
//
//    public void updateCurrency(String location, Long applicantId){}
//
//    public void addCurrency(String location, Long applicantId){}
//
//    public void updateCurrency(Currency currency, Long applicantId){}

    public Currency findCurrency(Object id){return null;}

    public List<Currency> findAllCurrency(){return null;}

    public List<Currency> findRangeCurrency(int[] range){return null;}

    public int countCurrency(){return 0;}
}
