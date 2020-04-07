package org.zzk.example.ui.meitu;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.zzk.example.data.api.meitu.MeituApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MeituListPresenter_Factory implements Factory<MeituListPresenter> {
  private final MembersInjector<MeituListPresenter> meituListPresenterMembersInjector;

  private final Provider<MeituApi> meituApiProvider;

  public MeituListPresenter_Factory(
      MembersInjector<MeituListPresenter> meituListPresenterMembersInjector,
      Provider<MeituApi> meituApiProvider) {
    assert meituListPresenterMembersInjector != null;
    this.meituListPresenterMembersInjector = meituListPresenterMembersInjector;
    assert meituApiProvider != null;
    this.meituApiProvider = meituApiProvider;
  }

  @Override
  public MeituListPresenter get() {
    return MembersInjectors.injectMembers(
        meituListPresenterMembersInjector, new MeituListPresenter(meituApiProvider.get()));
  }

  public static Factory<MeituListPresenter> create(
      MembersInjector<MeituListPresenter> meituListPresenterMembersInjector,
      Provider<MeituApi> meituApiProvider) {
    return new MeituListPresenter_Factory(meituListPresenterMembersInjector, meituApiProvider);
  }
}
