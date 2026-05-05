package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU }(\teȞ\u0018g\u001dI\u0013\nOO\tȀ|j:I\u001e|k\u0016'2pt\bG[uU9\u000f{f\t.::8(\u000e1\u001e8R(v)N\u001c\u001e 1XvJT\u001dM3\u001d@\b\u0015ī\u0003ɉ`gVȤՈpj"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv\u0007XLW;G_|<$\u0010Z\u001b$", "", "u(E", ">qTC\\6Na\u0004\t~g;|\u0016\u0013n\u000b8\u000b\u001f|&\u0013", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u00198\u0004355\u000b-3\u0002k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv\u0007XLW;G_|<$\u0010Z\u001b\r\u0016\u0017\tbP${(@*\u0018;(}JdV", "1kT.e", "", ">q^1h*>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001Q\u001f=MPDg;\t\u001fljH\u0007p\f_v0V\"", ">nX;g,K7\"\n\u000bm\f\u000e\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]L", ">nb6g0H\\vz\u0002\\<\u0004\u0005>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X <QR?u={\u0011o_I\u000e_;X\u0004|", "\u001enX;g,K7\"\n\u000bm\u000bx\u0018+", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PointerInputChangeEventProducer {
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long jMo5468screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputEventData pointerInputEventData = pointers.get(i2);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m5400getIdJ3iCeTQ());
            if (pointerInputData == null) {
                uptime = pointerInputEventData.getUptime();
                jMo5468screenToLocalMKHz9U = pointerInputEventData.m5402getPositionF1C5BW0();
                down = false;
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                jMo5468screenToLocalMKHz9U = positionCalculator.mo5468screenToLocalMKHz9U(pointerInputData.m5390getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m5400getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m5400getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m5402getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jMo5468screenToLocalMKHz9U, down, false, pointerInputEventData.m5405getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m5404getScrollDeltaF1C5BW0(), pointerInputEventData.m5401getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(pointerInputEventData.m5400getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m5403getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m5405getTypeT8wyACA(), null));
            } else {
                this.previousPointerInputData.remove(pointerInputEventData.m5400getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    /* JADX INFO: compiled from: PointerInputEventProcessor.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.ZS0\u0018q{Jř\f$ B{x*\u00020\tgN\u0016h~Nh\r[\u000f4\u0019\tn:Mmx\f\u0017\u001f6PuW3{vެ=`\u0003>U/@&Py3\u0006ʀ.N\u0018͌\u0013EQ\u0015 :\u0011\bHT%M3\u001dǀ\u0005̄ơ\u007f\u001d֔kV>HzjR1)\u000ewN\u001f>m6\u0015M;Mŏ&˙ɱ`\u001dҋD?=\u00153c\u001b\tXiM\u0012\u0010\u0001K\u0005\u0001'U,ʁw]>ݙ\u0018\u0016\u001b<]\u0019ơr/d\bWԂ(U*WcQo˔,\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv\u0007XLW;G_|<$\u0010Z\u001b\r\u0016\u0017\tbP${(@*\u0018;(}JdV", "", "Coc6`,", "", ">nb6g0H\\\u0003\bh\\9|\t8", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "2nf;", "", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x#2 h7", "uI9'<\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u0011b>G", "u(I", "5dc\u001db:Bb\u001d\t\u0004H5j\u0007<e\u007f1C!Ltf$aX", "u(9", "\u0018", "5dc!l7>\u001b\bQ\rr\bZd", "u(8", "\u0017", "5dc\"c;B[\u0019", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j2, long j3, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, z2, i2);
        }

        private PointerInputData(long j2, long j3, boolean z2, int i2) {
            this.uptime = j2;
            this.positionOnScreen = j3;
            this.down = z2;
            this.type = i2;
        }

        public final long getUptime() {
            return this.uptime;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m5390getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
        public final int m5391getTypeT8wyACA() {
            return this.type;
        }
    }
}
