package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.deviceApplications;

import com.biocatch.client.android.sdk.collection.collectors.application.ApplicationInstallationState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007fјnjGNL͜P.`Z2\u000fq\u000b<$i-yCAU\"}0\u000fWNmgtЁ`!¼?\u0006Dw+]YY\u0007]*\u000f`C\u007fCAO\b=ga\u0005:\u0013#J\"f}\u0015\u000b(/`\u0016\u0007|SK:\u0013^F\u0001>`\u0014e\u0005H\u001aĂB \u000f'%n\\I`l\f;uޑ\u00042I\\;w0+NSцUo\u0014\u0005v6+n;{֝&\u001c\u0010\u0015hsE\u0013A\u0002=3iU-qʥt =f\u0017,\u0015YWSǥsn\u001c\u0013ix\fU˃\u007fiQP\u001c(\u0010z*\u000el\n\u0014\u00065JF-Hg8\u00149t\u0001VXP0br\f\u0001aD\u001c=\u0006C-I\u001b\u0015R\u0010AIT={\u0013\u00146#/vgǃSVq#4lw\u007fK\u0002FKcf\fo<\u001c\u00037ľ\u0003r\u000b>c\u0018/*.tЦ$\u007fbGA9k0I\u000bаuUovV\u0002RvḎr\u001c?ѧ!\u000e`Nr\u0010<_bXD\u0011{\u001dΤ\u000b\u0004\u0010ʶ8^}H/2`]]o\u0002j{eܦ)5nŽqpq\u001ceH/BCS{\u0010\u0010Sλ\u0018EDϵ\u001dZlRa\u0019+q6'JNz\u0012\b{rO:\u0019\u0558Cw$عD3\u001fm#ZҺ\"a"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005g\u0001\u001d\u001a\f5F{M]\u0014Eu$yK2v\u00108_\u000bK?E>5o\u0013c\u001bXI>.\u001dY#\u001ahW\u000e\u001dQ", "", "/o_9\\*:b\u001d\t\u0004G(\u0005\t", "", ">`R8T.><\u0015\u0007z", "/o_9\\*:b\u001d\t\u0004B5\u000b\u0018+l\u0007$\u000bD\u000b \u0005Vk\u001d<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0010R\u0010Jd\b\u0013\u0012\u001d9ty0e\fVyj", ">da:\\:LW#\b\t", "", "4ha@g\u0010Ga(z\u0002e\u001b\u0001\u0011/", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015KMC51\"\u001ff]H\u0005fuL}+GU]uX[qJ\u001e\u0016YW\\*\u0013NWK+uD5.\f6RK9r\b\u0013\u0016\fDt}P \fR\u0005\u001cy?%wJchC#LPi.b\bn!fC\u001e-\"\u0001\u0015\"oL=\u000e\u0006\\~\u0002N\tg=.\u001evI \b}jJL9<@\u00036t0?h", "5dc\u000ec7EW\u0017z\nb6\u0006l8s\u000f$\u0003G|&\u001bQx{Kr45", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018(g]yA\u0012\u000ei\u0012X4V`dL+rB3.\f6ReDv\u0010\b\u001d\u00151ytL_}Vu$u\u0017", "5dc\u000ec7EW\u0017z\nb6\u0006q+m\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0013\\9Lb|\b\tm(\u0004\u0010\u001ei\b(", "u(9", "5dc\u001dT*DO\u001b~cZ4|", "5dc\u001dX9FW'\r~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DeviceApplicationModelEx {
    private final ApplicationInstallationState applicationInstallationState;
    private final String applicationName;
    private final long firstInstallTime;
    private final String packageName;
    private final List<String> permissions;

    public DeviceApplicationModelEx(String applicationName, String packageName, ApplicationInstallationState applicationInstallationState, List<String> permissions, long j2) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(applicationInstallationState, "applicationInstallationState");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.applicationName = applicationName;
        this.packageName = packageName;
        this.applicationInstallationState = applicationInstallationState;
        this.permissions = permissions;
        this.firstInstallTime = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceApplicationModelEx copy$default(DeviceApplicationModelEx deviceApplicationModelEx, String str, String str2, ApplicationInstallationState applicationInstallationState, List list, long j2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = deviceApplicationModelEx.applicationName;
        }
        if ((2 & i2) != 0) {
            str2 = deviceApplicationModelEx.packageName;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            applicationInstallationState = deviceApplicationModelEx.applicationInstallationState;
        }
        if ((8 & i2) != 0) {
            list = deviceApplicationModelEx.permissions;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j2 = deviceApplicationModelEx.firstInstallTime;
        }
        return deviceApplicationModelEx.copy(str, str2, applicationInstallationState, list, j2);
    }

    public final String component1() {
        return this.applicationName;
    }

    public final String component2() {
        return this.packageName;
    }

    public final ApplicationInstallationState component3() {
        return this.applicationInstallationState;
    }

    public final List<String> component4() {
        return this.permissions;
    }

    public final long component5() {
        return this.firstInstallTime;
    }

    public final DeviceApplicationModelEx copy(String applicationName, String packageName, ApplicationInstallationState applicationInstallationState, List<String> permissions, long j2) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(applicationInstallationState, "applicationInstallationState");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return new DeviceApplicationModelEx(applicationName, packageName, applicationInstallationState, permissions, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceApplicationModelEx)) {
            return false;
        }
        DeviceApplicationModelEx deviceApplicationModelEx = (DeviceApplicationModelEx) obj;
        return Intrinsics.areEqual(this.applicationName, deviceApplicationModelEx.applicationName) && Intrinsics.areEqual(this.packageName, deviceApplicationModelEx.packageName) && this.applicationInstallationState == deviceApplicationModelEx.applicationInstallationState && Intrinsics.areEqual(this.permissions, deviceApplicationModelEx.permissions) && this.firstInstallTime == deviceApplicationModelEx.firstInstallTime;
    }

    public final ApplicationInstallationState getApplicationInstallationState() {
        return this.applicationInstallationState;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final long getFirstInstallTime() {
        return this.firstInstallTime;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final List<String> getPermissions() {
        return this.permissions;
    }

    public int hashCode() {
        return (((((((this.applicationName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.applicationInstallationState.hashCode()) * 31) + this.permissions.hashCode()) * 31) + Long.hashCode(this.firstInstallTime);
    }

    public String toString() {
        return "DeviceApplicationModelEx(applicationName=" + this.applicationName + ", packageName=" + this.packageName + ", applicationInstallationState=" + this.applicationInstallationState + ", permissions=" + this.permissions + ", firstInstallTime=" + this.firstInstallTime + ')';
    }
}
