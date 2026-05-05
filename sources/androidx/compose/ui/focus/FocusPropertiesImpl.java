package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005%4\u0012\u000e\u0007nj?6Le^.ZS@\u000fs{:>aҕ\bّkUH|b\fҊRgun\u001br\u0019D'\u0006DzA߱UǤ|i\u001aƁJDuBAQ\u0010??e\u0003<U8@)Py3\tpݩTǘz\u0007Kŷ$\u00146I~Dr\u000fS\u0010(\u001eVV.\u000e6\\\u0016V\rԶxҺ>;+Ʌ\u0002DT5m:\u001dO\u0013Ub3]!o.CLG7%%\u0002\u0015\u0017Tk?1G N[ة3ݳ/[{ɎFZ\u0006'#+g\u000fc\u00074q%Sf\"5B \u000eYh&4\b|\f\rj\u0016\u001e\b7H\\5Hw^ԛ?ϢveHА\u0012`H\u0019\taN\u0019+\u001aA@Y\u001dlloRifE\u0018\u001d\rL+WͰ-ƟX\u001ahٽ3V}n?[`?Nl\u0018e\u000e\u0006\u0012\u0010z\u0002X\f\u0007ϱ\f\u009e\u007f\u001d6Ϗ=9aY1+\f\u0004Neu\u0003Uxvu\u0002RvHxÙ\"֖.\u0015\u0014ɮ\\f\u000b\u000f^^x.\u0017q*`W\u0016\u001688\\&Dwَ\u001cʽStqҔe_\u0010K=pW[t\u0013\u001cc\nvA]ic>i)ί ͖@n\r֚~DY5hfH$8rx\u001cH\u0014Ry$\u0013`GHʠ@Ϝ5%dé`\u0005$nO\u0007)a`\u0016\u001e\u000bՇ7R"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\u0018& o7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\n", "u(E", "1`]\u0013b*Na", "", "5dc\u0010T5\u001f]\u0017\u000f\t", "u(I", "Adc\u0010T5\u001f]\u0017\u000f\t", "uY\u0018#", "2nf;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "5dc\u0011b>G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.$m\">MQJkAs", "Adc\u0011b>G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\r7y&.[R;x\na\u0006", "3mS", "5dc\u0012a+", "Adc\u0012a+", "3mc2e", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "5dc\u0012a;>`Wz\u0004g6\f\u0005>i\n1\n", "5dc\u0012a;>`", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u0012a;>`", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "3wXA", "5dc\u0012k0M\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0012k0M", "Adc\u0012k0M", ":dUA", "5dc\u0019X-M", "Adc\u0019X-M", "<dgA", "5dc\u001bX?M", "Adc\u001bX?M", ">qTC\\6Na", "5dc\u001de,OW#\u000f\t", "Adc\u001de,OW#\u000f\t", "@hV5g", "5dc\u001f\\.Ab", "Adc\u001f\\.Ab", "AsP?g", "5dc g(Kb", "Adc g(Kb", "Co", "5dc\"c", "Adc\"c", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;
    private FocusRequester next = FocusRequester.Companion.getDefault();
    private FocusRequester previous = FocusRequester.Companion.getDefault();
    private FocusRequester up = FocusRequester.Companion.getDefault();
    private FocusRequester down = FocusRequester.Companion.getDefault();
    private FocusRequester left = FocusRequester.Companion.getDefault();
    private FocusRequester right = FocusRequester.Companion.getDefault();
    private FocusRequester start = FocusRequester.Companion.getDefault();
    private FocusRequester end = FocusRequester.Companion.getDefault();
    private Function1<? super FocusDirection, FocusRequester> enter = new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
            return m3878invoke3ESFkO8(focusDirection.m3852unboximpl());
        }

        /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
        public final FocusRequester m3878invoke3ESFkO8(int i2) {
            return FocusRequester.Companion.getDefault();
        }
    };
    private Function1<? super FocusDirection, FocusRequester> exit = new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$exit$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
            return m3879invoke3ESFkO8(focusDirection.m3852unboximpl());
        }

        /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
        public final FocusRequester m3879invoke3ESFkO8(int i2) {
            return FocusRequester.Companion.getDefault();
        }
    };

    public static /* synthetic */ void getEnter$annotations() {
    }

    public static /* synthetic */ void getExit$annotations() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z2) {
        this.canFocus = z2;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setNext(FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setPrevious(FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setUp(FocusRequester focusRequester) {
        this.up = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setDown(FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setLeft(FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setRight(FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setStart(FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnd(FocusRequester focusRequester) {
        this.end = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1<FocusDirection, FocusRequester> getEnter() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnter(Function1<? super FocusDirection, FocusRequester> function1) {
        this.enter = function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1<FocusDirection, FocusRequester> getExit() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setExit(Function1<? super FocusDirection, FocusRequester> function1) {
        this.exit = function1;
    }
}
