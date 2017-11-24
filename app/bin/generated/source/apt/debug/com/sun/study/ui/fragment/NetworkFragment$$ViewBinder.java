// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NetworkFragment$$ViewBinder<T extends com.sun.study.ui.fragment.NetworkFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558654, "field 'tvOkhttp'");
    target.tvOkhttp = finder.castView(view, 2131558654, "field 'tvOkhttp'");
    view = finder.findRequiredView(source, 2131558655, "field 'tvXutils3'");
    target.tvXutils3 = finder.castView(view, 2131558655, "field 'tvXutils3'");
    view = finder.findRequiredView(source, 2131558629, "field 'tvVolley'");
    target.tvVolley = finder.castView(view, 2131558629, "field 'tvVolley'");
    view = finder.findRequiredView(source, 2131558638, "field 'tvRetrofit'");
    target.tvRetrofit = finder.castView(view, 2131558638, "field 'tvRetrofit'");
    view = finder.findRequiredView(source, 2131558656, "field 'tvSocket'");
    target.tvSocket = finder.castView(view, 2131558656, "field 'tvSocket'");
  }

  @Override public void unbind(T target) {
    target.tvOkhttp = null;
    target.tvXutils3 = null;
    target.tvVolley = null;
    target.tvRetrofit = null;
    target.tvSocket = null;
  }
}
