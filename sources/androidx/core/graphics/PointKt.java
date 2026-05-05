package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
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
/* JADX INFO: compiled from: Point.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,o\bDZc|\u0004O\u000b8\u000bDB\u0007\"2\u001c\u0010\u0012tʑQ0rdp.\u0001SpŦs\u0014?2Ӌ<qq<}\u001a,$OѮV\u007fr|Mr\u000bq\u000e.\u0016'jrն]\u0011h \u0012JB\u001e@[M\u001e?\u007fŢ|N\u0018.6:8(\u0005)\u001aXH@z\tHc\f@1\u0007\u0088Bj [\t2\u00124@H\u0001L^\u0018RDM\u0005]h0iɌqZa5eH|{\rnTU\r'e,2X7c\u0015kٌ\u000b\u001feiE\u001b? =-hU'[M\u0002_NX.\u0013[ۇW%p\u0001,t\u0005\u007fb4'YQ\u0014O^\u0015@w)}Sɤ\f&\u00195NF-Hh0\u000eav#WNX\u001a^p\u0001Aʯ>/8\u000e<C9Ifyai\u0019~;\n\f%\u001eQ\u00015Ėcl!n\u001e3T&QYQn=xR\u0018aUm2o)̪2\u001cCU\tG{?0?%e]i'/r\u001aHri=ݚh\u0001fw[`@Pp>7X\u000b<^Rl\u001dk~U\u001f\u0093\u0019e/b\u0011\u0016\bA \u0005wj!U\u0014\\T\u0001i\u0019N$܊-GyEc\u0007k<Ya^a7\u0002g\u001efjvB@\u0003ϼ\rpqP^$Z\u000b(J2vlVǵ\u0002\\Y\u001a\u001fJ? \u001e\\,_\u0019#ðN\u001b)PN\u0015\t\u000eZ\u0011\u0010-Tyɻ\u000b\u0002/\u0003\u0016\u0019P\u000br\u0018g'KrʐhĞ1O"}, d2 = {"1n\\=b5>\\(J", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "1n\\=b5>\\(K", "2he", "AbP9T9", ";h]Bf", ">", "Fx", ">kd@", "Bh\\2f", "Bn?<\\5M", "Bn?<\\5M4", "CmP?l\u0014B\\)\r", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointKt {
    public static final int component1(Point point) {
        return point.x;
    }

    public static final int component2(Point point) {
        return point.y;
    }

    public static final float component1(PointF pointF) {
        return pointF.x;
    }

    public static final float component2(PointF pointF) {
        return pointF.y;
    }

    public static final Point plus(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    public static final PointF plus(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    public static final Point plus(Point point, int i2) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i2, i2);
        return point2;
    }

    public static final PointF plus(PointF pointF, float f2) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f2, f2);
        return pointF2;
    }

    public static final Point minus(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    public static final PointF minus(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    public static final Point minus(Point point, int i2) {
        Point point2 = new Point(point.x, point.y);
        int i3 = -i2;
        point2.offset(i3, i3);
        return point2;
    }

    public static final PointF minus(PointF pointF, float f2) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f3 = -f2;
        pointF2.offset(f3, f3);
        return pointF2;
    }

    public static final Point unaryMinus(Point point) {
        return new Point(-point.x, -point.y);
    }

    public static final PointF unaryMinus(PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }

    public static final Point times(Point point, float f2) {
        return new Point(Math.round(point.x * f2), Math.round(point.y * f2));
    }

    public static final PointF times(PointF pointF, float f2) {
        return new PointF(pointF.x * f2, pointF.y * f2);
    }

    public static final Point div(Point point, float f2) {
        return new Point(Math.round(point.x / f2), Math.round(point.y / f2));
    }

    public static final PointF div(PointF pointF, float f2) {
        return new PointF(pointF.x / f2, pointF.y / f2);
    }

    public static final PointF toPointF(Point point) {
        return new PointF(point);
    }

    public static final Point toPoint(PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }
}
