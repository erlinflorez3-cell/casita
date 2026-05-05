package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0007<řc$\bCCU }*\teNogtJb\u000bQ\u0018\u000e\u0016~pDscތu\u0012=1jom2}sK9xtd\u0006P60:\u0012\u0005/\u001bZL\u001ey\u0013Cy\u0010B4NuRR;SK\u001a*|L'\u0019\u001e\u000bov6vk\u000e>=,\u001bipXWc>\be\rt`W\u0013\u0005n6-V6c!UW\u0011\nj[m\u0007ouK\u0013\u0001'U:ywe;p\u007fB\u001b[S\u001bm\u000b&\u000b\u000b\u0002f\u0012'9`{K~ X}\u0001{\u001bO\u001c\u000e49x43\u001at\u001c&3#\u0005\u0004FV\u0002lW\u0018z\u0010H]ӛƧ2ٿݰ\u001fhWwI0fY\n\u001d%\u001eQ\u007f\u0017!\nS>d#4lw\u007f2\u0002DKKf\n\bA\u001e\b~g\u001a*26\u000e\u007f߿{\u00166\u001a+ڽwg\"ݒo\u001c"}, d2 = {"/cS\u0010[(KO\u0017\u000ezk\t\u0007\u00198d\u000e", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<urz%lh8\u0007p\u0002", "AsP?g\u0016?T'~\n", "", "3mS\u001cY-LS(", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7m]2e\u001b>f(_~^3{e9u\t'\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "0tX9W", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<u\n", "BdgA", "", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "1n\\=b:Bb\u001d\t\u0004", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "2dR<e(MW#\bWh?Y\u0013?n~6", "7mR9h+>7\"\rzk;\u0001\u00138M{5\u0002@\u000e", "", "7mR9h+>1\u001cz\bZ*\f\t<B\n8\u0005?\u000f", "7mR9h+>3\u0018\u0003\nh9Y\u0013?n~6", "7mR9h+>:\u001d\bz;6\r\u0012.s", "0tX9WsOf%sxAv", "uKP;W9HW\u0018H\fb,\u000fR3n\u000b8\u000bH\u0001&\u001aQnW\u001a\u00072Cc\u000b{@k\u00198Z'Dl>\\qxe@\u0006c9$],C]JucN{?]o]\n[\u0019\r\u0011iA-lD\r\u0004n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b8hYh)hGTTO&m\u000e_rC6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RCwk\u0011(zK3\b\\[YTVQP~7.8{\u0006\"9gJ\u0012p6\u0003A4:cNMt\u0014Ia|\u0013:&)#5C@&\u00152_~kK\u0018l\u001etQ\fl=<#se-X\u0013P_\u0017e=an\u000eK\u001cr>G~j\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001c\u0001Hka\u0011\r\u000bf')B_*Y\rw\u007fT,B\bLO4\u0015zfM\u0019o\u0012!qK\u0005%[x/F\b\u0019I06U;@0S|\u001e A\\\u0014| }v&\u00037\u001dz", "Adc\u0016a:>`(\u0003\u0005g\u0014x\u00165e\r", "Ad[2V;B]\"l\nZ9\f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX INFO: renamed from: build-vxqZcH0$default, reason: not valid java name */
    public static /* synthetic */ CursorAnchorInfo m1478buildvxqZcH0$default(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j2, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            z8 = true;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            z7 = true;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            z6 = true;
        }
        return m1477buildvxqZcH0(builder, charSequence, j2, textRange, textLayoutResult, matrix, rect, rect2, z8, z7, z6, (i2 + 1024) - (i2 | 1024) == 0 ? z5 : true);
    }

    /* JADX INFO: renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m1477buildvxqZcH0(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j2, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM6121getMinimpl = TextRange.m6121getMinimpl(j2);
        builder.setSelectionRange(iM6121getMinimpl, TextRange.m6120getMaximpl(j2));
        if (z2) {
            setInsertionMarker(builder, iM6121getMinimpl, textLayoutResult, rect);
        }
        if (z3) {
            int iM6121getMinimpl2 = textRange != null ? TextRange.m6121getMinimpl(textRange.m6127unboximpl()) : -1;
            int iM6120getMaximpl = textRange != null ? TextRange.m6120getMaximpl(textRange.m6127unboximpl()) : -1;
            if (iM6121getMinimpl2 >= 0 && iM6121getMinimpl2 < iM6120getMaximpl) {
                builder.setComposingText(iM6121getMinimpl2, charSequence.subSequence(iM6121getMinimpl2, iM6120getMaximpl));
                addCharacterBounds(builder, iM6121getMinimpl2, iM6120getMaximpl, textLayoutResult, rect);
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

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i2, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i2);
        float fCoerceIn = RangesKt.coerceIn(cursorRect.getLeft(), 0.0f, IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g()));
        boolean zContainsInclusive = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fCoerceIn, cursorRect.getTop());
        boolean zContainsInclusive2 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fCoerceIn, cursorRect.getBottom());
        int i3 = 1;
        boolean z2 = textLayoutResult.getBidiRunDirection(i2) == ResolvedTextDirection.Rtl;
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
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.ui.text.TextLayoutResult r20, androidx.compose.ui.geometry.Rect r21) {
        /*
            r4 = r19
            r5 = r18
            int r0 = r4 - r5
            int r0 = r0 * 4
            float[] r2 = new float[r0]
            r3 = r20
            androidx.compose.ui.text.MultiParagraph r7 = r3.getMultiParagraph()
            long r0 = androidx.compose.ui.text.TextRangeKt.TextRange(r5, r4)
            r6 = 0
            r7.m5988fillBoundingBoxes8ffj60Q(r0, r2, r6)
            r11 = r5
        L19:
            r10 = r17
            if (r11 >= r4) goto L80
            int r0 = r11 - r5
            int r9 = r0 * 4
            androidx.compose.ui.geometry.Rect r6 = new androidx.compose.ui.geometry.Rect
            r8 = r2[r9]
            int r0 = r9 + 1
            r7 = r2[r0]
            int r0 = r9 + 2
            r1 = r2[r0]
            int r0 = r9 + 3
            r0 = r2[r0]
            r6.<init>(r8, r7, r1, r0)
            r7 = r21
            boolean r16 = r7.overlaps(r6)
            float r1 = r6.getLeft()
            float r0 = r6.getTop()
            boolean r0 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r7, r1, r0)
            if (r0 == 0) goto L56
            float r1 = r6.getRight()
            float r0 = r6.getBottom()
            boolean r0 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r7, r1, r0)
            if (r0 != 0) goto L5f
        L56:
            r1 = 2
            int r0 = r16 + r1
            r16 = r16 & r1
            int r0 = r0 - r16
            r16 = r0
        L5f:
            androidx.compose.ui.text.style.ResolvedTextDirection r1 = r3.getBidiRunDirection(r11)
            androidx.compose.ui.text.style.ResolvedTextDirection r0 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r1 != r0) goto L6a
            r0 = 4
            r16 = r16 | r0
        L6a:
            float r12 = r6.getLeft()
            float r13 = r6.getTop()
            float r14 = r6.getRight()
            float r15 = r6.getBottom()
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L19
        L80:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }
}
