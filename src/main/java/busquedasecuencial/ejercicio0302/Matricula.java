package busquedasecuencial.ejercicio0302;
//@michi
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ealex
 */
public class Matricula extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private JComboBox jComboBox1;

    
     public Matricula(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,200);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        }
     
     public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new FlowLayout());
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo1();
        this.iniciarCombo2();
        this.iniciarCombo3();
        this.iniciarCombo4();
        this.iniciarCombo5();
        this.iniciarCombo6();
    }
     
      public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5)); 
        this.jPanel1.add(this.jPanelList.get(6));
     }
   
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus/Extension: "));
        this.jLabelList.add(new JLabel("Carrera: "));  
        this.jLabelList.add(new JLabel("Codigo del Proyecto: "));  
        this.jLabelList.add(new JLabel("Modalidad: "));  
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Fecha inicio Clases: 28/03/22 al 06/08/2022"));

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));  
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));  
        this.jPanelList.get(6).add(this.jLabelList.get(6)); 
   }

   public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matriz Cuenca");
        this.jComboBox1.addItem("Quito");
        this.jComboBox1.addItem("Guayaquil");
        
      
        this.jPanelList.get(0).add(this.jComboBox1);
    }
    public void iniciarCombo2(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Campues El Vecino");
        this.jComboBox1.addItem("Campus El Girón");
        this.jComboBox1.addItem("Campus Centenario");
        
        this.jPanelList.get(1).add(this.jComboBox1);
    }
    public void iniciarCombo3(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Computacion");
        this.jComboBox1.addItem("Telecomunicaciones");
        this.jComboBox1.addItem("Electronica");
        
        this.jPanelList.get(2).add(this.jComboBox1);
    }
   
    public void iniciarCombo4(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Computacion[REDISEÑO]- NUEVA O REDISEÑO");
        this.jComboBox1.addItem("Telecomunicaciones[REDISEÑO]- NUEVA O REDISEÑO");
        this.jComboBox1.addItem("Electronica[REDISEÑO]- NUEVA O REDISEÑO");
        
        this.jPanelList.get(3).add(this.jComboBox1);
    }
    
    public void iniciarCombo5(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Presencial");
        this.jComboBox1.addItem("Virtual");
       
        
        this.jPanelList.get(4).add(this.jComboBox1);
    }
    
    public void iniciarCombo6(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("2022-2022");
        this.jComboBox1.addItem("2022-2023");
       
        
        this.jPanelList.get(5).add(this.jComboBox1);
    }
    
}
