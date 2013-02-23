/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.CoverLetter;
import java.util.List;

/**
 *
 * author SONY
 */

public interface CoverLetterDAO {

    void createCoverLetter(CoverLetter coverLetter);

    void updateCoverLetter(CoverLetter coverLetter);

    void deleteCoverLetter(CoverLetter coverLetter);

    CoverLetter findCoverLetter(Object id);

    List<CoverLetter> findAllCoverLetter();

    List<CoverLetter> findRangeCoverLetter(int[] range);

    int countCoverLetter();

}
