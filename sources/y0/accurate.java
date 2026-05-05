package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class accurate extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public accurate() {
        super(remedy.DEFAULT_INSTANCE);
    }

    public final void a(boolean z2) {
        copyOnWrite();
        remedy remedyVar = (remedy) this.instance;
        remedyVar.bitField0_ = (-1) - (((-1) - remedyVar.bitField0_) & ((-1) - 1));
        remedyVar.hasAccelerationChanged_ = z2;
    }

    public final void b(boolean z2) {
        copyOnWrite();
        remedy remedyVar = (remedy) this.instance;
        remedyVar.bitField0_ |= 2;
        remedyVar.hasRotationChanged_ = z2;
    }

    public final void c(boolean z2) {
        copyOnWrite();
        remedy remedyVar = (remedy) this.instance;
        remedyVar.bitField0_ |= 16;
        remedyVar.hasTouchOccurred_ = z2;
    }

    public final void d(boolean z2) {
        copyOnWrite();
        remedy remedyVar = (remedy) this.instance;
        int i2 = remedyVar.bitField0_;
        remedyVar.bitField0_ = (i2 + 8) - (i2 & 8);
        remedyVar.isDeviceCloseToSurface_ = z2;
    }

    public final void e(boolean z2) {
        copyOnWrite();
        remedy remedyVar = (remedy) this.instance;
        remedyVar.bitField0_ = (-1) - (((-1) - remedyVar.bitField0_) & ((-1) - 4));
        remedyVar.isEnvironmentDark_ = z2;
    }

    public final void f(boolean z2) {
        copyOnWrite();
        remedy remedyVar = (remedy) this.instance;
        remedyVar.bitField0_ |= 32;
        remedyVar.isTouchFromUnknownSource_ = z2;
    }
}
