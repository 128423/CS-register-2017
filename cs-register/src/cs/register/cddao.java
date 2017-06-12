/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.register;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;    
import javafx.animation.Animation;
import jdk.nashorn.internal.ir.BreakNode;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author luis
 */
public class cddao implements abrirefechar , Serializable  {
    
     private List<partida> list1  =  new ArrayList<>();
     private  partida p ;
             
  
    @Override
    public void salvaresair(int status) {
        ObjectOutputStream objectOut = null;
         try {
             objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("save")));
                 objectOut.writeObject(this.list1);
            
             objectOut.close();
         } catch (IOException ex) {
             Logger.getLogger(cddao.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 objectOut.close();
             } catch (IOException ex) {
                 Logger.getLogger(cddao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         if(status == 0 )
            System.exit(0);
    }
    
    public void addlist ( partida p  ){
        this.list1.add(p);
    }

    public List<partida> getList1() {
        return list1;
    }

    public void setList1(List<partida> list1) {
        this.list1 = list1;
    }

    public void excluir (partida p ){
        this.list1.remove(p);
    }
     @Override
    public void lerd() {
ObjectInputStream objectIn = null;
         try {
             objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("save")));
             
             setList1((List<partida>)objectIn.readObject());
             
             objectIn.close();
         } catch (IOException ex) {
             salvaresair(1);
             lerd();
             return;
             
            
         } catch (ClassNotFoundException ex) {
             salvaresair(1);
             lerd();
             return;
         } finally {
             try {
                 objectIn.close();
             } catch (IOException ex) {
              salvaresair(1);
             lerd();
             return;
                 
             }
         }
        
    }
    
}
