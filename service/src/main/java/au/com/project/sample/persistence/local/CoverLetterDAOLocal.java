/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.CoverLetter;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface CoverLetterDAOLocal {

    void createCoverLetter(CoverLetter coverLetter);

    void editCoverLetter(CoverLetter coverLetter);

    void removeCoverLetter(CoverLetter coverLetter);

    CoverLetter findCoverLetter(Object id);

    List<CoverLetter> findAllCoverLetter();

    List<CoverLetter> findRangeCoverLetter(int[] range);

    int countCoverLetter();
        
}
