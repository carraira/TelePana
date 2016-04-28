/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBean;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
/**
 *
 * @author cabjr_000
 */
@ManagedBean
public class DatosChart implements Serializable {
 
    private LineChartModel areaModel;
 
    @PostConstruct
    public void init() {
        createAreaModel();
    }
 
    public LineChartModel getAreaModel() {
        return areaModel;
    }
     
    private void createAreaModel() {
        areaModel = new LineChartModel();
 
        LineChartSeries boys = new LineChartSeries();
        boys.setFill(true);
        boys.setLabel("Peso");
        boys.set("60", 60);
        boys.set("61", 61);
        boys.set("62", 61.5);
        boys.set("63", 62);
        boys.set("64", 62.5);
 
        LineChartSeries girls = new LineChartSeries();
        girls.setFill(true);
        girls.setLabel("Ritmo");
        girls.set("59", 59);
        girls.set("60", 61);
        girls.set("62", 62);
        girls.set("63", 62.5);
        girls.set("64", 63.5);
 
        areaModel.addSeries(boys);
        areaModel.addSeries(girls);
         
        
        areaModel.setLegendPosition("su");
        areaModel.setStacked(true);
        areaModel.setShowPointLabels(true);
         
        Axis xAxis = new CategoryAxis("Peso");
        areaModel.getAxes().put(AxisType.X, xAxis);
        Axis yAxis = areaModel.getAxis(AxisType.Y);
        yAxis.setLabel("Ritmo");
        yAxis.setMin(90);
        yAxis.setMax(150);
    }
     
}
