package com.google.firebase.logger;

import android.util.Log;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r+4ߚ\u007f\u0007|jA0JoP.`Y2\u000fq{<$i3yّCU(~*\tU[m\f\u0005Ϻx.s\u000f4\u00151lNly\u001e\u001e/\u00152RsM3eok:pxD\u000782P;\n\t\u000f\u001eBH>{ټGK\u001a\u0018xw~Kj\r{\u0017J\u0016\u0014Q8\u0001L]\u0018bD\\\u0005gJ5)\u0002yDd&\u000e/+b-Hj&;u\u0012&1@EK-'i\u00025i\"DƄCqK\u001d1A5<as\u0006H\t\u0004\".CO;^#.b\u0005_v$)AN\u0012b\u0017\u0013p/\t\u0016%<2 6+VAE\u001a\u0015\t>G\u0003\u0007kJ`\bdA\u0010|w5E$.HK;1e\u007f`k!T7\n\u001b% 9\u007f\u001d8\"Y\u05f8d\u0015)l@k?kX=v`:]K\u0007\u001cp\u0011\u0003Z\f6G\u000eE\u0014\u0013D\u0016SN\">kXy\u001d`D\u0016\t5dvf\u0002RvAR\u0003$KB\u0013\u001c`Jc\u0015mfS\u0007+?b<V\u001d|6\u0012Pd}</;(Peg\u0018\u0002\u0014bܦ)/tO\"\ty)o9\rEeUq)yR%\u0015oDh\u0005f|ZU\"Y\u000b?h7\u0011\"\u001e\u0014\u0014D|\u001eC6M\u000f44Z6I`#[\u001b\u001epB-\u0017mn\u0001\u001a\u000fZ9#\u0013k:s7\u007f~q!uu\u000fa.\u0013_PD\buڤ\u001d&c@1m\u000bB\u001f~\"\u0012wkZddlDz\u0006\u007f.)29\u007f0m#\u0015~7F\u001a7URxdaO(&){($kn<} l\u0007+\u000f\u0002\u0011Oݚ\u001b\"\u0005|;Z\u0016\u0005\u0018y\u0010X+Kqg#[lJ#\u0017gPfB\r\u000b%\u001d5\u0003\u0006!+4[XG\u001f,vB.Eici}D\u0012d%%#|J1І\u001aopi&LIXaY-PR(z\u001cZH\u0019x8J\u000f4\u001bI`Czo\u0005O\u0014\u0010w5t(D\r\u001fh\f>!\u0003\u00164\\`Z\bQ\u0012,hS+\u0017Lci\u0004ly[9_/\f!z_mB$C dmz\u000bF\u0005\"/|Fވf\u0005J!lN:] \u000bqf\u001a\n\u001e\u0014\u0018F\u000e\u0010G:HsIl&V\u000f[\u0005_Ke\u0016x/,\u0019~=6tִA̰\tyN\u07bcGe8\ba%)\u001dpX\rpuCRXQ\u001bV]WՑQزGU\nԍ\u001cI/xy{,:\u001e\n+Ph*GQ)_%1Ϳ\u000f[l̯|x\u0018u`^Ć-%"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-\r", "", "B`V", "", "3mP/_,=", "", ";h]\u0019X=>Z", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uT\u0016?MJ\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'~!\u001f\u0011q\u0018Fx,5#~$Dm\u0013*[C\u0005r> \u0017hn\u0003mm.Pv4\u00063N=\\YH\u0001\u0005", "5dc\u0012a(;Z\u0019}", "u(I", "Adc\u0012a(;Z\u0019}", "uY\u0018#", "5dc\u001a\\5%S*~\u0002", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`\u001eQq\u0010<\u0004n\u001cc\u007f\"7zT\u0015MT;r\n", "Adc\u001a\\5%S*~\u0002", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001e!Iq\u000eI@\f?[\u007f D,|.^CBAw\u000f", "5dc!T.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "2dQBZ", "", "4na:T;", "/qV@", "", "Bga<j(;Z\u0019", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044H7|0g\u001cdj;PR/[\u00019CIU,2\u0016V", ";rV", "3qa<e", "7mU<", ":nV", ":de2_", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001e!Iq\u000eI@\f?[\u007f D,|.^CBA\u001b#\u0011y]\u0003\u000e_5P@\u0015VYR5^(h$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u00020\u00077y|U\u001d\n>l:1Y\u001dQ\f\u0011rH)>\n=", ":nV\u0016Y\b;Z\u0019", "Dda/b:>", "E`a;", "\u000fmS?b0=:#\u0001|^9", "\u0011n\\=T5B]\"", "\u0014`Z2?6@U\u0019\f", "\u001ade2_", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Logger {
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;
    private Level minLevel;
    private final String tag;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r+4ߚ\u007f\u0007|jA0JeP.`Y2\u000fq|<$i3yCI٥\"Ԃ*\t]OogtJ`\u000bYƤ6\u0016'ilde|k\u0012'2ppO7[qU9\u000fwF\t.6:8(\nв\u001e*V\u0016?2QR$\u0012^H!>`\u0016e\u0005H\u00176B.\u000b6\\\u0016OfVzhR93\toA^)u/+Z;R\u0005-\u001b\u0005y A?eD[9٨\u0007\u0007`kϓ\u0007P"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uI\u001f-ZM?j\u001b(\u0017jaF\\", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-\r", "B`V", "", "3mP/_,=", "", ";h]\u0019X=>Z", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uT\u0016?MJ\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'~!\u001f\u0011q\u0018Fx,5#~$Dm\u0013*[C\u0005r> \u0017hn\u0003mm.Pv4\u00063N=\\YH\u0001\u0005", ":nV", "", ":de2_", "4na:T;", "/qV@", "", "", "Bga<j(;Z\u0019", "", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001e!Iq\u000eI@\f?[\u007f D,|.^CBA\u001b#\u0011y]\u0003\u000e_5P@\u0015VYR5^(h$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u00020\u00077y|U\u001d\n>l:1Y\u001dQ\f\u0011rH)>\n=", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class AndroidLogger extends Logger {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(String tag, boolean z2, Level minLevel) {
            super(tag, z2, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable th) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i2 == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, format, th) : Log.v(tag, format);
            }
            if (i2 == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, format, th) : Log.d(tag2, format);
            }
            if (i2 == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, format, th) : Log.i(tag3, format);
            }
            if (i2 == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, format, th) : Log.w(tag4, format);
            }
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String tag5 = getTag();
            return th != null ? Log.e(tag5, format, th) : Log.e(tag5, format);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4\u0012\u000e\u0007nj?1LeV7Zݷ2\u000f\u0002{<řc$\bCC٥ ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtkc}u\u0012=6rsM9eok<\u0011z<\u0005.9:8(\r1 0H\u001e\u007f\u0013Cy\u0016X5\t\u0013H]%M3&B\nL&\u0019\u001e\u000bj~<NlkAG#1qrT-_>\u0006e\rt^m\u0012Gy,,XCE\u00175S1\nb]O\u0003muk\u0007?Ѫ)ȅMs_̬ނ\u0004!"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uK 6X?Do>'j", "", "u(E", ":nV4X9L", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-\r", "5dc\u0019b.@S&", "B`V", "3mP/_,=", "", ";h]\u0019X=>Z", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uT\u0016?MJ\u0011", "AdcBc\r:Y\u0019e\u0005`.|\u0016", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uN\u00124M*Em6\u001e\">", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z2, Level level, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                z2 = true;
            }
            if ((i2 + 4) - (i2 | 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z2, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z2, Level level, int i2, Object obj) {
            if ((i2 + 2) - (2 | i2) != 0) {
                z2 = true;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z2, level);
        }

        @JvmStatic
        public final Logger getLogger(String tag, boolean z2, Level minLevel) {
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            AndroidLogger androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new AndroidLogger(tag, z2, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            Intrinsics.checkNotNullExpressionValue(androidLogger, "loggers.getOrPut(tag) { …tag, enabled, minLevel) }");
            return (Logger) androidLogger;
        }

        @JvmStatic
        public final FakeLogger setupFakeLogger(String tag, boolean z2, Level minLevel) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, z2, minLevel);
            Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r+4ߚ\u007f\u0007|jA0JeP.`r2şs{B$c$wECU0}*ޛWNumvJ`\fK\u000f\u0014%\u0001j:կ]ތe\u0012\u001d3JoE5StSʠ\u0011td\u0004`O(\u0600\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsJV\u001bQ\u001d\u001a@\u000b̧$\u0001,b0TDQ\u0005]h9i\b2P\\2w0+P=Jb3%v\u0010\u001fqE\u007fO#2k\u00035U\fO\u0011M\nI\u0015j7'YJ\u0004YFX.\u0017C:\u0016\u0012&*4l\u001dQ\u000f\u001dW/]ucP<-(~\n T\u0004<\u0007WV<A2p\u0018\u00149s\u0003UVO0tp\u0015+gD.=\u0002I*g3-eň?\u0019\\PD<\u001b8;\u0001\u001d\"\fX\u001cr-\u001b\u0003|\u00025_SUH|\u000b\nK{\u0018\tl\u00120\n/W\u0002Ez?DE:gaG:9m\u0018Gr\u007f=\u0005¾lSwm\u0019R0u.=:\u000b\u001cZre3s'ӼZ¯\u0015M$\u0381Ξ\u0002$"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uN\u00124M*Em6\u001e\">", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-\r", "B`V", "", "3mP/_,=", "", ";h]\u0019X=>Z", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uT\u0016?MJ\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'~!\u001f\u0011q\u0018Fx,5#~$Dm\u0013*[C\u0005r> \u0017hn\u0003mm.Pv4\u00063N=\\YH\u0001\u0005", "@dR<e+", "", "1kT.e\u0013HU\u0001~\tl(~\t=", "", "6`b\u0019b.&S'\rv`,", ";db@T.>", "6`b\u0019b.&S'\rv`,k\f+t", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ":nV", "", ":de2_", "4na:T;", "/qV@", "", "", "Bga<j(;Z\u0019", "", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001e!Iq\u000eI@\f?[\u007f D,|.^CBA\u001b#\u0011y]\u0003\u000e_5P@\u0015VYR5^(h$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u00020\u00077y|U\u001d\n>l:1Y\u001dQ\f\u0011rH)>\n=", "Bn;<Z\u0014>a'z|^", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001e!Iq\u000eI@\f?[\u007f D,|.^CBA\u001b#\u0011y]\u0003\u000e_5P@\u0015VYR5^(h$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u00020\u00077y|U\u001d\n>l:1Y\u001dQ\f\u0011rH)>\n@duX=\u000fi&m\u000e)\u000bkG>-\u0016G", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class FakeLogger extends Logger {
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(String tag, boolean z2, Level minLevel) {
            super(tag, z2, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String str, Object[] objArr, Throwable th) {
            String string;
            if (objArr.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            }
            return (th == null || (string = new StringBuilder().append(level).append(TokenParser.SP).append(str).append(TokenParser.SP).append(Log.getStackTraceString(th)).toString()) == null) ? level + TokenParser.SP + str : string;
        }

        public final void clearLogMessages() {
            this.record.clear();
        }

        public final boolean hasLogMessage(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.contains$default((CharSequence) it.next(), (CharSequence) message, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean hasLogMessageThat(Function1<? super String, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable th) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            String logMessage = toLogMessage(level, format, args, th);
            System.out.println((Object) ("Log: " + logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4I\u0005ӳ+(Մ7lz;@D\u0014߉\\Q\u00147\u0015k\f82[<qq<ڈ\u001e}0\u000b `ug\u0007J\t\f\u001aƥ\bȀ|p4կmzc\u0015\u001d6+oE86oC?It<\f\t2(@b\u0005\u0007#ݻL\u001a"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\b!\u0019Io\u001b\u0006]/7[}-uT\u0016?MJ\u0011", "", ">qX<e0Mg", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc\u001de0H`\u001d\u000e\u000f\u001d*\u0007\u0011)g\n2}G\u0001\u0011\u0018K|\u000e9r35S~$Dm\u0013*[C5i>&\u001drj", "u(8", "$DA\u000fB\u001a\u001e", "\u0012D1\":", "\u0017M5\u001c", "%@A\u001b", "\u0013QA\u001cE", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i2) {
            this.priority = i2;
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.priority;
        }
    }

    private Logger(String str, boolean z2, Level level) {
        this.tag = str;
        this.enabled = z2;
        this.minLevel = level;
    }

    public /* synthetic */ Logger(String str, boolean z2, Level level, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2, level);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    @JvmStatic
    public static final Logger getLogger(String str, boolean z2, Level level) {
        return Companion.getLogger(str, z2, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String str, Object[] objArr, Throwable th) {
        if (!this.enabled || (this.minLevel.getPriority$com_google_firebase_firebase_common() > level.getPriority$com_google_firebase_firebase_common() && !Log.isLoggable(this.tag, level.getPriority$com_google_firebase_firebase_common()))) {
            return 0;
        }
        return log(level, str, objArr, th);
    }

    static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i2 & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    @JvmStatic
    public static final FakeLogger setupFakeLogger(String str, boolean z2, Level level) {
        return Companion.setupFakeLogger(str, z2, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int debug(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    public final int debug(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, Level.DEBUG, msg, null, th, 4, null);
    }

    public final int debug(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    public final int debug(String format, Object[] args, Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(Level.DEBUG, format, args, th);
    }

    public final int error(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    public final int error(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, Level.ERROR, msg, null, th, 4, null);
    }

    public final int error(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    public final int error(String format, Object[] args, Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(Level.ERROR, format, args, th);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Level getMinLevel() {
        return this.minLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int info(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public final int info(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, Level.INFO, msg, null, th, 4, null);
    }

    public final int info(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    public final int info(String format, Object[] args, Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(Level.INFO, format, args, th);
    }

    public abstract int log(Level level, String str, Object[] objArr, Throwable th);

    public final void setEnabled(boolean z2) {
        this.enabled = z2;
    }

    public final void setMinLevel(Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.minLevel = level;
    }

    public final int verbose(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    public final int verbose(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, Level.VERBOSE, msg, null, th, 4, null);
    }

    public final int verbose(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    public final int verbose(String format, Object[] args, Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(Level.VERBOSE, format, args, th);
    }

    public final int warn(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    public final int warn(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, Level.WARN, msg, null, th, 4, null);
    }

    public final int warn(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    public final int warn(String format, Object[] args, Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(Level.WARN, format, args, th);
    }
}
