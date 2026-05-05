package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: TextFieldBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u0010s{J$c$wECU0}*\tUQog|Sb\u000bI\u000f\u000e\u0016\u0007p4I[ye\u0012%2JoE4UoKDht<\u0010(20B\u0002\u0005\u0007\u001f2H\u001ev\u0003CQ\u001f\u001a0N|BR\u0013Q\u000b\u001f(ßn$/\u001dEg-6\u0001k0z^)ɅyF\\(w0+O\u001dNZ'\u001byy A?e9%+Y\u0003\u0015Ws?1A\u0002E\u000bh5-CK\nVd_ÿ\u0018\u00159WUo\u0001St\t\u007f_t'\nO\u0014O^<@w)+SPL\"\u0014T`2[\u0019O\bl3%xaph\u0004tA.\u001c(J_I\u000e`C=Ie:a\u001a\u0019~=\n5% 9\u007f\u001dB\fX\u001c\u0012-\u001b\u0003\u0011\u00025_rUH|# Q6\b~\u0016\u001a*2Q\u0010\f=0).ETg_GX9k0a\rm\u0005;xh\u0002!\u0019H\t@|NO*7C\u000bHr>\u0004P\u0003q\\\u0015[Vl\u0007,!C$j3T!S)\u0015O1ux\nu\nSf\u0017;g$\u0004\u000e\u0006R'?C\u000f{\u0010\u0010\n'\u0018Mqz\u0005\u0007\u007f\u000bo\u001a\u0019t(Pixn\u001e)\u0014D|%C6M$44ZJI`#x\u001b\u001epbE@m\u0019\u0001\u0010-\fc(\u0011\u001b<t7\u001a\u0001`~\"\u007fxwE-d0]YQc:V[(hB<;\u0007-\r0MmLU\r\u0005\u0016$nB\u008dک\u001e9Wp\u00061\u001dAA20duP\u0001\u001biM@@+\u0001\bRSh\\}8n~pxjxe\u001b\u0017j\u000fl8;\b\u00137*eTA_c\u0003(\">ЭqÅʾ@P>D\u0013If)\u000f8:|cd\f:+_\u0010\u0014]L\u0012aw:Fy\u00110l۩Ф\b,ia8h_*J;f\u0017 \u0013\u0007H2;\u001bBvl(\u000eH\tB4KHo\u0002!^>M\u0019~\u0016h\u001d+;\u000e\u001dܪȞ\u0012̊ϻ80ez\u0002\u0015N\"lL=\u0013cR\u0016qDйh\u05c8N\u000f\u0012ΚL=|\u001c4=Na.Ņ\u000bޘ\ns ܽ\u0012Mp\u0011T\tR8b|^ՄEҰm\n(|\u0006Sm\u001dgJP\u0003SV<d/!-ި\u0007ޝIj1,\u0007\u0010\u001dE6z;D\u0013\u0002\u0017c=xJ\u0001\u00023?`˥S\u0003~'1YbPk7f\u0019#E\f\\\u007fF\u0530\bKAoq\n\u001aSh\u000b+H0\u001dOP?fMѭ`κYdVІG'tnf\"W\u001c1A˓;߽݀\n\u0018۽vsz/Rl\u0006V\u0014)\u000f7\\)5-3(̍\u001f1\u001e73_W\u000ed9\n\\k;,\nvê)ؗx'dަ&h\u0010\u0002)_f\u001a$\n\u001a\tAmP\b<p\rr8K>z\u000eF\nÿ\u001fɾXŕץ ?Ӳ/v\u001eDQ\u0011\u0007)\u0004ni\u0018c5Sz?\u0002\u0012n[msԗ3Ն-߾ζY9ñW\"`\u0011\u000e@ݾ&(>\u000bhЌ,}bppqnܩ\u0011~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\"", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "7mXA\\(E1\u001cz\u0004`,\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA/J\u007f)G;[(ZXrJi", "=qX4\\5:Z\nz\u0002n,", "=eU@X;&O$\n~g.Z\u00056c\u0010/wO\u000b$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PM-O\u0005'V4J7gV{?q\u000ea\f^2\t\u0014cNy", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\nQr45LZ<\\[p=ixV\u0017M8\u0017\tXTmlN?*\u0012:IK<r\u0011\u0015\u0015\nDnzK \u001fG\r$?E2sVh)}PPEo3`\u0013)z_6C&\u0014`&\u0017fV.\u0017Q:\r{Q\u0007qkF,D6.FxeTE9VF\u00050\u001eG\u000b{\u001c;\"\u0004+\b<M83At\u0014\u0015V\u0018QmY\u0019,c@\u0005)2I\u0001?Wsuu<\u000e>\u0006]\u0011\ro?5\u0018x/aR\u0017\u0012g%[~bi\u0011@Q\u0002MMy\u001epU~UjC\u0019\u0012\u00124|/ML*T\u000e#lKkI\u0012\u0004\u0011f'\u0004*!H]\u0018j\b[>K#\u0010dG\u0016\t/\u0007\u0006", "0`R8\\5@1\u001cz\u0004`,k\u0016+c\u0006(\t", "0tU3X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PN([\u0006+CS0(g/\u0003>\u0015\u0012gc", "1gP;Z,-`\u0015|\u0001^9", "5dc\u0010[(GU\u0019m\bZ*\u0003\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju,y#PNN\u001biNpC\u0014\u001f0", "1gP;Z,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\u000b,/X[t=z\u0016h\u001d$", "5dc\u0010[(GU\u0019\r9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc\u0010[(GU\u0019\r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j++\u0007(HL[j:UnF\u0016\u0012A\u0012\\:b", "6`b X3>Q(\u0003\u0005g", "", "u(I", ":d]4g/", "", "5dc\u0019X5@b\u001c", "u(8", "=qX4\\5:Z\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc\u001ce0@W\"z\u0002L,\u0004\t-t\u00042\u0005\b\u007fj\u0001\u0013wm\u001c", "u(9", "=qX4\\5:Z\b~\u000em", "", "5dc\u001ce0@W\"z\u0002M,\u0010\u0018", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "5dc\u001ce0@W\"z\u0002O(\u0004\u0019/$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j+,y#T:N8lR{;\u0014g", "D`[BX", "Ad[2V;B]\"", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[", "Adc X3>Q(\u0003\u0005gsL\u001e--\u000f\u000fN", "uI\u0018#", "Ad[2V;B]\"b\u0004</x\u0016=", "\u0018", "/o_2a+", "1gP?", "", "BdgA", "AsP?g", "3mS", "/r25T9,S%\u000fzg*|", "1gP?4;", "7mS2k", "1kT.e\nAO\"\u0001zE0\u000b\u0018", "", "=mC2k;0W \u0006Xa(\u0006\u000b/", "@d_9T*>A(z\bm", "@d_9T*>3\"}", "<df\u0019X5@b\u001c", ">kP0X\nN`'\t\b:-\f\t<C\u0003$\t\u001c\u0010", ">kP0X\nN`'\t\b;,}\u0013<e]+wM\\&", "@d_9T*>", "BdgAF;:`(", "BdgA85=", "@d_9T*>\u0012\u001a\t\u000bg+x\u00183o\t\"\t@\b\u0017\u0013Uo", "@d`B\\9>D\u0015\u0006~]\u0010\u0006\b/x", "AsP?g\fQQ \u000f\tb=|", "3mS\u0012k*Ec'\u0003\f^", "@d`B\\9>D\u0015\u0006~]\u0019x\u00121e", "@`]4X", "@d`B\\9>D\u0015\u0006~]\u0019x\u00121eGw\u0011>H&}\u001a", "@de2e;\u001aZ \\}Z5~\t=", "Adc!X?M7\u001a\\}Z5~\t.", "<df!X?M", "Adc!X?M7\u001a\\}Z5~\t.$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "BnBAe0GU", "", "BnC2k;\u001fW\u0019\u0006y</x\u0016\u001de\f8{I~\u0017", "1n\\=b:Bb\u001d\t\u0004", "BnC2k;\u001fW\u0019\u0006y</x\u0016\u001de\f8{I~\u0017^Wn\u001d\r\f\u0015%\u0018~*Gv\u0015*\\GEt.+\u0015oa5\u0015c", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhj\u001c@o\u0016\u0004\u0011*7t3+\u001fl`LPa6V\u00021UL\u0018-fb{<\u0010!^\u0018Wt\u001c\u0005lPmrMB/\u0017u8\u0002Nwa\u0010\u0016\u00154Hs>c}G\u0006%uJ'h\u001c", "\u0011gP;Z,%W'\u000e", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;
    private ChangeTracker backingChangeTracker;
    private final PartialGapBuffer buffer;
    private final OffsetMappingCalculator offsetMappingCalculator;
    private final TextFieldCharSequence originalValue;
    private long selectionInChars;

    /* JADX INFO: compiled from: TextFieldBuffer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\"B\u0012\u007f\u0007ln?\u0016Z͜x.\u0001Rr*y\u007fL$\n)\"GI[2}P\n\u0016r̭fñѳY\nß\u0013\b\u001c\u007fx4\u0012p\u0007f*\u000f`G CAS\b=ga;ZՅ\u001f݅ƫ7xڱ\u0005\u001c0R\u001e~KSY\f*0nq\u0011Ō\u000f̂\t\u001e*\bD\"\u000f!תfNȧH{e:5B\u000blHęC\u000e/\u0005O\u0013e\u0003&̂zlԝ/?"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\u000b,/X[t=z\u0016h\u001d$", "", "1gP;Z,\u001c])\b\n", "", "5dc\u0010[(GU\u0019\\\u0005n5\f", "u(8", "5dc\u001ce0@W\"z\u0002K(\u0006\u000b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "1gP;Z,\"\\\u0018~\u000e", "5dc\u001ce0@W\"z\u0002K(\u0006\u000b/-G-\u000f\u0012ew%", "uH\u0018\u0017", "5dc\u001fT5@S", "5dc\u001fT5@S`F\u007fq}ai=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ChangeList {
        int getChangeCount();

        /* JADX INFO: renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo1443getOriginalRangejx7JFs(int i2);

        /* JADX INFO: renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo1444getRangejx7JFs(int i2);
    }

    public static /* synthetic */ void getChanges$annotations() {
    }

    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.m1446getSelectiond9O1mEE();
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldCharSequence, (i2 + 2) - (2 | i2) != 0 ? null : changeTracker, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i2 + 8) - (i2 | 8) != 0 ? null : offsetMappingCalculator);
    }

    public final TextFieldCharSequence getOriginalValue$foundation_release() {
        return this.originalValue;
    }

    private final ChangeTracker getChangeTracker() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1439getOriginalSelectiond9O1mEE() {
        return this.originalValue.m1446getSelectiond9O1mEE();
    }

    public final ChangeList getChanges() {
        return getChangeTracker();
    }

    public final boolean hasSelection() {
        return !TextRange.m6117getCollapsedimpl(m1440getSelectiond9O1mEE());
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1440getSelectiond9O1mEE() {
        return this.selectionInChars;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1441setSelection5zctL8(long j2) {
        m1437requireValidRange5zctL8(j2);
        this.selectionInChars = j2;
    }

    public final void replace(int i2, int i3, CharSequence charSequence) {
        replace$foundation_release(i2, i3, charSequence, 0, charSequence.length());
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i2, int i3, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            i4 = 0;
        }
        if ((i6 & 16) != 0) {
            i5 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i2, i3, charSequence, i4, i5);
    }

    public final void replace$foundation_release(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("Expected start=" + i2 + " <= end=" + i3).toString());
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(("Expected textStart=" + i4 + " <= textEnd=" + i5).toString());
        }
        onTextWillChange(i2, i3, i5 - i4);
        this.buffer.replace(i2, i3, charSequence, i4, i5);
    }

    public final void setTextIfChanged$foundation_release(CharSequence charSequence) {
        int i2;
        int i3;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = charSequence.length();
        boolean z2 = false;
        if (partialGapBuffer.length() <= 0 || charSequence.length() <= 0) {
            i2 = 0;
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
            boolean z3 = false;
            while (true) {
                if (!z2) {
                    if (partialGapBuffer.charAt(i2) == charSequence.charAt(i3)) {
                        i2++;
                        i3++;
                    } else {
                        z2 = true;
                    }
                }
                if (!z3) {
                    if (partialGapBuffer.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z3 = true;
                    }
                }
                if (i2 >= length || i3 >= length2 || (z2 && z3)) {
                    break;
                }
            }
        }
        if (i2 < length || i3 < length2) {
            replace$foundation_release(i2, length, charSequence, i3, length2);
        }
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), charSequence.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i2, int i3) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), i3 - i2);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence.subSequence(i2, i3), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c2) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c2), 0, 0, 24, null);
        return this;
    }

    private final void onTextWillChange(int i2, int i3, int i4) {
        int i5;
        getChangeTracker().trackChange(i2, i3, i4);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.recordEditOperation(i2, i3, i4);
        }
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int iM6121getMinimpl = TextRange.m6121getMinimpl(m1440getSelectiond9O1mEE());
        int iM6120getMaximpl = TextRange.m6120getMaximpl(m1440getSelectiond9O1mEE());
        if (iM6120getMaximpl < iMin) {
            return;
        }
        if (iM6121getMinimpl <= iMin && iMax <= iM6120getMaximpl) {
            i5 = i4 - (iMax - iMin);
            if (iM6121getMinimpl == iM6120getMaximpl) {
                iM6121getMinimpl += i5;
            }
            iMin = iM6120getMaximpl + i5;
        } else if (iM6121getMinimpl > iMin && iM6120getMaximpl < iMax) {
            iMin += i4;
            iM6121getMinimpl = iMin;
        } else if (iM6121getMinimpl >= iMax) {
            i5 = i4 - (iMax - iMin);
            iM6121getMinimpl += i5;
            iMin = iM6120getMaximpl + i5;
        } else if (iMin < iM6121getMinimpl) {
            iM6121getMinimpl = iMin + i4;
            i5 = i4 - (iMax - iMin);
            iMin = iM6120getMaximpl + i5;
        }
        this.selectionInChars = TextRangeKt.TextRange(iM6121getMinimpl, iMin);
    }

    public final char charAt(int i2) {
        return this.buffer.charAt(i2);
    }

    public String toString() {
        return this.buffer.toString();
    }

    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    private final void clearChangeList() {
        getChangeTracker().clearChanges();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m1441setSelection5zctL8(this.originalValue.m1446getSelectiond9O1mEE());
        clearChangeList();
    }

    public final void placeCursorBeforeCharAt(int i2) {
        requireValidIndex(i2, true, false);
        this.selectionInChars = TextRangeKt.TextRange(i2);
    }

    public final void placeCursorAfterCharAt(int i2) {
        requireValidIndex(i2, false, true);
        this.selectionInChars = TextRangeKt.TextRange(RangesKt.coerceAtMost(i2 + 1, getLength()));
    }

    /* JADX INFO: renamed from: toTextFieldCharSequence-udt6zUU$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1438toTextFieldCharSequenceudt6zUU$foundation_release$default(TextFieldBuffer textFieldBuffer, long j2, TextRange textRange, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = textFieldBuffer.m1440getSelectiond9O1mEE();
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            textRange = null;
        }
        return textFieldBuffer.m1442toTextFieldCharSequenceudt6zUU$foundation_release(j2, textRange);
    }

    /* JADX INFO: renamed from: toTextFieldCharSequence-udt6zUU$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m1442toTextFieldCharSequenceudt6zUU$foundation_release(long j2, TextRange textRange) {
        return new TextFieldCharSequence(this.buffer.toString(), j2, textRange, null, 8, null);
    }

    private final void requireValidIndex(int i2, boolean z2, boolean z3) {
        int i3 = z2 ? 0 : -1;
        int length = z3 ? getLength() : getLength() + 1;
        if (i3 > i2 || i2 >= length) {
            throw new IllegalArgumentException(("Expected " + i2 + " to be in [" + i3 + ", " + length + ')').toString());
        }
    }

    /* JADX INFO: renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m1437requireValidRange5zctL8(long j2) {
        long jTextRange = TextRangeKt.TextRange(0, getLength());
        if (!TextRange.m6113contains5zctL8(jTextRange, j2)) {
            throw new IllegalArgumentException(("Expected " + ((Object) TextRange.m6126toStringimpl(j2)) + " to be in " + ((Object) TextRange.m6126toStringimpl(jTextRange))).toString());
        }
    }
}
