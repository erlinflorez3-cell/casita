package com.squareup.wire.internal;

import androidx.compose.animation.core.AnimationKt;
import com.dynatrace.android.agent.Global;
import java.time.Duration;
import java.util.Arrays;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nj?1JΣHDɟ\u00044\u001fq\f8R[\rq\"<\u0004\u0019>)\u000fOɁkitLh\u000e\f!\u0014\u001a\u0011jZN\u0006\u0001k\u0018'6po(3,p\u0004M)\u0007D\f86P8b\u0005_\u001bZL\u001e|\u0013Cy\u0011XDϴtB"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006U5BU\r$Avz<WL\u001cuA&\u0011wp9\u00149", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqZP\u000e\u0013&Ky\u0017\u0012", "\nh]6g\u0005", "u(E", "BnBAe0GU\u0003\fcn4y\t<", "", "D`[BX", "4q^:F;KW\"\u0001", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DurationJsonFormatter implements JsonFormatter<Duration> {
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Duration fromString(String value) {
        int i2;
        Intrinsics.checkNotNullParameter(value, "value");
        String str = value;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, 's', 0, false, 6, (Object) null);
        if (iIndexOf$default != value.length() - 1) {
            throw new NumberFormatException();
        }
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            String strSubstring = value.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Duration durationOfSeconds = Duration.ofSeconds(Long.parseLong(strSubstring));
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
            return durationOfSeconds;
        }
        String strSubstring2 = value.substring(0, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        long j2 = Long.parseLong(strSubstring2);
        int i3 = iIndexOf$default2 + 1;
        String strSubstring3 = value.substring(i3, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        long j3 = Long.parseLong(strSubstring3);
        if (StringsKt.startsWith$default(value, Global.HYPHEN, false, 2, (Object) null)) {
            j3 = -j3;
        }
        int i4 = iIndexOf$default - i3;
        int i5 = i4;
        while (true) {
            if (i5 >= 9) {
                break;
            }
            j3 *= (long) 10;
            i5++;
        }
        for (i2 = 9; i2 < i4; i2++) {
            j3 /= (long) 10;
        }
        Duration durationOfSeconds2 = Duration.ofSeconds(j2, j3);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
        return durationOfSeconds2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(Duration value) {
        String str;
        Intrinsics.checkNotNullParameter(value, "value");
        long seconds = value.getSeconds();
        int nano = value.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = Global.HYPHEN;
            }
            if (nano != 0) {
                seconds--;
                nano = 1000000000 - nano;
            }
        } else {
            str = "";
        }
        if (nano == 0) {
            String str2 = String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (nano % 1000000 == 0) {
            String str3 = String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / AnimationKt.MillisToNanos)}, 3));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        if (nano % 1000 == 0) {
            String str4 = String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / 1000)}, 3));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            return str4;
        }
        String str5 = String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        return str5;
    }
}
