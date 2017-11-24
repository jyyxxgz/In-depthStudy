// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MarqueeViewActivity$$ViewBinder<T extends com.sun.study.ui.activity.MarqueeViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558557, "field 'marqueeView1'");
    target.marqueeView1 = finder.castView(view, 2131558557, "field 'marqueeView1'");
    view = finder.findRequiredView(source, 2131558559, "field 'marqueeView2'");
    target.marqueeView2 = finder.castView(view, 2131558559, "field 'marqueeView2'");
    view = finder.findRequiredView(source, 2131558561, "field 'marqueeView3'");
    target.marqueeView3 = finder.castView(view, 2131558561, "field 'marqueeView3'");
    view = finder.findRequiredView(source, 2131558563, "field 'marqueeView4'");
    target.marqueeView4 = finder.castView(view, 2131558563, "field 'marqueeView4'");
    view = finder.findRequiredView(source, 2131558555, "field 'marqueeView'");
    target.marqueeView = finder.castView(view, 2131558555, "field 'marqueeView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.marqueeView1 = null;
    target.marqueeView2 = null;
    target.marqueeView3 = null;
    target.marqueeView4 = null;
    target.marqueeView = null;
  }
}
