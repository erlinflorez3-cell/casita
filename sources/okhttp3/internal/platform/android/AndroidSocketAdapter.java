package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JhP.`S2\u000fq{<$i0yّCU(\u001c*\teNogtJb\u000bQ\u0018\u000e\u0016~k2]kތ{(?2pnw2c0PIl\u00036\u001d(B&>ц\u0015\u0001H,v\u0011ͯ~CY\u000fZVNzRR;X5\u001e \u0012V / \rm\\C`ns9]13sP]?e@~]\rteU\u001d=uf;NIM\u0017;R1\u0015\u0003_M\u000fWqk\u0007/;o1W\u0007o6\u0007\u0014Z)s]\u001br\u000b&\u000b\u0019\u0002d\u001a3CO\u0012M\u0017\"x\f\t\u007f%D\"\u0014.)^-[\u001f\u0015\rdޚvɤW@X\u061c/V\u000e\u0002y>5+(5A8Ik\u007ff\u0012ύPѼ\u007f\u0005\u0015̔s\u0015|)s\\,f=\u001djv\u007f6\u007fE\u0014ʳP̆]=uՎAn\u00103\u001c0u\u0005\u0006Ɉ\u0013ѧ\u001b%?ك\n7/k\u001aPTk|ݓph\u0002k\u0001I\u0017̑pގ;*\u0011ȱʗH{"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW8\u007f$Bc\u0002\u001f\u0001I\u001f-ZM?j\"(\u0013naHbb(Y\u0006'T\"", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW8\u007f$Bc\u0002\u001f\u0001[ ,SCJG3\u001a waF\\", "Ar[ b*DS(\\\u0002Z:\u000b", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&\u001d", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "5dc\u000e_7GA\u0019\u0006z\\;|\b\u001ar\n7\u0006>\u000b\u001e", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "Adc\u000e_7G>&\t\nh*\u0007\u0010=", "Adc\u0015b:M\\\u0015\u0007z", "Adc\"f,,S'\r~h5k\r-k\u007f7\n", "1n]3\\.N`\u0019m\u0002l\f\u0010\u0018/n\u000e,\u0006I\u000f", "", "Ar[ b*DS(", "6nbAa(FS", "", ">q^Ab*HZ'", "", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "5dc X3>Q(~yI9\u0007\u00189c\n/", "7rBBc7H`(~y", "", ";`c0[,LA#|\u0001^;", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion Companion;
    private static final DeferredSocketAdapter.Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0ZeP.hS2\u000fq{<$i0yّA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0001:Nmx\f\u0018?>PvW;]sCʠptd\u000eN:h8B\u0011\u000f$BH>x+GY\u0017*0n|\u000ba\u001bN\u001d\u001a@\b̧$\u0007&ձ\u007fP<KzaƦ30"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW8\u007f$Bc\u0002\u001f\u0001I\u001f-ZM?j\"(\u0013naHbb(Y\u0006'T\u000b,6d]nF\u0018\u001ccc", "", "u(E", ">kPFC9Hd\u001d}zk\rx\u0007>o\r<", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW8\u007f$Bc\u0002\u001f\u0001L\u0016/MPHk3\f\u001ffg9\u0016?+J\u00026GY\r\rXP\u0002G!&0", "5dc\u001d_(R>&\t\fb+|\u0016\u0010a}7\u0006M\u0015", "u(;<^/Mb$LDb5\f\t<n{/EK\b\u0013&Hy\u001bD@!>X\u000b*;l_\rMD;xA\u001e\u0014Vk7\rc;*u#R[N9\u001b3n;#\u001cg\"$", "0tX9W", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW8\u007f$Bc\u0002\u001f\u0001I\u001f-ZM?j\"(\u0013naHbb(Y\u0006'T\"", "/bcBT3,A\u007fl\u0005\\2|\u0018\rl{6\n", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&\u001d", "4`RAb9R", ">`R8T.><\u0015\u0007z", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AndroidSocketAdapter build(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new AndroidSocketAdapter(superclass);
        }

        public final DeferredSocketAdapter.Factory factory(final String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public SocketAdapter create(SSLSocket sslSocket) {
                    Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                    return AndroidSocketAdapter.Companion.build(sslSocket.getClass());
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean matchesSocket(SSLSocket sslSocket) {
                    Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                    String name = sslSocket.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                    return StringsKt.startsWith$default(name, packageName + '.', false, 2, (Object) null);
                }
            };
        }

        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.playProviderFactory;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.sslSocketClass = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = sslSocketClass.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, true);
                if (str != null) {
                    this.setHostname.invoke(sslSocket, str);
                }
                this.setAlpnProtocols.invoke(sslSocket, Platform.Companion.concatLengthPrefixed(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
