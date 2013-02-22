package au.com.project.sample.persistence;

import au.com.project.sample.domain.Currency;
import java.util.List;


public interface CurrencyDAO {

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

    Currency findCurrencyByCode(String code);

    List<Currency> findAllCurrency();

    List<Currency> findRangeCurrency(int[] range);

    int countCurrency();
}
