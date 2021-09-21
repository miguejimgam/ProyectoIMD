/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Miguel
 */

//ESTO ESTA OBSOLETO, HAY QUE CAMBIARLO A LAS UNIDADES DE PERSISTENCIA
public class ConexionDB {

    public static Connection getConnection() throws NamingException, SQLException {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("jdbc/imd");
        return ds.getConnection();
    }
}
