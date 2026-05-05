package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: InternalPointerInput.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r)4ߚ\u007f\u0007|jA0JeP.`\\2şs{B)cҕyCQU\"}(\tWNu\u0006vJp\u000bK\u000f\f@\u0001j:O]ތe\u0012\u001d>JģEݍS\u0006މi`#5E\nB&Fy\u001d\u0001H+X\u0014\u0005|[K:\u0015@D~>j\r{\n*\u0016\u0014D8\u0001LawRDO\u0005]h73\u0007wKf'\u000e:\rQ\u001bQl';\u0003q$1@EB-%\u0002\u000b\u0017^a?\u0011M\nC\u0015j7'YY\"fF^\u0006\u0014#<g\r\fw6b\u000bQn\u001e?+}hׂT\u000e6\u000bC\u0010\u001bb\u001c\u000e4(\u000fΚ.ָe\u0007ս2οɤWBV)l\\H\u000fo^/%.8qޔ\u001cȑP`ߛ\u0018\u05cbѼ\u007f\u0007\u0013G1\u001b75i~&`C \u001bɴRƱP?عGݐ̆]?s/~|J1\u0012\\_\u007f]~Wҋ\u0018mKif;!\u001a\u0007\u000f\u05fahѱ\u0004_ŞR֟ʐLB(\u001d$Qr\u001d\u001a\n\\d3p\u0017ՀYą\u0010LʵS͵ą\f\u0015&\r\u0006Vi,\u001e\u007fgh\u0018r\u0014ϱ\u000bm6tiqn\u001a\u0018\u001e߱_{I_\u0017(a\u0001\u0003Zͺ=Ѯ\u0004WۡAͭ۱^^.V@k3\u0017\u00061\\N:\u001bxƴrdA:g1b%J\u0013\u001epQ+\u0018&˺iXпSA[\u001biRڏ9\u0007V\\~o\u007fxw--f(-OSM\u0019TXRn:|1\u000b\u0017s.L\u0018RMLz\u001c\u000eU*%F ?Q=D+\u000f-1b\b3EZ{}Q{\u001cW\u0001\u0003y\u001dF\u0001.\u0016\u0014\u001bv2`xWgTE*'jx#\u0016r\u0018\u007fqH\u000bG\u0012d9jnOx\u0003gMf8+\nO$+\u0001}4\u00155[Hm\u07bb\u0015È\u0013٬ֵe_o(<3+ 4/}\u0004ZkFup\ru4Q7wXEѭ#ls\u0011~`j&E\tߝ3U:V\u007f|p\u0005w\u0014¨.Nu\u00159%p\u0005cǈ\u0017u\u0006ҮFa0\bQ\u0013dmQ,)M\u0002oƽqQd֥b\u0011\u0010!\nF?'*K8\\gd\u001904\u0004FEװ?h\rµ!&:CJ [Zbi\u001e\u0010)\u0001̄^ʕƘ1AǠ?^\u0016T\u0007wnJ\u000bySzqA\u000f\u0011'3L}î0܊\u0600ESвg:\tS+$3lU\u001bt?{[b?3(\u0007\u0006׃D؏ǖH\u0001\u0530\bO1my\u000b$:\u001e\u001a+\\h2GU)_%5ϕ\nٝΝMcʝ\u0016nZN0D\u0017|\u0003,J$_\u001a'X\u000bo\u00117ٮR}?Ƒ2\u0003\u001dc7'\\\u0014qW3-4:м<Ɩߖ\u0013&ٖ[[C}\u0016;8)\n\u0016/v(%t\u0015u\u001bh\"\u0082\u0015Ȉר\b\u0012ц$\f6J\u0003\u0017\"0\u000eX]%\u0004\u0011!`qk&$͛+1tݩZMn\u001e\u0018}\u061ccw]\u000e\tЁM\u0005xv-V<Խ+\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]U#VH$", "", "7c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", "Coc6`,", "", ">nb6g0H\\\u0003\bh\\9|\t8", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">nb6g0H\\", "2nf;", "", ">qT@f<KS", "", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x#2 h7", "/bc6i,!]*~\b", "6hbAb9BQ\u0015\u0006", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001P\u001a<\\MHo2\u001a\u001cFd5\u0010e,$", "Aba<_3\u001dS \u000ev", "=qX4\\5:Zx\u0010zg;g\u0013=i\u000f,\u0006I", "uI9\u0017=!\u001f7\u000ee\u007fZ=xR?t\u0004/E'\u0005%&\u001dTr#|/D`\u0002)\u0001r'6\u0017GDz4+\u001edh\u0003ec-J\u0007.V*X5ja\u007fM\u0012!d\u001b6'\u001a\u000bYNy25", "5dc\u000eV;Bd\u0019a\u0005o,\n", "u(I", "5dc\u0011b>G", "5dc\u0015\\:M]&\u0003xZ3", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0016Ws#!\u001d\\zM\u0018", "u(9", "\u0018", "5dc\u001ce0@W\"z\u0002>=|\u0012>P\n6\u007fO\u0005! \u000fPY\u001aF\u0002'$", "5dc\u001db:Bb\u001d\t\u0004&\rHf~Bqr", "5dc\u001db:Bb\u001d\t\u0004H5j\u0007<e\u007f1C!Ltf$aX", "5dc\u001de,La)\fz", "u(5", "5dc V9HZ ]ze;xP\u00101]wX2K", "5dc!l7>\u001b\bQ\rr\bZd", "u(8", "\u0017", "5dc\"c;B[\u0019", "1n\\=b5>\\(J", "1n\\=b5>\\(JBCy\u0001f/Tk", "1n\\=b5>\\(JE", "1n\\=b5>\\(JE&\rHf~Bqr", "1n\\=b5>\\(JF", "1n\\=b5>\\(JF&\rHf~Bqr", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(LB?wZX\fWJ", "1n\\=b5>\\(M", "1n\\=b5>\\(MB?wZX\fWJ", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(PBM~\u000f\u001d\u000bC[", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1n_F 9<&{^aR", "uI9\u0017=!\u001f7\u000ee\u007fZ=xR?t\u0004/E'\u0005%&\u001dTr\u007f]!>X\u000b*;l)wKMCv>,\u00152q=Pg5Y\u00076\u0011WX0earJ]|d\u0012W:\r\u0012=J/~S\u00170\b5X`7w|a", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, List list, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, z2, f2, i2, z3, list, j6, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rc8HELY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m5392copyrc8HELY$default(PointerInputEventData pointerInputEventData, long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, List list, long j6, long j7, int i3, Object obj) {
        long j8 = j2;
        long j9 = j4;
        long j10 = j3;
        boolean z4 = z2;
        long j11 = j5;
        List list2 = list;
        boolean z5 = z3;
        int i4 = i2;
        float f3 = f2;
        long j12 = j7;
        long j13 = j6;
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            j8 = pointerInputEventData.id;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j10 = pointerInputEventData.uptime;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            j9 = pointerInputEventData.positionOnScreen;
        }
        if ((i3 & 8) != 0) {
            j11 = pointerInputEventData.position;
        }
        if ((i3 & 16) != 0) {
            z4 = pointerInputEventData.down;
        }
        if ((i3 & 32) != 0) {
            f3 = pointerInputEventData.pressure;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            i4 = pointerInputEventData.type;
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            z5 = pointerInputEventData.activeHover;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            list2 = pointerInputEventData.historical;
        }
        if ((i3 & 512) != 0) {
            j13 = pointerInputEventData.scrollDelta;
        }
        if ((i3 & 1024) != 0) {
            j12 = pointerInputEventData.originalEventPosition;
        }
        int i5 = i4;
        boolean z6 = z5;
        List list3 = list2;
        return pointerInputEventData.m5399copyrc8HELY(j8, j10, j9, j11, z4, f3, i5, z6, list3, j13, j12);
    }

    /* JADX INFO: renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m5393component1J3iCeTQ() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m5394component10F1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m5395component11F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m5396component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m5397component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m5398component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.activeHover;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* JADX INFO: renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m5399copyrc8HELY(long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, List<HistoricalChange> list, long j6, long j7) {
        return new PointerInputEventData(j2, j3, j4, j5, z2, f2, i2, z3, list, j6, j7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m5367equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m3934equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m3934equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m5457equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && Offset.m3934equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m3934equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m5368hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m3939hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m3939hashCodeimpl(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m5458hashCodeimpl(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + Offset.m3939hashCodeimpl(this.scrollDelta)) * 31) + Offset.m3939hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) PointerId.m5369toStringimpl(this.id)).append(", uptime=").append(this.uptime).append(", positionOnScreen=").append((Object) Offset.m3945toStringimpl(this.positionOnScreen)).append(", position=").append((Object) Offset.m3945toStringimpl(this.position)).append(", down=").append(this.down).append(", pressure=").append(this.pressure).append(", type=").append((Object) PointerType.m5459toStringimpl(this.type)).append(", activeHover=").append(this.activeHover).append(", historical=").append(this.historical).append(", scrollDelta=").append((Object) Offset.m3945toStringimpl(this.scrollDelta)).append(", originalEventPosition=").append((Object) Offset.m3945toStringimpl(this.originalEventPosition)).append(')');
        return sb.toString();
    }

    private PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, List<HistoricalChange> list, long j6, long j7) {
        this.id = j2;
        this.uptime = j3;
        this.positionOnScreen = j4;
        this.position = j5;
        this.down = z2;
        this.pressure = f2;
        this.type = i2;
        this.activeHover = z3;
        this.historical = list;
        this.scrollDelta = j6;
        this.originalEventPosition = j7;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m5400getIdJ3iCeTQ() {
        return this.id;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m5403getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m5402getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m5405getTypeT8wyACA() {
        return this.type;
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, List list, long j6, long j7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, z2, f2, i2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? new ArrayList() : list, (i3 + 512) - (i3 | 512) != 0 ? Offset.Companion.m3953getZeroF1C5BW0() : j6, (i3 & 1024) != 0 ? Offset.Companion.m3953getZeroF1C5BW0() : j7, null);
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m5404getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m5401getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }
}
