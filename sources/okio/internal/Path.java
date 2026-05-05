package okio.internal;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
import okio.Path;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.internal.-Path */
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!4i\bDJl|\u0004O\f8\u000bDB\u0007\"2\u0018\u007f\u0007tsA0R͜P.XV2\u000fy\b<$a)yCQU\"}(\tWNu\u0006vJ`\rK\u000f\u0014 \u0001j2M]xk\u0015\u0017˰Z\u0003MEeokD\ttd\u0011P60K\u0012\u0005/&pϻ\u0016\u000f\u0010Q_$\u0012^U\u0019:\u0001\u0019}\u000b(%\u001e@6\u007fLr.ޯ<`wkQG#1tjNUkvŨS%Qb?%v\u00103S@eA[ǭY\u001b\u0012`tW\u0003m\u0007e\u0005\u00173mǣO\fbDr\u0018\u0014C@w\r\f~lؙ\u000bik\u001aBCO\u0012gx\u000eV\u0004Aԉ\u0013T\u000f\u001c#?H\\,Bf6\u001ayπxkK^ vB.\u0007\n6E1FĒ1Q(tpy=/Me\b-\rL/G͚'sg\u001c\u0001-\u001b\u0003\u0004y1\u007fLmL\\\u001dq=\u001c\u00107è\bB\u001f>h\u0018/*\u001dV\u0017SC\f=1C\u0004\u0002v`\u0018z\u0013\u0004\u0001S\u0018g\u000fؘ(\u00071EK!\f\tP\r\u0005\u001a\\\u0005\\:3e\u001c\u0003+.\f!Ctwj6kĬTg\u0004w\fe]81Wfee\u001fo\u001cyQ^a4\u0002g\u001e\u0005jvBT\u0003϶\u000bp\u0001Pt$Z\u000b4J2vv@{\nff\fA>ou*WD1Gq[ǽ\u001b+Pf\u0015\u000buY\u0017\u001c'Ta0IǮ*\r\u001a\u000fvtv\u007fi\tIZ\u0019\u000fIUA\u007fA_Ġ[:yB%;\r\u000fu\u0010G\u0016Kus\u0015\u0016$aB\u008e\u001c2K_XU\u0013=\u000bQ20IuP\u0001\tiM@<A۠\u0012\u001aI\u0013Fg6\u0007\u0019,\u000fv\u0011֣Z/4\u0005\n\u000b%\u001ec.&\nF)S*һ\u0011ИBI\u00010qF\\f\u0015\u0005M3M\u0001\u001e.C5EM5L.wB:=a\fu6.\u0012t\u001dV\re2A\f\u0016\u001e\u0007\u0002a@JPI\b}\u0005\"<~\u0011s`j&\u0014j\tb1cLO\b\tVfbQɀ\u0016p\u0015^%p\u0005Zb\u0013\u001e1z.w4\u0002u\u0016\u0014\rBM\u0011{o.m\u000e_j֥b\u000f8\n21Eܢ\u001eݞ$\\_ł\u00192\fs&7aOp\u0007T\tR3b<^ՅEҰm\f\u0018ÿ\u0010He\u0012%3b\bIZ&T'[\rH[ݾGȚ%0\tϓ\u001f5$}C2%\u0002TZGc`\u007f\n\u001d_Ɖlˍ\u0003l-ĽTV?\"6Y!\u001fSe[I05:G\u007fԚmƴ\u0010> ӽ-D\u001e$GR1u\u0005:v\u000b\u0004ovd%\u001e\u001d\u0013%à+Ή~\u0001&>\u0010\u001c\u0019'o\u000b}qENdveBB\u0001EP_GbŴe̍\u001f1\u001e73MW{͈+0"}, d2 = {"\u000fMH,F\u0013\u001aA{", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "5dc\u000eA 8A\u007fZhAjx\u00128o\u000f$\u000bD\u000b %", "u(E", "\u0010@2\u0018F\u0013\u001aA{", "5dc\u000f4\n$A\u007fZhAjx\u00128o\u000f$\u000bD\u000b %", "\u0012NC", "5dc\u0011B\u001b|O\"\b\u0005m(\f\r9n\u000e", "\u0012NC,7\u0016-", "5dc\u0011B\u001b82\u0003m9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "!K0 ;", "5dc ?\b,6Wz\u0004g6\f\u0005>i\n1\n", "7mS2k\u0016?:\u0015\r\nL3x\u00172", "", "\u001anZ6bu)O(\u0002P", "5dc\u0016a+>f\u0003\u007faZ:\fv6a\u000e+", "uK^8\\6\b>\u0015\u000e}4o`", "AkP@[", "5dc _(LV", "uK^8\\6\b>\u0015\u000e}4oc\u00135i\nqXT\u0010\u0017\u0005V|\u0012Exz", "1n\\:b5\u001c]!\nvk,k\u0013", "=sW2e", "1n\\:b5\u001e_)z\u0002l", "", "", "1n\\:b5!O'\u0002Xh+|", "1n\\:b5\"at{\th3\r\u0018/", "1n\\:b5\"a\u0006~\u0002Z;\u0001\u001a/", "1n\\:b5\"a\u0006\t\u0005m", "1n\\:b5'O!~", "", "1n\\:b5'O!~Wr;|\u0017", "1n\\:b5']&\u0007ve0\u0012\t.", "1n\\:b5)O&~\u0004m", "1n\\:b5+S z\nb=|w9", "1n\\:b5+S'\t\u0002o,", "1gX9W", "<na:T3Bh\u0019", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "1n\\:b5+]#\u000e", "1n\\:b5,S\u001b\u0007zg;\u000b", "", "1n\\:b5,S\u001b\u0007zg;\u000beCt\u007f6", "1n\\:b5-]\u0004z\na", "1n\\:b5-]\u0007\u000e\bb5~", "1n\\:b5/] \u000f\u0003^\u0013|\u0018>e\r", "", "uK^8\\6\b>\u0015\u000e}4oc\u000e+v{q\u0003<\n\u0019`%r\nIr#DY\u000bu", ":`bAF,@[\u0019\b\nB:[\u0013>D\n7", "@n^A?,GU(\u0002", "AsP?g:0W(\u0002kh3\r\u0011/L\u007f7\u000b@\u000er FM\u0018C\u0001.", "Bn?.g/", "BnB9T:A", "", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Path {
    private static final ByteString SLASH = ByteString.Companion.encodeUtf8(RemoteSettings.FORWARD_SLASH_STRING);
    private static final ByteString BACKSLASH = ByteString.Companion.encodeUtf8("\\");
    private static final ByteString ANY_SLASH = ByteString.Companion.encodeUtf8("/\\");
    private static final ByteString DOT = ByteString.Companion.encodeUtf8(".");
    private static final ByteString DOT_DOT = ByteString.Companion.encodeUtf8("..");

    public static final int commonCompareTo(okio.Path path, okio.Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return path.getBytes$okio().compareTo(other.getBytes$okio());
    }

    public static final boolean commonEquals(okio.Path path, Object obj) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return (obj instanceof okio.Path) && Intrinsics.areEqual(((okio.Path) obj).getBytes$okio(), path.getBytes$okio());
    }

    public static final int commonHashCode(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) == path.getBytes$okio().size();
    }

    public static final String commonName(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.nameBytes().utf8();
    }

    public static final ByteString commonNameBytes(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(path);
        return indexOfLastSlash != -1 ? ByteString.substring$default(path.getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (path.volumeLetter() == null || path.getBytes$okio().size() != 2) ? path.getBytes$okio() : ByteString.EMPTY;
    }

    public static final okio.Path commonNormalized(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return okio.Path.Companion.get(path.toString(), true);
    }

    public static final okio.Path commonParent(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (Intrinsics.areEqual(path.getBytes$okio(), DOT) || Intrinsics.areEqual(path.getBytes$okio(), SLASH) || Intrinsics.areEqual(path.getBytes$okio(), BACKSLASH) || lastSegmentIsDotDot(path)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes$okio().size() == 3) {
                return null;
            }
            return new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && path.getBytes$okio().startsWith(BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || path.volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new okio.Path(DOT) : indexOfLastSlash == 0 ? new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 1, 1, null)) : new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (path.getBytes$okio().size() == 2) {
            return null;
        }
        return new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 2, 1, null));
    }

    public static final okio.Path commonRelativeTo(okio.Path path, okio.Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(path.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = path.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i2 = 0;
        while (i2 < iMin && Intrinsics.areEqual(segmentsBytes.get(i2), segmentsBytes2.get(i2))) {
            i2++;
        }
        if (i2 == iMin && path.getBytes$okio().size() == other.getBytes$okio().size()) {
            return Path.Companion.get$default(okio.Path.Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i2, segmentsBytes2.size()).indexOf(DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
        }
        if (Intrinsics.areEqual(other.getBytes$okio(), DOT)) {
            return path;
        }
        Buffer buffer = new Buffer();
        ByteString slash = getSlash(other);
        if (slash == null && (slash = getSlash(path)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i3 = i2; i3 < size; i3++) {
            buffer.write(DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i2 < size2) {
            buffer.write(segmentsBytes.get(i2));
            buffer.write(slash);
            i2++;
        }
        return toPath(buffer, false);
    }

    public static final okio.Path commonResolve(okio.Path path, String child, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(child), false), z2);
    }

    public static final okio.Path commonResolve(okio.Path path, Buffer child, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(child, false), z2);
    }

    public static final okio.Path commonResolve(okio.Path path, ByteString child, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().write(child), false), z2);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Path child, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(child)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes$okio());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(child.getBytes$okio());
        return toPath(buffer, z2);
    }

    public static final okio.Path commonRoot(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            return null;
        }
        return new okio.Path(path.getBytes$okio().substring(0, iRootLength));
    }

    public static final List<String> commonSegments(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i2 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i2, iRootLength));
                i2 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i2 < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i2, path.getBytes$okio().size()));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ByteString) it.next()).utf8());
        }
        return arrayList3;
    }

    public static final List<ByteString> commonSegmentsBytes(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i2 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i2, iRootLength));
                i2 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i2 < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i2, path.getBytes$okio().size()));
        }
        return arrayList;
    }

    public static final okio.Path commonToPath(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z2);
    }

    public static final String commonToString(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes$okio().utf8();
    }

    public static final Character commonVolumeLetter(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null) != -1 || path.getBytes$okio().size() < 2 || path.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c2 = (char) path.getBytes$okio().getByte(0);
        if (('a' > c2 || c2 >= '{') && ('A' > c2 || c2 >= '[')) {
            return null;
        }
        return Character.valueOf(c2);
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    public static final int getIndexOfLastSlash(okio.Path path) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes$okio(), BACKSLASH, 0, 2, (Object) null);
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }

    public static final ByteString getSlash(okio.Path path) {
        ByteString bytes$okio = path.getBytes$okio();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes$okio, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes$okio2 = path.getBytes$okio();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes$okio2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    public static final boolean lastSegmentIsDotDot(okio.Path path) {
        return path.getBytes$okio().endsWith(DOT_DOT) && (path.getBytes$okio().size() == 2 || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), SLASH, 0, 1) || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), BACKSLASH, 0, 1));
    }

    public static final int rootLength(okio.Path path) {
        if (path.getBytes$okio().size() == 0) {
            return -1;
        }
        if (path.getBytes$okio().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes$okio().getByte(0) == 92) {
            if (path.getBytes$okio().size() <= 2 || path.getBytes$okio().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = path.getBytes$okio().indexOf(BACKSLASH, 2);
            return iIndexOf == -1 ? path.getBytes$okio().size() : iIndexOf;
        }
        if (path.getBytes$okio().size() > 2 && path.getBytes$okio().getByte(1) == 58 && path.getBytes$okio().getByte(2) == 92) {
            char c2 = (char) path.getBytes$okio().getByte(0);
            if ('a' <= c2 && c2 < '{') {
                return 3;
            }
            if ('A' <= c2 && c2 < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
        if (!Intrinsics.areEqual(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c2 = (char) buffer.getByte(0L);
        return ('a' <= c2 && c2 < '{') || ('A' <= c2 && c2 < '[');
    }

    public static final okio.Path toPath(Buffer buffer, boolean z2) throws EOFException {
        ByteString byteString;
        ByteString byteString2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString slash = null;
        int i2 = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b2 = buffer.readByte();
            if (slash == null) {
                slash = toSlash(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && Intrinsics.areEqual(slash, byteString);
        if (z3) {
            Intrinsics.checkNotNull(slash);
            buffer2.write(slash);
            buffer2.write(slash);
        } else if (i2 > 0) {
            Intrinsics.checkNotNull(slash);
            buffer2.write(slash);
        } else {
            long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (slash == null) {
                slash = jIndexOfElement == -1 ? toSlash(okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(jIndexOfElement));
            }
            if (startsWithVolumeLetterAndColon(buffer, slash)) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z4 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (jIndexOfElement2 == -1) {
                byteString2 = buffer.readByteString();
            } else {
                byteString2 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (Intrinsics.areEqual(byteString2, byteString3)) {
                if (!z4 || !arrayList.isEmpty()) {
                    if (!z2 || (!z4 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z3 || arrayList.size() != 1) {
                        CollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(byteString2, DOT) && !Intrinsics.areEqual(byteString2, ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > 0) {
                buffer2.write(slash);
            }
            buffer2.write((ByteString) arrayList.get(i3));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new okio.Path(buffer2.readByteString());
    }

    private static final ByteString toSlash(byte b2) {
        if (b2 == 47) {
            return SLASH;
        }
        if (b2 == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b2));
    }

    public static final ByteString toSlash(String str) {
        if (Intrinsics.areEqual(str, RemoteSettings.FORWARD_SLASH_STRING)) {
            return SLASH;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
