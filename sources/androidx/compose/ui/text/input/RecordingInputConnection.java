package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0012T\bN1y-`k[;:d$kaq\\\u00196\u0017|Kf~K.vS{%i\u0002\fXGepQGV3G-\u0017hb\u0003%]\b\u001cU'G_K0(\u0004$\ns\u0010\u0002 /L/P\u0002;_;G|V)~]P;8@ftzV+r\u0001m5\u0003\u0004\u00135\u000f4T\u001a?\u0012&((Qvh\u0007\u00189Tz_k\u000b7+dG6o9iB&?\u000e\u0017ny~\u001dH\u0017Y#^6\u0003=<`\u0002}E!B:Jq]hc\"\u0011\u0007|qs\u001d:l\u001c")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яę\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ffxB8DkJ6Ra0\u0017k\u00024,[2\u0011K;k\u001a\u0006\"\u000fXVgunRZ\u0011I\u0017\u0006,xr,OU\u0001](\u000f:Bu?;M\u0006=A`z6\r H\"@ц\r\u0001(5P\u0010|\u0002KK\"\u00128@v<Z\rc\u0005\"Ň\u000e>6\u0001&ձoNLHt]@3+\u0003wNV'e;\u0005M#F\\'\u0013~i\u001eA@?ߎ\u001b$iΈ7R\n>CZ\u0002A\u0013h?'YJ\u0004[DZ\u0018\u0014C._\u0011kv>\\3Vԃ\u0010'9U,Y^'@w)\u0016=@\u0012)\u001e'v<s\u001a/\u000e\u001cO\rr\u0002E\u0017\u0016'H\u000e\u0018y6E*F3sG)\u0005iai\u001e~;\n$%\u001eQ\u000b55$Z\u001c\u0001-\u001b\u0003\u0012\u0018E\u001aPKif\n\bB\u001e\n~\u0005\u001a,\u001a/u#u\u0010YN%IO[g(Qo\u0010m\\g%+\u0011la\u0011jHn,\u001f\u001cER!\u000epC\u0013.2d\u001dh:;e\u001c\u0003\f.\u000e!KtyR S<\u0015c1\u0002xzu\nS4\u0017=g\u0011\u0004\u0010m8\raeUq?yR%\u001e\u0006P+\u001bf\u0017ZS:_\r,0c`j>\u0002,H\\>+2m{bHtG'\u0010-H1#rE\u000b:wZ\u0017\u001a/XAV\u001biR~O\u0015\u0019b~$\u007fxw1Ctj3O\u0007M\u0019TZhh|\u00121=\u0017s.L\u0018VU\u0004\u0005\u001c\u0006W\f D4g\nuˎ\u0019W\u00057k\u001a-sQ9y\u001a[ a\u0013|(\u0019kl<# j\u001f6'~\u0013gbS:v\r0S\u000er>\u0012c\\yu#\u0005\u000fiear1c\u0003b\u0001\u0005\u0013_6'\u0017nP>{A\f7+X\u0010\u0016E\u0014\u0010\f\u001as<!z\u000fT~,\u0018ty$3zQ\f`k<W\u001e\u0017>P.\u001d\u0007Po\u0003w6LOHUIV\u0007|p\u0005f}\u000f=B~\u0007Z\u0017!Zia+o,>tsr\u0002QD,^q?AQa/\u0006my%QJW\u0018\u0019EIn@!m$d\"z\t^\u0010:,~OI.\u001d<7)d0JT#C\u0003sL$C\u001aT-'\u0017`G$Ad\\lzrUvM\u0011KnpB\u0003\u0015\u000eaG?Iy\u0013{\u0017l/\u001271W+Z3j}\u0004-9sRb\f3(\u0007\u0006;Ik\u0017a\u0002d\u000e\u000e=6y}`P\u0018+\"r\u001c)\u000fi\u0011\u000eMvrScr&|v@\u0001\u0003R0\u0002\u0017z+\u0018\u0003\nW!')\u000bo\u00112|R\u0006\u0012[\u001a/!t-\u0015g\u0015ct%s\u001a}EK&\u0003\u0014U\u0001\bYI  \"6&2#Q`e=~\n\f%\u0001*:,p_!\u0013~%42XO\u000b\n\\\u0012fS\u0010\u000f\u001a\u0013\rc2\fiT5\n\u0005\u0006pe\u0019|\u0018C\u0005c\u001dV;\u0007t\u0012ny\u001d\u000f!,\u0017+e.A]ŷ>\u0017[ݰp\u0013\u0006\u001b#.oB\u0016kA\u0010}m?ҷwϪ_\r3Ԛ<6o<HRL\buݚ\u0002ą.T0ֽ\fh[J|\u000flnRW<l\u00195;É\u000eì\u0018|\u0007Ĝ/ !6^rLgԘ;\u001f'ʺ%If\u0016\u0012U\u001a2/Bj?I<\tЦ{Ĭz\u0011\u000b̌3\u0001\u000e<Z\t!\u0005>ƫ9ĘX=\"ś*F{x\u001b&yFhF\u0016?)\u000e?0\u0019vvکhӭ GY߂Y\u001b\u0017\u0016#N&q\r0C\u0003ܷW\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#j 5w#-QL=O=)%w?C\u0010l,L\u0006+QU$", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)@m\u0014=QMDA", "7mXAF;:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "3uT;g\n:Z {v\\2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a)B}%\u000e^CDz\u0012\u001a\u001co^5\u0005ix$", "/tc<66K`\u0019|\n", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fm_5M\u00041KKauZ\\zH\u001e ZW^/V\u0014YT38H@*\u0018;\u0013eDs\u0011\u001bu\u001f5s\u007f R\u0017Nv\u0011sGu>;\u001dP", "5dc\u000eh;H1#\f\b^*\f", "u(I", "0`c0[\u000b>^(\u0002", "", "1ta?X5M3,\u000e\bZ*\f\t.T\u007f;\u000b-\u0001#'G}\u001d+\u0001+5b", "3cXA66F[\u0015\byl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "5dc\u0012i,Gbvz\u0002e)x\u00075", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri\u001bv!>\\#Lk=-rdh@\u0004_*TC|", "3wc?T*MS\u0018mzq;d\u00138i\u000f2\t(\u000b\u0016\u0017", "7r00g0OS", "D`[BX", ";STEg\rBS }kZ3\r\t", "5dc\u001aG,Qby\u0003ze+m\u00056u\u007ff\fDz$\u0017No\nJv", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "Adc\u001aG,Qby\u0003ze+m\u00056u\u007ff\fDz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fJT", "/cS\u0012W0M1#\u0007\u0003Z5{z3t\u0003\u0005wO~\u001a", "", "3cXA66F[\u0015\by", "0dV6a\t:b\u0017\u0002Z]0\f", "0dV6a\t:b\u0017\u0002Z]0\fl8t\u007f5\u0005<\b", "1kT.e\u0014>b\u0015dzr\u001a\f\u0005>e\u000e", "AsPAX:", "1k^@X\nH\\\"~xm0\u0007\u0012", "1n\\:\\;\u001c]!\n\u0002^;\u0001\u00138", "BdgA", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF~0<Y\r$Avy7NM\u0011", "1n\\:\\;\u001c]\"\u000ezg;", "7m_Bg\nH\\(~\u0004m\u0010\u0006\n9", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)Fm\u001f=1L<u\n", "4kP4f", "=oc@", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "1n\\:\\;\u001c]&\fz\\;\u0001\u00138", "1na?X*MW#\b^g-\u0007", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF\u000425W\r$Avy7NM\u0011", "1n\\:\\;-S,\u000e", "", "<df\u0010h9L]&i\u0005l0\f\r9n", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fO", "0dU<e,%S\"\u0001\na", "/ec2e\u0013>\\\u001b\u000e}", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fOd tQn\u000e'\u0001)>h\f", "3mS\u000fT;<Vx}~m", "3mS\u000fT;<Vx}~m\u0010\u0006\u0018/r\t$\u0003", "3mbBe,\u001aQ(\u0003\f^", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "4h]6f/\u001c]!\n\u0005l0\u0006\u000b\u001ee\u00137", "5dc\u0010h9L]&\\vi:d\u0013.e", "@d`\u001ab+>a", "5dc\u0012k;KO\u0017\u000ez]\u001b|\u001c>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\\u0019", "@d`BX:M", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\0;wD\u001e#w7", "5dc\u0015T5=Z\u0019\f", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "5dc X3>Q(~yM,\u0010\u0018", "5dc!X?M/\u001a\u000ezk\n\r\u0016=o\r", ";`g\u0010[(Ka", "5dc!X?M0\u0019\u007f\u0005k,Z\u0019<s\n5", ":nV\u0011X)NU", ";db@T.>", "", ">da3b9F1#\b\n^?\fp/n\u0010\u0004yO\u0005! ", "7c", ">da3b9F3\u0018\u0003\nh9X\u0007>i\n1", "3cXAb9\u001aQ(\u0003\u0005g", ">da3b9F>&\u0003\fZ;|f9m\b$\u0005?", "/bc6b5", "2`c.", "@d_<e;\u001fc \u0006\t\\9|\t8M\n'{", "3mP/_,=", "@d`BX:M1)\f\th9l\u0014.a\u000f(\n", "1ta@b9.^\u0018z\n^\u0014\u0007\b/", "Ad]1>,R3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "Ad]1F@Gb\u001c~\tbA|\b\u0015e\u0014\b\r@\n&", "1nS2", "Adc\u0010b4I]'\u0003\u0004`\u0019|\u000b3o\t", "AsP?g", "3mS", "Adc\u0010b4I]'\u0003\u0004`\u001b|\u001c>", "Adc X3>Q(\u0003\u0005g", "CoS.g,\"\\$\u000f\nL;x\u0018/", "AsPAX", "7m_Bg\u0014>b\u001c\tyF(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a)B}%\u0016MR>u3\u0006\u0011q];\u0007p\u0002", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private TextFieldValue mTextFieldValue;
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    private final void logDebug(String str) {
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z2) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z2;
        this.mTextFieldValue = textFieldValue;
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    public final void setMTextFieldValue$ui_release(TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    private final boolean ensureActive(Function0<Unit> function0) {
        boolean z2 = this.isActive;
        if (z2) {
            function0.invoke();
        }
        return z2;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setMTextFieldValue$ui_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
            }
            TextRange textRangeM6369getCompositionMzsxiRA = textFieldValue.m6369getCompositionMzsxiRA();
            int iM6121getMinimpl = textRangeM6369getCompositionMzsxiRA != null ? TextRange.m6121getMinimpl(textRangeM6369getCompositionMzsxiRA.m6127unboximpl()) : -1;
            TextRange textRangeM6369getCompositionMzsxiRA2 = textFieldValue.m6369getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m6121getMinimpl(textFieldValue.m6370getSelectiond9O1mEE()), TextRange.m6120getMaximpl(textFieldValue.m6370getSelectiond9O1mEE()), iM6121getMinimpl, textRangeM6369getCompositionMzsxiRA2 != null ? TextRange.m6120getMaximpl(textRangeM6369getCompositionMzsxiRA2.m6127unboximpl()) : -1);
        }
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        int i2 = this.batchDepth - 1;
        this.batchDepth = i2;
        if (i2 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(CollectionsKt.toMutableList((Collection) this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i2).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i2).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i2) {
        if (TextRange.m6117getCollapsedimpl(this.mTextFieldValue.m6370getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z2 = (i2 + 1) - (i2 | 1) != 0;
        this.extractedTextMonitorMode = z2;
        if (z2) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    private final void sendSynthesizedKeyEvent(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i2) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m6121getMinimpl(this.mTextFieldValue.m6370getSelectiond9O1mEE()), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z2 = this.isActive;
        return z2 ? beginBatchEditInternal() : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        boolean z2 = this.isActive;
        if (z2) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i2, i3));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        this.eventCallback.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.isActive;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (i2 + 1) - (1 | i2) != 0;
        boolean z8 = (-1) - (((-1) - i2) | ((-1) - 2)) != 0;
        if (Build.VERSION.SDK_INT >= 33) {
            z3 = (16 & i2) != 0;
            z4 = (-1) - (((-1) - i2) | ((-1) - 8)) != 0;
            z2 = (4 & i2) != 0;
            if (Build.VERSION.SDK_INT >= 34 && (i2 + 32) - (i2 | 32) != 0) {
                z6 = true;
            }
            if (!z3 && !z4 && !z2 && !z6) {
                if (Build.VERSION.SDK_INT >= 34) {
                    z3 = true;
                    z4 = true;
                    z2 = true;
                    z6 = true;
                } else {
                    z3 = true;
                    z4 = true;
                    z2 = true;
                }
            }
        } else {
            z2 = false;
            z6 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z7, z8, z3, z4, z2, z6);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            z2 = false;
            switch (i2) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        int iM6301getDefaulteUduSuo;
        boolean z2 = this.isActive;
        if (z2) {
            if (i2 == 0) {
                iM6301getDefaulteUduSuo = ImeAction.Companion.m6301getDefaulteUduSuo();
            } else {
                switch (i2) {
                    case 2:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6303getGoeUduSuo();
                        break;
                    case 3:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6307getSearcheUduSuo();
                        break;
                    case 4:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6308getSendeUduSuo();
                        break;
                    case 5:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6304getNexteUduSuo();
                        break;
                    case 6:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6302getDoneeUduSuo();
                        break;
                    case 7:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6306getPreviouseUduSuo();
                        break;
                    default:
                        String str = "IME sends unsupported Editor Action: " + i2;
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6301getDefaulteUduSuo();
                        break;
                }
            }
            this.eventCallback.mo6320onImeActionKlQnJC8(iM6301getDefaulteUduSuo);
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.isActive;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.isActive;
        return z2 ? this.autoCorrect : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.isActive;
        if (z2) {
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z2 = this.isActive;
        if (z2) {
            return false;
        }
        return z2;
    }
}
