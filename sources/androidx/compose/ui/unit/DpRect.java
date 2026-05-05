package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeNGZS8\u0018s{:$c$\u007fIC٥\"}0\u0015WNmgtЂ`!¼-.Fx\u0019+\u0002T!\u001e'\u0015FRsM3eok:pxD\u000782P;ѩ\t\u0001(.\t3\u0007~QP$\u0012^F\u0001>`\u0014e\u0005H\u0018\u0016B.\t6\\\u0016TFLzfR/Q\tݦFN5ix\u0011[#^TU\u0013=Ҵ\u001fӡ?6Æ\u0014Ǭ٨\u0007\tXrM\u0011\b\u0006K\u001d\u0001'U1\u0010לXΥW~ѥ\u0014ۀ̠\u0011_x?j\u0013\u001at\u001aACO\u0012Q\u0017˲)Ĵyzʗ;ǉ؝\n)NI;(/\u001c\u001cO\rr\u0002F\u0017٣_݆~y̡5ЍӾ\u000451V)t\u001a\u001bI7f7*˜=$)\u0001|&sT<fE!Zw_8i@kN~\u0010_={\f\tb0046M\u007f=\u0005).E+}ڊ8ٳ ǽɘLFm\u0016\u0013\u00011dws`@P\u0011F=8,$\\Zc3j\u0017ՐYt\u0018[@l\u0007,-Yٕ[@C/K(N}\u00100ӫL.,38~7\bt\"\u0012.\u07b2`ܡ4ȡԨ\u000f`؏z\"G<p\u0014hhH^\u001aft*(?Vx`\u001a\nIf\fA8uurف.״\u0018¢ŢG\u0002ٿFO\u0005\tmix\u0012\u0005dA0\u001bk*\u0006\u0017\u000f!~~w\u007fxw23dxΒC۔4ӧƘT!מ8\u000b+\u0007\r\u0003\u0010Im^UX\u0005\u0018{h\n.f<GXG=A\u00155-\tĐ/ןKǩхPLɟ+\t\u0005y\u001dJx0m\u001cx|Dbp_]bϢ\"\u007ffu)ϊ\u0001.xiF\u0001fϳX4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "", "=qX4\\5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "uI9\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", ":dUA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "Bn_", "@hV5g", "0ncAb4", "uE5\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u000fb;M]!FY2\f\u0002X0M>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "5dc\u000fb;M]!FY2\f\u0002X0M", "u(5", "\u0014", "5dc\u0019X-M\u001bwRZc{}pma\t1\u0006O|&\u001bQx\u001c", "5dc\u0019X-M\u001bwRZc{}p", "5dc\u001f\\.Ab`]N>1L\n\u0017${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u001f\\.Ab`]N>1L\n\u0017", "5dc!b7\u00062l^\u007f.-dG+n\t2\u000b<\u0010\u001b!P}", "5dc!b7\u00062l^\u007f.-d", "1n\\=b5>\\(J", "1n\\=b5>\\(JB=\u007f\\\u000e~fg", "1n\\=b5>\\(K", "1n\\=b5>\\(KB=\u007f\\\u000e~fg", "1n\\=b5>\\(L", "1n\\=b5>\\(LB=\u007f\\\u000e~fg", "1n\\=b5>\\(M", "1n\\=b5>\\(MB=\u007f\\\u000e~fg", "1n_F", "1n_F (\u0012C\u001eb\n-", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWL\u007f)D#\\+$m\u0014=#", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public /* synthetic */ DpRect(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    public /* synthetic */ DpRect(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    /* JADX INFO: renamed from: copy-a9UjIt4$default */
    public static /* synthetic */ DpRect m6710copya9UjIt4$default(DpRect dpRect, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = dpRect.left;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = dpRect.top;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = dpRect.right;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = dpRect.bottom;
        }
        return dpRect.m6719copya9UjIt4(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations */
    public static /* synthetic */ void m6711getBottomD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations */
    public static /* synthetic */ void m6712getLeftD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations */
    public static /* synthetic */ void m6713getRightD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations */
    public static /* synthetic */ void m6714getTopD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM */
    public final float m6715component1D9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM */
    public final float m6716component2D9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM */
    public final float m6717component3D9Ej5fM() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM */
    public final float m6718component4D9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: copy-a9UjIt4 */
    public final DpRect m6719copya9UjIt4(float f2, float f3, float f4, float f5) {
        return new DpRect(f2, f3, f4, f5, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return Dp.m6643equalsimpl0(this.left, dpRect.left) && Dp.m6643equalsimpl0(this.top, dpRect.top) && Dp.m6643equalsimpl0(this.right, dpRect.right) && Dp.m6643equalsimpl0(this.bottom, dpRect.bottom);
    }

    public int hashCode() {
        return (((((Dp.m6644hashCodeimpl(this.left) * 31) + Dp.m6644hashCodeimpl(this.top)) * 31) + Dp.m6644hashCodeimpl(this.right)) * 31) + Dp.m6644hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m6649toStringimpl(this.left)) + ", top=" + ((Object) Dp.m6649toStringimpl(this.top)) + ", right=" + ((Object) Dp.m6649toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m6649toStringimpl(this.bottom)) + ')';
    }

    private DpRect(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM */
    public final float m6721getLeftD9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM */
    public final float m6723getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM */
    public final float m6722getRightD9Ej5fM() {
        return this.right;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM */
    public final float m6720getBottomD9Ej5fM() {
        return this.bottom;
    }

    private DpRect(long j2, long j3) {
        this(DpOffset.m6699getXD9Ej5fM(j2), DpOffset.m6701getYD9Ej5fM(j2), Dp.m6638constructorimpl(DpOffset.m6699getXD9Ej5fM(j2) + DpSize.m6736getWidthD9Ej5fM(j3)), Dp.m6638constructorimpl(DpOffset.m6701getYD9Ej5fM(j2) + DpSize.m6734getHeightD9Ej5fM(j3)), null);
    }

    /* JADX INFO: compiled from: Dp.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3h<}Au!*VGEt\n", "", "u(E", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
