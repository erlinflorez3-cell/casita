package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0ReP.`ݷ2\u000f\u0002{<$a$yCIZ\"}(\tWN}gvϺb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00152JoU3UڎE9n}>ӌ(288\u0002\u0005\u0007 2H&v\u0003CQ\u000f*HN}RR;[5* \u0015V,\u0011 lg|AXnm:])1yZm5pH|{\u001bvd5\u001c\u000fm.-P7c 5U\u0013\u0007\u0001am\u0013\u0006vݘ\th59CʪreIp\u007fB)SO;q#*j\u001ai`:5[Sqah\u000eV\u000f+\u0002\u0013<\u0012&\u001e'vG]\"l\b\u001cM\rti?~\u001d\u000fH\u0006zoR/%.L[u!f_~SOT6\f\u0007\u001d\u001eQ\u0001~2kc<aڠ\u001f^}SAWF@XP\u0010_cq\u0014xr\b:\u0006@G.5*\u0016>\u001b59q8Q(\u001a\u0001ҩHg|\r\u0011%Yi`fXXt\u0015G,\u0019\f\tDt\u0016{_\u0003c¯\u0015W\"V\u0017\u0004\u000e\u00160^}BG1 V_nyl]]8+]kG]~m$Vgea4Ʉg\u0010gZ'\u001aE<p$pfplR_څ,\"@h\u0003,\u0006\u001d\\N:\u001eZ? \u001dd0?/t\u0015v\u001adB̿{ȁރ^j\u0016!bV<\u001fwE\r\t/[\u0005p\u001e\f)M:\u0013x\"[X\u00185ՠ%Şɋl6\u0003H\u0015\"\f\u0014U\u000edGz\u0011>u\u0004 f\u0016ؖ8֗ȠA\u0015\u0015&7Z\"qSɣ\u000b\u001cWL\")\u000b|(\u000fKy>v6kҔ0jpL_Z\u001d%\u0007`x).h\u0010\u0002qL\u000bIsT9alN\u0003\u0007i>d7+\fM\u001dݵ\u0005o(\u0005\fԉEے!\u0018\u007f\u0014=\u001e\u0002\"wyF0h\u000e6vu\u0004Zc&\u0001r`\f=֑<S_\u0001N(*o\u0013DNp\u001e\u0014R\u0011D\u0013CJQd\u001f\\fR\u001b3\u000eh\u001d+;w\u0005Zǈ\u0017o\u0004<\u0005ʁ,ϵG\u007f\u001c^Q.ݑMXopsјx9Iأ\u000e4"}, d2 = {"\u001cn>=B5\u001d`\u0015\u0001hm(\n\u0018/d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsP?g,=>#\r~m0\u0007\u0012", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "\u001cn>=B5\u001d`\u0015\u0001hm6\b\u0014/d", "", "Dd[<V0Mg", "\u0012qP4Z(;Z\u0019l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa'\u0016_;NL", "=m32_;:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@d\\2`)>`w\fv`.x\u00066em7wO\u0001", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pH@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~kzR_\u000fC\t\u0019\u007fJrjFgn\nTAS,\tq\ba\u001fX7A$\u0002\u0001\u0015*h&", "2qP4Z(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "3mP/_,=", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "=m3?T.,b\u0015\f\n^+", "=m3?T.,b#\n\u0006^+", "@de2e:>2\u001d\fz\\;\u0001\u00138", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001ct=\"!j\u001bN9Vcf=&p@4&\b\u001aX}JhVr\u0012\u00174wzFU#\u0011w\u001f}L3vF#`\u0004WJD^9h\u0016hf^:H3$~\u0019)2:;\u000e{\\ na}qp\u001d\u000ea4-=zeJD\u0003\u001f:~/*U\nw[3b\u00054s)\u001384?.\tTv\u0018KZv$0fJp\u000eFK\u000f<RcYuM\u000eu\u001b_\u0017\u0012l>\u001f#uraHd{D\u001deDhc\n\u0001W\u0017F\u0013p%0D\u000eFe\u0003#Rg4vcXG%]NoWJ,n\u0018\u0007\f0\u001d-6_>i\u0018f9cAV!RIH\u0015yhG\u001fy\u0016eb\u000fYW`n1@|\u0010\\j1UD\u0002\\QoY&8Jr\t\u001cwjFyCh", "Bn59b(M", "Bn59b(M\u001bff\u0003^\u0014M\u000f", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$:\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "Bn59b(M\u001b'_B\\s\fx", "BnE._0=D\u0019\u0006\u0005\\0\f\u001d", "BnE._0=D\u0019\u0006\u0005\\0\f\u001dvTbsWN\\a", "uI\u0018\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DraggableKt {
    private static final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);
    private static final Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);

    public static final DraggableState DraggableState(Function1<? super Float, Unit> function1) {
        return new DefaultDraggableState(function1);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -183245213, "C(rememberDraggableState)136@5869L29,137@5910L61:Draggable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i2, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i2 & 14);
        ComposerKt.sourceInformationMarkerStart(composer, 1306928152, "CC(remember):Draggable.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                    invoke(f2.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f2));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        DraggableState draggableState = (DraggableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return draggableState;
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4, int i2, Object obj) {
        Function3 function33 = function32;
        boolean z5 = z3;
        Function3 function34 = function3;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z6 = z2;
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z6 = true;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            mutableInteractionSource2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z5 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            function34 = NoOpOnDragStarted;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            function33 = NoOpOnDragStopped;
        }
        return draggable(modifier, draggableState, orientation, z6, mutableInteractionSource2, z5, function34, function33, (i2 & 128) == 0 ? z4 : false);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z4) {
        return modifier.then(new DraggableElement(draggableState, orientation, z2, mutableInteractionSource, z3, function3, function32, z4));
    }

    /* JADX INFO: renamed from: toFloat-3MmeM6k */
    public static final float m783toFloat3MmeM6k(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m3938getYimpl(j2) : Offset.m3937getXimpl(j2);
    }

    /* JADX INFO: renamed from: toFloat-sF-c-tU */
    public static final float m784toFloatsFctU(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m6876getYimpl(j2) : Velocity.m6875getXimpl(j2);
    }

    /* JADX INFO: renamed from: toValidVelocity-TH1AsA0 */
    public static final long m785toValidVelocityTH1AsA0(long j2) {
        return VelocityKt.Velocity(Float.isNaN(Velocity.m6875getXimpl(j2)) ? 0.0f : Velocity.m6875getXimpl(j2), Float.isNaN(Velocity.m6876getYimpl(j2)) ? 0.0f : Velocity.m6876getYimpl(j2));
    }
}
