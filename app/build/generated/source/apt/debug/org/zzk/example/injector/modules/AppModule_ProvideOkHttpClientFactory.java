package org.zzk.example.injector.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  private final Provider<OkHttpClient> mOkHttpClientProvider;

  public AppModule_ProvideOkHttpClientFactory(
      AppModule module, Provider<OkHttpClient> mOkHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert mOkHttpClientProvider != null;
    this.mOkHttpClientProvider = mOkHttpClientProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(mOkHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      AppModule module, Provider<OkHttpClient> mOkHttpClientProvider) {
    return new AppModule_ProvideOkHttpClientFactory(module, mOkHttpClientProvider);
  }
}
