package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.CurrencyDTO;

public interface CurrencyController {

    public void createCurrency(CurrencyDTO currencyDTO);

    public void editCurrency(CurrencyDTO currencyDTO);

    public void removeCurrency(CurrencyDTO currencyDTO);

//    public void updateSalary(Long salary, CurrencyDTO currencyDTO);
//
//    public void updateCurrency(String location, Location applicant);
//
//    public void updateCurrency(String location, Long applicantId);
//
//    public void addCurrency(String location, Long applicantId);
//
//    public void updateCurrency(CurrencyDTO currencyDTO, Long applicantId);

    CurrencyDTO findCurrency(Object id);

    List<CurrencyDTO> findAllCurrency();

    List<CurrencyDTO> findRangeCurrency(int[] range);

    int countCurrency();
}
