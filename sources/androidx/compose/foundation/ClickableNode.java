package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tsAӄLeV:Zݷ2\u000f\u0002{<řc$\bCCU(}*\tUPog\u0005Jb\u000bI\u000f\f$\u000f̓\\I\u0004w\u001eS\u001f8PoW5cnk:pzD\u00078487(\b\u0011\u001e8L(v)H[\u0012 6XrPQ;T\u0015  \u000eV\"\u0017\u001d\u000bp^@Vvu@?%\u0013ipZUj݁\u0001M\u001bS\u001dq\u001b\u0005y\u001eYLg;#%k\u0005\u001dQ\n@3E\u007f?\u001dj=&YL$[D\\\u0018\u0014C0\u007f\u0013kx>^\u001bP\u000f\u0013W1]kcR$'&\u0004,\u0017J\u000e&\f7J>-Hr6\u0019\u008fsɁՂDP\bm\u000b\u0010\tqN\u0017S\f[+g,-϶ ޅ\u001dNE\u000e˟\r#+\u0004tıw\u0003\rה\u0019."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0003<]{&3j\u001d.6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00012g\r-3k%\fTG9q0\u001b\u001chJC\u0006c\u0002", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "7mS6V(MW#\bch+|i+c\u000f2\tT", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V,Ej4~\u0011fpC\u0014w\u0002", "3mP/_,=", "", "=m29\\*D:\u0015{ze", "", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001c.$d^@\u0007G5]v4CJ]0f[`G$\u001fX\u000e$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u0017\u0018Eso>e\u0014Q\u0003^YJ(lDUn}QJ.l)dl[\u001bkDG8if\u007f da*S\u0003O\u001at\u001cgvtK\"|\u000e\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0005/>;\u0004<&?s\tIua+h\u007f\u0015\u0002CG15=@\u001c\tPt}6?\u001eq\u001dp\f\u0018kCzyunaW\u0013\u0011fa1\u001cgi\u0010>V\u000f\bN\u0001\u001dpJ\bQ[\u0007\u001e\u0005\u000emLeJ?+[\u0010wzM0n\u001e\u0013\u0001u\")\u0016\u0012J_\u000fu\u007f#(", "CoS.g,", "CoS.g,\u0006?.se_1\u0003", "1kX0^\u0017HW\"\u000ezk\u0010\u0006\u0014?t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmLN@.\f5Y}Jl\u000b\u0015kQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable = 0;

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return clickPointerInput$suspendImpl(this, pointerInputScope, continuation);
    }

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0<Unit> function0) {
        super(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableNode$clickPointerInput$3 */
    /* JADX INFO: compiled from: Clickable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<Offset, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m616invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m616invokek4lQ0M(long j2) {
            if (ClickableNode.this.getEnabled()) {
                ClickableNode.this.getOnClick().invoke();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableNode$clickPointerInput$2 */
    /* JADX INFO: compiled from: Clickable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bDZc|İI\u0006F\u000b<Ȑ\u0017\"Z\u0011 \u0007\u0015ji4Rf`.\u0001UpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w8P;yB\u007f\u0015vpI\u0014c\u001aL\u00012G\"", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLb\r\u000b\u0006\u000f\u0006\b\u0013\rv\u0019\u000f\u0011P\u0011\u001b\u0019\u0014\u001d\u0003#\u001e$+\u001d+\u0003),22bq", f = "\u001084-4))2*q.6", i = {}, l = {636}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m615invoked4ec7I(pressGestureScope, offset.m3947unboximpl(), continuation);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I */
        public final Object m615invoked4ec7I(PressGestureScope pressGestureScope, long j2, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = ClickableNode.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = pressGestureScope;
            anonymousClass2.J$0 = j2;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j2 = this.J$0;
                if (ClickableNode.this.getEnabled()) {
                    this.label = 1;
                    if (ClickableNode.this.m544handlePressInteractiond4ec7I(pressGestureScope, j2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ Object clickPointerInput$suspendImpl(ClickableNode clickableNode, PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, clickableNode.new AnonymousClass2(null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.ClickableNode.clickPointerInput.3
            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m616invokek4lQ0M(offset.m3947unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M */
            public final void m616invokek4lQ0M(long j2) {
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode.this.getOnClick().invoke();
                }
            }
        }, continuation);
        return objDetectTapAndPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: update-QzZPfjk */
    public final void m614updateQzZPfjk(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0<Unit> function0) {
        m548updateCommonQzZPfjk(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }
}
