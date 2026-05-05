package androidx.compose.material3.carousel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u0017\u007f\u0007lkA0R\u0005P.hS2şs{B$c$wCCU(\u0007*ޛWNu\u0006vJp\u000bK\u000f\f\u0019\u0001jBI]ތe\u0012%2JoE:SoSʠ\u0011td\u0004X1Cx|ڱ\u0005\u001a8HX\r\tMc\f@;ptH^%M3\u001eB\nL-\u0019\u001e\u000bu\u0015J\u0011?kIG)\u0013kRNUp^\r}\u0011TY?\r%cN/N=M\u0015SW3\u000b`\\W\u0003msm\tv9?+wu\b:f\u0013,\u0015YS=a\u0001:t\u0005\u007fd<+9d{K~\u0012X\u0002\t\u0003%B\u0014\u0010\u0016'v7[*-\bVY\u0003\tk@~\u0019\u000fF\u000e\u000fy6E)079N3f\u007fek\u001d\\O\u0014\u0005;7ƹ\u007f͙Ĳ_V\u0014z#6\u001d\u001c_Mi@k_~\u000egQ\u0006\u0004\u001ff2.\u0012E_\u007f]\u007fA2%*O[g%Qo\u0010N\\g%\t)na\u0007jHn$5\u0016\u007f@\u0017*rD\u0013\u0013\u001cTbdD\u0011{ \u0005\u000b\f'+ \u000b{\u0003!m.\\o\u0001i\u0019[\u000e\u000e3;~7\br\u001c\u0012eXv3cU\u0014\u0014of\u000f\u0014m@)\u0005)rPT$Z\u000b*xøTн\u0014w\u0004ͩ\u001f\u0018!5WqJ8\u0003վ%Å\u0019H\u000bٜ\u0013M\u000b\u000ewZ\u0017\u0012Uԡ?ʗ\u0007i,ڏY\r^b\to\u0016| ؖ\t˃&-Iٛ\u0006+4\\:nD~3\u0007-|.O>չIƥp\u0016}ɝݫ \u001b\"<WȟYA\u000eɘ-T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loHta6Yv\u000bOWU\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loHta6Yv|", "u(E", "4ha@g\rHQ\u0015\u0006^g+|\u001c", "", "4nR._\u0010MS!l~s,", "", ">he<g\u0010GR\u0019\u0012", ">he<g\u0016?T'~\n", "Bl_\u0018X@EW\"~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loHta6Yv\u000bOWUjKZ}#\u0014&a\u0012W+b", "/cS", "", "Ahi2", "7r0;V/H`", "", "1qT.g,$S-\u0006~g,\u000bz3t\u0003\u0013\u007fQ\u000b&", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001ej", ":`bA96<O b\u0004],\u0010", "7sT:@(B\\t\u0012~l\u001a\u0001\u001e/", "1`a<h:>Z\u0001z~g\b\u0010\r=S\u0004={", "7sT:F7:Q\u001d\b|", "1qT.g,0W(\u0002Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "1`a<h:>Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cDh=\tl4N\u007f6\u001d", "1qT.g,0W(\u0002Ve0~\u00127e\t7CR|\u001d%\u0012~`", "uE5\u0016\u001c\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`\u001fC~\u000eIz!<'G\u001e3z >[CB5\u001a\u001e)oeB\u0007J0\\\u0006|", "1qT.g,0W(\u0002eb=\u0007\u0018", "4h]1?(Lby\txZ3`\u0012.e\u0013", "7r2Bg6?T\u007f~{m", "=eU@X;", "7r2Bg6?T\u0006\u0003|a;", "\"l_\u0018X@EW\"~", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class KeylineListScopeImpl implements KeylineListScope {
    private float focalItemSize;
    private float pivotOffset;
    private int firstFocalIndex = -1;
    private int pivotIndex = -1;
    private final List<TmpKeyline> tmpKeylines = new ArrayList();

    private final boolean isCutoffLeft(float f2, float f3) {
        float f4 = f2 / 2;
        return f3 - f4 < 0.0f && f3 + f4 > 0.0f;
    }

    private final boolean isCutoffRight(float f2, float f3, float f4) {
        float f5 = f2 / 2;
        return f3 - f5 < f4 && f3 + f5 > f4;
    }

    /* JADX INFO: compiled from: KeylineList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\u000b8é6B\r+4\u0012}\u000fnjG6L͜P.`_2şqڗ::ӋTqq:\u0016-\u000e&\u0017Ofg\u0016oZ^\u0019E'\u0006D{̶0Ic|&\u0019\u001d:Zom4\u0014ە>\u0002g\u0003?\u001d `%~ҍ\u0006I58R(v)ŏ{\u0012\u00180NpRR;N5 \u0018\u0006L\"\u0019\u001e\u000bj\u0015ɫG5nH:;\u0003\u0018E~-m<\u0015O#E\u0003&Sɏbf2NDM\u0015SaI߮Q$F\u0011N\n=3xmާ*\u001a\u0003e8p\u007fB\u0018ۣS\u0013eö>^\u000bSn\u0011w:]ccP<)Þ~\u0002\u0015ɝ\u001c\u0010\f-V5Ǐ\u001ew"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loHta6Yv\u000bOWUjKZ}#\u0014&a\u0012W+b", "", "Ahi2", "", "7r0;V/H`", "", "uEIuI", "u(I", "5dc \\A>", "u(5", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f2, boolean z2, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                f2 = tmpKeyline.size;
            }
            if ((i2 & 2) != 0) {
                z2 = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f2, z2);
        }

        public final float component1() {
            return this.size;
        }

        public final boolean component2() {
            return this.isAnchor;
        }

        public final TmpKeyline copy(float f2, boolean z2) {
            return new TmpKeyline(f2, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public int hashCode() {
            return (Float.hashCode(this.size) * 31) + Boolean.hashCode(this.isAnchor);
        }

        public String toString() {
            return "TmpKeyline(size=" + this.size + ", isAnchor=" + this.isAnchor + ')';
        }

        public TmpKeyline(float f2, boolean z2) {
            this.size = f2;
            this.isAnchor = z2;
        }

        public final float getSize() {
            return this.size;
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float f2, boolean z2) {
        this.tmpKeylines.add(new TmpKeyline(f2, z2));
        if (f2 > this.focalItemSize) {
            this.firstFocalIndex = CollectionsKt.getLastIndex(this.tmpKeylines);
            this.focalItemSize = f2;
        }
    }

    public final KeylineList createWithPivot(float f2, float f3, int i2, float f4) {
        return new KeylineList(createKeylinesWithPivot(i2, f4, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, f2, f3, this.tmpKeylines));
    }

    /* JADX INFO: renamed from: createWithAlignment-waks0t8, reason: not valid java name */
    public final KeylineList m2906createWithAlignmentwaks0t8(float f2, float f3, int i2) {
        float f4;
        int iFindLastFocalIndex = findLastFocalIndex();
        int i3 = this.firstFocalIndex;
        int i4 = iFindLastFocalIndex - i3;
        this.pivotIndex = i3;
        if (CarouselAlignment.m2890equalsimpl0(i2, CarouselAlignment.Companion.m2894getCenterNUL3oTo())) {
            float f5 = 0.0f;
            if (f3 != 0.0f) {
                int i5 = i4 % 2;
                int i6 = -i5;
                int i7 = ((i5 ^ 2) & ((i6 + i5) - (i6 & i5))) >> 31;
                if (i5 + ((i7 + 2) - (i7 | 2)) != 0) {
                    f5 = f3 / 2.0f;
                }
            }
            float f6 = 2;
            f4 = ((f2 / f6) - ((this.focalItemSize / f6) * i4)) - f5;
        } else {
            f4 = CarouselAlignment.m2890equalsimpl0(i2, CarouselAlignment.Companion.m2895getEndNUL3oTo()) ? f2 - (this.focalItemSize / 2) : this.focalItemSize / 2;
        }
        this.pivotOffset = f4;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f4, this.firstFocalIndex, iFindLastFocalIndex, this.focalItemSize, f2, f3, this.tmpKeylines));
    }

    private final int findLastFocalIndex() {
        int i2 = this.firstFocalIndex;
        while (i2 < CollectionsKt.getLastIndex(this.tmpKeylines)) {
            int i3 = i2 + 1;
            if (this.tmpKeylines.get(i3).getSize() != this.focalItemSize) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    private final List<Keyline> createKeylinesWithPivot(int i2, float f2, int i3, int i4, float f3, float f4, float f5, List<TmpKeyline> list) {
        float size;
        TmpKeyline tmpKeyline = list.get(i2);
        ArrayList arrayList = new ArrayList();
        if (isCutoffLeft(tmpKeyline.getSize(), f2)) {
            size = f2 - (tmpKeyline.getSize() / 2);
        } else {
            size = isCutoffRight(tmpKeyline.getSize(), f2, f4) ? ((tmpKeyline.getSize() / 2) + f2) - f4 : 0.0f;
        }
        arrayList.add(new Keyline(tmpKeyline.getSize(), f2, f2, i3 <= i2 && i2 <= i4, tmpKeyline.isAnchor(), true, size));
        float f6 = 2;
        float f7 = f3 / f6;
        float size2 = (f2 - f7) - f5;
        Iterator<Integer> it = RangesKt.downTo(i2 - 1, 0).iterator();
        float f8 = size2;
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            TmpKeyline tmpKeyline2 = list.get(iNextInt);
            float size3 = size2 - (tmpKeyline2.getSize() / f6);
            arrayList.add(0, new Keyline(tmpKeyline2.getSize(), size3, f8 - f7, i3 <= iNextInt && iNextInt <= i4, tmpKeyline2.isAnchor(), false, isCutoffLeft(tmpKeyline2.getSize(), size3) ? Math.abs(size3 - (tmpKeyline2.getSize() / f6)) : 0.0f));
            size2 -= tmpKeyline2.getSize() + f5;
            f8 -= f3 + f5;
        }
        float size4 = f2 + f7 + f5;
        Iterator<Integer> it2 = RangesKt.until(i2 + 1, list.size()).iterator();
        float f9 = size4;
        while (it2.hasNext()) {
            int iNextInt2 = ((IntIterator) it2).nextInt();
            TmpKeyline tmpKeyline3 = list.get(iNextInt2);
            float size5 = (tmpKeyline3.getSize() / f6) + size4;
            arrayList.add(new Keyline(tmpKeyline3.getSize(), size5, f9 + f7, i3 <= iNextInt2 && iNextInt2 <= i4, tmpKeyline3.isAnchor(), false, isCutoffRight(tmpKeyline3.getSize(), size5, f4) ? ((tmpKeyline3.getSize() / f6) + size5) - f4 : 0.0f));
            size4 += tmpKeyline3.getSize() + f5;
            f9 += f3 + f5;
        }
        return arrayList;
    }
}
