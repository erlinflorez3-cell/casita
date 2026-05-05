package androidx.graphics.path;

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
/* JADX INFO: compiled from: ConicConverter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005(4\u0012\u0006\u0019nʑA0ReP.XS2\u000fy\u0001<$a(yCI^\"Ԃ(ޛeȞ\u0018g\u001dI\u001b\u000eß\u0013\u0006$x3RWa\u0011]@\u001cbF}MKM\u001eHid\u0003E\u001d `2h}\u0013\u00122*v '\u0001IK\u001a$H@\u001f<\u001b<[\u00182\u00124@P\u0005,p\u007fNdS\u001daHA;\u0003\u0018D~+mE\u0015M;Q\u0005+\u001b\u0006y\u001eYPg9#6k\u00035b\"έ!\b\bK\u001b\u0001'UByweDp\u007fB [U\u0013]\u00018t\u0005\u007fb\\?9P{K~\u0010~Â\u0007ԫ\u0011H\f\u05fa\u001e)N1;\u001e\u0007\n\u00148\u0003x$\\^\nvB.|\u0012:%,\u00183Y;Y'(ĬGϭR=\u0004˜% )\n|%,`\u001cj-\u001b\u0003\u0003(Ļ]͘AHVˣ\u0558A\u0006"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`%y\u0017@t\u0003?b\u000f D|\u0016;#", "", "u(E", "1ta?X5M?)zyk(\f\r-", "", "5dc\u0010h9KS\"\u000efn({\u0016+t\u0004&", "u(8", "Adc\u0010h9KS\"\u000efn({\u0016+t\u0004&", "uH\u0018#", "\nrTA \u0006\u0017", "?tP1e(MW\u0017\\\u0005n5\f", "5dc\u001eh(=`\u0015\u000e~\\\n\u0007\u00198t", "?tP1e(MW\u0017]vm(", "", "1n]CX9M", "", ">nX;g:", "EdX4[;", "", "Bn[2e(GQ\u0019", "=eU@X;", "7mc2e5:Zv\t\u0004b*k\u0013\u001bu{'\t<\u0010\u001b\u0015U", "1n]6V\u0017HW\"\u000e\t", "?tP1e(MW\u0017i\u0005b5\f\u0017", "<dgAD<:R&z\nb*", "", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ConicConverter {
    private int currentQuadratic;
    private int quadraticCount;
    private float[] quadraticData = new float[130];

    private final native int internalConicToQuadratics(float[] fArr, int i2, float[] fArr2, float f2, float f3);

    public final int getQuadraticCount() {
        return this.quadraticCount;
    }

    public final int getCurrentQuadratic() {
        return this.currentQuadratic;
    }

    public final void setCurrentQuadratic(int i2) {
        this.currentQuadratic = i2;
    }

    public static /* synthetic */ boolean nextQuadratic$default(ConicConverter conicConverter, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 0;
        }
        return conicConverter.nextQuadratic(fArr, i2);
    }

    public final boolean nextQuadratic(float[] points, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i3 = this.currentQuadratic;
        if (i3 >= this.quadraticCount) {
            return false;
        }
        int i4 = i3 * 4;
        float[] fArr = this.quadraticData;
        points[i2] = fArr[i4];
        points[i2 + 1] = fArr[i4 + 1];
        points[i2 + 2] = fArr[i4 + 2];
        points[i2 + 3] = fArr[i4 + 3];
        points[i2 + 4] = fArr[i4 + 4];
        points[i2 + 5] = fArr[i4 + 5];
        this.currentQuadratic = i3 + 1;
        return true;
    }

    public static /* synthetic */ void convert$default(ConicConverter conicConverter, float[] fArr, float f2, float f3, int i2, int i3, Object obj) {
        if ((i3 + 8) - (i3 | 8) != 0) {
            i2 = 0;
        }
        conicConverter.convert(fArr, f2, f3, i2);
    }

    public final void convert(float[] points, float f2, float f3, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        int iInternalConicToQuadratics = internalConicToQuadratics(points, i2, this.quadraticData, f2, f3);
        this.quadraticCount = iInternalConicToQuadratics;
        int i3 = (iInternalConicToQuadratics * 4) + 2;
        if (i3 > this.quadraticData.length) {
            float[] fArr = new float[i3];
            this.quadraticData = fArr;
            this.quadraticCount = internalConicToQuadratics(points, i2, fArr, f2, f3);
        }
        this.currentQuadratic = 0;
    }
}
