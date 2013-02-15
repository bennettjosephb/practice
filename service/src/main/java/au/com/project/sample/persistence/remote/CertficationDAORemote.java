/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.Certification;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface CertficationDAORemote {

    void createCertfication(Certification certfication);

    void editCertfication(Certification certfication);

    void removeCertfication(Certification certfication);

    Certification findCertfication(Object id);

    List<Certification> findAllCertfication();

    List<Certification> findRangeCertfication(int[] range);

    int countCertfication();
    
}
