/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOComponents;

import java.util.List;
import javax.ejb.Local;
import models.First;
import models.Second;

/**
 *
 * @author User
 */
@Local
public interface DAOComponentsLocal {

    public List<First> getAllAuthors() throws Exception;

    public First addAuthor(First author) throws Exception;

    public boolean deleteAuthor(int idd) throws Exception;

    public List<Second> getAllBooks() throws Exception;
}
