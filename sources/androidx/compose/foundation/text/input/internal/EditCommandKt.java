package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,r\bӵLc\u0003\u000eI\u00066\u000b6B\r\"4\u0012\u000e\u0007nj?0LeV:Zݷ2\u000fy\u0002<$a/\nYI٥2}P\b\u007fRug\u0007J\t\fs\u0013\u0014\u0018\u0011jZJ\u001cxu\u001c\u001d5Zom7uok>'ҚN\u001f.8:8(\t)\u001aXM@z\tJc\f@8ptH[%M3$XßV*\u000f)tg|:pl\f?u݊\u001b\u0004PZ?_^\u0001u\rtYW\u0011\u0005n6+nAe\u00193a\u001b\u0007\u0001e\u0006šW\fK\u0014\u0001'U/qs\u0006;\t\u0004\"\"CO;g#*j\u0013i`:1qՒ{U^\u001e@w)\u007f5<2\u0013LΩ`@;+~\b<7\u001dr\u0002E\u0001\u0006lT\u0018z\u0010@]ӛ\u0018M9L3f\u007fec\u0019|<,\t\u001b2;\u0001\u001d+\fX\u001cu-\u001b\u0003\u0002\u0018ĸiZK^f\n\bA\u0016\u0004\u001fg2.\u00127_\u007f]\u0004A2%.O[g-gǽɞL["}, d2 = {"7rBBe9HU\u0015\u000ezI(\u0001\u0016", "", "6hV5", "", ":nf", "0`R8f7:Q\u0019", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PC+R\u0006+PN+<]SrJi", "1n\\:\\;-S,\u000e", "BdgA", "", "<df\u0010h9L]&i\u0005l0\f\r9n", "", "2d[2g,\u001aZ ", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fO", ":d]4g/\u001bS\u001a\t\b^\n\r\u0016=o\r", ":d]4g/\u001aT(~\b<<\n\u00179r", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fOd tQn\u000e'\u0001)>h\f", "4h]6f/\u001c]!\n\u0005l0\u0006\u000b\u001ee\u00137", ";ne26<Ka#\f", "/l^Ba;", "Adc\u0010b4I]'\u0003\u0004`\u0019|\u000b3o\t", "AsP?g", "3mS", "Adc\u0010b4I]'\u0003\u0004`\u001b|\u001c>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EditCommandKt {
    public static final void commitText(EditingBuffer editingBuffer, String str, int i2) {
        if (editingBuffer.hasComposition()) {
            editingBuffer.replace(editingBuffer.getCompositionStart(), editingBuffer.getCompositionEnd(), str);
        } else {
            editingBuffer.replace(editingBuffer.getSelectionStart(), editingBuffer.getSelectionEnd(), str);
        }
        editingBuffer.setCursor(RangesKt.coerceIn(i2 > 0 ? (r2 + i2) - 1 : (editingBuffer.getCursor() + i2) - str.length(), 0, editingBuffer.getLength()));
    }

    public static final void setComposingRegion(EditingBuffer editingBuffer, int i2, int i3) {
        if (editingBuffer.hasComposition()) {
            editingBuffer.commitComposition();
        }
        int iCoerceIn = RangesKt.coerceIn(i2, 0, editingBuffer.getLength());
        int iCoerceIn2 = RangesKt.coerceIn(i3, 0, editingBuffer.getLength());
        if (iCoerceIn != iCoerceIn2) {
            if (iCoerceIn < iCoerceIn2) {
                editingBuffer.setComposition(iCoerceIn, iCoerceIn2);
            } else {
                editingBuffer.setComposition(iCoerceIn2, iCoerceIn);
            }
        }
    }

    public static final void setComposingText(EditingBuffer editingBuffer, String str, int i2) {
        if (editingBuffer.hasComposition()) {
            int compositionStart = editingBuffer.getCompositionStart();
            String str2 = str;
            editingBuffer.replace(compositionStart, editingBuffer.getCompositionEnd(), str2);
            if (str2.length() > 0) {
                editingBuffer.setComposition(compositionStart, str.length() + compositionStart);
            }
        } else {
            int selectionStart = editingBuffer.getSelectionStart();
            String str3 = str;
            editingBuffer.replace(selectionStart, editingBuffer.getSelectionEnd(), str3);
            if (str3.length() > 0) {
                editingBuffer.setComposition(selectionStart, str.length() + selectionStart);
            }
        }
        editingBuffer.setCursor(RangesKt.coerceIn(i2 > 0 ? (r2 + i2) - 1 : (editingBuffer.getCursor() + i2) - str.length(), 0, editingBuffer.getLength()));
    }

    public static final void deleteSurroundingText(EditingBuffer editingBuffer, int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.").toString());
        }
        int selectionEnd = editingBuffer.getSelectionEnd();
        int length = selectionEnd + i3;
        if (((i3 ^ length) & (selectionEnd ^ length)) < 0) {
            length = editingBuffer.getLength();
        }
        editingBuffer.delete(editingBuffer.getSelectionEnd(), Math.min(length, editingBuffer.getLength()));
        int selectionStart = editingBuffer.getSelectionStart();
        int i4 = selectionStart - i2;
        if (((i2 ^ selectionStart) & (selectionStart ^ i4)) < 0) {
            i4 = 0;
        }
        editingBuffer.delete(Math.max(0, i4), editingBuffer.getSelectionStart());
    }

    public static final void deleteSurroundingTextInCodePoints(EditingBuffer editingBuffer, int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.").toString());
        }
        int i4 = 0;
        int i5 = 0;
        int selectionStart = 0;
        while (true) {
            if (i5 < i2) {
                int i6 = selectionStart + 1;
                if (editingBuffer.getSelectionStart() > i6) {
                    selectionStart = isSurrogatePair(editingBuffer.get((editingBuffer.getSelectionStart() - i6) + (-1)), editingBuffer.get(editingBuffer.getSelectionStart() - i6)) ? selectionStart + 2 : i6;
                    i5++;
                } else {
                    selectionStart = editingBuffer.getSelectionStart();
                    break;
                }
            } else {
                break;
            }
        }
        int length = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i7 = length + 1;
            if (editingBuffer.getSelectionEnd() + i7 < editingBuffer.getLength()) {
                length = isSurrogatePair(editingBuffer.get((editingBuffer.getSelectionEnd() + i7) + (-1)), editingBuffer.get(editingBuffer.getSelectionEnd() + i7)) ? length + 2 : i7;
                i4++;
            } else {
                length = editingBuffer.getLength() - editingBuffer.getSelectionEnd();
                break;
            }
        }
        editingBuffer.delete(editingBuffer.getSelectionEnd(), editingBuffer.getSelectionEnd() + length);
        editingBuffer.delete(editingBuffer.getSelectionStart() - selectionStart, editingBuffer.getSelectionStart());
    }

    public static final void finishComposingText(EditingBuffer editingBuffer) {
        editingBuffer.commitComposition();
    }

    public static final void backspace(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition()) {
            editingBuffer.delete(editingBuffer.getCompositionStart(), editingBuffer.getCompositionEnd());
            return;
        }
        if (editingBuffer.getCursor() == -1) {
            int selectionStart = editingBuffer.getSelectionStart();
            int selectionEnd = editingBuffer.getSelectionEnd();
            editingBuffer.setCursor(editingBuffer.getSelectionStart());
            editingBuffer.delete(selectionStart, selectionEnd);
            return;
        }
        if (editingBuffer.getCursor() != 0) {
            editingBuffer.delete(StringHelpers_androidKt.findPrecedingBreak(editingBuffer.toString(), editingBuffer.getCursor()), editingBuffer.getCursor());
        }
    }

    public static final void moveCursor(EditingBuffer editingBuffer, int i2) {
        if (editingBuffer.getCursor() == -1) {
            editingBuffer.setCursor(editingBuffer.getSelectionStart());
        }
        int selectionStart = editingBuffer.getSelectionStart();
        String string = editingBuffer.toString();
        int i3 = 0;
        if (i2 <= 0) {
            int i4 = -i2;
            while (i3 < i4) {
                int iFindPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(string, selectionStart);
                if (iFindPrecedingBreak == -1) {
                    break;
                }
                i3++;
                selectionStart = iFindPrecedingBreak;
            }
        } else {
            while (i3 < i2) {
                int iFindFollowingBreak = StringHelpers_androidKt.findFollowingBreak(string, selectionStart);
                if (iFindFollowingBreak == -1) {
                    break;
                }
                i3++;
                selectionStart = iFindFollowingBreak;
            }
        }
        editingBuffer.setCursor(selectionStart);
    }

    public static final void deleteAll(EditingBuffer editingBuffer) {
        editingBuffer.replace(0, editingBuffer.getLength(), "");
    }

    private static final boolean isSurrogatePair(char c2, char c3) {
        return Character.isHighSurrogate(c2) && Character.isLowSurrogate(c3);
    }
}
