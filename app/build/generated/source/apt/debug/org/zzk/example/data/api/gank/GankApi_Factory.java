package org.zzk.example.data.api.gank;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankApi_Factory implements Factory<GankApi> {
  private final Provider<GankService> gankServiceProvider;

  public GankApi_Factory(Provider<GankService> gankServiceProvider) {
    assert gankServiceProvider != null;
    this.gankServiceProvider = gankServiceProvider;
  }

  @Override
  public GankApi get() {
    return new GankApi(gankServiceProvider.get());
  }

  public static Factory<GankApi> create(Provider<GankService> gankServiceProvider) {
    return new GankApi_Factory(gankServiceProvider);
  }
}
