package com.swmansion.gesturehandler.core;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`Y2şs{J$c$\bCCU0}*ޛWN}gvJp\u000bKƤ\u000e\u0016\u0007s4I[ze\u0012\u001d7JoE7UoK9hҚ>\u000562*8\u007f\u000b\t\u001a@H\u0018v\u0001ES\f BHp@e\u0015M\u001b\u001a\u001a\u0006D#\u0017Ȧz/~6vk\u00169vc\u001eyF\\'w0+N\u001dJb)%v\u0010!;DE9-%\u0002\b\u07baV[M\t\b}K!\u0001'UHyweTp\u007fB4sa\u001b}\u000b&\u000b\"\u0002h\u001aHCSsKV\u000fV\u0003A{UJ\u00120\u001e'v?]\u001et&&3#\u0012\u001a@\u0019\ble\u0018z\u0010S]%H99]3f\u007f~\u0002\u0019\u0017=\n*%\u001eQ\u001e5!$n\u001c\u0007-\u001b\u0003\u0015\u00029_aUL^\n_>\u001c\u000f!f\u0010Q\u001c0u(u{Y<%NO[g@Qo\u0010r\\g%-'h\u001c\b`sX\"\u001d'g.\u0017*rD\u0013$\u001cTb\u0005D\u0011{I\u0005\u000b\f6+ \u000b\u007f\u0003!m\u001e\\~\u0001i\u0019j\u000e\u000e3Y~7\b\u00172\u000e _lbMQ\u0012!\u0012V\u0005DW<\u0011\u0006\tjP\u007f$Z\u000bUR6V\u0019(w*L~\u0010!\\WqJ\\r1at#y\u001b*RG\r\roZn\u0011-_I#1sTx\u0017\u001fh\\\u001f\u000f0\u000bW^\u0015`P>qYC:>Y2h:}Q\u0012EsHKu\u007f_L\u001b'>c\nT.\u001agb_A!-\u0017)`!sE\u0015\u0003s\u0007e\u0012U\f-\u007f\u001dY\u00010}\u0007\u0019\u0010r`3X]\u000b/\"%o#'\u0016\u0003\u0018y\u0010eAG,f\u0019\u0013VI! \nD\\Y\u0015\t/\u001e+\u0002\u001e-C5uc5U.wBLEik\u000b\b2\nb\u0015'#p40qO\bb\u007feb?F\u0004q~l*lx\u0011}`j&\u0019r\rB7KHo\r9pF\n#/,\u000474\u001b\u0012n_J\u0013u~b9\u0010.\u0002a\u0016\u0014\rbk\u0011\u0016yu+\u0006K\u000b\u001cz\u0013\u0018)\u00141\u001d1LA.\u0003ob7]6w&dY;\u0011\rl\r2^D<63\nT2\f\u001e9\u0018F\u000e,]2\u000b\u0006I\u0016&T'm\u0007P\u0013\u0002]d1*\u0007\u007f=>dx}C\u0013.^T]tb\ta>!\u001fzO\u0005gS6\u000bT\u000216\u001a\u0019\u000bs\u0006sO\u0010T\u001cI?l\u001a\u000f<<&'5BFC\u0002g\u001f\"\u000f0\rN\u0006j\\\u0003\u000f\u0014|Q|AY\u0003\tA&<8RS?]8\bb[]~{Ea2\u0001EcY\u000b\u001a){FIZ69;kajB/,[ae\u0016\bNHm\u0004=3j\u001e&f8zKB$\u0013.f\u0012\t\u0019QN\u000ftJE~\u00185 6}\n\nû\u001fȨ]k\u007f˺\u0011K9u\u001eZ[n\t\u000eslio\u0004\u00161p\u001a`\nt=T-\t-N\\\u001e7f\u0011ÑUޓ\\\u0011\bǴeB-C r9\u0012_c\u0017x\u001a]D\u0013;1{*\u00109\u000fatݜ!ݺy\u00042Ĕx!Ife>\u0013\u001a3֯NŃ\u0012^r۪5\u0019\u001a;,\u0015\u000fNn\u0015#4LsLo]A\u0002)k\u0013Wd\u0017\u0004KJT,\u0010^\u0016א9כ\u000fo0ϓa\u000fHd\r\u007fXE_ۅ\u0002\u05ff0-N§\u000e&5l<m\u0013\u000b|ɗQђF\b4ֶ^\u001d=nP lmpˤGǾ7A!ֆQ-F\u001b\b\u0007GKAܕ_К.\r\u0005ӕ%A\u007fHyR\u00149x<=)@?e\u0002S=Ek\\+\u001c\u0002kK-X\u0012`wk<OEI.y[A.\u0015}0zԙw¡\u0004E9\u05fazkjDns\u0006\t|Ĥ8˷H#O؝I\u007f\u0018,\u0002\u0018\"e2Ȩ6ф~\u0014!ܒĔ.u"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014M9Ly'U[[(k\\\u007f\u0013", "", "EqP=c,KD\u001d~\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "6`]1_,K@\u0019\u0001~l;\n\u001d", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014P,Pz5VYb\u0002", "DhTD66GT\u001d\u0001]^3\b\t<", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001^\u001a._!Et5\"\u0017xn5\u0016g6WY'NWN92", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dV\fF~nCk\u0006\u001c@{\u001a8V\r=kB-%ua<\u0003l+Uv4\u0011JX9\\\u001cT=\"!j\u001bN\u000e\t\u000eXH${17!\f:X\u000fO>g\n \u0016~x\u0003JR\u0019U}\u001f~\u000b+hTho\u0007GDAk)k\flfZDG$]b\u001d\u001bz.8\u0013|W\u0013\u0003_uvkQ\"]8+Imh\u001c\t`", "/bc6i(MW#\b^g+|\u001c", "", "/vP6g0GU{z\u0004]3|\u0016=", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "/vP6g0GU{z\u0004]3|\u0016=T{*\n", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "4h]6f/>R{z\u0004]3|\u0016=C\u0007(wI\u0011\"\u0005Er\u000e;\u0007,5X", "", "5dbAh9>6\u0015\bye,\n\u0017", "6`]1_0GUv\u0002vg.|v/m{3~J\u000e\u0017", "7r7.a+EW\"\u0001ih<z\f", ";h]6`<F/ \n}Z\r\u0007\u0016\u001er{9{M\u000f\u0013\u001e", "", "5dc\u001a\\5B[)\u0007Ve7\u007f\u0005\u0010o\r\u0017\t<\u0012\u0017$Uk\u0015", "u(5", "Adc\u001a\\5B[)\u0007Ve7\u007f\u0005\u0010o\r\u0017\t<\u0012\u0017$Uk\u0015", "uE\u0018#", ">qT=T9>R{z\u0004]3|\u0016=", "/bc6i(MS\u0002z\nb=|k+n~/{M\u000fw!T`\u0012<\t", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "/cS\u000ej(Bb\u001d\b|A(\u0006\b6e\r", "6`]1_,K", "1`]\u001fX*>W*~Zo,\u0006\u0018=", "1`]0X3\u001aZ ", "1kT.a<I/+z~m0\u0006\u000b\u0012a\t'\u0003@\u000e%", "1kT.a<I4\u001d\b~l/|\b\u0012a\t'\u0003@\u000e%", "2d[6i,K3*~\u0004m\u001b\u0007j/s\u000f8\t@c\u0013 Fv\u000eI", "And?V,\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "2d[6i,K3*~\u0004m\u001b\u0007j/s\u000f8\t@c\u0013 Fv\u000eI\u0005", "3uT;g", "3wc?T*M/\"|zl;\u0007\u0016\u0012a\t'\u0003@\u000e%", "1n^?W:", "", ">nX;g,K7\u0018", "3wc?T*M5\u0019\r\nn9|k+n~/{M\u000f", "DhTD:9Hc$", "5dc\u0015T5=Z\u0019\f\t?6\ny3e\u0012", "6`b\u001cg/>`{z\u0004]3|\u0016\u001eoq$\u007fOa!$", "7r0;l\u000f:\\\u0018\u0006zk\bz\u00183v\u007f", "7r29\\7IW\"\u0001", "7rE6X>\u001ab(zxa,{x8d\u007f5mM|\"\"G|", "7rE6X>(d\u0019\f{e6\u000f\r8gj$\t@\n&", ";`Z24*MW*~", "=m7.a+ES&l\nZ;|f2a\t*{", "<df g(MS", ">qTCF;:b\u0019", "=mC<h*A3*~\u0004m", "@dR<e+!O\"}\u0002^9`\n\u0018o\u000f\u0013\t@\u000f\u0017 V", "@dR<e+/W\u0019\u0011]Z5{\u0010/r\u000e\t\u0006Mk!\u001bP~\u000eI", "AbW2W<ESy\u0003\u0004b:\u007f\t.H{1zG\u0001$%%v\u000e8\u007f5@", "Ag^B_+\u001bSvz\u0004\\,\u0004\u0010/d\\<W>\u0010\u001b(GR\nEu,5f", "Ag^B_+\u001bSvz\u0004\\,\u0004\u0010/d\\<\\D\n\u001b%Jo\r\u001fr.4`}-", "BqP;f-H`!^\f^5\fw9V\u0004(\u000e\u001e\u000b!$F}", "BqP;f-H`!i\u0005b5\fw9V\u0004(\u000e\u001e\u000b!$F}", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", ">nX;g", "BqPCX9LS\u000b\u0003\na\u0017\u0007\r8t\u007f5[Q\u0001 &U", "Bqh\u000eV;Bd\u0015\u000ez", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GestureHandlerOrchestrator {
    private static final float DEFAULT_MIN_ALPHA_FOR_TRAVERSAL = 0.0f;
    private int activationIndex;
    private final ArrayList<GestureHandler<?>> awaitingHandlers;
    private final HashSet<Integer> awaitingHandlersTags;
    private boolean finishedHandlersCleanupScheduled;
    private final ArrayList<GestureHandler<?>> gestureHandlers;
    private final GestureHandlerRegistry handlerRegistry;
    private int handlingChangeSemaphore;
    private boolean isHandlingTouch;
    private float minimumAlphaForTraversal;
    private final ArrayList<GestureHandler<?>> preparedHandlers;
    private final ViewConfigurationHelper viewConfigHelper;
    private final ViewGroup wrapperView;
    public static final Companion Companion = new Companion(null);
    private static final PointF tempPoint = new PointF();
    private static final float[] matrixTransformCoords = new float[2];
    private static final Matrix inverseMatrix = new Matrix();
    private static final float[] tempCoords = new float[2];
    private static final Comparator<GestureHandler<?>> handlersComparator = new Comparator() { // from class: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return GestureHandlerOrchestrator.handlersComparator$lambda$13((GestureHandler) obj, (GestureHandler) obj2);
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\"B\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u000e<$a$yCQU\"Ԃ*\t]WogtLb\u000bQ\u0015\u000e\u0016~l4Ikxe\u0012\u00158JoM3UڎE9vt>\u0005&2(؇z\u001bЏJ*v\u000f7\u007fIKë\u00160Np\u0003p\u001bZ\u001d\u001a@\u0014n(\u000f-tk^6Nm\f?_+\u0011yZR7_6}{\u0012\rTo\u001b\u0005r6+nEe\u00193e\u001b\u0007\u0001n\u0006\u0003\b\u0010K\u0019\u0001'U9yweKp\u007fB\u0017[S\u001bs\u000b&\u000b\u0007\u0002d\u001a>CO\u0012c\u0017\u000ep\u0016\t\u0015%<2\u001c6/VHE\u001ev\b\u00144#w\u0004H^\u001dvF\u0010zg7E*F3sW)\u0003iai'~?\n\u001f%\"3\u0001t\"\nY>h#6l{a1WAkM\u0015\n\"S{!\tb0844U\u001eG{?FG)EzQ#OtHH\r\u0016\u0005%xh\u0002\u000b\u0003LN7\u0007\u0016e,9\u0010hZ|\u0005\u001aR\u0005\\:3e\u001c\u0003*.\f!7twj9U\u0014\\s\u0001i\u0019Y$\nu;t8qn\u001a\u0010.ޭ1ۋ9Qk߄2h\u0005\u0017WFr\u000bhjRS\u0012[\u000b-P6\u001fН\u0012ȑ\u007fDVۼc>Mw44Z8o¥\u0017Ƞ\u0007\u001eJˆM\u0015mb\u0001\u0010-]\nɷ\u0005Ȑ(t\u0011ɖ!h~y\u007fxw5Sʣ$έEQ=ӧva0sL|Q\u0013U͡\u0002ěkLOƂ̧\u001a\u001b"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014M9Ly'U[[(k\\\u007f{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "u(E", "\u0012D5\u000eH\u0013-M\u0001bcX\bcs\u0012Ay\te-z\u0006\u0004#`m)d\u0001\u001c", "", "6`]1_,Kav\t\u0003i(\n\u0005>o\r", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "7me2e:>;\u0015\u000e\bb?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", ";`c?\\?-`\u0015\b\t_6\n\u0011\ro\n5zN", "", "Bd\\=66H`\u0018\r", "Bd\\=C6B\\(", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "1`]\u001fh5,W!\u000f\u0002m(\u0006\t9u\u000e/\u0010", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "7r56a0LV\u0019}", "AsPAX", "", "7rC?T5LT#\f\u0003^+k\u0013?c\u0003\u0013\u0006D\n&zP`\u0012<\t", "F", "G", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Ag^B_+!O\"}\u0002^9Y\t\ra\t&{G\b\u0017\u0016$\u0004", "6`]1_,K", "=sW2e", "Ag^B_+!O\"}\u0002^9n\u00053t`2\t*\u0010\u001a\u0017T", "Ag^B_+!O\"}\u0002^9\u0004\t=sp,{R]\u0017\u0015Qw\u000e+\u000153\\l\u001cDo\u0016=", "DhTD", "1n^?W:", "BqP;f-H`!i\u0005b5\fw9C\u0003,\u0003?q\u001b\u0017YM\u0018F\u0004$C", "", ">`a2a;", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "=tc\u0019b*:Z\u0004\t~g;", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean canRunSimultaneously(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2) {
            return gestureHandler == gestureHandler2 || gestureHandler.shouldRecognizeSimultaneously(gestureHandler2) || gestureHandler2.shouldRecognizeSimultaneously(gestureHandler);
        }

        public final boolean isFinished(int i2) {
            return i2 == 3 || i2 == 1 || i2 == 5;
        }

        public final boolean isTransformedTouchPointInView(float f2, float f3, View view) {
            return 0.0f <= f2 && f2 <= ((float) view.getWidth()) && 0.0f <= f3 && f3 <= ((float) view.getHeight());
        }

        public final boolean shouldHandlerBeCancelledBy(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2) {
            if (!gestureHandler.hasCommonPointers(gestureHandler2) || canRunSimultaneously(gestureHandler, gestureHandler2)) {
                return false;
            }
            if (gestureHandler == gestureHandler2 || !(gestureHandler.isAwaiting() || gestureHandler.getState() == 4)) {
                return true;
            }
            return gestureHandler.shouldBeCancelledBy(gestureHandler2);
        }

        public final boolean shouldHandlerWaitForOther(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2) {
            return gestureHandler != gestureHandler2 && (gestureHandler.shouldWaitForHandlerFailure(gestureHandler2) || gestureHandler2.shouldRequireToWaitForFailure(gestureHandler));
        }

        public final boolean shouldHandlerlessViewBecomeTouchTarget(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && isTransformedTouchPointInView(fArr[0], fArr[1], view);
        }

        public final void transformPointToChildViewCoords(float f2, float f3, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f2 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f3 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = GestureHandlerOrchestrator.matrixTransformCoords;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(GestureHandlerOrchestrator.inverseMatrix);
                GestureHandlerOrchestrator.inverseMatrix.mapPoints(fArr);
                scrollX = fArr[0];
                scrollY = fArr[1];
            }
            pointF.set(scrollX, scrollY);
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventsConfig.values().length];
            try {
                iArr[PointerEventsConfig.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventsConfig.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventsConfig.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEventsConfig.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator$cleanupFinishedHandlers$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000ftjQ4TeN/\u0001Tp\u0017ө\u007f6*]2t"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "7me<^,", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012],C]JucN{?]nd\u0018U+\t\u000e/"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<GestureHandler<?>, Boolean> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(GestureHandler<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(GestureHandlerOrchestrator.Companion.isFinished(it.getState()) && !it.isAwaiting());
        }
    }

    public GestureHandlerOrchestrator(ViewGroup wrapperView, GestureHandlerRegistry handlerRegistry, ViewConfigurationHelper viewConfigHelper) {
        Intrinsics.checkNotNullParameter(wrapperView, "wrapperView");
        Intrinsics.checkNotNullParameter(handlerRegistry, "handlerRegistry");
        Intrinsics.checkNotNullParameter(viewConfigHelper, "viewConfigHelper");
        this.wrapperView = wrapperView;
        this.handlerRegistry = handlerRegistry;
        this.viewConfigHelper = viewConfigHelper;
        this.gestureHandlers = new ArrayList<>();
        this.awaitingHandlers = new ArrayList<>();
        this.preparedHandlers = new ArrayList<>();
        this.awaitingHandlersTags = new HashSet<>();
    }

    private final void addAwaitingHandler(GestureHandler<?> gestureHandler) {
        if (this.awaitingHandlers.contains(gestureHandler)) {
            return;
        }
        this.awaitingHandlers.add(gestureHandler);
        this.awaitingHandlersTags.add(Integer.valueOf(gestureHandler.getTag()));
        gestureHandler.setAwaiting(true);
        int i2 = this.activationIndex;
        this.activationIndex = i2 + 1;
        gestureHandler.setActivationIndex(i2);
    }

    private final boolean canReceiveEvents(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.minimumAlphaForTraversal;
    }

    private final void cancelAll() {
        Iterator it = CollectionsKt.reversed(this.awaitingHandlers).iterator();
        while (it.hasNext()) {
            ((GestureHandler) it.next()).cancel();
        }
        this.preparedHandlers.clear();
        this.preparedHandlers.addAll(this.gestureHandlers);
        Iterator it2 = CollectionsKt.reversed(this.gestureHandlers).iterator();
        while (it2.hasNext()) {
            ((GestureHandler) it2.next()).cancel();
        }
    }

    private final void cleanupAwaitingHandlers() {
        for (GestureHandler gestureHandler : CollectionsKt.toList(this.awaitingHandlers)) {
            if (!gestureHandler.isAwaiting()) {
                this.awaitingHandlers.remove(gestureHandler);
                this.awaitingHandlersTags.remove(Integer.valueOf(gestureHandler.getTag()));
            }
        }
    }

    private final void cleanupFinishedHandlers() {
        for (GestureHandler gestureHandler : CollectionsKt.asReversedMutable(this.gestureHandlers)) {
            if (Companion.isFinished(gestureHandler.getState()) && !gestureHandler.isAwaiting()) {
                gestureHandler.reset();
                gestureHandler.setActive(false);
                gestureHandler.setAwaiting(false);
                gestureHandler.setActivationIndex(Integer.MAX_VALUE);
            }
        }
        CollectionsKt.removeAll((List) this.gestureHandlers, (Function1) AnonymousClass2.INSTANCE);
        this.finishedHandlersCleanupScheduled = false;
    }

    private final void deliverEventToGestureHandler(GestureHandler<?> gestureHandler, MotionEvent motionEvent) {
        if (!isViewAttachedUnderWrapper(gestureHandler.getView())) {
            gestureHandler.cancel();
            return;
        }
        if (gestureHandler.wantEvents()) {
            int actionMasked = motionEvent.getActionMasked();
            View view = gestureHandler.getView();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Intrinsics.checkNotNullExpressionValue(motionEventObtain, "obtain(...)");
            MotionEvent motionEventTransformEventToViewCoords = transformEventToViewCoords(view, motionEventObtain);
            if (gestureHandler.getNeedsPointerData() && gestureHandler.getState() != 0) {
                gestureHandler.updatePointerData(motionEventTransformEventToViewCoords, motionEvent);
            }
            if (!gestureHandler.isAwaiting() || actionMasked != 2) {
                boolean z2 = gestureHandler.getState() == 0;
                gestureHandler.handle(motionEventTransformEventToViewCoords, motionEvent);
                if (gestureHandler.isActive()) {
                    if (gestureHandler.getShouldResetProgress()) {
                        gestureHandler.setShouldResetProgress(false);
                        gestureHandler.resetProgress();
                    }
                    gestureHandler.dispatchHandlerUpdate(motionEventTransformEventToViewCoords);
                }
                if (gestureHandler.getNeedsPointerData() && z2) {
                    gestureHandler.updatePointerData(motionEventTransformEventToViewCoords, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    gestureHandler.stopTrackingPointer(motionEventTransformEventToViewCoords.getPointerId(motionEventTransformEventToViewCoords.getActionIndex()));
                }
            }
            motionEventTransformEventToViewCoords.recycle();
        }
    }

    private final void deliverEventToGestureHandlers(MotionEvent motionEvent) {
        this.preparedHandlers.clear();
        this.preparedHandlers.addAll(this.gestureHandlers);
        CollectionsKt.sortWith(this.preparedHandlers, handlersComparator);
        for (GestureHandler<?> gestureHandler : this.preparedHandlers) {
            Intrinsics.checkNotNull(gestureHandler);
            deliverEventToGestureHandler(gestureHandler, motionEvent);
        }
    }

    private final boolean extractAncestorHandlers(View view, float[] fArr, int i2) {
        boolean z2 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList<GestureHandler<?>> handlersForView = this.handlerRegistry.getHandlersForView((View) parent);
                if (handlersForView != null) {
                    synchronized (handlersForView) {
                        for (GestureHandler<?> gestureHandler : handlersForView) {
                            if (gestureHandler.isEnabled() && gestureHandler.isWithinBounds(view, fArr[0], fArr[1])) {
                                Intrinsics.checkNotNull(gestureHandler);
                                recordHandlerIfNotPresent(gestureHandler, viewGroup);
                                gestureHandler.startTrackingPointer(i2);
                                z2 = true;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    continue;
                }
            }
        }
        return z2;
    }

    private final void extractGestureHandlers(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = tempCoords;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        traverseWithPointerEvents(this.wrapperView, fArr, pointerId, motionEvent);
        extractGestureHandlers(this.wrapperView, fArr, pointerId, motionEvent);
    }

    private final boolean extractGestureHandlers(ViewGroup viewGroup, float[] fArr, int i2, MotionEvent motionEvent) {
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childInDrawingOrderAtIndex = this.viewConfigHelper.getChildInDrawingOrderAtIndex(viewGroup, childCount);
            if (canReceiveEvents(childInDrawingOrderAtIndex)) {
                PointF pointF = tempPoint;
                Companion companion = Companion;
                companion.transformPointToChildViewCoords(fArr[0], fArr[1], viewGroup, childInDrawingOrderAtIndex, pointF);
                float f2 = fArr[0];
                float f3 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean zTraverseWithPointerEvents = (!isClipping(childInDrawingOrderAtIndex) || companion.isTransformedTouchPointInView(fArr[0], fArr[1], childInDrawingOrderAtIndex)) ? traverseWithPointerEvents(childInDrawingOrderAtIndex, fArr, i2, motionEvent) : false;
                fArr[0] = f2;
                fArr[1] = f3;
                if (zTraverseWithPointerEvents) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int handlersComparator$lambda$13(GestureHandler gestureHandler, GestureHandler gestureHandler2) {
        if ((gestureHandler.isActive() && gestureHandler2.isActive()) || (gestureHandler.isAwaiting() && gestureHandler2.isAwaiting())) {
            return Integer.signum(gestureHandler2.getActivationIndex() - gestureHandler.getActivationIndex());
        }
        if (gestureHandler.isActive()) {
            return -1;
        }
        if (!gestureHandler2.isActive()) {
            if (gestureHandler.isAwaiting()) {
                return -1;
            }
            if (!gestureHandler2.isAwaiting()) {
                return 0;
            }
        }
        return 1;
    }

    private final boolean hasOtherHandlerToWaitFor(GestureHandler<?> gestureHandler) {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            GestureHandler gestureHandler2 = (GestureHandler) it.next();
            Companion companion = Companion;
            if (!companion.isFinished(gestureHandler2.getState()) && companion.shouldHandlerWaitForOther(gestureHandler, gestureHandler2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isClipping(View view) {
        return !(view instanceof ViewGroup) || this.viewConfigHelper.isViewClippingChildren((ViewGroup) view);
    }

    private final boolean isViewAttachedUnderWrapper(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.wrapperView) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.wrapperView) {
            parent = parent.getParent();
        }
        return parent == this.wrapperView;
    }

    private final boolean isViewOverflowingParent(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = matrixTransformCoords;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void makeActive(GestureHandler<?> gestureHandler) {
        int state = gestureHandler.getState();
        gestureHandler.setAwaiting(false);
        gestureHandler.setActive(true);
        gestureHandler.setShouldResetProgress(true);
        int i2 = this.activationIndex;
        this.activationIndex = i2 + 1;
        gestureHandler.setActivationIndex(i2);
        for (GestureHandler gestureHandler2 : CollectionsKt.asReversedMutable(this.gestureHandlers)) {
            if (Companion.shouldHandlerBeCancelledBy(gestureHandler2, gestureHandler)) {
                gestureHandler2.cancel();
            }
        }
        for (GestureHandler gestureHandler3 : CollectionsKt.reversed(this.awaitingHandlers)) {
            if (Companion.shouldHandlerBeCancelledBy(gestureHandler3, gestureHandler)) {
                gestureHandler3.setAwaiting(false);
            }
        }
        cleanupAwaitingHandlers();
        if (state == 1 || state == 3) {
            return;
        }
        gestureHandler.dispatchStateChange(4, 2);
        if (state != 4) {
            gestureHandler.dispatchStateChange(5, 4);
            if (state != 5) {
                gestureHandler.dispatchStateChange(0, 5);
            }
        }
    }

    private final void recordHandlerIfNotPresent(GestureHandler<?> gestureHandler, View view) {
        if (this.gestureHandlers.contains(gestureHandler)) {
            return;
        }
        this.gestureHandlers.add(gestureHandler);
        gestureHandler.setActive(false);
        gestureHandler.setAwaiting(false);
        gestureHandler.setActivationIndex(Integer.MAX_VALUE);
        gestureHandler.prepare(view, this);
    }

    private final boolean recordViewHandlersForPointer(View view, float[] fArr, int i2, MotionEvent motionEvent) {
        boolean z2;
        ArrayList<GestureHandler<?>> handlersForView = this.handlerRegistry.getHandlersForView(view);
        if (handlersForView != null) {
            synchronized (handlersForView) {
                z2 = false;
                for (GestureHandler<?> gestureHandler : handlersForView) {
                    if (gestureHandler.isEnabled() && gestureHandler.isWithinBounds(view, fArr[0], fArr[1]) && (!CollectionsKt.listOf((Object[]) new Integer[]{10, 9, 7}).contains(Integer.valueOf(motionEvent.getAction())) || (gestureHandler instanceof HoverGestureHandler))) {
                        Intrinsics.checkNotNull(gestureHandler);
                        recordHandlerIfNotPresent(gestureHandler, view);
                        gestureHandler.startTrackingPointer(i2);
                        z2 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } else {
            z2 = false;
        }
        float width = view.getWidth();
        float f2 = fArr[0];
        if (0.0f <= f2 && f2 <= width) {
            float height = view.getHeight();
            float f3 = fArr[1];
            if (0.0f <= f3 && f3 <= height && isViewOverflowingParent(view) && extractAncestorHandlers(view, fArr, i2)) {
                return true;
            }
        }
        return z2;
    }

    private final void scheduleFinishedHandlersCleanup() {
        if (this.isHandlingTouch || this.handlingChangeSemaphore != 0) {
            this.finishedHandlersCleanupScheduled = true;
        } else {
            cleanupFinishedHandlers();
        }
    }

    private final boolean shouldBeCancelledByActiveHandler(GestureHandler<?> gestureHandler) {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        for (GestureHandler<?> gestureHandler2 : arrayList) {
            if (gestureHandler.hasCommonPointers(gestureHandler2) && gestureHandler2.getState() == 4 && !Companion.canRunSimultaneously(gestureHandler, gestureHandler2) && gestureHandler.isDescendantOf(gestureHandler2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean shouldBeCancelledByFinishedHandler(GestureHandler<?> gestureHandler) {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            GestureHandler gestureHandler2 = (GestureHandler) it.next();
            if (Companion.shouldHandlerWaitForOther(gestureHandler, gestureHandler2) && gestureHandler2.getState() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean traverseWithPointerEvents(View view, float[] fArr, int i2, MotionEvent motionEvent) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.viewConfigHelper.getPointerEventsConfigForView(view).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean zExtractGestureHandlers = view instanceof ViewGroup ? extractGestureHandlers((ViewGroup) view, fArr, i2, motionEvent) : false;
                    if (recordViewHandlersForPointer(view, fArr, i2, motionEvent) || zExtractGestureHandlers || Companion.shouldHandlerlessViewBecomeTouchTarget(view, fArr)) {
                        return true;
                    }
                } else {
                    if (view instanceof ViewGroup) {
                        boolean zExtractGestureHandlers2 = extractGestureHandlers((ViewGroup) view, fArr, i2, motionEvent);
                        if (!zExtractGestureHandlers2) {
                            return zExtractGestureHandlers2;
                        }
                        recordViewHandlersForPointer(view, fArr, i2, motionEvent);
                        return zExtractGestureHandlers2;
                    }
                    if (view instanceof EditText) {
                        return recordViewHandlersForPointer(view, fArr, i2, motionEvent);
                    }
                }
            } else if (recordViewHandlersForPointer(view, fArr, i2, motionEvent) || Companion.shouldHandlerlessViewBecomeTouchTarget(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    private final void tryActivate(GestureHandler<?> gestureHandler) {
        if (shouldBeCancelledByFinishedHandler(gestureHandler) || shouldBeCancelledByActiveHandler(gestureHandler)) {
            gestureHandler.cancel();
        } else if (hasOtherHandlerToWaitFor(gestureHandler)) {
            addAwaitingHandler(gestureHandler);
        } else {
            makeActive(gestureHandler);
            gestureHandler.setAwaiting(false);
        }
    }

    public final void activateNativeHandlersForView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList<GestureHandler<?>> handlersForView = this.handlerRegistry.getHandlersForView(view);
        if (handlersForView != null) {
            for (final GestureHandler<?> gestureHandler : handlersForView) {
                if (gestureHandler instanceof NativeViewGestureHandler) {
                    recordHandlerIfNotPresent(gestureHandler, view);
                    gestureHandler.withMarkedAsInBounds(new Function0<Unit>() { // from class: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator$activateNativeHandlersForView$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            gestureHandler.begin();
                            gestureHandler.activate();
                            gestureHandler.end();
                        }
                    });
                }
            }
        }
    }

    public final ArrayList<GestureHandler<?>> getHandlersForView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.handlerRegistry.getHandlersForView(view);
    }

    public final float getMinimumAlphaForTraversal() {
        return this.minimumAlphaForTraversal;
    }

    public final boolean isAnyHandlerActive() {
        ArrayList<GestureHandler<?>> arrayList = this.gestureHandlers;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (((GestureHandler) it.next()).getState() == 4) {
                return true;
            }
        }
        return false;
    }

    public final void onHandlerStateChange(GestureHandler<?> handler, int i2, int i3) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlingChangeSemaphore++;
        if (Companion.isFinished(i2)) {
            for (GestureHandler<?> gestureHandler : CollectionsKt.toList(this.awaitingHandlers)) {
                if (Companion.shouldHandlerWaitForOther(gestureHandler, handler) && this.awaitingHandlersTags.contains(Integer.valueOf(gestureHandler.getTag()))) {
                    if (i2 == 5) {
                        gestureHandler.cancel();
                        if (gestureHandler.getState() == 5) {
                            gestureHandler.dispatchStateChange(3, 2);
                        }
                        gestureHandler.setAwaiting(false);
                    } else {
                        tryActivate(gestureHandler);
                    }
                }
            }
            cleanupAwaitingHandlers();
        }
        if (i2 == 4) {
            tryActivate(handler);
        } else if (i3 == 4 || i3 == 5) {
            if (handler.isActive()) {
                handler.dispatchStateChange(i2, i3);
            } else if (i3 == 4 && (i2 == 3 || i2 == 1)) {
                handler.dispatchStateChange(i2, 2);
            }
        } else if (i3 != 0 || i2 != 3) {
            handler.dispatchStateChange(i2, i3);
        }
        this.handlingChangeSemaphore--;
        scheduleFinishedHandlersCleanup();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2 = 1
            r3.isHandlingTouch = r2
            int r1 = r4.getActionMasked()
            if (r1 == 0) goto L2d
            r0 = 3
            if (r1 == r0) goto L29
            r0 = 5
            if (r1 == r0) goto L2d
            r0 = 7
            if (r1 == r0) goto L2d
        L17:
            r3.deliverEventToGestureHandlers(r4)
            r0 = 0
            r3.isHandlingTouch = r0
            boolean r0 = r3.finishedHandlersCleanupScheduled
            if (r0 == 0) goto L28
            int r0 = r3.handlingChangeSemaphore
            if (r0 != 0) goto L28
            r3.cleanupFinishedHandlers()
        L28:
            return r2
        L29:
            r3.cancelAll()
            goto L17
        L2d:
            r3.extractGestureHandlers(r4)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMinimumAlphaForTraversal(float f2) {
        this.minimumAlphaForTraversal = f2;
    }

    public final MotionEvent transformEventToViewCoords(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view == null) {
            return event;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!Intrinsics.areEqual(viewGroup, this.wrapperView)) {
            transformEventToViewCoords(viewGroup, event);
        }
        if (viewGroup != null) {
            event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = inverseMatrix;
            matrix.invert(matrix2);
            event.transform(matrix2);
        }
        return event;
    }

    public final PointF transformPointToViewCoords(View view, PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (view == null) {
            return point;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!Intrinsics.areEqual(viewGroup, this.wrapperView)) {
            transformPointToViewCoords(viewGroup, point);
        }
        if (viewGroup != null) {
            point.x += viewGroup.getScrollX() - view.getLeft();
            point.y += viewGroup.getScrollY() - view.getTop();
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = inverseMatrix;
            matrix.invert(matrix2);
            float[] fArr = tempCoords;
            fArr[0] = point.x;
            fArr[1] = point.y;
            matrix2.mapPoints(fArr);
            point.x = fArr[0];
            point.y = fArr[1];
        }
        return point;
    }
}
