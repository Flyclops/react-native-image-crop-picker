package com.reactnative.ivpusic.imagepicker;

import com.facebook.react.LazyReactPackage;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;

import java.util.Arrays;
import java.util.List;

import javax.inject.Provider;

/**
 * Created by ipusic on 5/16/16.
 */
public class PickerPackage extends LazyReactPackage {

    @Override
    public List<ModuleSpec> getNativeModules(final ReactApplicationContext reactContext) {
        return Arrays.asList(
                ModuleSpec.nativeModuleSpec(PickerModule.class, new Provider<NativeModule>() {
                    @Override
                    public NativeModule get() {
                        return new PickerModule(reactContext);
                    }
                })
        );
    }

    @Override
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return LazyReactPackage.getReactModuleInfoProviderViaReflection(this);
    }
}
