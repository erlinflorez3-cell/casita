package org.koin.core.extension;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007tvA0ZeP.hS2\u000fq~<$i$yCA\\ \u00038ޛ\u007fN\u0016f/Uj\u000fQ\u000f\u001e\u0016'k߽MU\u0007_Z\u0013@P\b?a\\8]Gp\r6K1R*>ц\u0013\u00120)p\u0010%\u0003sO\u001a$H@\u001fA\u0019ҏSŋ\u001e\u0012\u0014Qh#,p\u007fPLG3nZ7)ɅwSd&\b0+U=Jb9%v\u0010%q¯=߱\u0019%a\u0016OuiT\u001b? L%n-ݐ9Z\u001cWd`0\u0018#=g\r\fyV`\u0013gx\fm<յgK^%x\n\t{%<2\u000f\\ΪJͶ1 nڜ&5zuaD!8lG\u0018\u0017q8'%.:;;+f\u007fii\u001f7C\f\u0007\u001d\u001eQ\b~#kT<hs$\u000bȭ(ĺS͘ATVˣi?s\u000e~m\u001a,\n<U\r¤\u007f)"}, d2 = {"\u001ana4\"2HW\"Hxh9|R/x\u000f(\u0005N\u0005! \u0011O!Kv.C]\b)\u001fi\u001f*OCHA", "", "-j^6a", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "uK^?ZuD]\u001d\bD\\6\n\txK\n,\u0005\u0016D\b", "5dc,^6B\\W\u0005\u0005b5v\u00079r\u007f", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//e2\u007fIV", "3wc2a:B]\"\r", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001ana4\"2HW\"Hxh9|R/x\u000f(\u0005N\u0005! \u0011U\u0018@\u007f\u0005Hh})Eq 7#", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "5dc\u0012k;>\\'\u0003\u0005g:;\u00058n\n7wO\u0005! U", "u(E", "5dc\u0012k;>\\'\u0003\u0005g:", "u(;7T=:\u001d)\u000e~eu_\u0005=hg$\u0007\u0016", "1k^@X", "", "5dc\u0012k;>\\'\u0003\u0005g", "\"", "7c", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u000b$\u0019\u0011u\u0018@\u007fn3c\u000b \u0001m)=MLIo>'^Nk=\u0010C?]v0UPX52", "5dc\u0012k;>\\'\u0003\u0005g\u0016\nq?l\u0007", "@dV6f;>`x\u0012\n^5\u000b\r9n", "3wc2a:B]\"", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bJ\u000e\u0019`My\u0012E@#?f}i7\u0001%.VQ?u=gzreBfv;N\u007f5KVW\u0002 C", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ExtensionManager {
    private final Koin _koin;
    private final HashMap<String, KoinExtension> extensions;

    public ExtensionManager(Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this.extensions = new HashMap<>();
    }

    public static /* synthetic */ void getExtensions$annotations() {
    }

    public final void close() {
        Collection<KoinExtension> collectionValues = this.extensions.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((KoinExtension) it.next()).onClose();
        }
    }

    public final /* synthetic */ <T extends KoinExtension> T getExtension(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        KoinExtension koinExtension = getExtensions().get(id);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t2 = (T) koinExtension;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(("Koin extension '" + id + "' not found.").toString());
    }

    public final /* synthetic */ <T extends KoinExtension> T getExtensionOrNull(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        KoinExtension koinExtension = getExtensions().get(id);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) koinExtension;
    }

    public final HashMap<String, KoinExtension> getExtensions() {
        return this.extensions;
    }

    public final Koin get_koin$koin_core() {
        return this._koin;
    }

    public final <T extends KoinExtension> void registerExtension(String id, T extension) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.extensions.put(id, extension);
        extension.onRegister(this._koin);
    }
}
