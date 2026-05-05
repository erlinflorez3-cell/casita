package com.facebook.systrace;

import androidx.tracing.Trace;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005%4\u0012\u0006\u0007nj?0LeV:Zݷ2\u000fy\u0002<$a%yCId\"}(\u0010WNupvJ`\u000bK\u000f\u001c\u0016\u0001j2O]xs\u0012\u00172HpEޓM\u0006މi`#5=\u001f[b=\u007f\u0005в\u001e*V\u0010?\u0019QR$\u0012^H!>`\u0016e\u0005H\u00146B.\u000b6\\\u0016YfLziR/Q\u00100G\u0017Mm7\u0015M;N\u0005+\u001b\u007fy\u001eYBg9#/k\u00035]\fC\u0011K\n=3uW+9W\fWdZF\u0019]A]\u001curTd5Un\u0015?+}e{T\u001c2\u0010z*\u0018\u0003\tV75WF-Hn8\u0012A}\u000bSnR2bP\n\u0013ad\"U\nA;Q!vSq;GYe\r5\u0011,5\u0019nOh\u001b\u0013\u05ce\u0019\u001bb\u000b\u001aR_TUH|\u0015\nG{\u0014\th\u0012,\u00140u\u000b]\rA2%7O[g0gkɘLDu\fM~vi\u0002RvHRr$@B\t:\\th\u0013uhT\u00077AQ*`\u001f}6 fa@Z/<(N}p\u001an[f\"%]hg]|u&Wgic9_o(a\u0001\u0004ZD\u0005\t\u0013o~B\u0002\u0014\u000b`6+JH\u0019\u0012(\u007fRX$\u0013`J\" B8I\u0019\u000b\"x\u0007,ZY|7a!mX\rbL<\u0003\u0018,%\r\u000fYtp\u001ei?Nt\u000bn<EA\u007fPI*c+\u00014+%M\u0004<\u0010U\u0004dGztF{c\u00198\u001808\u007fM\u0004\u0018W\u001d7Q\u001a-sT#i_V*')~*\u0013IrFg6u!0nvbO\u0003$h{'\u00111(|\u007f(iv~Ull\u000b\n@yv\u0011cTNf\b5#,1\u0019oP\n{2\fE+7\u0010\u0014]\u001d\u0012awxFy\u0011\u0011Vxs&DcDz\u0013UkUS8wfECjFz'ZH\u0019\u007f8F\u0017=%3vC\u0015vd]e\rE|\u0015\u0012\\\u0013~|s<)n,[tdr\u0004Q&,^q-ASa\u0005\u0006oa[9hU\u000f[\b?o*\u001ck\"-̷5ס4\u0006{̸\u0007MIe\u001d<7&\u000bɽ\u000fޭ\u000fC\\ȫV\u001c\t\u0004^_=\u0019\t\u0085FŌZ\u000e\\ۿ-bV\nxE\u000f#\u0001܇Qܓ7\u001e\u0001߶\u0002\u0011{Ll/\u00124WҼo͢\u001fjWƫݣ)U"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5/", "", "u(E", "\"Q0\u00108&-/zxg>\bZw)Aj\u0013i", "", "\"Q0\u00108&-/zxg>\bZw)Fl\bi\u001ej", "\"Q0\u00108&-/zxg>\bZw)J[\u0019W:]\u0004z&Qm", "\"Q0\u00108&-/zxg>\bZw)Jm\"l(ztr.V{", "\"Q0\u00108&-/zxg>\bZw)Vc\bm", "0dV6a\bLg\"|h^*\f\r9n", "", "B`V", "AdRA\\6G<\u0015\u0007z", "", "1n^8\\,", "", "AsP?g\u0015:\\#\r", "0dV6a\u001a>Q(\u0003\u0005g", "/qV@", "", "/qV@?,GU(\u0002", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q6g\u001c\u0013XkWCr.7#k/Dq\u001f0#'~\\", "1n]CX9M/&\u0001\tM6k\tBt", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q$D}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019", "3mS\u000ef@GQy\u0006\u0005p", "3mS\u000ef@GQ\u0007~xm0\u0007\u0012", "3mS\u001bT5Ha", "3mS X*MW#\b", "7rC?T*B\\\u001b", "", "@dV6f;>`\u007f\u0003\tm,\u0006\t<", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0006Tk\f<])Ch})7zk", "AsP?g\bLg\"|[e6\u000f", "AsT=4:R\\\u0017_\u0002h>", "BqP0X\nHc\"\u000ezk", "1nd;g,K<\u0015\u0007z", "1nd;g,KD\u0015\u0006\u000b^", "BqP0X\u0010Ga(z\u0004m", "Bhc9X", "Ab^=X", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5\u0018]17v%\u001cKMFk\n", "Cma2Z0Lb\u0019\fab:\f\t8e\r", "\u0013uT;g\u001a<]$~", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Systrace {
    public static final Systrace INSTANCE = new Systrace();
    public static final long TRACE_TAG_REACT_APPS = 0;
    public static final long TRACE_TAG_REACT_FRESCO = 0;
    public static final long TRACE_TAG_REACT_JAVA_BRIDGE = 0;
    public static final long TRACE_TAG_REACT_JS_VM_CALLS = 0;
    public static final long TRACE_TAG_REACT_VIEW = 0;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u00108\u000b4G\u0005ӳܧ\u0012\u000eј\u0017pI2Tev\u008c\u0001Rj\u001cq{D(i$\nCiV۟\u0002\"\u0017Q\u001fvunbZ9DǇ\n\u001c\u0001̓DK[{k\u0016w2Ht(3Su&9f{ȫ\t("}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5\u0018]17v%\u001cKMFk\n", "", "1nS2", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u001eD\b", "5dc\u0010b+>", "u(2", "\"GA\u00124\u000b", "\u001eQ>\u00108\u001a,", "\u0015K>\u000f4\u0013", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class EventScope extends Enum<EventScope> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventScope[] $VALUES;
        private final char code;
        public static final EventScope THREAD = new EventScope("THREAD", 0, 't');
        public static final EventScope PROCESS = new EventScope("PROCESS", 1, 'p');
        public static final EventScope GLOBAL = new EventScope("GLOBAL", 2, 'g');

        private static final /* synthetic */ EventScope[] $values() {
            return new EventScope[]{THREAD, PROCESS, GLOBAL};
        }

        static {
            EventScope[] eventScopeArr$values = $values();
            $VALUES = eventScopeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(eventScopeArr$values);
        }

        private EventScope(String str, int i2, char c2) {
            super(str, i2);
            this.code = c2;
        }

        public static EnumEntries<EventScope> getEntries() {
            return $ENTRIES;
        }

        public static EventScope valueOf(String str) {
            return (EventScope) Enum.valueOf(EventScope.class, str);
        }

        public static EventScope[] values() {
            return (EventScope[]) $VALUES.clone();
        }

        public final char getCode() {
            return this.code;
        }
    }

    private Systrace() {
    }

    @JvmStatic
    public static final void beginAsyncSection(long j2, String sectionName, int i2) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Trace.beginAsyncSection(sectionName, i2);
    }

    @JvmStatic
    public static final void beginAsyncSection(long j2, String sectionName, int i2, long j3) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        beginAsyncSection(j2, sectionName, i2);
    }

    @JvmStatic
    public static final void beginSection(long j2, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Trace.beginSection(sectionName);
    }

    @JvmStatic
    public static final void beginSection(long j2, String sectionName, String[] args, int i2) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Trace.beginSection(sectionName + "|" + INSTANCE.convertArgsToText(args, i2));
    }

    private final String convertArgsToText(String[] strArr, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 1; i3 < i2; i3 += 2) {
            String str = strArr[i3 - 1];
            String str2 = strArr[i3];
            sb.append(str);
            sb.append('=');
            sb.append(str2);
            if (i3 < i2 - 1) {
                sb.append(';');
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmStatic
    public static final void endAsyncFlow(long j2, String sectionName, int i2) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        endAsyncSection(j2, sectionName, i2);
    }

    @JvmStatic
    public static final void endAsyncSection(long j2, String sectionName, int i2) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Trace.endAsyncSection(sectionName, i2);
    }

    @JvmStatic
    public static final void endAsyncSection(long j2, String sectionName, int i2, long j3) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        endAsyncSection(j2, sectionName, i2);
    }

    @JvmStatic
    public static final void endSection(long j2) {
        Trace.endSection();
    }

    @JvmStatic
    public static final boolean isTracing(long j2) {
        return false;
    }

    @JvmStatic
    public static final void registerListener(TraceListener traceListener) {
    }

    @JvmStatic
    public static final void startAsyncFlow(long j2, String sectionName, int i2) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        beginAsyncSection(j2, sectionName, i2);
    }

    @JvmStatic
    public static final void stepAsyncFlow(long j2, String sectionName, int i2) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
    }

    @JvmStatic
    public static final void traceCounter(long j2, String counterName, int i2) {
        Intrinsics.checkNotNullParameter(counterName, "counterName");
        Trace.setCounter(counterName, i2);
    }

    @JvmStatic
    public static final void traceInstant(long j2, String str, EventScope eventScope) {
    }

    @JvmStatic
    public static final void unregisterListener(TraceListener traceListener) {
    }
}
