/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Salary;
import java.util.List;

/**
 *
 * author SONY
 */

public interface SalaryDAO {

    void createSalary(Salary salary);

    void editSalary(Salary salary);

    void removeSalary(Salary salary);

    Salary findSalary(Object id);

    List<Salary> findAllSalary();

    List<Salary> findRangeSalary(int[] range);

    int countSalary();

}
