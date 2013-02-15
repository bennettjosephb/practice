/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Document;
import java.util.List;

/**
 *
 * author SONY
 */

public interface DocumentDAO {

    void createDocument(Document document);

    void editDocument(Document document);

    void removeDocument(Document document);

    Document findDocument(Object id);

    List<Document> findAllDocument();

    List<Document> findRangeDocument(int[] range);

    int countDocument();

}
