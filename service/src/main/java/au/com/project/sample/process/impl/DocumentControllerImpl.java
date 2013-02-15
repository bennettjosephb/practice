/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Document;
import au.com.project.sample.process.DocumentController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class DocumentControllerImpl  implements DocumentController{

    public void createDocument(Document document){}

    public void editDocument(Document document){}

    public void removeDocument(Document document){}

    public Document findDocument(Object id){return null;}

    public List<Document> findAllDocument(){return null;}

    public List<Document> findRangeDocument(int[] range){return null;}

    public int countDocument(){return 0;}
    
}
