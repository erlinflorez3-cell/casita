package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: ShapeTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000534\u0012\u000e\u0007nj?3JΝHDɟ\u0004*=j<9*[ҸuCIUj\r0\ngN\u0016iĔN`\u0013¼'\b\u001c{x0\u001ad\u0007b*\u000f`DņC9UڎU;fzD\tpA0?\u0012\u0005/\u001cݵL\u0016~ٙ[M\u0012\u001a>DAI`\u0016e\u0005H\u0014ĂB&\tȦtiT@Vp.I=.\u001bipPϮc6\u0005ձ%HZ3\u001bz2-9MO5C'٨\u0007\rZ¹W\u0005E\u007fK\t965:as\u00068ݼ\u0004\u001a\u001dۀg\u000fc\u00034`U`n\u001d?+}eׂT\u00140»\u0013}\u0013N\u0012\u0012V6VAE\u001a\u0015\nԧ7zzԟXR\brP\u0004KpD,=\u007faAݰ\u001flYĥS\u001bTN\n\u001d]-1\u001a\u0007!\nV\u05f8d\u001b#Ƙ\u0010S7kNA˙R%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC*u:\u001e\u001ev7", "", "u(E", "\u0011na;X9\u001ef(\fvE(\n\u000b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001Z >VB;j\u0012(\"qaFtf(Yv|", "5dc\u0010b9GS&^\u000em9xo+r\u0002(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~g\u0001\u001cBm_\u001bWSDj4\u001drrnB\u0007p\u001aQr2G\"", "\u0011na;X9\u001ef(\fvE(\n\u000b/T\n3", "5dc\u0010b9GS&^\u000em9xo+r\u0002(jJ\f", "\u0011na;X9\u001ef(\fvL4x\u00106", "5dc\u0010b9GS&^\u000em9xv7a\u0007/", "\u0011na;X9\u001ef(\fvL4x\u00106T\n3", "5dc\u0010b9GS&^\u000em9xv7a\u0007/jJ\f", "\u0011na;X9\u001fc \u0006", "5dc\u0010b9GS&_\u000be3", "\u0011na;X9%O&\u0001z", "5dc\u0010b9GS&evk.|", "\u0011na;X9%O&\u0001z>5{", "5dc\u0010b9GS&evk.|h8d", "\u0011na;X9%O&\u0001zM6\b", "5dc\u0010b9GS&evk.|w9p", "\u0011na;X9&S\u0018\u0003\u000bf", "5dc\u0010b9GS&fz]0\r\u0011", "\u0011na;X9']\"~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u0010b9GS&g\u0005g,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "\u0011na;X9,[\u0015\u0006\u0002", "5dc\u0010b9GS&l\u0003Z3\u0004", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ShapeTokens {
    public static final int $stable = 0;
    private static final RoundedCornerShape CornerExtraLarge;
    private static final RoundedCornerShape CornerExtraLargeTop;
    private static final RoundedCornerShape CornerExtraSmall;
    private static final RoundedCornerShape CornerExtraSmallTop;
    private static final RoundedCornerShape CornerLarge;
    private static final RoundedCornerShape CornerLargeEnd;
    private static final RoundedCornerShape CornerLargeTop;
    public static final ShapeTokens INSTANCE = new ShapeTokens();
    private static final RoundedCornerShape CornerFull = RoundedCornerShapeKt.getCircleShape();
    private static final RoundedCornerShape CornerMedium = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl((float) 12.0d));
    private static final Shape CornerNone = RectangleShapeKt.getRectangleShape();
    private static final RoundedCornerShape CornerSmall = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl((float) 8.0d));

    private ShapeTokens() {
    }

    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    public final Shape getCornerNone() {
        return CornerNone;
    }

    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }

    static {
        float f2 = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(f2));
        float f3 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShapeKt.m1302RoundedCornerShapea9UjIt4(Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f3), Dp.m6638constructorimpl(f3));
        float f4 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(f4));
        CornerExtraSmallTop = RoundedCornerShapeKt.m1302RoundedCornerShapea9UjIt4(Dp.m6638constructorimpl(f4), Dp.m6638constructorimpl(f4), Dp.m6638constructorimpl(f3), Dp.m6638constructorimpl(f3));
        float f5 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(f5));
        CornerLargeEnd = RoundedCornerShapeKt.m1302RoundedCornerShapea9UjIt4(Dp.m6638constructorimpl(f3), Dp.m6638constructorimpl(f5), Dp.m6638constructorimpl(f5), Dp.m6638constructorimpl(f3));
        CornerLargeTop = RoundedCornerShapeKt.m1302RoundedCornerShapea9UjIt4(Dp.m6638constructorimpl(f5), Dp.m6638constructorimpl(f5), Dp.m6638constructorimpl(f3), Dp.m6638constructorimpl(f3));
    }
}
