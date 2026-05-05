package com.biocatch.android.commonsdk.core;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\"\u007fјnjG:L͜P.`Z2\u000fq{<$i*yCAW\"}0\u0012WNmhvJh\u0016KƤ\u000e\u0016\u0007\u00054կ]xk\u0012\u0017˰JoU3UڎE9vt>ӌ(20I\u0002ڎ\t\u001a8Z\u0018v\u0001CS\f NHp@R\u0015M\u0013\u001e\u001a\u0006D$\u0017Ȧz\u0013~6vk\u00169Zc\u0006ݦFN5_x\u0011[\u000e^TU\u000f'e,.X7c\u0019UW\u0011\fj[m\t\buK\f\u0001'U3\u0012we?p\u007fB\u001ds]\u001bg\u000b&\u000b\u0010\u0002f\u001a3CQyJ~\u0010p\u0004\t\t%<2\u00106+V<E\u001a\u0015\u0013V?\u0003\u0002k@~\u0012\u000fF\u000e\fy6E0H?9K3f\u007fqk\u001d\\H\u0014\u0005;)k\u001b|4sT<bE\u001fb|i1\u007fTmR\\\u001fqC}\u0004vc\u0018)2F\u0010\u0014=\u0013).E=g_G<9k0btk\u0005 xh\u0002\u0006\u001b\\N?\u0007\u0016eH9\u0010hc|\u0005\u001ap\u0005\\:2e\u001c\u0003%F\u0018!Bt{L!+\u0011|r\u0019mxqu\nS1/Kg\u0014\u0004\u000e\u0006_\u000f7Cx{\u0010\u0010x'\u0018Mdz\u0005\u0007q\u000b_\u001a\u0004t(P:xn\u001e\"\u0014D|\u0014Ʒ6k"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "", "u(E", "0xc249KO-m\u0005A,\u0010v>r\u00041}", "", "0xc2f", "", "2d[6`0MS&", "", "1ta?X5MB\u001d\u0007zF0\u0004\u00103s", "", "3kP=f,=@\u0019z\u0002M0\u0005\t", "7mc\u0013e6FA(\f~g.", "", "D`[BX", "7oC<F;KW\"\u0001", "7o", "7rE2e:B]\"`\b^(\f\t<O\r\b\bP|\u001e\u0006Q", "", "Dda@\\6G1#}z", "7rE2e:B]\"ezl:f\u0016\u000fq\u0010$\u0003/\u000b", "8nX;", "", "BnZ2a", "", ">h_2", "", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "=tc=h;,b&~vf", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "?tPAX9GW#\bih\b\u0006\u000b6e", "", "DdRAb9", "", "/mV9X\u0016Nb", "Bn;6f;", "", "5d]?X\u0010=A(\f~g.", "Bqd;V(MS", "", "<t\\/X9", "2hV6g:-]w\u0003\ti3x\u001d", "CoC6`,-]x\n\u0005\\/", "Coc6`,'O\"\t", "\u0011n\\=T5B]\"", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Utils {
    public static final Companion Companion = new Companion(null);
    public static final double cmInInch = 2.54d;
    public static final int microToNano = 1000;
    public static final int miliSecondsInMinute = 60000;
    public static final int miliSecondsInSecond = 1000;
    public static final int miliToMicro = 1000;
    public static final int miliToNano = 1000000;
    public static final int secondsInMinute = 60;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0007\":\u0018\u007f\u0007ln?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>ˮAН^\u000bKƤV\"\u0007mDI\u0004|4\u070fa̓FoG\u074c\u001e{K>xtd\tv\u074ctأ}\u0005\tɝzT\u001e|\u0013Cy\u0010hؚ\u0013¤>R\u0015˟U& \rV /\"3ɨ!ɇLleŽ\u007f/\u0011qZNUc\u0007Ů ϘJT/˙Gm,4X7c\u0019{ٌU\u07baV[GšӳuG"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GByr{\u001fpl5\u0010g6WL", "", "u(E", "1l8;<5<V", "", ";hR?b\u001bH<\u0015\b\u0005", "", ";h[6F,<]\"}\tB5d\r8u\u000f(", ";h[6F,<]\"}\tB5j\t-o\t'", ";h[6G6&W\u0017\f\u0005", ";h[6G6'O\"\t", "AdR<a+L7\"f~g<\f\t", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String byteArrayToHexString(byte[] bytes, char c2) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuilder sb = new StringBuilder();
        if (!(bytes.length == 0)) {
            for (byte b2 : bytes) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%02X" + c2, Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                sb.append(str);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final long elapsedRealTime() {
        return SystemClock.elapsedRealtime();
    }

    public final int intFromString(String str) {
        if (str == null || str.length() == 0 || StringsKt.equals(str, "null", true) || StringsKt.toIntOrNull(str) == null) {
            return -1;
        }
        return Integer.parseInt(str);
    }

    public final String ipToString(int i2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int i3 = i2 >> 24;
        String str = String.format(Locale.getDefault(), "%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf((-1) - (((-1) - i2) | ((-1) - 255))), Integer.valueOf((i2 >> 8) & 255), Integer.valueOf((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))), Integer.valueOf((i3 + 255) - (i3 | 255))}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public final boolean isVersionGreaterOrEqualTo(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    public final boolean isVersionLessOrEqualTo(int i2) {
        return Build.VERSION.SDK_INT <= i2;
    }

    public final String join(CharSequence delimiter, Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNull(iterable);
        String strJoin = TextUtils.join(delimiter, iterable);
        Intrinsics.checkNotNullExpressionValue(strJoin, "join(delimiter, token!!)");
        return strJoin;
    }

    public final void pipe(InputStream inputStream, OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    public final double[] quaternionToAngle(float[] vector, double[] angleOut) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(angleOut, "angleOut");
        float f2 = vector[0];
        angleOut[0] = Math.toDegrees((((double) f2) < -1.5707963267948966d ? ((double) f2) + 6.283185307179586d : f2) + 1.5707963267948966d);
        angleOut[1] = -Math.toDegrees(vector[2]);
        angleOut[2] = -Math.toDegrees(vector[1]);
        return angleOut;
    }

    public final List<?> toList(String genreIdString) {
        Intrinsics.checkNotNullParameter(genreIdString, "genreIdString");
        ArrayList arrayList = new ArrayList();
        String strRemoveSurrounding = StringsKt.removeSurrounding(genreIdString, (CharSequence) "[", (CharSequence) "]");
        if (strRemoveSurrounding.length() > 0) {
            List listSplit$default = StringsKt.split$default((CharSequence) strRemoveSurrounding, new String[]{","}, false, 0, 6, (Object) null);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
        }
        return arrayList;
    }

    public final double truncate(double d2, int i2) {
        return Math.round(d2 * r4) / Math.pow(10.0d, i2);
    }

    public final long upTimeToEpoch(long j2) {
        return (currentTimeMillis() + (j2 / ((long) 1000000))) - elapsedRealTime();
    }
}
