package au.com.project.sample.persistence.remote;

import javax.ejb.Remote;
import au.com.project.sample.domain.Currency;
import java.util.List;

@Remote
public interface CurrencyDAORemote
{
//    public void createCurrency(Currency currency);
//    public void editCurrency(Currency applicant);
//    public void removeCurrency(Currency applicant);
//    public void updateSalary(Long salary, Currency applicant);    
//    public Currency findCurrency(Long pKey);
//    public void updateCurrency(String location, Currency applicant);
//    public void updateCurrency(String location, Long applicantId);
//    public void addCurrency(String location, Long applicantId);
//    public void updateCurrency(Currency location, Long applicantId);
    public void createCurrency(Currency currency);

    public void editCurrency(Currency currency);

    public void removeCurrency(Currency currency);

//    public void updateSalary(Long salary, Currency currency);
//
//    public void updateCurrency(String location, Location applicant);
//
//    public void updateCurrency(String location, Long applicantId);
//
//    public void addCurrency(String location, Long applicantId);
//
//    public void updateCurrency(Currency currency, Long applicantId);

    Currency findCurrency(Object id);

    List<Currency> findAllCurrency();

    List<Currency> findRangeCurrency(int[] range);

    int countCurrency();
}
