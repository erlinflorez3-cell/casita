package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: EditorInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,r\bӵLc\u0003\nI\u00066\u000b6B\r\"4\u0012\u000e\u0007nʑA0RpP\u008cZS@\u000fsڔ<$q$yّCU(\r*\t]ZogtKr!QƤ\u001e\u0016'i\\Mcxu\u0012=3rsM5eok:'tNC.5:8(\t)\u001aXM@z\tIc\f@7ptHZ%M3#B\nL*\u0019\u001e\u000br~DNlkFG+\u0013kRNUmF{{\u001a\rÖބ\fǸҐ\"-FFC%ǯS\b\u000fUaό\u001fmpݞ\ty"}, d2 = {"6`b\u0013_(@", "", "0hc@", "", "4kP4", "CoS.g,", "", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9m;z4?fa)8wk", "BdgA", "", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "1n]AX5M;\u001d\u0007zM@\b\t=", "", "", "CoS.g,\u0006^\u007f\u0012wR\u007f`", "uKP;W9HW\u0018H\fb,\u000fR3n\u000b8\u000bH\u0001&\u001aQnW\u001cu)Dc\u000b\u0004@n \u00044H7|0g\u001cdj;PA/J\u0004\u0015GX^,ePr\u0013xxV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u001b\u0016!D4tKa VCx}A\u0013sU]i\u0003U\u0017;I/`\u001d[fc6C&]_((lY0_?D", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i2, int i3) {
        return (i2 + i3) - (i2 | i3) == i3;
    }

    /* JADX INFO: renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m1484updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            strArr = null;
        }
        m1483updatepLxbY9I(editorInfo, charSequence, j2, imeOptions, strArr);
    }

    /* JADX INFO: renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m1483updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int iM6317getImeActioneUduSuo = imeOptions.m6317getImeActioneUduSuo();
        int i2 = 3;
        int i3 = 6;
        if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6301getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i3 = 0;
            }
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6305getNoneeUduSuo())) {
            i3 = 1;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6303getGoeUduSuo())) {
            i3 = 2;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6304getNexteUduSuo())) {
            i3 = 5;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6306getPreviouseUduSuo())) {
            i3 = 7;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6307getSearcheUduSuo())) {
            i3 = 3;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6308getSendeUduSuo())) {
            i3 = 4;
        } else if (!ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6302getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i3;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int iM6318getKeyboardTypePjHm6EE = imeOptions.m6318getKeyboardTypePjHm6EE();
        if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6362getTextPjHm6EE())) {
            i2 = 1;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6355getAsciiPjHm6EE())) {
            int i4 = editorInfo.imeOptions;
            editorInfo.imeOptions = (i4 - Integer.MIN_VALUE) - (i4 & Integer.MIN_VALUE);
            i2 = 1;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6358getNumberPjHm6EE())) {
            i2 = 2;
        } else if (!KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6361getPhonePjHm6EE())) {
            if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6364getUriPjHm6EE())) {
                i2 = 17;
            } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6357getEmailPjHm6EE())) {
                i2 = 33;
            } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6360getPasswordPjHm6EE())) {
                i2 = 129;
            } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6359getNumberPasswordPjHm6EE())) {
                i2 = 18;
            } else {
                if (!KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6356getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type".toString());
                }
                i2 = 8194;
            }
        }
        editorInfo.inputType = i2;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            int i5 = editorInfo.inputType;
            editorInfo.inputType = (i5 + 131072) - (i5 & 131072);
            if (ImeAction.m6288equalsimpl0(imeOptions.m6317getImeActioneUduSuo(), ImeAction.Companion.m6301getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM6316getCapitalizationIUNYP9k = imeOptions.m6316getCapitalizationIUNYP9k();
            if (KeyboardCapitalization.m6324equalsimpl0(iM6316getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m6333getCharactersIUNYP9k())) {
                editorInfo.inputType = (-1) - (((-1) - editorInfo.inputType) & ((-1) - 4096));
            } else if (KeyboardCapitalization.m6324equalsimpl0(iM6316getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m6337getWordsIUNYP9k())) {
                int i6 = editorInfo.inputType;
                editorInfo.inputType = (i6 + 8192) - (i6 & 8192);
            } else if (KeyboardCapitalization.m6324equalsimpl0(iM6316getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m6335getSentencesIUNYP9k())) {
                editorInfo.inputType = (-1) - (((-1) - editorInfo.inputType) & ((-1) - 16384));
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType = (-1) - (((-1) - editorInfo.inputType) & ((-1) - 32768));
            }
        }
        editorInfo.initialSelStart = TextRange.m6123getStartimpl(j2);
        editorInfo.initialSelEnd = TextRange.m6118getEndimpl(j2);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions = (-1) - (((-1) - editorInfo.imeOptions) & ((-1) - 33554432));
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported() && !KeyboardType.m6341equalsimpl0(imeOptions.m6318getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6360getPasswordPjHm6EE()) && !KeyboardType.m6341equalsimpl0(imeOptions.m6318getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6359getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        }
    }
}
