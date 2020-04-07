package org.zzk.example.injector.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import org.zzk.example.components.okhttp.OkHttpHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideOkHttpHelperFactory implements Factory<OkHttpHelper> {
  private final AppModule module;

  private final Provider<OkHttpClient> mOkHttpClientProvider;

  public AppModule_ProvideOkHttpHelperFactory(
      AppModule module, Provider<OkHttpClient> mOkHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert mOkHttpClientProvider != null;
    this.mOkHttpClientProvider = mOkHttpClientProvider;
  }

  @Override
  public OkHttpHelper get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpHelper(mOkHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpHelper> create(
      AppModule module, Provider<OkHttpClient> mOkHttpClientProvider) {
    return new AppModule_ProvideOkHttpHelperFactory(module, mOkHttpClientProvider);
  }
}
