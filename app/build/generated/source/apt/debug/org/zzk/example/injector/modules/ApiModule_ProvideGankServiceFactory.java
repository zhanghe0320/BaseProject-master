package org.zzk.example.injector.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import org.zzk.example.data.api.gank.GankService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideGankServiceFactory implements Factory<GankService> {
  private final ApiModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public ApiModule_ProvideGankServiceFactory(
      ApiModule module, Provider<OkHttpClient> okHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public GankService get() {
    return Preconditions.checkNotNull(
        module.provideGankService(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GankService> create(
      ApiModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new ApiModule_ProvideGankServiceFactory(module, okHttpClientProvider);
  }
}
