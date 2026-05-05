package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
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
/* JADX INFO: compiled from: CursorAnchorInfoBuilder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmgvJh\u0014K\u000f\f\u0019\u0001j:N]xc\u0014'dPģW3{ne9\u000fsf\t.2:8(\u00061\u001e8J(v)D{\u0010 3XphV=Q\u0013\u001f*\u0006l&1\"jnf6vt$:G\u0006\u0011rZNUiX|{\fvX5\u0018\u000faL7p;C\u0018=S1\u000b\u0003_M\bWqk\u000b\u0019+58as\u0006D\t\u0004\"\u001cCO;e#*j\u0014i`:/[UiK^\u001e@w)\r=B\n\u000e\u00149`.[+\u0017\u000e\u00143\u0003\u0006k@~\u0013\u000fH\u0006zoJ/%.Dq83\u0001_vS\u0019|H$\u0005;&S\u0005|7sT<wE\u001fb\u0010i1\u007fW\u0004Hf4gV\u0006\u0004\u001fa**2/w\u0004=\u0016).E&g_G&9k0Ltk\u0005\nxh\u0002o\u0003LN)\u0007\u0016e2O\fʗH\u007f"}, d2 = {"/cS\u0010[(KO\u0017\u000ezk\t\u0007\u00198d\u000e", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<urz%lh8\u0007p\u0002", "AsP?g\u0016?T'~\n", "", "3mS\u001cY-LS(", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7m]2e\u001b>f(_~^3{e9u\t'\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "0tX9W", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<u\n", "BdgA90>Z\u0018ove<|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "2dR<e(MW#\bWh?Y\u0013?n~6", "7mR9h+>7\"\rzk;\u0001\u00138M{5\u0002@\u000e", "", "7mR9h+>1\u001cz\bZ*\f\t<B\n8\u0005?\u000f", "7mR9h+>3\u0018\u0003\nh9Y\u0013?n~6", "7mR9h+>:\u001d\bz;6\r\u0012.s", "1n]AT0Ga|\bxe<\u000b\r@e", "F", "", "G", "Adc\u0016a:>`(\u0003\u0005g\u0014x\u00165e\r", "Ad[2V;B]\"l\nZ9\f", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CursorAnchorInfoBuilder_androidKt {
    public static /* synthetic */ CursorAnchorInfo build$default(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        if ((i2 + 64) - (i2 | 64) != 0) {
            z8 = true;
        }
        if ((i2 & 128) != 0) {
            z7 = true;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            z6 = true;
        }
        return build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, z8, z7, z6, (i2 & 512) == 0 ? z5 : true);
    }

    @Deprecated(message = "\u0012T\bN1y-`k[;:d$kaq\\\u00196\u0017|Kf~K.vS{%i\u0002\fXGepQGV3G-\u0017hb\u0003%]\b\u001cU'G_K0(\u0004$\ns\u0010\u0002 /L/P\u0002;_;G|V)~]P;8@ftzV+r\u0001m5\u0003\u0004\u00135\u000f4T\u001a?\u0012&((Qvk\u0010%)UDek\u000b:*\u000f?A\u00043d4,\t\u0014\u0012nm~WYj\\\u000e^$\u0014w\u0011\\\u00026P#0{k\n\nAaA\u0015q\\\u0011\u0003,\u0014qSnx6")
    @InterfaceC1492Gx
    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM6121getMinimpl = TextRange.m6121getMinimpl(textFieldValue.m6370getSelectiond9O1mEE());
        builder.setSelectionRange(iM6121getMinimpl, TextRange.m6120getMaximpl(textFieldValue.m6370getSelectiond9O1mEE()));
        if (z2) {
            setInsertionMarker(builder, iM6121getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z3) {
            TextRange textRangeM6369getCompositionMzsxiRA = textFieldValue.m6369getCompositionMzsxiRA();
            int iM6121getMinimpl2 = textRangeM6369getCompositionMzsxiRA != null ? TextRange.m6121getMinimpl(textRangeM6369getCompositionMzsxiRA.m6127unboximpl()) : -1;
            TextRange textRangeM6369getCompositionMzsxiRA2 = textFieldValue.m6369getCompositionMzsxiRA();
            int iM6120getMaximpl = textRangeM6369getCompositionMzsxiRA2 != null ? TextRange.m6120getMaximpl(textRangeM6369getCompositionMzsxiRA2.m6127unboximpl()) : -1;
            if (iM6121getMinimpl2 >= 0 && iM6121getMinimpl2 < iM6120getMaximpl) {
                builder.setComposingText(iM6121getMinimpl2, textFieldValue.getText().subSequence(iM6121getMinimpl2, iM6120getMaximpl));
                addCharacterBounds(builder, iM6121getMinimpl2, iM6120getMaximpl, offsetMapping, textLayoutResult, rect);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && z4) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (Build.VERSION.SDK_INT >= 34 && z5) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        int iOriginalToTransformed = offsetMapping.originalToTransformed(i2);
        Rect cursorRect = textLayoutResult.getCursorRect(iOriginalToTransformed);
        float fCoerceIn = RangesKt.coerceIn(cursorRect.getLeft(), 0.0f, IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g()));
        boolean zContainsInclusive = containsInclusive(rect, fCoerceIn, cursorRect.getTop());
        boolean zContainsInclusive2 = containsInclusive(rect, fCoerceIn, cursorRect.getBottom());
        int i3 = 1;
        boolean z2 = textLayoutResult.getBidiRunDirection(iOriginalToTransformed) == ResolvedTextDirection.Rtl;
        if (!zContainsInclusive && !zContainsInclusive2) {
            i3 = 0;
        }
        if (!zContainsInclusive || !zContainsInclusive2) {
            i3 = (-1) - (((-1) - i3) & ((-1) - 2));
        }
        builder.setInsertionMarkerLocation(fCoerceIn, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z2 ? (i3 + 4) - (i3 & 4) : i3);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /* JADX WARN: Type inference failed for: r18v0, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r19, int r20, int r21, androidx.compose.ui.text.input.OffsetMapping r22, androidx.compose.ui.text.TextLayoutResult r23, androidx.compose.ui.geometry.Rect r24) {
        /*
            r13 = r20
            r5 = r22
            int r3 = r5.originalToTransformed(r13)
            r6 = r21
            int r1 = r5.originalToTransformed(r6)
            int r0 = r1 - r3
            int r0 = r0 * 4
            float[] r2 = new float[r0]
            r4 = r23
            androidx.compose.ui.text.MultiParagraph r8 = r4.getMultiParagraph()
            long r0 = androidx.compose.ui.text.TextRangeKt.TextRange(r3, r1)
            r7 = 0
            r8.m5988fillBoundingBoxes8ffj60Q(r0, r2, r7)
        L22:
            r12 = r19
            if (r13 >= r6) goto L8d
            int r8 = r5.originalToTransformed(r13)
            int r0 = r8 - r3
            int r11 = r0 * 4
            androidx.compose.ui.geometry.Rect r7 = new androidx.compose.ui.geometry.Rect
            r10 = r2[r11]
            int r0 = r11 + 1
            r9 = r2[r0]
            int r0 = r11 + 2
            r1 = r2[r0]
            int r0 = r11 + 3
            r0 = r2[r0]
            r7.<init>(r10, r9, r1, r0)
            r9 = r24
            boolean r18 = r9.overlaps(r7)
            float r1 = r7.getLeft()
            float r0 = r7.getTop()
            boolean r0 = containsInclusive(r9, r1, r0)
            if (r0 == 0) goto L63
            float r1 = r7.getRight()
            float r0 = r7.getBottom()
            boolean r0 = containsInclusive(r9, r1, r0)
            if (r0 != 0) goto L6b
        L63:
            r0 = 2
            int r1 = (-1) - r18
            int r0 = (-1) - r0
            r1 = r1 & r0
            int r18 = (-1) - r1
        L6b:
            androidx.compose.ui.text.style.ResolvedTextDirection r1 = r4.getBidiRunDirection(r8)
            androidx.compose.ui.text.style.ResolvedTextDirection r0 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r1 != r0) goto L8c
            r0 = 4
            r18 = r18 | r0
        L76:
            float r14 = r7.getLeft()
            float r15 = r7.getTop()
            float r16 = r7.getRight()
            float r17 = r7.getBottom()
            r12.addCharacterBounds(r13, r14, r15, r16, r17, r18)
            int r13 = r13 + 1
            goto L22
        L8c:
            goto L76
        L8d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    private static final boolean containsInclusive(Rect rect, float f2, float f3) {
        float left = rect.getLeft();
        if (f2 <= rect.getRight() && left <= f2) {
            float top = rect.getTop();
            if (f3 <= rect.getBottom() && top <= f3) {
                return true;
            }
        }
        return false;
    }
}
