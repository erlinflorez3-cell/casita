package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007Ӭ4\u0012\u000e\u0007nʑA0RqP\u008cZS@\u000fs{B$c$wGCU(Ԃ*ޛWNumvJ`\fK\u000f\u001c\u0016\u0001̓2Ikތ\u000e\u0018\u001f4Rom3{n}\u0001pxD\u000682P:\n\u000b\u000f\u001dBJ&u)G[\u0012 5XrPQ;S\u0015& \rV(\u0011 lg|?^k\fB?)\u0011sZP=^^\u0003]\u0017T_?\u0013\u0007c.+n@c\u001dȏW\u0003\u0015^$E\u0011L\n=3hm;sZ\u0002eNX.\u0016E1]\u001cut<[3a'І'sUq\\h\u000eV\nA\u0010UJ\u0012!\u001e'v7]\u001et\u001c&3#r\u001aT\u0019\flW\u0018z\u0010??%.IqMkr_bS\u0019|9R˟\u000f̷'\u0001vď,f\u001ck-!dya1\u007fIkP%˦[ǀq\u0004xçR8\u0012:_\u0002Ez?4m©9٦=#)ǽR\\Rn\u000f\rpjci\u0001QV!\u001d\u001e\u000eѪ\u000bɔ^Dlʍ<^b]D\u0013c\u001b\u0003\rTܴ\u0015ء`wDƙu$\\R\u0001k\u0001L\f\u000e{ÇhǶXʤā\rVߍb3=ȡҲ\u0010jZy\u001a͕X\u0011\u0004`fHr۷^s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0003<]{&3j\u001d.;CCg=-\u0019fo\u0019\u000ec4N\u007f6\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0003<]{&3j\u001d.;CCg=-\u0019fo\"\u0011b,$", "3mP/_,=", "", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "=m;<a.\u001cZ\u001d|\u0001E(y\t6", "", "=m;<a.\u001cZ\u001d|\u0001", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=m29\\*D:\u0015{ze", "=m29\\*D", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\rAt\u0016\u00044H7|0g\u001cdj;PQ;[z0I\"52fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fX\u000bQu>g\f\u0011\u0001\u0011~CrVUfc\u0003I\u0017,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y%seULs^\u0006y8'\u0015\u007f\u0001!2e}'{vb4+2t\fZE\"Gl\b\"<ZP13\u001e8 EKpK0/", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ClickableSemanticsElement extends ModifierNodeElement<ClickableSemanticsNode> {
    private final boolean enabled;
    private final Function0<Unit> onClick;
    private final String onClickLabel;
    private final Function0<Unit> onLongClick;
    private final String onLongClickLabel;
    private final Role role;

    public /* synthetic */ ClickableSemanticsElement(boolean z2, Role role, String str, Function0 function0, String str2, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, role, str, function0, str2, function02);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    private ClickableSemanticsElement(boolean z2, Role role, String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        this.enabled = z2;
        this.role = role;
        this.onLongClickLabel = str;
        this.onLongClick = function0;
        this.onClickLabel = str2;
        this.onClick = function02;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClickableSemanticsNode create() {
        return new ClickableSemanticsNode(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClickableSemanticsNode clickableSemanticsNode) {
        clickableSemanticsNode.m617updateUMe6uN4(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        Role role = this.role;
        int iHashCode2 = (iHashCode + (role != null ? role.hashCode() : 0)) * 31;
        String str = this.onLongClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.onLongClick;
        int iHashCode4 = (iHashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31;
        String str2 = this.onClickLabel;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSemanticsElement)) {
            return false;
        }
        ClickableSemanticsElement clickableSemanticsElement = (ClickableSemanticsElement) obj;
        return this.enabled == clickableSemanticsElement.enabled && Intrinsics.areEqual(this.role, clickableSemanticsElement.role) && Intrinsics.areEqual(this.onLongClickLabel, clickableSemanticsElement.onLongClickLabel) && this.onLongClick == clickableSemanticsElement.onLongClick && Intrinsics.areEqual(this.onClickLabel, clickableSemanticsElement.onClickLabel) && this.onClick == clickableSemanticsElement.onClick;
    }
}
