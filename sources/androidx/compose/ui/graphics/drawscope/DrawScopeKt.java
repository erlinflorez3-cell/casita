package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d̉=!,i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS0\u0011s{B)c$wHCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0013\u00172XoG3SvE9vt>\u0005&>*8\u0010\u0005\t\u001a0H(7\tŏc\f@/hphR=Q\u0013\u001b*\u0006l\"1$bg\\9`l\f>_8\u0011nZ_7a@|{\rVV7\r%`L1Ë;5\u001b,\u001aΏ\rӱZΪƄCsC\rv0?\fW}o6\u0007~<\u0015YO=cx&j\u0010i`:3[UiK^\u001b@w)\b=B\n\u000e\u00145`.[&\u0017\u000e\u00143\u0003\u0002k@~\u000e\u000fH\u0006zo9/%.7[N)kirK\u001b^7*\u0005\u001d 3\u0001\u001d \nZ\u05f8d\u0015![>Ί7Ӿ?׀˓R\f_M{\u0015\t1\u0010<\u001c0u~W{?.G)EnQ#O\u007f2LR|\u000f\u0005\u000f~\u0004m`_X\"\u001d.g.\u0017%rD\u0013\u001f\u001ceb]D\"]\u001ed\u0007,\b#\"lwj S\u0016ʽShoq\u0014β\u0010ˑ.ωƠ]pq)eUv\u000eCc{\u0010\u0010Q\u001f\u0014m<\u0013\tfyZS:n\r,0G`j>\u000e,H\\#+2m\nL8:J1\\Cb3&HA\u000b&w\\~\u000f-rc9\u0011n<\u0006\u0019\u0003`\\\u001fowzY,+_P3ۮU5\u001f-\u001cȯnڍ{Ƚȷ\u0003u\u0006ful_kz7\u000eU*\u001f>\u001agQ_M!\u0014\u00175B\u0004=Ez\u000buS]\u0012Uy+\u007fU\u0097nF\u0014\u0016\r\t,\u000firO\u0003\u0017Rzl\u0015;\b\u0013\f*vT\u007f_td\rk>wr\u0013[LNf{3%Ǫ)\u0001u)Cލ3[_+8\u0010\u0014]\u0014\n]\u0018o^\u007fh\u000f4\u0018}\u0004ZoFuhQkVS8we/S0)\u0005\u0014RJzw6B\u00196\u001d3v@\u0013vެ<M\u00116D\u058c\rDQ~xs:An&4\\_ZwQ\t,^q1AQat\u0006myh;N\u001d\u0018#{_zB K/nW\u0011\u0015`\u001b\u0002\u001dNRKd\u0015<7$D.L\b9B\u0003oѕ\u0014z\u0006M&ʜ\u001dJ\u0003\u0002`n\u000e\u0003w\u0005Vv\u0005\u0011InGB\u0001-\u001bc$~5?,\u0006F\u0003W\u0014G\u000fX5\u001a+l_~\u0015%;Fd9I'\u0007\u0007խI]IPHԔ\nܔ(ԖÃs\u000e>A\u000bGZX)di\u0011\u000euX^9U\u0015Rr#*f\u0001ZR/\u0005z\u000b5T\n=3Id\u0001tz>\\P\b7q\u001a\u0011\u0019T)5\u000b+i̍\u001f-\f<s֘Oߖ\u0013՝ٖ[UA+\u0016J8g\u0012#9\\\u0006\r\u000f\n\f\u001bj\u001a\u007fDz\u00027\u001f\u0001&\n.X\u001c\u000b\n\\0fd\u00108\u001a$n[{wO@7-|\u0006pJ\u0017~Ơgliu\u001c̊\tј0ؼӖr/VL\u0017Qev!\u0007r:?RHX?\u007fD\u00194ON\b\u00115@Sq\u001a\tk}g=15k8\tI0\u0001F.4\bz\u001c;d*%;\u0005MNf\u0019\\\u001bA\u0006\u0014߿n(j{RÐ\u001aВ}Ĝր\u0015\u0015:x\u0001Q|gEM7[;F\t\u00072Ey,'1`J37`\u0017 .|\u0011\u0011Gzt.6r\u001e\u0001\u0005\u007f==Hd=H'i&}d1%yKђF\b2\u0018Tĸ5ru.st\u001aJ:y3o\u0019A\u0016#n\u001e\u0001\u0017\u001bEj\u007f\u000b5,\u0011|/\fm\u007f܊o:y>#8=G\b,ghK%ce\\)\u001c\u0002\u0014I-S\u07b2Z\u000fg3\u0010ˆKɍyZH\u0003\u0010ڌ@R\u0005×'9"}, d2 = {"1kX=C(MV", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "1kX=B7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013`\u0002+!xk", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1kX=C(MV`dY)\u007fnS\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b&{@B\"\f*WK&d\u0010\u000fkq\u001cpzQ]\u0014PC\u001a\u0007IriVb]\tKKNpsE\u001ch\u001bk>D-_G\\\f", "1kX=E,<b", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "1kX=E,<b`\fdny\u0002{9", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/W\b(052fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fY\u000b.a", "2qPD", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2qPD \u000e+5$}K)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b4wHFhf,R\u0010?w\u0015a|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\nK\u000bUk.sUF\u0019pDJ3ru&\u001bf_2\u0014\u0005)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fLxp!Xw\u0003\u00156V\u0003tR)\rE&D:i2m\"Me|\u001euaR/o7L\u001c=Zg\u007fuLWI/j\u0006\u001df?:d;)T", "5qP=[0<a\u007fz\u000f^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "2qPD @F:gIed", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b4wHFhf,R\u0010?w\u0015a|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\nK\u000bUk.sUF\u0019pDJ3ru&\u001bf_2\u0014\u0005)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fLxp!Xw\u0003\u00156V\u0003tR)\rE&D:i2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0006p\b\u0010u\u001bl\u000b\u0012`Cz aycUXhj\u0013f8e]\u000f\u001eN\u001a>VE{-P\u000eI_\u0003^\u000e\u0018,7fYL\u0019c\u0005$yRk@!\f\u0001u\u001c&7a\u0013\u001d\u007f", "2qPD<5M]vz\u0004o(\u000b", "7mb2g", "6na6m6Gb\u0015\u0006", "DdaA\\*:Z", "@nc.g,", "2dV?X,L", ">he<g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@nc.g,\u0006@\u001bJ^Hzz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/[\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqLaY~", "@nc.g,+O\u0018", "@`S6T5L", "@nc.g,+O\u0018Fg`w`r}c", "AbP9X", "AbP9Xs+Udbd-*", "AbP9X\u001f", "AbP9X ", "AbP9Xs\u001fU(M`-\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/W\f.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nWkQ&", "BqP;f3:b\u0019", "Ehc5G9:\\'\u007f\u0005k4", "BqP;f-H`![\u0002h*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0004u]B\u0015d6[~|", "2qPD53HQ\u001f", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DrawScopeKt {
    public static final void inset(DrawScope drawScope, float f2, float f3, float f4, float f5, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f2, f3, f4, f5);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawScope.getDrawContext().getTransform().inset(-f2, -f3, -f4, -f5);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f2, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            float f3 = -f2;
            drawScope.getDrawContext().getTransform().inset(f3, f3, f3, f3);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void translate(DrawScope drawScope, float f2, float f3, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().translate(f2, f3);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawScope.getDrawContext().getTransform().translate(-f2, -f3);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f2, float f3, Function1 function1, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f2, f3);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawScope.getDrawContext().getTransform().translate(-f2, -f3);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4782rotateRg1IO4c$default(DrawScope drawScope, float f2, long j2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = drawScope.mo4733getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4661rotateUv8p0NA(f2, j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4784rotateRadRg1IO4c$default(DrawScope drawScope, float f2, long j2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = drawScope.mo4733getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4661rotateUv8p0NA(DegreesKt.degrees(f2), j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m4786scaleFgt4K4Q$default(DrawScope drawScope, float f2, float f3, long j2, Function1 function1, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = drawScope.mo4733getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4662scale0AR0LA0(f2, f3, j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4788scaleRg1IO4c$default(DrawScope drawScope, float f2, long j2, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            j2 = drawScope.mo4733getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4662scale0AR0LA0(f2, f2, j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m4777clipRectrOu3jXo$default(DrawScope drawScope, float f2, float f3, float f4, float f5, int i2, Function1 function1, int i3, Object obj) {
        int iM4167getIntersectrtfAjoo = i2;
        float fM4003getHeightimpl = f5;
        float fM4006getWidthimpl = f4;
        float f6 = f2;
        if ((i3 & 1) != 0) {
            f6 = 0.0f;
        }
        float f7 = (i3 + 2) - (i3 | 2) == 0 ? f3 : 0.0f;
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc());
        }
        if ((i3 & 8) != 0) {
            fM4003getHeightimpl = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc());
        }
        if ((i3 & 16) != 0) {
            iM4167getIntersectrtfAjoo = ClipOp.Companion.m4167getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4658clipRectN_I0leg(f6, f7, fM4006getWidthimpl, fM4003getHeightimpl, iM4167getIntersectrtfAjoo);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m4775clipPathKD09W0M$default(DrawScope drawScope, Path path, int i2, Function1 function1, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = ClipOp.Companion.m4167getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4657clipPathmtrdDE(path, i2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void drawIntoCanvas(DrawScope drawScope, Function1<? super Canvas, Unit> function1) {
        function1.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void withTransform(DrawScope drawScope, Function1<? super DrawTransform, Unit> function1, Function1<? super DrawScope, Unit> function12) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            function1.invoke(drawContext.getTransform());
            function12.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m4779drawymL40Pk(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> function1) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo4655getSizeNHjbRc = drawScope.getDrawContext().mo4655getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo4656setSizeuvyYCjk(j2);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m4780drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, GraphicsLayer graphicsLayer, Function1 function1, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo4655getSizeNHjbRc = drawScope.getDrawContext().mo4655getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo4656setSizeuvyYCjk(j2);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f2, float f3, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            float f4 = -f2;
            float f5 = -f3;
            drawScope.getDrawContext().getTransform().inset(f4, f5, f4, f5);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f2, float f3, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            float f4 = -f2;
            float f5 = -f3;
            drawScope.getDrawContext().getTransform().inset(f4, f5, f4, f5);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m4781rotateRg1IO4c(DrawScope drawScope, float f2, long j2, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4661rotateUv8p0NA(f2, j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m4783rotateRadRg1IO4c(DrawScope drawScope, float f2, long j2, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4661rotateUv8p0NA(DegreesKt.degrees(f2), j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m4785scaleFgt4K4Q(DrawScope drawScope, float f2, float f3, long j2, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4662scale0AR0LA0(f2, f3, j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m4787scaleRg1IO4c(DrawScope drawScope, float f2, long j2, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4662scale0AR0LA0(f2, f2, j2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m4776clipRectrOu3jXo(DrawScope drawScope, float f2, float f3, float f4, float f5, int i2, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4658clipRectN_I0leg(f2, f3, f4, f5, i2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m4774clipPathKD09W0M(DrawScope drawScope, Path path, int i2, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4657clipPathmtrdDE(path, i2);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg{\u0010#1e\u001c[\u001f,\u0017t\u001bSz\u0006omQy4zqZk\u0002[qtEG ??Q=^z2`Q>x*5+\u0011Y")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m4778drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, Function1<? super DrawScope, Unit> function1) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo4655getSizeNHjbRc = drawScope.getDrawContext().mo4655getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo4656setSizeuvyYCjk(j2);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            InlineMarker.finallyEnd(1);
        }
    }
}
