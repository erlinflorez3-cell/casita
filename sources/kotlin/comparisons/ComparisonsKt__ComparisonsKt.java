package kotlin.comparisons;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\":\u001f\u007fјnjG?LeN1ZS8\u0015s{:-c$\u007fّCU \u0004*\teNog\u0005Jb\u000bI\u0010\u001eR\u0007̓DYezm\u0012U2pn(9]qM9't\u0015\u0006@4(\u0600\b\u0005120J\u001ex\u0013U[\u000e\"0\u0007pJZ\u001dS\u0015\u001a\u0018\u0007T\u001f/\"\u000bj\u0015ȬNɆ\\ŽGz\u0011݃Z^7a@|\u0014\rtS\u0010\u0013\u0007c.+\u00077\u0014\u0016EU\tޗ`[o7MvU\u001fx=-*Y\u0006g8h\u007fZ\u0015;W\u001dc\u0003&b\u0006g_:+YR\u0012Qp 8y\u000b{S<\u0014\u0016\u0016-X.3\u001b|\u0007<7#uՂDP\u0010eZX\tʨN'5\u0002C+\u007f\u001b\u0015PJA)PG{K\r|$!p'żb\u000e\u0001\u0017!S\u0006YaiNF`b\u001a]CЧ\u0014p)\nX\u0003\u0019O\u00103\u0002߾>\u0017k?::S3q\u0004VF\u007f\u0003\u0015bxS0RXB2n\\?X\fRɶJ×\u0004ߘh\u0011f6)],V\u0017}N\u0013N[`B1' N\u0016hHkm_\u0010ɘ=fgqtm\u001cYQpC7acVab~$ELb\u000bY|A\u0002\u0010\t_nη8̄iݘ\u0010TRX$#BA\u0002\u001cz,_\u0018E\u001bX\u0005.B\b|g`zj\u0016зb3D\u0005o#\u0003\u00111hjy\b{\tM2ʉp\"sI\u007f4\u0002.e&nؔ\r#M\u0007R\u0001wyRIZn.\u0002e}0\u0016`9a1M\u0013U\u0007W5HΗK˜qόix 2\u0013|(\u001b[r4Ԗ\u0016j\u00190pjPP\u0003\u001bR|l\u007f;\nz~@av\u0001Uql\rq=\u0010rè]<\\G\u0015D-.=\u0001\u001e.\u001d73ξ5\u001dF{\"<-a$i 2\bp'&;e4Bq\u0018\bta_B;~Ii\u0007N(4l\tC^i&\fp\fzه9ɞ@ЬވZ8[\u001cGUt\u0017D\r\u001fb{<\u0019̊\f4^c8\u0001[}Z^s)\u001f[kg4m{\u0011\u0019O'$\u001b\u00127m\".M\"fW)\t@\u000e\u0004\u001eFAAc\u001b;7(b/j\u000e+Udk\u0016\u0010A\u007fVg\u001f\u001dBBy<l\r\u0003|\u000bY߃\t`Sr9\u0006\u000f\u000f'3L\u0005U3\u000bևTTOe8\u007fa%9\u001fx\\\u0017fk+tXG)@XG\u000buuQR\u001aJ\u0014K/Ԗ{oR@F{\u0006J(\u001f?ܱ!_=8=\f\u0006t\\f\u000f\u001evT^\"o~\u000b~\u001e<P\u00179\u001c\u0016Λuݧ,ًϸ{7Q-\u0019\\R=\u001f\f+of\u001d3ݢC-mMx!?{\u001eSk\u0002\u0016.8'JtQze\u0013~$m1@\u0015\u0002(r\u0004\u0019\u0013\u0017 \u00146Zz\u0003\n4\tLN070\u0016\r_2w̝D)1\u0002\u0014Tc\r\u0007 {|spe\u000bIf_Ubt=R-\tmM\r\u0014xf@Îa \u0001\u0017\u0010\u0016%&e66fA;]z\u0001\u0005{Sk\u000fA.2*\u00100\u0019Z.\u0002/{\f\u0003pT\u0007\u0016[bS˾r\t\u0005rRY\u001e^1(\u0013xRÑ\u001a\u0015=Vu)'DJ\u0003 z.}\u0019MZuOp\u000b\u0014G_%g11@;=8У}(\u001f\u00111R\u0013\r\u000e3Z\u001d\u0003\u0004mƨ=F\u001b=H&B,}h\t\u0379[E~Bf-)9\u001fHrL0Bl\u001c2:\u00183o\u0018y\t%<\u0016q\u001d\u0018{j0TE6\u0007ε\u000f\rg\u007fAmJs}rQ3Uͽ!o%I>My\\+\u001c\u0004{IEM\u0012Uwi<MEG4x\u001c@^\u000b?**Ԗ\u0004#(E_`ZwjIn\bg\b,ġFn\u000b#uka{\u001a0oѢ\u0004d\"a\u0013B\u00138'^V:=n\u0017E\u0014h(\n-\u0013U\u0016G\u000fL)\u0012\u0018\u001d\u001cUƀN+qx]1l]\u0003\u0013\"\bR`oQ\u0012WP[:\u0006s\u0012\u0003bSp}So\u0010~\u0012k\u000e$y7ׯn\u007f\t-()[v\r6\u000bw6Gr\rP\u000fj^\rC$X\u00142FX'\u0004\u000eJ'\u0015A20yQI\"VB!{\u0012{'\fȷujoOesh=\u007f39l3^Egl\u0005\u001c!*e[-\u000esCBWZDϖ:XL\u000esc1\u0018T|J٪}0v0/\u007f!ֳ_\u0019l-Zm%u\u0001Bb}[\u0013\u0010\u0014=gpbUi-W\u0003#\u0012GÈ!\u000bFcI43sS1lzpbYW\rm\u0010\u0010abz95\bM1Y]|Xu?_WO\u0007\u001c&7$\f\u0014:a\u0016\u0017\u0018\u0011hα\t֎5̅A5Yv)vRl\u001fz;\f\\\u000b![\u0016?\u0016\u0011)\u001c\u0014<\u007fB2Ȩ~\tgQpz8m\u0018v\u0005[]EquG=\u001aw!e__Zn0]\tV%`>T#\u0006 ܮ6aBPW/\u007f]sqpԔd`Wa\u0013l`v\u007fttfVoN>Xl_f_\u007f+Q\u000bj7c7ֻGǏa۪DwDf\u0003)\u0011\u0003[a]\u0014eC_)w5J\"(\"2^EIPԑ\u001cj\n\b%}m3|\r\u001e+e\u001b\u0015@vrJlcN`\u001cq1@HrR,/j'4h\u00182\u001e\u0012\r\u00052oiQ\u007fyMu+ց)·\u0019ѡo&U?+\u0013)>\u00182\u0014X)mAb50\f\u0006e\u0012!|UnGо\n3wsU3k&Q\u000eyy0\r2\u00122b3)_kr\u0011$.,x7qJbY\u0016\u001a&/ͣ\u0018\u0015m\nv33:2'\u0007سF\u0018\u0011nMyU\u001bk\u000e=v\u000e\u001aBoNs-]w6Q=\u001ce-HsÒwݑJɕ\u0006m9f&Y&<_L4u\n<=\u001cB\t\u007f\u0004w\u0010Ra{D\u001dܓ\u0016b\\{J}W\u0003Zjy-\u0003`vp|v\u0017an>FC\u001a\u0007L\u0014ASP6oo.\u007fĆ\rz#YaKj.T\u0013.fXK\" Xg-\u000eܝ\u0006\u000fQ\u0007*\u001c?h\tBQ\u001b\u0002\u0012wea\"\u0016T\u001aIuވ}٘5ט\u0018\u0003G1\f`n7w^OUQ\r\u0010t_\n\u00020xG<[@1a\u05cd\u001cJ\u000f\\`\u000fQ\u00073.%u[\u001dO\u0017\u0012*\f\"{D\u00161u\u000eN\u0001KanƯtzdn\nZ\u00108\u000e\n'ÚQ\u001f\\\u000e\u0003\tFݿ]ʔOz\tCNש<HBǱ\f9"}, d2 = {"1n\\=T9>0-", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\"", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "Ad[2V;H`'", "", "uZ;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzT\u001b*^?\u0005{C\"\u001c2?C\u000fn([r6QY$", "\u0019", "1n\\=T9:b#\f", "1n\\=T9>0-]zl*|\u0012.i\t*", "1n\\=T9>D\u0015\u0006\u000b^:", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ej,E", "1n\\=T9>D\u0015\u0006\u000b^:Y\u001d", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WvbH=", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k$4IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4XZ\u001d%", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}.$lh\u0003dm4Yr4C[X929xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s<\u0018\u001as", "1n\\=T9>D\u0015\u0006\u000b^:Y\u001d\u0013m\u000b/", "1n\\=T9>D\u0015\u0006\u000b^:Y\u001d\u0013m\u000b/:\u001e\u000b\u001f\"C|\u0012J\u0001.C?\r\u001a1K 6X?HoB(\u001evGH", "<`cBe(E=&}zk", "<t[9f\rB`'\u000e", "", "<t[9f\u0013:a(", "@de2e:>=&}zk", "@de2e:>R", "BgT;", "BgT;5@", "BgT;5@\u001dS'|zg+\u0001\u00121", "BgT;66F^\u0015\fvm6\n", "1n\\=T9Ba#\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "BgT;7,LQ\u0019\byb5~", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:79)9/8315o\u0003.+-\u001d-#,'%)\u007f(")
public class ComparisonsKt__ComparisonsKt {

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJg\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u0013tkQ8bgp0hRp\u000f2{d0i'\nKYWB\u007f8\b\u0016N.g5RҼ\u000fE\u0015\n$}"}, d2 = {"\n`]<a@F])\rS", "", "\"", RemoteSettings.FORWARD_SLASH_STRING, "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", AdkSettings.PLATFORM_TYPE_MOBILE, "1n\\=T9>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq1"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> $selector;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Comparable<?>> function1) {
            this.$selector = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            Function1<T, Comparable<?>> function1 = this.$selector;
            return ComparisonsKt.compareValues(function1.invoke(t2), function1.invoke(t3));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJg\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u0013tkQ8bgp0hRp\u000f2{d0i'\nKYWB\u007f8\b\u0016N.g5RҼ\u000fE\u0015\n$}"}, d2 = {"\n`]<a@F])\rS", "", "\"", RemoteSettings.FORWARD_SLASH_STRING, "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", AdkSettings.PLATFORM_TYPE_MOBILE, "1n\\=T9>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq1"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> $selector;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super T, ? extends Comparable<?>> function1) {
            this.$selector = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            Function1<T, Comparable<?>> function1 = this.$selector;
            return ComparisonsKt.compareValues(function1.invoke(t3), function1.invoke(t2));
        }
    }

    private static final <T, K> Comparator<T> compareBy(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.3
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t2), (Object) function1.invoke(t3));
            }
        };
    }

    private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new AnonymousClass2(selector);
    }

    public static final <T> Comparator<T> compareBy(final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(Function1[] selectors, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(selectors, "$selectors");
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(obj, obj2, selectors);
    }

    private static final <T, K> Comparator<T> compareByDescending(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareByDescending.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t3), (Object) function1.invoke(t2));
            }
        };
    }

    private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new AnonymousClass1(selector);
    }

    public static final <T extends Comparable<?>> int compareValues(T t2, T t3) {
        if (t2 == t3) {
            return 0;
        }
        if (t2 == null) {
            return -1;
        }
        if (t3 == null) {
            return 1;
        }
        return t2.compareTo(t3);
    }

    private static final <T, K> int compareValuesBy(T t2, T t3, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(t2), selector.invoke(t3));
    }

    private static final <T> int compareValuesBy(T t2, T t3, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return ComparisonsKt.compareValues(selector.invoke(t2), selector.invoke(t3));
    }

    public static final <T> int compareValuesBy(T t2, T t3, Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t2, t3, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t2, T t3, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iCompareValues = ComparisonsKt.compareValues(function1.invoke(t2), function1.invoke(t3));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return naturalOrderComparator;
    }

    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        return ComparisonsKt.nullsFirst(ComparisonsKt.naturalOrder());
    }

    public static final <T> Comparator<T> nullsFirst(final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        return ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder());
    }

    public static final <T> Comparator<T> nullsLast(final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    public static final <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return reverseOrderComparator;
    }

    public static final <T> Comparator<T> reversed(Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof ReversedComparator) {
            return ((ReversedComparator) comparator).getComparator();
        }
        if (Intrinsics.areEqual(comparator, NaturalOrderComparator.INSTANCE)) {
            ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
            Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return reverseOrderComparator;
        }
        if (!Intrinsics.areEqual(comparator, ReverseOrderComparator.INSTANCE)) {
            return new ReversedComparator(comparator);
        }
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        return naturalOrderComparator;
    }

    public static final <T> Comparator<T> then(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.then$lambda$1$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(this_then, "$this_then");
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        int iCompare = this_then.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
    }

    private static final <T, K> Comparator<T> thenBy(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                int iCompare = comparator.compare(t2, t3);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function1 = selector;
                return comparator3.compare((Object) function1.invoke(t2), (Object) function1.invoke(t3));
            }
        };
    }

    private static final <T> Comparator<T> thenBy(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.1
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                int iCompare = comparator.compare(t2, t3);
                if (iCompare != 0) {
                    return iCompare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt.compareValues(function1.invoke(t2), function1.invoke(t3));
            }
        };
    }

    private static final <T, K> Comparator<T> thenByDescending(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                int iCompare = comparator.compare(t2, t3);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function1 = selector;
                return comparator3.compare((Object) function1.invoke(t3), (Object) function1.invoke(t2));
            }
        };
    }

    private static final <T> Comparator<T> thenByDescending(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.1
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                int iCompare = comparator.compare(t2, t3);
                if (iCompare != 0) {
                    return iCompare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt.compareValues(function1.invoke(t3), function1.invoke(t2));
            }
        };
    }

    private static final <T> Comparator<T> thenComparator(final Comparator<T> comparator, final Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenComparator.1
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                int iCompare = comparator.compare(t2, t3);
                return iCompare != 0 ? iCompare : comparison.invoke(t2, t3).intValue();
            }
        };
    }

    public static final <T> Comparator<T> thenDescending(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(this_thenDescending, "$this_thenDescending");
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        int iCompare = this_thenDescending.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj2, obj);
    }
}
