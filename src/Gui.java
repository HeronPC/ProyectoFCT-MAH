import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Gui extends JFrame{
    private JPanel Contenedor;

    // ejecuta primero todo ésto
    public static void main(String[] args) {
        // arranca en un hilo de ejecución...
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // creando el frame y lo muestra
                    Gui frame = new Gui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Constructor de la clase: se configura aquí toda
    // la ventana y los controles...
    public Gui() {

        // título de la ventana
        setTitle("Programa FCT Centro Educativo");
        // operación al cerra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // el panel que contiene todo se crea y se pone en el frame
        Contenedor = new JPanel(new BorderLayout());
        Contenedor.setBorder(new EmptyBorder(0, 5, 5, 5));
        setContentPane(Contenedor);
        // distribución nula para poder posicionar los elementos
        // en las coordenadas que queramos

        // se crea el panel de pestañas
        JTabbedPane panelDePestanas = new JTabbedPane(JTabbedPane.TOP);
        // se posiciona en el panel
        panelDePestanas.setSize(1015,680);
        Contenedor.add(panelDePestanas, BorderLayout.CENTER);

        // éste es el primer panel
        // que se añade como pestaña al 'tabbedPane'
        JPanel panel1 = new JPanel(new BorderLayout());
        panelDePestanas.addTab("Empresas", null, panel1, null);
        JPanel pTitulo = new JPanel(new FlowLayout());

        JLabel titulo = new JLabel("GESTIÓN DE DATOS DE EMPRESAS");
        titulo.setFont(new Font("Verdana", Font.BOLD, 12));
        pTitulo.add(titulo);
        JPanel pEPB = new JPanel(new BorderLayout());

        JPanel pEmpresa = new JPanel(new BorderLayout());
        pEmpresa.setBorder(BorderFactory.createCompoundBorder(BorderFactory
                .createTitledBorder("Empresa"), BorderFactory
                .createEmptyBorder(5, 5, 5, 5)));

        JPanel pEar = new JPanel(new FlowLayout());
        JLabel lce = new JLabel("Código Empresa: ");
        JLabel lce1 = new JLabel("5");
        JLabel lCIF = new JLabel("CIF: ");
        JTextField TCIF = new JTextField();
        TCIF.setPreferredSize(new Dimension(200, 20));
        JLabel lNom = new JLabel("Nombre: ");
        JTextField TNom = new JTextField();
        TNom.setPreferredSize(new Dimension(400, 20));
        pEar.add(lce);
        pEar.add(lce1);
        pEar.add(lCIF);
        pEar.add(TCIF);
        pEar.add(lNom);
        pEar.add(TNom);

        JPanel pEce = new JPanel(new FlowLayout());

        JLabel lDir = new JLabel("Dirección: ");
        JTextField TDir = new JTextField();
        TDir.setPreferredSize(new Dimension(200, 20));
        JLabel lCP = new JLabel("C.P.: ");
        JTextField TCP = new JTextField();
        TCP.setPreferredSize(new Dimension(100, 20));
        JLabel lLoc = new JLabel("Localidad: ");
        JTextField TLoc = new JTextField();
        TLoc.setPreferredSize(new Dimension(250, 20));
        pEce.add(lDir);
        pEce.add(TDir);
        pEce.add(lCP);
        pEce.add(TCP);
        pEce.add(lLoc);
        pEce.add(TLoc);

        JPanel pEab = new JPanel(new FlowLayout());
        JLabel lJor = new JLabel("Dirección: ");
        JComboBox CJor = new JComboBox();
        CJor.setEditable(false);
        CJor.addItem("Partida");
        CJor.addItem("Continua");
        JLabel lMod = new JLabel("Modalidad: ");
        JComboBox CMod = new JComboBox();
        CMod.setEditable(false);
        CMod.addItem("Presencial");
        CMod.addItem("Semipresencial");
        CMod.addItem("Distancia");
        JLabel lMai = new JLabel("Mail: ");
        JTextField TMai = new JTextField();
        TMai.setPreferredSize(new Dimension(300, 20));

        pEab.add(lJor);
        pEab.add(CJor);
        pEab.add(lMod);
        pEab.add(CMod);
        pEab.add(lMai);
        pEab.add(TMai);

        pEmpresa.add(pEar,BorderLayout.NORTH);
        pEmpresa.add(pEce,BorderLayout.CENTER);
        pEmpresa.add(pEab,BorderLayout.SOUTH);

        pEPB.add(pEmpresa, BorderLayout.NORTH);

        JPanel pPersonas = new JPanel(new BorderLayout());
        pPersonas.setBorder(BorderFactory.createCompoundBorder(BorderFactory
                .createTitledBorder("Personas"), BorderFactory
                .createEmptyBorder(5, 5, 5, 5)));
        pEPB.add(pPersonas, BorderLayout.CENTER);

        JPanel pPar = new JPanel(new FlowLayout());

        JLabel lDRL = new JLabel("DNI Rep. Legal");
        JTextField TDRL = new JTextField();
        TDRL.setPreferredSize(new Dimension(200, 20));
        JLabel lNT = new JLabel("Nombre RL");
        JTextField TNT = new JTextField();
        TNT.setPreferredSize(new Dimension(100, 20));
        JLabel lAR = new JLabel("Apellidos RL: ");
        JTextField TAR = new JTextField();
        TAR.setPreferredSize(new Dimension(250, 20));
        pPar.add(lDRL);
        pPar.add(TDRL);
        pPar.add(lNT);
        pPar.add(TNT);
        pPar.add(lAR);
        pPar.add(TAR);

        JPanel pPab = new JPanel(new FlowLayout());

        JLabel lDTL = new JLabel("DNI Tut. Laboral");
        JTextField TDTL = new JTextField();
        TDTL.setPreferredSize(new Dimension(200, 20));
        JLabel lNL = new JLabel("Nombre TL");
        JTextField TNL = new JTextField();
        TNL.setPreferredSize(new Dimension(100, 20));
        JLabel lAT = new JLabel("Apellidos TL: ");
        JTextField TAT = new JTextField();
        TAT.setPreferredSize(new Dimension(250, 20));
        JLabel lTel = new JLabel("Apellidos TL: ");
        JTextField TTel = new JTextField();
        TTel.setPreferredSize(new Dimension(50, 20));

        pPab.add(lDTL);
        pPab.add(TDTL);
        pPab.add(lNL);
        pPab.add(TNL);
        pPab.add(lAT);
        pPab.add(TAT);
        pPab.add(lTel);
        pPab.add(TTel);

        pPersonas.add(pPar,BorderLayout.NORTH);
        pPersonas.add(pPab,BorderLayout.SOUTH);

        JPanel pBotones = new JPanel(new FlowLayout());
        pBotones.setBorder(BorderFactory.createCompoundBorder(BorderFactory
                .createTitledBorder(""), BorderFactory
                .createEmptyBorder(5, 5, 5, 5)));
        pEPB.add(pBotones, BorderLayout.SOUTH);

        JPanel pBDD = new JPanel(new BorderLayout());
        pBDD.setBorder(BorderFactory.createCompoundBorder(BorderFactory
                .createTitledBorder("Reflejo de la Base de Datos"), BorderFactory
                .createEmptyBorder(5, 5, 5, 5)));

        setSize(1100,700);
        panel1.add(pTitulo,BorderLayout.NORTH);
        panel1.add(pEPB,BorderLayout.CENTER);
        panel1.add(pBDD, BorderLayout.SOUTH);

        // otro panel de igual forma
        JPanel panel2 = new JPanel(new BorderLayout());
        panelDePestanas.addTab("Alumnos", null, panel2, null);
        panel2.setLayout(null);
        // otra etiqueta ésta vez en el segundo panel
        //panel2.add(lbl2);

        // otro panel de igual forma
        JPanel panel3 = new JPanel(new BorderLayout());
        panelDePestanas.addTab("Tutores", null, panel3, null);
        panel3.setLayout(null);

        // otra etiqueta ésta vez en el segundo panel
        //panel3.add(lbl2);

        // otro panel de igual forma
        JPanel panel4 = new JPanel(new BorderLayout());
        panelDePestanas.addTab("Asignación", null, panel4, null);
        panel4.setLayout(null);
        // otra etiqueta ésta vez en el segundo panel
        //panel2.add(lbl2);
    }
}
