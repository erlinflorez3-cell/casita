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
/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":$\u007f\u0007ljA0ZeP.XY2\u000fy\u0005<řc$\bCCU(\u0003*\teNogtYb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00154JoM3UoCChtD\u0011(݅*8\b\u0010\t\u001a0P\u0018v\u0011CSÈ\u0018dV\u0081jR;LE'\u0018\bN$\u000f\u001etg|7Ղp]H1k\u0007wTf'\u000eCE\u0006\u001bXl';\n\u0012=9TOP%6c\u00125hÜC\rE\tM\u000bn?7-Oy}Oh\u0002$\u0015Yb;r9̭b՝PӠϲ'1WgQO\u001e(\u0006yD\u001cJ\u001e&\u0006U[^1(\u007f \u000ea\u000b9Ԧ@\u0019\u000el]\u0018z\u0010IG)\u000eOC9IƘ\u001aeI6f7*\u0006UV1\u001e\u0007!\nU>\u007f#/l\u0013aBaOk^ݳ\u000ecC\u0005\u0014vh\u001a:\u00066M&H\f\u0013>\u0017SJ\nNiܰqʮGֳϜv\u000bhlYhbHN!7$EH!\f\tZ\u0015\u000bqObwD\u0011{\u001d\u001d>\f(+ \u000b\u000el'+\u000f\\n\u0001i\u0019N\u000e)3P~Ri\u007f{\u001d\u0006:ӷ7?Wz gX\u000f$ABh+wvDc\f\trV7xʒpߑvӻ\r_\u001a5J? /d2?<t\u0017^\u0002LA\bҨ\t(^v4\u0017Ta:K\"2\u0019!\u0001~r!\u000fu\raG\rq2<ogڤ\u001d0[9x:\u0003;\u0017\u0001y\u0006m\u0001\\I\\lD\t\u0004\u0011fڍ ÑPǽˎ\u0013\u0015\u0007-8\u0001=EZq.2[7?zC /=n֫u.\u001bt:\b\u0003J\u0016zGV\u0005\u0007\u000bS\u0018u\u0010\t(lیKmZ\"kDO\u000b\u0013[BT^'\u00150.4/\u0006ݕ\u0001?3Z7#\u001c\u0010$1\u001bg\u0004\u0003\u007f0\nbUL#\u000fJЁiޗn̥Ж]8C<OX\u000f>0$к\u0007BV\u0016@}P5L\rynafvމFs;3\f\u000e\u001f,S\u0017\u0007%H;\bCD?o9\"D\u0382\u0018hI<!SY\u007f}oQb1i\u001f\u001b\u001b\u000bw\u0015݁ G&mgh\u000fH\u0016u\u001e<ger\u0016L\u0018RJʙ@\u0012\u0011Zdo\f(\u000b\u0002Le50BD\u0004;\u001d4\u0003&#ƎNЬ_ѤǺ!0\t\u0003\u00152.xC1ܭqFb],\u0013\u000f\u00035\ta\u0011o\u0001lއ9j\u0005=)Op\u0001Qk\u000ewW*N4W:}z\u001e\"է\u001c\u0007#Y(!?i!a|6\u0005$eu^s=8؉VX(@\u000f\u0001\u0003&L\f\u0015\u0011?y\u0003qr-\u0013t&`\nו\u0007ԸC͈ܐ\f\u0003kJ!,\u00165;=ƹn\u00145' II.  fM$v'Ƹe4\u0017\u000ekBR\u00168<\u0013K\u0017;he\u0014?Z\u0004!\u000bڷ\f@U\u0019C\b\u0019vim}'fF;}\u0016Qy~ǰ\u000emrz~[\u0011\u001bv3\\\u007f\u0015F`.\u00196\u0014T \\d@(c&^)\u0010\u0016\u001b,E`\u0018d9\u0010\u0016\n\u0017\u001e2ώaķ*Ԛշ*g94X\u001d\u000e\u001f\buą.T6C\u0004\u000f[o|\t\u000b\u001frv\u001c\u0012\u0003Ct\u0006\u001c8B\u0013۫Lh\u0017*DLx6t1=\u001fEt\u001dIp\u00072ww;gܗX\u0381\u001aΠֻ\u000bu0z\u0017\u0002Jb\u0003~r\u0010\u0017'\u0018gZ_v\tKM?\n4~t\u0012TLԺ<L\u000eC!\u0014\u0017Gj:&D\u00039,LaBo/֩\u0005\u001f>\u001d\u007f\r\u001fMzSY+P\u001a\r\u0003\u001d?(c\u001ac:ىxޅ.ݩ\u0378\u001b]n?+4uL5\u000bJ\u001eX4ec\u0005A\u0012KWh]9\nfP\u000f85\u009d(\u0010{:\u0010K7`:abF|\rg\u00066*d!r8\u000eؤ~\u07be\t\u07bfʙ\u0018yl_g3Qz\"\u0018\r\f8c\u0005\u0007s\u007f\u0019.\u0019w%u$H\u001f\u0015W4ٽ\u0001\u001aU\tP1O\u000b]1bcb2\u0004\u0015JA\u0010L̹KJ_A\u00163\u0018lslpswx :\"\r;6&Z\u0019ϙ\u0006Ҽ\u001cȁôK|N:bw]Ap\n\t 2\u0016FB:!6\u001c4G%!\u0016J\u000f\u0016YЫG<GUJn{O\u001eWom\u00123!\u0003GmV\"\\KRK\u000b\u001c`!ms\u0017\u001dUOL\u0015J#\u0014\u0003F>XfMH@Ө\n\u0018K{X\u0016J\u0011T*s6VI`\u0001jC\f\u0014J4\u0004ռ\u001bؠ}ƮĒ7al\u001516gn`Tke\u0007=\u001b\u0010o\u001aC*,gQM3\u0005\u001d@l\u0012ţ`S[\u0014}O\u0016\u001bqL'5,X?C[l\u0005xm.\u001eè\u0005Ʉ\u001fΔՄ\u0006\u0019,fm\u0012y\u000e0^KPD\u0013AHylYjP('z#\u001fvDF\u0014\u001e=4P\u0013\";;m\u0001D.\u001fJwUp{8(\bf#\u001b}K1u'\u0002Iq?%\u007fe\u001an_!p>EXVF\u0019\u0002(b>a*\no5_(q,\u0003s\u0003 A_:k>%\u0012r\u0015&niD<V/1f}?KWJb\u0017$\tHoQ\u0013r2'D\r\u0003\u0019/\u0002{g\u001d\u0014E\n\u000f#\u0016tj4g$a$=SZ\b\u001ej\u0010\u000e%}m3dN\u001eACϷ\u000bĸȇLp\u0013\u0015H\u0004\u001aEz~h\b4-\t=\u001e\b\u0016>&'\r\u0016<}\u0002hަy)x{\u000f)$2QY?MG,\u0013\u001bL\b``\u0007\u00105ːbŅ-ߖݣ\u001f\u0018J\u007f;kQs\n2 }]|u\u001eW~\u001a{.&\u0004\u00122y\u0013']3z\u0011\fA\u00160\u0015$TYo\u0015:A78 07\u0013XCxHؗ'\u000b\u0015M(Pl\u0007\t'\u000fk2H\u0005w\u001e2\u001cQ\"{$ß:Þ<φҾ~K53w\u0007[I{}sM\u001c\u0015.:}\f4\n,Sb\u0019J\u0007\u001e\u0005g։2ԛ2ְ#ܶ\fh<ĆJ}M\u0007\"o\u001cD(`~n\u001b}\u0007ݍNùlǫ حBy1ʁP'ehu\u0005\f\u0019~&OQsnAԅ\u0011܃d6V\u0014\u0015Sfr^+\u0010\u0012cdH\u0017o٘xݍO\u0019s\u0006mq_18Wy8G\n&\u0017lbס9=%uVoCvϫ\bToǂ'sW\u000bwȱbu\\ъ$|"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~t@\u00054\u000b", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "-rXGX", "5dc,f0SSWz\u0004g6\f\u0005>i\n1\n", "u(E", "1n]AX5M", "", "5dc\u0010b5MS\"\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u0016a+BQ\u0019\r", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", ":`bA<5=S,", "5dc\u0019T:M7\"}zq", "u(8", "Ahi2", "5dc \\A>", "/mh", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3kT:X5M", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "1nd;g", "3kT:X5M/(", "7mS2k", "3kT:X5M/(h\b>3\u000b\t", "2dU.h3MD\u0015\u0006\u000b^", "3pd._:", "=sW2e", "4ha@g", "4n[1", Global.BLANK, "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "/bR", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1<5=S,~y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1E0@V(", "4n[1E0@V(b\u0004],\u0010\t.", "4na\u0012T*A", "", "0k^0^", "4na\u0012T*A7\"}zq,{", "4na\u0012T*A@\u0019\u0010zk:|\b", "4na\u0012T*A@\u0019\u0010zk:|\b\u0013n~(\u000f@\u007f", "5dc", "6`b566=S", "7mS2k\u0016?", "7mS2k\u0016?4\u001d\f\tm", "7mS2k\u0016?:\u0015\r\n", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", ":`bA", ":`bA<5=S,h{", "<n]2", "@de2e:>Rt\b\u000f", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u0007;{%\u0004", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class FloatList {
    public int _size;
    public float[] content;

    public /* synthetic */ FloatList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    private FloatList(int i2) {
        float[] emptyFloatArray;
        if (i2 == 0) {
            emptyFloatArray = FloatSetKt.getEmptyFloatArray();
        } else {
            emptyFloatArray = new float[i2];
        }
        this.content = emptyFloatArray;
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

    public final float first() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.content[0];
    }

    public final void forEach(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Float.valueOf(fArr[i3]));
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i3]));
        }
    }

    public final void forEachReversed(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            block.invoke(Float.valueOf(fArr[i2]));
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            block.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]));
        }
    }

    public final float get(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        return this.content[i2];
    }

    public final float elementAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        return this.content[i2];
    }

    public final float elementAtOrElse(int i2, Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i2 < 0 || i2 >= this._size) {
            return defaultValue.invoke(Integer.valueOf(i2)).floatValue();
        }
        return this.content[i2];
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final float last() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((i3 + 2) - (2 | i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i2 = -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
        }
        return floatList.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(postfix);
                break;
            }
            float f2 = fArr[i4];
            if (i4 == i2) {
                sb.append(truncated);
                break;
            }
            if (i4 != 0) {
                sb.append(separator);
            }
            sb.append(f2);
            i4++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1 transform, int i3, Object obj) {
        if (obj == null) {
            if ((1 & i3) != 0) {
            }
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            }
            if ((8 & i3) != 0) {
                i2 = -1;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            }
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(postfix, "postfix");
            Intrinsics.checkNotNullParameter(truncated, "truncated");
            Intrinsics.checkNotNullParameter(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            float[] fArr = floatList.content;
            int i4 = floatList._size;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    sb.append(postfix);
                    break;
                }
                float f2 = fArr[i5];
                if (i5 == i2) {
                    sb.append(truncated);
                    break;
                }
                if (i5 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Float.valueOf(f2)));
                i5++;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(postfix);
                break;
            }
            float f2 = fArr[i4];
            if (i4 == i2) {
                sb.append(truncated);
                break;
            }
            if (i4 != 0) {
                sb.append(separator);
            }
            sb.append(transform.invoke(Float.valueOf(f2)));
            i4++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FloatList) {
            FloatList floatList = (FloatList) obj;
            int i2 = floatList._size;
            int i3 = this._size;
            if (i2 == i3) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                IntRange intRangeUntil = RangesKt.until(0, i3);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (fArr[first] == fArr2[first]) {
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

    public final boolean any(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (predicate.invoke(Float.valueOf(fArr[i3])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (predicate.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(float f2) {
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (fArr[i3] == f2) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(FloatList elements) {
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

    public final int count(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (predicate.invoke(Float.valueOf(fArr[i4])).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final float first(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return f2;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final <R> R fold(R r2, Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r2 = operation.invoke(r2, Float.valueOf(fArr[i3]));
        }
        return r2;
    }

    public final <R> R foldIndexed(R r2, Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            R r3 = r2;
            r2 = operation.invoke(Integer.valueOf(i3), r3, Float.valueOf(fArr[i3]));
        }
        return r2;
    }

    public final <R> R foldRight(R r2, Function2<? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            r2 = operation.invoke(Float.valueOf(fArr[i2]), r2);
        }
        return r2;
    }

    public final <R> R foldRightIndexed(R r2, Function3<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            r2 = operation.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]), r2);
        }
        return r2;
    }

    public final int indexOf(float f2) {
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (f2 == fArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (predicate.invoke(Float.valueOf(fArr[i3])).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (predicate.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final float last(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            float f2 = fArr[i2];
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return f2;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final int lastIndexOf(float f2) {
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (fArr[i2] == f2) {
                return i2;
            }
        }
        return -1;
    }

    public int hashCode() {
        float[] fArr = this.content;
        int i2 = this._size;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += Float.hashCode(fArr[i3]) * 31;
        }
        return iHashCode;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 < i3) {
                float f2 = fArr[i4];
                if (i4 == i2) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i4 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f2)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f2 = fArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f2)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f2 = fArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f2)));
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

    public final String joinToString(CharSequence separator, Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f2 = fArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f2)));
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

    public final String joinToString(Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f2 = fArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) str);
                    break;
                }
                if (i3 != 0) {
                    sb.append((CharSequence) str);
                }
                sb.append(transform.invoke(Float.valueOf(f2)));
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
