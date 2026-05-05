package okhttp3.internal.platform;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0ReP\u008cZS@\u000fs{:$c$\u007fOC٥\"}0'WN}gvJ`\rYƤ$*)jZH\u000exp&OeRsM3eok:pxD\u000782P9\n\t\u000f\u001dBH>w\u000bKY\u0010*4Pp@S;R\u0015\" \fV$\u0011\u001ebh|;Ղp]H6k\u0011wJf'\u000e9-Q\u001bPl';\u0002(2sfEA-%\u0002\f7ViI\u001b? H5n54CK\nVdf0\u001e#:g\u0013mt6\\3b\u000f\u001cm?\u0018sYb&*\u000ey*\u001bl\b\u001c\u0010?H\\8`zX\u001eAx\u000bWPP\b_p\u0005Qʫ8а)\u007f;ٿ\n'tSy;GO\u000eީ\u0007ڟ\"#\t͙qgb\u000ex\u0015IUNΆ3ҨD=PݐZeKp\u001cp\u0011\u0003\u0001ʹ2Ͻ\u0004/\u0004߾~'3=s=3!q\u0003vI>ϻ\u0007¾lSqɭ͛D7"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW!u+\bK\u0002/:R\u0016=\\W\u0018u>-\u007fo]H\bm9VL", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW'}!DZ\b-?C", ">tc\u001aX;A]\u0018", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "5dc\u001aX;A]\u0018", "@d\\<i,&S(\u0002\u0005]", "1kX2a;)`#\u0010~],\nf6a\u000e6", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "AdaCX9)`#\u0010~],\nf6a\u000e6", "uKY.i(\bZ\u0015\b|(9|\n6e}7E(\u0001&\u001aQnc#{!FUG'3v\u0018wZC<r4\u001c$2I9\u0016f6ML\u000eLH_(&YnF\u0016[g\u000eO2\r\u0003h\u000b\fnS:)\u0007\u00020\u00077y|U\u001d\n>l: ]\fU\bj\\F%yB#fuPC\u000f@1`\u001amr +", "/ec2e\u000f:\\\u0018\r}Z2|", "", "Ar[ b*DS(", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&\u001d", "1n]3\\.N`\u0019m\u0002l\f\u0010\u0018/n\u000e,\u0006I\u000f", "6nbAa(FS", "", ">q^Ab*HZ'", "", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "5dc X3>Q(~yI9\u0007\u00189c\n/", "\u000fk_;C9Hd\u001d}zk", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O$8\u000b<N\u0007\"2\u0017\u007f\u0007tsA0JhP.`ݷ2\u000fq{<$q$yّCU(\r*\tUNmg\u0005Ϻ\u000b\u000bq\u000eF'\tt:Im~m\u0014\u001f2pqm4ޜs=Gc=d\u0013/J$Nx3\u0011J.V!\u000fzq[<\u0016>R\t:\u0001 }\u0011(&\u001eF0\u0003.\\\u0016^LG\u001br\u0001Ǚ#ɨmB\\=0B\u000bM%Ld)\u001dv\u0010 YA\u000eߑ\u0017ȏW\u0003\u000fѸ,Y\u0011C\n?\u001bgU)\u0002ɥ\u007fɱ:d\bϬ--U\u0012kxF^\u000bXn\u0014wC]lcP<2N߅\bɁ@\u0010\u0016ͺ?J48(r(\u00109\u0002\u0001aĜT\u0019"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW!u+\bK\u0002/:R\u0016=\\W\u0018u>-\u007fo]H\bm9V5\u0003NWW\u0017i\\\u0004A\u0013\u0012gc", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq_I\u0012!\u0015C~\u0012F\u007f\b1b|'7zk", ">q^Ab*HZ'", "", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "Ad[2V;>R", "5dc X3>Q(~y", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc X3>Q(~y", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "CmbBc7H`(~y", "", "5dc\"a:N^$\t\bm,{", "u(I", "Adc\"a:N^$\t\bm,{", "uY\u0018#", "7me<^,", "", ">q^El", ";dc5b+", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "/qV@", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExnBY~'7k%w5CJn>\u001dj^H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001etS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.protocols = protocols;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
                return true;
            }
            if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (Intrinsics.areEqual(name, "protocols") && objArr.length == 0) {
                return this.protocols;
            }
            if ((Intrinsics.areEqual(name, "selectProtocol") || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i2 = 0;
                        while (true) {
                            Object obj2 = list.get(i2);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.protocols.contains(str)) {
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            } else {
                                this.selected = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.areEqual(name, "protocolSelected") && !Intrinsics.areEqual(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            this.selected = (String) obj3;
            return null;
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z2) {
            this.unsupported = z2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f4\u0002B%s&\bBiWۥ\u0002%"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW!u+\bK\u0002/:R\u0016=\\W\u0018u>-\u007fo]H\bm9V5\u0005QTY(eV|Fi", "", "u(E", "0tX9W\u0010?A)\n\u0006h9\f\t.", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW'}!DZ\b-?C", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Platform buildIfSupported() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.putMethod = putMethod;
        this.getMethod = getMethod;
        this.removeMethod = removeMethod;
        this.clientProviderClass = clientProviderClass;
        this.serverProviderClass = serverProviderClass;
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.removeMethod.invoke(null, sslSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.putMethod.invoke(null, sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(protocols))));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
            Intrinsics.checkNotNull(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
