package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
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
/* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0012T\bN1y-`k[;:d$kaq\\\u00196\u0017|Kf~K.vS{%i\u0002\fXGepQGV3G-\u0017hb\u0003%]\b\u001cU'G_K0(\u0004$\ns\u0010\u0002 /L/P\u0002;_;G|V)~]P;8@ftzV+r\u0001m5\u0003\u0004\u00135\u000f4T\u001a?\u0012&((Qvh\u0007\u00189Tz_k\u000b7+dG6o9iB&?\u000e\u0017ny~\u001dH\u0017Y#^6\u0003=<`\u0002}E!B:Jq]hc\"\u0011\u0007|qs\u001d:l\u001c")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{J$cҕyCI^\"}(\u000eWN}gvJ`\fK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u001d2JģG3coEʠhtL\u0005(2(=\u007f\u0004\u0017ɝZH>u;V[\u0010 0XphS\u001dQ\u0013\u001c*\u0006l#Ә\"\\uR~Lz}R/Q\u001e2v\\Hw0+h=JbI%v\u0010*[DEX-%\u0002\u000f7ViN\u001b? I5l54CI\"cf\\\u000e\"-+}\u0019\u000ev4l\u001dQ\u000f\u0018o1]\bcP<C>zDMJ)&\u0006Uc^1(\u0003 \u000ea\u0012#WNg\u001a^p\u0018+eD5=\u007faJi+tjyG)PG{3!.%\u0011nOv\u0003(\u0011\u0019)e\u0010Q_[pAVW\"YkwT|p\u0007B\u0004^MV߿} 2\u0017-ڛ,E1(\u0004\u0002vL>ϻ\u0007¾lSqɭ\u0019N0w.9@\b:d\u001bߢ\u0011\u07fbTT`\u008caY*_\u001f}6\u001fvς\u0004˶%%\u0018ʚ twwe]81\u0006όC֍rk\u0016ã\njACic>m)Λ ͖@b\r֚7Na\u001br\\V.\tʎvݻ{{L\u0088\\\u001f@O\n\u001cb8\bǌhČL\u0003&Փ\u0012\u000b\u0017prj&}\u0003=zѳu˨x\t\tˆ-|}i\u0011IZ\u007f7ø/ۮU5!ğ&.vF\u0015#5}JÕIѨPGT˾f\nc\u000f8\u0016HM(Ȁ?Ҙ\u000eȯɴ1\u0001βINze_bb3\t\u0013\u0012\u000fit\u0005ԙ\u0014ϡt,hʄ\u001b]b.:xtqQ ;у\u0006ӶJzOϊ%\u0017i>ar1Z\u0013ҁ:٫\t\u001f&ݒQ\b0\u0016M9S)-\u0016&(?\u0017q]\u0018\u000b\\\u00149ϊ2܌i\u00044ϣf}pmu4Q7wvUЙ.ٝp\u0003Jו;\u0006\u0016`!6#2v`;ݨbиQ\u000b7̎ֈ\u00075\u0015s\\\u074cVAn\u000644~ͱwi"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#[0D{ ;)L9n>+xqbCdm5]\u00041NSN92", "", "@n^AC6LW(\u0003\u0005g\nx\u0010-u\u0007$\u000bJ\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X <QR?u={\u0011o_I\u000e_;X\u0004|", "7m_Bg\u0014>b\u001c\tyF(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a)B}%\u0016MR>u3\u0006\u0011q];\u0007p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018[GJo>'rdh7\u0017j(]\u00014\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001.\b?XK?q\f\u001c%W\u0019s{RewG\t\u0018\u007f@\u0011dOUayT\u0017\tS", "/mS?b0=;\u0015\u000e\bb?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "0tX9W,K", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<urz%lh8\u0007p\u0002", "2dR<e(MW#\bWh?Y\u0013?n~6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "6`b\u001dX5=W\"\u0001^f4|\b3a\u000f(h@\r'\u0017U~", "", "7mR9h+>1\u001cz\bZ*\f\t<B\n8\u0005?\u000f", "7mR9h+>3\u0018\u0003\nh9Y\u0013?n~6", "7mR9h+>7\"\rzk;\u0001\u00138M{5\u0002@\u000e", "7mR9h+>:\u001d\bz;6\r\u0012.s", "7m]2e\u001b>f(_~^3{e9u\t'\n", ":nR8", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", ")E", ";n]6g6K3\"zwe,{", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "BdgA90>Z\u0018m\u0005K6\u0007\u0018\u001er{1\nA\u000b$\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "BdgA90>Z\u0018ove<|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7me._0=O(~", "@d`BX:MC$}vm,", "7l\\2W0:b\u0019", ";n]6g6K", "CoS.g,\u001cc&\r\u0005k\b\u0006\u00072o\r\f\u0005A\u000b", "CoS.g,-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private final PositionCalculator rootPositionCalculator;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;
    private final Object lock = new Object();
    private Function1<? super Matrix, Unit> textFieldToRootTransform = new Function1<Matrix, Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m6281invoke58bKbWc(float[] fArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Matrix matrix) {
            m6281invoke58bKbWc(matrix.m4430unboximpl());
            return Unit.INSTANCE;
        }
    };
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m4409constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(PositionCalculator positionCalculator, InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = positionCalculator;
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

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1<? super Matrix, Unit> function1, Rect rect, Rect rect2) {
        synchronized (this.lock) {
            this.textFieldValue = textFieldValue;
            this.offsetMapping = offsetMapping;
            this.textLayoutResult = textLayoutResult;
            this.textFieldToRootTransform = function1;
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
            this.textFieldToRootTransform = new Function1<Matrix, Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m6280invoke58bKbWc(float[] fArr) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Matrix matrix) {
                    m6280invoke58bKbWc(matrix.m4430unboximpl());
                    return Unit.INSTANCE;
                }
            };
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(Matrix.m4407boximpl(this.matrix));
            this.rootPositionCalculator.mo5466localToScreen58bKbWc(this.matrix);
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
            Rect rect = this.innerTextFieldBounds;
            Intrinsics.checkNotNull(rect);
            Rect rect2 = this.decorationBoxBounds;
            Intrinsics.checkNotNull(rect2);
            inputMethodManager.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }
}
