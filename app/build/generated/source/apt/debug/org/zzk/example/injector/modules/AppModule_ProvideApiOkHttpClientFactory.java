package org.zzk.example.injector.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideApiOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  public AppModule_ProvideApiOkHttpClientFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideApiOkHttpClient(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(AppModule module) {
    return new AppModule_ProvideApiOkHttpClientFactory(module);
  }
}
