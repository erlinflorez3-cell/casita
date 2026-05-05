package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
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
/* JADX INFO: compiled from: InternalPointerEvent.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?2Le^.ZS0\u0012s{B-c$wGCU0}*\tUOm˧\u0005Ϻ\u000b\u000bq\u000eF/\tt:Im~m\u0014\u001f2pqm4]sK<xtd\tڶ6\"F~M\u0017(>`\u0010%\nsO\u001a'H@\u001fPƞ\f˟ŋ\u001e\u0014\fU.\u0019nquNNN|_J/Q\u0005\u0018CĚ+e8ŧe\u000fLZ5\u0014Gp,3X7c\u001e[\u0018Ϋ\u000bVsA\tI\u007fHUw5*CI\"[͏\\\u0006\u001cƃCQ\u0013i\u00013-\u001d_n$'Y^:֦\\ˎ,\u0004\u0003Ԉ%>\n\u001e\u00148h03,t\u001bԇ3yzVFв\u001e\rAȾ~z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001Q\u001f=MPDg;\t\u001fljH\u0007p\f_v0V\"", "", "1gP;Z,L", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u00198\u0004355\u000b-3\u0002k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", ">nX;g,K7\"\n\u000bm\f\u000e\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]L", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!Pq{Gr2CYY-Di*\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&V{H$!$\u0019X/\u0016\u0014YNmYN;(\u0017,VeDs\u0011\u001bu\u001f5s\u007f\u0018\u001a\u0001", "5dc\u0010[(GU\u0019\r", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`}Qx\u0010*\u0002!Bg}{Dz\u0012B#", ";nc6b5\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "5dc\u001ab;B]\"^\f^5\f", "u(;.a+K]\u001d}Do0|\u001bxM\n7\u007fJ\nv(Gx\u001d\u0012", "5dc\u001db0Gb\u0019\f^g7\r\u0018\u000fv\u007f1\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0019WGDz4+xqlI\u0016C=N\u007f6\u001d", "At_=e,La\u0001\t\f^4|\u0012>C\n1\nP\t\"&Ky\u0017", "", "5dc h7I`\u0019\r\tF6\u000e\t7e\t7YJ\n%'Oz\u001d@\u0001.", "u(I", "Adc h7I`\u0019\r\tF6\u000e\t7e\t7YJ\n%'Oz\u001d@\u0001.", "uY\u0018#", "/bc6i,!]*~\b>=|\u0012>", ">nX;g,K7\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", "/bc6i,!]*~\b>=|\u0012>-J\ty\u001fO\t\u000b", "uI\u0018'", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InternalPointerEvent {
    public static final int $stable = 8;
    private final LongSparseArray<PointerInputChange> changes;
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public InternalPointerEvent(LongSparseArray<PointerInputChange> longSparseArray, PointerInputEvent pointerInputEvent) {
        this.changes = longSparseArray;
        this.pointerInputEvent = pointerInputEvent;
    }

    public final LongSparseArray<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* JADX INFO: renamed from: activeHoverEvent-0FcD4WY, reason: not valid java name */
    public final boolean m5314activeHoverEvent0FcD4WY(long j2) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i2);
            if (PointerId.m5367equalsimpl0(pointerInputEventData.m5400getIdJ3iCeTQ(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void setSuppressMovementConsumption(boolean z2) {
        this.suppressMovementConsumption = z2;
    }
}
