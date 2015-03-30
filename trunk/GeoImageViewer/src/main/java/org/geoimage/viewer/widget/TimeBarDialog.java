/*
 * TimeBarDialog.java
 *
 * Created on May 20, 2008, 10:43 AM
 */
package org.geoimage.viewer.widget;

import java.sql.Timestamp;
import java.util.Date;
import java.util.TimerTask;

import javax.swing.SwingWorker;

import org.geoimage.viewer.core.TimeComponent;
import org.slf4j.LoggerFactory;

/**
 *
 * @author  thoorfr
 */
public class TimeBarDialog extends javax.swing.JDialog {
	private static org.slf4j.Logger logger=LoggerFactory.getLogger(TimeBarDialog.class);

    private Date max = Timestamp.valueOf("2999-01-01 23:59:59"),  min = new Date(0);
    private Date[] dates = new Date[2];
    private int lastSlideValue = 0;
    boolean entered = false;
    boolean read = false;
    int inc = +1;
    int slideval = 0;
    private SwingWorker<Void, Void> worker;
    private int refreshRate = 100;

    /** Creates new form TimeBarDialog */
    public TimeBarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jSlider3.setMaximum(jSlider2.getMaximum() - jSlider2.getValue() + jSlider1.getValue());
        //jSlider3.setValue(slideval);
        jSlider1.setValue(jSlider1.getMinimum() - 1);
        jSlider2.setValue(jSlider2.getMaximum() - 1);
        jSlider3.setValue(jSlider3.getMinimum() - 1);
        max = TimeComponent.getMaximumDate();
        min = TimeComponent.getMinimumDate();
        jLabel2.setText(dates[0].toString().substring(0, 19));
        jLabel1.setText(dates[1].toString().substring(0, 19));
        TimeComponent.setDirty(true);

    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        if (b) {
            TimerTask task = new TimerTask() {

                @Override
                public void run() {
                    while (isVisible()) {
                        try {
                            Thread.sleep(1000);
                            if (TimeComponent.isDirty()) {
                                TimeComponent.setDirty(false);
                                max = TimeComponent.getMaximumDate();
                                min = TimeComponent.getMinimumDate();
                                if (min == null || max == null) {
                                    max = Timestamp.valueOf("9999-01-01 23:59:59");
                                    min = new Date(0);
                                }
                                updateUI();
                            }
                        } catch (InterruptedException ex) {
                        	logger.error(ex.getMessage(),ex);
                        }
                    }
                }
            };
            new Thread(task).start();
        }
    }

    private void updateUI() {
        jSlider3.setValue(slideval);
        if (jSlider1.getValue() > jSlider2.getValue()) {
            jSlider1.setValue(jSlider2.getValue() - 1);
        }
        max = TimeComponent.getMaximumDate();
        min = TimeComponent.getMinimumDate();
        dates[0] = new Timestamp(jSlider1.getValue() * (max.getTime() - min.getTime()) / jSlider1.getMaximum() + min.getTime());
        dates[1] = new Timestamp(jSlider2.getValue() * (max.getTime() - min.getTime()) / jSlider2.getMaximum() + min.getTime());
        TimeComponent.setDates(dates);
        jLabel2.setText(dates[0].toString().substring(0, 19));
        jLabel1.setText(dates[1].toString().substring(0, 19));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(org.geoimage.viewer.core.GeoImageViewer.class).getContext().getResourceMap(TimeBarDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jSlider1.setMaximum(1000);
        jSlider1.setValue(0);
        jSlider1.setName("jSlider1"); // NOI18N
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSlider2.setMaximum(1000);
        jSlider2.setValue(100);
        jSlider2.setName("jSlider2"); // NOI18N
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jSlider3.setMaximum(1000);
        jSlider3.setName("jSlider3"); // NOI18N
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        jToggleButton1.setText(resourceMap.getString("jToggleButton1.text")); // NOI18N
        jToggleButton1.setName("jToggleButton1"); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
    if (entered) {
        return;
    }
    jSlider3.setMaximum(jSlider2.getMaximum() - jSlider2.getValue() + jSlider1.getValue());
    updateUI();
}//GEN-LAST:event_jSlider1StateChanged

private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
    if (entered) {
        return;
    }
    jSlider3.setMaximum(jSlider2.getMaximum() - jSlider2.getValue() + jSlider1.getValue());
    updateUI();
}//GEN-LAST:event_jSlider2StateChanged

private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
    if (entered) {
        return;
    }
    entered = true;
    slideval = jSlider3.getValue();
    jSlider1.setValue(jSlider1.getValue() + (jSlider3.getValue() - lastSlideValue));
    jSlider2.setValue(jSlider2.getValue() + (jSlider3.getValue() - lastSlideValue));
    lastSlideValue = jSlider3.getValue();
    updateUI();
    entered = false;
}//GEN-LAST:event_jSlider3StateChanged

private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    if (jToggleButton1.isSelected()) {
        jToggleButton1.setText("Stop");
        read = true;
        if (worker != null) {
            worker.cancel(true);
        }
        worker = new SwingWorker<Void, Void>() {

            public Void doInBackground() {
                while (read && isVisible()) {
                    try {
                        Thread.sleep(refreshRate);
                    } catch (InterruptedException ex) {
                    	logger.error(ex.getMessage(),ex);
                    }
                    if (jSlider3.getValue() == jSlider3.getMaximum()) {
                        inc = -inc;
                    }
                    if (jSlider3.getValue() == jSlider3.getMinimum()) {
                        inc = -inc;
                    }
                    slideval = jSlider3.getValue() + inc;
                    javax.swing.SwingUtilities.invokeLater(new Runnable() {

                        public void run() {
                            jSlider3.setValue(slideval);
                        }
                    });

                }
                return null;
            }
        };
        worker.execute();
    } else {
        read = false;
        jToggleButton1.setText("Play");
    }
}//GEN-LAST:event_jToggleButton1ActionPerformed

private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
    if (evt.getKeyChar() == '\n') {
        try {
            inc = Integer.parseInt(jTextField1.getText());
        } catch (Exception e) {
            jTextField1.setText(inc + "");
        }
    }
}//GEN-LAST:event_jTextField1KeyTyped

private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
    if (evt.getKeyChar() == '\n') {
        try {
            refreshRate = Integer.parseInt(jTextField2.getText());
        } catch (Exception e) {
            jTextField2.setText(refreshRate + "");
        }
    }
}//GEN-LAST:event_jTextField2KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
