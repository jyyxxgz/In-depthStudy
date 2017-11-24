// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StatusBarActivity$$ViewBinder<T extends com.sun.study.ui.activity.StatusBarActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558572, "field 'colorPicker'");
    target.colorPicker = finder.castView(view, 2131558572, "field 'colorPicker'");
    view = finder.findRequiredView(source, 2131558573, "field 'svBar'");
    target.svBar = finder.castView(view, 2131558573, "field 'svBar'");
    view = finder.findRequiredView(source, 2131558574, "field 'tvColor'");
    target.tvColor = finder.castView(view, 2131558574, "field 'tvColor'");
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
  }

  @Override public void unbind(T target) {
    target.colorPicker = null;
    target.svBar = null;
    target.tvColor = null;
    target.toolbar = null;
  }
}
