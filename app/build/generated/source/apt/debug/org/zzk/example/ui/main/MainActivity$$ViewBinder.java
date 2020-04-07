// Generated code from Butter Knife. Do not modify!
package org.zzk.example.ui.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends org.zzk.example.ui.main.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558548, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131558548, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131558549, "field 'mContainer'");
    target.mContainer = finder.castView(view, 2131558549, "field 'mContainer'");
    view = finder.findRequiredView(source, 2131558550, "field 'mFab'");
    target.mFab = finder.castView(view, 2131558550, "field 'mFab'");
    view = finder.findRequiredView(source, 2131558546, "field 'mNavView'");
    target.mNavView = finder.castView(view, 2131558546, "field 'mNavView'");
    view = finder.findRequiredView(source, 2131558545, "field 'mDrawerLayout'");
    target.mDrawerLayout = finder.castView(view, 2131558545, "field 'mDrawerLayout'");
  }

  @Override public void unbind(T target) {
    target.mToolbar = null;
    target.mContainer = null;
    target.mFab = null;
    target.mNavView = null;
    target.mDrawerLayout = null;
  }
}
