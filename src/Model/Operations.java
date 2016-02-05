/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author nonek
 */
public class Operations extends Connection {
    
    DBCollection collection;
    BasicDBObject student,cource;
    
    public Operations(){
        
    }
    
    public void insertStudent(String dni, String name, String surname, String address, String birthdate, String[] telephones, String email, String cource){
        try{
            collection=getDatabase().getCollection("ALUMNOS");

            student=new BasicDBObject();
            student.append("dni", dni);
            student.append("name", name);
            student.append("surname", surname);
            student.append("address", address);
            student.append("birthdate", birthdate);
            student.append("telephones", telephones);
            student.append("email", email);
            student.append("cource", cource);

//            collection.ensureIndex(student, dni, true);

            collection.insert(student);
        } catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "INSERT ERROR. TRY AGAIN.");
        }
    }
    
    public void deleteStudent(String id){
        try{
            collection=getDatabase().getCollection("ALUMNOS");

            student=new BasicDBObject();
            student.put("_id", new ObjectId(id));
            student=(BasicDBObject) collection.findOne(student);
            collection.remove(student);
        } catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "DELETE ERROR. TRY AGAIN.");
        }
    }
    
    public void insertCource(String name){
        try{
            collection=getDatabase().getCollection("COURCES");

            cource=new BasicDBObject();
            cource.append("name", name);
            
//            collection.ensureIndex(cource, name, true);
            
            collection.insert(cource);
        } catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "INSERT ERROR. TRY AGAIN.");
        }
    }
    
    public void modifyCource(String id, String name){
        try{
            collection=getDatabase().getCollection("COURCES");

            BasicDBObject search=new BasicDBObject();
            search.put("_id", new ObjectId(id));
            search=(BasicDBObject) collection.findOne(cource);
            
            cource=new BasicDBObject();
            cource.append("name", name);
            
            collection.update(search, cource);
            
        } catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "MODIFY ERROR. TRY AGAIN.");
        }
    }
    
    public void deleteCource(String id){
        try{
            collection=getDatabase().getCollection("COURCES");

            cource=new BasicDBObject();
            cource.put("_id", new ObjectId(id));
            cource=(BasicDBObject) collection.findOne(cource);
            collection.remove(cource);
        } catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "DELETE ERROR. TRY AGAIN.");
        }
    }
    
    public DefaultTableModel getTableModel(String table){
        
        DefaultTableModel dtm=new DefaultTableModel();
        Vector columns=null;
        Vector row=null;
        
        DBCursor cursor=null;
        
        switch(table){
            case "ALUMNOS":
                columns=new Vector();
                columns.add("ID");
                columns.add("DNI");
                columns.add("NOMBRE");
                columns.add("APELLIDOS");
                columns.add("DOMICILIO");
                columns.add("TELEFONOS");
                columns.add("EMAIL");
                columns.add("FECHA");
                columns.add("CURSO");
                dtm.setColumnIdentifiers(columns);
                
                collection=getDatabase().getCollection("ALUMNOS");
                cursor=collection.find();
                while(cursor.hasNext()){
                    row=new Vector();
                    DBObject object=cursor.next();
                    row.add(object.get("_id"));
                    row.add(object.get("dni"));
                    row.add(object.get("name"));
                    row.add(object.get("surname"));
                    row.add(object.get("address"));
                    row.add(object.get("telephones"));
                    row.add(object.get("email"));
                    row.add(object.get("birthdate"));
                    row.add(object.get("cource"));
                    
                    dtm.addRow(row);
                }
                
                break;
            case "CURSOS":
                columns=new Vector();
                columns.add("ID");
                columns.add("NOMBRE");
                dtm.setColumnIdentifiers(columns);
                
                row=new Vector();
                collection=getDatabase().getCollection("COURCES");
                cursor=collection.find();
                while(cursor.hasNext()){
                    row=new Vector();
                    DBObject object=cursor.next();
                    row.add(object.get("_id"));
                    row.add(object.get("name"));
                    
                    dtm.addRow(row);
                }
                
                break;
        }
        
        return dtm;
    }
    
    public DefaultComboBoxModel getComboBoxModel(String comboName){
        DefaultComboBoxModel comboBoxModel=new DefaultComboBoxModel();
        switch(comboName){
            case "CURSOS":
                collection=getDatabase().getCollection("COURCES");
                DBCursor cursor=collection.find();
                while(cursor.hasNext()){
                    DBObject object=cursor.next();
                    comboBoxModel.addElement(object.get("name"));
                }
                break;
        }
        return comboBoxModel;
    }
    
}
