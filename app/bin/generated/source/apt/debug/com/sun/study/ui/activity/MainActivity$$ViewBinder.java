// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.sun.study.ui.activity.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558554, "field 'flContainer'");
    target.flContainer = finder.castView(view, 2131558554, "field 'flContainer'");
    view = finder.findRequiredView(source, 2131558551, "field 'mainDrawerLayout'");
    target.mainDrawerLayout = finder.castView(view, 2131558551, "field 'mainDrawerLayout'");
    view = finder.findRequiredView(source, 2131558552, "field 'nvLeftLayout'");
    target.nvLeftLayout = finder.castView(view, 2131558552, "field 'nvLeftLayout'");
    view = finder.findRequiredView(source, 2131558553, "field 'nvRightLayout'");
    target.nvRightLayout = finder.castView(view, 2131558553, "field 'nvRightLayout'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.flContainer = null;
    target.mainDrawerLayout = null;
    target.nvLeftLayout = null;
    target.nvRightLayout = null;
  }
}
