package com.google.mlkit.vision.objects.custom.internal;

import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzav;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
import com.google.mlkit.vision.objects.custom.CustomObjectDetectorOptions;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CustomObjectsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzav.zzi(Component.builder(zzb.class).add(Dependency.required((Class<?>) MlKitContext.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.vision.objects.custom.internal.zzh
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                int i2 = CustomObjectsRegistrar.zza;
                return new zzb((MlKitContext) componentContainer.get(MlKitContext.class));
            }
        }).build(), Component.builder(zza.class).add(Dependency.required((Class<?>) zzb.class)).add(Dependency.required((Class<?>) ExecutorSelector.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.vision.objects.custom.internal.zzi
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                int i2 = CustomObjectsRegistrar.zza;
                return new zza((zzb) componentContainer.get(zzb.class), (ExecutorSelector) componentContainer.get(ExecutorSelector.class));
            }
        }).build(), Component.intoSetBuilder(MultiFlavorDetectorCreator.Registration.class).add(Dependency.requiredProvider((Class<?>) zza.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.vision.objects.custom.internal.zzj
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                int i2 = CustomObjectsRegistrar.zza;
                return new MultiFlavorDetectorCreator.Registration(CustomObjectDetectorOptions.class, componentContainer.getProvider(zza.class));
            }
        }).build());
    }
}
