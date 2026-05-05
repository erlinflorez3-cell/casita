package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP.X^2\u000fyڔ<řc$\u007fIC٥\"}0\u0015WȞog|Jb\u000bI\u000f\u000e\u0016\u000fj4կ[ލc(ƁbH\u007fACM\u001e=g_5Q\u0015$@#Py3\u0003*.V\u0013\u000fzqO\u001c\u0016>E\t:\u0001\u0013̂\t\u001a \r\u0007'\u000f'tg|8\u000fȐ^\u000361\r\u0002B|+&ݡ}\u0016!T_?\r%gdҫA̳4\u0014ɥRΈ\u07baV]E\u000fM~\u00064v5?+w֕\b<^\u007f\"\u0016CO;_#,b\u0005_c$'YS\u0014QV\u000e6|\u0013{;BJف\u0005ТG͓ǉ\u001eh\u000e\u001dA\u0005;YNa\u001a^p\u007fAu~(3\u0012K+g\u001f\u0017WoN1PMz3!dƗ\u00027(ii&`C1\u001bʄPyXNT`N8q\u0004Ѿ\u00039p\u0010C\u001c0u\u001a_\u007f\u001fI/%e[\u007f7iu\u0010d\\g%\u001f\th\u0002\u0007\u0019\\\u0011.|\u0019O*7\u00101ըfʰoP\\А|%[!l\u0007,\u000ei\u0601^˵;ƙڰ\u000fMћlkrMk\u0012u;t8qn\u001a\u0010.ޭ`ۋ9Qk߄УR\u007f\u001cBBЗ!\u0007eJS\u0012yڋ,@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T,?W\u0004~;i\u001d\u0016WB?l8\u001e\">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T,?W\u0004~;i\u001d\u0017WB;A", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006R.1`\b\"&q\u001e.8G9q4+\u0003w]H\u00079", "/tc<F>Bb\u0017\u0002ih\u0014\u0001\u0012?t\u007f", "", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;CBk2-\u0019rj!\u0011b,$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u0002CZ\u000eMV]3`[<B%\u001a$\u0012W:\r\u0012b=+8#7 \u0004<P\u0011\u0019r\n\u001a%\u001bEh\u007fLcwC\u0007\u001buN~,7", "\u0017", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(LBr,zu>Bc", "u(8", "1n_F", "1n_F ,\u0011c\u0016\u0012\bB", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u0002CZj.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b,jS7,\f(PO\u0005F\b\u0016\u0014\u0014\u0014nlI>\u001aF}\u0016yA6>", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    public static final int $stable = 0;
    private final boolean autoSwitchToMinute;
    private final int selection;
    private final AnalogTimePickerState state;

    public /* synthetic */ ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(analogTimePickerState, z2, i2);
    }

    private final AnalogTimePickerState component1() {
        return this.state;
    }

    private final boolean component2() {
        return this.autoSwitchToMinute;
    }

    /* JADX INFO: renamed from: component3-yecRtBI, reason: not valid java name */
    private final int m1897component3yecRtBI() {
        return this.selection;
    }

    /* JADX INFO: renamed from: copy-e8ubxrI$default, reason: not valid java name */
    public static /* synthetic */ ClockDialModifier m1898copye8ubxrI$default(ClockDialModifier clockDialModifier, AnalogTimePickerState analogTimePickerState, boolean z2, int i2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            analogTimePickerState = clockDialModifier.state;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            z2 = clockDialModifier.autoSwitchToMinute;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i2 = clockDialModifier.selection;
        }
        return clockDialModifier.m1899copye8ubxrI(analogTimePickerState, z2, i2);
    }

    /* JADX INFO: renamed from: copy-e8ubxrI, reason: not valid java name */
    public final ClockDialModifier m1899copye8ubxrI(AnalogTimePickerState analogTimePickerState, boolean z2, int i2) {
        return new ClockDialModifier(analogTimePickerState, z2, i2, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return Intrinsics.areEqual(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute && TimePickerSelectionMode.m2765equalsimpl0(this.selection, clockDialModifier.selection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + Boolean.hashCode(this.autoSwitchToMinute)) * 31) + TimePickerSelectionMode.m2766hashCodeimpl(this.selection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) TimePickerSelectionMode.m2767toStringimpl(this.selection)) + ')';
    }

    private ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z2, int i2) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z2;
        this.selection = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClockDialNode create() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute, this.selection, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClockDialNode clockDialNode) {
        clockDialNode.m1900updateNodee8ubxrI(this.state, this.autoSwitchToMinute, this.selection);
    }
}
