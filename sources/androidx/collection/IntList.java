package androidx.collection;

import com.dynatrace.android.agent.Global;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":%\u007f\u0007ljA0ZeP.XY2\u000fy\u0005<řc$\bCCU0}*\tU]og\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[ze\u0012\u001d2JoE=UoKEhҚ>\u0005.=*8\u007f\r\t\u001a@H\u0018͌\u0001waÈB0noz_\u0013O\u0015\u001e \u0006V /\u001f֔kNDJ5aHA;\u0003\u0018U\u0017_mB\u0015M;Y\u0005F\u001b\u000by9;QGDC&٨\u0007\u0011XqO\tE\tM\u0007n-MCYug6\u0007\u0013B*q̄\u0013ȗq̦؛\u0005Wh\u0010-*_cYOV7\u0006\u0014\u0014\rj\u0017>\n5`F-HgNԋ3=~aZh\u0002\rU0~oQ/%.đs=)\u0003iai\u001a\u0017o\n!%\u001eQ\u0002\u001f@ih&{%,d\u0007\u007f2ҨDGNd\u001a_C\u0005\u0014rh\bP\u001c@I\u0010/*$\\,kڢa߶\"ܩȀ\u0002NLk|\u0004phah\u001bVN?\u0007\u0016e+9\u0012`Cr#\u0004P\u0003YtH[;l\u0007,\tC&bvJ?=\u0010|P\u0019\txmu%5@vF\bo«\u0012a?tC;Wz cX|:]Ld\u0015X\u0015C\u0002!!٩.Ш1ʋ3!\u0006\u001d\\N:&bE\u007f>L.G\u0018\u000b\u0014\u000fҨ\u001e\u000bE\u000b,wZ\u0017\u0011G\rAG\u001biRu9 ^p\t\u000bw\nY;+aĘ1KWK),[9x6\u0003)-\u0017\u0004\u0002WgzZz\u0002\\߶[ߡ\u001fچ֠9W7A\u0019\u000e\u000f)@\u0001u&Z\u0017}Q\u00147G|\u0003Ȫ\u001d`\u00192u.\u0003pr\u0006\u001b~]{/R\u0007o\u00032N\nѣ}kL\u0011WiZ\"k@Ox)\u0003L_H\f3 Ǫ)\u000bu8\r;3Z7\u001f\u001c}:G%cmi6S(\u000bUյzѺ\u0003ϺϦ\u0016ujUc1K8WY˽B\"2\u0017K8V\u0016\u0010\b\t.T\u000f9ǥO\n!ZFs#/D\f7u\u001b\u0018n!J$\u007f\rb/ʡ.}I\u0014$dI<!OYm\u0014\f[m\u001bYU/ν\u007f;t(,C&mgd\u000f6,\u001d(GQJ\u0011\u0006Ø\r.:BL\u000e\u0011Zdk\f\u0016!\u0018Va\u001f\u0017xg\"g\u001d՜Zݸ[Ƈޣ\u0005fMd')\u0011~\u001d3\u038b|5?26'b]{2Gx=\u000b!˂]$\u0017)9jl9aM\t5\u0019lusY\u0013F\u0013u*Թoy\u0012N(\u0003#Y(\u001d?W7w\u0007An\u001a\u001c\n͒h\u0001\u0018|bT(@\u000f|\u0003\u0014b3\u001f\r)O9\u0015\u0011U\u0013Ϝ}\u0378B\u05ce݈\u0017J1\u000b\u0012{sF)-ޅ9-Ks3\n5+oS\u0002#(\"&ٴ\u0012\u001aQ`e4~\n$@j_\u007f=zG\u0019$`/2/ؠx|\u0010D\u0018<U\u0019C\u0004\u0019d\u007f\n\b2P6YmތFUn\u000f\u001airz~W\u0011\t\rIf\u000b~<\u0017BԷ+W4)h`@(c\"^\u0017&=%(/6N\bW<\u0016ɱnԭjχ܃\r17o0`A0`\u001eݼ#y\u00041r\r6ESV{o\u0015(j\u001fZr\u001eoz7\u0013uצ-\u001e\u0003\u0015Xd\u0017*DHx$\u000bGG\u001b/[;x\u000f\u001cJهOć ܐğ?!?6\u0011n8v\u001f\u0002\u00030\u00033BB7$0\u001c:_^\u0005M+7hRn҉\u00070Q[HH\u000eC!\u0010\u00175\u0001V0Ol)J<Ǿ7K\u001f'\u0011\u001b>\u001d\u007f\t\u001f;\u0011ic':\u0001+2;g@ۮqĘrق\u008b#5\u0017s!Vv;34.\u00055@\u001aex0}\u0003dAyGYFU-(Vˑ\u0004\u0014%:4\f{:\u0010G7NPwlBfs\u00065T?|˛JťF؝\u0530s\u00104m\u001ert[o3\nH\"N\\>X^\u001d;S\u007f\u0001*\u001bU\u001dTB8ʷ\n39-\r\u0016U\tP-OxsMlnL\"\"\u0005΄6k<\u0010WF_A\u0016/\u0018Z\n\u0003zoa_>i@5SՄ}ۓQϒپ`# +QuV6jw\u0016RpAX\u000fR_^H\u0012\n\u00144FHE\u0003D߆`]\u0019A~\fAu\u0013\u001d\u0010i)\u001f\u0014=\u0006Sh\u001bKMm\nXk:{C{\u0004p5\u0014]5t/_|F%\u0011z:\\HݭB$0n\u0016\u0014K{X\u0012J~j@}2@0~\u0012\tX$Ӥ\"ٴ<յǠe\u0005:f=Zt\u001196 '`\u0010;-'\u00033/O-+&.dIAQtԿ5H\u0002\u001elO[\u0014}K\u0016\t\bb11\u0016?]Ty\u0002\u001d̵EьVáֺ\f&/(\f\u00124bu\u00122\u00120\u001b\u001bLdiqLY\u0016)fp}W3\u0003IF\ff\u00146C\f\u0011p[M;\u000e\u0001\\4v\tU\u0011\u0003{X& lzY[\bCuG~aw\u0017c]#,n\u007f]\tD\u001dW4\u0005+\u0002H]lfD\u001b7m/U\u0012,\u001byZ`\u001f\u0019Lk^%*xldL%V<v-IlU})\u0014\\b7!!NG\u0010p0D'dI\u001b\u001f\u0007\u0001Y&/\u0014e\u0005'5m5Hgy.c_5Gx\u0007\u001elqwC<\fH|ůu݇{ϯMBt9\u001cl3Nx<yuJF\tALLh;\u0006\u0004\u0018;\u001e\u001b+\u0006؞r]Xg\u0006%x{\u000f%$ goII1\u00131,j\u001dxÓ^٫mˉי%4\u0004\n%\u0011R{Ck\n\u007f\nzoq}5\u000e\"7\u0016\u0002wN\u000e4\u0016\u0012,b#}|+Ikwew5llxO\u0016\"=95\u0018$U\u0003ع8T883\u0007\u0015M(Llt\u001f=\u0019g\u001c/#\t<G4ҫy֧\\ØҡAC]a\u0005D=/\u007f\u0007\u0014O{ICG<\b\\N b{xs=\u0003\u0017hΎ.ɿ\b\u058b\u007fԾ_H\u001fܓ\u0018d:oH\u0001\u0018\u0019\"pc.Ha\u001d\u05f9+\u00ad'ݏ\u001cĜ\u001a\u0013\u001c؊Nu/+N*0pu\tS\t\u001f'mڜEڻ\u000fH)*f=L\u001e_Xfs&\u001b0\u0006\u0002ײ\u001aӔ=I\u0011BQ#i\u00138r_2\u007fH\u001a)eOϷ\u001a:5\u0002;J\u001b\u0003Ϩ]43ϫ\tZ+\u0011-ӥ\u007f6pɀ6\u0014"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "-rXGX", "5dc,f0SSWz\u0004g6\f\u0005>i\n1\n", "u(E", "1n]AX5M", "", "5dc\u0010b5MS\"\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u0016a+BQ\u0019\r", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", ":`bA<5=S,", "5dc\u0019T:M7\"}zq", "u(8", "Ahi2", "5dc \\A>", "/mh", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3kT:X5M", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "1nd;g", "3kT:X5M/(", "7mS2k", "3kT:X5M/(h\b>3\u000b\t", "2dU.h3MD\u0015\u0006\u000b^", "3pd._:", "=sW2e", "4ha@g", "4n[1", Global.BLANK, "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "/bR", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1<5=S,~y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1E0@V(", "4n[1E0@V(b\u0004],\u0010\t.", "4na\u0012T*A", "", "0k^0^", "4na\u0012T*A7\"}zq,{", "4na\u0012T*A@\u0019\u0010zk:|\b", "4na\u0012T*A@\u0019\u0010zk:|\b\u0013n~(\u000f@\u007f", "5dc", "6`b566=S", "7mS2k\u0016?", "7mS2k\u0016?4\u001d\f\tm", "7mS2k\u0016?:\u0015\r\n", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", ":`bA", ":`bA<5=S,h{", "<n]2", "@de2e:>Rt\b\u000f", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D@\u0002.FC", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class IntList {
    public int _size;
    public int[] content;

    public /* synthetic */ IntList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i2, null, 16, null);
    }

    private IntList(int i2) {
        int[] emptyIntArray;
        if (i2 == 0) {
            emptyIntArray = IntSetKt.getEmptyIntArray();
        } else {
            emptyIntArray = new int[i2];
        }
        this.content = emptyIntArray;
    }

    public final int getSize() {
        return this._size;
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, this._size);
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final int count() {
        return this._size;
    }

    public final int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final void forEach(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Integer.valueOf(iArr[i3]));
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i3]));
        }
    }

    public final void forEachReversed(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            block.invoke(Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            block.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]));
        }
    }

    public final int get(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        return this.content[i2];
    }

    public final int elementAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        return this.content[i2];
    }

    public final int elementAtOrElse(int i2, Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i2 < 0 || i2 >= this._size) {
            return defaultValue.invoke(Integer.valueOf(i2)).intValue();
        }
        return this.content[i2];
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final int last() {
        if (isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
        }
        if ((i3 + 2) - (2 | i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return intList.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(postfix);
                break;
            }
            int i5 = iArr[i4];
            if (i4 == i2) {
                sb.append(truncated);
                break;
            }
            if (i4 != 0) {
                sb.append(separator);
            }
            sb.append(i5);
            i4++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1 transform, int i3, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            }
            if ((2 & i3) != 0) {
            }
            if ((i3 + 4) - (4 | i3) != 0) {
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                i2 = -1;
            }
            if ((i3 + 16) - (i3 | 16) != 0) {
            }
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(postfix, "postfix");
            Intrinsics.checkNotNullParameter(truncated, "truncated");
            Intrinsics.checkNotNullParameter(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            int[] iArr = intList.content;
            int i4 = intList._size;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    sb.append(postfix);
                    break;
                }
                int i6 = iArr[i5];
                if (i5 == i2) {
                    sb.append(truncated);
                    break;
                }
                if (i5 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i6)));
                i5++;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(postfix);
                break;
            }
            int i5 = iArr[i4];
            if (i4 == i2) {
                sb.append(truncated);
                break;
            }
            if (i4 != 0) {
                sb.append(separator);
            }
            sb.append(transform.invoke(Integer.valueOf(i5)));
            i4++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i2 = intList._size;
            int i3 = this._size;
            if (i2 == i3) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                IntRange intRangeUntil = RangesKt.until(0, i3);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public final boolean any(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (predicate.invoke(Integer.valueOf(iArr[i3])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (predicate.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(int i2) {
        int[] iArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] == i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRangeUntil = RangesKt.until(0, elements._size);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (predicate.invoke(Integer.valueOf(iArr[i4])).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final int first(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                return i4;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R fold(R r2, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r2 = operation.invoke(r2, Integer.valueOf(iArr[i3]));
        }
        return r2;
    }

    public final <R> R foldIndexed(R r2, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            R r3 = r2;
            r2 = operation.invoke(Integer.valueOf(i3), r3, Integer.valueOf(iArr[i3]));
        }
        return r2;
    }

    public final <R> R foldRight(R r2, Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            r2 = operation.invoke(Integer.valueOf(iArr[i2]), r2);
        }
        return r2;
    }

    public final <R> R foldRightIndexed(R r2, Function3<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            r2 = operation.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), r2);
        }
        return r2;
    }

    public final int indexOf(int i2) {
        int[] iArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 == iArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (predicate.invoke(Integer.valueOf(iArr[i3])).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (predicate.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int last(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            int i3 = iArr[i2];
            if (predicate.invoke(Integer.valueOf(i3)).booleanValue()) {
                return i3;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final int lastIndexOf(int i2) {
        int[] iArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i2 = this._size;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += Integer.hashCode(iArr[i3]) * 31;
        }
        return iHashCode;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 < i3) {
                int i5 = iArr[i4];
                if (i4 == i2) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i4 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i5)));
                i4++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i4)));
                i3++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i4)));
                i3++;
            } else {
                sb.append((CharSequence) str);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Integer.valueOf(i4)));
                i3++;
            } else {
                sb.append((CharSequence) str);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append((CharSequence) str);
                }
                sb.append(transform.invoke(Integer.valueOf(i4)));
                i3++;
            } else {
                sb.append((CharSequence) str);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
