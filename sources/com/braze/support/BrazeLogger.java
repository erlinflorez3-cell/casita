package com.braze.support;

import androidx.exifinterface.media.ExifInterface;
import bo.app.ad0;
import bo.app.ae;
import bo.app.be;
import bo.app.ce;
import bo.app.de;
import bo.app.ee;
import bo.app.fe;
import bo.app.ge;
import com.braze.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001e\u007f\u0007lnA0RnP.XY2\u000f\u0002{<$q$yCQU\"}(\nWNuhvϺb\u000bQ\u000f\u000e\u0016~n4Ikxe\u0012\u00158JoU3UoC?htL\u0005(2(@\u007fۖ\u00010ݒx\u0010%y{JJR5FpĐV\r[\u0005bL\u0014g8\u0001Lx\u0018RDl\u0005]h3S\toB\\?w0+b=NZ'\u001b!y A?eOE+Y\u0003\u0015}s?1J\"G\u0013\u0002?-;K\u0004Wd\\.@];]:urTx5Wf\f5Ygcy[T-@\u001d\n<T\u0004<\"WL<Q2f6\u0012cx\u0001\u0004XP0br\b\u0001aDA=\u0002I*g5-V*Y'\u007fO{3)N'\u000f\u00139[\u0003\u0012\u0011\u0019)\u0005\u0010Q_UpAVx\"Yk\bJu+\b86HG.KB\u0016v)3js9Q%\u001c\nVx\u007fz\u0015`nT\u0018\b\u000fEj\u0011$mB\t:vth\u0013\u0010hT\u00070AQ*\u0005\u001f}6\u0017Pd}</O(Peg\u0018\u0005\u0014bR+=\u001eOY\u001d\bT\\\u0002lAmic>}\u0003z\"xTb3Z-G\u001c.h\u0017@\"`d\u001b\u0014\u0006 \\N:\u0017bC\u007fLL,_\u001d\r\u001dN\u0003,lY~\u001f^\t\u0003V\u0004\u001dU2>\u0002$#%1Tj\u0015\bg'M\\\u0001nREA\u007f9I.[\"v^\u0015%\u001d}\"\u001a\u000el\u0015OZ).u\u0004\u007fH\u0016H8\u001aeK<'~WN*-sK#kWM ?\u0013|($kp4g\u0016\u0015\t.vixi\u0005\u001d(vl\u001e;\b\u0013\u000b*kT\u0014_id\rk>wv1\u0006\u0005VF0\u001d\u001fL))oP\u0001}?Qd5\u0016&\u0018W\u001dqayqDx\u0011\u000eT!,\u0004|o$pzQ\f4\u0012Ͳ\u001c˕\u0003>*غ=\u000fPK\u0003w6F_ͬ_άLAlݥ'D[\u0010G}\u0015\t\u0003ݻCÆ_:\u001b̊NF<eBsq\u007fjٲ\u0016Ѽ\u0015S[܊}oQc\u0019J_\u001c\u0019\u0004In@\u001e\u0014չ)͓f\u000f8ү\u0004\u001a<JIbUH\u0017.L,j\u0013a͒`Ɏ\n\u0010\u0003Ĕ\u0017k\u001d#JB\"F-\u0558`ܢ`VPγ1on.B\u0001-\u0011c\"\u0007BI\u0005\u001cH\u000b3\"vWҽ)͢\u001f|Wƫv'1Rb93*^\u0010\u0019U}EO\u0013D\u0016\u0018\u0015{~\bUH)\r,p-ê=[\u0017u\u00076d\"efTj\u001d*vc^1W\u0003Ҷ\u0001\u0018B \u001f\u0011\u001ff\u0003qh3rg\bJS+\u0017\u0016rCܰ\u0010\u0007i\\+3\fL=?Op:B\fYc;,$6\u001fU\u0018+%\u001b[dѦ\u0016ܤ\u001fL\u001eފ&d\b&!P8\u00064h\u0003\u0012*0\u000eV]#\u0004x!\u0001qJ\b2P6YpތFUn\u000f\u001airz~W\u0011\t\rUf\u000b~<~2Է+W4)h`@(c\"^\u0017&,%7/E6fЍ\u0014Yi~\u0001qUr\u001d-5qPzACb/\u0014\u001e(\u0010ą.^.+K\\SUt\u000bbrhr\u001e`z(\u0013\u0011\"(B Uĝjǚ\u0017@Nݱ6f5\\'E{\u000fM\b\u0015,٩Me"}, d2 = {"\u001ab^:\")KO.~Dl<\b\u00149r\u000fqXM|,\u0017.y\u0010>v2\u000b", "", "u(E", "\u0012DB\u0016E\f\u001dM\u0001ZmX\tid$Ey\u0017W\"z}v0Q|\u001f", "", "\u001aN6,?\f/3\u007fxeK\u0016gh\u001cTs\"d\u001chv", "", "\u001b@G,E\f&/|g^G\u000evo\u000fNa\u0017^:a\u0001\u0004AMt\u0018d\u0013/HY\u0002", "!T?\u001dE\f,A", "5dc H\u0017)@xlh\u001d(\u0006\u00129t{7\u007fJ\n%", "$DA\u000fB\u001a\u001e", "5dc#8\u0019\u001b=\u0007^9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "6`b\u0019b.%S*~\u0002;,|\u0012\u001de\u000f\t\u0006M\\\"\"4\u007f\u0017", "", "7rBFf;>[\u0004\f\u0005i\u0013\u0007\u000b\u0016e\u0011(\u0003.\u0001&", ":nV\u0019X=>Z", "5dc\u0019b.%S*~\u0002\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u0019b.%S*~\u0002", "u(8", "Adc\u0019b.%S*~\u0002", "uH\u0018#", "=m;<Z.>Rvz\u0002e)x\u00075", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001ab^:\")KO.~Dl<\b\u00149r\u000fqXM|,\u0017.y\u0010>v2sD\u000b$Az\u001a=a\u0019", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ">qX<e0Mg", ";db@T.>", "", "Bga<j(;Z\u0019", "", "5dc\u001ca\u0013HU\u001b~y<(\u0004\u0010,a}.:<\n !Vk\u001d@\u0001.C", "5dc\u001ca\u0013HU\u001b~y<(\u0004\u0010,a}.", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", "Adc\u001ca\u0013HU\u001b~y<(\u0004\u0010,a}.", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'Sc(", "AcZ\u0011X)NU\u001b~\b<(\u0004\u0010,a}.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "B`V", "5dc W2\u001dS\u0016\u000f|`,\nf+l\u0007%w>\u0007U\u0013Pn\u001bFz$/g|&1j\u0012<M=Hk;\u001e\u0011va", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bLu", "Adc W2\u001dS\u0016\u000f|`,\nf+l\u0007%w>\u0007U\u0013Pn\u001bFz$/g|&1j\u0012<M=Hk;\u001e\u0011va", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>(Sc(", "0qPGX3HU", "Bq", "AjX=F+D2\u0019{\u000b`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1gT0^\rH`\u0007\u0013\tm,\u0005o9gf(\r@\b\u0002$Qz\u000eI\u00069", "@dcBe5(\\w~wn.", ExifInterface.GPS_MEASUREMENT_2D, ";rV", ExifInterface.GPS_MEASUREMENT_3D, "3mP/_,/S&{\u0005l,c\u00131g\u00041}", "5dc\u000fe(SS\u007f\t|M(~", "1kP@f\rH`\bz|", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "7", "@db2g\rH`\b~\tm0\u0006\u000b", "Adc\u0016a0MW\u0015\u0006ah.c\t@e\u0007\t\tJ\tt!Pp\u0012>\u000721h\u0002*@", "7mXA\\(E:#\u0001a^=|\u0010", "D", ExifInterface.LONGITUDE_EAST, "0qPGX\u0013HU\bz|", "BnBAe0GU\u0007z{^", "\u001eqX<e0Mg", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeLogger {
    private static final int DESIRED_MAX_BRAZE_TAG_LENGTH = 80;
    private static final String LOG_LEVEL_PROPERTY_NAME = "log.tag.APPBOY";
    private static final int MAX_REMAINING_LENGTH_FOR_CLASS_TAG = 65;
    public static final int SUPPRESS = Integer.MAX_VALUE;
    public static final int VERBOSE = 2;
    private static boolean hasLogLevelBeenSetForAppRun = false;
    private static boolean isSystemPropLogLevelSet = false;
    private static Function3<? super Priority, ? super String, ? super Throwable, Unit> onLoggedCallback = null;
    private static Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> sdkDebuggerCallback = null;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4I\u0005Ӵ+(Մ7lz;@D\u0014߉\\Q\u00147\u0015k\f82[<qq<ڈ\u001e}0\u000b ]ug\u0007J\t\fß\u0013\f\u001eю\u0003.OX\u0007az\u000f8GX?9SX=?g]6\u000b(\u001b\">\u0003ڷ\u0005$"}, d2 = {"\u001ab^:\")KO.~Dl<\b\u00149r\u000fqXM|,\u0017.y\u0010>v2sD\u000b$Az\u001a=a\u0019", "", ":nV\u0019X=>Z", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc\u0019b.%S*~\u0002", "u(8", "\u0012", "\u0017", "\u0013", "$", "%", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Priority {
        D(3),
        I(4),
        E(6),
        V(2),
        W(5);

        private final int logLevel;

        Priority(int i2) {
            this.logLevel = i2;
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    private BrazeLogger() {
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, boolean z2, Function0 function0, int i2, Object obj2) {
        if ((1 & i2) != 0) {
            priority = Priority.D;
        }
        if ((2 & i2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        brazeLogger.brazelog(obj, priority, th, z2, (Function0<String>) function0);
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th, boolean z2, Function0 function0, int i2, Object obj) {
        if ((2 & i2) != 0) {
            priority = Priority.D;
        }
        if ((4 & i2) != 0) {
            th = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z2 = false;
        }
        brazeLogger.brazelog(str, priority, th, z2, (Function0<String>) function0);
    }

    @JvmStatic
    public static final void checkForSystemLogLevelProperty(boolean z2) {
        String line;
        Intrinsics.checkNotNullParameter(LOG_LEVEL_PROPERTY_NAME, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", LOG_LEVEL_PROPERTY_NAME}).getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "getRuntime()\n           …             .inputStream");
            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            line = (inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192)).readLine();
            Intrinsics.checkNotNullExpressionValue(line, "{\n            Runtime.ge…er().readLine()\n        }");
        } catch (Exception e2) {
            brazelog$default(INSTANCE, (Object) k.f2710a, Priority.E, (Throwable) e2, false, (Function0) ad0.f193a, 4, (Object) null);
            line = "";
        }
        if (StringsKt.equals("verbose", StringsKt.trim((CharSequence) line).toString(), true)) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.I, (Throwable) null, false, (Function0) new ae(line), 6, (Object) null);
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        checkForSystemLogLevelProperty(z2);
    }

    @JvmStatic
    public static final void d(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        d$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void d(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.D, th, false, (Function0) new be(msg), 8, (Object) null);
    }

    public static /* synthetic */ void d$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            th = null;
        }
        d(str, str2, th);
    }

    @JvmStatic
    public static final void e(String tag, String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        brazelog$default(INSTANCE, tag, Priority.D, tr, false, (Function0) new ce(msg), 8, (Object) null);
    }

    @JvmStatic
    public static final void enableVerboseLogging() {
        setLogLevel(2);
    }

    @JvmStatic
    public static final String getBrazeLogTag(Class<?> classForTag) {
        Intrinsics.checkNotNullParameter(classForTag, "classForTag");
        String fullClassName = classForTag.getName();
        int length = fullClassName.length();
        if (length <= 65) {
            Intrinsics.checkNotNullExpressionValue(fullClassName, "{\n            // No need…  fullClassName\n        }");
        } else {
            Intrinsics.checkNotNullExpressionValue(fullClassName, "fullClassName");
            fullClassName = fullClassName.substring(length - 65);
            Intrinsics.checkNotNullExpressionValue(fullClassName, "this as java.lang.String).substring(startIndex)");
        }
        return Constants.LOG_TAG_PREFIX + fullClassName;
    }

    public static final int getLogLevel() {
        return logLevel;
    }

    @JvmStatic
    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final Function3<Priority, String, Throwable, Unit> getOnLoggedCallback() {
        return onLoggedCallback;
    }

    @JvmStatic
    public static /* synthetic */ void getOnLoggedCallback$annotations() {
    }

    public static /* synthetic */ void getSUPPRESS$annotations() {
    }

    public static /* synthetic */ void getVERBOSE$annotations() {
    }

    @JvmStatic
    public static final void i(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        i$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void i(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.I, th, false, (Function0) new de(msg), 8, (Object) null);
    }

    public static /* synthetic */ void i$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            th = null;
        }
        i(str, str2, th);
    }

    @JvmStatic
    public static final void resetForTesting() {
        isSystemPropLogLevelSet = false;
        hasLogLevelBeenSetForAppRun = false;
        onLoggedCallback = null;
        sdkDebuggerCallback = null;
    }

    @JvmStatic
    public static final void setInitialLogLevelFromConfiguration(int i2) {
        if (hasLogLevelBeenSetForAppRun) {
            return;
        }
        setLogLevel(i2);
    }

    public static final void setLogLevel(int i2) {
        if (isSystemPropLogLevelSet) {
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.W, (Throwable) null, false, (Function0) new ee(i2), 6, (Object) null);
        } else {
            hasLogLevelBeenSetForAppRun = true;
            logLevel = i2;
        }
    }

    public static final void setOnLoggedCallback(Function3<? super Priority, ? super String, ? super Throwable, Unit> function3) {
        onLoggedCallback = function3;
    }

    public final String toStringSafe(Function0<? extends Object> function0) {
        try {
            return String.valueOf(function0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    public static final void v(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        v$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void v(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.V, th, false, (Function0) new fe(msg), 8, (Object) null);
    }

    public static /* synthetic */ void v$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        v(str, str2, th);
    }

    @JvmStatic
    public static final void w(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        w$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void w(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.W, th, false, (Function0) new ge(msg), 8, (Object) null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public final String brazeLogTag(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String fullClassName = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(fullClassName, "fullClassName");
        String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(fullClassName, Typography.dollar, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
        return strSubstringAfterLast$default.length() == 0 ? getBrazeLogTag(fullClassName) : getBrazeLogTag(strSubstringAfterLast$default);
    }

    public final void brazelog(Object obj, Priority priority, Throwable th, boolean z2, Function0<String> message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (logLevel <= priority.getLogLevel() || sdkDebuggerCallback != null) {
            brazelog(brazeLogTag(obj), priority, th, z2, message);
        }
    }

    public final void brazelog(String tag, Priority priority, Throwable th, boolean z2, Function0<String> message) {
        Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> function4;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        Lazy lazy = LazyKt.lazy(new b(message));
        Function3<? super Priority, ? super String, ? super Throwable, Unit> function3 = onLoggedCallback;
        if (function3 != null) {
            function3.invoke(priority, lazy.getValue(), th);
        }
        if (!z2 && (function4 = sdkDebuggerCallback) != null) {
            function4.invoke(tag, priority, lazy.getValue(), th);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i2 = a.f2698a[priority.ordinal()];
            if (i2 == 1) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i2 == 2) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i2 == 3) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i2 == 4) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i2 != 5) {
                return;
            }
            if (th == null) {
            }
        }
    }

    public final String getBrazeLogTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Constants.LOG_TAG_PREFIX + str;
    }

    public final Function4<String, Priority, String, Throwable, Unit> getSdkDebuggerCallback$android_sdk_base_release() {
        return sdkDebuggerCallback;
    }

    public final void setSdkDebuggerCallback$android_sdk_base_release(Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> function4) {
        sdkDebuggerCallback = function4;
    }
}
