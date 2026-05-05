package com.dynatrace.agent.storage.preference;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r(4\u0012}\u0007njG9L͜P.`q2\u000fy\b<$a:w٘Akڼ\u001cB9O|f mj\u001b>S\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fwF\t.7:8(\u000b\u0011$8O(|\u000bE[\f@9nxĐV\u000fS\u000f(\u001dNB.\u00166\\\u0016T~OzsR/Q\u00040ŰOof>\u0014e\rtWm̠w*%9XO5C(\u001aϏ\b\u001bbM\u001cWqk\u000b/Ү(sV\u0002qN^\u0010\u0016%+}\u0016\fzlٟ\u0006\u001a \u001aBCO\u0012֟\u0001\u0014.w\t{%<2\u000f6-N.;\u001c~\b<6%xY@^\u0006vB.}\u0012<\u001d%\u000e8C9Il\u0002mA\u0019\\>\u0014\u000b\u001d 3\u0001\u001d*\n\\Tײ\u0014ce\u0006mIQnCxT\u0018vUo\u001ao\u0011\u0001p̍1\u0010\u0007=\u001a).E(}ښ8k(y!`D\u0016\u007fKòg$x`HX\"\u001d\u0017֖.\u000f\u0014ɮ\\f\u000bw^a);\u001fO4T5\u0001ݔ\u0017&dɼT#+\u001e\\^9xxQu\nS2Ϭ;_v\u0088&Y?nAD\"r\u001efjvBEםf\u000b`٨ZU\u0012kj:rGVq(}\fF^\fA;myʬ829ǉt\u0017N\u0016,V˯\u0001*"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "", "@de6f0H\\", "", ";`g\u000fX(<]\"l~s,b\r,", "", ";`g\u0012i,Gb\u0007\u0003\u0010^\u0012\u0001\u0006", "1`_Ah9>", "", "CrT?<5MS&zxm0\u0007\u0012=C{3\u000bP\u000e\u0017", "", "", "\nh]6g\u0005", "uI8\u0016M\u0013CO*zDn;\u0001\u0010xL\u00046\u000b\u0016D\b", "5dc\u001fX=Ba\u001d\t\u0004", "u(9", "5dc\u001aT?\u001bS\u0015|\u0005g\u001a\u0001\u001e/K\u0004%", "u(8", "5dc\u001aT?\u001ed\u0019\b\nL0\u0012\t\u0015i|", "5dc\u0010T7Mc&~", "u(I", "5dc\"f,K7\"\u000ezk(z\u00183o\t6Y<\f&'To", "u(;7T=:\u001d)\u000e~euc\r=tU", "7rC<h*AC'~\bB5\f\t<a}7\u007fJ\nv Cl\u0015<u", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ServerConfigurationV4 {
    public static final Companion Companion = new Companion(null);
    private static final ServerConfigurationV4 DEFAULT_CONFIG = new ServerConfigurationV4(0, 1024, 256, true, CollectionsKt.emptyList());
    private final boolean capture;
    private final int maxBeaconSizeKib;
    private final int maxEventSizeKib;
    private final long revision;
    private final List<String> userInteractionsCapture;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005#2ߛx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,3\u007fESUH\u0001̀\rUVʴ\u007fpP^\u0019HǍ\n\u001c"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "\nh]6g\u0005", "u(E", "\u0012D5\u000eH\u0013-Mvhc?\u0010^", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "5dc\u00118\r\u001aC\u007fmt<\u0016ei\u0013G", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~d\u000b 8m#.VA;5\"\u001e\"yaFdm5Oz)WYJ;`\\{.bg", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServerConfigurationV4 getDEFAULT_CONFIG() {
            return ServerConfigurationV4.DEFAULT_CONFIG;
        }
    }

    public ServerConfigurationV4(long j2, int i2, int i3, boolean z2, List<String> userInteractionsCapture) {
        Intrinsics.checkNotNullParameter(userInteractionsCapture, "userInteractionsCapture");
        this.revision = j2;
        this.maxBeaconSizeKib = i2;
        this.maxEventSizeKib = i3;
        this.capture = z2;
        this.userInteractionsCapture = userInteractionsCapture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerConfigurationV4 copy$default(ServerConfigurationV4 serverConfigurationV4, long j2, int i2, int i3, boolean z2, List list, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            j2 = serverConfigurationV4.revision;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = serverConfigurationV4.maxBeaconSizeKib;
        }
        if ((i4 + 4) - (4 | i4) != 0) {
            i3 = serverConfigurationV4.maxEventSizeKib;
        }
        if ((8 & i4) != 0) {
            z2 = serverConfigurationV4.capture;
        }
        if ((i4 & 16) != 0) {
            list = serverConfigurationV4.userInteractionsCapture;
        }
        return serverConfigurationV4.copy(j2, i2, i3, z2, list);
    }

    public final long component1() {
        return this.revision;
    }

    public final int component2() {
        return this.maxBeaconSizeKib;
    }

    public final int component3() {
        return this.maxEventSizeKib;
    }

    public final boolean component4() {
        return this.capture;
    }

    public final List<String> component5() {
        return this.userInteractionsCapture;
    }

    public final ServerConfigurationV4 copy(long j2, int i2, int i3, boolean z2, List<String> userInteractionsCapture) {
        Intrinsics.checkNotNullParameter(userInteractionsCapture, "userInteractionsCapture");
        return new ServerConfigurationV4(j2, i2, i3, z2, userInteractionsCapture);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerConfigurationV4)) {
            return false;
        }
        ServerConfigurationV4 serverConfigurationV4 = (ServerConfigurationV4) obj;
        return this.revision == serverConfigurationV4.revision && this.maxBeaconSizeKib == serverConfigurationV4.maxBeaconSizeKib && this.maxEventSizeKib == serverConfigurationV4.maxEventSizeKib && this.capture == serverConfigurationV4.capture && Intrinsics.areEqual(this.userInteractionsCapture, serverConfigurationV4.userInteractionsCapture);
    }

    public final boolean getCapture() {
        return this.capture;
    }

    public final int getMaxBeaconSizeKib() {
        return this.maxBeaconSizeKib;
    }

    public final int getMaxEventSizeKib() {
        return this.maxEventSizeKib;
    }

    public final long getRevision() {
        return this.revision;
    }

    public final List<String> getUserInteractionsCapture() {
        return this.userInteractionsCapture;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.revision) * 31) + Integer.hashCode(this.maxBeaconSizeKib)) * 31) + Integer.hashCode(this.maxEventSizeKib)) * 31) + Boolean.hashCode(this.capture)) * 31) + this.userInteractionsCapture.hashCode();
    }

    public final boolean isTouchUserInteractionEnabled() {
        return this.userInteractionsCapture.contains("all");
    }

    public String toString() {
        return "ServerConfigurationV4(revision=" + this.revision + ", maxBeaconSizeKib=" + this.maxBeaconSizeKib + ", maxEventSizeKib=" + this.maxEventSizeKib + ", capture=" + this.capture + ", userInteractionsCapture=" + this.userInteractionsCapture + ')';
    }
}
