/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nonek
 */
public class Connection {
    
    private final String url="localhost";
    private final int port=27017;
    
    private MongoClient mongoClient;
    
    public Connection(){
        try {
            mongoClient = new MongoClient(url, port);
        } catch (UnknownHostException ex) {
            System.err.println("Error connecting to MongoDB Database");;
        }
    }
    
}
