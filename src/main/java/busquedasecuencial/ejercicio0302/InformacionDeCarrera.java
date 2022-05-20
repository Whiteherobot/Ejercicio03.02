package busquedasecuencial.ejercicio0302;
//@michi

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InformacionDeCarrera extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private List<JTextField> jTextFieldList;
    
        public InformacionDeCarrera(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        }
        public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarBotones();
        this.iniciarTextos();
        this.iniciarCombo1();
        this.iniciarCombo2();
        this.iniciarCombo3();
        this.iniciarCombo4();
        this.iniciarCombo5();
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
        this.jPanelList.add(new JPanel());
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5)); 
        this.jPanel1.add(this.jPanelList.get(6)); 
        this.jPanel1.add(this.jPanelList.get(7));
            }
        public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Jornada: "));
        this.jLabelList.add(new JLabel("Fecha de Registro: 20/05/2022"));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
    }
        public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        
        this.jPanelList.get(7).add(this.jButtonList.get(0));
   }
        public void iniciarTextos(){
       this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
       this.jPanelList.get(0).add(this.jTextFieldList.get(0));
   }
        public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Computacion");
        this.jComboBox1.addItem("Telecomunicaciones");
        this.jComboBox1.addItem("Electronica");
        
        
        this.jPanelList.get(1).add(this.jComboBox1);
    }
    public void iniciarCombo2(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Presencial");
        this.jComboBox1.addItem("Virtual");
        
        this.jPanelList.get(2).add(this.jComboBox1);
    }
        public void iniciarCombo3(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matriz Cuenca");
        this.jComboBox1.addItem("Quito");
        this.jComboBox1.addItem("Guayaquil");
        
        this.jPanelList.get(3).add(this.jComboBox1);
    }
            public void iniciarCombo4(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Campues El Vecino");
        this.jComboBox1.addItem("Campus El Girón");
        this.jComboBox1.addItem("Campus Centenario");
        
        this.jPanelList.get(4).add(this.jComboBox1);
    }
        public void iniciarCombo5(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matutina");
        this.jComboBox1.addItem("Vespertina");
        
        this.jPanelList.get(5).add(this.jComboBox1);
    }
}
