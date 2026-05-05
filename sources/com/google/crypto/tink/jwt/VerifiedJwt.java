package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.time.Instant;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
public final class VerifiedJwt {
    private final RawJwt rawJwt;

    VerifiedJwt(RawJwt rawJwt) {
        this.rawJwt = rawJwt;
    }

    public Set<String> customClaimNames() {
        return this.rawJwt.customClaimNames();
    }

    public List<String> getAudiences() throws JwtInvalidException {
        return this.rawJwt.getAudiences();
    }

    public Boolean getBooleanClaim(String name) throws JwtInvalidException {
        return this.rawJwt.getBooleanClaim(name);
    }

    public Instant getExpiration() throws JwtInvalidException {
        return this.rawJwt.getExpiration();
    }

    public Instant getIssuedAt() throws JwtInvalidException {
        return this.rawJwt.getIssuedAt();
    }

    public String getIssuer() throws JwtInvalidException {
        return this.rawJwt.getIssuer();
    }

    public String getJsonArrayClaim(String name) throws JwtInvalidException {
        return this.rawJwt.getJsonArrayClaim(name);
    }

    public String getJsonObjectClaim(String name) throws JwtInvalidException {
        return this.rawJwt.getJsonObjectClaim(name);
    }

    public String getJwtId() throws JwtInvalidException {
        return this.rawJwt.getJwtId();
    }

    public Instant getNotBefore() throws JwtInvalidException {
        return this.rawJwt.getNotBefore();
    }

    public Double getNumberClaim(String name) throws JwtInvalidException {
        return this.rawJwt.getNumberClaim(name);
    }

    public String getStringClaim(String name) throws JwtInvalidException {
        return this.rawJwt.getStringClaim(name);
    }

    public String getSubject() throws JwtInvalidException {
        return this.rawJwt.getSubject();
    }

    public String getTypeHeader() throws JwtInvalidException {
        return this.rawJwt.getTypeHeader();
    }

    public boolean hasAudiences() {
        return this.rawJwt.hasAudiences();
    }

    public boolean hasBooleanClaim(String name) {
        return this.rawJwt.hasBooleanClaim(name);
    }

    public boolean hasExpiration() {
        return this.rawJwt.hasExpiration();
    }

    public boolean hasIssuedAt() {
        return this.rawJwt.hasIssuedAt();
    }

    public boolean hasIssuer() {
        return this.rawJwt.hasIssuer();
    }

    public boolean hasJsonArrayClaim(String name) {
        return this.rawJwt.hasJsonArrayClaim(name);
    }

    public boolean hasJsonObjectClaim(String name) {
        return this.rawJwt.hasJsonObjectClaim(name);
    }

    public boolean hasJwtId() {
        return this.rawJwt.hasJwtId();
    }

    public boolean hasNotBefore() {
        return this.rawJwt.hasNotBefore();
    }

    public boolean hasNumberClaim(String name) {
        return this.rawJwt.hasNumberClaim(name);
    }

    public boolean hasStringClaim(String name) {
        return this.rawJwt.hasStringClaim(name);
    }

    public boolean hasSubject() {
        return this.rawJwt.hasSubject();
    }

    public boolean hasTypeHeader() {
        return this.rawJwt.hasTypeHeader();
    }

    public boolean isNullClaim(String name) {
        return this.rawJwt.isNullClaim(name);
    }

    public String toString() {
        return "verified{" + this.rawJwt + "}";
    }
}
