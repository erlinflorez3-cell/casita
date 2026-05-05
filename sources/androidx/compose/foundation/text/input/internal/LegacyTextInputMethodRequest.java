package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яī\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aw\u001dfr9>Dm߉6Ri*\u0017k\u00024,[:qK;[\u001d\u0006\"\u001fOVʴon`Z\u0013C\u0015\t\u001exxKQU\u000f]\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :Ĳ@y\u0013\u001f\"*^\u0010~ٙKK\"\u00128ϋx:h\rU\u0005 \u0014\u000e>6\u0001&\\mO>H\u0003]B/)\u0003qBd'g0\u0003M\u0015Fj'\u0015vg 3@M5\u001d%Y\u0007\u000fRq?\u000bӊy=\u001bh/'1JyɎLݙ0\u0014C*\u00104mv4\\\u001dQ\u000f\r7;]ec\\\u001e*\bz*\u0011L\u0006\u001e\u0006UM\\0*j\u0016\u0014Kt!ZĖT\u0002lJH\toe/%.M[=)\u0017iaiJ\u0015KD\u0011\u001bP;\u0001\u001d&\fX\u001c\u0014-\u001b\u0003,\u001a7_uUH|\u000f =6P~\u0019\u001a*25w\u0004=3).EJgaG[9m\u0018Gr!'\tn\u0004ki\u0001dp8|5O<\u0019\u0014jJt\u0007{P\u0003yZ1]\u001ed\u0007,\rA#\r\bJC=\u001c^Qxi\u0019pm\f5/\u0015<\bq4$esv3cV\u0014\u0016o\u000e\u000f\u0016U;\u0011*\tjP\u0010$Z\u000bMj^V((w*I~\u0010!pWqJY\\5'\u001c-H1^rE\u000bJwZ\u0017R/XAg\u001biR)9\u0005^!\to\u0016-\u001aE\u000bi:-o[kY|šȭhط\u0001-\u000f\u0001y\rUudIRw$\u0002&\b.%29\u007f?\u0014Т\u0011ɒ-2\nΏ\u0016f\u0001viO(&)\u000fPҹGÿ2s\u0010ξ\t.f}Xct\u0019(\fl\ts r\u0017\u0012mV\u0003Wid\rk>w\r1rjf\u000fً\u0011ȷ\"%\tǻr\tCH['K2NҤ;ֵe]q۰~\u0006p\u0015>t\u0014\u000b\u0003Ϧ\u0018̔fQeЦ\fFWv\u0017@8#\u001b!\u0019טv͎\fB\u0011ͩ]QV`|\u0003f@]\u0011?\u007fv\u0007Z.\u001fvk<#o,9\\b\u0001ϕO\u0382\u0018^Kљaea\n\u0006y[^\u001bJ=-\u001b}An@!k#-̳nס4\u0006{̸\u0007]I\t\u001d<7Id0J,#C\u0003\u000fDPQěRݍ\u0013\u001d:߿\f=\\5b!-dV.xGv X+U۳?\u038b|59܊>Ub/{2/T\u009b\r!rʪ\u0017h+VR\u0001\n)6\u0006\u0019\r[\\qwXԐ\u0010ھ-msƑɘ<]"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[;N?k6{H$!B\u000e].\u0017\u0004FA0~DE.]", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp!\u0007r/Xu\u0014GX^,jaH", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ":nR._\u001bHA\u0017\fz^5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "", "7m_Bg\u0014>b\u001c\tyF(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076/L]/fQZ9\u001d\u000e\\\u000e[\u0001", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lw$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNZK4wC3.\f6RKJh\u0014\u001b_\u0012>u\u0001Q \u0014P\t\u0015\u0003J%o\u0010=h\u0005WP-b9g\u0016^\u0005XC6&\u0014~n^Y", "0`b2<5Ic(\\\u0005g5|\u0007>i\n1", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9j8\u0005%\u0019b\t0FK 7VC9z8(\u001e>", "5dc\u000fT:>7\"\n\u000bm\n\u0007\u00128e}7\u007fJ\n", "u(;.a+K]\u001d}Do0|\u001bxi\t3\fO\t\u0017&Jy\r\u0006S!CYa)B}%\fWLDk2-\u0019rj\u000f", "0`b2<5Ic(\\\u0005g5|\u0007>i\n1:?\u0001\u001e\u0017Ik\u001d<", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1ta@b9\u001a\\\u0017\u0002\u0005k\u0010\u0006\n9C\n1\u000bM\u000b\u001e\u001eG|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[*^9j\\\u007f\u0019\u001d\u0010]\u0018[\u000f\u0016\u0006c\u001f.wSD)\u000f3I\u000f\u0011", "4nRBf,=@\u0019|\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "5dc\u0013b*Na\u0019}g^*\fG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "u(;.a+K]\u001d}D`9x\u00142i}6E-\u0001\u0015&\u001d", "Adc\u0013b*Na\u0019}g^*\fG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "uKP;W9HW\u0018H|k(\b\f3c\u000eqh@~&l\u000b`", "7bb", "", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PP,L\u00014FPW.@[}M#od\u0017W+\u000b\u0014]K-D", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", ":dV.V@-S,\u000e[b,\u0004\b\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "=m41\\;\u001c]!\u0007vg+", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "AsPAX", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "BdgA90>Z\u0018lze,z\u00183o\t\u0010wI|\u0019\u0017T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0015GSN*kV|F{\u000ec\nP+\u001aZ", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "1qT.g,\"\\$\u000f\n<6\u0006\u0012/c\u000f,\u0006I", "=tc\u000eg;KW\u0016\u000f\n^:", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9m;z4?fa)8wk", "<nc6Y@\u001f]\u0017\u000f\t^+i\t-t", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "@dbAT9M7\"\n\u000bm\u0010\u0005\u0011/d\u0004$\u000b@\b+", "AsP?g\u0010G^)\u000e", "D`[BX", "BdgA<5Ic(g\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[7U(kS|J\u001c\u0001Z!]\u000f\u0016\u0010iP\u0012nQH#\u0006,%\u00017s\u0010\f#L\u001cjr>T$2\u0001\u0011\u0005B3uNH_\rV%Nm:sti\u001c\\\u0010", "CoS.g,,b\u0015\u000ez", "=kS#T3NS", "<df#T3NS", "CoS.g,-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010", "BdgA90>Z\u0018ove<|", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7m]2e\u001b>f(_~^3{e9u\t'\n", "2dR<e(MW#\bWh?Y\u0013?n~6", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 8;
    private final LegacyCursorAnchorInfoController cursorAnchorInfoController;
    private Rect focusedRect;
    private final InputMethodManager inputMethodManager;
    private LegacyTextFieldState legacyTextFieldState;
    private TextFieldSelectionManager textFieldSelectionManager;
    private final View view;
    private ViewConfiguration viewConfiguration;
    private Function1<? super List<? extends EditCommand>, Unit> onEditCommand = new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onEditCommand$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends EditCommand> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }
    };
    private Function1<? super ImeAction, Unit> onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onImeActionPerformed$1
        /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m1512invokeKlQnJC8(int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
            m1512invokeKlQnJC8(imeAction.m6291unboximpl());
            return Unit.INSTANCE;
        }
    };
    private TextFieldValue state = new TextFieldValue("", TextRange.Companion.m6128getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    private ImeOptions imeOptions = ImeOptions.Companion.getDefault();
    private List<WeakReference<RecordingInputConnection>> ics = new ArrayList();
    private final Lazy baseInputConnection$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<BaseInputConnection>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$baseInputConnection$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.this$0.getView(), false);
        }
    });

    public LegacyTextInputMethodRequest(View view, Function1<? super Matrix, Unit> function1, InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(function1, inputMethodManager);
    }

    public final View getView() {
        return this.view;
    }

    public final TextFieldValue getState() {
        return this.state;
    }

    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    public final Rect getFocusedRect$foundation_release() {
        return this.focusedRect;
    }

    public final void setFocusedRect$foundation_release(Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(TextFieldValue textFieldValue, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, Unit> function1, Function1<? super ImeAction, Unit> function12) {
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = function1;
        this.onImeActionPerformed = function12;
        this.legacyTextFieldState = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public RecordingInputConnection createInputConnection(EditorInfo editorInfo) {
        EditorInfo_androidKt.m1484updatepLxbY9I$default(editorInfo, this.state.getText(), this.state.m6370getSelectiond9O1mEE(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.updateWithEmojiCompat(editorInfo);
        TextFieldValue textFieldValue = this.state;
        boolean autoCorrect = this.imeOptions.getAutoCorrect();
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(textFieldValue, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.createInputConnection.1
            AnonymousClass1() {
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                LegacyTextInputMethodRequest.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
            public void mo1511onImeActionKlQnJC8(int i2) {
                LegacyTextInputMethodRequest.this.onImeActionPerformed.invoke(ImeAction.m6285boximpl(i2));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                LegacyTextInputMethodRequest.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
                LegacyTextInputMethodRequest.this.cursorAnchorInfoController.requestUpdate(z2, z3, z4, z5, z6, z7);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = LegacyTextInputMethodRequest.this.ics.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (Intrinsics.areEqual(((WeakReference) LegacyTextInputMethodRequest.this.ics.get(i2)).get(), recordingInputConnection2)) {
                        LegacyTextInputMethodRequest.this.ics.remove(i2);
                        return;
                    }
                }
            }
        }, autoCorrect, this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$createInputConnection$1 */
    /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я?\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007t\tA0ZeP.XS2\u000f\u0002{<$a&yCQU\"}(\tWNupvJ`\u000fk\u000eإ\u001c\u0001\u0001ߚyU'\\Z\u001d@B\b?aN AGb\r63#x6\u0001\u000e\u0013\u00052*v\u0011'\u0005QP$\u0018@B\u0001:\u0001\u0014{\u000b`&NV.\t6\\\u0016OfLzfR/Q\r0VŰ&ڿ݁\u0001O\u0013Qb3U\u0005o+C@e6E)a\u0011\u001fR\nNIS:s\u0013x?'YJ$[Di\u0018\u0014C=\u007f\u0011k\u0006>\\3c\u0011\u00105?gcyb>,\u0006\u0010\u0014\rj\u0016>\n5^F-Hx8\u0012A\f\u000bSnbHrې\u007f\u007fi9\u001dӽ\u001ca*ݶ\u001f~"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006\u0006%HhG$@x&=\u0017GDz4+\u001edh\u0003mc.Jt;6La;@[}M#yZ\u001dQ5\fqYM4nRF]\u00069I}Jhd\u0015!\u001eDHzK_\u0010E\t\u0019\u007fJg4", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076']N5k0nD\u001b\u000fV\fTwb", "=m2<a5>Q(\u0003\u0005g\n\u0004\u0013=e~", "", "7m_Bg\nH\\\"~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PP,L\u00014FPW.@[}M#od\u0017W+\u000b\u0014]K-D", "=m41\\;\u001c]!\u0007vg+\u000b", "3cXA66F[\u0015\byl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "=m8:X\b<b\u001d\t\u0004", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "=m8:X\b<b\u001d\t\u0004&\u0012\u0004t8J]z", "uH\u0018#", "=m:2l\fOS\"\u000e", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "=mA2d<>a(\\\u000bk:\u0007\u0016\u000bn}+\u0006Md \u0018Q", "7l\\2W0:b\u0019", "", ";n]6g6K", "7mR9h+>7\"\rzk;\u0001\u00138M{5\u0002@\u000e", "7mR9h+>1\u001cz\bZ*\f\t<B\n8\u0005?\u000f", "7mR9h+>3\u0018\u0003\nh9Y\u0013?n~6", "7mR9h+>:\u001d\bz;6\r\u0012.s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements InputEventCallback2 {
        AnonymousClass1() {
        }

        @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
        public void onEditCommands(List<? extends EditCommand> list) {
            LegacyTextInputMethodRequest.this.onEditCommand.invoke(list);
        }

        @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
        /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
        public void mo1511onImeActionKlQnJC8(int i2) {
            LegacyTextInputMethodRequest.this.onImeActionPerformed.invoke(ImeAction.m6285boximpl(i2));
        }

        @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
        public void onKeyEvent(KeyEvent keyEvent) {
            LegacyTextInputMethodRequest.this.getBaseInputConnection().sendKeyEvent(keyEvent);
        }

        @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
        public void onRequestCursorAnchorInfo(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            LegacyTextInputMethodRequest.this.cursorAnchorInfoController.requestUpdate(z2, z3, z4, z5, z6, z7);
        }

        @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
        public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
            int size = LegacyTextInputMethodRequest.this.ics.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (Intrinsics.areEqual(((WeakReference) LegacyTextInputMethodRequest.this.ics.get(i2)).get(), recordingInputConnection2)) {
                    LegacyTextInputMethodRequest.this.ics.remove(i2);
                    return;
                }
            }
        }
    }

    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z2 = (TextRange.m6116equalsimpl0(this.state.m6370getSelectiond9O1mEE(), textFieldValue2.m6370getSelectiond9O1mEE()) && Intrinsics.areEqual(this.state.m6369getCompositionMzsxiRA(), textFieldValue2.m6369getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i2).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
            if (z2) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM6121getMinimpl = TextRange.m6121getMinimpl(textFieldValue2.m6370getSelectiond9O1mEE());
                int iM6120getMaximpl = TextRange.m6120getMaximpl(textFieldValue2.m6370getSelectiond9O1mEE());
                TextRange textRangeM6369getCompositionMzsxiRA = this.state.m6369getCompositionMzsxiRA();
                int iM6121getMinimpl2 = textRangeM6369getCompositionMzsxiRA != null ? TextRange.m6121getMinimpl(textRangeM6369getCompositionMzsxiRA.m6127unboximpl()) : -1;
                TextRange textRangeM6369getCompositionMzsxiRA2 = this.state.m6369getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM6121getMinimpl, iM6120getMaximpl, iM6121getMinimpl2, textRangeM6369getCompositionMzsxiRA2 != null ? TextRange.m6120getMaximpl(textRangeM6369getCompositionMzsxiRA2.m6127unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m6116equalsimpl0(textFieldValue.m6370getSelectiond9O1mEE(), textFieldValue2.m6370getSelectiond9O1mEE()) && !Intrinsics.areEqual(textFieldValue.m6369getCompositionMzsxiRA(), textFieldValue2.m6369getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i3 = 0; i3 < size2; i3++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i3).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop()), MathKt.roundToInt(rect.getRight()), MathKt.roundToInt(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }
}
