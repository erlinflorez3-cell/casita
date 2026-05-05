package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LegacyCursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\":\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yّCU0}*ޛWNupvJ`\u0013K\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG3StCʠvҚf\u0005N1bW\n\u0015\u000f\u001aBT x\u000bCy\u000e\"2PphU;N\u0015\u001e \nV /#֔kNDN5aHM;\u0003\u0018E\u0017[mO\u0015M;I\u0005+\u001b\u0017y\u001eYNg9#Fk\u00035`\fC\u0011P\n=3vW+9X\fWdf0\u0018#;g\r\f\u0001V`\u0013cx\fU9\u0018iYr&(&}B\r\u00050\u001c)?H\\0Jj\u0016(Kt!npT\u0010vZ\u007f)zf\u001b3\u001cK+g8\u0017UoN1Ne\b5\u0011,.\u0019nOg%\u001an\u001c3T&Y\b҈BףLN\u0012ԯ\u000ey\u0012yz\u0002X\u000e\u0007ϝ\u0002\u009e\u007f\u00116ϏuEiD;#\u0002\u0001vP>ϻ\u0011¾lSqɭ\u0019L0{.7X\u0017bɱP\u0081\tkXӹ)8\u001f\\4T5\f^ʹ,Ϣ{<)ط`Z]x\u0002j{k`ɛ;Ϭ;Yv\u0088^cGoK5\u007fqfУ^λ\u0018?DϵUdtTk\f\tj~β>ʮn\u0010\u007fӻ\u0015\\\u001a&JA\b\u001bb8\bǌhČL\u0003&Փ\u0012\t\u0017crh>\u0004+՟&ғm$|էQhjp\bs\tK<|\u000f$=Ca5G)\u0004#?ؗ~ɠ\u000b~{Ò\u0018sZ[dlDt,ݫ\"ک\u001e9Yǽ\u000e'\u001d\u0014A20/\u001cɦtхP˧ʵ&y܃}\u0011Ch<}Xv~Cxjx]+Ϣ.Ցbr+Ψ5\u000e\by^|]b\u0003$2ůU\u03a2\u0007YDѾ\t\u000b\u001396'\u0017nP\u0018\fԉOے!\u0016\u007fҡ\u007f#oy\u0002qDx\u0011,|۬qנ0c\u001e˱̨Qf:>>ՠu-=*$r\"ݒL\u000f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[*^9j\\\u007f\u0019\u001d\u0010]\u0018[\u000f\u0016\u0006c\u001f.wSD)\u000f3I\u000f\u0011", "", ":nR._\u001bHA\u0017\fz^5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "", "7m_Bg\u0014>b\u001c\tyF(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076/L]/fQZ9\u001d\u000e\\\u000e[\u0001", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuO\u00017PKJ;`\\{\u0007#\u0012m\u001d\u0018/\u0016\u0010iPmrMF\u001f\u00155E\t\u0005L\n\u0017&\u001d\u001dj\u007fE`\u000f/u\u001eqC)u\u001c\u001dP", "/mS?b0=;\u0015\u000e\bb?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "0tX9W,K", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<urz%lh8\u0007p\u0002", "2dR<e(MW#\bWh?Y\u0013?n~6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "6`b\u001dX5=W\"\u0001^f4|\b3a\u000f(h@\r'\u0017U~", "", "7mR9h+>1\u001cz\bZ*\f\t<B\n8\u0005?\u000f", "7mR9h+>3\u0018\u0003\nh9Y\u0013?n~6", "7mR9h+>7\"\rzk;\u0001\u00138M{5\u0002@\u000e", "7mR9h+>:\u001d\bz;6\r\u0012.s", "7m]2e\u001b>f(_~^3{e9u\t'\n", ":nR8", ";`c?\\?", ")E", ";n]6g6K3\"zwe,{", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "BdgA90>Z\u0018ove<|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7me._0=O(~", "@d`BX:MC$}vm,", "7l\\2W0:b\u0019", ";n]6g6K", "CoS.g,\u001cc&\r\u0005k\b\u0006\u00072o\r\f\u0005A\u000b", "CoS.g,-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LegacyCursorAnchorInfoController {
    public static final int $stable = 8;
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private final Function1<Matrix, Unit> localToScreen;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;
    private final Object lock = new Object();
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m4409constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyCursorAnchorInfoController(Function1<? super Matrix, Unit> function1, InputMethodManager inputMethodManager) {
        this.localToScreen = function1;
        this.inputMethodManager = inputMethodManager;
    }

    public final void requestUpdate(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        synchronized (this.lock) {
            this.includeInsertionMarker = z4;
            this.includeCharacterBounds = z5;
            this.includeEditorBounds = z6;
            this.includeLineBounds = z7;
            if (z2) {
                this.hasPendingImmediateRequest = true;
                if (this.textFieldValue != null) {
                    updateCursorAnchorInfo();
                }
            }
            this.monitorEnabled = z3;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect, Rect rect2) {
        synchronized (this.lock) {
            this.textFieldValue = textFieldValue;
            this.offsetMapping = offsetMapping;
            this.textLayoutResult = textLayoutResult;
            this.innerTextFieldBounds = rect;
            this.decorationBoxBounds = rect2;
            if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                updateCursorAnchorInfo();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive() && this.textFieldValue != null && this.offsetMapping != null && this.textLayoutResult != null && this.innerTextFieldBounds != null && this.decorationBoxBounds != null) {
            Matrix.m4418resetimpl(this.matrix);
            this.localToScreen.invoke(Matrix.m4407boximpl(this.matrix));
            float[] fArr = this.matrix;
            Rect rect = this.decorationBoxBounds;
            Intrinsics.checkNotNull(rect);
            float f2 = -rect.getLeft();
            Rect rect2 = this.decorationBoxBounds;
            Intrinsics.checkNotNull(rect2);
            Matrix.m4428translateimpl(fArr, f2, -rect2.getTop(), 0.0f);
            AndroidMatrixConversions_androidKt.m4048setFromEL8BTi8(this.androidMatrix, this.matrix);
            InputMethodManager inputMethodManager = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            Intrinsics.checkNotNull(textFieldValue);
            OffsetMapping offsetMapping = this.offsetMapping;
            Intrinsics.checkNotNull(offsetMapping);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.checkNotNull(textLayoutResult);
            android.graphics.Matrix matrix = this.androidMatrix;
            Rect rect3 = this.innerTextFieldBounds;
            Intrinsics.checkNotNull(rect3);
            Rect rect4 = this.decorationBoxBounds;
            Intrinsics.checkNotNull(rect4);
            inputMethodManager.updateCursorAnchorInfo(LegacyCursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect3, rect4, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }
}
