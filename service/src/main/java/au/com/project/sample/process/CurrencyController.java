package au.com.project.sample.process;

import au.com.project.sample.domain.Currency;
import java.util.List;
import javax.ejb.Local;

public interface CurrencyController {

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
