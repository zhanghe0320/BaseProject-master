package org.zzk.example.data.api.meitu;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MeituApi_Factory implements Factory<MeituApi> {
  private final Provider<MeituService> meituServiceProvider;

  public MeituApi_Factory(Provider<MeituService> meituServiceProvider) {
    assert meituServiceProvider != null;
    this.meituServiceProvider = meituServiceProvider;
  }

  @Override
  public MeituApi get() {
    return new MeituApi(meituServiceProvider.get());
  }

  public static Factory<MeituApi> create(Provider<MeituService> meituServiceProvider) {
    return new MeituApi_Factory(meituServiceProvider);
  }
}
