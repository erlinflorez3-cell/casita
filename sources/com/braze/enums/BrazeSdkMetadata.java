package com.braze.enums;

import bo.app.jh;
import com.braze.models.IPutIntoJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eRLc\u000b\u0004I\u0006>\u00176B\u0005K2ߢv\u001d߿\tA`JuJ>R\u0002ճ=j,:4]4qq<\u0004\u001a6!\u0012\u0010]mg~Nh\u000f[\u000f4\u0017ѱn.O[\u0007dZ\u001c@D\b?aN6Q˃dv<\u0007.5rJ\b\t\u0019\u001aXIFvQŒMë\u00164Hr@V\u001bRm\u001a\u0018\u0010' \u0007)EgTB1lcG\u0018#\tw+N-n\u0019|S\u001d/T-\u001e_a$=)7;(\u000eS\t\u001b;[E\u0018(qC\u001bQ'-B2s]NA\u007f\u001a.\u0014O\u0013w[&b :`\u0012C\u0014Oih9\u000e.\u0016c{\u0013[l\u000e\fG1.3;O\b\u0014U]rYc9\u0002dfhzg[\u007f%\u0006Y\u00149!\u000e:aAA77\u0002.u\u001e)+W!a\u007f\u05fedA"}, d2 = {"\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\u0005\u0016MW\u000eKr$1hyu", "", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "", "4na\u0017f6G>)\u000e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "8r^;>,R", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "\u0011n\\=T5B]\"", "0n\u001e.c7\bX\u001c", "\u000fC9\"F\u001b", "\u000fHA\u000fE\u0010\u001d5x", "\u000fO? 9\u001323\u0006", "\u0010KD\u00127\u0016-", "\u0010Q0\u001b6\u000f", "\u0011NA\u0011B\u001d\u001a", "\u0013W?\u001c", "\u0014@2!H\b%", "\u0014ND\u001fF\u0018./\u0006^", "\u0014KD!G\f+", "\u0015Q0\u0011?\f", "\u0015N>\u0014?\f", "\u0015H<\u000f4\u0013", "\u0017N=\u00166", "\u0019N2\u00154\u001d\u001a", "\u001b@=\"4\u0013", "\u001bO0\u001fG\u0010\u001c:x", "\u001cO<", "\u001c@C\u0016I\f,1\u0006beM", "\u001cT6\u0012G", "\u001eT1", " @3\u000eE", " D0\u0010G\u0015\u001aB|oZ", " D0\u0010G\u0015\u001aB|oZG\fnd\u001cCb", "!D6\u001a8\u0015-", "!H=\u0014H\u0013\u001a@", "!O<", "\"D0\u0019<\u001c&", "#MA\u00124\u0013", "#M8!L&)/vdV@\fvp\u000bN[\n[-", "#M8!L", "$HI\u000f8\f", "%D1\u00107\u0015", "&@<\u000eE\u0010'", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public enum BrazeSdkMetadata implements IPutIntoJson<String> {
    ADJUST("adj"),
    AIRBRIDGE("air"),
    APPSFLYER("apf"),
    BLUEDOT("blt"),
    BRANCH("brc"),
    CORDOVA("cdva"),
    EXPO("expo"),
    FACTUAL("fct"),
    FOURSQUARE("fsq"),
    FLUTTER("ft"),
    GRADLE("gd"),
    GOOGLE("gg"),
    GIMBAL("gmb"),
    IONIC("ionc"),
    KOCHAVA("kch"),
    MANUAL("manu"),
    MPARTICLE("mp"),
    NPM("npm"),
    NATIVESCRIPT("ns"),
    NUGET("nugt"),
    PUB("pub"),
    RADAR("rdr"),
    REACTNATIVE("rn"),
    REACTNATIVENEWARCH("rnna"),
    SEGMENT("sg"),
    SINGULAR("sng"),
    SPM("spm"),
    TEALIUM("tl"),
    UNREAL("un"),
    UNITY_PACKAGE_MANAGER("unpm"),
    UNITY("ut"),
    VIZBEE("vzb"),
    WEBCDN("wcd"),
    XAMARIN("xam");

    public static final jh Companion = new jh();
    private final String jsonKey;

    BrazeSdkMetadata(String str) {
        this.jsonKey = str;
    }

    @JvmStatic
    public static final JSONArray toJsonArray(EnumSet<BrazeSdkMetadata> set) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(set, "set");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (BrazeSdkMetadata it : set) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(it.jsonKey);
        }
        return new JSONArray((Collection) CollectionsKt.sorted(arrayList));
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.jsonKey;
    }
}
