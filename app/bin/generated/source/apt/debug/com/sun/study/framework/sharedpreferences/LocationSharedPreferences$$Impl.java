package com.sun.study.framework.sharedpreferences;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

public class LocationSharedPreferences$$Impl
    implements LocationSharedPreferences, de.devland.esperandro.SharedPreferenceActions {

  private final SharedPreferences preferences;

  public LocationSharedPreferences$$Impl(Context context) {
    this.preferences = context.getSharedPreferences("location", Context.MODE_PRIVATE);
  }

  @Override
  public String latitude() {
    return preferences.getString("latitude", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void latitude(String latitude) {
    preferences.edit().putString("latitude", latitude).apply();
  }

  @Override
  public String longitude() {
    return preferences.getString("longitude", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void longitude(String longitude) {
    preferences.edit().putString("longitude", longitude).apply();
  }

  @Override
  public String addrStr() {
    return preferences.getString("addrStr", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void addrStr(String addrStr) {
    preferences.edit().putString("addrStr", addrStr).apply();
  }

  @Override
  public String province() {
    return preferences.getString("province", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void province(String province) {
    preferences.edit().putString("province", province).apply();
  }

  @Override
  public String city() {
    return preferences.getString("city", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void city(String city) {
    preferences.edit().putString("city", city).apply();
  }

  @Override
  public String district() {
    return preferences.getString("district", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void district(String district) {
    preferences.edit().putString("district", district).apply();
  }

  @Override
  public String street() {
    return preferences.getString("street", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void street(String street) {
    preferences.edit().putString("street", street).apply();
  }

  @Override
  public String streetNumber() {
    return preferences.getString("streetNumber", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void streetNumber(String streetNumber) {
    preferences.edit().putString("streetNumber", streetNumber).apply();
  }

  @Override
  public String cityCode() {
    return preferences.getString("cityCode", "");
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void cityCode(String cityCode) {
    preferences.edit().putString("cityCode", cityCode).apply();
  }

  @Override
  public SharedPreferences get() {
    return preferences;
  }

  @Override
  public boolean contains(String key) {
    return preferences.contains(key);
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void remove(String key) {
    preferences.edit().remove(key).apply();
  }

  @Override
  public void registerOnChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    preferences.registerOnSharedPreferenceChangeListener(listener);
  }

  @Override
  public void unregisterOnChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    preferences.unregisterOnSharedPreferenceChangeListener(listener);
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void clear() {
    preferences.edit().clear().apply();
  }

  @Override
  @SuppressLint({"NewApi", "CommitPrefEdits"})
  public void clearDefined() {
    SharedPreferences.Editor editor = preferences.edit();
    editor.remove("province");
    editor.remove("city");
    editor.remove("streetNumber");
    editor.remove("street");
    editor.remove("cityCode");
    editor.remove("latitude");
    editor.remove("addrStr");
    editor.remove("district");
    editor.remove("longitude");
    editor.apply();
  }

  @Override
  public void initDefaults() {
    this.province(this.province());
    this.city(this.city());
    this.streetNumber(this.streetNumber());
    this.street(this.street());
    this.cityCode(this.cityCode());
    this.latitude(this.latitude());
    this.addrStr(this.addrStr());
    this.district(this.district());
    this.longitude(this.longitude());
  }

}
