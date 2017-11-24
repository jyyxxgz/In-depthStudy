// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DroidPluginFragment$$ViewBinder<T extends com.sun.study.ui.fragment.DroidPluginFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558631, "field 'lvApks'");
    target.lvApks = finder.castView(view, 2131558631, "field 'lvApks'");
    view = finder.findRequiredView(source, 2131558630, "field 'refreshLayout'");
    target.refreshLayout = finder.castView(view, 2131558630, "field 'refreshLayout'");
  }

  @Override public void unbind(T target) {
    target.lvApks = null;
    target.refreshLayout = null;
  }
}
