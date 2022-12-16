package com.implemica.presentation.presentationdev;

import com.intellij.notification.*;
import com.intellij.notification.impl.NotificationsManagerImpl;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public class PresentDialogWrapper extends DialogWrapper {
   private JPanel root;
   private JTextField msg;
   private JButton notifyButton;

   protected PresentDialogWrapper() {
      super(true);

      setCancelButtonText("STOP");
      setTitle("TEST");
      init();


   }

   @Override
   protected @Nullable JComponent createCenterPanel() {
      if (MessageState.getInstance().msg != null) {
         msg.setText(MessageState.getInstance().msg);
      }

      notifyButton.addMouseListener(new MouseListener() {
         @Override
         public void mouseClicked(MouseEvent e) {
            Objects.requireNonNull(MessageState.getInstance().getState()).msg = msg.getText();
            PresentNotify.notifyError(MessageState.getInstance().msg);

//            Project defaultProject = ProjectManager.getInstance().getDefaultProject();
//            NotificationGroupManager.getInstance()
//                  .getNotificationGroup("Custom Notification Group")
//                  .createNotification(msg.getText(), NotificationType.ERROR)
//                  .notify(defaultProject);
         }

         @Override
         public void mousePressed(MouseEvent e) {
//            NotificationGroupManager.getInstance()
//                  .getNotificationGroup("Custom Notification Group")
//                  .createNotification(msg.getText(), NotificationType.ERROR)
//                  .notify();
         }

         @Override
         public void mouseReleased(MouseEvent e) {

         }

         @Override
         public void mouseEntered(MouseEvent e) {

         }

         @Override
         public void mouseExited(MouseEvent e) {

         }
      });

      return root;
   }
}
