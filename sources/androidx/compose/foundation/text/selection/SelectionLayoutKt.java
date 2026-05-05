package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,o\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007|jAӄLeV7ZS0\u0011s{J$c$wDCU0}*\tUNog\u0005Jb\u000bI\u0010\u001e^\u0007jDI\u0004y\u000e\u0016\u001d4Zom6}sK=xtd\u0004P60=\u0012\u0005/\u0019ZL\u001e|\u0013Cy\u000bB4NwRR;U5\u001e \u000fV /(\rk\\A`l\fDu݊ʾhĩĚ+a6\t[\u001a^j5\u001b\u000faL:p;C%=S1\u0016\u0003_M\u0014Wqk\u0014/ѧ?=W\u0006o6\u0007\u0013<\u0015YR=a\u0001:t\u0005\u007f_R'Ceq`h\u000eV\u0002#}#;2$6-VEE\u001c|\u0007<4;ɁkR^\u001avB.\u0005\n6E(079M3f\u007f`\u0002\u0019nC\n˜%\u001eQ\u007fEĐ.ڍ\u0012`\u001dÑƛwV9TFעd|\t\u0558A\u0007"}, d2 = {"#M0 F\u0010 <x]tL\u0013fw", "", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006Ig\u0013+Q\u007f\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", ":`h<h;+S'\u000f\u0002m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "@`f g(Kb{z\u0004]3|r0f\u000e(\u000b", "@`f\u0012a+!O\"}\u0002^\u0016}\n=e\u000f", "@`f\u001de,OW#\u000f\tA(\u0006\b6ei)|N\u0001&", ">qTC\\6Na\u0007~\u0002^*\f\r9nl$\u0005B\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "7rBAT9M=\u001alze,z\u00183o\t", "", "7rBAT9M6\u0015\bye,", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006Ig\u0013+Q\u007f\u001d\u0004c#FHE\u0007\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCsxLE\u001e{Xo5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\u0011;{\u0010U$\u000e<jnQZ\u001aPC\u0003uH)fU]i\u0003.=Yl:sa", "@db<_=> \u0018]~k,z\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=gsln9\u0005r0X\u007f|", "F", "G", "5dc!X?M2\u001d\fz\\;\u0001\u00138F\n5eA\u0002%\u0017V", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "=eU@X;", "7r2<_3:^'~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", ":`h<h;", "7r>3Y:>bt\bZf7\f\u001d\u0016i\t(", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    /* JADX INFO: compiled from: SelectionLayout.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: getTextFieldSelectionLayout-RcvT-LA */
    public static final SelectionLayout m1684getTextFieldSelectionLayoutRcvTLA(TextLayoutResult textLayoutResult, int i2, int i3, int i4, long j2, boolean z2, boolean z3) {
        return new SingleSelectionLayout(z3, 1, 1, z2 ? null : new Selection(new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m6123getStartimpl(j2)), TextRange.m6123getStartimpl(j2), 1L), new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m6118getEndimpl(j2)), TextRange.m6118getEndimpl(j2), 1L), TextRange.m6122getReversedimpl(j2)), new SelectableInfo(1L, 1, i2, i3, i4, textLayoutResult));
    }

    public static final Direction resolve2dDirection(Direction direction, Direction direction2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[direction2.ordinal()];
        if (i2 == 1) {
            return Direction.BEFORE;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return Direction.AFTER;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i3 == 1) {
            return Direction.BEFORE;
        }
        if (i3 == 2) {
            return Direction.ON;
        }
        if (i3 == 3) {
            return Direction.AFTER;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i2) {
        return isOffsetAnEmptyLine(textLayoutResult, i2) ? textLayoutResult.getParagraphDirection(i2) : textLayoutResult.getBidiRunDirection(i2);
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult textLayoutResult, int i2) {
        if (textLayoutResult.getLayoutInput().getText().length() == 0) {
            return true;
        }
        int lineForOffset = textLayoutResult.getLineForOffset(i2);
        return (i2 == 0 || lineForOffset != textLayoutResult.getLineForOffset(i2 + (-1))) && (i2 == textLayoutResult.getLayoutInput().getText().length() || lineForOffset != textLayoutResult.getLineForOffset(i2 + 1));
    }

    public static final boolean isCollapsed(Selection selection, SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        selectionLayout.forEachMiddleInfo(new Function1<SelectableInfo, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt.isCollapsed.1
            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SelectableInfo selectableInfo) {
                invoke2(selectableInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SelectableInfo selectableInfo) {
                if (selectableInfo.getInputText().length() > 0) {
                    booleanRef.element = false;
                }
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionLayoutKt$isCollapsed$1 */
    /* JADX INFO: compiled from: SelectionLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'+UO62", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SelectableInfo, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SelectableInfo selectableInfo) {
            invoke2(selectableInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SelectableInfo selectableInfo) {
            if (selectableInfo.getInputText().length() > 0) {
                booleanRef.element = false;
            }
        }
    }
}
