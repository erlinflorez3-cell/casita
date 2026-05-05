package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!,u\bDJf|\u0004O\u000f8\u000b4I\u0007\"B\u0012\u007f\u0007lkA0ReP.XS2\u000f\u0002{<řs*\u007fUSUH\u0011hޛgcu{\u0007J\t\u001es\u0019\u0014+\u0011p<Kex\f\u0017=H\tĥESY}މQ`#5[ښ\u0005ŕ<y\rЏ:6V\u0010\u000fzqJb۶\u0003Ϯt:Z҈m\u0011(\u0013\u001e>N\u007ftո:ߑ:HtҗZ;1\u0005\u0002B|&6ܥO֔\u0011F\\܋-\u0003o!C@e4kǳ&Ϋ\u000bRcΪ#Q\u007fA\u001dhU,\u0002ɟuɱ:^\bϬ--U\u0013kyFn\u0013Yx\fU0&ҫMח\u0012.\u007f\u07be\u0014\u000fB\r\u001c\rGb<72f6\u0013iοIԡBг\u0006jJȕ\u000bc<\"3\fK-?(tX\u0002M'\\O{3\u001ctŁ\u0003ͼ%a\\וx\u0017!d\u0006bšUW"}, d2 = {"\u0012D1\":&)@\u0003iZK\u001bp\u0003\u0018Ag\b", "", "!S0\u0010>\u001b+/v^tK\fZr El\u001cu+m\u0001\u0002'\\|0p\u000e\u0011A]", "\u0012D1\":&)@\u0003iZK\u001bp\u0003 Af\u0018[:\\\u0007\u00061", "\u0012D1\":&)@\u0003iZK\u001bp\u0003 Af\u0018[:j\u007f", "\u0012D1\":&)@\u0003iZK\u001bp\u0003 Af\u0018[:jww", "\u000fRB\u0012E\u001b\"=\u0002lt>\u0015Xe\u0016E^", "", "5dc\u000eF\u001a\u001e@\bbdG\u001avh\u0018A\\\u000f[\u001f", "u(I", "\u0012D1\":", "5dc\u00118\t.5", " D2\u001cI\f+M\u0007mV<\u0012vw\u001cA]\bi", "5dc\u001f8\n(DxktL\u001bXf\u0015_n\u0015W\u001e`\u0005UCx\u0017F\u0006!D]\b)E", "u(E", "5dc\u001f8\n(DxktL\u001bXf\u0015_n\u0015W\u001e`\u0005", "\u0011NA\u001cH\u001b\"<xx^=", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5T 7O\u0019", "5dc\u0010B\u0019(C\bbc>&`g", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u0015WL=A", "@db2g\nH`#\u000f\nb5|l.", "", "/rb2e;", "D`[BX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DebugKt {
    private static final boolean ASSERTIONS_ENABLED = false;
    private static final AtomicLong COROUTINE_ID;
    private static final boolean DEBUG;
    public static final String DEBUG_PROPERTY_NAME = "kotlinx.coroutines.debug";
    public static final String DEBUG_PROPERTY_VALUE_AUTO = "auto";
    public static final String DEBUG_PROPERTY_VALUE_OFF = "off";
    public static final String DEBUG_PROPERTY_VALUE_ON = "on";
    private static final boolean RECOVER_STACK_TRACES;
    public static final String STACKTRACE_RECOVERY_PROPERTY_NAME = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0053, code lost:
    
        if (r3.equals("") != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005c, code lost:
    
        if (r3.equals("on") != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005e, code lost:
    
        r0 = true;
     */
    static {
        /*
            java.lang.Class<kotlinx.coroutines.CoroutineId> r0 = kotlinx.coroutines.CoroutineId.class
            r4 = 0
            kotlinx.coroutines.DebugKt.ASSERTIONS_ENABLED = r4
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r3 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0)
            r1 = 1
            if (r3 == 0) goto L2a
            int r2 = r3.hashCode()
            if (r2 == 0) goto L4d
            r0 = 3551(0xddf, float:4.976E-42)
            if (r2 == r0) goto L56
            r0 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 == r0) goto L44
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r2 != r0) goto L60
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L60
        L2a:
            r0 = r4
        L2b:
            kotlinx.coroutines.DebugKt.DEBUG = r0
            if (r0 == 0) goto L38
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1)
            if (r0 == 0) goto L38
            r4 = r1
        L38:
            kotlinx.coroutines.DebugKt.RECOVER_STACK_TRACES = r4
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r2.<init>(r0)
            kotlinx.coroutines.DebugKt.COROUTINE_ID = r2
            return
        L44:
            java.lang.String r0 = "off"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L60
            goto L2a
        L4d:
            java.lang.String r0 = ""
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L60
            goto L5e
        L56:
            java.lang.String r0 = "on"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L60
        L5e:
            r0 = r1
            goto L2b
        L60:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r3)
            r0 = 39
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DebugKt.<clinit>():void");
    }

    /* JADX INFO: renamed from: assert */
    private static final void m10471assert(Function0<Boolean> function0) {
        if (getASSERTIONS_ENABLED() && !function0.invoke().booleanValue()) {
            throw new AssertionError();
        }
    }

    public static final boolean getASSERTIONS_ENABLED() {
        return ASSERTIONS_ENABLED;
    }

    public static final AtomicLong getCOROUTINE_ID() {
        return COROUTINE_ID;
    }

    public static final boolean getDEBUG() {
        return DEBUG;
    }

    public static final boolean getRECOVER_STACK_TRACES() {
        return RECOVER_STACK_TRACES;
    }

    public static /* synthetic */ void getRECOVER_STACK_TRACES$annotations() {
    }

    public static final void resetCoroutineId() {
        COROUTINE_ID.set(0L);
    }
}
