package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
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
/* JADX INFO: compiled from: AndroidPathMeasure.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0017\u007f\u0007lkA0RwP.XS2\u000f\u0002{<$a&yCI^\"}(\nWN}gvJ`\rK\u000f\u0014\u0016\u0001j2Jkތ\u000e\u0012=1\u0003|E\u074c]sK9xtd\u0006ڶ6\"F{M\u001c(4`\u0010%\u0006sO\u001a\u001eH@\u001f>\u0019!͘\u0004܅ǀ\u0005=ŋ\u0005 bt\\D\u0011\u0013kIG#1yrR5pH|{\u0011vX5\u001f\u000faL/p;C(=S1\u001b\u0003_M\u0018Wqk\u0015/;oFW\no6\u0007\u000bD\u00199[%]!*#\u0019Ƣ_ϯ̥*NӍOR\u0014?\u0006\tD%J\u001c&\u0006Ua^3(\u0001 \u0010Is!gpT\u0010yZ\u007f)q|+u\fA+Q\u001b\u0015R8ݥ\u001b\u05ee;{\rټn5\u000fq9[\u0003\u0012\u0017iqƯyΦ5UX?NS\u0018_\u000e{\u0012wz\u0004@\u0003^OV߿\b 2\u0017-ڛ,G1*\u0004\u0004^C\u0016~[\u009etרmRPؗ̑n\u001f?*\u000f+bGjʯ\b~Sй0-"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\u0019IR>S4\u001a#xn9\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u001fm\u0012<]P;A", "7mc2e5:Z\u0004z\na\u0014|\u0005=u\r(", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004~\u0017C}\u001eIvz", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0010\u001a~Gk\u001cL\u0004%\u000b\u001dn", ":d]4g/", "", "5dc\u0019X5@b\u001c", "u(5", ">nb6g0H\\t\f\bZ@", "", "B`]4X5M/&\fvr", "5dc\u001db:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "2hbAT5<S", "5dc\u001db:Bb\u001d\t\u0004&;\ru\u001fv\u0005\u0014", "uE\u0018\u0017", "5dc X.FS\"\u000e", "", "AsP?g\u000bBa(z\u0004\\,", "As^=70Lb\u0015\bx^", "2dbA\\5:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AsP?g\u001eBb\u001cf\u0005o,k\u0013", "5dc!T5@S\"\u000e", "5dc!T5@S\"\u000eBm<ix@jk", "Adc\u001dT;A", "", ">`c5", "4na0X\nE]'~y", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidPathMeasure implements PathMeasure {
    private final android.graphics.PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f2, float f3, Path path, boolean z2) {
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f2, f3, ((AndroidPath) path).getInternalPath(), z2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(Path path, boolean z2) {
        android.graphics.Path internalPath;
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path != null) {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((AndroidPath) path).getInternalPath();
        } else {
            internalPath = null;
        }
        pathMeasure.setPath(internalPath, z2);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* JADX INFO: renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo4076getPositiontuRUvjQ(float f2) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f2, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.positionArray;
        Intrinsics.checkNotNull(fArr);
        float f3 = fArr[0];
        float[] fArr2 = this.positionArray;
        Intrinsics.checkNotNull(fArr2);
        return OffsetKt.Offset(f3, fArr2[1]);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* JADX INFO: renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo4077getTangenttuRUvjQ(float f2) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f2, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.tangentArray;
        Intrinsics.checkNotNull(fArr);
        float f3 = fArr[0];
        float[] fArr2 = this.tangentArray;
        Intrinsics.checkNotNull(fArr2);
        return OffsetKt.Offset(f3, fArr2[1]);
    }
}
