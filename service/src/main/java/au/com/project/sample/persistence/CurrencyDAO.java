package au.com.project.sample.persistence;

import au.com.project.sample.domain.Currency;
import java.util.List;


public interface CurrencyDAO {

    public Currency createCurrency(Currency currency);

    public void updateCurrency(Currency currency);

    public void deleteCurrency(Currency currency);

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
