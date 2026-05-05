package org.spongycastle.dvcs;

import java.io.IOException;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.CMSProcessableByteArray;
import org.spongycastle.cms.CMSSignedData;
import org.spongycastle.cms.CMSSignedDataGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class SignedDVCSMessageGenerator {
    private final CMSSignedDataGenerator signedDataGen;

    public SignedDVCSMessageGenerator(CMSSignedDataGenerator cMSSignedDataGenerator) {
        this.signedDataGen = cMSSignedDataGenerator;
    }

    public CMSSignedData build(DVCSMessage dVCSMessage) throws DVCSException {
        try {
            return this.signedDataGen.generate(new CMSProcessableByteArray(dVCSMessage.getContentType(), dVCSMessage.getContent().toASN1Primitive().getEncoded("DER")), true);
        } catch (IOException e2) {
            throw new DVCSException("Could not encode DVCS request", e2);
        } catch (CMSException e3) {
            throw new DVCSException("Could not sign DVCS request", e3);
        }
    }
}
