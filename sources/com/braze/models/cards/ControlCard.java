package com.braze.models.cards;

import bo.app.h00;
import bo.app.h1;
import bo.app.m00;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u0003\u0010I\u00066\u000b6B\u0015\"4\u0012}\tnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNogtL`\u0010YƤ6\u0016'il\u0001e|k\u001b'2pwO7[zU9\u000f~F\u000b.?::\u0010\u0004/&:R\u001e\u0006\u0013I[\f\u00181Voh`\u001dS\u0013+*\bT\u001f/.֔kP<Zzp\u0003<1\u0004\u0002B|'&DƊQ\u000fLU5\u000fGy,/X7c\u0018[gYޮTÜC\rGsC\tv,?-Oye=ނ\u0004("}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%y\u0017K\u0004/<7y-6C", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?o+\"GE", "1`a1G@IS", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?o+\"GE", "5dc\u0010T9=B-\nz", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqY<\u000e\u0016\u0006[z\u000e\u0012", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "8r^;B)CS\u0017\u000e", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?f\u0017+\u0006Z\u001bF\b)4Y\u000bu", "1`a1>,Ra\u0004\f\u0005o0{\t<", "\u001aa^{T7I\u001d\u001cIE4", ";`].Z,K", "\u001ab^:\")KO.~Dl;\u0007\u0016+g\u007fq_\u001e|$\u00165~\u0018Ir'5D\u000b*Hq\u0015.Z\u0019", "1`a1F;H`\u0015\u0001zI9\u0007\u001a3d\u007f5", "\u001aa^{T7I\u001d!IE4", "1`a145:Z-\u000e~\\:g\u00169v\u0004'{M", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW9\u0004!JYG @}\u001e<\u0017!7x3\u0004\u0015| $\u0014m=Ru'T\"5)f\u001cnH\u001f[]X\u0019\u0001s\u0003cImkQ34\buW\u0011Eu|\u000e\u0016W\u0019HlOU}V\u0004\"qC)SScp}FAR8\u0011a\u0016)\u0019gE\u0004,^<n^Y", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class ControlCard extends Card {
    private final CardType cardType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlCard(JSONObject jsonObject, CardKey.Provider cardKeysProvider, h00 h00Var, ICardStorageProvider<?> iCardStorageProvider, m00 m00Var) {
        super(jsonObject, cardKeysProvider, h00Var, iCardStorageProvider, m00Var);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeysProvider, "cardKeysProvider");
        this.cardType = CardType.CONTROL;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return h1.a(new StringBuilder("ControlCard{"), super.toString(), AbstractJsonLexerKt.END_OBJ);
    }
}
