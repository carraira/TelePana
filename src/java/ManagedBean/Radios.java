package ManagedBean;
 
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class Radios {
     
    private String console;    
    
  
    @PostConstruct
    public void init() {
      
       
    }
 
    public String getConsole() {
        return console;
    }
 
    public void setConsole(String console) {
        this.console = console;
    }
 
 

 
}