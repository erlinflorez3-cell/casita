package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&˛\bDZc|\u0004Oي8\u000b4B\u0007\":1\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0002<řc$\bCC٥\"}8\tWN}gvϺb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00153JoU3UoC?htD\u000e(2(>\u0002\u0005\u000f\u001a2H\u0016}\u0003Ca\f\u001a0FuBR#M\r܅\u001a\u0006T \t\u001ebkV6V\u007fe:5&\t݃X÷Oe6ŧ[\fnTU\r'aL,x8|]n\u0014\u0006\u07baV[M\u0005\b\bK+\u0001)=*wx\b:f',\u0015YP=a\u0001Nt\u0005\u007fiTV9x{K~8X{\t'%<:\u05fa6+VRE\u001a\u0015\u0011>Czralh\f\rPP\u0001q8'%6đYݍafЂe;'{\u007fީ\u0004\u001bL;\u0001\u001dK\fX\u001c\u0010-\u001b\u0003\u0001\u00025_pUH|\u0013\nA{5\tb034:U2G\u0002!0'%mكg'Qo\u0010R\\g%\u0010\u0011ra\u001djNP$~\u0016mѧ7@\u000bHr:\u0004P\u0003y\\\u0015[Rl\u0007,)C$j/T!S\u0019~Sv\"\u0003M\f+U3tpqn\u001a\u0017\b=lmMQ\u0012\u0019\u0012V\u0005OW<\u0011A\tjP\u0011$Z\u000bfj@V*(w*n~\u0010!YWqJ5r1a`#\t\u001b\u001epkE&m\u001c\u0001\u0010-~c(\u0011\u0015<t?ɖ\u0001bvou;a,+\u0002h-ۮU5'i\u001e9vx\u0015#5\b\u001c\u007fu-|KZ\u0018.u\fݨf\u0016׀=Q=\u0004c!\r,J\b=G\\r\u0014V{\u0016}Ϙ~ɍ\u0013;p֫8\u0016xvDb\u0001I}[mǴ\u0003݈v#\u0010ۭP\u0006oN\u0013G\u0012]aϸJϗv\u0003aߢ\u001fF\u000b\u000f7 ;\u007f\u001e-Sމ9ϡ+\u001d\u001eߐdQ#mu\u007f\u007f0\nb='\u0005q\u00146\u0012$@ha_B;nԾ\b˚l/zК\u0005\u074cLj\u007f٤\u0013\u001eB\u001cKHot'\u001bҎLߒʹ|e¡0\u0011\tXaK!\u0002NC<rBsq\u0012љbI-ݎeUm\u0003{a-\u001dX&\"\u0011\f3~\u0012J>Nn.Ņ\u000bޘ\ns ܽ\u0012Mp\u001eT\u000f46<<>ՁqX@е\u0012Ģ\u0004FgʕgDP\u000eS\\\u001eV\t\\\rޠ3d\u001cǺ#Ǆ\u0005~\u0017ɼn\u000bCL\u001dsVV?chܬ\u0002!_ƈlˍ\u0003f-Ľ\u0015fG7@^\u0011\rU]y̲0:Zڞ+Թoo\u0014Մh\u0013+_0\u001bgZ9_%0\u0015K,̧PЩz\u0016~TT@7\u001eK\u0013\u001c\\\"\u000f9:wr&ۮc\r%ߚ9ƴ\u001e\u0005/F/)\u001a 4\\)Q\u001e5[FqjB'2\u0018*ȏ\u007fл$$?\u0006zFjvʭf\u0013e\u001e@ϥ\u000eDa\n\t\u0019oܩ\bx"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001cg", "", "u(E", "2hb.c7>O&\u0003\u0004`\u0010\f\t7s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002A\u001e\u001b0", "2hb=_(RW\"\u0001ch+|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "4ha@g\u001dBa\u001d{\u0002^\u0010\u0006\b/x", "", "9dh\u0016a+>f\u0001z\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;4v;+UM,o:nHi", "9dh!b\u0010MS!b\u0004_6d\u0005:", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!P>\u001dN3p\u000eZKy", ";h] \\A>B#_~m\u000b\u0001\u0017+p\u000b(wM\u0005 \u0019+~\u000eD\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc\u001a\\5,W.~ih\r\u0001\u0018\u000ei\u000e$\u0007K\u0001\u0013$Kx\u0010 \u0006%=gE\u00144\u0002\u001e\u0015\u001aE", "u(9", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", ";ne6a.\u001ae\u0015\u0013`^@\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", ";ne6a.\u001ae\u0015\u0013ih\f\u0006\b\fo\u00101z", ";ne6a.\u001ae\u0015\u0013ih\u001a\f\u0005<t\\2\fI\u007f", ";ne6a.\"\\y\f\u0005f\f\u0006\b\fo\u00101z", ";ne6a.\"\\y\f\u0005f\u001a\f\u0005<t\\2\fI\u007f", "1q^@f\bQW'h{_:|\u0018", "5dc\u0010e6Lat\u0012~l\u0016}\n=e\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\QVL\u0014\u001a0Q2", "6`b\u000ea0FO(\u0003\u0005g:", "", "5dc\u0015T:\u001a\\\u001d\u0007vm0\u0007\u0012=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\QVL\u0014\u001a0QC", ";`X;4?Ba\u0003\u007f{l,\f", "5dc\u001aT0G/,\u0003\tH-}\u0017/t", "5dc\u000ea0FO(\u0003\u0005g", "9dh", ">kP0X(;Z\u0019b\u0004],\u0010", "7mXA\\(EW.~Vg0\u0005\u0005>i\n1", "", "7sT:", "7sT:<5?]", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\QVL\u0014\u001a0q5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\r \u001e>ilQZ\u001aPC\u001cqV=2MUs\u0004WP\u000fI&y F\u0019pDJ3w\u0001\u0019#DY2\u0012wb\u001b\u007f\u0011]vgO|\u00049.\u00141L", "=m<2T:N`\u0019}", "1n]@h4>R\u0007|\bh3\u0004", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", ">nb6g0H\\\u0019}^m,\u0005\u0017", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001c|g\u0018_/\f\u0005f\u0017", "7rE2e;BQ\u0015\u0006", "7r;<b2B\\\u001bZ}^({", ":`]266N\\(", "6`b\u0019b6DO\u001c~v]\u0016z\u0007?r\r(z", ":`h<h;&W\"h{_:|\u0018", ":`h<h;&O,h{_:|\u0018", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "@d\\<i,\"\\\u001a\t[h9b\tC", "@db2g", "AsP?g\u0017EO\u0017~\u0003^5\fd8i\b$\u000bD\u000b %+pv<v$5X", "7r<<i0GUt\u0011vr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\QVL\u0014\u001a0\u0003\u0012\u001c", "CoS.g,\u001a\\\u0018kzm<\n\u0012\u0019f\u00016{Oa!$", "", "uZ8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_5IWE{Cg{dvMm_@X\u00076/LJ:l_r<w!Z\u0016$np", "\u0012hb=_(RW\"\u0001Yb:x\u0014:e{5\u007fI\u0003z&Gw\u001c\u001c}%=Y\u0007/", "\u0012hb=_(RW\"\u0001Yb:x\u0014:e{5\u007fI\u0003z&Gw\u001c%\u0001$5", "\u0017sT:<5?]", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
    private final List<T> movingInFromStartBound = new ArrayList();
    private final List<T> movingInFromEndBound = new ArrayList();
    private final List<T> movingAwayToStartBound = new ArrayList();
    private final List<T> movingAwayToEndBound = new ArrayList();
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r45, int r46, int r47, java.util.List<T> r48, final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r49, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider<T> r50, boolean r51, boolean r52, int r53, boolean r54, int r55, int r56, kotlinx.coroutines.CoroutineScope r57, androidx.compose.ui.graphics.GraphicsContext r58) {
        /*
            Method dump skipped, instruction units count: 1285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    private final void removeInfoForKey(Object obj) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoRemove = this.keyToItemInfoMap.remove(obj);
        if (itemInfoRemove == null || (animations = itemInfoRemove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void reset() {
        /*
            r17 = this;
            r8 = r17
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r8.keyToItemInfoMap
            boolean r0 = r0.isNotEmpty()
            if (r0 == 0) goto L74
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r8.keyToItemInfoMap
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r11 = r0.values
            long[] r10 = r0.metadata
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L6f
            r16 = 0
            r7 = r16
        L1b:
            r4 = r10[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r14 = r0 + r4
            long r0 = r0 | r4
            long r14 = r14 - r0
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r14 + r12
            long r14 = r14 | r12
            long r1 = r1 - r14
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L6a
            int r0 = r7 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r6 = r16
        L3c:
            if (r6 >= r12) goto L68
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r0 + r4
            long r0 = r0 | r4
            long r14 = r14 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r0 = r7 << 3
            int r0 = r0 + r6
            r0 = r11[r0]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r3 = r0.getAnimations()
            int r2 = r3.length
            r1 = r16
        L58:
            if (r1 >= r2) goto L64
            r0 = r3[r1]
            if (r0 == 0) goto L61
            r0.release()
        L61:
            int r1 = r1 + 1
            goto L58
        L64:
            long r4 = r4 >> r13
            int r6 = r6 + 1
            goto L3c
        L68:
            if (r12 != r13) goto L6f
        L6a:
            if (r7 == r9) goto L6f
            int r7 = r7 + 1
            goto L1b
        L6f:
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r8.keyToItemInfoMap
            r0.clear()
        L74:
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap$Empty r0 = androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap.Empty
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap) r0
            r8.keyIndexMap = r0
            r0 = -1
            r8.firstVisibleIndex = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.reset():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2, ItemInfo itemInfo, int i3, Object obj) {
        if ((i3 + 4) - (i3 | 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            Intrinsics.checkNotNull(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i2, itemInfo);
    }

    private final void initializeAnimation(T t2, int i2, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        long jM6762copyiSbpLlY$default;
        int i3 = 0;
        long jMo1130getOffsetBjo55l4 = t2.mo1130getOffsetBjo55l4(0);
        if (t2.isVertical()) {
            jM6762copyiSbpLlY$default = IntOffset.m6762copyiSbpLlY$default(jMo1130getOffsetBjo55l4, 0, i2, 1, null);
        } else {
            jM6762copyiSbpLlY$default = IntOffset.m6762copyiSbpLlY$default(jMo1130getOffsetBjo55l4, i2, 0, 2, null);
        }
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i4 = 0;
        while (i3 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i3];
            int i5 = i4 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m1181setRawOffsetgyyYBs(IntOffset.m6770plusqkQi6aY(jM6762copyiSbpLlY$default, IntOffset.m6769minusqkQi6aY(t2.mo1130getOffsetBjo55l4(i4), jMo1130getOffsetBjo55l4)));
            }
            i3++;
            i4 = i5;
        }
    }

    static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z2);
    }

    private final void startPlacementAnimationsIfNeeded(T t2, boolean z2) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t2.getKey());
        Intrinsics.checkNotNull(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i2];
            int i4 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jMo1130getOffsetBjo55l4 = t2.mo1130getOffsetBjo55l4(i3);
                long jM1178getRawOffsetnOccac = lazyLayoutItemAnimation.m1178getRawOffsetnOccac();
                if (!IntOffset.m6765equalsimpl0(jM1178getRawOffsetnOccac, LazyLayoutItemAnimation.Companion.m1182getNotInitializednOccac()) && !IntOffset.m6765equalsimpl0(jM1178getRawOffsetnOccac, jMo1130getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m1174animatePlacementDeltaar5cAso(IntOffset.m6769minusqkQi6aY(jMo1130getOffsetBjo55l4, jM1178getRawOffsetnOccac), z2);
                }
                lazyLayoutItemAnimation.m1181setRawOffsetgyyYBs(jMo1130getOffsetBjo55l4);
            }
            i2++;
            i3 = i4;
        }
    }

    public final LazyLayoutItemAnimation getAnimation(Object obj, int i2) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i2];
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t2) {
        int lane = t2.getLane();
        int span = t2.getSpan() + lane;
        int iMax = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = iArr[lane] + t2.getMainAxisSizeWithSpacings();
            iArr[lane] = mainAxisSizeWithSpacings;
            iMax = Math.max(iMax, mainAxisSizeWithSpacings);
            lane++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: getMinSizeToFitDisappearingItems-YbymL2g */
    public final long m1183getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM6813getZeroYbymL2g = IntSize.Companion.m6813getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i2);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                jM6813getZeroYbymL2g = IntSizeKt.IntSize(Math.max(IntSize.m6808getWidthimpl(jM6813getZeroYbymL2g), IntOffset.m6766getXimpl(lazyLayoutItemAnimation.m1178getRawOffsetnOccac()) + IntSize.m6808getWidthimpl(layer.m4825getSizeYbymL2g())), Math.max(IntSize.m6807getHeightimpl(jM6813getZeroYbymL2g), IntOffset.m6767getYimpl(lazyLayoutItemAnimation.m1178getRawOffsetnOccac()) + IntSize.m6807getHeightimpl(layer.m4825getSizeYbymL2g())));
            }
        }
        return jM6813getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    private final boolean getHasAnimations(T t2) {
        int placeablesCount = t2.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            if (LazyLayoutItemAnimatorKt.getSpecs(t2.getParentData(i2)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo1130getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1130getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m6767getYimpl(jMo1130getOffsetBjo55l4) : IntOffset.m6766getXimpl(jMo1130getOffsetBjo55l4);
    }

    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo1130getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1130getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.isVertical() ? IntOffset.m6767getYimpl(jMo1130getOffsetBjo55l4) : IntOffset.m6766getXimpl(jMo1130getOffsetBjo55l4);
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\nnjO0LeN1ZS8\u0015s{:'c$\u007fLCU \b*\t]NogtJb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u0015˳D\u0006ЀcM\u001e<ycҽ:\u0005.2js\b&\u0019\u001aXj@z\tfc\fHؓptHv%M3?B\nLF\u0019\u001e\u000b\u000f~:V\tu:]23mPh?_^\f}\u0013LT5\u001b\u000faL:Ë;5#M$1\u0015VsG\u0013C\u0002?\u001bgU*YK$cDY\u0018\u001c%/_\u000fsqT_3S\u001fL}ˊ[ӍOX\u0016(\u0006\u0002\u0014\u000fB\t\u001c\fwh<52h\u001e\ra}IԦL҉\u0001މ݆~yˋ:#-ĮK-?%t\\\u0002=\u001fZE\tU%,1\u0019nOj+לlڠ\u001f`\u007f\u0383ISFMV_*[C\u007f\u0012\u00043\u00148\u0018HG.D2Q\u0005ϒ'ھ_=;#q\u0016VZ8\u000f\u0013w\u0001S\u0018a\u001f؞.å\u001aC2\u009e$\\J|\u0013|pV^E\u001f`lp\u0015\u0018 \u0013Nk(@/&(N}w(+$α\u0016ɻ3l?ժ\u0007m\u0014rGo\u0004Q_\u007f(a\u0001\u0006DCJc\u001dX\u0015Q\u0012L1٩4ϒ6Nrݘ\u0010}Jk\u001a$\u0003W\u007f:L,_(3ðTҴ\"NIґ!a`\b\u001e\u0010t5*#w7ڒ\t\nX_v׳\u0004'H4|fAγEz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!P>\u001dN3p\u000eZKy", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]Z6GT*5`ZnL\u001e\u001f0Q?", "\nrTA \u0006\u0017", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002A\u001e\u001b0", "/mX:T;B]\"\r", "5dc\u000ea0FO(\u0003\u0005g:", "u(J\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_5IWE{Cg{dvMm_@X\u00076+[N48[vE\u0010!^\u0018W\u0001", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]Z6GT*5`ZnL\u0018\u001ccc", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0010b5Lb&z~g;\u000bP\u000eWo+\u000e&\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006T/>g\r-3q\u001f=[\u0019", "Adc\u0010b5Lb&z~g;\u000bP)S\u0013wnGh", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001a\u0001.Ch\u000b\u001c;v%<#\u0007,", "1q^@f\bQW'h{_:|\u0018", "", "5dc\u0010e6Lat\u0012~l\u0016}\n=e\u000f", "u(8", "Adc\u0010e6Lat\u0012~l\u0016}\n=e\u000f", "uH\u0018#", "7rABa5B\\\u001bi\u0002Z*|\u0011/n\u000f", "", "u(I", ":`]2", "5dc\u0019T5>", "Adc\u0019T5>", ":`h<h;&O,h{_:|\u0018", "5dc\u0019T@Hc(fvq\u0016}\n=e\u000f", ":`h<h;&W\"h{_:|\u0018", "5dc\u0019T@Hc(f~g\u0016}\n=e\u000f", "AoP;", "5dc c(G", "Adc c(G", "CoS.g,\u001a\\\u001d\u0007vm0\u0007\u0012", "", ">nb6g0H\\\u0019}^m,\u0005", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\QVL\u0014\u001a0tT5\u001c\f]J78BA,\u0012<X\u0006Dh\u000fUs\u0018Bt\u0001QZ\u0019Gg\u0013\u007fL)>-UhxTKIa=.\ni%gDH$]\u0002\u001ddj]*\u0015~W\u000f\u0001\u001c[tcR\u001c~62\u001cwdUE\u0003d\u0012X\u000b\u0003\u000fl", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class ItemInfo {
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.EmptyArray;
        private int span = 1;

        public ItemInfo() {
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* JADX INFO: renamed from: getConstraints-DWUhwKw */
        public final Constraints m1184getConstraintsDWUhwKw() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: setConstraints-_Sx5XlM */
        public final void m1185setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final void setCrossAxisOffset(int i2) {
            this.crossAxisOffset = i2;
        }

        public final int getLane() {
            return this.lane;
        }

        public final void setLane(int i2) {
            this.lane = i2;
        }

        public final int getSpan() {
            return this.span;
        }

        public final void setSpan(int i2) {
            this.span = i2;
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.isRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 32) != 0) {
                i4 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i2, i3, i4);
        }

        public final void updateAnimation(T t2, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i2, int i3, int i4) {
            if (!isRunningPlacement()) {
                this.layoutMinOffset = i2;
                this.layoutMaxOffset = i3;
            }
            int length = this.animations.length;
            for (int placeablesCount = t2.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.animations.length != t2.getPlaceablesCount()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, t2.getPlaceablesCount());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m6579boximpl(t2.mo1129getConstraintsmsEJaDk());
            this.crossAxisOffset = i4;
            this.lane = t2.getLane();
            this.span = t2.getSpan();
            int placeablesCount2 = t2.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i5 = 0; i5 < placeablesCount2; i5++) {
                LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.getSpecs(t2.getParentData(i5));
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i5];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i5] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i5];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        this.animations[i5] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0015\u007f\u0007tsAӄLeV\u008cZݷ2\u000fy\u0002<řc$\u007fOC٥\"}0\tWNmgvJp\u000bKƤ\fǠ~\u0001ߚy[\t_\"\u000f`B\u001e>s\\\u007fEGa\r:\u0015 8#f{ڱ\u0005\u001a8KX\u0002\tGc\u0010\"0FqhTS̢\u0006b'\u0014C8\u0001Lձ\u0018X<Hz^R33\u0003oC|)&ݥ{\u0016\u0013TZ?\r%ad?\tHC\u001c=S1\u000f\u0003aM\fWsS\u0004\u00171mȹJ<^Dc\u0018\u0014C7\u0016֬\\;-j\u0012i`:5q֩b\u0014^\u001c7\u0010z*\u001dl\b\u001c\u0017?H\\-`zP\u0018A\u0007\u000bSn`*^p\u0013Au\u0007'3\u0001K/I\u001blR\u0010=o\u05ce9߉\t\r&ŀѐr5"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!P9\u0012\\6\u0014\u0001mE-p#;-\u00047T\u00027u\u0005\u0015\u0018qDjxP6\u0017G\u0002\u0015~P~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!P9\u0012\\6\u0014\u0001mE-p#;-\u00047T\u00027u\u0005\u0015\u0018qDjxP?\u001aFyj", "/mX:T;H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]Z6GT*5`ZnL\u001e\u001f0Q?", "1n\\=b5>\\(J", "1n_F", "1qT.g,", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsElement(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) obj).animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DisplayingDisappearingItemsNode create() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DisplayingDisappearingItemsNode displayingDisappearingItemsNode) {
            displayingDisappearingItemsNode.setAnimator(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007tsAӄLeV\u008cZݷ2\u000fy\u0002<řc$\u007fCCU ~*\t]Zo˧vJp\u000bKƤ\fǠ~\u0001ߚyU'\\B\u000f`B0NCU}>Qd\u00056\u000b!`$أ}\u0005\u000f\u001drS\u001ez\u0013G[\f\u00181nr\u0001Ũ\u000e\u0016\u001a(\u0017\u001e>NҵNfmNDI\u0005aJ/)\u0004\u0018D\u0015В^x\u000e[\u0013^TU\u0014'g,3X9K\u0014S\\I߮S$F\u0011I\n=3smާ*\u0012yeBp\u007fB\"qcUc\u00014t\u0005\u007fmR;s_qZh\u000eV\u0005+\u0004\u001b=\u001c\u0012\u0016'N/[\u001c/\u000f\u001cC\rr\u0002Q\u0017ٳ]\u000b\n\tsN\u0017S\r[+g.-e2K'OO\u007f\u0015\r$$/pwſ`\u05f8d\u0015#ƘɖUE"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!P9\u0012\\6\u0014\u0001mE-p#;-\u00047T\u00027u\u0005\u0015\u0018qDjxP?\u001aFyj", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "/mX:T;H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]Z6GT*5`ZnL\u001e\u001f0Q?", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "=m0Ag(<V", "", "=m32g(<V", "Adc\u000ea0FO(\t\b", "BnBAe0GU", "", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsNode(lazyLayoutItemAnimator);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) obj).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i2);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fM6766getXimpl = IntOffset.m6766getXimpl(lazyLayoutItemAnimation.m1175getFinalOffsetnOccac());
                    float fM6767getYimpl = IntOffset.m6767getYimpl(lazyLayoutItemAnimation.m1175getFinalOffsetnOccac());
                    ContentDrawScope contentDrawScope2 = contentDrawScope;
                    float fM6766getXimpl2 = fM6766getXimpl - IntOffset.m6766getXimpl(layer.m4827getTopLeftnOccac());
                    float fM6767getYimpl2 = fM6767getYimpl - IntOffset.m6767getYimpl(layer.m4827getTopLeftnOccac());
                    contentDrawScope2.getDrawContext().getTransform().translate(fM6766getXimpl2, fM6767getYimpl2);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
                    } finally {
                        contentDrawScope2.getDrawContext().getTransform().translate(-fM6766getXimpl2, -fM6767getYimpl2);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            if (Intrinsics.areEqual(this.animator, lazyLayoutItemAnimator) || !getNode().isAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode = this;
            this.animator = lazyLayoutItemAnimator;
        }
    }
}
