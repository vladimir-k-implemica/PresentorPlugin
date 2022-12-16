package com.implemica.presentation.presentationdev;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAwareAction;
import org.jetbrains.annotations.NotNull;

public class PresentMenuAction extends DumbAwareAction {

   @Override
   public void actionPerformed(@NotNull AnActionEvent e) {
      PresentDialogWrapper presentDialogWrapper = new PresentDialogWrapper();

      presentDialogWrapper.showAndGet();

   }

}
