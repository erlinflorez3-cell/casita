package com.ts.coresdk.logger.network;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000ePLcz\nI\u0006>\u00116B\u000524\u0012\u0006јnjG9LeN2Xݹ0%ӆ,4Rvd\u001fS?c.\u0016\"7W^ku\u0004bZ9B\u001f\n$\u000f\u0003,wT\ta &JB\u001e>CQ}UQ`#5ӯ$4(Y\b'I(8W(v)K\u0012ď\u0013ضDr@a\u001bYM( \u0016V /\u001d#ʩOɇLncJ=&KwP_?_^{\u0014ϽGù+\u000f|r,.\tEC'=S1\u0006\u0019ā@ƄCsC\u0017v*o9W\u0007o6\u0007~Zǋ,̠\u0011_x9j\b\u001a!\u001a@CO\u0012֟\u0001\u0014.w\t\u0010%<2\u00166-N.;/~\b<2%xY@^\u0018vB.y\u0012<\u001d%\u000eJC9Ie\u0002gA\u0019\\O\u0014\u0005;\u001diѯmĲ_V\u0014y#5\u001d\u0010_Ni@kd~\u0010gQ\u0006\u0006\u0007a0EJϙHĬ3}\u0017K%C\u007fiGB9k0P\u000bаuݶdjY\t`T\t0|6O*7\u000b!ֽcʰoRZx:\u0014\u001e4b\u0007\u0016\bA\u001f\u0013|\u0013ơ'ŎRYpkpMk\u000b=1l9gq<&e=v3cP\u001a\u00158״x݀CFj\u0007^jPT$\\b-05\u0019\u0003\u001e}\u0014D|\u000bI7\u0016ڬ\u001eٜ0;!^\u001bN\u0011\u001fZC\u0003\u0010m]9(\r]K$1qZy_ɞRʷtyozO5\u000bj:/G\\C%vm0uL|Q\u00065xVĀi֙KVt\u0018{b\n!.\u001c?_=@"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e` G~ F\u0004+~G}-Hm#\u0015WE\u001btC+)>", "", "1`c2Z6Kg", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0010T;>U#\f\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1kP@f\u0015:[\u0019", "5dc\u0010_(La\u0002z\u0003^", ";dc5b+'O!~", "5dc\u001aX;A]\u0018gvf,", "", "Ade2e0Mg", "\u0017", "5dc X=>`\u001d\u000e\u000f", "u(8", "BdgA", "5dc!X?M", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", ">/", ">0", ">1", ">2", ">3", "1n_F", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b\u001e\u001d\u00124\u0013\u0011I2~\u0016#\u000eCiv\f]\u001aI{\u0015\u0003\u000b2hUki\u0007M\u000b3b7u\fl\u0004f<\u001a-#~-p", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", "BnBAe0GU", "\nh]6g\u0005", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b("}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ServerLogEntry {
    private final String category;
    private final String className;
    private final String methodName;
    private final int severity;
    private final String text;

    public ServerLogEntry(int i2, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.severity = i2;
        this.text = str;
        this.category = str2;
        this.className = str3;
        this.methodName = str4;
    }

    public static /* synthetic */ ServerLogEntry copy$default(ServerLogEntry serverLogEntry, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = serverLogEntry.severity;
        }
        if ((2 & i3) != 0) {
            str = serverLogEntry.text;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            str2 = serverLogEntry.category;
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            str3 = serverLogEntry.className;
        }
        if ((i3 & 16) != 0) {
            str4 = serverLogEntry.methodName;
        }
        return serverLogEntry.copy(i2, str, str2, str3, str4);
    }

    public final int component1() {
        return this.severity;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.category;
    }

    public final String component4() {
        return this.className;
    }

    public final String component5() {
        return this.methodName;
    }

    public final ServerLogEntry copy(int i2, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ServerLogEntry(i2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerLogEntry)) {
            return false;
        }
        ServerLogEntry serverLogEntry = (ServerLogEntry) obj;
        return this.severity == serverLogEntry.severity && Intrinsics.areEqual(this.text, serverLogEntry.text) && Intrinsics.areEqual(this.category, serverLogEntry.category) && Intrinsics.areEqual(this.className, serverLogEntry.className) && Intrinsics.areEqual(this.methodName, serverLogEntry.methodName);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final int getSeverity() {
        return this.severity;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.severity) * 31) + this.text.hashCode()) * 31) + this.category.hashCode()) * 31) + this.className.hashCode()) * 31) + this.methodName.hashCode();
    }

    public String toString() {
        return "ServerLogEntry(severity=" + this.severity + ", text=" + this.text + ", category=" + this.category + ", className=" + this.className + ", methodName=" + this.methodName + ")";
    }
}
