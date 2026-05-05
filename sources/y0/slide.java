package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class slide extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public slide() {
        super(proposal.DEFAULT_INSTANCE);
    }

    public final int a() {
        return ((proposal) this.instance).dexes_.size();
    }

    public final slide a(long j2) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 128));
        proposalVar.firstInstallTime_ = j2;
        return this;
    }

    public final slide a(String str) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        str.getClass();
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 8192));
        proposalVar.iconHash_ = str;
        return this;
    }

    public final slide a(ArrayList arrayList) {
        copyOnWrite();
        ((proposal) this.instance).a(arrayList);
        return this;
    }

    public final slide a(List list) {
        copyOnWrite();
        ((proposal) this.instance).a(list);
        return this;
    }

    public final slide a(fabricate fabricateVar) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        fabricateVar.getClass();
        proposalVar.d();
        proposalVar.dexes_.add(fabricateVar);
        return this;
    }

    public final slide a(misplace misplaceVar) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        misplaceVar.getClass();
        proposalVar.applicationInfo_ = misplaceVar;
        proposalVar.bitField0_ |= 4096;
        return this;
    }

    public final slide a(boolean z2) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 1024));
        proposalVar.debug_ = z2;
        return this;
    }

    public final slide b() {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 512));
        proposalVar.platform_ = "android";
        return this;
    }

    public final slide b(long j2) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 256));
        proposalVar.lastUpdateTime_ = j2;
        return this;
    }

    public final slide b(String str) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 64));
        proposalVar.installerPackageName_ = str;
        return this;
    }

    public final slide b(ArrayList arrayList) {
        copyOnWrite();
        ((proposal) this.instance).b(arrayList);
        return this;
    }

    public final slide b(boolean z2) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        int i2 = proposalVar.bitField0_;
        proposalVar.bitField0_ = (i2 + 2048) - (i2 & 2048);
        proposalVar.systemApp_ = z2;
        return this;
    }

    public final slide c(String str) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        str.getClass();
        int i2 = proposalVar.bitField0_;
        proposalVar.bitField0_ = (i2 + 16) - (i2 & 16);
        proposalVar.internalVersion_ = str;
        return this;
    }

    public final slide c(ArrayList arrayList) {
        copyOnWrite();
        ((proposal) this.instance).c(arrayList);
        return this;
    }

    public final slide d(String str) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        str.getClass();
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 1));
        proposalVar.label_ = str;
        return this;
    }

    public final slide d(ArrayList arrayList) {
        copyOnWrite();
        ((proposal) this.instance).d(arrayList);
        return this;
    }

    public final slide e(String str) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        str.getClass();
        proposalVar.bitField0_ = (-1) - (((-1) - proposalVar.bitField0_) & ((-1) - 2));
        proposalVar.packageName_ = str;
        return this;
    }

    public final slide e(ArrayList arrayList) {
        copyOnWrite();
        ((proposal) this.instance).e(arrayList);
        return this;
    }

    public final slide f(String str) {
        copyOnWrite();
        proposal proposalVar = (proposal) this.instance;
        proposalVar.getClass();
        int i2 = proposalVar.bitField0_;
        proposalVar.bitField0_ = (i2 + 4) - (i2 & 4);
        proposalVar.version_ = str;
        return this;
    }
}
