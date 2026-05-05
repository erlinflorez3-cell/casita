package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004O%8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?5Le^.ZS@\u000fs{:%c$\bCCU \u0002*\t]logtPb\u000bQ\u0018\u000eǝ\u0001j:I]xc\u001c\u00152Xģo3{n}Rp~D\u0005882:\n\u0005/\u001cXI z\tFc\f@4Ϯt:`\u0012\u0016\u001d(-\u001e@6\u007fL^\u0018RDd\u0005]h3S\tw_f)u/+LURbE%v\u0010\"[DET-%\u0002\u0005O^i_\u001b? ^5l5FCI\"Y~l\u000e6-+}0\u000ev4{\u001dQ\u000f\u000eW/]\bcP<,@\u0017\n2T\u0004<)WL<S2f6\u0012cx\u0001zXP0br\u0004\t\nN\u0017S\u0004{?GD~Q\u0010^IRE\"\u001d\rL'1r/\u0003l\u000e\u000f\u0019c`\u0006{IQnAxR\u0018xUm2r+\u00168/HG.P,\u0015<C=7\n=S%y/`D\u0016zMlv\u0002\u0002RvDRr$VB\t:\\\u0015|\u0013qhT\u00070gۺ(Τ\u000b\n\u0010ʶ8^}C/-0PUqwt\u001eo\u00180GlG[~k<dgj\n̓SӒ\u0014aZΘdTJb\u001d^vDc\f\t^V#ĘLp\u0018Ǯ\u0014FT\u001a!A\u0010\u001d*DD=)^%H1\u001dRC\r\t\u000e\\\u0017!5\u0019\nɻѵi̾sէˏO[ʼsq\u0001K2\u0011n7ECWG'9&1v7\u0015#5\u0003\u0381\u0004Moն_Nr,\u0004]L5$1QW??#\u000f-+`\u001ac\nʆviiO\u0018@\t\fJ!I\u0003Fm\u0018l\u0001,\u000flxP+Ϣ$Ցbr+Ψ۰\u007f\u0003iI\u0001Ĕ\u007f\u0003\nc>O\u0012î]k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9x<\u007f$9b\u007fu", "", "9dh\u0016a-Ha", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9s<\u000b\t>Z\bu", "AsP?g\u0010GR\u0019\u0012", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;ckl", "5q^Bc\u0010GR\u0019\u0012", "5dc\u0014e6N^|\by^?", "u(8", "Adc\u0014e6N^|\by^?", "uH\u0018#", "5q^Bc\u0010GT#\r", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9oI\u00015@=\u0007!AC", "5dc\u0018X@\"\\\u001a\t\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "9dh\u001aT7", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000e5i%=MP#{;-\u0019P]D\\", "5dc\u0018X@&O$Fh:,h\r\f4", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u0016IN\u0011", "9dh\u001aT7|R\u0019\u0006z`(\f\t", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc g(Kb|\by^?", "CrT1", "", "5dc\"f,=", "CrT1>,Ra", "5dc\u001bX?M", "9dh", "2`c.>,R", "<nS2C6LW(\u0003\u0005g\u0016}", "9dh\u0016a-H", "@dR<e+.a\u0019}", "", "@dV6f;>`|\b\t^9\f", "", "7mb2e;\"\\\u0018~\u000e", "@dV6f;>`\u0001\t\f^\u0015\u0007\b/", "4q^:", "Bn", "1nd;g", "@dV6f;>`\u0001\t\f^\u001a\u0004\u0013>", "Ak^AC6LW(\u0003\u0005g\u0016}", "CoS.g,']\u0018~Xh<\u0006\u0018", "5q^Bc", "<df\u0010b<Gb", "CoS.g,=<#}z<6\r\u0012>O\u0001", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class Pending {
    private int groupIndex;
    private final MutableIntObjectMap<GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;
    private final Lazy keyMap$delegate;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public Pending(List<KeyInfo> list, int i2) {
        this.keyInfos = list;
        this.startIndex = i2;
        if (!(i2 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        int size = this.keyInfos.size();
        int nodes = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = this.keyInfos.get(i3);
            mutableIntObjectMap.set(keyInfo.getLocation(), new GroupInfo(i3, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.groupInfos = mutableIntObjectMap;
        this.keyMap$delegate = LazyKt.lazy(new Function0<MutableScatterMultiMap<Object, KeyInfo>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ MutableScatterMultiMap<Object, KeyInfo> invoke() {
                return MutableScatterMultiMap.m3651boximpl(m3661invokeSAeQiB4());
            }

            /* JADX INFO: renamed from: invoke-SAeQiB4, reason: not valid java name */
            public final MutableScatterMap<K, Object> m3661invokeSAeQiB4() {
                MutableScatterMap<K, Object> mutableScatterMapMultiMap = ComposerKt.multiMap(this.this$0.getKeyInfos().size());
                Pending pending = this.this$0;
                int size2 = pending.getKeyInfos().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    KeyInfo keyInfo2 = pending.getKeyInfos().get(i4);
                    MutableScatterMultiMap.m3657putimpl(mutableScatterMapMultiMap, ComposerKt.getJoinedKey(keyInfo2), keyInfo2);
                }
                return mutableScatterMapMultiMap;
            }
        });
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final void setGroupIndex(int i2) {
        this.groupIndex = i2;
    }

    /* JADX INFO: renamed from: getKeyMap-SAeQiB4, reason: not valid java name */
    public final MutableScatterMap<K, Object> m3660getKeyMapSAeQiB4() {
        return ((MutableScatterMultiMap) this.keyMap$delegate.getValue()).m3659unboximpl();
    }

    public final KeyInfo getNext(int i2, Object obj) {
        return (KeyInfo) MutableScatterMultiMap.m3656popimpl(m3660getKeyMapSAeQiB4(), obj != null ? new JoinedKey(Integer.valueOf(i2), obj) : Integer.valueOf(i2));
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final void registerMoveSlot(int i2, int i3) {
        char c2 = 7;
        long j2 = -9187201950435737472L;
        if (i2 > i3) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((-1) - (((-1) - (((~j3) << 7) & j3)) | ((-1) - j2)) != j2) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((-1) - (((-1) - j3) | ((-1) - 255)) < 128) {
                            GroupInfo groupInfo = (GroupInfo) objArr[(i4 << 3) + i6];
                            int slotIndex = groupInfo.getSlotIndex();
                            if (slotIndex == i2) {
                                groupInfo.setSlotIndex(i3);
                            } else if (i3 <= slotIndex && slotIndex < i2) {
                                groupInfo.setSlotIndex(slotIndex + 1);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length) {
                    return;
                }
                i4++;
                j2 = -9187201950435737472L;
            }
        } else {
            if (i3 <= i2) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                long j4 = jArr2[i7];
                if ((-1) - (((-1) - ((-1) - (((-1) - ((~j4) << c2)) | ((-1) - j4)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j4 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i7 << 3) + i9];
                            int slotIndex2 = groupInfo2.getSlotIndex();
                            if (slotIndex2 == i2) {
                                groupInfo2.setSlotIndex(i3);
                            } else if (i2 + 1 <= slotIndex2 && slotIndex2 < i3) {
                                groupInfo2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 == length2) {
                    return;
                }
                i7++;
                c2 = 7;
            }
        }
    }

    public final void registerMoveNode(int i2, int i3, int i4) {
        char c2 = 7;
        long j2 = -9187201950435737472L;
        if (i2 > i3) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j3 = jArr[i5];
                if ((-1) - (((-1) - ((-1) - (((-1) - ((~j3) << 7)) | ((-1) - j3)))) | ((-1) - j2)) != j2) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j3 + 255) - (j3 | 255) < 128) {
                            GroupInfo groupInfo = (GroupInfo) objArr[(i5 << 3) + i7];
                            int nodeIndex = groupInfo.getNodeIndex();
                            if (i2 > nodeIndex || nodeIndex >= i2 + i4) {
                                if (i3 <= nodeIndex && nodeIndex < i2) {
                                    groupInfo.setNodeIndex(nodeIndex + i4);
                                }
                            } else {
                                groupInfo.setNodeIndex((nodeIndex - i2) + i3);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 == length) {
                    return;
                }
                i5++;
                j2 = -9187201950435737472L;
            }
        } else {
            if (i3 <= i2) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                long j4 = jArr2[i8];
                long j5 = (~j4) << c2;
                if ((-1) - (((-1) - ((j5 + j4) - (j5 | j4))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j4 + 255) - (j4 | 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i8 << 3) + i10];
                            int nodeIndex2 = groupInfo2.getNodeIndex();
                            if (i2 > nodeIndex2 || nodeIndex2 >= i2 + i4) {
                                if (i2 + 1 <= nodeIndex2 && nodeIndex2 < i3) {
                                    groupInfo2.setNodeIndex(nodeIndex2 - i4);
                                }
                            } else {
                                groupInfo2.setNodeIndex((nodeIndex2 - i2) + i3);
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 == length2) {
                    return;
                }
                i8++;
                c2 = 7;
            }
        }
    }

    public final void registerInsert(KeyInfo keyInfo, int i2) {
        this.groupInfos.set(keyInfo.getLocation(), new GroupInfo(-1, i2, 0));
    }

    public final boolean updateNodeCount(int i2, int i3) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(i2);
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = i3 - groupInfo.getNodeCount();
        groupInfo.setNodeCount(i3);
        if (nodeCount == 0) {
            return true;
        }
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            long j2 = jArr[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j2) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i4 << 3) + i6];
                        if (groupInfo2.getNodeIndex() >= nodeIndex2 && !Intrinsics.areEqual(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                            groupInfo2.setNodeIndex(nodeIndex);
                        }
                    }
                    j2 >>= 8;
                }
                if (i5 != 8) {
                    return true;
                }
            }
            if (i4 == length) {
                return true;
            }
            i4++;
        }
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
