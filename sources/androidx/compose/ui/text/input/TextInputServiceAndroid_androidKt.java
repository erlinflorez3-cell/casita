package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
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
/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,u\bӵLc\u0003\rIي8\u000b<H\u0007\"2\u0012\u007f\u0007|jA0ZeP\u008cZS8\u000fs{J$cҕyCQU\"Ԃ*\teNogtJr!Q\u000f\u001e\u0016'k\\Mczu\u0012=5rsM7eok<'tN\u000f.7:8(\u000b)\u001aXOV͌\u0013]Y\u0014*0nybR;W5\u001e \u0011V /*\rk\\C`l\fHu݊\u001bsP]?_^\u0006u\rt^m\r\u0017m,ѨX7c\u0014{وU\u07baV[GšӳuM"}, d2 = {"\u0012D1\":&\u001c:tlh", "", "6`b\u0013_(@", "", "0hc@", "", "4kP4", "/r4EX*Nb#\f", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001b\u0012", "CoS.g,", "", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9m;z4?fa)8wk", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "BdgA90>Z\u0018ove<|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "CoS.g,0W(\u0002Zf6\u0002\r\ro\b3wO", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int iM6317getImeActioneUduSuo = imeOptions.m6317getImeActioneUduSuo();
        int i2 = 6;
        if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6301getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6305getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6303getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6304getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6306getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6307getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6308getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m6288equalsimpl0(iM6317getImeActioneUduSuo, ImeAction.Companion.m6302getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i2;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM6318getKeyboardTypePjHm6EE = imeOptions.m6318getKeyboardTypePjHm6EE();
        if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6362getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6355getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = (-1) - (((-1) - editorInfo.imeOptions) & ((-1) - Integer.MIN_VALUE));
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6358getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6361getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6364getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6357getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6360getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6359getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m6341equalsimpl0(iM6318getKeyboardTypePjHm6EE, KeyboardType.Companion.m6356getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType = (-1) - (((-1) - editorInfo.inputType) & ((-1) - 131072));
            if (ImeAction.m6288equalsimpl0(imeOptions.m6317getImeActioneUduSuo(), ImeAction.Companion.m6301getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM6316getCapitalizationIUNYP9k = imeOptions.m6316getCapitalizationIUNYP9k();
            if (KeyboardCapitalization.m6324equalsimpl0(iM6316getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m6333getCharactersIUNYP9k())) {
                editorInfo.inputType = (-1) - (((-1) - editorInfo.inputType) & ((-1) - 4096));
            } else if (KeyboardCapitalization.m6324equalsimpl0(iM6316getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m6337getWordsIUNYP9k())) {
                editorInfo.inputType = (-1) - (((-1) - editorInfo.inputType) & ((-1) - 8192));
            } else if (KeyboardCapitalization.m6324equalsimpl0(iM6316getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m6335getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m6123getStartimpl(textFieldValue.m6370getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m6118getEndimpl(textFieldValue.m6370getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        int i3 = editorInfo.imeOptions;
        editorInfo.imeOptions = (i3 + 33554432) - (i3 & 33554432);
    }

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
