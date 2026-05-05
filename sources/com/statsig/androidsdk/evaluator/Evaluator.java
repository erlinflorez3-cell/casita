package com.statsig.androidsdk.evaluator;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.statsig.androidsdk.Statsig;
import com.statsig.androidsdk.StatsigUser;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.codec.language.bm.Languages;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0R\tP.`_2\u000f\u0002{<$a'yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0015\u00172XoG\u074cUoS9htD'(288\u0002\u0005\u0007\u001d2H\u001e\u007f\u0003CQ\u000f\u001a0VpBR#M\r\u001a\u0018\u0007DĨ\u0017Ȧ\rg|5\twm>=#\u001bipOϮc0\u000bOUdb2%v\u0010([DEA-%\u0002\fMRĲ>šՃp<ߔg'ݳ/KydDfH*#:g\r\f\u0003V`\u0013bx\fU=\u007fgYc&(&\u000fB\r\u0005\u001a\u001c\u001b?H\\=Jj\u0016\u001fKt!epT\u0010tZ\u007f)x|\u0017m\u001bACQ\u001b\u0015a\u0012?'gO{3\u0016N'\u000f\u007f9[\u0003 'ٽôXwWK\u001a\tKcf\fo<\u001c\u0014!f\u0010;\u001c0u\u0012_\u007f\u001fJ/%exiO/\n\u001apTu\u0007\u0011pjci\u0001QP$~\u0016e37,\tcM\u0017{^dd<\u0013]\u001c\u0003\u0010\u000e\n# \u000b\u0001jA\u00041\u0015O1\u0005xou\nS?\u0017;g\b\u0004\u000e\u0006B\u000f7Cb{\u0010\u0010d=ܝ͖@b\u000b{/]a0r\\V2bLx)\u0010{rW<\u0017@P\n\u001cb>wǉÅ\u0019H\tC\u000b_\u000b/wZ\u00177/XA5\u001biR\u00079\u0005^o\to\u0016\ry0\u000b|:-on{\u0019nk0\u0011L|Q\u0017/w\u000eX\u007fLu^\u001d\u001a\u0004q\u0014 D7\u007fQw\u0010!8\u0017)`)]KZ\u001d}Sc\u0011Uy-\u007f\u001df\u00010}\u0007\u0019o\\\u0015xvg\u0005'3\u0007m!,ϋh\n\u007f\u0010V\u0001M|d\raDo\"\u0013jL]f\u0006ġ#(+/\u007f(\u0003N=E-#<($1%a\f\u0011\u001e[@b_:\u0003h\u001c4\u0002\u001b\u0018dg\\`?fM0˝@ѐ(l\u000bܩ\u0019~\u0006\u000eZ\u0011R\u0012[JWc\u001fZfQaɃ\u007f֨\u000b,\u0015ߞ'vH\u001a\b\nD0o*\"L\u000e\u0016nCS\u001b{[>Ɲyү[֥Ί\u0013\n\u0013֊\u0002z \u001cU \u0005X9ׁ2Ӓw\u0018>\u05cdݨb\u0012D\t*K4<\u000e*KWoє,)~ʴc@"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0017~\u00125]?JuAs", "", "As^?X", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,;REx4s", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011o\u001f8}51h\b-\u0001[!.K1JuA\u001ej,R", "1`[2a+:`\u0003\bz", "\u001aiPCTuNb\u001d\u0006D<(\u0004\t8d{5Q", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "1`[2a+:`\b\u0011\u0005", "6`b5?6HY)\niZ)\u0004\t", "", "", "\u001aj^A_0G\u001d\te\u0005g.R", "1n\\=h;>C'~\bA(\u000b\f", "7m_Bg", "1n\\=h;>C'~\bA(\u000b\fvIQ\u0015e:kz", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?%", "3uP9h(MS", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0015w\u001f/QE\u001b|0%%dp=\u0011l\u0002", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "AoT0", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,#", "3uP9h(MSv\t\u0004]0\f\r9n", "1n]1\\;B]\"", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,+MDj8-\u0019rj\u000f", "3uP9h(MSv\t\u0004_0~", "<`\\2", "3uP9h(MSv\t\u0004_0~G+n~5\u0006D\u007f\u0011%Fu\bIv,5U\f ", "3uP9h(MSw~\u0002^.x\u0018/", "@t[2", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,:SBk\n", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "3uP9h(MSzz\n^", "3uP9h(MSzz\n^jx\u0012.r\n,z:\u000f\u0016\u001dA|\u000eCv!CY", "3uP9h(MS\u007fz\u000f^9", "3uP9h(MS\u007fz\u000f^9;\u00058d\r2\u007f?z%\u0016Mi\u001b<}%1g}", "3uP9h(MS\u0004z\tl\u0017|\u0016-e\t7", "", "3uP9h(MS\u0006\u000f\u0002^", "Dda@\\6G1#\u0007\u0006Z9|k/l\u000b(\t", "Dda@\\6G\u001f", "Dda@\\6G ", "1n\\=T9>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "D0", "D1", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Evaluator {
    private final Calendar calendarOne;
    private final Calendar calendarTwo;
    private Map<String, ULong> hashLookupTable;
    private final SpecStore store;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfigCondition.valuesCustom().length];
            iArr[ConfigCondition.PUBLIC.ordinal()] = 1;
            iArr[ConfigCondition.FAIL_GATE.ordinal()] = 2;
            iArr[ConfigCondition.PASS_GATE.ordinal()] = 3;
            iArr[ConfigCondition.USER_FIELD.ordinal()] = 4;
            iArr[ConfigCondition.IP_BASED.ordinal()] = 5;
            iArr[ConfigCondition.UA_BASED.ordinal()] = 6;
            iArr[ConfigCondition.CURRENT_TIME.ordinal()] = 7;
            iArr[ConfigCondition.ENVIRONMENT_FIELD.ordinal()] = 8;
            iArr[ConfigCondition.USER_BUCKET.ordinal()] = 9;
            iArr[ConfigCondition.UNIT_ID.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", "D0", "", "D1"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String v1, String v2) {
            Intrinsics.checkNotNullParameter(v1, "v1");
            Intrinsics.checkNotNullParameter(v2, "v2");
            return EvaluatorUtils.INSTANCE.versionCompare(v1, v2) > 0;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$10 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass10 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass10 INSTANCE = ;

        AnonymousClass10() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.equals(a2, b2, false);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$11 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass11 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass11 INSTANCE = ;

        AnonymousClass11() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.startsWith(a2, b2, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$12 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass12 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass12 INSTANCE = ;

        AnonymousClass12() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.endsWith(a2, b2, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$13 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass13 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass13 INSTANCE = ;

        AnonymousClass13() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.contains((CharSequence) a2, (CharSequence) b2, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$14 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass14 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass14 INSTANCE = ;

        AnonymousClass14() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.contains((CharSequence) a2, (CharSequence) b2, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$15 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass15 extends Lambda implements Function2<Date, Date, Boolean> {
        public static final AnonymousClass15 INSTANCE = ;

        AnonymousClass15() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Date date, Date date2) {
            return Boolean.valueOf(invoke2(date, date2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(Date a2, Date b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return a2.before(b2);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$16 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass16 extends Lambda implements Function2<Date, Date, Boolean> {
        public static final AnonymousClass16 INSTANCE = ;

        AnonymousClass16() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Date date, Date date2) {
            return Boolean.valueOf(invoke2(date, date2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(Date a2, Date b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return a2.after(b2);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$17 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass17 extends Lambda implements Function2<Date, Date, Boolean> {
        AnonymousClass17() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Date date, Date date2) {
            return Boolean.valueOf(invoke2(date, date2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(Date a2, Date b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            Evaluator.this.calendarOne.setTime(a2);
            Evaluator.this.calendarTwo.setTime(b2);
            return Evaluator.this.calendarOne.get(1) == Evaluator.this.calendarTwo.get(1) && Evaluator.this.calendarOne.get(6) == Evaluator.this.calendarTwo.get(6);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", "D0", "", "D1"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String v1, String v2) {
            Intrinsics.checkNotNullParameter(v1, "v1");
            Intrinsics.checkNotNullParameter(v2, "v2");
            return EvaluatorUtils.INSTANCE.versionCompare(v1, v2) >= 0;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", "D0", "", "D1"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String v1, String v2) {
            Intrinsics.checkNotNullParameter(v1, "v1");
            Intrinsics.checkNotNullParameter(v2, "v2");
            return EvaluatorUtils.INSTANCE.versionCompare(v1, v2) < 0;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", "D0", "", "D1"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass4 INSTANCE = ;

        AnonymousClass4() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String v1, String v2) {
            Intrinsics.checkNotNullParameter(v1, "v1");
            Intrinsics.checkNotNullParameter(v2, "v2");
            return EvaluatorUtils.INSTANCE.versionCompare(v1, v2) <= 0;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", "D0", "", "D1"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass5 INSTANCE = ;

        AnonymousClass5() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String v1, String v2) {
            Intrinsics.checkNotNullParameter(v1, "v1");
            Intrinsics.checkNotNullParameter(v2, "v2");
            return EvaluatorUtils.INSTANCE.versionCompare(v1, v2) == 0;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$6 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", "D0", "", "D1"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass6 INSTANCE = ;

        AnonymousClass6() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String v1, String v2) {
            Intrinsics.checkNotNullParameter(v1, "v1");
            Intrinsics.checkNotNullParameter(v2, "v2");
            return EvaluatorUtils.INSTANCE.versionCompare(v1, v2) != 0;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass7 INSTANCE = ;

        AnonymousClass7() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.equals(a2, b2, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$8 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass8 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass8 INSTANCE = ;

        AnonymousClass8() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.equals(a2, b2, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$9 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003\u0010Iي>éFB-!\\\u0016\u0006\u0007~jg1tiV0jSX\u00102\u0004"}, d2 = {"\n`]<a@F])\rS", "", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass9 extends Lambda implements Function2<String, String, Boolean> {
        public static final AnonymousClass9 INSTANCE = ;

        AnonymousClass9() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke */
        public final boolean invoke2(String a2, String b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return StringsKt.equals(a2, b2, false);
        }
    }

    public Evaluator(SpecStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
        this.calendarOne = Calendar.getInstance();
        this.calendarTwo = Calendar.getInstance();
        this.hashLookupTable = new HashMap();
    }

    /* JADX INFO: renamed from: computeUserHash-I7RO_PI */
    private final long m8731computeUserHashI7RO_PI(String str) throws NoSuchAlgorithmException {
        ULong uLong = this.hashLookupTable.get(str);
        if (uLong != null) {
            return uLong.m9206unboximpl();
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = Charsets.UTF_8;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        long jM9154constructorimpl = ULong.m9154constructorimpl(ByteBuffer.wrap(messageDigest.digest(bytes)).getLong());
        if (this.hashLookupTable.size() > 1000) {
            this.hashLookupTable.clear();
        }
        this.hashLookupTable.put(str, ULong.m9148boximpl(jM9154constructorimpl));
        return jM9154constructorimpl;
    }

    private final ConfigEvaluation evaluate(StatsigUser statsigUser, Spec spec) {
        try {
            if (!spec.getEnabled()) {
                return new ConfigEvaluation(false, spec.getDefaultValue().getValue(), spec.getDefaultValue(), "disabled", null, null, null, null, false, false, false, spec.getVersion(), 2032, null);
            }
            ArrayList<Map<String, String>> arrayList = new ArrayList<>();
            for (SpecRule specRule : spec.getRules()) {
                try {
                    ConfigEvaluation configEvaluationEvaluateRule = evaluateRule(statsigUser, specRule);
                    arrayList.addAll(configEvaluationEvaluateRule.getSecondaryExposures());
                    if (configEvaluationEvaluateRule.getBooleanValue()) {
                        ConfigEvaluation configEvaluationEvaluateDelegate = evaluateDelegate(statsigUser, specRule, arrayList);
                        if (configEvaluationEvaluateDelegate != null) {
                            configEvaluationEvaluateDelegate.setConfigVersion(spec.getVersion());
                            return configEvaluationEvaluateDelegate;
                        }
                        boolean zEvaluatePassPercent = evaluatePassPercent(statsigUser, spec, specRule);
                        Object jsonValue = zEvaluatePassPercent ? configEvaluationEvaluateRule.getJsonValue() : spec.getDefaultValue().getValue();
                        ReturnableValue returnableValue = zEvaluatePassPercent ? configEvaluationEvaluateRule.getReturnableValue() : spec.getDefaultValue();
                        String ruleID = configEvaluationEvaluateRule.getRuleID();
                        String groupName = configEvaluationEvaluateRule.getGroupName();
                        Boolean boolIsExperimentGroup = specRule.isExperimentGroup();
                        return new ConfigEvaluation(zEvaluatePassPercent, jsonValue, returnableValue, ruleID, groupName, arrayList, null, null, boolIsExperimentGroup == null ? false : boolIsExperimentGroup.booleanValue(), spec.isActive(), false, spec.getVersion(), 1216, null);
                    }
                } catch (UnsupportedEvaluationException e2) {
                    e = e2;
                    Statsig.INSTANCE.getClient$android_sdk_release().getErrorBoundary$android_sdk_release().logException$android_sdk_release(e, "evaluate");
                    ReturnableValue defaultValue = spec.getDefaultValue();
                    List<String> explicitParameters = spec.getExplicitParameters();
                    if (explicitParameters == null) {
                        explicitParameters = CollectionsKt.emptyList();
                    }
                    return new ConfigEvaluation(false, defaultValue, null, "default", null, null, explicitParameters, null, false, spec.isActive(), false, spec.getVersion(), 1460, null);
                }
            }
            return new ConfigEvaluation(false, spec.getDefaultValue().getValue(), spec.getDefaultValue(), "default", null, arrayList, null, null, false, spec.isActive(), false, spec.getVersion(), 1472, null);
        } catch (UnsupportedEvaluationException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final ConfigEvaluation evaluateCondition(StatsigUser statsigUser, SpecCondition specCondition) throws UnsupportedEvaluationException {
        Object unitID;
        String valueAsString;
        String string;
        String str;
        try {
            String field = specCondition.getField();
            if (field == null) {
                field = "";
            }
            try {
                String type = specCondition.getType();
                if (type == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String upperCase = type.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
                ConfigCondition configConditionValueOf = ConfigCondition.valueOf(upperCase);
                boolean booleanValue = true;
                switch (configConditionValueOf == null ? -1 : WhenMappings.$EnumSwitchMapping$0[configConditionValueOf.ordinal()]) {
                    case 1:
                        return new ConfigEvaluation(true, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                    case 2:
                    case 3:
                        Object targetValue = specCondition.getTargetValue();
                        if (targetValue != null && (string = targetValue.toString()) != null) {
                            str = string;
                        }
                        ConfigEvaluation configEvaluationEvaluateGate$android_sdk_release = evaluateGate$android_sdk_release(str, statsigUser);
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(configEvaluationEvaluateGate$android_sdk_release.getSecondaryExposures());
                        if (!StringsKt.startsWith$default(str, "segment:", false, 2, (Object) null)) {
                            arrayList.add(MapsKt.mapOf(TuplesKt.to("gate", str), TuplesKt.to("gateValue", String.valueOf(configEvaluationEvaluateGate$android_sdk_release.getBooleanValue())), TuplesKt.to("ruleID", configEvaluationEvaluateGate$android_sdk_release.getRuleID())));
                        }
                        if (configConditionValueOf != ConfigCondition.PASS_GATE) {
                            if (configEvaluationEvaluateGate$android_sdk_release.getBooleanValue()) {
                                booleanValue = false;
                            }
                            return new ConfigEvaluation(booleanValue, configEvaluationEvaluateGate$android_sdk_release.getJsonValue(), configEvaluationEvaluateGate$android_sdk_release.getReturnableValue(), "", "", arrayList, null, null, false, false, false, null, 4032, null);
                        }
                        booleanValue = configEvaluationEvaluateGate$android_sdk_release.getBooleanValue();
                        return new ConfigEvaluation(booleanValue, configEvaluationEvaluateGate$android_sdk_release.getJsonValue(), configEvaluationEvaluateGate$android_sdk_release.getReturnableValue(), "", "", arrayList, null, null, false, false, false, null, 4032, null);
                    case 4:
                    case 5:
                    case 6:
                        unitID = EvaluatorUtils.INSTANCE.getFromUser(statsigUser, field);
                        Unit unit = Unit.INSTANCE;
                        break;
                    case 7:
                        unitID = String.valueOf(System.currentTimeMillis());
                        Unit unit2 = Unit.INSTANCE;
                        break;
                    case 8:
                        unitID = EvaluatorUtils.INSTANCE.getFromEnvironment(statsigUser, field);
                        Unit unit3 = Unit.INSTANCE;
                        break;
                    case 9:
                        EvaluatorUtils evaluatorUtils = EvaluatorUtils.INSTANCE;
                        Map<String, Object> additionalValues = specCondition.getAdditionalValues();
                        String valueAsString2 = evaluatorUtils.getValueAsString(additionalValues != null ? additionalValues.get("salt") : null);
                        String unitID2 = EvaluatorUtils.INSTANCE.getUnitID(statsigUser, specCondition.getIdType());
                        unitID = ULong.m9148boximpl(UnsignedKt.m9334ulongRemaindereb3DHEI(m8731computeUserHashI7RO_PI(((Object) valueAsString2) + '.' + (unitID2 != null ? unitID2 : "")), 1000L));
                        Unit unit4 = Unit.INSTANCE;
                        break;
                    case 10:
                        unitID = EvaluatorUtils.INSTANCE.getUnitID(statsigUser, specCondition.getIdType());
                        Unit unit5 = Unit.INSTANCE;
                        break;
                    default:
                        Intrinsics.stringPlus("Unsupported evaluation condition: ", configConditionValueOf);
                        throw new UnsupportedEvaluationException(Intrinsics.stringPlus("Unsupported evaluation condition: ", configConditionValueOf));
                }
                String operator = specCondition.getOperator();
                if (operator != null) {
                    switch (operator.hashCode()) {
                        case -1691202285:
                            if (operator.equals("str_starts_with_any")) {
                                return new ConfigEvaluation(EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass11.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -1548092646:
                            if (operator.equals("str_contains_any")) {
                                return new ConfigEvaluation(EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass13.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -1392885889:
                            if (operator.equals("before")) {
                                return EvaluatorUtils.INSTANCE.compareDates(AnonymousClass15.INSTANCE, unitID, specCondition.getTargetValue());
                            }
                            break;
                        case -921508102:
                            if (operator.equals("any_case_sensitive")) {
                                return new ConfigEvaluation(EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass9.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -745843766:
                            if (operator.equals("str_contains_none")) {
                                return new ConfigEvaluation(!EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass14.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -670497421:
                            if (operator.equals("version_eq")) {
                                return new ConfigEvaluation(versionCompareHelper(unitID, specCondition.getTargetValue(), AnonymousClass5.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -670497356:
                            if (operator.equals("version_gt")) {
                                return new ConfigEvaluation(versionCompareHelper(unitID, specCondition.getTargetValue(), AnonymousClass1.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -670497201:
                            if (operator.equals("version_lt")) {
                                return new ConfigEvaluation(versionCompareHelper(unitID, specCondition.getTargetValue(), AnonymousClass3.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3244:
                            if (operator.equals("eq")) {
                                return new ConfigEvaluation(Intrinsics.areEqual(unitID, specCondition.getTargetValue()), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3309:
                            if (operator.equals("gt")) {
                                Double valueAsDouble = EvaluatorUtils.INSTANCE.getValueAsDouble(unitID);
                                Double valueAsDouble2 = EvaluatorUtils.INSTANCE.getValueAsDouble(specCondition.getTargetValue());
                                if (valueAsDouble != null && valueAsDouble2 != null) {
                                    if (valueAsDouble.doubleValue() <= valueAsDouble2.doubleValue()) {
                                        booleanValue = false;
                                    }
                                    return new ConfigEvaluation(booleanValue, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3464:
                            if (operator.equals("lt")) {
                                Double valueAsDouble3 = EvaluatorUtils.INSTANCE.getValueAsDouble(unitID);
                                Double valueAsDouble4 = EvaluatorUtils.INSTANCE.getValueAsDouble(specCondition.getTargetValue());
                                if (valueAsDouble3 != null && valueAsDouble4 != null) {
                                    if (valueAsDouble3.doubleValue() >= valueAsDouble4.doubleValue()) {
                                        booleanValue = false;
                                    }
                                    return new ConfigEvaluation(booleanValue, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3551:
                            if (operator.equals("on")) {
                                return EvaluatorUtils.INSTANCE.compareDates(new Function2<Date, Date, Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator.evaluateCondition.17
                                    AnonymousClass17() {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Boolean invoke(Date date, Date date2) {
                                        return Boolean.valueOf(invoke2(date, date2));
                                    }

                                    /* JADX INFO: renamed from: invoke */
                                    public final boolean invoke2(Date a2, Date b2) {
                                        Intrinsics.checkNotNullParameter(a2, "a");
                                        Intrinsics.checkNotNullParameter(b2, "b");
                                        Evaluator.this.calendarOne.setTime(a2);
                                        Evaluator.this.calendarTwo.setTime(b2);
                                        return Evaluator.this.calendarOne.get(1) == Evaluator.this.calendarTwo.get(1) && Evaluator.this.calendarOne.get(6) == Evaluator.this.calendarTwo.get(6);
                                    }
                                }, unitID, specCondition.getTargetValue());
                            }
                            break;
                        case 96748:
                            if (operator.equals(Languages.ANY)) {
                                return new ConfigEvaluation(EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass7.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 102680:
                            if (operator.equals("gte")) {
                                Double valueAsDouble5 = EvaluatorUtils.INSTANCE.getValueAsDouble(unitID);
                                Double valueAsDouble6 = EvaluatorUtils.INSTANCE.getValueAsDouble(specCondition.getTargetValue());
                                if (valueAsDouble5 != null && valueAsDouble6 != null) {
                                    if (valueAsDouble5.doubleValue() < valueAsDouble6.doubleValue()) {
                                        booleanValue = false;
                                    }
                                    return new ConfigEvaluation(booleanValue, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 107485:
                            if (operator.equals("lte")) {
                                Double valueAsDouble7 = EvaluatorUtils.INSTANCE.getValueAsDouble(unitID);
                                Double valueAsDouble8 = EvaluatorUtils.INSTANCE.getValueAsDouble(specCondition.getTargetValue());
                                if (valueAsDouble7 != null && valueAsDouble8 != null) {
                                    if (valueAsDouble7.doubleValue() > valueAsDouble8.doubleValue()) {
                                        booleanValue = false;
                                    }
                                    return new ConfigEvaluation(booleanValue, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 108954:
                            if (operator.equals("neq")) {
                                return new ConfigEvaluation(!Intrinsics.areEqual(unitID, specCondition.getTargetValue()), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3387192:
                            if (operator.equals("none")) {
                                return new ConfigEvaluation(!EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass8.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 92734940:
                            if (operator.equals("after")) {
                                return EvaluatorUtils.INSTANCE.compareDates(AnonymousClass16.INSTANCE, unitID, specCondition.getTargetValue());
                            }
                            break;
                        case 689418545:
                            if (operator.equals("version_gte")) {
                                return new ConfigEvaluation(versionCompareHelper(unitID, specCondition.getTargetValue(), AnonymousClass2.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 689423350:
                            if (operator.equals("version_lte")) {
                                return new ConfigEvaluation(versionCompareHelper(unitID, specCondition.getTargetValue(), AnonymousClass4.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 689424819:
                            if (operator.equals("version_neq")) {
                                return new ConfigEvaluation(versionCompareHelper(unitID, specCondition.getTargetValue(), AnonymousClass6.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 1222504494:
                            if (operator.equals("none_case_sensitive")) {
                                return new ConfigEvaluation(!EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass10.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 1496001829:
                            if (operator.equals("str_matches")) {
                                String valueAsString3 = EvaluatorUtils.INSTANCE.getValueAsString(specCondition.getTargetValue());
                                if (valueAsString3 != null && (valueAsString = EvaluatorUtils.INSTANCE.getValueAsString(unitID)) != null) {
                                    return new ConfigEvaluation(new Regex(valueAsString3).containsMatchIn(valueAsString), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 1662804684:
                            if (operator.equals("str_ends_with_any")) {
                                return new ConfigEvaluation(EvaluatorUtils.INSTANCE.matchStringInArray(unitID, specCondition.getTargetValue(), AnonymousClass12.INSTANCE), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                    }
                }
                throw new UnsupportedEvaluationException(Intrinsics.stringPlus("Unsupported evaluation conditon operator: ", specCondition.getOperator()));
            } catch (IllegalArgumentException unused) {
                throw new UnsupportedEvaluationException(Intrinsics.stringPlus("Unsupported condition: ", specCondition.getType()));
            }
        } catch (IllegalArgumentException unused2) {
            throw new UnsupportedEvaluationException("IllegalArgumentException when evaluate conditions");
        }
    }

    private final ConfigEvaluation evaluateDelegate(StatsigUser statsigUser, SpecRule specRule, ArrayList<Map<String, String>> arrayList) {
        Spec config;
        String configDelegate = specRule.getConfigDelegate();
        if (configDelegate == null || (config = this.store.getConfig(configDelegate)) == null) {
            return null;
        }
        ConfigEvaluation configEvaluationEvaluate = evaluate(statsigUser, config);
        ArrayList<Map<String, String>> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        arrayList.addAll(configEvaluationEvaluate.getSecondaryExposures());
        ConfigEvaluation configEvaluation = new ConfigEvaluation(configEvaluationEvaluate.getBooleanValue(), configEvaluationEvaluate.getJsonValue(), configEvaluationEvaluate.getReturnableValue(), configEvaluationEvaluate.getRuleID(), configEvaluationEvaluate.getGroupName(), arrayList, config.getExplicitParameters(), configDelegate, configEvaluationEvaluate.isExperimentGroup(), configEvaluationEvaluate.isActive(), false, null, 3072, null);
        configEvaluation.setUndelegatedSecondaryExposures(arrayList2);
        return configEvaluation;
    }

    private final boolean evaluatePassPercent(StatsigUser statsigUser, Spec spec, SpecRule specRule) {
        StringBuilder sbAppend = new StringBuilder().append(spec.getSalt()).append('.');
        String salt = specRule.getSalt();
        if (salt == null) {
            salt = specRule.getId();
        }
        StringBuilder sbAppend2 = sbAppend.append(salt).append('.');
        String unitID = EvaluatorUtils.INSTANCE.getUnitID(statsigUser, specRule.getIdType());
        if (unitID == null) {
            unitID = "";
        }
        return Long.compareUnsigned(UnsignedKt.m9334ulongRemaindereb3DHEI(m8731computeUserHashI7RO_PI(sbAppend2.append(unitID).toString()), 10000L), UnsignedKt.doubleToULong(specRule.getPassPercentage() * 100.0d)) < 0;
    }

    private final ConfigEvaluation evaluateRule(StatsigUser statsigUser, SpecRule specRule) throws UnsupportedEvaluationException {
        ArrayList arrayList = new ArrayList();
        Iterator<SpecCondition> it = specRule.getConditions().iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            ConfigEvaluation configEvaluationEvaluateCondition = evaluateCondition(statsigUser, it.next());
            if (!configEvaluationEvaluateCondition.getBooleanValue()) {
                z2 = false;
            }
            arrayList.addAll(configEvaluationEvaluateCondition.getSecondaryExposures());
        }
        return new ConfigEvaluation(z2, specRule.getReturnValue().getValue(), specRule.getReturnValue(), specRule.getId(), specRule.getGroupName(), arrayList, null, null, Intrinsics.areEqual((Object) specRule.isExperimentGroup(), (Object) true), false, false, null, 3776, null);
    }

    private final boolean versionCompareHelper(Object obj, Object obj2, Function2<? super String, ? super String, Boolean> function2) {
        String valueAsString = EvaluatorUtils.INSTANCE.getValueAsString(obj);
        String valueAsString2 = EvaluatorUtils.INSTANCE.getValueAsString(obj2);
        boolean zBooleanValue = false;
        if (valueAsString == null || valueAsString2 == null) {
            return false;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) valueAsString, Soundex.SILENT_MARKER, 0, false, 6, (Object) null);
        if (iIndexOf$default > 0) {
            valueAsString = valueAsString.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(valueAsString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) valueAsString2, Soundex.SILENT_MARKER, 0, false, 6, (Object) null);
        if (iIndexOf$default2 > 0) {
            valueAsString2 = valueAsString2.substring(0, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(valueAsString2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        try {
            zBooleanValue = function2.invoke(valueAsString, valueAsString2).booleanValue();
            return zBooleanValue;
        } catch (NumberFormatException unused) {
            return zBooleanValue;
        } catch (Exception e2) {
            Statsig.INSTANCE.getClient$android_sdk_release().getErrorBoundary$android_sdk_release().logException$android_sdk_release(e2, "versionCompareHelper");
            return zBooleanValue;
        }
    }

    public final ConfigEvaluation evaluateConfig$android_sdk_release(String name, StatsigUser user) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(user, "user");
        Spec config = this.store.getConfig(name);
        return config == null ? new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, true, null, 3071, null) : evaluate(user, config);
    }

    public final ConfigEvaluation evaluateGate$android_sdk_release(String name, StatsigUser user) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(user, "user");
        Spec gate = this.store.getGate(name);
        return gate == null ? new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, true, null, 3071, null) : evaluate(user, gate);
    }

    public final ConfigEvaluation evaluateLayer$android_sdk_release(String name, StatsigUser user) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(user, "user");
        Spec layer = this.store.getLayer(name);
        return layer == null ? new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, true, null, 3071, null) : evaluate(user, layer);
    }
}
