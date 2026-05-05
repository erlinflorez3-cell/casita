package okio.internal;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import okio.ZipFileSystem;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!,o\bDJk|\u0004O\r8\u000b4C\u0007\":\u001e\u007f\u0007lkA0R\bP.hS2\u000f\u0002{<řc$\u007faCU \u0003*\teNogtJb\u000bY\u000f\u000eǝ\u0001jBI]xk\u001b\u0017˰JoU3UڎE9vt>ӌ(208\u0002\u0005\u0007\u001a2H&v\u0003CQ\u0011*PN\u0002R^\u001dO\u0015\u001a@\u0019N\"\u0011\u001e\u000b{|HxvkOG)\u0013kRNUs^\u0013\u0014\r^q5$\u000fc4*nAe\u00193k\u001b\u0007\u0001Zo\u0007M\u000bU\u0005\u0017&mǢʁwWDr\u0018\"#Fg\r\f|V`\u0013mx\fU5\u0016Ҫc|\u001cE\u0010z*+l\b\u001c%?H\\@Jj\u0016.Kt!tpb\b^P\"\u0013mF\u00195\u007fa?I\u001dvQ\u0010_Gq}ަ\u001d\u0017,H\u0019nOo|\u000e\u000f;aƘ\u0010[?xX=vv2Yk\u0014Jpz.8-HG.Y$\u0011\\=U;id;!\u001a\u0001xZu#\u001drxUyRv?2p&7X\u0013\u001c\\Td3\u0016~\u0002\u001f,)_*\u0003\u001f}6'H\\&bQ)\u001e}gh\u0018~\u0014Ϊ\";=\u0017O[\u0005j<ka^a[\u0002i\u001e\u0011jx*>jvKX~Ta=r\\VJZH\u00196(\u007fR\u0001$\u0013`g8\u001cL6?Lt\u0015v-FBo#Oݠzt\u001eзl3R\u0002@ˈG֊\u0005Pdʙ\u0010s\u0007ID|\u000f!\u0004ێ$ڤ\u001d&]Ȩ\t@\u000b$\u001f~\"~\u001eш\u001fܤPl\u001e߯u\b.\u001829\u007f.\u0014Рaɒ-2\nΏeX\u0001hiM@&QۡLӛ?h6Ԗ(v~0xjxN+ϢtՑbr+Ψ\u0005\f\bf^zub+ޯ.ƏMr\u000bʛ\\ZF\u0003\u001d\u001fL$WǾtĿ9-Kگ=\"\u0006\u001bG\u0015\u0010\\@۳\u0001ԃf\u000f.۩\u0006\u0010:k.o\u0011P4Щ\u000eΒMY\u0007ЖB0z\fZH\u0019\u0002^Ⱥ[Ό\u00113PШ\u0005|dCe\u000b]|=\u0081~ޛtVcƥ3{\f@F_Xr\u001a͢fڎG%\u0019\u07bds}{zc\\9X7\n9zg/hΕ?֕Z[z\u000b6\u0015\u0002(ݦEo"}, d2 = {"\u0010HC,9\u0013\u001a5\u0013^c<\u0019ps\u001eE^", "", "\u0010HC,9\u0013\u001a5\u0013ncL\u001cgs\u0019Rn\bZ:hr\u0005-", "\u0011D=!E\b%Myba>&_h\u000bD_\u0015u.dx\u007f#^})V", "\u0011N<\u001dE\f,A|hcX\u0014\\w\u0012O^\"Z a}r6Ol", "\u0011N<\u001dE\f,A|hcX\u0014\\w\u0012O^\"i/j\u0004v&", "\u0013M3,B\r81xgiK\bc\u0003\u000eIl\bY/j\u0004\u000bA]q\u001e_\u0001$Ij\u007f", "\u0016D0\u00118\u001987wxZQ\u001b\\q\u000eE^\"j$hv\u00056Ku'", "\u0016D0\u00118\u001987wxcM\rj\u0003\u000fXn\u0015W", "\u0016D0\u00118\u001987wxoB\u0017MW)Er\u0017[)_vuASv\u001d`", "\u001aN2\u000e?&\u001f7\u007f^tA\fXg\u000fRy\u0016_\"ir\u00067\\m", "\u001b@G,M\u0010)MxgiK vd\u0018Dy\u0004h\u001ecz\b'i{ k\u0005", "", "(H?\u0003'&\u001e=v]tK\fZr\u001cDy\u0016_\"ir\u00067\\m", "(H?\u0003'&%=vZiH\u0019vv\u0013Gh\u0004j0mv", "6dg", "", "5dc\u0015X?", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "0tX9W\u0010GR\u0019\u0012", "", "\u001anZ6bu)O(\u0002P", "\u001anZ6buB\\(~\bg(\u0004R$i\u000b\b\u0005O\u000e+l", "3mc?\\,L", "", "2nb\u0011T;>B\u001d\u0007zM6\\\u00149c\u0003\u0010\u007fG\b\u001b%", "2`c2", "Bh\\2", "uH8u?1:d\u0015H\u0002Z5~R\u0016o\t*Q", "4h[2g0FS\b\tZi6z\f\u0017i\u0007/\u007fN", "4h[2g0FS", "=oT;M0I", "\u001anZ6bu3W$_~e,j\u001d=t\u007f0Q", "Hh_\u001dT;A", "4h[2F@Lb\u0019\u0007", "\u001anZ6bu\u001fW ~hr:\f\t7;", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "@dP16,Gb&z\u0002=0\n\t-t\n5\u00105\u0005\"vP~\u001bP", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "@dP186<R\u0006~xh9{", "\u001anZ6buB\\(~\bg(\u0004R\u000fo}'h@~!$FE", "@dP18?M`\u0015", "", "3wc?T\u001aBh\u0019", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@dP1?6<O azZ+|\u0016", "1d]Ae(E2\u001d\fz\\;\u0007\u0016CZ\u00043[I\u0010$+", "@dP1B9,Y\u001d\nah*x\u0010\u0012e{'{M", "@dP1M0I$g^\u0005\\+i\t-o\r'", "@dVB_(K@\u0019|\u0005k+", "AjX=?6<O azZ+|\u0016", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_NTFS_EXTRA = 10;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$openZip$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001anZ6buB\\(~\bg(\u0004R$i\u000b\b\u0005O\u000e+l", "7me<^,", "uK^8\\6\bW\"\u000ezk5x\u0010xZ\u00043[I\u0010$+\u001d3tAr61#\u0005\u001c@o_\u000bWMBk0'j"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends Lambda implements Function1<ZipEntry, Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ZipEntry it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u0003\nIي8\u000b<I\u0007Ӭ:ߚ\u0010\u0007\u0015ii4Re`.\u0001TZ\u0013y}L$\n'8KтY\u001a\u0004&"}, d2 = {"\n`]<a@F])\rS", "", "6dP1X9\"R", "", "2`c.F0SS", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C14611 extends Lambda implements Function2<Integer, Long, Unit> {
        final /* synthetic */ Ref.LongRef $compressedSize;
        final /* synthetic */ Ref.ObjectRef<Long> $ntfsCreatedAtFiletime;
        final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastAccessedAtFiletime;
        final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastModifiedAtFiletime;
        final /* synthetic */ Ref.LongRef $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ Ref.LongRef $size;
        final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

        /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u0003\nIي8\u000b<I\u0007Ӭ:ߚ\u0010\u0007\u0015ii4Re`.\u0001TZ\u0013y}L$\n'8KтY\u001a\u0004&"}, d2 = {"\n`]<a@F])\rS", "", "/sc?\\)Nb\u0019by", "", "/sc?\\)Nb\u0019l~s,", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        static final class C03521 extends Lambda implements Function2<Integer, Long, Unit> {
            final /* synthetic */ Ref.ObjectRef<Long> $ntfsCreatedAtFiletime;
            final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastAccessedAtFiletime;
            final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastModifiedAtFiletime;
            final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03521(Ref.ObjectRef<Long> objectRef, BufferedSource bufferedSource, Ref.ObjectRef<Long> objectRef2, Ref.ObjectRef<Long> objectRef3) {
                super(2);
                objectRef = objectRef;
                bufferedSource = bufferedSource;
                objectRef = objectRef2;
                objectRef = objectRef3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
                invoke(num.intValue(), l2.longValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
            public final void invoke(int i2, long j2) throws IOException {
                if (i2 == 1) {
                    if (objectRef.element != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                    objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                    objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14611(long j2, Ref.LongRef longRef, BufferedSource bufferedSource, Ref.LongRef longRef2, Ref.LongRef longRef3, Ref.ObjectRef<Long> objectRef, Ref.ObjectRef<Long> objectRef2, Ref.ObjectRef<Long> objectRef3) {
            super(2);
            j = j2;
            longRef = longRef;
            bufferedSource = bufferedSource;
            longRef = longRef2;
            longRef = longRef3;
            objectRef = objectRef;
            objectRef = objectRef2;
            objectRef = objectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
            invoke(num.intValue(), l2.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i2, long j2) throws IOException {
            if (i2 != 1) {
                if (i2 != 10) {
                    return;
                }
                if (j2 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                bufferedSource.skip(4L);
                ZipFilesKt.readExtra(bufferedSource, (int) (j2 - 4), new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt.readCentralDirectoryZipEntry.1.1
                    final /* synthetic */ Ref.ObjectRef<Long> $ntfsCreatedAtFiletime;
                    final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastAccessedAtFiletime;
                    final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastModifiedAtFiletime;
                    final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C03521(Ref.ObjectRef<Long> objectRef, BufferedSource bufferedSource, Ref.ObjectRef<Long> objectRef2, Ref.ObjectRef<Long> objectRef3) {
                        super(2);
                        objectRef = objectRef;
                        bufferedSource = bufferedSource;
                        objectRef = objectRef2;
                        objectRef = objectRef3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
                        invoke(num.intValue(), l2.longValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
                    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Long] */
                    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
                    public final void invoke(int i22, long j22) throws IOException {
                        if (i22 == 1) {
                            if (objectRef.element != null) {
                                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                            }
                            if (j22 != 24) {
                                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                            }
                            objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                            objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                            objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                        }
                    }
                });
                return;
            }
            if (booleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.element = true;
            if (j2 < j) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            Ref.LongRef longRef = longRef;
            longRef.element = longRef.element == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : longRef.element;
            Ref.LongRef longRef2 = longRef;
            longRef2.element = longRef2.element == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
            Ref.LongRef longRef3 = longRef;
            longRef3.element = longRef3.element == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u0003\nIي8\u000b<I\u0007Ӭ:ߚ\u0010\u0007\u0015ii4Re`.\u0001TZ\u0013y}L$\n'8KтY\u001a\u0004&"}, d2 = {"\n`]<a@F])\rS", "", "6dP1X9\"R", "", "2`c.F0SS", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C14621 extends Lambda implements Function2<Integer, Long, Unit> {
        final /* synthetic */ Ref.ObjectRef<Integer> $extendedCreatedAtSeconds;
        final /* synthetic */ Ref.ObjectRef<Integer> $extendedLastAccessedAtSeconds;
        final /* synthetic */ Ref.ObjectRef<Integer> $extendedLastModifiedAtSeconds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14621(Ref.ObjectRef<Integer> objectRef, Ref.ObjectRef<Integer> objectRef2, Ref.ObjectRef<Integer> objectRef3) {
            super(2);
            objectRef = objectRef;
            objectRef = objectRef2;
            objectRef = objectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
            invoke(num.intValue(), l2.longValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Integer] */
        public final void invoke(int i2, long j2) throws IOException {
            if (i2 == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                if (j2 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b2 = bufferedSource.readByte();
                boolean z2 = (1 & b2) == 1;
                boolean z3 = (b2 & 2) == 2;
                boolean z4 = (-1) - (((-1) - b2) | ((-1) - 4)) == 4;
                BufferedSource bufferedSource = bufferedSource;
                long j3 = z2 ? 5L : 1L;
                if (z3) {
                    j3 += 4;
                }
                if (z4) {
                    j3 += 4;
                }
                if (j2 < j3) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z2) {
                    objectRef.element = Integer.valueOf(bufferedSource.readIntLe());
                }
                if (z3) {
                    objectRef.element = Integer.valueOf(bufferedSource.readIntLe());
                }
                if (z4) {
                    objectRef.element = Integer.valueOf(bufferedSource.readIntLe());
                }
            }
        }
    }

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null);
        Map<Path, ZipEntry> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (ZipEntry zipEntry : CollectionsKt.sortedWith(list, new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt.compareValues(((ZipEntry) t2).getCanonicalPath(), ((ZipEntry) t3).getCanonicalPath());
            }
        })) {
            if (mapMutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = mapMutableMapOf.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        mapMutableMapOf.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return mapMutableMapOf;
    }

    public static final Long dosDateTimeToEpochMillis(int i2, int i3) {
        if (i3 == -1) {
            return null;
        }
        int i4 = i2 >> 9;
        int i5 = i2 >> 5;
        int i6 = (i5 + 15) - (i5 | 15);
        int i7 = i3 >> 11;
        int i8 = (i7 + 31) - (i7 | 31);
        int i9 = i3 >> 5;
        return Long.valueOf(_ZlibJvmKt.datePartsToEpochMillis(((i4 + 127) - (i4 | 127)) + 1980, i6, (-1) - (((-1) - i2) | ((-1) - 31)), i8, (i9 + 63) - (i9 | 63), ((-1) - (((-1) - i3) | ((-1) - 31))) << 1));
    }

    public static final long filetimeToEpochMillis(long j2) {
        return (j2 / ((long) 10000)) - 11644473600000L;
    }

    private static final String getHex(int i2) {
        StringBuilder sb = new StringBuilder("0x");
        String string = Integer.toString(i2, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return sb.append(string).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0048, code lost:
    
        r9 = readEocdRecord(r13);
        r11 = r13.readUtf8(r9.getCommentByteCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0063, code lost:
    
        r13.close();
        r4 = r4 - ((long) 20);
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x006d, code lost:
    
        if (r4 <= r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x006f, code lost:
    
        r3 = okio.Okio.buffer(r6.source(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0079, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0083, code lost:
    
        if (r4.readIntLe() != okio.internal.ZipFilesKt.ZIP64_LOCATOR_SIGNATURE) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0085, code lost:
    
        r13 = r4.readIntLe();
        r0 = r4.readLongLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0092, code lost:
    
        if (r4.readIntLe() != 1) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0094, code lost:
    
        if (r13 != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0096, code lost:
    
        r4 = okio.Okio.buffer(r6.source(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00a0, code lost:
    
        r0 = r4;
        r13 = r0.readIntLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00aa, code lost:
    
        if (r13 != okio.internal.ZipFilesKt.ZIP64_EOCD_RECORD_SIGNATURE) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00ac, code lost:
    
        r9 = readZip64EocdRecord(r0, r9);
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00b2, code lost:
    
        if (r4 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00b4, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00b7, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00e3, code lost:
    
        throw new java.io.IOException("bad zip: expected " + getHex(okio.internal.ZipFilesKt.ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00e4, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00e5, code lost:
    
        if (r4 != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00e7, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00eb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00ec, code lost:
    
        kotlin.ExceptionsKt.addSuppressed(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00ef, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00f1, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00f2, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00f5, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00fd, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00fe, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0100, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0102, code lost:
    
        if (r3 != null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0104, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0107, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0109, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x010a, code lost:
    
        if (r3 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x010c, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0110, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0111, code lost:
    
        kotlin.ExceptionsKt.addSuppressed(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0114, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0116, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0117, code lost:
    
        if (r1 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x011a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x011b, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x011d, code lost:
    
        r3 = new java.util.ArrayList();
        r4 = okio.Okio.buffer(r6.source(r9.getCentralDirectoryOffset()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0132, code lost:
    
        r5 = r4;
        r19 = r9.getEntryCount();
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x013f, code lost:
    
        r1 = readCentralDirectoryZipEntry(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x014d, code lost:
    
        if (r1.getOffset() < r9.getCentralDirectoryOffset()) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0159, code lost:
    
        if (r20.invoke(r1).booleanValue() != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x015b, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0161, code lost:
    
        r17 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x016d, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x016e, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0170, code lost:
    
        if (r4 != null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0172, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0176, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0177, code lost:
    
        if (r4 != null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0179, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x017d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x017e, code lost:
    
        kotlin.ExceptionsKt.addSuppressed(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0182, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0183, code lost:
    
        r1 = r2;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0185, code lost:
    
        if (r1 == 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0188, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0189, code lost:
    
        r2 = r2;
        r0 = new okio.ZipFileSystem(r18, r19, buildIndex(r3), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0194, code lost:
    
        if (r7 != null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0196, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0199, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x011a A[Catch: all -> 0x01be, TRY_ENTER, TryCatch #12 {all -> 0x01be, blocks: (B:132:0x001d, B:134:0x002e, B:135:0x0037, B:142:0x0063, B:144:0x006f, B:185:0x011a, B:186:0x011b, B:180:0x0111, B:187:0x011d, B:211:0x0188, B:212:0x0189, B:206:0x017e, B:139:0x0056, B:216:0x019a, B:217:0x01a1, B:219:0x01a3, B:220:0x01a6, B:221:0x01a7, B:222:0x01bd, B:178:0x010c, B:136:0x003f, B:138:0x0048, B:188:0x0132, B:191:0x013f, B:193:0x014f, B:195:0x015b, B:196:0x0161, B:197:0x0166, B:198:0x016d, B:199:0x016e, B:145:0x0079, B:147:0x0085, B:150:0x0096, B:168:0x00f5, B:171:0x00fe, B:163:0x00ec, B:169:0x00f6, B:170:0x00fd, B:172:0x0100, B:151:0x00a0, B:153:0x00ac, B:157:0x00b9, B:158:0x00e3, B:161:0x00e7, B:204:0x0179), top: B:251:0x001d, inners: #0, #3, #6, #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x011b A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:132:0x001d, B:134:0x002e, B:135:0x0037, B:142:0x0063, B:144:0x006f, B:185:0x011a, B:186:0x011b, B:180:0x0111, B:187:0x011d, B:211:0x0188, B:212:0x0189, B:206:0x017e, B:139:0x0056, B:216:0x019a, B:217:0x01a1, B:219:0x01a3, B:220:0x01a6, B:221:0x01a7, B:222:0x01bd, B:178:0x010c, B:136:0x003f, B:138:0x0048, B:188:0x0132, B:191:0x013f, B:193:0x014f, B:195:0x015b, B:196:0x0161, B:197:0x0166, B:198:0x016d, B:199:0x016e, B:145:0x0079, B:147:0x0085, B:150:0x0096, B:168:0x00f5, B:171:0x00fe, B:163:0x00ec, B:169:0x00f6, B:170:0x00fd, B:172:0x0100, B:151:0x00a0, B:153:0x00ac, B:157:0x00b9, B:158:0x00e3, B:161:0x00e7, B:204:0x0179), top: B:251:0x001d, inners: #0, #3, #6, #9, #11 }] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final okio.ZipFileSystem openZip(okio.Path r18, okio.FileSystem r19, kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ZipFilesKt.openZip(okio.Path, okio.FileSystem, kotlin.jvm.functions.Function1):okio.ZipFileSystem");
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, Function1 function1, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        return openZip(path, fileSystem, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ZipEntry readCentralDirectoryZipEntry(BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i2 = (-1) - (((-1) - shortLe) | ((-1) - 65535));
        if ((shortLe + 1) - (shortLe | 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i2));
        }
        short shortLe2 = bufferedSource.readShortLe();
        int i3 = (shortLe2 + 65535) - (shortLe2 | 65535);
        short shortLe3 = bufferedSource.readShortLe();
        int i4 = (shortLe3 + 65535) - (shortLe3 | 65535);
        short shortLe4 = bufferedSource.readShortLe();
        int i5 = (shortLe4 + 65535) - (shortLe4 | 65535);
        long intLe2 = bufferedSource.readIntLe();
        long j2 = (intLe2 + MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) - (intLe2 | MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = (-1) - (((-1) - ((long) bufferedSource.readIntLe())) | ((-1) - MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE));
        int shortLe5 = (-1) - (((-1) - bufferedSource.readShortLe()) | ((-1) - 65535));
        short shortLe6 = bufferedSource.readShortLe();
        int i6 = (shortLe6 + 65535) - (shortLe6 | 65535);
        int shortLe7 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        Ref.LongRef longRef3 = new Ref.LongRef();
        long intLe3 = bufferedSource.readIntLe();
        longRef3.element = (intLe3 + MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) - (intLe3 | MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE);
        String utf8 = bufferedSource.readUtf8(shortLe5);
        if (StringsKt.contains$default((CharSequence) utf8, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j3 = longRef2.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (longRef.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j3 += (long) 8;
        }
        if (longRef3.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j3 += (long) 8;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        readExtra(bufferedSource, i6, new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt.readCentralDirectoryZipEntry.1
            final /* synthetic */ Ref.LongRef $compressedSize;
            final /* synthetic */ Ref.ObjectRef<Long> $ntfsCreatedAtFiletime;
            final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastAccessedAtFiletime;
            final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastModifiedAtFiletime;
            final /* synthetic */ Ref.LongRef $offset;
            final /* synthetic */ long $requiredZip64ExtraSize;
            final /* synthetic */ Ref.LongRef $size;
            final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

            /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u0003\nIي8\u000b<I\u0007Ӭ:ߚ\u0010\u0007\u0015ii4Re`.\u0001TZ\u0013y}L$\n'8KтY\u001a\u0004&"}, d2 = {"\n`]<a@F])\rS", "", "/sc?\\)Nb\u0019by", "", "/sc?\\)Nb\u0019l~s,", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
            static final class C03521 extends Lambda implements Function2<Integer, Long, Unit> {
                final /* synthetic */ Ref.ObjectRef<Long> $ntfsCreatedAtFiletime;
                final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastAccessedAtFiletime;
                final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastModifiedAtFiletime;
                final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03521(Ref.ObjectRef<Long> objectRef, BufferedSource bufferedSource, Ref.ObjectRef<Long> objectRef2, Ref.ObjectRef<Long> objectRef3) {
                    super(2);
                    objectRef = objectRef;
                    bufferedSource = bufferedSource;
                    objectRef = objectRef2;
                    objectRef = objectRef3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
                    invoke(num.intValue(), l2.longValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
                /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Long] */
                /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
                public final void invoke(int i22, long j22) throws IOException {
                    if (i22 == 1) {
                        if (objectRef.element != null) {
                            throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        }
                        if (j22 != 24) {
                            throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        }
                        objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                        objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                        objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14611(long j32, Ref.LongRef longRef22, BufferedSource bufferedSource2, Ref.LongRef longRef4, Ref.LongRef longRef32, Ref.ObjectRef<Long> objectRef4, Ref.ObjectRef<Long> objectRef22, Ref.ObjectRef<Long> objectRef32) {
                super(2);
                j = j32;
                longRef = longRef22;
                bufferedSource = bufferedSource2;
                longRef = longRef4;
                longRef = longRef32;
                objectRef = objectRef4;
                objectRef = objectRef22;
                objectRef = objectRef32;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
                invoke(num.intValue(), l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i22, long j22) throws IOException {
                if (i22 != 1) {
                    if (i22 != 10) {
                        return;
                    }
                    if (j22 < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    bufferedSource.skip(4L);
                    ZipFilesKt.readExtra(bufferedSource, (int) (j22 - 4), new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt.readCentralDirectoryZipEntry.1.1
                        final /* synthetic */ Ref.ObjectRef<Long> $ntfsCreatedAtFiletime;
                        final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastAccessedAtFiletime;
                        final /* synthetic */ Ref.ObjectRef<Long> $ntfsLastModifiedAtFiletime;
                        final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C03521(Ref.ObjectRef<Long> objectRef4, BufferedSource bufferedSource2, Ref.ObjectRef<Long> objectRef22, Ref.ObjectRef<Long> objectRef32) {
                            super(2);
                            objectRef = objectRef4;
                            bufferedSource = bufferedSource2;
                            objectRef = objectRef22;
                            objectRef = objectRef32;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
                            invoke(num.intValue(), l2.longValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
                        public final void invoke(int i222, long j222) throws IOException {
                            if (i222 == 1) {
                                if (objectRef.element != null) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                }
                                if (j222 != 24) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                }
                                objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                                objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                                objectRef.element = Long.valueOf(bufferedSource.readLongLe());
                            }
                        }
                    });
                    return;
                }
                if (booleanRef.element) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                booleanRef.element = true;
                if (j22 < j) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                Ref.LongRef longRef4 = longRef;
                longRef4.element = longRef4.element == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : longRef.element;
                Ref.LongRef longRef22 = longRef;
                longRef22.element = longRef22.element == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
                Ref.LongRef longRef32 = longRef;
                longRef32.element = longRef32.element == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
            }
        });
        if (j32 <= 0 || booleanRef.element) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null).resolve(utf8), StringsKt.endsWith$default(utf8, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null), bufferedSource2.readUtf8(shortLe7), j2, longRef4.element, longRef22.element, i3, longRef32.element, i5, i4, (Long) objectRef4.element, (Long) objectRef22.element, (Long) objectRef32.element, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        short shortLe = bufferedSource.readShortLe();
        int i2 = (shortLe + 65535) - (shortLe | 65535);
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (-1) - (((-1) - bufferedSource.readShortLe()) | ((-1) - 65535)) || i2 != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & 65535);
    }

    public static final void readExtra(BufferedSource bufferedSource, int i2, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j2 = i2;
        while (j2 != 0) {
            if (j2 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            short shortLe = bufferedSource.readShortLe();
            int i3 = (shortLe + 65535) - (shortLe | 65535);
            long shortLe2 = (-1) - (((-1) - ((long) bufferedSource.readShortLe())) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX));
            long j3 = j2 - ((long) 4);
            if (j3 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            function2.invoke(Integer.valueOf(i3), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + i3);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j2 = j3 - shortLe2;
        }
    }

    public static final ZipEntry readLocalHeader(BufferedSource bufferedSource, ZipEntry centralDirectoryZipEntry) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        ZipEntry orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, centralDirectoryZipEntry);
        Intrinsics.checkNotNull(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ZipEntry readOrSkipLocalHeader(BufferedSource bufferedSource, ZipEntry zipEntry) throws IOException {
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i2 = (-1) - (((-1) - shortLe) | ((-1) - 65535));
        if ((shortLe + 1) - (shortLe | 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i2));
        }
        bufferedSource.skip(18L);
        long shortLe2 = bufferedSource.readShortLe();
        long j2 = (shortLe2 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (shortLe2 | WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int shortLe3 = (-1) - (((-1) - bufferedSource.readShortLe()) | ((-1) - 65535));
        bufferedSource.skip(j2);
        if (zipEntry == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        readExtra(bufferedSource, shortLe3, new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt.readOrSkipLocalHeader.1
            final /* synthetic */ Ref.ObjectRef<Integer> $extendedCreatedAtSeconds;
            final /* synthetic */ Ref.ObjectRef<Integer> $extendedLastAccessedAtSeconds;
            final /* synthetic */ Ref.ObjectRef<Integer> $extendedLastModifiedAtSeconds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14621(Ref.ObjectRef<Integer> objectRef4, Ref.ObjectRef<Integer> objectRef22, Ref.ObjectRef<Integer> objectRef32) {
                super(2);
                objectRef = objectRef4;
                objectRef = objectRef22;
                objectRef = objectRef32;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l2) throws IOException {
                invoke(num.intValue(), l2.longValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Integer] */
            public final void invoke(int i22, long j22) throws IOException {
                if (i22 == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                    if (j22 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte b2 = bufferedSource.readByte();
                    boolean z2 = (1 & b2) == 1;
                    boolean z3 = (b2 & 2) == 2;
                    boolean z4 = (-1) - (((-1) - b2) | ((-1) - 4)) == 4;
                    BufferedSource bufferedSource2 = bufferedSource;
                    long j3 = z2 ? 5L : 1L;
                    if (z3) {
                        j3 += 4;
                    }
                    if (z4) {
                        j3 += 4;
                    }
                    if (j22 < j3) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z2) {
                        objectRef.element = Integer.valueOf(bufferedSource2.readIntLe());
                    }
                    if (z3) {
                        objectRef.element = Integer.valueOf(bufferedSource.readIntLe());
                    }
                    if (z4) {
                        objectRef.element = Integer.valueOf(bufferedSource.readIntLe());
                    }
                }
            }
        });
        return zipEntry.copy$okio((Integer) objectRef4.element, (Integer) objectRef22.element, (Integer) objectRef32.element);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
