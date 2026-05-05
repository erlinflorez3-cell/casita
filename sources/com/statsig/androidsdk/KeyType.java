package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\rGّ/!Ǟ`\bR2\"y\u0017f\u0019ˎ^C\u001eG7\u0013X0\u000fө\u007f42[\rqI<>\u001a\u0004$qOTjPnP^sC\u0015\u000b~xp22U~dz\u000f8JŌC="}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`-o\"+\u000b05/", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0017M8!<\b%7\u000e^", "\u0010N>!F\u001b+/\u0004", "\u001dU4\u001f4\u0013%", "\u0011G4\u0010>& /\b^", "\u0015DC,6\u0016'4|`", "\u0015DC,8\u001f)3\u0006bb>\u0015k", "\u0015DC,?\b23\u0006", " DC\u001fL&\u001f/|eZ=&cr\u0011", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public enum KeyType {
    INITIALIZE,
    BOOTSTRAP,
    OVERALL,
    CHECK_GATE,
    GET_CONFIG,
    GET_EXPERIMENT,
    GET_LAYER,
    RETRY_FAILED_LOG;

    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013َ\u001a}"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`-o\"+\u000b05\u0018[*?x\u00127QMDA", "", "u(E", "1n]CX9M4&\t\u0003L;\n\r8g", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`-o\"+\u000b05/", "D`[BX", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyType convertFromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String str = value;
            if (StringsKt.contains$default((CharSequence) "checkGate", (CharSequence) str, false, 2, (Object) null)) {
                return KeyType.CHECK_GATE;
            }
            if (StringsKt.contains$default((CharSequence) "getExperiment", (CharSequence) str, false, 2, (Object) null)) {
                return KeyType.GET_EXPERIMENT;
            }
            if (StringsKt.contains$default((CharSequence) "getConfig", (CharSequence) str, false, 2, (Object) null)) {
                return KeyType.GET_CONFIG;
            }
            if (StringsKt.contains$default((CharSequence) "getLayer", (CharSequence) str, false, 2, (Object) null)) {
                return KeyType.GET_LAYER;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static KeyType[] valuesCustom() {
        KeyType[] keyTypeArrValuesCustom = values();
        return (KeyType[]) Arrays.copyOf(keyTypeArrValuesCustom, keyTypeArrValuesCustom.length);
    }
}
