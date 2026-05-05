package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u0003\u001eIي8\u000b<N\u0007Ӭ4\u0012\u0006\fnj?5LeVLZS@\u000fs{:/c$\u007fICU \u0001*\t]Wo˧vJhŏK\u000f\f\u0018\u0001j:o]ތc\u0017%˰rom2}uM;ptd\u0004N2b.\u007fڎ\u0011 0H\u001ew\u0013Cy\u000e\"6FpHU%M3\u001e\"\fD \u000f#tg|:Xrc:=)\u001bipR7e6|[\u0014^TU\u0011\u0007g$+N?M\u0015SW\u0013\rX[M\fWqk\tx--+W}o6\u0007\u0004$!1O\u001bh\u000b,l\u0007a`:4Y[sWV\u000e6\u0006\u0013\u0002\u001d>\u0014\u000e4&v:ǉ\u001ef\u0016\u001d{\u0006\u0001sXP0\u007fr\u0006\t\u0004N\u0019;~aN\u007fӬf\u001apI=f7*\u0004=\"1&\u0007!\noTֲ\u0015cZ\u0006wIQnX\u000fbRfK\u0015\u001cvr\u0004:\u0004^F.WB\u0094.g7EiQ)1m\u0012Hrf%\u00117èUׂVHH̎?+E5!\u0012jFt\u0005\u001a]\u0003d¯\u0015S$\u0381\u001f\u007f\u000e#.mHK/&(N}jȬnSe܃=1lIg\u0002<\u001de>v3cUӒ\u0014gZΘ,ABv\u0013m7Qa\u0012r\\V&ĘLp\u0018Ǯ\u0014FT\"!G\u0010\u0001*7D1G`ČL\t&ՓY~\u000fvh}`\u000eb:<\u0003\u0018(ڲ\r\u0007Xʔ\tqm\u0011WAMo05YQc\u001dłY(pؔ\u0015%\r\u0018\u0002\u0015\u0018vZadlD\u0011\f@°\u001a\u001eQS5Y!,O8@\u000bEEzvϯUS\u001a\u05fd\u0013~\u007f-I}~v\u0016t\t,\u000fnߝSZ\u001fǱ\u000f`xB\u0016yѩ}\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u007f\"rqD\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u0007\u001fga\u000f", "", "<`\\2", "", "@nc.g0H\\", "", ">he<g\u001f", ">he<g ", "AbP9X\u001f", "AbP9X ", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "1kX=C(MVwz\nZ", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "1gX9W9>\\", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\!aww(PtAr61#\u000e/;t_\u0015QQJA\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002 C", "5dc\u0010_0I>\u0015\u000e}=(\f\u0005", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001d\\=Hb\f", "u(5", "5dc\u001d\\=Hb\r", "5dc\u001fb;:b\u001d\t\u0004", "5dc V(ES\f", "5dc V(ES\r", "Ahi2", "", "5dc \\A>", "u(8", "5dc!e(Ga z\nb6\u0006{", "5dc!e(Ga z\nb6\u0006|", "3pd._:", "", "=sW2e", "", "5dc", "7mS2k", "6`b566=S", "7sT?T;H`", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {
    public static final int $stable = 0;
    private final List<VectorNode> children;
    private final List<PathNode> clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public /* synthetic */ VectorGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? "" : str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0.0f : f2, (i2 + 4) - (i2 | 4) != 0 ? 0.0f : f3, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 1.0f : f5, (i2 & 32) == 0 ? f6 : 1.0f, (i2 + 64) - (i2 | 64) != 0 ? 0.0f : f7, (i2 + 128) - (i2 | 128) == 0 ? f8 : 0.0f, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? VectorKt.getEmptyPath() : list, (i2 & 512) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final String getName() {
        return this.name;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, List<? extends VectorNode> list2) {
        super(null);
        this.name = str;
        this.rotation = f2;
        this.pivotX = f3;
        this.pivotY = f4;
        this.scaleX = f5;
        this.scaleY = f6;
        this.translationX = f7;
        this.translationY = f8;
        this.clipPathData = list;
        this.children = list2;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final VectorNode get(int i2) {
        return this.children.get(i2);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1 */
    /* JADX INFO: compiled from: ImageVector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!,\u0010\bDZc|\u0004G\b8\u000b<K\u0007\"2\u0012 \u0006߿pAFǏ\u0016N>Tc*=k*3lb2u[;\u0004\u001fD̴\t\u0018Uum\u0007J\t\u000b\nƻ\u0006f\u000ex-a[\t_\"\u000f`B\u001e>ݯQuEʠxv<\u0007.5ś<\u0001"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EB\u000e\u0013\"Js\fJ@65W\r*D7\u0007.KREx\u0016+\u001fxlw\u000br,[r6QY\rw", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u0007\u001fga\u000f", "7s", "5dc\u0016g", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "6`b\u001bX?M", "", "<dgA", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<VectorNode>, KMappedMarker {
        private final Iterator<VectorNode> it;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(VectorGroup vectorGroup) {
            this.it = vectorGroup.children.iterator();
        }

        public final Iterator<VectorNode> getIt() {
            return this.it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        @Override // java.util.Iterator
        public VectorNode next() {
            return this.it.next();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<VectorNode> iterator() {
        return new AnonymousClass1(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return Intrinsics.areEqual(this.name, vectorGroup.name) && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY && Intrinsics.areEqual(this.clipPathData, vectorGroup.clipPathData) && Intrinsics.areEqual(this.children, vectorGroup.children);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }
}
