package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{J$c$\u007fCCU0}*\tUNog|SbŏK\u000f\u0014\u001b\u0001̓4Ikxe܈\u00172XoG\u074cUoS9htL\u0005(2(9\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00186FpPĥ=M3\u0019B\u0006l ARlk\\7`l\f<?'\u0011lZNUc@\u0001[\u0012^TU\u0013\u0007v,2XHE\u00175S1\u0010b]O\u0003m{k\rص+'1Tָ[6f\f\\I9\\%]!4\r\t_o$'Y_\u0014O^\u001f@w)\u000e=@\u0012!\u001e'vB]\"t\u001d&7#\t<@/\u0019%Bʎyʨي\u001b'\u0006K9Rcp_{S\u0019|A$\u0005;9i\u00157?ip&`C)|w\u007fN\u0002DKff\n\bQ\u001e\f~w\u001a.2F0\u007f\u000e\u0013W._CEzQ#Oy*Hr\u0005'\tn\tki\u0001\\p*|+O.7\"CDC\u001c2P\u001dv:2e\u001c\u0003\u0015&\bA=\r{JC=\u0010|c\u0019qxbu\u000eSEO78\u00062\u000e WlVMQ\u0012\u001e\nR%1o@p)pfpg<bj=:6v\u0001xwZ[\u0015\fc>Mt44Z5o¥\u0017Ƞ\u0007\u001eJˆM\u0015m_\u0001\u0010-Z\nɷ\u0005Ȑ(t\u0011ɖ!h~p\u007fxw.Sʣ$έEQ=ӧĢU'p7\u0003ɟ#-rûK\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0004BU\u0010\u0002>w(\u0018^CHy2+\u001foh!\u0011b0Oz'T\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9lIr7\u001dc|$8q\u0016;#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z47rD\u001exqbC\\", "=uT?f*K] \u0006Z_-|\u0007>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;lu-OC\u001bl5\u001e\u0013wKJ\u0007p:L\u00041NS.-]RpLi", "3cV28-?S\u0017\u000elk(\b\u0014/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00054[}\u007f8n\u0016,\\5Hg?)\u0015u7", "=uT?f*K] \u0006Xh5}\r1", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u000fFY\u000b.5z 5T!Et5\"\u0017xn5\u0016g6WL", "7mb=X*M]&b\u0004_6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u0011b|-Aq\u0015\u000eLE;K5\u001f\u0015fp#\u0018c9\\t4QSU\f]Sr;#gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005i\u000b\u001c\u001f\r1ytL_Y'x\u0017u!*iFWnkT=Pm*qaF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<S\u0004wpF\u0015\n<.G7EWE|c:\u00021&RY\u0002\u001b3\\v;\u0002)\u001384?:kQq'Eb\u0002^1mIp'FE\u0011NOm~z\bnx(_\u0017\u0012l>|n)V", "2qPDJ0MV\u0006\t\nZ;\u0001\u00138A\t'eA\u0002%\u0017V", "", "@nc.g0H\\w~|k,|\u0017", "", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "3cV28-?S\u0017\u000e", "\u001a`]1e6BRb\u0011~].|\u0018xE~*{ \u0002\u0018\u0017E~c", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms*VT7y\n", "2qPDJ0MV\u0006\t\nZ;\u0001\u00138A\t'eA\u0002%\u0017V7\u001e9_\u0016GIi", "uE9\u0019T5=`#\u0003y(>\u0001\b1e\u000fq[?\u0003\u0017vHp\u000e:\u0006z\u001cU\u0007\u001fDw\u001a-\u0017EHg?!\u0019fo\u0003d_5_r5\u001d\u0010C", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "2qPD56Mb#\u0007\\e6\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "0ncAb4", "2qPD?,?bz\u0006\u0005p", ":dUA", "2qPDE0@V(`\u0002h>", "@hV5g", "2qPDG6I5 \t\r", "Bn_", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DrawGlowOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final OverscrollConfiguration overscrollConfig;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public DrawGlowOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, OverscrollConfiguration overscrollConfiguration, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.overscrollConfig = overscrollConfiguration;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        boolean zDrawLeftGlow;
        this.overscrollEffect.m557updateSizeuvyYCjk$foundation_release(contentDrawScope.mo4734getSizeNHjbRc());
        if (Size.m4008isEmptyimpl(contentDrawScope.mo4734getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        if (edgeEffectWrapper.isLeftAnimating()) {
            zDrawLeftGlow = drawLeftGlow(contentDrawScope, edgeEffectWrapper.getOrCreateLeftEffect(), nativeCanvas);
        } else {
            zDrawLeftGlow = false;
        }
        if (edgeEffectWrapper.isTopAnimating()) {
            zDrawLeftGlow = drawTopGlow(contentDrawScope, edgeEffectWrapper.getOrCreateTopEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            zDrawLeftGlow = drawRightGlow(contentDrawScope, edgeEffectWrapper.getOrCreateRightEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            zDrawLeftGlow = drawBottomGlow(contentDrawScope, edgeEffectWrapper.getOrCreateBottomEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (zDrawLeftGlow) {
            this.overscrollEffect.invalidateOverscroll$foundation_release();
        }
    }

    private final boolean drawLeftGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m627drawWithRotationAndOffsetubNVwUQ(270.0f, OffsetKt.Offset(-Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()), drawScope.mo710toPx0680j_4(this.overscrollConfig.getDrawPadding().mo969calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m627drawWithRotationAndOffsetubNVwUQ(0.0f, OffsetKt.Offset(0.0f, drawScope.mo710toPx0680j_4(this.overscrollConfig.getDrawPadding().mo971calculateTopPaddingD9Ej5fM())), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m627drawWithRotationAndOffsetubNVwUQ(90.0f, OffsetKt.Offset(0.0f, (-MathKt.roundToInt(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()))) + drawScope.mo710toPx0680j_4(this.overscrollConfig.getDrawPadding().mo970calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean drawBottomGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m627drawWithRotationAndOffsetubNVwUQ(180.0f, OffsetKt.Offset(-Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()), (-Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc())) + drawScope.mo710toPx0680j_4(this.overscrollConfig.getDrawPadding().mo968calculateBottomPaddingD9Ej5fM())), edgeEffect, canvas);
    }

    /* JADX INFO: renamed from: drawWithRotationAndOffset-ubNVwUQ */
    private final boolean m627drawWithRotationAndOffsetubNVwUQ(float f2, long j2, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f2);
        canvas.translate(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }
}
