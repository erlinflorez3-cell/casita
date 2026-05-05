package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: compiled from: NullableInputConnectionWrapper.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u0006\u0007nj?3LeV7ZS0\u000fs{B*c$wDCU0}*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172PzG3StE9vt>\u000562*\u0600\u0002\u0005\u0017\u001a2H\u0016z\u0003CY\u0018\u001a0FqBR#M\r\u001a\u0018\bD0\u0017Ȧ\rg|5\t\fm>=#\u001bipO7o>~e\u0019VV7\r%`.-P7c\u0019SVΫ\u000bRiDKE\u007fF\u001dhU1q]<eDc\u0018\u0014C5\u007f\u0011k~>\\3^' o/]qcP<,@\t\n\u001cT\u0004<\nWL<-2f6\u000fy\u0007;cN`\u001a^p\n+gD#=\u0002I*g,-e*['`O{3\u0017N'\u000fz9[\u0003!\u0011\u0019)h\u0010Q_^pCVc\"[Sl2\u0007)\u0016r\u0014>^\u0018/*\u001b^\u001d3Cs;9 \u001a\u001a\u000fX0\u000f\u0013y\u0001S\u0018\\xF0z.9@\b:tth\u0013\u007fhT\u00079Wadj\u0015\u0019 \u0013Nf(@/1(N}u\u001an[q\"%]s}m7\u0002\u001csQ^a?\u0002g\u001emjvBLlf\u0013l~B\u0002\u0019!pp&@e\u0003\u0010&\u007f\rT\u001a1J? &z@y\u001fj4`\u0003LL\b\u0011Qmh\t(~\u0003@T\u0007w0\r\t/]#\u00058\u0002\u0007jD~v![c\u0002;'2m$~3+F7\u0003\u0002\u0014_gzT\u0013\u0001^}c 8\u001808\u007fT\u0004'W\u000f7X\u001a/[K!\u007f\u0002Q 3\u0013|(\u001c\u0002|v\u007f\u0016\u0012\t.vixi\u0005\u001b0\u0003vrQ\u0015\u0015\u0004\bu^zup\u001b\u001f$VW\u001b\u001b[RMf\u00175#,1\u0019oP\ne1Q;5\u0016&!u)*kw\u0019Fy\u0011\u0019Vxs\u0010DcD|)e&@IbaY-HR(z\u000fZH\u0019\u0005NVQN\u001b^`A\u0013z\u0007>[\u0017G\u007f|\u0006Z9!\\iN+q\u00143\\up\b\f\f\"\f[%?W\u0004k{yc\\9TU\u001eS\n?\u001d*\u001ck*\u0007[p\u0015H\u0006\"%|U\u0004r\u0013k!$b6l\u000e\u0019Olk\u001c\u000f)0\rsW-@s\f;\u0005\u0018\u0005|jb`\u0005\u000fR\u0011%8\u0015\u0017\u000fa+?Iy\u001d{xl/\u0012<1Y+\u00153le}\u0015?[HbM3(\u0007\u000eQY&YW5N\u0004u3\u001eo}\u0018P\u0018+*r\u001c)Mi\u0011\u000e\u0004vr[urN|x(e\u0001OR/\r\u0001\u0015\u0010R\t=\fW\u0010IżnυPT\u007f˿[\u001c\u0007\u001eR1W$\u000be^'=\bE-kHz\u00167{\u0006Wi\u0001^¹\"ڗ\bt)Ƹߏ\u0012\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#f0>t\u0012+TC\u001ft?.$FkB\u0010c*]z1P>[(g]rJo\u001d^Z\u001a\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#f0>t\u0012+TC\u001ft?.$FkB\u0010c*]z1P>[(g]rJi", "2d[2Z(MS", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)@m\u0014=QMDA", "=m2<a5>Q(\u0003\u0005g\n\u0004\u0013=e~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKP;W9HW\u0018H\fb,\u000fR3n\u000b8\u000bH\u0001&\u001aQnW \u007f0Eh[*@v\u0016,\\GEt\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-:\u001az\u0010", "\nrTA \u0006\u0017", "5dc\u0011X3>U\u0015\u000ez", "u(;.a+K]\u001d}Do0|\u001bxi\t3\fO\t\u0017&Jy\r\u0006Z.@i\r}Av\u001f.KR?u=s", "0dV6a\t:b\u0017\u0002Z]0\f", "", "1kT.e\u0014>b\u0015dzr\u001a\f\u0005>e\u000e", ">/", "", "1k^@X\nH\\\"~xm0\u0007\u0012", "1k^@X\u000b>Z\u0019\u0001vm,", "1n\\:\\;\u001c]!\n\u0002^;\u0001\u00138", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF~0<Y\r$Avy7NM\u0011", "1n\\:\\;\u001c]\"\u000ezg;", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)Fm\u001f=1L<u\n", ">0", ">1", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "1n\\:\\;\u001c]&\fz\\;\u0001\u00138", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF\u000425W\r$Avy7NM\u0011", "1n\\:\\;-S,\u000e", "", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fO", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fOd tQn\u000e'\u0001)>h\f", "2hb=b:>2\u0019\u0006z`(\f\t", "3mS\u000fT;<Vx}~m", "4h]6f/\u001c]!\n\u0005l0\u0006\u000b\u001ee\u00137", "5dc\u0010h9L]&\\vi:d\u0013.e", "5dc\u0012k;KO\u0017\u000ez]\u001b|\u001c>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\\u0019", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\0;wD\u001e#w7", "5dc\u0015T5=Z\u0019\f", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "5dc X3>Q(~yM,\u0010\u0018", "5dc!X?M/\u001a\u000ezk\n\r\u0016=o\r", "5dc!X?M0\u0019\u007f\u0005k,Z\u0019<s\n5", ">da3b9F1#\b\n^?\fp/n\u0010\u0004yO\u0005! ", ">da3b9F3\u0018\u0003\nh9X\u0007>i\n1", ">da3b9F>&\u0003\fZ;|f9m\b$\u0005?", "", "@d_<e;\u001fc \u0006\t\\9|\t8M\n'{", "@d`BX:M1)\f\th9l\u0014.a\u000f(\n", "Ad]1>,R3*~\u0004m", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "Adc\u0010b4I]'\u0003\u0004`\u0019|\u000b3o\t", "Adc\u0010b4I]'\u0003\u0004`\u001b|\u001c>", "Adc X3>Q(\u0003\u0005g", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {
    private InputConnection delegate;
    private final Function1<NullableInputConnectionWrapper, Unit> onConnectionClosed;

    protected void closeDelegate(InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NullableInputConnectionWrapperApi21(InputConnection inputConnection, Function1<? super NullableInputConnectionWrapper, Unit> function1) {
        this.onConnectionClosed = function1;
        this.delegate = inputConnection;
    }

    protected final InputConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapper
    public final void disposeDelegate() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            closeDelegate(inputConnection);
            this.delegate = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.delegate != null) {
            disposeDelegate();
            this.onConnectionClosed.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i2, int i3) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i2, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i2, int i3) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i2, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i2);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setSelection(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i2);
        }
        return false;
    }
}
