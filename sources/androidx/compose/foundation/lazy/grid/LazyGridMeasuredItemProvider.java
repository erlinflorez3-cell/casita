package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
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
/* JADX INFO: compiled from: LazyGridMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RkP.XS2\u000f\u0002{<$a'yCI٥\"}(\u000bWNu\u0006vJp\u000bKƤ\u000e\u0016\u000fj4I[\u0001c0%˰ruO5]ok9\u000fsv\"&72<\b\u0006\u0019\u001aXJ z\tFc\f@4PtHW%M3 Ū\n>.\bf=uZNH\u001b]j31\u0010\u0002B|-\u00104\u000b[%F\u00036=|o.CBM4C4\u0004\u0007\u0015cs?1E\"A\u0013z?'YO$aDk\u0018\u001a%-_\r\f\bTp5Un\"?+}z{T\u001c@\u0010z*\u0013l\b\u001c\u001f?H\\3`\u000bܕ\rޗϢvUFj\u0010y\u000b6\t}N\u0017S\u007fc/G(~Q\u0010AIRE\u0012\u001d\rL:1r/sl\u000e\u000f\u001bKX\u0006jIQnCxR\u0018kUm2vŠ\u0001Ï˙4I\u0006L\n/vG3Ss9Q!\u001c\u0006VQ\u007fv3f\u0019Wwj`@PtF;8\"$Zrj5o^jp,?dbhϮ|ܱ˙$^}[/E`Z]m\u0002j{c`ɛ1Ϭ;Yv\u0088^cG_K5\u007fefУTλ\u0018?DϵUgtJk\f\te^fĘLn(y\u0002N\\\u0017c>Mt44Z5o¥\u0017Ƞ\u0007\u001eJˆҔ\tdbk\u0016љpa#ҙmE"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d=\u007fG%\u0016Y\u000e[\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001c|g\u0018_/\f\u0005f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d(", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c49\u00041XPM,i(", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "2dU.h3M;\u0015\u0003\u0004:?\u0001\u0017\u001dp{&\u007fI\u0003", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Va4Q]R+\\_H$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:IR%[C\u001cqU3xU#Fu\\U,^>n\u001cn\u0005\\6H4!q\u0007\u0019r[.__\u0017\u0002", "9dh\u0016a+>f\u0001z\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;4v;+UM,o:nHi", "5dc\u0018X@\"\\\u0018~\u000eF(\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\rG`25[R\u0006%\u0010\u001d0", "1qT.g,\"b\u0019\u0007", "7mS2k", "9dh", "", "1n]AX5MB-\nz", "1q^@f\bQW'l~s,", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`]2", "AoP;", "1qT.g,\"b\u0019\u0007BHy\u000b\\\u001as\u0012", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00041'\"p0/\u00112qH\u000bju5z5V\"3\u0010@\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ-S\u0012Dg|\u001b\u001a\u0018>4w>k$\u0011{\"y@rOBns[TEDJ*`\u001ao*\\9\u001e3\u0014yn", "5dc\u000ea+&S\u0015\r\u000bk,", "5dc\u000ea+&S\u0015\r\u000bk,D\u0011\u0002K\u000f\"MF", "uH9\u0016<\u0010\u0002:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011p\u0018L\u007f$1h\u0002*@7\u001d*bW\u0005mA\"\u00142H5\u001cw\u000e[z&/LJ:l_r<w!Z\u0016$", "5dc\u000ea+&S\u0015\r\u000bk,DP2Bo+\u0007>", "uH8\u0016=o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012Ca\r=x8\u001d^O]N\u001bE9Ru\u000fGH\\<iRq!#\u0012bc", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LazyGridMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {
    public static final int $stable = 0;
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    /* JADX INFO: renamed from: createItem-O3s9Psw */
    public abstract LazyGridMeasuredItem mo1157createItemO3s9Psw(int i2, Object obj, Object obj2, int i3, int i4, List<? extends Placeable> list, long j2, int i5, int i6);

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* JADX INFO: renamed from: getAndMeasure--hBUhpc */
    public LazyGridMeasuredItem mo1132getAndMeasurehBUhpc(int i2, int i3, int i4, long j2) {
        return m1162getAndMeasurem8Kt_7k(i2, j2, i3, i4, this.defaultMainAxisSpacing);
    }

    /* JADX INFO: renamed from: getAndMeasure-m8Kt_7k, reason: not valid java name */
    public final LazyGridMeasuredItem m1162getAndMeasurem8Kt_7k(int i2, long j2, int i3, int i4, int i5) {
        int iM6592getMinHeightimpl;
        Object key = this.itemProvider.getKey(i2);
        Object contentType = this.itemProvider.getContentType(i2);
        List<Placeable> listMo1189measure0kLqBqw = this.measureScope.mo1189measure0kLqBqw(i2, j2);
        if (Constraints.m6589getHasFixedWidthimpl(j2)) {
            iM6592getMinHeightimpl = Constraints.m6593getMinWidthimpl(j2);
        } else {
            if (!Constraints.m6588getHasFixedHeightimpl(j2)) {
                throw new IllegalArgumentException("does not have fixed height".toString());
            }
            iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
        }
        return mo1157createItemO3s9Psw(i2, key, contentType, iM6592getMinHeightimpl, i5, listMo1189measure0kLqBqw, j2, i3, i4);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
