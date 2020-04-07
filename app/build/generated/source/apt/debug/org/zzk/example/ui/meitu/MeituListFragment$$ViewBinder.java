// Generated code from Butter Knife. Do not modify!
package org.zzk.example.ui.meitu;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MeituListFragment$$ViewBinder<T extends org.zzk.example.ui.meitu.MeituListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558570, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131558570, "field 'mRecyclerView'");
  }

  @Override public void unbind(T target) {
    target.mRecyclerView = null;
  }
}
