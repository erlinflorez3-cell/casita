package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
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
/* JADX INFO: compiled from: EditProcessor.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?3LeVLZS@\u000fsڔ<$i0yCAU\"}0\tWNmgvJp\u000bK\u000f\f\u0017~oBկ\u0006x\f\u0011O5Բs?AM8OGj\r63&b,F\u0005\u001d\u0007*,X\u0010%\bqWT0>N\t:\u0001\u001c}\u000f(\u001d\u001eD0\u0003.\\\u0016[dT\u001dcH?;\u0005\u007fA|4&0Ec\u001bWl';\t\u0012\"9SO5C+\u0004\t\u0015fsA\u0019> RMl5=CI\"]~b\u000e+-+}\u001c\u0006rTiKQ1(5.gcyR>,\u0006{\u0014\rj\u0006LF}Ο:ǉ\u001el\u0010ԄKvxWNURzP\u0007\u0013ad\u001dU\u0004A,Q\u001b\u0015W {o\u05ccC߉\t\u0013&ŀ\u0019p'cb\u0017ה\u00193"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u0001;WA;yB(\">", "", "u(E", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u001a7O Kl5\u001e\">", ";Ad3Y,K", "5dc\u001a5<?T\u0019\f9n0v\u0018/x\u000f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri\u0017l\u001a=QL=HD\u001f\u0016hn\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", ";Ad3Y,KA(z\n^", "5dc\u001a5<?T\u0019\fhm(\f\tmu\u0004\"\u000b@\u0014&\u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "/o_9l", "3cXA66F[\u0015\byl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "5d]2e(MSuz\n\\/\\\u0016<o\r\u0010{N\u000f\u0013\u0019G", "", "4`X9X+\u001c]!\u0007vg+", "@db2g", "", "D`[BX", "BdgA<5Ic(lzl:\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4,#lkB\\", "BnC2k;\u001fW\u0019\u0006yO(\u0004\u0019/", "BnBAe0GUy\t\bE6~", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EditProcessor {
    public static final int $stable = 8;
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m6128getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m6370getSelectiond9O1mEE(), (DefaultConstructorMarker) null);

    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        TextFieldValue textFieldValueM6365copy3r_uNRQ$default = textFieldValue;
        boolean zAreEqual = Intrinsics.areEqual(textFieldValueM6365copy3r_uNRQ$default.m6369getCompositionMzsxiRA(), this.mBuffer.m6282getCompositionMzsxiRA$ui_text_release());
        boolean z2 = true;
        boolean z3 = false;
        if (!Intrinsics.areEqual(this.mBufferState.getAnnotatedString(), textFieldValueM6365copy3r_uNRQ$default.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(textFieldValueM6365copy3r_uNRQ$default.getAnnotatedString(), textFieldValueM6365copy3r_uNRQ$default.m6370getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
        } else if (TextRange.m6116equalsimpl0(this.mBufferState.m6370getSelectiond9O1mEE(), textFieldValueM6365copy3r_uNRQ$default.m6370getSelectiond9O1mEE())) {
            z2 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m6121getMinimpl(textFieldValueM6365copy3r_uNRQ$default.m6370getSelectiond9O1mEE()), TextRange.m6120getMaximpl(textFieldValueM6365copy3r_uNRQ$default.m6370getSelectiond9O1mEE()));
            z3 = true;
            z2 = false;
        }
        if (textFieldValueM6365copy3r_uNRQ$default.m6369getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m6117getCollapsedimpl(textFieldValueM6365copy3r_uNRQ$default.m6369getCompositionMzsxiRA().m6127unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m6121getMinimpl(textFieldValueM6365copy3r_uNRQ$default.m6369getCompositionMzsxiRA().m6127unboximpl()), TextRange.m6120getMaximpl(textFieldValueM6365copy3r_uNRQ$default.m6369getCompositionMzsxiRA().m6127unboximpl()));
        }
        if (z2 || (!z3 && !zAreEqual)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValueM6365copy3r_uNRQ$default = TextFieldValue.m6365copy3r_uNRQ$default(textFieldValueM6365copy3r_uNRQ$default, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValueM6365copy3r_uNRQ$default;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValueM6365copy3r_uNRQ$default);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, final EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbAppend = sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m6282getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m6126toStringimpl(this.mBuffer.m6283getSelectiond9O1mEE$ui_text_release())) + "):");
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(value)");
        Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append('\\n')");
        CollectionsKt.joinTo$default(list, sb, "\n", null, null, 0, null, new Function1<EditCommand, CharSequence>() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(EditCommand editCommand2) {
                return (editCommand == editCommand2 ? " > " : "   ") + this.toStringForLog(editCommand2);
            }
        }, 60, null);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            return "CommitTextCommand(text.length=" + commitTextCommand.getText().length() + ", newCursorPosition=" + commitTextCommand.getNewCursorPosition() + ')';
        }
        if (editCommand instanceof SetComposingTextCommand) {
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            return "SetComposingTextCommand(text.length=" + setComposingTextCommand.getText().length() + ", newCursorPosition=" + setComposingTextCommand.getNewCursorPosition() + ')';
        }
        if (!(editCommand instanceof SetComposingRegionCommand) && !(editCommand instanceof DeleteSurroundingTextCommand) && !(editCommand instanceof DeleteSurroundingTextInCodePointsCommand) && !(editCommand instanceof SetSelectionCommand) && !(editCommand instanceof FinishComposingTextCommand) && !(editCommand instanceof BackspaceCommand) && !(editCommand instanceof MoveCursorCommand) && !(editCommand instanceof DeleteAllCommand)) {
            StringBuilder sb = new StringBuilder("Unknown EditCommand: ");
            String simpleName = Reflection.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "{anonymous EditCommand}";
            }
            return sb.append(simpleName).toString();
        }
        return editCommand.toString();
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        EditCommand editCommand2;
        try {
            int size = list.size();
            int i2 = 0;
            editCommand = null;
            while (i2 < size) {
                try {
                    editCommand2 = list.get(i2);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    editCommand2.applyTo(this.mBuffer);
                    i2++;
                    editCommand = editCommand2;
                } catch (Exception e3) {
                    e = e3;
                    editCommand = editCommand2;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e);
                }
            }
            AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long jM6283getSelectiond9O1mEE$ui_text_release = this.mBuffer.m6283getSelectiond9O1mEE$ui_text_release();
            TextRange textRangeM6111boximpl = TextRange.m6111boximpl(jM6283getSelectiond9O1mEE$ui_text_release);
            textRangeM6111boximpl.m6127unboximpl();
            TextRange textRange = TextRange.m6122getReversedimpl(this.mBufferState.m6370getSelectiond9O1mEE()) ? null : textRangeM6111boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, textRange != null ? textRange.m6127unboximpl() : TextRangeKt.TextRange(TextRange.m6120getMaximpl(jM6283getSelectiond9O1mEE$ui_text_release), TextRange.m6121getMinimpl(jM6283getSelectiond9O1mEE$ui_text_release)), this.mBuffer.m6282getCompositionMzsxiRA$ui_text_release(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e4) {
            e = e4;
            editCommand = null;
        }
    }
}
