package kotlin.comparisons;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bDJi|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007llA0ZeP.XS2\u000f\u0002{<$a&yCQU\"}(\tWN}gvJ`\rK\u000f\u001c\u0016\u0001j2Wm\u0016k܈'2pno7[oU9\u000fsf\t.3:8(\u0004G\u001fݵL\u0012||QN$8>ϋ\t:\u0001\f}\t(\u0012\u001e>N\u007fN`uONH\u001b\\j31\u0007\u0002B|&&ܦ\u0003֔\u0011HZ,\u001b|y?9¨O5C$\u0004\u0007\u0015Rs?1>\"E\u0013o?'YQ\u0014WdWF\u0019Ʀ/Q\u0013f\u00010t\"_Ӡ$'YZ\u0014O^\u000e@w)\u0007=@\u0012\u000f\u001e'v9s\u001fǴ\f\u00109\u0001\u0001`Xv\u0010މZ\u007f)lf\u001b3\u007fK+g&\u0017Uo<1Ne\u00075\u0011,'\u0019nOf\u001bםfڠ\u001fV}_?`X^Vݐ\"Ykx4tp\u0002B\u0004^R07\n\u0018F\u0017SG{9Q,2\u0007ҩHi|\u0016nzk\u0007`̲X\"\u001d)g.\u0017\frD\u0013\u0018\u001cTbYD\u0011{/\u001b\fą\f\u0015&p\u0006Q9K\u001eʚgh\u0018}}a\u0018%Gfel\u001fo\u001cXQ^aH\u0002g\u001eejvBR\u0003Ͻ\u000bֽjDY\"hs@C@ʋ\u0003\u0010&\u000ftR\u001a\u0013J? /d4? t\u0015v\u001b>Bo\u0010Od˖l\u0012\u0005mA>\u001b\u00072ڏ!\u0001~w!suxa,+{R1ORM\u0019Tphmط\u0001%\r\u001b\u0002\u001d_\u000eZ܁dlD\u0011\u0006\u007f.\u001629\u007fJm\u0017\u001d\u007fA20HuP\u0001iiM@BAۨ\u007fӛ?j4\u0006\u0016\n\tMnʄbO\u00032Rzlr;\b\u0013\u001b*iT\u0002_c\u0003+{>w\u000eI^\u0084R:\u0003&-@=\u001e}E\u00155[BW!$w,/C`\u000em}/\u0012b=%;jנ0e\u001c\u0014pTuXI[aY-=R(z\u0003ZH\u0019v8F\u00175%3v@\u0015td<e\u000b]|-\u00862ޛtXa_!u\u0016U<\u0003Bsq|DbQ%)M\u0002f\u001euYc#J=\u0012+{_mX!ݞ$X]\t\u0017:\u001e\u0011&YY;\u0011\u0010l\r24D<6\u0016sXw\u0007(z.Q&\u0014ł6Dybd\u001bl\u001fjy`\u0005\u000fP\u0011%8\u0001\u0017\u000fa))9?\u0006\u0006F\u0003:\u00146\u000fW5\tIu\u0016Ƴlު/FZa)7p\"\u0019huCw\rf\bU)\u0006k\u001e\u0017h \u000b$Z\u0018IIq\u0011\u000e\u0002vcκYfT\u000e\u0005$~o\\EA~)\u0010>@\u0018\u000f#\u0019}\u0006 f;MfweV`\u0006ӢH+\r6\u000bx^A;)M-k\\\u001b\u00185{oSi\u00118$.(\u001ctOo\b\u0012t\u000eu\u001bh)8мh֒\r\u0015VK\u0012Eb\u0016\u0001-F\bdb27\u0010\u0013vY\u001a\u000bQH52\u0005\u0006pc\tx8v3h߾Y\r\t\u0013?p\u0012\f;s5\tUh^\u0017fZR\u0011\u0002;\t\u0015\u000e\u0015-&MQNgЍ\u0014Qi\u0016~\tg\u0002\u001bNGkX|a4`\u001e\u0016\u001f(\u00114.b)-;\u0005hnh\u0017`\u0005B\u0006)%ȭ.̒x\u000e/B\u000b\u001e`\u007f\u001f6LF!9\u00153E\u00197[;b\u0011\u000f\u0012La&OQr?IRx\u0010Ã,x\u00172H\u0005߶\u0004Z"}, d2 = {";`g\u001cY", "\u001aj^A_0G\u001d\t[\u000fm,R", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ";`g\u001cYs$`k|v@ ", "uA1u5", "1", ";`g\u001cYs;!fnG:\u0014", "uA1\u000f\u001c\t", "=sW2e", "\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", ";`g\u001cYs0`i\u000f~=~", "uAJ\u000f\u001c\t", "\u001aj^A_0G\u001d\tb\u0004m\u0002", ";`g\u001cYs#\u001f\u0001^F;\u001c", "uH8u<", ";`g\u001cYs0Hlmkg\b", "uH8\u0016\u001c\u0010", "\u001aj^A_0G\u001d\tb\u0004m\b\n\u0016+yU", ";`g\u001cYs&ReaM,\u0014", "uHJ\u0016\u001c\u0010", "\u001aj^A_0G\u001d\te\u0005g.R", ";`g\u001cYs>Pf]]>\u0010", "uI9u=", ";`g\u001cYsLO!{xj\f", "uI9\u0017\u001c\u0011", "\u001aj^A_0G\u001d\te\u0005g.X\u0016<a\u0014}", ";`g\u001cYs+\u001ef_`r\u0014", "uIJ\u0017\u001c\u0011", "\u001aj^A_0G\u001d\tl}h9\f^", ";`g\u001cYs\u000e>*m\u0010/\b", "uRBuF", ";`g\u001cYs/9\u0007ZEG\u0018", "uRB \u001c\u001a", "\u001aj^A_0G\u001d\tl}h9\fd<r{<Q", ";`g\u001cYsM\u001f%^a@z", "uRJ \u001c\u001a", ";h]\u001cY", ";h]\u001cYs$`k|v@ ", ";h]\u001cYs;!fnG:\u0014", ";h]\u001cYs0`i\u000f~=~", ";h]\u001cYs#\u001f\u0001^F;\u001c", ";h]\u001cYs0Hlmkg\b", ";h]\u001cYs&ReaM,\u0014", ";h]\u001cYs>Pf]]>\u0010", ";h]\u001cYsLO!{xj\f", ";h]\u001cYs+\u001ef_`r\u0014", ";h]\u001cYs\u000e>*m\u0010/\b", ";h]\u001cYs/9\u0007ZEG\u0018", ";h]\u001cYsM\u001f%^a@z", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:79)9/8315o\u0015\u0002-*,\u001c,\"+&$(~'")
public class UComparisonsKt___UComparisonsKt {
    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m10161maxOf5PvTz6A(short s2, short s3) {
        return Intrinsics.compare((s2 + 65535) - (s2 | 65535), (65535 + s3) - (65535 | s3)) >= 0 ? s2 : s3;
    }

    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static final int m10162maxOfJ1ME1BU(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) >= 0 ? i2 : i3;
    }

    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m10163maxOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, (-1) - (((-1) - b3) | ((-1) - 255))) >= 0 ? b2 : b3;
    }

    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m10164maxOfMd2H83M(int i2, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9136getSizeimpl = UIntArray.m9136getSizeimpl(other);
        for (int i3 = 0; i3 < iM9136getSizeimpl; i3++) {
            i2 = UComparisonsKt.m10162maxOfJ1ME1BU(i2, UIntArray.m9135getpVg5ArA(other, i3));
        }
        return i2;
    }

    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m10165maxOfR03FKyM(long j2, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9215getSizeimpl = ULongArray.m9215getSizeimpl(other);
        for (int i2 = 0; i2 < iM9215getSizeimpl; i2++) {
            j2 = UComparisonsKt.m10170maxOfeb3DHEI(j2, ULongArray.m9214getsVKNKU(other, i2));
        }
        return j2;
    }

    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m10166maxOfVKSA0NQ(short s2, short s3, short s4) {
        return UComparisonsKt.m10161maxOf5PvTz6A(s2, UComparisonsKt.m10161maxOf5PvTz6A(s3, s4));
    }

    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m10167maxOfWZ9TVnA(int i2, int i3, int i4) {
        return UComparisonsKt.m10162maxOfJ1ME1BU(i2, UComparisonsKt.m10162maxOfJ1ME1BU(i3, i4));
    }

    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m10168maxOfWr6uiD8(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9057getSizeimpl = UByteArray.m9057getSizeimpl(other);
        for (int i2 = 0; i2 < iM9057getSizeimpl; i2++) {
            b2 = UComparisonsKt.m10163maxOfKr8caGY(b2, UByteArray.m9056getw2LRezQ(other, i2));
        }
        return b2;
    }

    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m10169maxOfb33U2AM(byte b2, byte b3, byte b4) {
        return UComparisonsKt.m10163maxOfKr8caGY(b2, UComparisonsKt.m10163maxOfKr8caGY(b3, b4));
    }

    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static final long m10170maxOfeb3DHEI(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) >= 0 ? j2 : j3;
    }

    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m10171maxOfsambcqE(long j2, long j3, long j4) {
        return UComparisonsKt.m10170maxOfeb3DHEI(j2, UComparisonsKt.m10170maxOfeb3DHEI(j3, j4));
    }

    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m10172maxOft1qELG4(short s2, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9320getSizeimpl = UShortArray.m9320getSizeimpl(other);
        for (int i2 = 0; i2 < iM9320getSizeimpl; i2++) {
            s2 = UComparisonsKt.m10161maxOf5PvTz6A(s2, UShortArray.m9319getMh2AYeg(other, i2));
        }
        return s2;
    }

    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m10173minOf5PvTz6A(short s2, short s3) {
        return Intrinsics.compare((-1) - (((-1) - s2) | ((-1) - 65535)), 65535 & s3) <= 0 ? s2 : s3;
    }

    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static final int m10174minOfJ1ME1BU(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) <= 0 ? i2 : i3;
    }

    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m10175minOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, (b3 + 255) - (255 | b3)) <= 0 ? b2 : b3;
    }

    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m10176minOfMd2H83M(int i2, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9136getSizeimpl = UIntArray.m9136getSizeimpl(other);
        for (int i3 = 0; i3 < iM9136getSizeimpl; i3++) {
            i2 = UComparisonsKt.m10174minOfJ1ME1BU(i2, UIntArray.m9135getpVg5ArA(other, i3));
        }
        return i2;
    }

    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m10177minOfR03FKyM(long j2, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9215getSizeimpl = ULongArray.m9215getSizeimpl(other);
        for (int i2 = 0; i2 < iM9215getSizeimpl; i2++) {
            j2 = UComparisonsKt.m10182minOfeb3DHEI(j2, ULongArray.m9214getsVKNKU(other, i2));
        }
        return j2;
    }

    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m10178minOfVKSA0NQ(short s2, short s3, short s4) {
        return UComparisonsKt.m10173minOf5PvTz6A(s2, UComparisonsKt.m10173minOf5PvTz6A(s3, s4));
    }

    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m10179minOfWZ9TVnA(int i2, int i3, int i4) {
        return UComparisonsKt.m10174minOfJ1ME1BU(i2, UComparisonsKt.m10174minOfJ1ME1BU(i3, i4));
    }

    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m10180minOfWr6uiD8(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9057getSizeimpl = UByteArray.m9057getSizeimpl(other);
        for (int i2 = 0; i2 < iM9057getSizeimpl; i2++) {
            b2 = UComparisonsKt.m10175minOfKr8caGY(b2, UByteArray.m9056getw2LRezQ(other, i2));
        }
        return b2;
    }

    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m10181minOfb33U2AM(byte b2, byte b3, byte b4) {
        return UComparisonsKt.m10175minOfKr8caGY(b2, UComparisonsKt.m10175minOfKr8caGY(b3, b4));
    }

    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static final long m10182minOfeb3DHEI(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) <= 0 ? j2 : j3;
    }

    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m10183minOfsambcqE(long j2, long j3, long j4) {
        return UComparisonsKt.m10182minOfeb3DHEI(j2, UComparisonsKt.m10182minOfeb3DHEI(j3, j4));
    }

    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m10184minOft1qELG4(short s2, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM9320getSizeimpl = UShortArray.m9320getSizeimpl(other);
        for (int i2 = 0; i2 < iM9320getSizeimpl; i2++) {
            s2 = UComparisonsKt.m10173minOf5PvTz6A(s2, UShortArray.m9319getMh2AYeg(other, i2));
        }
        return s2;
    }
}
