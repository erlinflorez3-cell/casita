package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\":\u0012\u007f\u0007|jA0JgP.hS2şs{J$c$wOCU(\u0007*\tUTog\u0005Jb\u000bI\u0017\fǝ\u000f̓\\I\u0004w\u001e>\u001fWPoWT]\u0007MNpvF\u0005N5P:ѩ\t\u000b .X\u0016|\u007fSM\u0012\u0018VF\u0001<b\r{\bH\u0013ĂB \u000f%%z\\H`l\f=_'\u0011|ZNU^vŧ֔\u0011FZ;U\u0002o3C@e8[Ǭ٨\u0007\u0007Xq\b.M\tU\u0005\u0017*W/W\fo6\u0007\u000bD\u001b1O\u001bv\u000b&\u000b\u001f\u0002j\u001aBCUsM`\u000eVz)}SɝǬ\u0012\u0006-dvX(\u0004 \u000eaw#WNh\u001a^p\u000b+g<\u00173\u0019K+g5\u0017[oV1TG}\u0015\rL&/pgżڍ\u0012`\u001b9\u001d#_Pi@kK~\u000egU\u0006\u0004\u001fm20\n0U\u0019G{?HG/EvQ)1m\u0012Hrj%\u0007'åרmRN`j0$XB\t:]dj\u000bߘ^v\u0001,?pLX\u0015\u0011 \u0013f~(L/I(Z_jyj\u0014\u007f\u001a'?fe\\\u001dl>aGyK;ae a\u0001yBA\u0003ϵۖ\\hHx\u001a\u0001%I0Y`j>z,H\\$+2m|L>:L1b%J\u0013\u001epD+\u000b&ʳӳ\u0014~Z[l\u000ewM\r\t/S#ʙ״kxOVEk0XYQc\u001clŞɋl4\u0003OW\u000b\u0002\b_gzP#́\u0018\u0091Y{(چjQ_9U\u001f\u001f\u00019208UN\u0003e\u007fP@(Qۣ{ӛ?h6ԖX\u0003~8xvZQd\u0017P\u0002nt3\b\u0013\u0003(b\u001dڬIϭX\u000bcŬ\u001a\u000b\u0011fTZH~\u0015\u001fL0\u0011q2|c0q(sȹyӄ3\u0015iӠ:\b<\bz\u001b6vu\u0004Zn&qrQ\f5i9 ʵ\u0001й&$t×\u0013`x\u0007 N\u00196\u001d3vLtrf8{\u000e]~=\u0081.ޛtVcƥc\b\fDFk:uS}BiS'!M\u0002j\u001cn\"ŏ\rΊ\u0013\n\u0013֊\u0002\u0007 -U,fYr\t^\u0011\u0004\u001aFAie3=_Ӛ6ʙ@\b\u0013͏Ҷm3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG\u0007\u001cB{\u00198\\-8y4+&hn\u000f", "", "=m25T5@S\u0018^\u000e^*\r\u00189r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`[9U(<Y", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "=ab2e=>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007M)\\v4XL[\u0002", "=m2<`4Bbt\u007f{^*\f\r8gf$\u0010J\u0011&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "=m2<`4Bbt\u007f{^*\f\r8gf$\u0010J\u0011&~Qn\u0012=z%B", "=m2<`4Bbt\u007f{^*\f\r8gf$\u0010J\u0011&~Qn\u0012=z%B=\u0007\u0007Aw\u001c*PC7j", "=m2<`4Bbt\u007f{^*\f\r8gf2\u0006F|\u001a\u0017Cn", "=m2<`4Bbt\u007f{^*\f\r8gf2\u0006F|\u001a\u0017Cnu<r3Ef}", "=m2<`4Bbt\u007f{^*\f\r8gg(wN\u0011$\u0017", "=m2<`4Bbt\u007f{^*\f\r8gm(\u0004<\n&\u001bE}", "1kT.e", "B`a4X;", "1kT.ejNW\u0013\fze,x\u0017/", "1kT.e\u0010Gd\u0015\u0006~]\u0016y\u0017/r\u0011$\u000bD\u000b %", "1kT.e\u0010Gd\u0015\u0006~]\u0016y\u0017/r\u0011$\u000bD\u000b %\u0006\u007f\u00126\u0004%<Yy.7", "=ab2e=>:\u0015\u0013\u0005n;d\u0013.i\u0001,{Mn \u0013R}\u0011F\u0006\u00125U|.", "<nS2", "/eU2V;L:#\t\u0001Z/|\u0005.", "", "0k^0^", "=ab2e=>:\u0015\u0013\u0005n;d\u0013.i\u0001,{Mn \u0013R}\u0011F\u0006\u00125U|.u}\u001a(ZCBk0,\u0015", "=ab2e=>:\u0015\u0013\u0005n;j\u0012+p\u000e+\u0006Om\u0017\u0013F}", "=ab2e=>:\u0015\u0013\u0005n;j\u0012+p\u000e+\u0006Om\u0017\u0013F}LLz\u001fBY\u0005 3{\u0016", "=ab2e=>;\u0019z\tn9|v8a\u000b6~J\u0010\u0004\u0017Cn\u001c", "=ab2e=>;\u0019z\tn9|v8a\u000b6~J\u0010\u0004\u0017Cn\u001cz\u0007)/f}'7i$.", "=ab2e=>@\u0019zyl", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG{*Bmk", "=m25T5@S\u0018", "=ab2e=>@\u0019zylj\r\r)r\u007f/{<\u000f\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW&\t.5fk\u001eAx\u0016\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4XZ@G.}K;(Q1Z\n\u0005i\u0011\u0015\u0014\u001d9tyP pW\u0003\u0013\u0005E3q\u0011/#j", "=ab2e=>A\u0019\u0007vg;\u0001\u0007=R\u007f$zN", "=ab2e=>A\u0019\u0007vg;\u0001\u0007=R\u007f$zN?'\u001bA|\u000eCv!CY", "AsP?g\u0016;a\u0019\f\fb5~", "AsP?g\u0016;a\u0019\f\fb5~G?iy5{G\u0001\u0013%G", "As^=B)LS&\u0010~g.", "As^=B)LS&\u0010~g.;\u00193_\r(\u0003@|%\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;
    private final SnapshotStateObserver observer;
    private final Function1<LayoutNode, Unit> onCommitAffectingLookaheadMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    };
    private final Function1<LayoutNode, Unit> onCommitAffectingMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    };
    private final Function1<LayoutNode, Unit> onCommitAffectingSemantics = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                layoutNode.invalidateSemantics$ui_release();
            }
        }
    };
    private final Function1<LayoutNode, Unit> onCommitAffectingLayout = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifier = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifierInLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final Function1<LayoutNode, Unit> onCommitAffectingLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };

    public OwnerSnapshotObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.observer = new SnapshotStateObserver(function1);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z2, function0);
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode layoutNode, boolean z2, Function0<Unit> function0) {
        if (z2 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookahead, function0);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayout, function0);
        }
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z2, function0);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode layoutNode, boolean z2, Function0<Unit> function0) {
        if (z2 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, function0);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifier, function0);
        }
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z2, function0);
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode layoutNode, boolean z2, Function0<Unit> function0) {
        if (z2 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadMeasure, function0);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingMeasure, function0);
        }
    }

    public final void observeSemanticsReads$ui_release(LayoutNode layoutNode, Function0<Unit> function0) {
        observeReads$ui_release(layoutNode, this.onCommitAffectingSemantics, function0);
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T t2, Function1<? super T, Unit> function1, Function0<Unit> function0) {
        this.observer.observeReads(t2, function1, function0);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new Function1<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
            }
        });
    }

    public final void clear$ui_release(Object obj) {
        this.observer.clear(obj);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
