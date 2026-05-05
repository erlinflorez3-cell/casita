package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: DrawStyleSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<$q$yCAV\"}8\tWN}gvJ`\fIƤ\u001cǝ)jZH\u0006x\f\u0012O=RsM4eok;žx6\u0013#z2F\u007f\u001d\u0001H1x\u0016\u0005\u0003[M\"\u0011^I7N\u001b![\u000f2\u00124IH\u0001Lh.NʝGǍҺ>1)\u0010wP\u0017;m?\u0015M;V|';\b(\u001eӡ?ʺ߱\u0019'Y\u0015\u0015e,N\u0011@\n=3jҊ+1Q֕o8^\u0004\"\u001aۃO\u0012eu,غ!\u007f_И+?"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001{%BTC\u0005JA\u001a'VpM\u000ec\u001aYr0\u001d", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E\u001e\u0004\u0013$Cm\u001d<\u0004\u0013Dm\u0005 \r", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E0\f\u0016\u0013VoiG\u0002%1fy)5mk", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'VpM\u000ec\u0002\u0012g", "5dc\u0011e(PA(\u0013\u0002^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0013+\u0011zOH\u001bj,$", "CoS.g,\u001d`\u0015\u0011hm(\f\t", "", "BdgAC(B\\(", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "Bn0;W9HW\u0018\\vi", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U%k\u0019\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "Bn0;W9HW\u0018\\visY\t\u00157c\f[", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nk\u0013\u001bP~L\u001ar0\u000b", "Bn0;W9HW\u0018c\u0005b5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U,y\u0012EL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "Bn0;W9HW\u0018c\u0005b5DzA9`t\u0004,", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nk\u0013\u001bP~L!\u0001)>/", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final DrawStyle drawStyle;

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (!Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
                if (drawStyle instanceof Stroke) {
                    textPaint.setStyle(Paint.Style.STROKE);
                    textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                    textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                    textPaint.setStrokeJoin(m6408toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m4804getJoinLxFBmk8()));
                    textPaint.setStrokeCap(m6407toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m4803getCapKaPHkGw()));
                    PathEffect pathEffect = ((Stroke) this.drawStyle).getPathEffect();
                    textPaint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
                    return;
                }
                return;
            }
            textPaint.setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    private final Paint.Join m6408toAndroidJoinWw9F2mQ(int i2) {
        return StrokeJoin.m4537equalsimpl0(i2, StrokeJoin.Companion.m4542getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m4537equalsimpl0(i2, StrokeJoin.Companion.m4543getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m4537equalsimpl0(i2, StrokeJoin.Companion.m4541getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    /* JADX INFO: renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    private final Paint.Cap m6407toAndroidCapBeK7IIE(int i2) {
        return StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4531getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4532getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4533getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }
}
