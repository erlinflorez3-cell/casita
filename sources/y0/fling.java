package y0;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class fling extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public fling() {
        super(dine.DEFAULT_INSTANCE);
    }

    public final fling a() {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        dineVar.bitField0_ |= 64;
        dineVar.agentVersion_ = "3.22.0";
        return this;
    }

    public final fling a(String str) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        str.getClass();
        dineVar.bitField0_ = (-1) - (((-1) - dineVar.bitField0_) & ((-1) - 128));
        dineVar.agentConfiguration_ = str;
        return this;
    }

    public final fling a(flow flowVar) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        dineVar.secureMethod_ = flowVar.f28480a;
        dineVar.bitField0_ |= 256;
        return this;
    }

    public final fling a(boolean z2) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.bitField0_ |= 8192;
        dineVar.allowsMockLocation_ = z2;
        return this;
    }

    public final fling b() {
        String str = Build.VERSION.RELEASE;
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        str.getClass();
        int i2 = dineVar.bitField0_;
        dineVar.bitField0_ = (i2 + 32) - (i2 & 32);
        dineVar.version_ = str;
        return this;
    }

    public final fling b(String str) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        str.getClass();
        dineVar.bitField0_ |= 4096;
        dineVar.deviceName_ = str;
        return this;
    }

    public final fling b(boolean z2) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.bitField0_ |= 2048;
        dineVar.developerOptionsEnabled_ = z2;
        return this;
    }

    public final fling c(String str) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        dineVar.bitField0_ = (-1) - (((-1) - dineVar.bitField0_) & ((-1) - 8));
        dineVar.manufacturer_ = str;
        return this;
    }

    public final fling c(boolean z2) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.bitField0_ |= 1024;
        dineVar.isVirtual_ = z2;
        return this;
    }

    public final fling d(String str) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        int i2 = dineVar.bitField0_;
        dineVar.bitField0_ = (i2 + 1) - (i2 & 1);
        dineVar.model_ = str;
        return this;
    }

    public final fling e(String str) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        dineVar.bitField0_ |= 2;
        dineVar.platform_ = str;
        return this;
    }

    public final fling f(String str) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        str.getClass();
        dineVar.bitField0_ = (-1) - (((-1) - dineVar.bitField0_) & ((-1) - 16));
        dineVar.serial_ = str;
        return this;
    }

    public final fling g(String str) {
        copyOnWrite();
        dine dineVar = (dine) this.instance;
        dineVar.getClass();
        int i2 = dineVar.bitField0_;
        dineVar.bitField0_ = (i2 + 4) - (i2 & 4);
        dineVar.uuid_ = str;
        return this;
    }
}
