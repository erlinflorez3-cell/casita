package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0ZeP.XS2\u000f\u0002{<$a&yCQU\"}(\u000bWNunvϺb\u000bY\u000f\u000e\u0016\u000fj4Icތe\u0012%2JoE4SUSʠ\u0011td\u0004hH0G\u0012\u0005/\u001bZN\u0016v\tSc\f@A\u0007¨xň\u0011M\u0013,ZIL3\u0019\u001e#{n8NǍkN_'\u0011~ZNUu`\"[$^u-\f\u0007c.+nʺE\u001d5Y\u0013\tb[\u0006\u0017m\u000bM\tx)=*w\u000e\u0006Nݼ\u0004\u0014\u001bF\u0016լ\u001cę*\\\u0013m)Q5HgeaOT<\u0018|\u0002ȞJ\u0018>\n5]F-H|83A\f\u000btFO\u0012`R\u007f)ʨF\u001f5\u0006C-I\u001b-e\u0010T)RG}\u001b\fL=/\u0007Ĳ_T\u0014{[è\u0013ɐU1_\\\u000eX\\\nq=\u001c\u0005GĎ\u0004ò\b4_\u00025}\u001f1g=E_Q#Op8\u001d\u001bϰxߌ_åؾhQ͕D&\u0007\u0018=0\u0017\u0013+Zr\r\u0004P\u0003a\u0003ұOʵS͵ś\u0007\u0012ء`{T#+\u001a\\V9yxXu\nS;=Ƥ[ˇo\u0012o;d@C_Ԩ\u000faׯv#G?hەt\u0015A[\f`{0$8g\u0019\u000fȗ\u007fbÉ\u0010\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1ta?X5M3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "5dc\u0010h9KS\"\u000eZo,\u0006\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0019WGDz4+tyaB\u00169", "3wc2a+>R\b\t\u000b\\/g\u0005.d\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0012k;>\\\u0018~yM6\r\u00072P{'zD\n\u0019^0RUAs\u00123", "u(9", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "/vP6g\u0017HW\"\u000ezk\f\u000e\t8t", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjHq_:\\L\u000eMV]3`[<;\u001e\u001fd\u001e]/\u0016\u0005g\u000b\u0002xMF#\u0011<E\u0011?r\naYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "Ehc5G0FS#\u000f\n", "\"", "Bh\\2@0EZ\u001d\r", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001es =TGD52(\"rqH\u000bl,\\@\u0005QU]0ebnL\u0018\u001ccc\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "Ehc5G0FS#\u000f\nH9e\u00196l", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface AwaitPointerEventScope extends Density {
    Object awaitPointerEvent(PointerEventPass pointerEventPass, Continuation<? super PointerEvent> continuation);

    PointerEvent getCurrentEvent();

    /* JADX INFO: renamed from: getSize-YbymL2g */
    long mo5296getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default <T> Object withTimeout(long j2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return withTimeout$suspendImpl(this, j2, function2, continuation);
    }

    default <T> Object withTimeoutOrNull(long j2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return withTimeoutOrNull$suspendImpl(this, j2, function2, continuation);
    }

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public static int m5298roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return AwaitPointerEventScope.super.mo703roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public static int m5299roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return AwaitPointerEventScope.super.mo704roundToPx0680j_4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public static float m5300toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return AwaitPointerEventScope.super.mo705toDpGaN1DYA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m5301toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return AwaitPointerEventScope.super.mo706toDpu2uoSUM(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m5302toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i2) {
            return AwaitPointerEventScope.super.mo707toDpu2uoSUM(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public static long m5303toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return AwaitPointerEventScope.super.mo708toDpSizekrfVVM(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public static float m5304toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return AwaitPointerEventScope.super.mo709toPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public static float m5305toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return AwaitPointerEventScope.super.mo710toPx0680j_4(f2);
        }

        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public static long m5306toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return AwaitPointerEventScope.super.mo711toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public static long m5307toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return AwaitPointerEventScope.super.mo712toSp0xMU5do(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m5308toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return AwaitPointerEventScope.super.mo713toSpkPz2Gy4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m5309toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i2) {
            return AwaitPointerEventScope.super.mo714toSpkPz2Gy4(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
        public static long m5297getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo5295getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j2, function2, continuation);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
            return AwaitPointerEventScope.super.withTimeout(j2, function2, continuation);
        }
    }

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo5295getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m4015getZeroNHjbRc();
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }
}
