package androidx.collection;

import com.dynatrace.android.agent.Global;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005%4\u0012\u0006\u0016nj?1Le^.ZS0\u0015s{B-cҕyCQU\"}8\tWNmhvJh)K\u000f\f\u0019\u0001j:c]xc!\u00172XoG3SpE9vt>\u0005&4*8\b\u0005\t\u001a0S\u0018v\tOSÈ\u001a0N{BR\u0013V\r\u001a(\u0006FĨ\u0007Rrɡv8NǍk9_#1i\u0003[-a@\u0001[\u000e^TU\u000fțe\u001e9C\u007f9#9k\u00035g$w\u0011S\n=3}WF9_\frFi\u0010#Kۀ̠\u0011gx>l\u000bWy\u001c)1U\ne`\u00108w)\u0011;SJ\u0601\fТG͓Ʃ\u001al\u0010\u00129s\u0003SNOJjP\u001b\u0013gF\u00195\u007fiٿg7-u*O'kO{3\"N'\u000f\t9[\u000bו'ڄ\u001bƻ{Q?o\tOVm\"Yk\u00034zp\"B\n@I\u0010/2߾\\ϏmNiX;!\u001a\u0017xNu\u0017\u001dfxUyR~ؗPvގ;*\u0017-#Vr$\u0004P\u0003m\\\u001b[<l\r\u000e\n# \u0013ɼjCm\"\\n\u0001i\u0019b\u000e\u00143O~=ip{\u000e\u000eު\rO}Uq3yR%\u0016\btp(pfpU<yj>:MX{ \u00072ͩ«\u0010\u001d8W\u0002\":EA\u001bb\u001bn\u001d.DQ|7t\t\u007fVоZו#Ѱǰ$z\u0011\u0005V[\u0001ouw\u0012?\u000b\u0005:-wٛe\u001f,T0\u000eL|Q\tҋw\u007fU\u000e\u0015\u0004Z\u0014.u\fݨP\u001c 8_TU\u0013=\u0001YQ\u0010U]g\u0003va\\@)ϸ\u0001\u0004\u0015Sx4m!zr2f\u0011o_V'\"-ܥ!:N۴\u0006ّ`¿یKcb4$OW\u001d\u001bYjch\u0003\u0013J6'\u0017nP|{ԝCo&$$,/K˕ԃmo<'+L4!}\u0004bϣF\u000fpguMKIYh5Жѐ(v\tZXp}!R\u000b:\u0013YbQf\u0001Vfb9FD\u058c\r֦\fߞ¦[@\u001bs\u00043>_8rʸ\u0002\u0014lqm\u001f[\u0003\u007fo\u0004J\u0013֥\u0011\u0601\u0010ν\u007f1|?d|.\u0006od\u001f/<\u058cHUOQz L\u001a4Cbфޭ\u000fMZ\u0002\u0016\u0016\u0001\u0019Va\u0015\u001dX\\\u0004=f\u000e\u0003\u000e\u000bm\u000fκfӝ_ԠƤ\u0001\u0005\u00177$wE1\u0013lܑX/q`I4+93j\u00160\u0007'1CbjK,f3#E$ty6D7_Y}|\u007f\u001b~IԠ!L\u001e3IW\u0017x\u00072d\u0011{\u001a^u\u0007!\u001dŚƬ&3\u0005\u0013\r\u0014B#\u001f\r\u001fU\u0019\nr/\\N>hqNGӆJρ\u0006љŴcL#1\f4==Wj͂+{e\n\u0004s\u0016W8'J&A^]\rt;\u000e\u001fHH\n\u0016)39\\^S\u001csZ\u0006\u0003\u0019\\\n˩S\f9\u001a#d_\u0005\b#F-Q\u0012\u0016S[w?;ʋpmtm\u001b\tlJf{t3vR\u00198]=I̽ŷ>\u001bY8h\u0017\u0006-%(%<.|9\u0012_c/\"\u001a\b\"Å1֓jˋԠ16Z\"\u0004\u001e\nu\u0012*ķ,\u0015I\u0010\u0016\u001frCtl\t\t.`p'r&<-\"/\u0017H%BChT&6\u0015?H).\u0012ƬӴd\u0011\n]Y,'JbA!=X%\u007f9\u0007 IkŪx\n0Z\u0019x\u0006\u0001</LZcO7[4m+4T\u007f\fжH߃+ֶÃ\u00115b<&=l\u001a*;Ǿ7A'GI\u000bFA\b\u0007_f\u000bSY$82-\u0005\u001bq\u001212k$\u0001\u0001VGT\u007f,gui'̂iV-$\u0012kP\u0018]e\\\u0015\bQYFU-0\u07baˑ\u0004\u0014%<4\f{<\u0010G7NPylQf\u0003\u001e5ڲ.@t\\3Mr\u0012\u0004\f2o>)t]q4\b,BQ\u000bò0ͮk؋ŸMn\u0002\u000fJ\fU\u0014E\u000fҋ-3%6X\b\u007f|CI!\u000b_{kz+\u000f\u0014KBpl̖üDc0\u001e=\u0018Z|zlsW\u0006*H\u0014\u001d\r25_i'ڂfï\u0017ñ֒vL>`~LQb\u0019?WqlmZ\f9CFbVU\u001a.Zq%\"aIضEQ\u0018n\f'#*k'\f+\u000e\u0010WPe\u0001\u000f\u05edٝ7\u0015sbh;ku\u0015W'Q\u000bE%\u0002z+\\\u0005\u0005r`ߴ^Ȓ\rȊļH\u0016L|J'}0>/\u00197h\u0004u\u0001J\\mt#$\u0017MrHksGҵŮ[xXm33~\u001b\u0013\u0012G\u001f9%.UI2Q1;H\u0005ϗ\u000eؘHʐޱmO\u0018\u0007gI1/\u0014>w\u000fY.nemV\bs\rJ8W4\u0017#3\u0011iѸm\u0018(w\u0013R<o9JQ_7\fR{\u001f\n+ޛ˻\u0010B[\u001eM\f\u0017{,7AefF>r\u0019G}(*^,ݜl܇XƲҚ+{!B7p!c]^\\\u0005_\u001fp>MϪVF\u0019\u0001(B>a*Joܭ\u0017Ƭgmx\u001a\u001df\u001f\u001dLk^f@\u0007/uL(V<vnIj]\u00183QzϾŞdpV\u0007X\u001bzr?6vlI \u000fay2$HT\u0006Yׇˋ>,g:cc+`Z\b\u0014p\b\u0012%}m3d\"\u001eCC϶\u000bĸȇÛl\u000bU4\nj?2TY\tT;\"?m\u0017\nZ-\u001a\u0013\u001dG~db`,صʒh\t)6*G]RW#\u0019\t?V\u00184]X)\u0004\u0007skӳ\u0002ߙ\u001eˉ܃{;tEyzCW\u007fN|a,q\u0016i&5Uo M{JQd23\u001f(FM&R\nB_A\u0010V:)RUE-\bHB\u0019J\"QN?<\u001eJt>\u0011%73<5zu\u001c\u0003\u0006>\"h\u000em:AK'u~sz_\u0006\u000eKW@\u00179W\u0010Y\u0016pÔ\\o\u0006[k\",15\u0007J6X|n/Z\u0017.Ïӆ8kH)\u0010@\">c.Pʼ\u0017\u000ez\rh| N&\u001cJ؊٥w3)X5ef\u0001\u0010=\u000fvCQaGt\u000br&VwxӃ\u0018߃GږЯ\u000e!\n\tQc*\u0016GDߡDK#\nLxq&:gvmX3\u0018\u0012.6S־¡=\r\u0002\u0016'Cu4!W9\r]Ӌ\u0016ȲwȺ6Gk\bhni]&L|K\u0007֊q&zD\u000f\u0012\u0003(O$8ȇՀ&'I})m\u000bO|=cny~\u000b ~[\n<^\u0015LÑ\u0019֬\u001eֶ̹$\u000e\bxa3_u\u000f?\u07b5\u0017\f(qv\f\"[}L3JRy?\u0017kpG@(~lX\u001d(528\u001aNєߜp\u001du-8(I,\u0007\u001ds\u000f66Y'\u0019-\u007f\f)1xԊ&\u070f\u000fзԄ\u0013hf{\u0006 Y0>rQSZF\u0016.\u0019;1\f/&]uT]-ylݢfԥ|͏GҡfbLυk*J\u001c\u001c$oJ29$v@\u001flj\u0014n%R\u0011\u001a\u0017Κ-κ/զA٢'\t.\u0001\u000f\u00133_1\u001dL_&Vr\u001a~v~OH«tʃm\u0001 3#\u0011\u0014Y6B*HayOmjӶ\"ƅf\u0018<g\u0012\u001dZa})DqT\"g>Q9Ե\u0003\u001b)Bp\b\u0012@ر\u0010qbٟ17Qbbν\\\r(֠oT"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d#z3D/", "\u0013", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "-rXGX", "5dc,f0SSWz\u0004g6\f\u0005>i\n1\n", "u(E", "1n]AX5M", "", "5dc\u0010b5MS\"\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u0016a+BQ\u0019\r", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", ":`bA<5=S,", "5dc\u0019T:M7\"}zq", "u(8", "Ahi2", "5dc \\A>", "/mh", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3kT:X5M", "/r;6f;", "", "1n]AT0Ga", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "", "1nd;g", "3kT:X5M/(", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "3kT:X5M/(h\b>3\u000b\t", "2dU.h3MD\u0015\u0006\u000b^", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "3pd._:", "=sW2e", "4ha@g", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "4ha@g\u0016K<)\u0006\u0002", "4n[1", Global.BLANK, "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "/bR", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1<5=S,~y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1E0@V(", "4n[1E0@V(b\u0004],\u0010\t.", "4na\u0012T*A", "", "0k^0^", "4na\u0012T*A7\"}zq,{", "4na\u0012T*A@\u0019\u0010zk:|\b", "4na\u0012T*A@\u0019\u0010zk:|\b\u0013n~(\u000f@\u007f", "5dc", "6`b566=S", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7mS2k\u0016?4\u001d\f\tm", "7mS2k\u0016?:\u0015\r\n", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", ":`bA", ":`bA<5=S,h{", ":`bAB9'c \u0006", "<n]2", "@de2e:>Rt\b\u000f", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    public /* synthetic */ ObjectList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public abstract List<E> asList();

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i2, null, null, 48, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i2, truncated, null, 32, null);
    }

    private ObjectList(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = ObjectListKt.EmptyArray;
        } else {
            objArr = new Object[i2];
        }
        this.content = objArr;
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

    public final boolean contains(E e2) {
        return indexOf(e2) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e2 : elements) {
            if (!contains(e2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!contains(elements.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final void forEach(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(objArr[i3]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Integer.valueOf(i3), objArr[i3]);
        }
    }

    public final void forEachReversed(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            block.invoke(objArr[i2]);
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            block.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final E get(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        return (E) this.content[i2];
    }

    public final E elementAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        return (E) this.content[i2];
    }

    public final E elementAtOrElse(int i2, Function1<? super Integer, ? extends E> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i2 < 0 || i2 >= this._size) {
            return defaultValue.invoke(Integer.valueOf(i2));
        }
        return (E) this.content[i2];
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((1 & i3) != 0) {
        }
        if ((i3 + 2) - (2 | i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((8 & i3) != 0) {
            i2 = -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            function1 = null;
        }
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4, function1);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1<? super E, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(postfix);
                break;
            }
            Object obj = objArr[i4];
            if (i4 == i2) {
                sb.append(truncated);
                break;
            }
            if (i4 != 0) {
                sb.append(separator);
            }
            if (function1 == null) {
                sb.append(obj);
            } else {
                sb.append(function1.invoke(obj));
            }
            i4++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i2 = objectList._size;
            int i3 = this._size;
            if (i2 == i3) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                IntRange intRangeUntil = RangesKt.until(0, i3);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (Intrinsics.areEqual(objArr[first], objArr2[first])) {
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

    /* JADX INFO: renamed from: androidx.collection.ObjectList$toString$1 */
    /* JADX INFO: compiled from: ObjectList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,t\bDJe\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "3kT:X5M", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~7\u0001\u001cD[\u0016:]CDi4s"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<E, CharSequence> {
        final /* synthetic */ ObjectList<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ObjectList<E> objectList) {
            super(1);
            this.this$0 = objectList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(E e2) {
            return e2 == this.this$0 ? "(this)" : String.valueOf(e2);
        }
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new Function1<E, CharSequence>(this) { // from class: androidx.collection.ObjectList.toString.1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ObjectList<E> this) {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(E e2) {
                return e2 == this.this$0 ? "(this)" : String.valueOf(e2);
            }
        }, 25, null);
    }

    public final boolean any(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (predicate.invoke(objArr[i3]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (predicate.invoke(objArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (!contains(objArr[i3])) {
                return false;
            }
        }
        return true;
    }

    public final int count(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (predicate.invoke(objArr[i4]).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    public final E first(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            ?? r1 = (Object) objArr[i3];
            if (predicate.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            ?? r1 = (Object) objArr[i3];
            if (predicate.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        return null;
    }

    public final <R> R fold(R r2, Function2<? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r2 = operation.invoke(r2, objArr[i3]);
        }
        return r2;
    }

    public final <R> R foldIndexed(R r2, Function3<? super Integer, ? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, objArr[i3]);
        }
        return r2;
    }

    public final <R> R foldRight(R r2, Function2<? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            r2 = operation.invoke(objArr[i2], r2);
        }
        return r2;
    }

    public final <R> R foldRightIndexed(R r2, Function3<? super Integer, ? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            r2 = operation.invoke(Integer.valueOf(i2), objArr[i2], r2);
        }
        return r2;
    }

    public final int indexOf(E e2) {
        int i2 = 0;
        if (e2 == null) {
            Object[] objArr = this.content;
            int i3 = this._size;
            while (i2 < i3) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i4 = this._size;
        while (i2 < i4) {
            if (e2.equals(objArr2[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (predicate.invoke(objArr[i3]).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (predicate.invoke(objArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    public final E last(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            ?? r1 = (Object) objArr[i2];
            if (predicate.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    public final E lastOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            ?? r1 = (Object) objArr[i2];
            if (predicate.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        return null;
    }

    public final int lastIndexOf(E e2) {
        if (e2 == null) {
            Object[] objArr = this.content;
            for (int i2 = this._size - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i3 = this._size - 1; -1 < i3; i3--) {
                if (e2.equals(objArr2[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i2 = this._size;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }
}
