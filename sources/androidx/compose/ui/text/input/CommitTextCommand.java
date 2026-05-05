package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r(4\u0012}\u0007njO0LeN4ZS8\u000fsڔ<$q$yّCU(\u0007*ޛWNu˧vJ`\fI\u0014\u001cǝ)jZH\u0016\u000ec&\u001f6PoW3{pM=nvN\u0005N5ŕ<y\u0013\u0005Z=X\u0014\u0005\u007f[K:\u0018@D~<j\r{\bܨ\u0016\u0006L'I,juf6v{\u000e>=3\u001bip_msx\u000e[\u001f^TU 'g,?X9K\u0014ShIޮR$E\u0011U\n=3km;sO\u0002nNX.\u0015[? \u001ckw>\\3Wԃ\u0010-3Ւ{MV\u00166\u0001K\u000b\u001b>\u001c\u000e4*ρ23\"Ǒ \u00109~\u0001^\u0011_\u0010^Z\u007f)bl[Ӿ\u00047C;!r_nދ\u001df"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#[*?u\u001a=<CNz\u0012(\u001dp]B\u00069", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "BdgA", "", "<df\u0010h9L]&i\u0005l0\f\r9n", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "/m]<g(MS\u0018l\nk0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0002XY", "5dc\u000ea5Hb\u0015\u000ez]\u001a\f\u00163n\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "5dc\u001bX>\u001cc&\r\u0005k\u0017\u0007\u00173t\u00042\u0005", "u(8", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/o_9l\u001bH", "", "0tU3X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u001a7O Kl5\u001e\">", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public CommitTextCommand(AnnotatedString annotatedString, int i2) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i2;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public CommitTextCommand(String str, int i2) {
        this(new AnnotatedString(str, null, null, 6, null), i2);
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
        } else {
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i2 = this.newCursorPosition;
        editingBuffer.setCursor$ui_text_release(RangesKt.coerceIn(i2 > 0 ? (cursor$ui_text_release + i2) - 1 : (cursor$ui_text_release + i2) - getText().length(), 0, editingBuffer.getLength$ui_text_release()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return Intrinsics.areEqual(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }
}
