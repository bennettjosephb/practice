/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.Document;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface DocumentDAORemote {

    void createDocument(Document document);

    void editDocument(Document document);

    void removeDocument(Document document);

    Document findDocument(Object id);

    List<Document> findAllDocument();

    List<Document> findRangeDocument(int[] range);

    int countDocument();
    
}
