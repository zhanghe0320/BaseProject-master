package org.zzk.example.ui.meitu;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MeituListFragment_MembersInjector implements MembersInjector<MeituListFragment> {
  private final Provider<MeituListPresenter> mPresenterProvider;

  public MeituListFragment_MembersInjector(Provider<MeituListPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<MeituListFragment> create(
      Provider<MeituListPresenter> mPresenterProvider) {
    return new MeituListFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(MeituListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    org.zzk.example.ui.base.BaseFragment_MembersInjector.injectMPresenter(
        instance, mPresenterProvider);
  }
}
