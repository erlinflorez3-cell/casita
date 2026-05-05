package com.facetec.sdk;

import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class gu {
    private boolean B;
    private boolean Code;
    private int I = 0;
    private final List<fh> Z;

    public gu(List<fh> list) {
        this.Z = list;
    }

    public static boolean B(String str) {
        return str.equals(HttpPost.METHOD_NAME) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean Code(String str) {
        return str.equals("PROPFIND");
    }

    private boolean Code(SSLSocket sSLSocket) {
        for (int i2 = this.I; i2 < this.Z.size(); i2++) {
            if (this.Z.get(i2).Z(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public static String I() {
        return "okhttp/3.12.1";
    }

    public static String I(fp fpVar) {
        String strC = fpVar.C();
        String strL = fpVar.L();
        return strL != null ? new StringBuilder().append(strC).append('?').append(strL).toString() : strC;
    }

    private static boolean I(fv fvVar, Proxy.Type type) {
        return !fvVar.L() && type == Proxy.Type.HTTP;
    }

    public static boolean I(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean V(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String Z(fv fvVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(fvVar.Z());
        sb.append(TokenParser.SP);
        if (I(fvVar, type)) {
            sb.append(fvVar.Code());
        } else {
            sb.append(I(fvVar.Code()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static boolean Z(String str) {
        return str.equals(HttpPost.METHOD_NAME) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public final fh B(SSLSocket sSLSocket) throws IOException {
        fh fhVar;
        int i2 = this.I;
        int size = this.Z.size();
        while (true) {
            if (i2 >= size) {
                fhVar = null;
                break;
            }
            fhVar = this.Z.get(i2);
            if (fhVar.Z(sSLSocket)) {
                this.I = i2 + 1;
                break;
            }
            i2++;
        }
        if (fhVar == null) {
            throw new UnknownServiceException(new StringBuilder("Unable to find acceptable protocols. isFallback=").append(this.B).append(", modes=").append(this.Z).append(", supported protocols=").append(Arrays.toString(sSLSocket.getEnabledProtocols())).toString());
        }
        this.Code = Code(sSLSocket);
        ge.Code.I(fhVar, sSLSocket, this.B);
        return fhVar;
    }

    public final boolean V(IOException iOException) {
        this.B = true;
        if (!this.Code || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z2 = iOException instanceof SSLHandshakeException;
        if ((z2 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z2 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
