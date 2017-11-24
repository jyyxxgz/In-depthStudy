// Generated code from Butter Knife. Do not modify!
package com.sun.study.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ApkAdapter$ViewHolder$$ViewBinder<T extends com.sun.study.adapter.ApkAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558666, "field 'rlLayout'");
    target.rlLayout = finder.castView(view, 2131558666, "field 'rlLayout'");
    view = finder.findRequiredView(source, 2131558667, "field 'ivApkIcon'");
    target.ivApkIcon = finder.castView(view, 2131558667, "field 'ivApkIcon'");
    view = finder.findRequiredView(source, 2131558668, "field 'tvApkName'");
    target.tvApkName = finder.castView(view, 2131558668, "field 'tvApkName'");
    view = finder.findRequiredView(source, 2131558669, "field 'ivOverFlow'");
    target.ivOverFlow = finder.castView(view, 2131558669, "field 'ivOverFlow'");
  }

  @Override public void unbind(T target) {
    target.rlLayout = null;
    target.ivApkIcon = null;
    target.tvApkName = null;
    target.ivOverFlow = null;
  }
}
