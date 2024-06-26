/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

/**
 *
 * @author alary
 */
public class TimePanel extends javax.swing.JPanel {

    /**
     * Creates new form TimePanel
     */
    Calendar cal = Calendar.getInstance();
    private JTextField texto;

    public TimePanel(JTextField jtextField) {
        initComponents();
        texto = jtextField;
        //Se coloca el tiempo del sistema
        Hora.setText((cal.get(Calendar.HOUR) < 10) ? "0" + cal.get(Calendar.HOUR) : String.valueOf(cal.get(Calendar.HOUR)));
        Minuto.setText((cal.get(Calendar.MINUTE) < 10) ? "0" + cal.get(Calendar.MINUTE) : String.valueOf(cal.get(Calendar.MINUTE)));

        if (cal.get(Calendar.AM_PM) == 0) {
            AmPm.setText("AM");
        } else {
            AmPm.setText("PM");
        }

        //Eventos de los controles del componente
        btnHora1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                ajustarHora("+");
            }
        });
        btnHora2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                ajustarHora("-");
            }
        });

        btnMinuto1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                ajustarMinuto("+");
            }
        });
        btnMinuto2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                ajustarMinuto("-");
            }
        });
        btnAmPm1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                AmPm.setText((AmPm.getText().equals("AM")) ? "PM" : "AM");
            }
        });
        btnAmPm2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                AmPm.setText((AmPm.getText().equals("AM")) ? "PM" : "AM");
            }
        });
        btnCancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JPopupMenu menu = ((JPopupMenu) getParent());
                menu.setVisible(false);
            }
        });
        btnSet.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JPopupMenu menu = ((JPopupMenu) getParent());
                texto.setText(Hora.getText() + ":" + Minuto.getText() + " " + AmPm.getText());
                menu.setVisible(false);
            }
        });
    }
    private void ajustarHora(String value)
    {
        int h = Integer.valueOf( Hora.getText() );                

        if( value.equals("+"))
        {
            h = (h==12)?1:(h+1);    
        }
        else if( value.equals("-"))
        {
            h = (h==1)?12:(h-1);
        }
        String s = (h<10)?"0"+h:String.valueOf(h);
        Hora.setText(s);
    }


    private void ajustarMinuto(String value)
    {
        int m = Integer.valueOf( Minuto.getText() );                

        if( value.equals("+"))
        {
            m = (m==59)?0:(m+1);    
        }
        else if( value.equals("-"))
        {
            m = (m==1)?59:(m-1);
        }
        String s = (m<10)?"0"+m:String.valueOf(m);
        Minuto.setText(s);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnHora1 = new javax.swing.JLabel();
        btnMinuto1 = new javax.swing.JLabel();
        btnAmPm1 = new javax.swing.JLabel();
        btnHora2 = new javax.swing.JLabel();
        btnMinuto2 = new javax.swing.JLabel();
        btnAmPm2 = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        AmPm = new javax.swing.JLabel();
        Minuto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        btnSet = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnHora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caret-flecha-hacia-arriba.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 51, 0, 0);
        jPanel1.add(btnHora1, gridBagConstraints);

        btnMinuto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caret-flecha-hacia-arriba.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 67, 0, 0);
        jPanel1.add(btnMinuto1, gridBagConstraints);

        btnAmPm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caret-flecha-hacia-arriba.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 62, 0, 0);
        jPanel1.add(btnAmPm1, gridBagConstraints);

        btnHora2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caret-abajo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 49, 42, 0);
        jPanel1.add(btnHora2, gridBagConstraints);

        btnMinuto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caret-abajo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 69, 42, 0);
        jPanel1.add(btnMinuto2, gridBagConstraints);

        btnAmPm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caret-abajo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 65, 42, 0);
        jPanel1.add(btnAmPm2, gridBagConstraints);

        Hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Hora.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 39, 0, 0);
        jPanel1.add(Hora, gridBagConstraints);

        AmPm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AmPm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AmPm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AmPm.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 54, 0, 61);
        jPanel1.add(AmPm, gridBagConstraints);

        Minuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Minuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Minuto.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 59, 0, 0);
        jPanel1.add(Minuto, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Establer la hora");

        btnCancel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnCancel.setText(" Cancelar");
        btnCancel.setOpaque(true);

        btnSet.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnSet.setText(" Aceptar");
        btnSet.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmPm;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Minuto;
    private javax.swing.JLabel btnAmPm1;
    private javax.swing.JLabel btnAmPm2;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnHora1;
    private javax.swing.JLabel btnHora2;
    private javax.swing.JLabel btnMinuto1;
    private javax.swing.JLabel btnMinuto2;
    private javax.swing.JLabel btnSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
