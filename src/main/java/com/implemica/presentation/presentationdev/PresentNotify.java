package com.implemica.presentation.presentationdev;

import com.intellij.AbstractBundle;
import com.intellij.DynamicBundle;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ResourceBundle;

public class PresentNotify {

      public static void notifyError(String content) {
         @NotNull Project @NotNull [] defaultProject = ProjectManager.getInstance().getOpenProjects();
         NotificationGroupManager.getInstance()
               .getNotificationGroup("Custom Notification Group")
               .createNotification(content, NotificationType.ERROR)
               .notify(defaultProject[0]);
      }


}
