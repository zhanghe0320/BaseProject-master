package org.zzk.example.injector.modules;

import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum ActivityModule_ProvideActivityFactory implements Factory<Activity> {
  INSTANCE;

  @Override
  public Activity get() {
    return Preconditions.checkNotNull(
        ActivityModule.provideActivity(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Activity> create() {
    return INSTANCE;
  }
}
