package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
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
/* JADX INFO: compiled from: MotionEventAdapter.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007llA0RlP\u008cZS8.s{J$cҕyCI[\"}(\tWNugvϺb\u000bY\u000f\u000e\u0016~j4Ikxe܈\u00172XoG3SqE9n}>\u0005&3*8\u0010\u0005\t\u001a0L\u0016͌\u0011ŏ{\f@/\u0001sĐV\r[\u0005b \u0014N8\u0001Lm\u0018RDZ\u0005]hBi\u00032P\\;w0+^=Jb9%v\u00101q@\u007fR#:k\u0005\u001dQ\nU3C\u007fO\u001dhU:[M\u0002nNX.,[ۀ̠\u0011]x?%+_z$'Y[\u0014O^%@w)\u0014=@\u0012 \u001e'vA]\u001et#&3#\u0001\u0004D^\u001evB.\u0018(6_1\u000eQC9Iw\u0002eI8f7*\u0013U91!\u0007!\nu>d#=lw\u007f?\u0018@عGݐ͜X<ъ\brh%8(xU\u000eT\u0014\u0011\\(U;iK;!\u001a\u0015\u000fD0\t\u0013\u0007\u0001S\u0018op@P\u0002F;8($ZrrKk!`f-)MJV]å\n˙$\\\u007f˓q?\u001eQgh\u0018n\u0004Ϊ`ɚ1Ϭ;ev\u0088\u001eY?cA5ie\u0016g`}dKJj\u001dX\u0015K*ۑfڅ,\":ʋ;\"\u0006\u0006\\T\u001c\u0015B? (b7\bǌ^ČL\u0003&Փ\u0012\t\u0017lrh>\r+՟0ғm$|էQ\\j\u007f\bg'W\u0003ʌlĘ1AYځӪ&^*h:\u001c+\n\u0005\u0380\u001cuf֟Ks"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001U =QMDKE\u001e\u001ew=8\u0003n;N\u0004|", "", "u(E", "/bc6i,!]*~\bB+\u000b", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001d\u000b!\u001eGk\u0017\u0018\u000421mS", ";nc6b5\u001ed\u0019\b\nM6Z\u00137p\n6{+\u000b\u001b Vo\u001b u\r1d", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{'\u000b \u0019#|\u001b8\u000bz", "5dc\u001ab;B]\"^\f^5\fw9C\n0\u0007J\u000f\u0017\u0002Qs\u0017Kv2\u0019Xe\u001cB,&2GP;r4\u001a#h 5\u0010l6]r6KVW:", "5dc\u001ab;B]\"^\f^5\fw9C\n0\u0007J\u000f\u0017\u0002Qs\u0017Kv2\u0019Xe\u001cB,&2GP;r4\u001a#h", "u(;.a+K]\u001d}Dn;\u0001\u0010xS\u000b$\tN\u0001}!PqiI\u0004!I/", "<dgA<+", "", ">nX;g,Ka", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]U#VH$", ">qTC\\6Na\u0007\t\u000bk*|", "", ">qTC\\6Na\b\t\u0005e\u001b\u0011\u0014/", "/cS\u0013e,LV|}\t", "", ";nc6b5\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "1kT.e\u0016G2\u0019\u0010~\\,Z\f+n\u0002(", "1n]CX9MB#i\u0005b5\f\t<I\t3\fO`(\u0017P~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]L", ">nb6g0H\\vz\u0002\\<\u0004\u0005>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X <QR?u={\u0011o_I\u000e_;X\u0004|", "1n]CX9MB#i\u0005b5\f\t<I\t3\fO`(\u0017P~LLz\u001fBY\u0005 3{\u0016", "1qT.g,)]\u001d\b\n^9`\u0012:u\u000f\b\r@\n&uC~\n", "7mS2k", ">qT@f,=", "", "3mS g9>O!", ">nX;g,K7\u0018", "5dc\u0010b4I]'~eh0\u0006\u0018/rc'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", ";nc6b5\u001ed\u0019\b\nI6\u0001\u0012>e\r\fz", "5dc\u0010b4I]'~eh0\u0006\u0018/rc'C:dc+;|\u0018", "uH\u0018\u0017", "@d\\<i,,b\u0015\u0006zB+\u000b", "6`b\u001db0Gb\u0019\f^]", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i2, (z2 || i2 == actionIndex || (z3 && motionEvent.getButtonState() == 0)) ? false : true));
            i2++;
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int i2) {
        this.activeHoverIds.delete(i2);
        this.motionEventToComposePointerIdMap.delete(i2);
    }

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                    long j2 = this.nextId;
                    this.nextId = 1 + j2;
                    sparseLongArray.put(pointerId, j2);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j3 = this.nextId;
            this.nextId = 1 + j3;
            sparseLongArray2.put(pointerId2, j3);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (motionEvent.getPointerId(i3) == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m5315getComposePointerId_I2yYro(int i2) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i2);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(i2, jValueAt);
        }
        return PointerId.m5365constructorimpl(jValueAt);
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int i2, boolean z2) {
        long jMo5467localToScreenMKHz9U;
        int iM5465getUnknownT8wyACA;
        long jM3953getZeroF1C5BW0;
        long jM5315getComposePointerId_I2yYro = m5315getComposePointerId_I2yYro(motionEvent.getPointerId(i2));
        float pressure = motionEvent.getPressure(i2);
        long jOffset = OffsetKt.Offset(motionEvent.getX(i2), motionEvent.getY(i2));
        long jM3931copydBAh8RU$default = Offset.m3931copydBAh8RU$default(jOffset, 0.0f, 0.0f, 3, null);
        if (i2 == 0) {
            jMo5467localToScreenMKHz9U = OffsetKt.Offset(motionEvent.getRawX(), motionEvent.getRawY());
            jOffset = positionCalculator.mo5468screenToLocalMKHz9U(jMo5467localToScreenMKHz9U);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jMo5467localToScreenMKHz9U = MotionEventHelper.INSTANCE.m5316toRawOffsetdBAh8RU(motionEvent, i2);
            jOffset = positionCalculator.mo5468screenToLocalMKHz9U(jMo5467localToScreenMKHz9U);
        } else {
            jMo5467localToScreenMKHz9U = positionCalculator.mo5467localToScreenMKHz9U(jOffset);
        }
        int toolType = motionEvent.getToolType(i2);
        if (toolType == 0) {
            iM5465getUnknownT8wyACA = PointerType.Companion.m5465getUnknownT8wyACA();
        } else if (toolType == 1) {
            iM5465getUnknownT8wyACA = PointerType.Companion.m5464getTouchT8wyACA();
        } else if (toolType == 2) {
            iM5465getUnknownT8wyACA = PointerType.Companion.m5463getStylusT8wyACA();
        } else if (toolType == 3) {
            iM5465getUnknownT8wyACA = PointerType.Companion.m5462getMouseT8wyACA();
        } else if (toolType == 4) {
            iM5465getUnknownT8wyACA = PointerType.Companion.m5461getEraserT8wyACA();
        } else {
            iM5465getUnknownT8wyACA = PointerType.Companion.m5465getUnknownT8wyACA();
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        for (int i3 = 0; i3 < historySize; i3++) {
            float historicalX = motionEvent.getHistoricalX(i2, i3);
            float historicalY = motionEvent.getHistoricalY(i2, i3);
            if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                long jOffset2 = OffsetKt.Offset(historicalX, historicalY);
                arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i3), jOffset2, jOffset2, null));
            }
        }
        if (motionEvent.getActionMasked() == 8) {
            jM3953getZeroF1C5BW0 = OffsetKt.Offset(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
        } else {
            jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        return new PointerInputEventData(jM5315getComposePointerId_I2yYro, motionEvent.getEventTime(), jMo5467localToScreenMKHz9U, jOffset, z2, pressure, iM5465getUnknownT8wyACA, this.activeHoverIds.get(motionEvent.getPointerId(i2), false), arrayList, jM3953getZeroF1C5BW0, jM3931copydBAh8RU$default, null);
    }
}
