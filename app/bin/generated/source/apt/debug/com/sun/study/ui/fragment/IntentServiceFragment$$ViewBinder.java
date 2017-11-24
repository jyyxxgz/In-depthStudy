// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class IntentServiceFragment$$ViewBinder<T extends com.sun.study.ui.fragment.IntentServiceFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558576, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131558576, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131558651, "field 'tvProgress'");
    target.tvProgress = finder.castView(view, 2131558651, "field 'tvProgress'");
    view = finder.findRequiredView(source, 2131558577, "field 'tvStart'");
    target.tvStart = finder.castView(view, 2131558577, "field 'tvStart'");
    view = finder.findRequiredView(source, 2131558578, "field 'tvCancel'");
    target.tvCancel = finder.castView(view, 2131558578, "field 'tvCancel'");
    view = finder.findRequiredView(source, 2131558649, "field 'tvServiceStatus'");
    target.tvServiceStatus = finder.castView(view, 2131558649, "field 'tvServiceStatus'");
    view = finder.findRequiredView(source, 2131558650, "field 'tvThreadStatus'");
    target.tvThreadStatus = finder.castView(view, 2131558650, "field 'tvThreadStatus'");
  }

  @Override public void unbind(T target) {
    target.progressBar = null;
    target.tvProgress = null;
    target.tvStart = null;
    target.tvCancel = null;
    target.tvServiceStatus = null;
    target.tvThreadStatus = null;
  }
}
