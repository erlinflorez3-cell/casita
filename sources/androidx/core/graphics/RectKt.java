package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\":\u0017\u007f\u0007llA0RnP\u008cZS@\u000fs{J$c$wCCU0}*\tUUog\u0005Jb\u000bI\u000f\u001e)\u0007̓DI\u0004w\u0006\u0012=1rsM3eok8'Ң@\u001d3@ĲPy3\u0002B*v\u0011'~QK$\u0012^A7õ\\%X\u0013\u001c*\u0006l#)\u001e\u000bf\u0015ȫP\u0005hH1;\u0003\u0018Fv'\u000e1Cո\u0015^_5\u0012\u000faL.h7c\u0014kٌ\u000b\u001f]iD\u001b? A-hU(qɥ{oAf\u0006,\u0015YR5]!%#ӫYx\u001751gcyT6(&{BȥD\u001c\u0019\u0014.`.[\u001d\u000f\b<2;Ɉ[X[\u0010eZ\u007f)e^\u0017S\u0001yچA3y_iS\u0019|@$\u0005;\u001dS\u0005|+sT<k[Ø\\\u0010d?YX=vW2Ykn4tp\fB\u0004^SF\u0082\u0004)A%2O[g\"Ik0Gtk\u0005\u0013xh\u0002t\u0019̹H:\u0002$DB\t:ild3j\u0001Xf,)MJSMé\u0010+3j\u0005T!S\u000fvO\u0017h\u001bQk\u0018=/\u0015: ʫs&jGkK5\u007fd8a\u0001wDCJp\u001dX\u0015N\u001aەbt;0?`j>\u0007$D|\rC6Mq44Z2_©\u001d`\u0016,OY|7`\u0003h>\u007f\u000572\u0011\u0002$#\rGˍd\t\u0003u\ta,+_J-oPe\u001d4U:hb{iț\t\f\u0013UwdGzm>u\u0004|P\u001a(9i/k\u0014Uȶ3J\u0015;Vdr\u0014Pu\u0012Uy-}\u001dI\u0001.\u0016\u00131Ѹ4x}X`l\u0017Pu\u0007rQ\u0007\u0015\u0004\ba^zub\u001b\u07b3cV\\\u0001\u0014q<|7%\u0005M\u001dU\u0005}0\u00155[Fmݻ\u001e\u0010'=&y]\u0018pVy\u0011\u0010Vxs\u0012DcD{)КeJNFZq~l#Ll1Cxn\u0006\bZ\tb\u000eyǬI|\u0004dIe\u000b]~\u000f\u0007Z\u000e!ZiH+o,8tʅ2\fV\f&vCS\u0010uS\u0016l\u001eOj\u001eb\u000f8\u000eBωv*/K2nW\u0011\nX\u0006\"\u0019fEIu\u001d<7(zɽD \u001eQf\u0002\u0006>{(F\u000e\u0010G6P\u0007SV<W?ֻ^`\u0010nYx!X\u007f'\u000fa\u001f?߽7\u001dxTiGc`\u0002{\u001d7\u001a1ʱ\u0005~09Zl9I7\u0001\u00019D$ŤO\u001aA\u0012]Am\u001a~48F}c´\u001e3L_(wv^_3U\u0013O\u0015z ~jNPBEҚ\u0003&O\u0018)#\u0019}\u0002\u0018b[K~{EC2\u0001ECoܔ\u0016\u0015vT5E\u0006c<eI\u0019\u0015W\u007feSS}6!fٻ\u000eȵ%w"}, d2 = {"/mS", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "@", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "1n\\=b5>\\(J", "", "", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n]AT0Ga", "", ">", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", ";h]Bf", "Fx", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{B\u0005! \u001d", "=q", ">kd@", "Bh\\2f", "4`RAb9", "BnA2V;", "BnA2V;\u001f", "BnA2Z0H\\", "BqP;f-H`!", Global.SEMICOLON, "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "Fna", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RectKt {
    public static final int component1(Rect rect) {
        return rect.left;
    }

    public static final int component2(Rect rect) {
        return rect.top;
    }

    public static final int component3(Rect rect) {
        return rect.right;
    }

    public static final int component4(Rect rect) {
        return rect.bottom;
    }

    public static final float component1(RectF rectF) {
        return rectF.left;
    }

    public static final float component2(RectF rectF) {
        return rectF.top;
    }

    public static final float component3(RectF rectF) {
        return rectF.right;
    }

    public static final float component4(RectF rectF) {
        return rectF.bottom;
    }

    public static final Rect plus(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final RectF plus(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Rect plus(Rect rect, int i2) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i2, i2);
        return rect2;
    }

    public static final RectF plus(RectF rectF, float f2) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f2, f2);
        return rectF2;
    }

    public static final Rect plus(Rect rect, Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    public static final RectF plus(RectF rectF, PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    public static final Region minus(Rect rect, Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Region minus(RectF rectF, RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Rect minus(Rect rect, int i2) {
        Rect rect2 = new Rect(rect);
        int i3 = -i2;
        rect2.offset(i3, i3);
        return rect2;
    }

    public static final RectF minus(RectF rectF, float f2) {
        RectF rectF2 = new RectF(rectF);
        float f3 = -f2;
        rectF2.offset(f3, f3);
        return rectF2;
    }

    public static final Rect minus(Rect rect, Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    public static final RectF minus(RectF rectF, PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    public static final Rect times(Rect rect, int i2) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i2;
        rect2.left *= i2;
        rect2.right *= i2;
        rect2.bottom *= i2;
        return rect2;
    }

    public static final RectF times(RectF rectF, float f2) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f2;
        rectF2.left *= f2;
        rectF2.right *= f2;
        rectF2.bottom *= f2;
        return rectF2;
    }

    public static final Rect and(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final RectF and(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final Region xor(Rect rect, Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Region xor(RectF rectF, RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final boolean contains(Rect rect, Point point) {
        return rect.contains(point.x, point.y);
    }

    public static final boolean contains(RectF rectF, PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    public static final RectF toRectF(Rect rect) {
        return new RectF(rect);
    }

    public static final Rect toRect(RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final Region toRegion(Rect rect) {
        return new Region(rect);
    }

    public static final Region toRegion(RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    public static final RectF transform(RectF rectF, Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    public static final RectF times(RectF rectF, int i2) {
        float f2 = i2;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f2;
        rectF2.left *= f2;
        rectF2.right *= f2;
        rectF2.bottom *= f2;
        return rectF2;
    }

    public static final Rect or(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final RectF or(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}
