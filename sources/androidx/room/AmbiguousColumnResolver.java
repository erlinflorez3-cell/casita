package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
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
/* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6B\u0005\"4\u0012\u0006%nʑA0R\u0005P\u008cZS8\u0015sڔ<$q$yّCU0}*ޛWNuvvJh\u0017KƤ\u000e\u0016\u000fj4I[xe\u0012\u001dEJoE8Sۖ=Oś%63\u001fj#Q\u0014 A\u001f0HǘzzQKTf>A\t:\u0001\u000fm\u0007 Ň\u0014AP\u0011,`\u007fZFP|cJ13\u00030E|,\u000e5-Y\u0013Fb-%|q ;@}8C,\u0004\t\rRiG\u001b? F5~51C[\u0004_F^\u0010\u0016%+\u0016\u0010\fw6^\u0015Q\u000f\u000eU6\u0016c\u0014\u001e\u001c4\u0010z*\u000fl\u000e\u001c\n?N>/*f6\u001bay#]N^\u001adR\u0002\u000bad'S\u000fcMG,~oq=)Ne\u0005\u0015\u000f.#/w1cd\u0014p\u0017+T&^_VP?XN8[k\u007fJpĊ\u0006*\u0012C\u00103=\u0010)4''G[g8Oz2RR}\u000f\u000bpjci\u0001Xn1\u001f&EA!\u0018jLt\u000b{RdXZ!{+\u0003\u0016D\r˙$\\\u0006Tǂ),"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;#", "", "u(E", "2eb", "", "\"", "1n]AX5M", "", "1ta?X5M", "", "2d_A[", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@`Q6a\u0012:`$lzZ9z\f", "\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f0;yD%$Fk@\u0017k5$", ">`cAX9G", "", "", "=m7.f/&O(|}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;u\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9C|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001c\u0001Pu", "@db<_=>", "", "@dbB_;\u001c] \u000f\u0003g:", ";`_=\\5@a", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q6v}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019~a*\u0002", "\u001b`c0[", " dbB_;\u001c] \u000f\u0003g", "!n[Bg0H\\", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    private AmbiguousColumnResolver() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @JvmStatic
    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String strSubstring = resultColumns[i3];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strSubstring.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i3] = lowerCase;
        }
        String[][] strArr = mappings;
        int length2 = strArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            int length3 = mappings[i4].length;
            for (int i5 = 0; i5 < length3; i5++) {
                String[] strArr2 = mappings[i4];
                String str = strArr2[i5];
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = str.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr2[i5] = lowerCase2;
            }
        }
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String[] strArr3 : strArr) {
            CollectionsKt.addAll(setCreateSetBuilder, strArr3);
        }
        Set setBuild = SetsKt.build(setCreateSetBuilder);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length4 = resultColumns.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length4) {
            String str2 = resultColumns[i6];
            int i8 = i7 + 1;
            if (setBuild.contains(str2)) {
                listCreateListBuilder.add(new ResultColumn(str2, i7));
            }
            i6++;
            i7 = i8;
        }
        List<ResultColumn> listBuild = CollectionsKt.build(listCreateListBuilder);
        int length5 = strArr.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i9 = 0; i9 < length5; i9++) {
            arrayList.add(new ArrayList());
        }
        final ArrayList arrayList2 = arrayList;
        int length6 = strArr.length;
        int i10 = 0;
        final int i11 = 0;
        while (i10 < length6) {
            int i12 = i11 + 1;
            final String[] strArr4 = strArr[i10];
            INSTANCE.rabinKarpSearch(listBuild, strArr4, new Function3<Integer, Integer, List<? extends ResultColumn>, Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, List<? extends AmbiguousColumnResolver.ResultColumn> list) {
                    invoke(num.intValue(), num2.intValue(), (List<AmbiguousColumnResolver.ResultColumn>) list);
                    return Unit.INSTANCE;
                }

                public final void invoke(int i13, int i14, List<AmbiguousColumnResolver.ResultColumn> resultColumnsSublist) {
                    Object next;
                    Intrinsics.checkNotNullParameter(resultColumnsSublist, "resultColumnsSublist");
                    String[] strArr5 = strArr4;
                    ArrayList arrayList3 = new ArrayList(strArr5.length);
                    for (String str3 : strArr5) {
                        Iterator<T> it = resultColumnsSublist.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (Intrinsics.areEqual(str3, ((AmbiguousColumnResolver.ResultColumn) next).component1())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) next;
                        if (resultColumn != null) {
                            arrayList3.add(Integer.valueOf(resultColumn.getIndex()));
                        } else {
                            return;
                        }
                    }
                    arrayList2.get(i11).add(new AmbiguousColumnResolver.Match(new IntRange(i13, i14 - 1), arrayList3));
                }
            });
            if (((List) arrayList2.get(i11)).isEmpty()) {
                ArrayList arrayList3 = new ArrayList(strArr4.length);
                int length7 = strArr4.length;
                while (i2 < length7) {
                    String str3 = strArr4[i2];
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    for (ResultColumn resultColumn : listBuild) {
                        if (Intrinsics.areEqual(str3, resultColumn.getName())) {
                            listCreateListBuilder2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
                    if (listBuild2.isEmpty()) {
                        throw new IllegalStateException(("Column " + str3 + " not found in result").toString());
                    }
                    arrayList3.add(listBuild2);
                    i2++;
                }
                dfs$default(INSTANCE, arrayList3, null, 0, new Function1<List<? extends Integer>, Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list) {
                        invoke2((List<Integer>) list);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<Integer> indices) {
                        Intrinsics.checkNotNullParameter(indices, "indices");
                        List<Integer> list = indices;
                        Iterator<T> it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int iIntValue = ((Number) it.next()).intValue();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Number) it.next()).intValue();
                            if (iIntValue > iIntValue2) {
                                iIntValue = iIntValue2;
                            }
                        }
                        Iterator<T> it2 = list.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int iIntValue3 = ((Number) it2.next()).intValue();
                        while (it2.hasNext()) {
                            int iIntValue4 = ((Number) it2.next()).intValue();
                            if (iIntValue3 < iIntValue4) {
                                iIntValue3 = iIntValue4;
                            }
                        }
                        arrayList2.get(i11).add(new AmbiguousColumnResolver.Match(new IntRange(iIntValue, iIntValue3), indices));
                    }
                }, 6, null);
            }
            i10++;
            i11 = i12;
            i2 = 0;
        }
        ArrayList arrayList4 = arrayList2;
        if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList2, null, 0, new Function1<List<? extends Match>, Unit>() { // from class: androidx.room.AmbiguousColumnResolver.resolve.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Match> list) {
                invoke2((List<Match>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Match> it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                ?? Build = Solution.Companion.build(it2);
                if (Build.compareTo(objectRef.element) < 0) {
                    objectRef.element = Build;
                }
            }
        }, 6, null);
        List<Match> matches = ((Solution) objectRef.element).getMatches();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList5.add(CollectionsKt.toIntArray(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList5.toArray(new int[0][]);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, Function3<? super Integer, ? super Integer, ? super List<ResultColumn>, Unit> function3) {
        int i2 = 0;
        int iHashCode = 0;
        for (String str : strArr) {
            iHashCode += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                function3.invoke(Integer.valueOf(i2), Integer.valueOf(length), list.subList(i2, length));
            }
            int i3 = i2 + 1;
            int i4 = length + 1;
            if (i4 > list.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - list.get(i2).getName().hashCode()) + list.get(length).getName().hashCode();
            i2 = i3;
            length = i4;
        }
    }

    static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            list2 = new ArrayList();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i2 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i2, function1);
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i2, Function1<? super List<? extends T>, Unit> function1) {
        if (i2 == list.size()) {
            function1.invoke(CollectionsKt.toList(list2));
            return;
        }
        Iterator<T> it = list.get(i2).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i2 + 1, function1);
            CollectionsKt.removeLast(list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r(4\u0012}\u000enjG9LeN0Xݺ0%ӆ,4RZd\u0005S?c\u001a\u0016\"7P^kupbZ9FǇ\n\u0016\u0007ntPc\u0002u\u0012=3\tŪ@{T}GQ`#9Kۚ3jS\b\u0010\u0019\u001aXϺ@|\u0001CY\f*0nqjX\u0013M\u0013\u001c*\u0006l#Gɭ[0_DT\u0005]h<S\twPf)u/+LSіUo\u0014\u0005p6+n:{֭$\u001c\n\u0015bs?1@8ތ\u0004965-as\u00069ݼ\u0004\u001a\u001dۀg\u000fcw4bU`n\f?+}dׂT\u00140»\u0013}\u0013C\u0012\u0016Σ+Y"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f0;yD%$Fk@\u0017k5$", "", "<`\\2", "", "7mS2k", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "5dc\u0016a+>f", "u(8", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class ResultColumn {
        private final int index;
        private final String name;

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i2, int i3, Object obj) {
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                str = resultColumn.name;
            }
            if ((i3 & 2) != 0) {
                i2 = resultColumn.index;
            }
            return resultColumn.copy(str, i2);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        public final ResultColumn copy(String name, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ResultColumn(name, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return Intrinsics.areEqual(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }

        public ResultColumn(String name, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.index = i2;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4\u0012\u0006\rnj?4Je^\u008c\u0003SX\u000e,\u0015D(i$\nCiV*\b0\u000bgTwi~J\t\u000fq\u0012و\u001axx1\u001aj\u0007_*\u0015BD\u007f?aQ\u001e@˃dz>ӌ84(>\b\fQ)8H(v)Dƚ\u0010\u00188ϋ\t<X\u0015[\u000eܮ\u0016\u0010"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f+7z2!j", "", "@dbB_;+O\"\u0001z", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "@dbB_;\"\\\u0018\u0003x^:", "", "", "uKZ<g3B\\b\fvg.|\u0017xI\t7h<\n\u0019\u0017\u001dV\u00138\b!~i\r$>7|2[R\u0011/%", "5dc\u001fX:NZ(b\u0004]0z\t=", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001fX:NZ(kvg.|", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Match {
        private final List<Integer> resultIndices;
        private final IntRange resultRange;

        public Match(IntRange resultRange, List<Integer> resultIndices) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final IntRange getResultRange() {
            return this.resultRange;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }
    }

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eQLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?9Je^\u008cpaZ\u0015{}D$\nҕ BsT(>C\u0019Y\\g\u007ftZ\\\u001bC=\bDyz0WX\u0011]@\u0013BF}DKM\u001eA˃dtD\u000bhA0D\u0012\u0005/\u001eZL\u001e\u0004\u0013CyÈXت@AI`\u0010e\u0005H\u0016ĂB&\tȦtiT=Vt.O=#\u001boRP7_^~{\u000eТX-\u0015Ǹy 1IE?e4a\b\u001fR\nCƄCwEݛ\u0001)-6W{ɷ:g"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f1ErD-\u0019rj\u000f", "", ";`c0[,L", "", "\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f+7z2!j", "1ne2e(@S\u0003\u007f{l,\f", "", "=uT?_(Ia", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\f?1", "5dc\u0010b=>`\u0015\u0001zH-}\u0017/t", "u(8", "5dc\u001aT;<V\u0019\r", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001ci,KZ\u0015\n\t", "1n\\=T9>B#", "=sW2e", "\u0011n\\=T5B]\"", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Solution implements Comparable<Solution> {
        public static final Companion Companion = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public Solution(List<Match> matches, int i2, int i3) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i2;
            this.overlaps = i3;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int iCompare = Intrinsics.compare(this.overlaps, other.overlaps);
            return iCompare != 0 ? iCompare : Intrinsics.compare(this.coverageOffset, other.coverageOffset);
        }

        /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u0006%njO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u001b]S\u007fg\u001dL\u000b\u0015Q\u0015\u001e\u001c\tl<I\u0004\u0001\f\u0019_APpW3{qެ=f|Ȃ\u001d\"8%F}ڷ\u0005#"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f1ErD-\u0019rjwdm4Yr0KVW\u0002", "", "u(E", "\u001cNN B\u0013.B|hc", "\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f1ErD-\u0019rj\u000f", "5dc\u001bB&,=\u007fniB\u0016e", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/[0xD\u0003'!W}kF}5=bj Ew\u001d?MPyY>%%weC\u00109", "0tX9W", ";`c0[,L", "", "\u001a`]1e6BR,H\bh6\u0005R\u000bm|,}P\u000b'%%y\u0015L~.\"Y\f*>~\u0016;\f+7z2!j", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            public final Solution build(List<Match> matches) {
                Intrinsics.checkNotNullParameter(matches, "matches");
                List<Match> list = matches;
                int i2 = 0;
                int last = 0;
                for (Match match : list) {
                    last += ((match.getResultRange().getLast() - match.getResultRange().getFirst()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((Match) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((Match) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last2 = ((Match) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last3 = ((Match) it2.next()).getResultRange().getLast();
                    if (last2 < last3) {
                        last2 = last3;
                    }
                }
                Iterable intRange = new IntRange(first, last2);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it3 = intRange.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        Iterator<T> it4 = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().contains(iNextInt)) {
                                i4++;
                            }
                            if (i4 > 1) {
                                i3++;
                                if (i3 < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                    }
                    i2 = i3;
                }
                return new Solution(matches, last, i2);
            }
        }
    }
}
