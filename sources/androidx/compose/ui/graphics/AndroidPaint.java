package androidx.compose.ui.graphics;

import android.graphics.Shader;
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
/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?0LeV3ZS0\u0018s{J$c$wECU0}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4Ikxe\u0012\u001d;JoE5UoS9ht<\r(288\u0002\u0005\u0007\u001b2H&v\u0003CQ\u0013\u001a0VpBR\u0013O\r\u001a(\u0006FĨ\u0017Ȧ\rg|5\tqcNǥ'\u0003wB\u000f2o4\u000bN%F\u0003)˼za,.\tAC^=W1\t;[\u001eM\u0006\u0006\u000e\u0019v+?+wx.̯dŕ\u0013ƃܹN\fǁv(d\u0005_f\\I9X{K~\u0016X{\t\u0003%<2\u0016<{\u0007\u0003\u0004Ֆrڿ\u0012=\rtYJ^\r~D\u0006\u0007oCgM\u000eAC9Ik\u0002eI f7*\nCraUEĦgۣ\r֫۶\u001aSɐU;iBCW\\\u001ay?s\u0015~tRR\u0012C_\u007f]\u0010A2%8O[g7W@@\u001d\u001bϰ\u0003ߌ_åؾhQ͕D,\u0007\u0018=?\u0017\"zFj\u001cyh%~:+e\u001ej\u0006,!C&j~T#;\u000f|h\u001f>)\"4ܚ1çjAqpq)eU~5;nq.2z\u00054W<\u0011$\tjPZ$Z\u000bGX\u0007\u0007?fȅ\bϢMۼȇ1>ۇ >D3\u001f}#X# Hc\u000b\u001b0hv3\u0017VI#1\u0003zڒ\u0015ɹT\\xב8\u0005W-\u0015`P/\u0018ٞAԊ*U*ֻ\u0005\u00111+\u0017{\u0016F\u0016q0N\u0003\u0015T{R\u0090\"׀=Q7ˋc1\rQJ\u0002[l|vsXe\u0012U\"3NM\u0010?ׂsŰnzDbpr]}7$|\t\u0001NX\u000b\u000e'yH\u0011F\u0012\u0001;aLP\u000b\u0005o;|d;YuǞ1˽s.\u0005ކEE-K$'41\u001b\u0012k\u001b@`\b\u0015'.\u000bd2QL\u0018\u0006a0\u0004bGFPq\u0007T!R\u0012kD^iV.x]ra\nǼMяt`PO\u0011b\f\u001b'.\u0013&d\u0012\u000b;}6L.\u000ea$G\f\u001bvCSH\u0004(&BDэh؞I\u05faё\nzϥr\u001c4?&\u0010er)2\f.&H\u0012cpAT\tRo\\@\u0016\u0012[T\u0018AFO>\u001b6ʬ#ѡAƽƢU\r֭|fnJ\u000b\u001eSpA,\u0007=\u001dEn\u001bCp\u001dmt\\_g@\bk\u001d7#!$=;{ŔPȗ=%@Z\u0007KShcK\bw\u0012Ty\u0010y2$8F\u0005MF&\"QQ?g-\u0005\u001d_,̻ZЩz\u001c~TTe7\n\u001b~\u0014\u0001\u0018\u001c[A]9\bb[\u0012~{EJ2\u0001E\n_[JQ:́'ԇ\u0005זм<Hހ\u00181\u0014YY\u0003\f\u0018@\"-L\u00033ƻW\u0017n\rc\u038bVDp\u001eb\b(\u07b9Tk"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\u0019IGDz\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "u(E", "7mc2e5:Z\u0004z~g;", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0005 &\u001d3~", "-a[2a+&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "\u0017", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "0kT;W\u0014HR\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", "Adc\u0010b3H``Qt1w\u0004\u0010\u000b", "uI\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1n[<e\rBZ(~\b", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "4h[AX9*c\u0015\u0006~m@", "5dc\u0013\\3MS&j\u000bZ3\u0001\u0018C-\u0001o\r\u0014\u0004bz", "Adc\u0013\\3MS&j\u000bZ3\u0001\u0018C-\u0011\u0007^KN*!", "7mc2e5:Zv\t\u0002h9]\r6t\u007f5", "7mc2e5:Z\u0007\u0002v],\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "", "7r0;g0\u001aZ\u001dz\t", "u(I", "Adc\u000ea;B/ \u0003vl", "uY\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", ">`c58-?S\u0017\u000e", "5dc\u001dT;A3\u001a\u007fz\\;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpu/NC9z\n", "Adc\u001dT;A3\u001a\u007fz\\;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:M\u0017/MAJAw\u000f", "AgP1X9", "5dc [(=S&", "u(;.a+K]\u001d}D`9x\u00142i}6E.\u0004\u0013\u0016G|c", "Adc [(=S&", "uKP;W9HW\u0018H|k(\b\f3c\u000eqiC|\u0016\u0017TEQ-", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "Asa<^,\u001cO$", "5dc g9HY\u0019\\visb\u0005\u001aH\u0006\n\u000e", "Adc g9HY\u0019\\visY\t\u00157c\f[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "Asa<^,#]\u001d\b", "5dc g9HY\u0019c\u0005b5DoBF\\0\u0002\u0013", "Adc g9HY\u0019c\u0005b5DzA9`t\u0004,", "Asa<^,&W(~\bE0\u0005\r>", "5dc g9HY\u0019f~m,\no3m\u00047", "Adc g9HY\u0019f~m,\no3m\u00047", "Asa<^,0W\u0018\u000e}", "5dc g9HY\u0019p~];\u007f", "Adc g9HY\u0019p~];\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)Fq\u001f0;ROr4s", "Ash9X", "5dc g@ES`m~n\u001ayf9", "Adc g@ES`\u0005NI\u001d\f[=", "/r5?T4>e#\f\u0001I(\u0001\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hm\u0001*QLJA", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidPaint implements Paint {
    private int _blendMode;
    private ColorFilter internalColorFilter;
    private android.graphics.Paint internalPaint;
    private Shader internalShader;
    private PathEffect pathEffect;

    public AndroidPaint(android.graphics.Paint paint) {
        this.internalPaint = paint;
        this._blendMode = BlendMode.Companion.m4120getSrcOver0nO6VwU();
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }

    @Override // androidx.compose.ui.graphics.Paint
    public android.graphics.Paint asFrameworkPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAlpha(float f2) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAntiAlias(boolean z2) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.internalPaint, z2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo4051getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo4057setColor8_81llA(long j2) {
        AndroidPaint_androidKt.m4063setNativeColor4WTKRHQ(this.internalPaint, j2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public int mo4050getBlendMode0nO6VwU() {
        return this._blendMode;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo4056setBlendModes9anfk8(int i2) {
        if (BlendMode.m4089equalsimpl0(this._blendMode, i2)) {
            return;
        }
        this._blendMode = i2;
        AndroidPaint_androidKt.m4062setNativeBlendModeGB0RdKg(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getStyle-TiuSbCo, reason: not valid java name */
    public int mo4055getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public void mo4061setStylek9PVt8s(int i2) {
        AndroidPaint_androidKt.m4067setNativeStyle5YerkU(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeWidth(float f2) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public int mo4053getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public void mo4059setStrokeCapBeK7IIE(int i2) {
        AndroidPaint_androidKt.m4065setNativeStrokeCapCSYIeUk(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public int mo4054getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public void mo4060setStrokeJoinWw9F2mQ(int i2) {
        AndroidPaint_androidKt.m4066setNativeStrokeJoinkLtJ_vA(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeMiterLimit(float f2) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public int mo4052getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public void mo4058setFilterQualityvDHp3xo(int i2) {
        AndroidPaint_androidKt.m4064setNativeFilterQuality50PEsBU(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public Shader getShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setShader(Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public ColorFilter getColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setColorFilter(ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setPathEffect(PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect);
        this.pathEffect = pathEffect;
    }
}
