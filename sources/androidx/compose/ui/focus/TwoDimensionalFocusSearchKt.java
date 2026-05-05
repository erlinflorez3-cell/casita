package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!,u\bDJc|\u0004O\u000f8é6B\u0015\"4\u0012}\bnjO0LeN4ZS@\u000fs{:$c$\u007fCCU0}*ޛWN}gvJ`\u000fK\u000f\u001c\u0016\u0001j2Um)k\u0013'2pqo7[rU9\u000fxf\t.7:8(\t1\u001e8N(v)G{\u0010 7XphZSMơ\u0019ŇĂB\"\u0007'jqffVwu:]%3mPZ?_^\u0001}\u0011Ta?\r%eN/NEM\u0015SW3\u000b`bW\u0003my\u0004\u0005ڋ&ݐȅMu]Ef\n,\u001f9_%]!7\u0005\u0005\u007fqR'CYq]h\u000eV{#{;@J\u000e\u001e?VAE\u001a\u0015\u001c63#\b\u0004J^\u0018vH\u0010|q6E6.Jq93\u0013_yS\u001bd6*\u00165$3\u0003~!\ne<wE\u001fb\u0011i1\u007fDmL\\\u0011q=\u001c\f7bΜ)ʶΥK\u00025\u0016\u001fI/UEwQ#Om*Hrx'\tnoki\u0001Pp2|3O6\u0019\u000ejD\u0013\u0016{RdXZ\u0013{:\u001b͵ś\u0007ʶء`yB@30f\bv\u000b\u0003M\f\fM/\u0015H\nry0o9\r7eUq\u0017yR%\u001coLp\"prRU\u001cZ\u000b924Xj>y*b\u0015\fȇ1ŭۇ 62T'\u0001-\u0001\u0011CZA+\u000b\bZ\u0017!/XAF\u001biRx9\u0005^c\to\u0016\u0001y<\u000b}:9QSE\u0019Tf2jD|Q\t-\u0012FGҾK܁ƥp\u0018{{\nD.$GxG=A\u0013')`\u0006sEd/sye\u0014=y+{7;\u0017?\u0018\fxwD`\u0019R\u007fZ%K\u000f`\t\"6h0\noc\u0013SsV\u001b[lZ\u0003\u0005i<|:+#eǇߋ\u007fǻݕ\u000173m5H6\u0004\"٬-a\fhFІLˏ\u0013&|Ё$8q\u0016\bb\u007f\\\tձ\u000bա]~FЭؽl\bJKp͍$p\bΒ\u0011_"}, d2 = {"\u0017me._0=4#|\u000bl\u000b\u0001\u0016/c\u000f,\u0006I", "", "\u001cn00g0OSv\u0002~e+", "0dP:5,:b'", "", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "@dRA$", "@dRA%", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "0dP:5,:b'F^03\ns\u0018g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFC|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.\\\\z=#\u001fnW;+\u000b\u0014/( wCD)\f+\\K9r\t\u0017 \u001c54\u0001F \u0012G\u0004\u001duP6|\u0010F_wV\u0017)&\u001f", "7r12g;>`vz\u0004]0{\u0005>e", ">q^=b:>Rvz\u0004]0{\u0005>e", "1ta?X5M1\u0015\byb+x\u0018/", "4nRBf,=@\u0019|\n", "7r12g;>`vz\u0004]0{\u0005>eG\fMG\u000e\u0002\u007fI", "/bc6i,']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "0ncAb4+W\u001b\u0002\n", "1n[9X*M/\u0017|zl:\u0001\u00066e]+\u007fG\u007f$\u0017P", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "/bR2f:BP ~Xa0\u0004\b<e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "4h]15,Lbvz\u0004]0{\u0005>e", "4nRBf\u0019>Q(", "4h]15,Lbvz\u0004]0{\u0005>eGvm4z~\"+", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:\u0001,<Y{/;w\u001fw5SJg1%\u0015Ya7\u0016m9$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEmpDA'\b;V\u0016\u0005U\u0001\n%c\u0019.W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fr..\ri\u001blH\u0004\u0005\u001eo))WL;\f{by|Qy=", "4h]16/BZ\u0018\\\u0005k9|\u0017:o\t'\u007fI\u0003\u0006!(y\fL\u0005\u0005>h}-", "=m5<h5=", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4h]16/BZ\u0018\\\u0005k9|\u0017:o\t'\u007fI\u0003\u0006!(y\fL\u0005\u0005>h}-~5\u007f\u0016\u0015TM>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sxOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tK!", "5d]2e(MSt\byL,x\u0016-h]+\u007fG\u007f$\u0017P", "4nRBf,=7(~\u0003", "5d]2e(MSt\byL,x\u0016-h]+\u007fG\u007f$\u0017P7\\\u001aG\u0016/e\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4s{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u0010N5\u0015\u0005hN8817\u001d\u0017\u0002-hAr\u0010\u0013\u001a\u0017~o\u0002J \u0011W\u0003\u0013\u0005E3qT#@\nP?Tf4mW5`Q", "AdP?V/\u001cV\u001d\u0006yk,\u0006", "AdP?V/\u001cV\u001d\u0006yk,\u0006P}CP\u0019uL\u0003", "Bn_\u0019X-M", "Bv^\u0011\\4>\\'\u0003\u0005g(\u0004i9c\u00106i@|$\u0015J", ">qTC\\6Na \u0013[h*\r\u0017/dl(yO", "Bv^\u0011\\4>\\'\u0003\u0005g(\u0004i9c\u00106i@|$\u0015J7\u001c$i!\u0003_P", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sxO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WP+\u0017\rYP1\u0003\u000e$\u001f\u0006;\u001fhAr\u0010\u0013\u001a\u0017~o\u0002J \u0011W\u0003\u0013\u0005E3qT#@\nP?Tf4mW5`C?65\u0010; \u0017qRwf\u0006]\u0018rN\u0003=", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m3902twoDimensionalFocusSearchsMXa3k8(FocusTargetNode focusTargetNode, int i2, Rect rect, Function1<? super FocusTargetNode, Boolean> function1) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                return Boolean.valueOf(m3898findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i2, function1));
            }
            if (i3 == 4) {
                if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                    return function1.invoke(focusTargetNode);
                }
                if (rect == null) {
                    return Boolean.valueOf(m3898findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i2, function1));
                }
                return Boolean.valueOf(m3901searchChildren4C6V_qg(focusTargetNode, rect, i2, function1));
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild.toString());
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[activeChild.getFocusState().ordinal()];
        if (i4 == 1) {
            Boolean boolM3902twoDimensionalFocusSearchsMXa3k8 = m3902twoDimensionalFocusSearchsMXa3k8(activeChild, i2, rect, function1);
            if (!Intrinsics.areEqual((Object) boolM3902twoDimensionalFocusSearchsMXa3k8, (Object) false)) {
                return boolM3902twoDimensionalFocusSearchsMXa3k8;
            }
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeNode(activeChild));
            }
            return Boolean.valueOf(m3899generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i2, function1));
        }
        if (i4 == 2 || i4 == 3) {
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeChild);
            }
            return Boolean.valueOf(m3899generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i2, function1));
        }
        if (i4 == 4) {
            throw new IllegalStateException(NoActiveChild.toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m3899generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final Rect rect, final int i2, final Function1<? super FocusTargetNode, Boolean> function1) {
        if (m3901searchChildren4C6V_qg(focusTargetNode, rect, i2, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m3845searchBeyondBoundsOMvw8(focusTargetNode, i2, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                Boolean boolValueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m3901searchChildren4C6V_qg(focusTargetNode, rect, i2, function1));
                if (boolValueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m3897findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i2) {
        Rect rectTranslate;
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            rectTranslate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
            rectTranslate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            rectTranslate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] content = mutableVector.getContent();
            int i3 = 0;
            do {
                FocusTargetNode focusTargetNode2 = content[i3];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                    if (m3900isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i2)) {
                        focusTargetNode = focusTargetNode2;
                        rectTranslate = rectFocusRect;
                    }
                }
                i3++;
            } while (i3 < size);
        }
        return focusTargetNode;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i2, Rect rect2) {
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else {
            if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f2;
        if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f2 = top - bottom;
            return Math.max(0.0f, f2);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f2 = top2 - bottom2;
        return Math.max(0.0f, f2);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i2, Rect rect2) {
        float f2;
        float left;
        float left2;
        float width;
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
            f2 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f2);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f2 = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f2);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f2));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i2, Rect rect, Rect rect2) {
        long jAbs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i2, rect));
        long jAbs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i2, rect));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m3900isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i2, rect3)) {
            return !isBetterCandidate_I7lrPNg$isCandidate(rect2, i2, rect3) || m3896beamBeatsI7lrPNg(rect3, rect, rect2, i2) || (!m3896beamBeatsI7lrPNg(rect3, rect2, rect, i2) && isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect2));
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i2, Rect rect2) {
        if (!(FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s()))) {
            if (!(FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i2, Rect rect2) {
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else {
            if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        }
        return false;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f2;
        if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f2 = top - bottom;
            return Math.max(0.0f, f2);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f2 = top2 - bottom2;
        return Math.max(0.0f, f2);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i2, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f2;
        if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f2 = bottom - bottom2;
            return Math.max(1.0f, f2);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f2 = top - top2;
        return Math.max(1.0f, f2);
    }

    /* JADX INFO: renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m3896beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i2, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i2, rect)) {
            return false;
        }
        return !beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i2, rect) || FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s()) || FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i2, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i2, rect);
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return focusTargetNodeFindActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }

    /* JADX INFO: renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m3898findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i2, Function1<? super FocusTargetNode, Boolean> function1) {
        Rect rectBottomRight;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.isEmpty() ? null : mutableVector.getContent()[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3856getEnterdhqQ8s())) {
            i2 = FocusDirection.Companion.m3861getRightdhqQ8s();
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
            rectBottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
        } else {
            if (!(FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            rectBottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeM3897findBestCandidate4WY_MpI = m3897findBestCandidate4WY_MpI(mutableVector, rectBottomRight, i2);
        if (focusTargetNodeM3897findBestCandidate4WY_MpI != null) {
            return function1.invoke(focusTargetNodeM3897findBestCandidate4WY_MpI).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m3901searchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i2, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeM3897findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
        if (!focusTargetNode2.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode2.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode2.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            int aggregateChildKindSet$ui_release = nodePop.getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                                if (focusTargetNode3.isAttached()) {
                                    mutableVector.add(focusTargetNode3);
                                }
                            } else {
                                int kindSet$ui_release = nodePop.getKindSet$ui_release();
                                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(nodePop);
                                                    }
                                                    nodePop = null;
                                                }
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
        while (mutableVector.isNotEmpty() && (focusTargetNodeM3897findBestCandidate4WY_MpI = m3897findBestCandidate4WY_MpI(mutableVector, rect, i2)) != null) {
            if (focusTargetNodeM3897findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetNodeM3897findBestCandidate4WY_MpI).booleanValue();
            }
            if (m3899generateAndSearchChildren4C6V_qg(focusTargetNodeM3897findBestCandidate4WY_MpI, rect, i2, function1)) {
                return true;
            }
            mutableVector.remove(focusTargetNodeM3897findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            int aggregateChildKindSet$ui_release = nodePop.getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                                if (focusTargetNode.isAttached()) {
                                    FocusTargetNode focusTargetNode2 = focusTargetNode;
                                    if (!DelegatableNodeKt.requireLayoutNode(focusTargetNode2).isDeactivated()) {
                                        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                            mutableVector.add(focusTargetNode);
                                        } else {
                                            collectAccessibleChildren(focusTargetNode2, mutableVector);
                                        }
                                    }
                                }
                            } else if ((nodePop.getKindSet$ui_release() & iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(nodePop);
                                                }
                                                nodePop = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }
}
