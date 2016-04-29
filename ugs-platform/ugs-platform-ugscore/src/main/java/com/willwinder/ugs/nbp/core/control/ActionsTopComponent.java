/*
    Copywrite 2015-2016 Will Winder

    This file is part of Universal Gcode Sender (UGS).

    UGS is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    UGS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with UGS.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.willwinder.ugs.nbp.core.control;

import com.willwinder.ugs.nbp.core.control.Bundle;
import com.willwinder.ugs.nbp.lookup.CentralLookup;
import com.willwinder.universalgcodesender.i18n.Localization;
import com.willwinder.universalgcodesender.model.BackendAPI;
import com.willwinder.universalgcodesender.uielements.action.ActionButtonPanel;
import com.willwinder.universalgcodesender.utils.Settings;
import java.awt.BorderLayout;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.willwinder.universalgcodesender.nbp.control//Actions//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "ActionsTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "top_left", openAtStartup = true)
@ActionID(category = "Window", id = "com.willwinder.universalgcodesender.nbp.control.ActionsTopComponent")
@ActionReference(path = "Menu/Window/Classic" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_ActionsAction",
        preferredID = "ActionsTopComponent"
)
@Messages({
    "CTL_ActionsAction=Common Actions",
    "CTL_ActionsTopComponent=Common Actions",
    "HINT_ActionsTopComponent=Common action shortcuts."
})
public final class ActionsTopComponent extends TopComponent {
    protected Settings settings = CentralLookup.getDefault().lookup(Settings.class);
    protected BackendAPI backend = CentralLookup.getDefault().lookup(BackendAPI.class);

    public ActionsTopComponent() {
        this.setLayout(new BorderLayout());
        this.add(new ActionButtonPanel(backend), BorderLayout.CENTER);
        //initComponents();
        setName(Bundle.CTL_ActionsTopComponent());
        setToolTipText(Bundle.HINT_ActionsTopComponent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resetCoordinatesButton = new javax.swing.JButton();
        resetYButton = new javax.swing.JButton();
        returnToZeroButton = new javax.swing.JButton();
        resetZButton = new javax.swing.JButton();
        performHomingCycleButton = new javax.swing.JButton();
        killAlarmLock = new javax.swing.JButton();
        toggleCheckMode = new javax.swing.JButton();
        helpButtonMachineControl = new javax.swing.JButton();
        softResetMachineControl = new javax.swing.JButton();
        requestStateInformation = new javax.swing.JButton();
        resetXButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(resetCoordinatesButton, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.resetCoordinatesButton.text")); // NOI18N
        resetCoordinatesButton.setEnabled(false);
        resetCoordinatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetCoordinatesButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resetYButton, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.resetYButton.text")); // NOI18N
        resetYButton.setEnabled(false);
        resetYButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetYButtonresetYCoordinateButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(returnToZeroButton, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.returnToZeroButton.text")); // NOI18N
        returnToZeroButton.setEnabled(false);
        returnToZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToZeroButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resetZButton, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.resetZButton.text")); // NOI18N
        resetZButton.setEnabled(false);
        resetZButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetZButtonresetZCoordinateButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(performHomingCycleButton, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.performHomingCycleButton.text")); // NOI18N
        performHomingCycleButton.setEnabled(false);
        performHomingCycleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performHomingCycleButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(killAlarmLock, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.killAlarmLock.text")); // NOI18N
        killAlarmLock.setEnabled(false);
        killAlarmLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                killAlarmLockActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(toggleCheckMode, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.toggleCheckMode.text")); // NOI18N
        toggleCheckMode.setEnabled(false);
        toggleCheckMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleCheckModeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(helpButtonMachineControl, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.helpButtonMachineControl.text")); // NOI18N
        helpButtonMachineControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonMachineControlActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(softResetMachineControl, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.softResetMachineControl.text")); // NOI18N
        softResetMachineControl.setEnabled(false);
        softResetMachineControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softResetMachineControlActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(requestStateInformation, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.requestStateInformation.text")); // NOI18N
        requestStateInformation.setEnabled(false);
        requestStateInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestStateInformationActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resetXButton, org.openide.util.NbBundle.getMessage(ActionsTopComponent.class, "ActionsTopComponent.resetXButton.text")); // NOI18N
        resetXButton.setEnabled(false);
        resetXButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetXButtonresetXCoordinateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(softResetMachineControl, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetZButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(requestStateInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpButtonMachineControl))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(performHomingCycleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(killAlarmLock, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(toggleCheckMode, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetCoordinatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetXButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnToZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetYButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetCoordinatesButton)
                    .addComponent(resetXButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnToZeroButton)
                    .addComponent(resetYButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(softResetMachineControl)
                    .addComponent(resetZButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(performHomingCycleButton)
                    .addComponent(killAlarmLock)
                    .addComponent(toggleCheckMode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestStateInformation)
                    .addComponent(helpButtonMachineControl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetCoordinatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCoordinatesButtonActionPerformed
        try {
            this.backend.resetCoordinatesToZero();
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        }
    }//GEN-LAST:event_resetCoordinatesButtonActionPerformed

    private void resetYButtonresetYCoordinateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetYButtonresetYCoordinateButtonActionPerformed
        try {
            this.backend.resetCoordinateToZero('Y');
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);        }
    }//GEN-LAST:event_resetYButtonresetYCoordinateButtonActionPerformed

    private void returnToZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToZeroButtonActionPerformed
        try {
            backend.returnToZero();
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);        }
    }//GEN-LAST:event_returnToZeroButtonActionPerformed

    private void resetZButtonresetZCoordinateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetZButtonresetZCoordinateButtonActionPerformed
        try {
            this.backend.resetCoordinateToZero('Z');
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);        }
    }//GEN-LAST:event_resetZButtonresetZCoordinateButtonActionPerformed

    private void performHomingCycleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performHomingCycleButtonActionPerformed
        try {
            this.backend.performHomingCycle();
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);        }
    }//GEN-LAST:event_performHomingCycleButtonActionPerformed

    private void killAlarmLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_killAlarmLockActionPerformed
        try {
            this.backend.killAlarmLock();
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);        }
    }//GEN-LAST:event_killAlarmLockActionPerformed

    private void toggleCheckModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleCheckModeActionPerformed
        try {
            this.backend.toggleCheckMode();
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);        }
    }//GEN-LAST:event_toggleCheckModeActionPerformed

    private void helpButtonMachineControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonMachineControlActionPerformed
        StringBuilder message = new StringBuilder()
        .append(Localization.getString("mainWindow.resetZero")).append("\n")
        .append(Localization.getString("mainWindow.returnToZero")).append("\n")
        .append(Localization.getString("mainWindow.softReset")).append("\n")
        .append(Localization.getString("mainWindow.homing")).append("\n")
        .append(Localization.getString("mainWindow.alarmLock")).append("\n")
        .append(Localization.getString("mainWindow.checkMode")).append("\n")
        .append(Localization.getString("mainWindow.getState")).append("\n")
        .append(Localization.getString("mainWindow.helpKeyboard")).append("\n")
        .append(Localization.getString("mainWindow.helpKeyX")).append("\n")
        .append(Localization.getString("mainWindow.helpKeyY")).append("\n")
        .append(Localization.getString("mainWindow.helpKeyZ")).append("\n")
        .append(Localization.getString("mainWindow.helpKeyPlusMinus")).append("\n")
        .append(Localization.getString("mainWindow.helpKeyDivMul")).append("\n")
        .append(Localization.getString("mainWindow.helpKeyZero")).append("\n")
        ;

        /*
        JOptionPane.showMessageDialog(new JFrame(),
            message,
            Localization.getString("mainWindow.helpDialog"),
            JOptionPane.INFORMATION_MESSAGE);
        */
        
        NotifyDescriptor nd = new NotifyDescriptor.Message(message, NotifyDescriptor.INFORMATION_MESSAGE);
        DialogDisplayer.getDefault().notify(nd);
    }//GEN-LAST:event_helpButtonMachineControlActionPerformed

    private void softResetMachineControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softResetMachineControlActionPerformed
        try {
            this.backend.issueSoftReset();
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        }
    }//GEN-LAST:event_softResetMachineControlActionPerformed

    private void requestStateInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestStateInformationActionPerformed
        try {
            this.backend.requestParserState();
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        }
    }//GEN-LAST:event_requestStateInformationActionPerformed

    private void resetXButtonresetXCoordinateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetXButtonresetXCoordinateButtonActionPerformed
        try {
            this.backend.resetCoordinateToZero('X');
        } catch (Exception ex) {
            NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage(), NotifyDescriptor.ERROR_MESSAGE);
            DialogDisplayer.getDefault().notify(nd);
        }
    }//GEN-LAST:event_resetXButtonresetXCoordinateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpButtonMachineControl;
    private javax.swing.JButton killAlarmLock;
    private javax.swing.JButton performHomingCycleButton;
    private javax.swing.JButton requestStateInformation;
    private javax.swing.JButton resetCoordinatesButton;
    private javax.swing.JButton resetXButton;
    private javax.swing.JButton resetYButton;
    private javax.swing.JButton resetZButton;
    private javax.swing.JButton returnToZeroButton;
    private javax.swing.JButton softResetMachineControl;
    private javax.swing.JButton toggleCheckMode;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
