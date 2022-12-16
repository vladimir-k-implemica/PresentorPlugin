package com.implemica.presentation.presentationdev;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(name = "Message Settings", storages = @Storage("present-plugin.xml"))
public class MessageState implements PersistentStateComponent<MessageState> {

   public static MessageState getInstance(){
      return ApplicationManager.getApplication().getService(MessageState.class);
   }
   public String msg;

   @Override
   public @Nullable MessageState getState() {
      return this;
   }

   @Override
   public void loadState(@NotNull MessageState state) {
      XmlSerializerUtil.copyBean(state, this);
   }
}
