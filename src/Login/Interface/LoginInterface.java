/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.Interface;

/**
 *
 * @author ujjwal
 */
import java.rmi.*;
public interface LoginInterface extends Remote {

    /**
     *
     * @param user
     * @param pass
     * @return
     * @throws RemoteException
     */
    public boolean getLogin(String user,String pass) throws RemoteException;
}
