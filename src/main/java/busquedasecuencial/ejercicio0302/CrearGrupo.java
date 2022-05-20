package busquedasecuencial.ejercicio0302;
//@michi

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearGrupo extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private List<JTextField> jTextFieldList;
    private List<JCheckBox> jCheckboxList;
    
    public CrearGrupo(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(14,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarBotones();
        this.iniciarTextos1();
        this.iniciarChecks();
        this.iniciarCombo1();   
        this.iniciarCombo2();
        this.iniciarCombo3();
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
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
        this.jPanel1.add(this.jPanelList.get(11));
        this.jPanel1.add(this.jPanelList.get(12));
        this.jPanel1.add(this.jPanelList.get(13));
        
        }
        public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: 2022-2022 "));
        this.jLabelList.add(new JLabel("Sede: MATRIZ CUENCA "));
        this.jLabelList.add(new JLabel("Campus/Extension: EL VECINO"));
        this.jLabelList.add(new JLabel("Modalidad: PRESENCIAL"));
        this.jLabelList.add(new JLabel("Carrera: AGROPECUARIA"));
        this.jLabelList.add(new JLabel("Codigo de Proyecto: AGROPECUARIA [REDISEÑO] - NUEVA O REDISEÑO"));
        this.jLabelList.add(new JLabel("Asignatura: E-CV-IAG-003 BOTANICA "));
        this.jLabelList.add(new JLabel("Nombre de grupo:* "));
        this.jLabelList.add(new JLabel("Cupos por Grupo:* "));
        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100: " ));
        this.jLabelList.add(new JLabel("Seleciona Jornada del Grupo: "));
        this.jLabelList.add(new JLabel("Oferta para estudiantes: "));
        this.jLabelList.add(new JLabel("Aplica Cambio de Grupo:"));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jLabelList.get(10));
        this.jPanelList.get(11).add(this.jLabelList.get(11));
        this.jPanelList.get(12).add(this.jLabelList.get(12));
    }

    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
        
        this.jPanelList.get(13).add(this.jButtonList.get(0));
        this.jPanelList.get(13).add(this.jButtonList.get(1));    
    
   }
    public void iniciarChecks(){
        this.jCheckboxList = new ArrayList<>();
        this.jCheckboxList.add(new JCheckBox("Nuevos"));

        this.jPanelList.get(11).add(this.jCheckboxList.get(0));
    }
//       public void iniciarTextos(){
//       this.jTextFieldList = new ArrayList<>();
//       this.jTextFieldList.add(new JTextField());
//       this.jTextFieldList.add(new JTextField());
//       this.jTextFieldList.add(new JTextField());
//
//       this.jTextFieldList.get(0).setColumns(10);
//       this.jTextFieldList.get(1).setColumns(10);
//       this.jTextFieldList.get(2).setColumns(10);
//       this.jPanelList.get(0).add(this.jTextFieldList.get(0));
//       
//   }
        public void iniciarTextos1(){
       this.jTextFieldList = new ArrayList<>();
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.get(0).setColumns(10);
       this.jTextFieldList.get(1).setColumns(10);
       
       this.jPanelList.get(7).add(this.jTextFieldList.get(0));
       this.jPanelList.get(8).add(this.jTextFieldList.get(1));
        
        }
        public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Jornadas Disponibles");
        this.jComboBox1.addItem("Matutina");
        this.jComboBox1.addItem("Vespertina");
        
        
        this.jPanelList.get(10).add(this.jComboBox1);
    }
         public void iniciarCombo2(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("SI");
        this.jComboBox1.addItem("NO");
        
        
        this.jPanelList.get(12).add(this.jComboBox1);
         }
          public void iniciarCombo3(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("NO");
        this.jComboBox1.addItem("SI");
        
        
        this.jPanelList.get(9).add(this.jComboBox1);
         }

}
