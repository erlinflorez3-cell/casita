package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0015s{BBc$\bCC٥\"}8\tWN}gvJ`\fK\u000f\u0014\u001c\u0001j2I[ތs܈?8RqO3{ڎk8!\u001eF\t.2:8(\u0006\u0011 0H\u001ex\u0013Cy\u000f\"6NtRT#L3\u001f\"\fD \u000f$tg|=Ղp]H7k*wQf/o2\rM;Wj&;\u0007\u001259ROH%'c\u00035ѸkC\u0013A\b<3yU:ȅMs]J!\u0004\"*CO;ƞ;*j\u001bi`:ʬsaqbh\u000eV\u0010#{;A4\u0012\u0014@`.[2-\b^B\u0003rk@~\u0003ެF\u0006\u0003ʨN\u0019+\tA5\n,tUy=/Me\u0001˿\u0011$+Ч\u0007#a_\u001cle*b\u0005i1\u007fAs\rݳ\u000e]Uo\n~p\fø\bJ"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0012TLY(iRq+\u0014\u0019Z\f]/\u0017\u000e/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=gqdo9uc?]a4GWJ9\\Q`=\u001b\u0012X\u001dR5\u0016Z", "1ta?X5MD\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", ":`h<h;+S'\u000f\u0002m\u0017\n\u0013By", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=4?OuD-\u0002hoI\u000er\u0017[\u0001:[\"", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHqp,Yr4GK<,cRpL\u0018\u001cc{]'\u001c\u0005/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fm_5M\u00041KKauZ\\zH\u001e ZW^/V\u0014YT38H@*\u0018;\u0013k<i\u000f\f%u1u{F_\u0012\u001d`\u0011~@6rJXrCEKMm4r\f)\u001efJC#\u0010\u0001\u001d%q\u001a=\n\u000fbZaR\rvNC-\u0005H3+miVL~@I~:3!bs\u001b1e~/s@M24>o\u000fYga?h\t\u001e+XP+0?\u0006\"?^r?z>\u0015h\u001dp\f\u0018k~ \u0019xtNU\u000f\u0012Y$[4O_\b7P\u0015BSx\u00036B\u000eB1=\u0006", "5dc\u0010h9KS\"\u000ekZ3\r\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "5dc\u0019T@Hc(kzl<\u0004\u0018\u001ar\n;\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u0005.`R\"gH(%wN9\u0015s3]a4Q_b\u0002", "D`[BX", "5dc#T3NS", "2d[2g,\"T\u0007~\u0002^*\f\t.O\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "=q", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";ne26<Ka#\fYh>\u0006eCP{*{", ";ne26<Ka#\fji\t\u0011s+g\u007f", "8t\\=5@)O\u001b~\tH-}\u0017/t", "", ">`V2f\bF])\b\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    public static final int $stable = 8;
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i2 + 8) - (i2 | 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m6370getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m6365copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m1663getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    public final List<EditCommand> deleteIfSelectedOr(Function1<? super TextFieldPreparedSelection, ? extends EditCommand> function1) {
        if (TextRange.m6117getCollapsedimpl(m1663getSelectiond9O1mEE())) {
            EditCommand editCommandInvoke = function1.invoke(this);
            if (editCommandInvoke != null) {
                return CollectionsKt.listOf(editCommandInvoke);
            }
            return null;
        }
        return CollectionsKt.listOf((Object[]) new EditCommand[]{new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m6121getMinimpl(m1663getSelectiond9O1mEE()), TextRange.m6121getMinimpl(m1663getSelectiond9O1mEE()))});
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        TextFieldPreparedSelection textFieldPreparedSelection = this;
        if (textFieldPreparedSelection.getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return textFieldPreparedSelection;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        TextFieldPreparedSelection textFieldPreparedSelection = this;
        if (textFieldPreparedSelection.getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return textFieldPreparedSelection;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy r7, int r8) {
        /*
            r6 = this;
            androidx.compose.ui.layout.LayoutCoordinates r4 = r7.getInnerTextFieldCoordinates()
            if (r4 == 0) goto L15
            androidx.compose.ui.layout.LayoutCoordinates r2 = r7.getDecorationBoxCoordinates()
            r3 = 0
            if (r2 == 0) goto L13
            r1 = 0
            r0 = 2
            androidx.compose.ui.geometry.Rect r3 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r2, r4, r1, r0, r3)
        L13:
            if (r3 != 0) goto L1b
        L15:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r3 = r0.getZero()
        L1b:
            androidx.compose.ui.text.input.OffsetMapping r2 = r6.getOffsetMapping()
            androidx.compose.ui.text.input.TextFieldValue r0 = r6.currentValue
            long r0 = r0.m6370getSelectiond9O1mEE()
            int r0 = androidx.compose.ui.text.TextRange.m6118getEndimpl(r0)
            int r1 = r2.originalToTransformed(r0)
            androidx.compose.ui.text.TextLayoutResult r0 = r7.getValue()
            androidx.compose.ui.geometry.Rect r0 = r0.getCursorRect(r1)
            float r5 = r0.getLeft()
            float r4 = r0.getTop()
            long r0 = r3.m3970getSizeNHjbRc()
            float r1 = androidx.compose.ui.geometry.Size.m4003getHeightimpl(r0)
            float r0 = (float) r8
            float r1 = r1 * r0
            float r4 = r4 + r1
            androidx.compose.ui.text.input.OffsetMapping r3 = r6.getOffsetMapping()
            androidx.compose.ui.text.TextLayoutResult r2 = r7.getValue()
            long r0 = androidx.compose.ui.geometry.OffsetKt.Offset(r5, r4)
            int r0 = r2.m6095getOffsetForPositionk4lQ0M(r0)
            int r0 = r3.transformedToOriginal(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }
}
