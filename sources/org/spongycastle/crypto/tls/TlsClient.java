package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsClient extends TlsPeer {
    TlsAuthentication getAuthentication() throws IOException;

    int[] getCipherSuites();

    Hashtable getClientExtensions() throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    Vector getClientSupplementalData() throws IOException;

    ProtocolVersion getClientVersion();

    short[] getCompressionMethods();

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsSession getSessionToResume();

    void init(TlsClientContext tlsClientContext);

    boolean isFallback();

    void notifyNewSessionTicket(NewSessionTicket newSessionTicket) throws IOException;

    void notifySelectedCipherSuite(int i2);

    void notifySelectedCompressionMethod(short s2);

    void notifyServerVersion(ProtocolVersion protocolVersion) throws IOException;

    void notifySessionID(byte[] bArr);

    void processServerExtensions(Hashtable hashtable) throws IOException;

    void processServerSupplementalData(Vector vector) throws IOException;
}
