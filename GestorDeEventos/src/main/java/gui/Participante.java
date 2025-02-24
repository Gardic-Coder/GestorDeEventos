package main.java.gui;

import main.java.application.dto.RolParticipante;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField; //Permite usar los campos de Texto
import main.java.application.dto.*;
import main.java.application.services.*;

public class Participante extends javax.swing.JFrame {
    
    //Icono del JFrame, cargamos la imagen residente en nuestro proyecto (Logotipo)
    @Override
    public Image getIconImage() {
        URL url = getClass().getClassLoader().getResource("Imagenes/mainWindow/seashell.png");
        return Toolkit.getDefaultToolkit().getImage(url);
    }

    private MainWindow principal; //Me permitra volver a la ventana principal (Referencia)

    public void ocultar() { //Oculta todos los campos y labels existentes
        campoempresa.setVisible(false);
        empresa.setVisible(false);
        cargoempresa.setVisible(false);
        campocargoempresa.setVisible(false);
        temaconferencia.setVisible(false);
        campotemaconferencia.setVisible(false);
        campoexp.setVisible(false);
        especialidad.setVisible(false);
        metodologiainst.setVisible(false);
        experienciainst.setVisible(false);
        campometodologiainst.setVisible(false);
        campotemaespecialidad.setVisible(false);
        temaponente.setVisible(false);
        campotemaponente.setVisible(false);
        duracionponente.setVisible(false);
        campoduracionponent.setVisible(false);
        institucionponente.setVisible(false);
        campoinstitucionponente.setVisible(false);

    }

    //Ocultar o no los campos de Conferencista
    public void validarcampoConferencista(JTextField campo, String textopredeterminado, JTextField... otrosCampos) {
        if (campo.getText().equals(textopredeterminado)) {
            herramientasVentanas.campovacio(campo, "", true);
        }
        for (JTextField otroCampo : otrosCampos) {
            if (otroCampo.getText().isEmpty()) {
                String mensaje = "";
                if (otroCampo == campoempresa) {
                    mensaje = "Nombre de la Empresa";
                } else if (otroCampo == campocargoempresa) {
                    mensaje = "Cargo en la Empresa";
                } else if (otroCampo == campotemaconferencia) {
                    mensaje = "De lo que quiere informar";
                }
                herramientasVentanas.campovacio(otroCampo, mensaje, false);
            }
        }
    }

    //Instructor
    public void validarcampoInstructor(JTextField campo, String textopredeterminado, JTextField... otrosCampos) {
        if (campo.getText().equals(textopredeterminado)) {
            herramientasVentanas.campovacio(campo, "", true);
        }
        for (JTextField otroCampo : otrosCampos) {
            if (otroCampo.getText().isEmpty()) {
                String mensaje = "";
                if (otroCampo == campometodologiainst) {
                    mensaje = "Metodo de enseñanza";
                } else if (otroCampo == campotemaespecialidad) {
                    mensaje = "Campo especializado";
                } else if (otroCampo == campoexp) {
                    mensaje = "Cantidad de años";
                }
                herramientasVentanas.campovacio(otroCampo, mensaje, false);
            }
        }
    }

    //Ponente
    public void validarcampoPonente(JTextField campo, String textopredeterminado, JTextField... otrosCampos) {
        if (campo.getText().equals(textopredeterminado)) {
            herramientasVentanas.campovacio(campo, "", true);
        }
        for (JTextField otroCampo : otrosCampos) {
            if (otroCampo.getText().isEmpty()) {
                String mensaje = "";
                if (otroCampo == campotemaponente) {
                    mensaje = "De lo que quieres informar";
                } else if (otroCampo == campoinstitucionponente) {
                    mensaje = "Institucion / Universidad";
                } else if (otroCampo == campoduracionponent) {
                    mensaje = "Tiempo a utilizar";
                }
                herramientasVentanas.campovacio(otroCampo, mensaje, false);
            }
        }
    }

    public Participante() {
        initComponents();
        setTitle("Registro de Participantes");
        ocultar();
        //Me permitira utilizar funciones de clases externas (herramientasVentanas)
        camponombre.setName("camponombre");
        campocedula.setName("campocedula");
        campotlf.setName("campotlf");
        campocorreo.setName("campocorreo");
        cargarEventosEnComboBox();
    }

    public Participante(MainWindow principal) {
        initComponents();
        setTitle("Registro de Participantes");
        ocultar();
        this.principal = principal;
        //Me permitira utilizar funciones de clases externas (herramientasVentanas)
        camponombre.setName("camponombre");
        campocedula.setName("campocedula");
        campotlf.setName("campotlf");
        campocorreo.setName("campocorreo");
        cargarEventosEnComboBox();
    }

    // Método para cargar eventos en el combo box
    public void cargarEventosEnComboBox() {
        EventoService eventoService = new EventoService();
        List<EventoDTO> eventos = eventoService.listaDeEventoDTO();

        // Configurar el renderizado para mostrar solo el nombre
        comboEventos.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list,
                    Object value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus
            ) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof EventoDTO eventoDTO) {
                    setText(eventoDTO.getNombre());
                }
                return this;
            }
        });

        // Cargar los eventos
        DefaultComboBoxModel<EventoDTO> model = new DefaultComboBoxModel<>();
        for (EventoDTO evento : eventos) {
            model.addElement(evento);
        }
        comboEventos.setModel(model);
    }

// Método para obtener el evento seleccionado
    public EventoDTO obtenerEventoSeleccionado() {
        return (EventoDTO) comboEventos.getSelectedItem();
    }

    // Métodos auxiliares
    private String validarCampo(String valor, String nombreCampo, String placeholder) {
        if (valor == null || valor.trim().isEmpty() || valor.equals(placeholder)) {
            throw new IllegalArgumentException(nombreCampo + " es obligatorio");
        }
        return valor.trim();
    }

    private String validarFormato(String valor, String patron, String nombreCampo, String placeholder) {
        String valorLimpio = validarCampo(valor, nombreCampo, placeholder);
        if (!valorLimpio.matches(patron)) {
            throw new IllegalArgumentException("Formato de " + nombreCampo + " inválido");
        }
        return valorLimpio;
    }
//.toLowerCase()

    private RolParticipante obtenerRolSeleccionado() {
        String rolSeleccionado = this.selecciontipoparticipante.getSelectedItem().toString();
        //System.out.println(rolSeleccionado);
        switch (rolSeleccionado) {
            case "Ponente" -> {
                return RolParticipante.PONENTE;
            }
            case "Conferencista" -> {
                return RolParticipante.CONFERENCISTA;
            }
            case "Asistente" -> {
                return RolParticipante.ASISTENTE;
            }
            case "Moderador" -> {
                return RolParticipante.MODERADOR;
            }
            case "Instructor" -> {
                return RolParticipante.INSTRUCTOR;
            }
            default ->
                throw new IllegalArgumentException("Rol seleccionado no válido");
        }
    }

    private String construirDescripcion(RolParticipante rol) {
        return switch (rol) {
            case PONENTE ->
                String.format("Institución: %s - Área: %s",
                validarCampo(this.campoinstitucionponente.getText(), "Institución", "Nombre institución"),
                validarCampo(this.campotemaespecialidad.getText(), "Área", "Área de especialidad"));
            case INSTRUCTOR ->
                String.format("Años experiencia: %s",
                validarCampo(this.campoexp.getText(), "Experiencia", "Años experiencia"));
            /*case MODERADOR -> String.format("Estilo moderación: %s",
                validarCampo(txtEstilo.getText(), "Estilo", "Estilo de moderación"));*/
            default ->
                "Sin descripción adicional";
        };
    }

    private void limpiarCampos() {
        herramientasVentanas.campovacio(camponombre, "Nombre de la Persona", false);
        herramientasVentanas.campovacio(campocedula, "V-XX.XXX.XX", false);
        herramientasVentanas.campovacio(campocorreo, "Correo personal", false);
        herramientasVentanas.campovacio(campotlf, "Nro. Personal", false);
        herramientasVentanas.campovacio(campoempresa, "Nombre de la Empresa", false);
        herramientasVentanas.campovacio(campocargoempresa, "Cargo en la Empresa", false);
        herramientasVentanas.campovacio(campotemaconferencia, "De lo que quiere informar", false);
        herramientasVentanas.campovacio(campotemaespecialidad, "Campo especializado", false);
        herramientasVentanas.campovacio(campometodologiainst, "Metodo de enseñanza", false);
        herramientasVentanas.campovacio(campoexp, "Cantidad de años", false);
        herramientasVentanas.campovacio(campoinstitucionponente, "Institucion / Universidad", false);
        herramientasVentanas.campovacio(campotemaponente, "De lo que quieres informar", false);
        herramientasVentanas.campovacio(campoduracionponent, "Tiempo a utilizar", false);
        // Limpiar otros campos específicos...
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        padre = new javax.swing.JPanel();
        cabecera = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cuerpo = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        selecciontipoparticipante = new javax.swing.JComboBox<>();
        superior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campocorreo = new javax.swing.JTextField();
        camponombre = new javax.swing.JTextField();
        campocedula = new javax.swing.JTextField();
        campotlf = new javax.swing.JTextField();
        separadornombre = new javax.swing.JSeparator();
        separadorcorreo = new javax.swing.JSeparator();
        separadorcedula = new javax.swing.JSeparator();
        separadortlf = new javax.swing.JSeparator();
        izquierdacuerpo = new javax.swing.JPanel();
        campoempresa = new javax.swing.JTextField();
        empresa = new javax.swing.JLabel();
        campometodologiainst = new javax.swing.JTextField();
        metodologiainst = new javax.swing.JLabel();
        temaconferencia = new javax.swing.JLabel();
        campotemaconferencia = new javax.swing.JTextField();
        experienciainst = new javax.swing.JLabel();
        campoexp = new javax.swing.JTextField();
        temaponente = new javax.swing.JLabel();
        duracionponente = new javax.swing.JLabel();
        campotemaponente = new javax.swing.JTextField();
        campoduracionponent = new javax.swing.JTextField();
        derechacuerpo = new javax.swing.JPanel();
        cargoempresa = new javax.swing.JLabel();
        campocargoempresa = new javax.swing.JTextField();
        especialidad = new javax.swing.JLabel();
        campotemaespecialidad = new javax.swing.JTextField();
        institucionponente = new javax.swing.JLabel();
        campoinstitucionponente = new javax.swing.JTextField();
        comboEventos = new javax.swing.JComboBox<>();
        imagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        cabecera.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/Participante/register.png"))); // NOI18N
        jLabel6.setText("Registro del Participante    ");
        jLabel6.setFocusable(false);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );

        cuerpo.setBackground(new java.awt.Color(255, 228, 228));

        footer.setBackground(new java.awt.Color(255, 204, 204));

        salir.setBackground(new java.awt.Color(252, 186, 186));
        salir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/Participante/exit.png"))); // NOI18N
        salir.setText("Salir");
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(252, 186, 186));
        Limpiar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/Participante/data-cleaning.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(null);
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LimpiarMouseExited(evt);
            }
        });
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(252, 186, 186));
        registrar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/Participante/verify.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setBorder(null);
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarMouseExited(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(Limpiar)
                    .addComponent(registrar))
                .addGap(42, 42, 42))
        );

        selecciontipoparticipante.setBackground(new java.awt.Color(255, 204, 204));
        selecciontipoparticipante.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        selecciontipoparticipante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asistente", "Conferencista", "Instructor", "Ponente" }));
        selecciontipoparticipante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        selecciontipoparticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecciontipoparticipanteActionPerformed(evt);
            }
        });

        superior.setBackground(new java.awt.Color(255, 228, 228));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("Cedula");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Correo");

        campocorreo.setBackground(new java.awt.Color(255, 228, 228));
        campocorreo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campocorreo.setForeground(java.awt.Color.gray);
        campocorreo.setText("Correo personal");
        campocorreo.setToolTipText("");
        campocorreo.setActionCommand("<Not Set>");
        campocorreo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        campocorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campocorreo.setPreferredSize(new java.awt.Dimension(200, 17));
        campocorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campocorreoMousePressed(evt);
            }
        });
        campocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocorreoActionPerformed(evt);
            }
        });

        camponombre.setBackground(new java.awt.Color(255, 228, 228));
        camponombre.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        camponombre.setForeground(java.awt.Color.gray);
        camponombre.setToolTipText("");
        camponombre.setActionCommand("<Not Set>");
        camponombre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        camponombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        camponombre.setPreferredSize(new java.awt.Dimension(200, 17));
        camponombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                camponombreMousePressed(evt);
            }
        });
        camponombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombreActionPerformed(evt);
            }
        });

        campocedula.setBackground(new java.awt.Color(255, 228, 228));
        campocedula.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campocedula.setForeground(java.awt.Color.gray);
        campocedula.setText("V-XX.XXX.XX");
        campocedula.setToolTipText("");
        campocedula.setActionCommand("<Not Set>");
        campocedula.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        campocedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campocedula.setPreferredSize(new java.awt.Dimension(200, 17));
        campocedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campocedulaMousePressed(evt);
            }
        });
        campocedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocedulaActionPerformed(evt);
            }
        });

        campotlf.setBackground(new java.awt.Color(255, 228, 228));
        campotlf.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campotlf.setForeground(java.awt.Color.gray);
        campotlf.setText("Nro. Personal");
        campotlf.setToolTipText("");
        campotlf.setActionCommand("<Not Set>");
        campotlf.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        campotlf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campotlf.setPreferredSize(new java.awt.Dimension(200, 17));
        campotlf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campotlfMousePressed(evt);
            }
        });

        separadornombre.setForeground(new java.awt.Color(0, 0, 0));

        separadorcorreo.setForeground(new java.awt.Color(0, 0, 0));

        separadorcedula.setForeground(new java.awt.Color(0, 0, 0));

        separadortlf.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout superiorLayout = new javax.swing.GroupLayout(superior);
        superior.setLayout(superiorLayout);
        superiorLayout.setHorizontalGroup(
            superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superiorLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separadorcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separadornombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(separadorcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separadortlf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campotlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campocedula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        superiorLayout.setVerticalGroup(
            superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campotlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadornombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separadortlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superiorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separadorcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superiorLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)))
                .addGap(0, 0, 0)
                .addComponent(separadorcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        izquierdacuerpo.setBackground(new java.awt.Color(255, 228, 228));

        campoempresa.setBackground(new java.awt.Color(255, 204, 204));
        campoempresa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campoempresa.setForeground(java.awt.Color.gray);
        campoempresa.setText("Nombre de la Empresa");
        campoempresa.setToolTipText("");
        campoempresa.setActionCommand("<Not Set>");
        campoempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoempresa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoempresa.setPreferredSize(new java.awt.Dimension(200, 21));
        campoempresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoempresaMousePressed(evt);
            }
        });
        campoempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoempresaActionPerformed(evt);
            }
        });

        empresa.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        empresa.setText("Empresa");

        campometodologiainst.setBackground(new java.awt.Color(255, 204, 204));
        campometodologiainst.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campometodologiainst.setForeground(java.awt.Color.gray);
        campometodologiainst.setText("Metodo de enseñanza");
        campometodologiainst.setToolTipText("");
        campometodologiainst.setActionCommand("<Not Set>");
        campometodologiainst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campometodologiainst.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campometodologiainst.setPreferredSize(new java.awt.Dimension(200, 21));
        campometodologiainst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campometodologiainstMousePressed(evt);
            }
        });
        campometodologiainst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campometodologiainstActionPerformed(evt);
            }
        });

        metodologiainst.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        metodologiainst.setText("Metodologia");

        temaconferencia.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        temaconferencia.setText("Tema a Exponer");

        campotemaconferencia.setBackground(new java.awt.Color(255, 204, 204));
        campotemaconferencia.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campotemaconferencia.setForeground(java.awt.Color.gray);
        campotemaconferencia.setText("De lo que quiere informar");
        campotemaconferencia.setToolTipText("");
        campotemaconferencia.setActionCommand("<Not Set>");
        campotemaconferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campotemaconferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campotemaconferencia.setPreferredSize(new java.awt.Dimension(200, 21));
        campotemaconferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campotemaconferenciaMousePressed(evt);
            }
        });
        campotemaconferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotemaconferenciaActionPerformed(evt);
            }
        });

        experienciainst.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        experienciainst.setText("Años de Experiencia");

        campoexp.setBackground(new java.awt.Color(255, 204, 204));
        campoexp.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campoexp.setForeground(java.awt.Color.gray);
        campoexp.setText("Cantidad de años");
        campoexp.setToolTipText("");
        campoexp.setActionCommand("<Not Set>");
        campoexp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoexp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoexp.setPreferredSize(new java.awt.Dimension(200, 21));
        campoexp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoexpMousePressed(evt);
            }
        });
        campoexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoexpActionPerformed(evt);
            }
        });

        temaponente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        temaponente.setText("Tema a Exponer");

        duracionponente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        duracionponente.setText("Duracion de la Exposicion");

        campotemaponente.setBackground(new java.awt.Color(255, 204, 204));
        campotemaponente.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campotemaponente.setForeground(java.awt.Color.gray);
        campotemaponente.setText("De lo que quieres informar");
        campotemaponente.setToolTipText("");
        campotemaponente.setActionCommand("<Not Set>");
        campotemaponente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campotemaponente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campotemaponente.setPreferredSize(new java.awt.Dimension(200, 21));
        campotemaponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campotemaponenteMousePressed(evt);
            }
        });
        campotemaponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotemaponenteActionPerformed(evt);
            }
        });

        campoduracionponent.setBackground(new java.awt.Color(255, 204, 204));
        campoduracionponent.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campoduracionponent.setForeground(java.awt.Color.gray);
        campoduracionponent.setText("Tiempo a utilizar");
        campoduracionponent.setToolTipText("");
        campoduracionponent.setActionCommand("<Not Set>");
        campoduracionponent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoduracionponent.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoduracionponent.setPreferredSize(new java.awt.Dimension(200, 21));
        campoduracionponent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoduracionponentMousePressed(evt);
            }
        });
        campoduracionponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoduracionponentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout izquierdacuerpoLayout = new javax.swing.GroupLayout(izquierdacuerpo);
        izquierdacuerpo.setLayout(izquierdacuerpoLayout);
        izquierdacuerpoLayout.setHorizontalGroup(
            izquierdacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(izquierdacuerpoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(izquierdacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duracionponente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(izquierdacuerpoLayout.createSequentialGroup()
                        .addGroup(izquierdacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temaponente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(izquierdacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(experienciainst, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(empresa)
                                .addComponent(metodologiainst)
                                .addComponent(temaconferencia)
                                .addComponent(campoempresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campotemaconferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campometodologiainst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoexp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, izquierdacuerpoLayout.createSequentialGroup()
                        .addGroup(izquierdacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoduracionponent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campotemaponente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        izquierdacuerpoLayout.setVerticalGroup(
            izquierdacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(izquierdacuerpoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(empresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temaconferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campotemaconferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(metodologiainst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campometodologiainst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(experienciainst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temaponente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campotemaponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(duracionponente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoduracionponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        derechacuerpo.setBackground(new java.awt.Color(255, 228, 228));

        cargoempresa.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        cargoempresa.setText("Cargo");

        campocargoempresa.setBackground(new java.awt.Color(255, 204, 204));
        campocargoempresa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campocargoempresa.setForeground(java.awt.Color.gray);
        campocargoempresa.setText("Cargo en la Empresa");
        campocargoempresa.setToolTipText("");
        campocargoempresa.setActionCommand("<Not Set>");
        campocargoempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campocargoempresa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campocargoempresa.setPreferredSize(new java.awt.Dimension(200, 21));
        campocargoempresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campocargoempresaMousePressed(evt);
            }
        });
        campocargoempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocargoempresaActionPerformed(evt);
            }
        });

        especialidad.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        especialidad.setText("Especialidad");

        campotemaespecialidad.setBackground(new java.awt.Color(255, 204, 204));
        campotemaespecialidad.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campotemaespecialidad.setForeground(java.awt.Color.gray);
        campotemaespecialidad.setText("Campo especializado");
        campotemaespecialidad.setToolTipText("");
        campotemaespecialidad.setActionCommand("<Not Set>");
        campotemaespecialidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campotemaespecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campotemaespecialidad.setPreferredSize(new java.awt.Dimension(200, 21));
        campotemaespecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campotemaespecialidadMousePressed(evt);
            }
        });
        campotemaespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotemaespecialidadActionPerformed(evt);
            }
        });

        institucionponente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        institucionponente.setText("Institucion");

        campoinstitucionponente.setBackground(new java.awt.Color(255, 204, 204));
        campoinstitucionponente.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        campoinstitucionponente.setForeground(java.awt.Color.gray);
        campoinstitucionponente.setText("Institucion / Universidad");
        campoinstitucionponente.setToolTipText("");
        campoinstitucionponente.setActionCommand("<Not Set>");
        campoinstitucionponente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoinstitucionponente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoinstitucionponente.setPreferredSize(new java.awt.Dimension(200, 21));
        campoinstitucionponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoinstitucionponenteMousePressed(evt);
            }
        });
        campoinstitucionponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoinstitucionponenteActionPerformed(evt);
            }
        });

        comboEventos.setBackground(new java.awt.Color(255, 204, 204));
        comboEventos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        comboEventos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEventosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout derechacuerpoLayout = new javax.swing.GroupLayout(derechacuerpo);
        derechacuerpo.setLayout(derechacuerpoLayout);
        derechacuerpoLayout.setHorizontalGroup(
            derechacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, derechacuerpoLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(derechacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(institucionponente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especialidad)
                    .addComponent(campotemaespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoempresa)
                    .addComponent(campocargoempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoinstitucionponente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        derechacuerpoLayout.setVerticalGroup(
            derechacuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derechacuerpoLayout.createSequentialGroup()
                .addComponent(comboEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(cargoempresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campocargoempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(especialidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campotemaespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(institucionponente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoinstitucionponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        imagen.setBackground(new java.awt.Color(255, 228, 228));
        imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/Participante/family2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        imagen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 27, 129, -1));

        javax.swing.GroupLayout cuerpoLayout = new javax.swing.GroupLayout(cuerpo);
        cuerpo.setLayout(cuerpoLayout);
        cuerpoLayout.setHorizontalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cuerpoLayout.createSequentialGroup()
                .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuerpoLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(selecciontipoparticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(izquierdacuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(derechacuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        cuerpoLayout.setVerticalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuerpoLayout.createSequentialGroup()
                .addComponent(superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuerpoLayout.createSequentialGroup()
                        .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecciontipoparticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cuerpoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(izquierdacuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cuerpoLayout.createSequentialGroup()
                        .addComponent(derechacuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout padreLayout = new javax.swing.GroupLayout(padre);
        padre.setLayout(padreLayout);
        padreLayout.setHorizontalGroup(
            padreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        padreLayout.setVerticalGroup(
            padreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(padreLayout.createSequentialGroup()
                .addComponent(cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(padre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(padre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecciontipoparticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecciontipoparticipanteActionPerformed
        String opcionseleccionada = (String) selecciontipoparticipante.getSelectedItem();
        // Ocultar todos los campos al inicio
        ocultar();
        // Mostrar los campos según la opción seleccionada
        switch (opcionseleccionada) {
            case "Conferencista" -> {
                campoempresa.setVisible(true);
                empresa.setVisible(true);
                cargoempresa.setVisible(true);
                campocargoempresa.setVisible(true);
                temaconferencia.setVisible(true);
                campotemaconferencia.setVisible(true);
            }
            case "Instructor" -> {
                especialidad.setVisible(true);
                metodologiainst.setVisible(true);
                experienciainst.setVisible(true);
                campoexp.setVisible(true);
                campometodologiainst.setVisible(true);
                campotemaespecialidad.setVisible(true);
            }
            case "Ponente" -> {
                temaponente.setVisible(true);
                campotemaponente.setVisible(true);
                duracionponente.setVisible(true);
                campoduracionponent.setVisible(true);
                institucionponente.setVisible(true);
                campoinstitucionponente.setVisible(true);
            }

        }

        // Actualizar la interfaz gráfica
        padre.revalidate();
        padre.repaint();
    }//GEN-LAST:event_selecciontipoparticipanteActionPerformed

    private void campotemaconferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotemaconferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotemaconferenciaActionPerformed

    private void campometodologiainstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campometodologiainstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campometodologiainstActionPerformed

    private void campoempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoempresaActionPerformed

    private void campocargoempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocargoempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocargoempresaActionPerformed

    private void campotemaespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotemaespecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotemaespecialidadActionPerformed

    private void campoexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoexpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoexpActionPerformed

    private void campoinstitucionponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoinstitucionponenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoinstitucionponenteActionPerformed

    private void campotemaponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotemaponenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotemaponenteActionPerformed

    private void campoduracionponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoduracionponentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoduracionponentActionPerformed

    private void camponombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponombreActionPerformed

    private void camponombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camponombreMousePressed
        herramientasVentanas.validarCampoprincipal(camponombre, "Nombre de la Persona", campocedula, campotlf, campocorreo);
    }//GEN-LAST:event_camponombreMousePressed
    //Posiblemente haya una forma de mejorar esto, y no hacer puros if...
    private void campotlfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campotlfMousePressed
        herramientasVentanas.validarCampoprincipal(campotlf, "Nro. Personal", campocedula, camponombre, campocorreo);
    }//GEN-LAST:event_campotlfMousePressed

    private void campocorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campocorreoMousePressed
        herramientasVentanas.validarCampoprincipal(campocorreo, "Correo personal", campocedula, camponombre, campotlf);

    }//GEN-LAST:event_campocorreoMousePressed

    private void campocedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campocedulaMousePressed
        herramientasVentanas.validarCampoprincipal(campocedula, "V-XX.XXX.XX", campotlf, camponombre, campocorreo);
    }//GEN-LAST:event_campocedulaMousePressed

    private void campocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocorreoActionPerformed

    private void campoempresaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoempresaMousePressed
        validarcampoConferencista(campoempresa, "Nombre de la Empresa", campocargoempresa, campotemaconferencia);
    }//GEN-LAST:event_campoempresaMousePressed

    private void campocargoempresaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campocargoempresaMousePressed
        validarcampoConferencista(campocargoempresa, "Cargo en la Empresa", campoempresa, campotemaconferencia);
    }//GEN-LAST:event_campocargoempresaMousePressed

    private void campotemaconferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campotemaconferenciaMousePressed
        validarcampoConferencista(campotemaconferencia, "De lo que quiere informar", campoempresa, campocargoempresa);
    }//GEN-LAST:event_campotemaconferenciaMousePressed

    private void campotemaespecialidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campotemaespecialidadMousePressed
        validarcampoInstructor(campotemaespecialidad, "Campo especializado", campometodologiainst, campoexp);
    }//GEN-LAST:event_campotemaespecialidadMousePressed

    private void campometodologiainstMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campometodologiainstMousePressed
        validarcampoInstructor(campometodologiainst, "Metodo de enseñanza", campotemaespecialidad, campoexp);
    }//GEN-LAST:event_campometodologiainstMousePressed

    private void campoinstitucionponenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoinstitucionponenteMousePressed
        validarcampoPonente(campoinstitucionponente, "Institucion / Universidad", campotemaponente, campoduracionponent);
    }//GEN-LAST:event_campoinstitucionponenteMousePressed

    private void campoexpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoexpMousePressed
        validarcampoInstructor(campoexp, "Cantidad de años", campometodologiainst, campotemaespecialidad);
    }//GEN-LAST:event_campoexpMousePressed

    private void campotemaponenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campotemaponenteMousePressed
        validarcampoPonente(campotemaponente, "De lo que quieres informar", campoinstitucionponente, campoduracionponent);
    }//GEN-LAST:event_campotemaponenteMousePressed

    private void campoduracionponentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoduracionponentMousePressed
        validarcampoPonente(campoduracionponent, "Tiempo a utilizar", campotemaponente, campoinstitucionponente);
    }//GEN-LAST:event_campoduracionponentMousePressed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirMousePressed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        herramientasVentanas.cambiarColor(salir, true);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        herramientasVentanas.cambiarColor(salir, false);
    }//GEN-LAST:event_salirMouseExited

    private void LimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseEntered
        herramientasVentanas.cambiarColor(Limpiar, true);
    }//GEN-LAST:event_LimpiarMouseEntered

    private void LimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseExited
        herramientasVentanas.cambiarColor(Limpiar, false);
    }//GEN-LAST:event_LimpiarMouseExited

    private void registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseEntered
        herramientasVentanas.cambiarColor(registrar, true);
    }//GEN-LAST:event_registrarMouseEntered

    private void registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseExited
        herramientasVentanas.cambiarColor(registrar, false);
    }//GEN-LAST:event_registrarMouseExited

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        ParticipanteService participanteService = new ParticipanteService();
        String patronCI = "^V-\\d{2}\\.\\d{3}\\.\\d{3}$";
        String patronCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String patronTlf = "^04(12|26|16|14|24)\\d{7}$";

        try {
            // Validación de campos básicos
            String nombre = validarCampo(this.camponombre.getText(), "Nombre", "Nombre de la Persona");
            String cedula = validarFormato(this.campocedula.getText(), patronCI, "Cédula", "V-XX.XXX.XXX");
            String correo = validarFormato(this.campocorreo.getText(), patronCorreo, "Correo", "Correo personal");
            String telefono = validarFormato(this.campotlf.getText(), patronTlf, "Teléfono", "Nro. Personal");

            // Validación del rol
            RolParticipante rol = obtenerRolSeleccionado();

            // Validación del evento
            //EventoComboBoxItem eventoItem = (EventoComboBoxItem) this.selecciontipoparticipante.getSelectedItem();
            //if (eventoItem == null) {
                
            //}
            // Uso para obtener el ID
            EventoDTO eventoSeleccionado = obtenerEventoSeleccionado();
            if (eventoSeleccionado == null) {
                throw new IllegalArgumentException("Debe seleccionar un evento");
                // Usar el ID...
            }
            //String idEvento = eventoItem.getId();
            String idEvento = eventoSeleccionado.getID();
            // Validación de campos específicos por rol
            String tema = "-";
            String descripcion = construirDescripcion(rol);

            if (rol == RolParticipante.CONFERENCISTA) {
                tema = validarCampo(this.campotemaconferencia.getText(), "Tema", "Ingrese el tema");
            }
            if (rol == RolParticipante.PONENTE) {
                tema = validarCampo(this.campotemaponente.getText(), "Tema", "Ingrese el tema");
            }

            // Creación del DTO
            ParticipanteDTO participante = new ParticipanteDTO(
                    nombre,
                    cedula,
                    correo,
                    telefono,
                    rol,
                    idEvento,
                    true, // Asistencia
                    tema,
                    descripcion
            );

            // Enviar a servicio
            participanteService.agregarParticipante(participante);

            JOptionPane.showMessageDialog(this, "Participante registrado exitosamente!",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void campocedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocedulaActionPerformed

    private void comboEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEventosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Participante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Participante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Participante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Participante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Participante().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JPanel cabecera;
    private javax.swing.JTextField campocargoempresa;
    private javax.swing.JTextField campocedula;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JTextField campoduracionponent;
    private javax.swing.JTextField campoempresa;
    private javax.swing.JTextField campoexp;
    private javax.swing.JTextField campoinstitucionponente;
    private javax.swing.JTextField campometodologiainst;
    private javax.swing.JTextField camponombre;
    private javax.swing.JTextField campotemaconferencia;
    private javax.swing.JTextField campotemaespecialidad;
    private javax.swing.JTextField campotemaponente;
    private javax.swing.JTextField campotlf;
    private javax.swing.JLabel cargoempresa;
    private javax.swing.JComboBox<EventoDTO> comboEventos;
    private javax.swing.JPanel cuerpo;
    private javax.swing.JPanel derechacuerpo;
    private javax.swing.JLabel duracionponente;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel especialidad;
    private javax.swing.JLabel experienciainst;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel imagen;
    private javax.swing.JLabel institucionponente;
    private javax.swing.JPanel izquierdacuerpo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel metodologiainst;
    private javax.swing.JPanel padre;
    private javax.swing.JButton registrar;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> selecciontipoparticipante;
    private javax.swing.JSeparator separadorcedula;
    private javax.swing.JSeparator separadorcorreo;
    private javax.swing.JSeparator separadornombre;
    private javax.swing.JSeparator separadortlf;
    private javax.swing.JPanel superior;
    private javax.swing.JLabel temaconferencia;
    private javax.swing.JLabel temaponente;
    // End of variables declaration//GEN-END:variables
}
