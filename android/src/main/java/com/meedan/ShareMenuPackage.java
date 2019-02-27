package com.meedan;

import android.app.Activity;
import android.content.Intent;

import java.util.*;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import com.meedan.ShareMenuModule;

public class ShareMenuPackage implements ReactPackage {
  private ShareMenuModule module;

  public ShareMenuPackage() {
    super();
  }

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    module = new ShareMenuModule(reactContext);
    modules.add(module);
    return modules;
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

  public void onNewIntent(Intent intent) {
    if(null != module) module.onNewIntent(intent);
  }
}
