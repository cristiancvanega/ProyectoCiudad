/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Persistencia {
    ResultSet resultset;    
    Statement statement;
    private Connection connection;
    String DRIVER="org.postgresql.Driver";
    String URL="jdbc:postgresql://127.0.0.1/proyectociudad";
    String USERDB="postgres";
    String PASSDB="postgres";

    public Persistencia() {
        this.resultset = null;
        this.statement = null;
        this.connection = null;
        this.conectar();
    }
    
    public int conectar(){
        try{
            Class.forName(DRIVER);
        }
        catch (ClassNotFoundException e){
            System.out.println("No se pudo cargal el DRIVER :-( "+DRIVER);
			return -1;
        }
        try{
            setConnection(DriverManager.getConnection(URL,USERDB,PASSDB));
        }
        catch(SQLException e){
            System.out.println("No se pudo realizar la conexion :-(");
			return -2;
        }
	return 1;
    }

    public int verificar(String sql){
        try{
            statement=getConnection().createStatement();
            resultset= statement.executeQuery(sql);
            if (resultset.next())
                return 1;
            statement.close();
            }
        catch(SQLException e){
            System.out.println(e);
        }
        return -1;
    }

    public Grafo.Nodo[] getListNodos(){
        Grafo.Nodo[] list = new Grafo.Nodo[108];
        list[0] = new Grafo.Nodo(0, 0, 0);
        try {
//            statement=getConnection().createStatement();
            statement=this.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT x, y, id FROM coordnodos");
            while(rs.next()){
                list[rs.getInt(3)] = new Grafo.Nodo(rs.getInt(1), rs.getInt(2), rs.getInt(3));
//                System.out.println(rs.getInt(1) + ", " + rs.getInt(2) + ", " + rs.getInt(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public int actualizar(String sql){
        try{
            statement=getConnection().createStatement();
            statement.executeUpdate(sql);
            statement.close();
            return 1;
         }
        catch(SQLException e){
            System.out.println(e);
        }
        return -1;
    }
    
    public ResultSet consultar(String sql){
         try{
            statement=getConnection().createStatement();
            resultset= statement.executeQuery(sql);
         }
        catch(SQLException e){
            return null;
        }
         return resultset;
     }
    
    

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
    
}
