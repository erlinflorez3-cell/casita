package org.spongycastle.jcajce.provider.config;

import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.jce.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public interface ProviderConfiguration {
    DHParameterSpec getDHDefaultParameters(int i2);

    ECParameterSpec getEcImplicitlyCa();
}
