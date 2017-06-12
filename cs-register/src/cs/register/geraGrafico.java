/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.register;


import java.awt.BasicStroke;
import java.awt.Color;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author luis
 */
public class geraGrafico extends  ApplicationFrame{
    
    public geraGrafico(String title , int type, List<partida> L ) {
         super(title);
         JFreeChart chart = null ;
         switch (type){
             case 0 : chart = ChartFactory.createXYLineChart(title,"X" ,"y",datakill(L), PlotOrientation.VERTICAL,true,true,false);
             case 1 : chart = ChartFactory.createXYLineChart(title,"X" ,"y",datakda(L), PlotOrientation.VERTICAL,true,true,false);
             case 2 : chart = ChartFactory.createXYLineChart(title,"X" ,"y",datawld(L), PlotOrientation.VERTICAL,true,true,false);
             case 3 : chart = ChartFactory.createXYLineChart(title,"X" ,"y",datasocore(L), PlotOrientation.VERTICAL,true,true,false);
             case 4 : chart = ChartFactory.createXYLineChart(title,"X" ,"y",datarank(L), PlotOrientation.VERTICAL,true,true,false);
         
         
         }
         ChartPanel graf = new ChartPanel (chart);
         graf.setPreferredSize(new java.awt.Dimension(560, 367));
         XYPlot plot = chart.getXYPlot();
         XYLineAndShapeRenderer rendrer = new XYLineAndShapeRenderer();
         rendrer.setSeriesPaint(0,Color.GREEN );
         rendrer.setSeriesStroke(0,new BasicStroke(4.0f));
         plot.setRenderer(rendrer);
         setContentPane(graf); 
            
         
         
        }
      
    
    
    
        private  XYSeriesCollection datakda (List<partida>list1) {
            XYSeriesCollection data = new XYSeriesCollection();
            XYSeries ser = new XYSeries ("kda") ; 
        for (partida p : list1){
            ser.add(list1.indexOf(p) + 1 ,( p.getKill() / p.getDeath() ));
        }
        data.addSeries(ser);
        
         return data;
         }
        
        private  XYSeriesCollection datawld (List<partida>list1) {
            XYSeriesCollection data = new XYSeriesCollection();
            XYSeries ser = new XYSeries ("kda") ; 
        for (partida p : list1){
            ser.add(list1.indexOf(p) + 1 ,( p.getWld() ));
        }
        data.addSeries(ser);
        
         return data;
         }
            
        private  XYSeriesCollection datasocore (List<partida>list1) {
            XYSeriesCollection data = new XYSeriesCollection();
            XYSeries ser = new XYSeries ("kda") ; 
        for (partida p : list1){
            ser.add(list1.indexOf(p) + 1 , p.getScore());
        }
        data.addSeries(ser);
        
         return data;
         }
        
        private  XYSeriesCollection datakill (List<partida>list1) {
            XYSeriesCollection data = new XYSeriesCollection();
            XYSeries ser = new XYSeries ("kda") ; 
        for (partida p : list1){
            ser.add(list1.indexOf(p) + 1 , p.getKill());
        }
        data.addSeries(ser);
        
         return data;
         }

    private XYDataset datarank(List<partida> list1) {
            XYSeriesCollection data = new XYSeriesCollection();
            XYSeries ser = new XYSeries ("kda") ; 
        for (partida p : list1){
            ser.add(list1.indexOf(p) + 1 , p.getRank());
        }
        data.addSeries(ser);
        
         return data;    }
        
    
        
     
}
