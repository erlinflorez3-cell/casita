package androidx.compose.ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.layout.LayoutCoordinates;
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
/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP\u008cZS@\u000fs{:%c$\u007fCC٥\"}8\tWȞog|hb\u000bY\u000f\u000eǝ\u0001j:R]xc\u0015\u00172XoG3SqE9n{>\u0005&2(\u0600\u0010ڎ1\u001aXGP\u0002\u000bGY\f*0nqĐV\r[\u0007b@\u0014I8\u0001Lh\u0018RDU\u0005]h=S\rwQf-o2\rM;W\u00037=|g\u001e9RO5C8ھ\u0002ޗқ_A\tS\u007fRMl5=CI\"c~n\u000e+-+} \u000ev4t\u001dQ\u000f%W1UcYj&(&\u000eD\u0011J\u001f&\u0006UTv1(\u0003 \u000ea\u0001;oNm\u001a^p\f+eD$=\u007faIi%tpyA)PG{3\u0013L(Gnqsb\u0011x!+\\\bWASP=vT8^kqZ͒d͆.\u00048ϚPA\n\u0018F\u0017S?2ݾ%\u074co\bPֳ\u007fx\u000biv]:^V@:nD8\u0001¡\u000eʑHd\rߘ¯T]4\u0014Sɞp5|ݚ\u0017@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001P\u001a=8?Jn#+\u0011fg9\u00149", "", "@n^A66H`\u0018\u0003\u0004Z;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", "6hc\u001db0Gb\u0019\f^]:X\u0012.N\n'{N", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[g\u001d<m\u0014=5?FA", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001V -M\u0019", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001V -M.7x4'$>", "5dc\u001fb6M\u0012)\u0003tk,\u0004\t+s\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0017WB;V0+\u0015qp\u000f", "/cS\u0015\\;)O(\u0002", "", ">nX;g,K7\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", ">nX;g,K7\"\n\u000bm\u0015\u0007\b/s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", ">qd;X\u0017HW\"\u000ezk\u0010{\u0017\u000bn~\u0006~<\n\u0019\u0017UX\u0018KZ.\u001ec| ET\u001a<\\", "", "/cS\u0015\\;)O(\u0002BJ\u0011\tg\u001dy\n", "uI;7T=:\u001d)\u000e~euc\r=tU\u001d?1", "1kT.e\u0017KS*\u0003\u0005n:\u0004\u001d\u0012i\u000f\u0010\u0006?\u0005\u0018\u001bG|vFu%\u0013U{#7", "2hb=T;<Vv\u0002vg.|\u0017", "7mc2e5:Z\u0004\t~g;|\u0016\u000fv\u007f1\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001Q\u001f=MPDg;\t\u001fljH\u0007p\f_v0V\"", "7r8;56N\\\u0018\r", ">q^0X:L1\u0015\bx^3", "@d\\<i,\u001dS(zxa,{s9i\t7{Md \"W~vFu%C", "@d\\<i,\"\\*z\u0002b+g\u00133n\u000f(\t$\u007f%rPnk?r.7Y\f", "", "6hc\u001bb+>a", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HitPathTracker {
    public static final int $stable = 8;
    private final LayoutCoordinates rootCoordinates;
    private final NodeParent root = new NodeParent();
    private final MutableLongObjectMap<MutableObjectList<Node>> hitPointerIdsAndNodes = new MutableLongObjectMap<>(10);

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    /* JADX INFO: renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m5312addHitPathQJqDSyo$default(HitPathTracker hitPathTracker, long j2, List list, boolean z2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        hitPathTracker.m5313addHitPathQJqDSyo(j2, list, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX INFO: renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5313addHitPathQJqDSyo(long r18, java.util.List<? extends androidx.compose.ui.Modifier.Node> r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.HitPathTracker.m5313addHitPathQJqDSyo(long, java.util.List, boolean):void");
    }

    private final void removeInvalidPointerIdsAndChanges(long j2, MutableObjectList<Node> mutableObjectList) {
        this.root.removeInvalidPointerIdsAndChanges(j2, mutableObjectList);
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z2);
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean z2) {
        if (this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z2)) {
            return this.root.dispatchFinalEventPass(internalPointerEvent) || this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z2);
        }
        return false;
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        this.root.clear();
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        clearPreviouslyHitModifierNodeCache();
    }

    public final void removeDetachedPointerInputNodes() {
        this.root.removeDetachedPointerInputModifierNodes();
    }
}
