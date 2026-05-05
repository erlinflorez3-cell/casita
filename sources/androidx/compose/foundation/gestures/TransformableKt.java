package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d̉=!,i\bDZc|İI\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007|jAӄLe^.ZS@\u000fs{:$c$\bCC٥\"}8\tWNmh\u0007\u0005hŏ[\u000f4\u0015!jZI\u0006|k\u0013'2pqo=[rU?pvF\u0005N7P<*\u0015\u000f BT x\u000bCy\u0014\"2PphT;TK܈PĂB \u000f't\"\\@`l\fEW#1trR5kH|{\u001avd5\u0013\u000fm.-P7c\u001d5U\u0013\u0007\u0001]m\nowC\u0005v5?+wu\b<^\u007f\"$CO;_9+t)_j$'YZ\fK~\u0019X{\t\b%<2\u001b6-N.;(~\b<5%xY@^\u0011vB.|ˑ:'"}, d2 = {"2dc2V;3]#\u0007", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", ">`]'b6F:#|\u0001", "", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui\u0019\u0018c5]L", "1`]\u001dT5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,2GYC\u001e!a\u0012W>V\u0003cN.~S;(\b:\u0013\u007f>d\n\u0015\u0016\u0015C4NER\u0019Py\u001cK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\\\H9\u007fqvN\u001d\u0004\u0002\"HzeVTs^<\u0003p|U\u0005\u0007\u0016;hp:x7\r\nm\u001di\u0001\\caEZ\u0002\u0017uF>,&4Kh", "BqP;f-H`!zwe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui5\u0004j,<\u0006#VL$", ":nR8E6MO(\u0003\u0005g\u0016\u0006}9o\b\u0013wI", "3mP/_,=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransformableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transformable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU|\u001c\f\u001a \u0014\u001e\"\u001e\u0013\u0015 \u001a\u0001+", f = "!>,8<.682%%.&m*2", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {JfifUtil.MARKER_SOI, JfifUtil.MARKER_SOS, 262}, m = "35E76H/EFE", n = {"\u0013jjOe\u001aFLJ?I>1I.3", "R^cT`[N", "RWp6Sd", "_Wp@aeO3E=Q", "aevGf_QU", "ieqS", "_Wp", "_WuZFeWJ>-R9G", "cewIZINVF", "[eeQWZ6V&;T$FI,", "\u0013jjOe\u001aFLJ?I>1I.3", "R^cT`[N", "RWp6Sd", "_Wp@aeO3E=Q", "aevGf_QU", "ieqS", "_Wp", "_WuZFeWJ>-R9G", "cewIZINVF", "[eeQWZ6V&;T$FI,", "\u0013jjOe\u001aFLJ?I>1I.3", "R^cT`[N", "RWp6Sd", "TlgTf", "_Wp@aeO3E=Q", "aevGf_QU", "ieqS", "_Wp", "_WuZFeWJ>-R9G", "cewIZINVF", "[eeQWZ6V&;T$FI,", "RWpIWbGK"}, s = {"xQ^", "xQ_", "xQ`", "\u0007Q^", "rQ^", "rQ_", "vQ^", "uQ^", "rQ`", "uQ_", "xQ^", "xQ_", "xQ`", "\u0007Q^", "rQ^", "rQ_", "vQ^", "uQ^", "rQ`", "uQ_", "xQ^", "xQ_", "xQ`", "xQa", "\u0007Q^", "rQ^", "rQ_", "vQ^", "uQ^", "rQ`", "uQ_", "uQ`"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return TransformableKt.detectZoom(null, false, null, null, this);
        }
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = false;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z3 = true;
        }
        return transformable(modifier, transformableState, z2, z3);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z2, boolean z3) {
        return transformable(modifier, transformableState, new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                return m848invokek4lQ0M(offset.m3947unboximpl());
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m848invokek4lQ0M(long j2) {
                return true;
            }
        }, z2, z3);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function1 function1, boolean z2, boolean z3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z3 = true;
        }
        return transformable(modifier, transformableState, function1, z2, z3);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z2, boolean z3) {
        return modifier.then(new TransformableElement(transformableState, function1, z2, z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r11 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Path cross not found for [B:51:0x0174, B:47:0x0158], limit reached: 105 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0239 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cc A[EDGE_INSN: B:99:0x00cc->B:32:0x00cc BREAK  A[LOOP:0: B:14:0x006a->B:31:0x00c9], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x023a -> B:13:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r25, boolean r26, kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r27, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> r28, kotlin.coroutines.Continuation<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlinx.coroutines.channels.Channel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
