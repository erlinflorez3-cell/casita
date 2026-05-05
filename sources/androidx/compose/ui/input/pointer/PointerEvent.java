package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
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
/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.hS2\u000fq\u0002<$q$yCAU\"}8\tWNmhvJp\u000bK\u000f\f\u001d~oBկ\u0006x\f\u0011OEH\u0004O=[oU?pvF\u0005N4P9ѩ\t\u0001(-\t-|ٙSU\u001a\u0012HF\u0001<b\r{\u0007H\u0013\u0016D.\u00056^}MdMǰa:=)K|Pk?_^\u0015\u0014\rѸS&͒uѭӿ/B=S#/\u001c\r\u0015qsE\u0013A\u0002=3jU(se\u0002wNX.ϬE5]\rux6^\u0015Q\u000f\u000eU,\u007fiYc&*\u000ey*!\r\u001b\u001c\r?H\\5ָeڜս2sɤWHX\u0002lM\u0018|g?%/PH993lacK\u0019|9*\u0006ڟ\")\t͙9]Z\u001an\"kh\u0006UISV<vS`\u0530?ъ\bvj̣B\u00066U\u000e>L(<'=7\nJٳ ǽʮGCϼz\rhhatjJF4| \b>\u0017\u001frFz\u0004\u001ad\u000b\u0017\u0003ҋOɟX\u000b\u0016\n\u00195j\u000e\rK3)fO\u0017\u0002\u001bQk!=/\u0015O\u0018-Bޔc¢]ڨΉPbߧe`~\u0014MGz\u0007^\u0001P],\\bC0Nʎj\u0019\u007f~Jª(A1Gq\"SϢ5:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "", "1gP;Z,L", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "7mc2e5:Z\u0004\t~g;|\u0016\u000fv\u007f1\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001Q\u001f=MPDg;\t\u001fljH\u0007p\f_v0V\"", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF\u0003W:\u0001-@c\f \u0001}\u001awQLF{Cg reB\u0016c9\u0018Z0VL[5XY]G\u0018\u001bi\u000e[\u000b\u001e\u0005bPy25", "0tcAb5L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0011.$wkB\u00159", "5dc\u000fh;M]\"\rBk@MW\u0002P[", "u(8", "\u0017", "5dc\u0010[(GU\u0019\r", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0016a;>`\"z\u0002I6\u0001\u0012>e\r\b\r@\n&UWs\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0012VR;x=\u001a\u001cSk=\u0010r,[V8GU]\u0002", "9dh/b(KR\u0001\tyb-\u0001\t<s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u001a\u001e)ek5\u0014b\u0014Xu+HPN9j(", "5dc\u0018X@;]\u0015\fyF6{\r0i\u007f5\n\b\u0007h\n\u001bmY\u0018", ";nc6b5\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "5dc\u001ab;B]\"^\f^5\fG?iy5{G\u0001\u0013%G", "u(;.a+K]\u001d}Do0|\u001bxM\n7\u007fJ\nv(Gx\u001d\u0012", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp(\u001bn,$", "Bx_2", "5dc!l7>\u001bj\u007f\u000b\\\fc\u000f", "Adc!l7>\u001bx\u0002wE\u001e~\u000bmu\u0004\"\t@\b\u0017\u0013Uo", "uH\u0018#", "1`[0h3:b\u0019i\u0005b5\f\t<E\u0011(\u0005Oo+\"G", "1`[0h3:b\u0019i\u0005b5\f\t<E\u0011(\u0005Oo+\"G7_=\u0007#\u0015@\u0004", "1n\\=b5>\\(J", "1n_F", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m5318constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m5448constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m5324calculatePointerEventType7fucELk();
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }

    /* JADX INFO: renamed from: getButtons-ry648PA */
    public final int m5325getButtonsry648PA() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A */
    public final int m5326getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    /* JADX INFO: renamed from: getType-7fucELk */
    public final int m5327getType7fucELk() {
        return this.type;
    }

    /* JADX INFO: renamed from: setType-EhbLWgg$ui_release */
    public final void m5328setTypeEhbLWgg$ui_release(int i2) {
        this.type = i2;
    }

    /* JADX INFO: renamed from: calculatePointerEventType-7fucELk */
    private final int m5324calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.Companion.m5343getScroll7fucELk();
                            case 9:
                                return PointerEventType.Companion.m5338getEnter7fucELk();
                            case 10:
                                return PointerEventType.Companion.m5339getExit7fucELk();
                            default:
                                return PointerEventType.Companion.m5344getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.Companion.m5340getMove7fucELk();
                }
                return PointerEventType.Companion.m5342getRelease7fucELk();
            }
            return PointerEventType.Companion.m5341getPress7fucELk();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = list.get(i2);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m5342getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m5341getPress7fucELk();
            }
        }
        return PointerEventType.Companion.m5340getMove7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.input.pointer.PointerEvent copy(java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> r33, android.view.MotionEvent r34) {
        /*
            r32 = this;
            r11 = r32
            r9 = r34
            r8 = r33
            if (r9 != 0) goto Lf
            androidx.compose.ui.input.pointer.PointerEvent r0 = new androidx.compose.ui.input.pointer.PointerEvent
            r1 = 0
            r0.<init>(r8, r1)
        Le:
            return r0
        Lf:
            android.view.MotionEvent r0 = r32.getMotionEvent$ui_release()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            if (r0 == 0) goto L21
            androidx.compose.ui.input.pointer.PointerEvent r0 = new androidx.compose.ui.input.pointer.PointerEvent
            androidx.compose.ui.input.pointer.InternalPointerEvent r1 = r11.internalPointerEvent
            r0.<init>(r8, r1)
            goto Le
        L21:
            androidx.collection.LongSparseArray r5 = new androidx.collection.LongSparseArray
            int r0 = r8.size()
            r5.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            int r10 = r8.size()
            r1 = 0
        L38:
            if (r1 >= r10) goto L8f
            java.lang.Object r3 = r8.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
            long r6 = r3.m5383getIdJ3iCeTQ()
            r5.put(r6, r3)
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            androidx.compose.ui.input.pointer.PointerInputEventData r12 = new androidx.compose.ui.input.pointer.PointerInputEventData
            long r13 = r3.m5383getIdJ3iCeTQ()
            long r15 = r3.getUptimeMillis()
            long r17 = r3.m5385getPositionF1C5BW0()
            long r19 = r3.m5385getPositionF1C5BW0()
            boolean r21 = r3.getPressed()
            float r22 = r3.getPressure()
            int r23 = r3.m5388getTypeT8wyACA()
            androidx.compose.ui.input.pointer.InternalPointerEvent r2 = r11.internalPointerEvent
            if (r2 == 0) goto L8d
            long r3 = r3.m5383getIdJ3iCeTQ()
            boolean r3 = r2.m5314activeHoverEvent0FcD4WY(r3)
            r2 = 1
            if (r3 != r2) goto L8d
        L77:
            r30 = 1792(0x700, float:2.511E-42)
            r31 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r3 = r12
            r24 = r2
            r12.<init>(r13, r15, r17, r19, r21, r22, r23, r24, r25, r26, r28, r30, r31)
            r6.add(r3)
            int r1 = r1 + 1
            goto L38
        L8d:
            r2 = 0
            goto L77
        L8f:
            androidx.compose.ui.input.pointer.PointerInputEvent r3 = new androidx.compose.ui.input.pointer.PointerInputEvent
            long r1 = r9.getEventTime()
            java.util.List r0 = (java.util.List) r0
            r3.<init>(r1, r0, r9)
            androidx.compose.ui.input.pointer.InternalPointerEvent r1 = new androidx.compose.ui.input.pointer.InternalPointerEvent
            r1.<init>(r5, r3)
            androidx.compose.ui.input.pointer.PointerEvent r0 = new androidx.compose.ui.input.pointer.PointerEvent
            r0.<init>(r8, r1)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerEvent.copy(java.util.List, android.view.MotionEvent):androidx.compose.ui.input.pointer.PointerEvent");
    }
}
