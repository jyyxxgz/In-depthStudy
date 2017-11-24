// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ThreadActivity$$ViewBinder<T extends com.sun.study.ui.activity.ThreadActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558576, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131558576, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131558577, "field 'tvStart'");
    target.tvStart = finder.castView(view, 2131558577, "field 'tvStart'");
    view = finder.findRequiredView(source, 2131558578, "field 'tvCancel'");
    target.tvCancel = finder.castView(view, 2131558578, "field 'tvCancel'");
    view = finder.findRequiredView(source, 2131558575, "field 'tvInfo1'");
    target.tvInfo1 = finder.castView(view, 2131558575, "field 'tvInfo1'");
    view = finder.findRequiredView(source, 2131558580, "field 'tvInfo2'");
    target.tvInfo2 = finder.castView(view, 2131558580, "field 'tvInfo2'");
    view = finder.findRequiredView(source, 2131558579, "field 'cbCancel'");
    target.cbCancel = finder.castView(view, 2131558579, "field 'cbCancel'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.progressBar = null;
    target.tvStart = null;
    target.tvCancel = null;
    target.tvInfo1 = null;
    target.tvInfo2 = null;
    target.cbCancel = null;
  }
}
