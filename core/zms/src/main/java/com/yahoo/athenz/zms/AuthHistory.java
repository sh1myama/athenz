//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// AuthHistory -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthHistory {
    public String domainName;
    public String principal;
    public Timestamp timestamp;
    public String endpoint;
    public long ttl;

    public AuthHistory setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return domainName;
    }
    public AuthHistory setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }
    public String getPrincipal() {
        return principal;
    }
    public AuthHistory setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public AuthHistory setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return endpoint;
    }
    public AuthHistory setTtl(long ttl) {
        this.ttl = ttl;
        return this;
    }
    public long getTtl() {
        return ttl;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != AuthHistory.class) {
                return false;
            }
            AuthHistory a = (AuthHistory) another;
            if (domainName == null ? a.domainName != null : !domainName.equals(a.domainName)) {
                return false;
            }
            if (principal == null ? a.principal != null : !principal.equals(a.principal)) {
                return false;
            }
            if (timestamp == null ? a.timestamp != null : !timestamp.equals(a.timestamp)) {
                return false;
            }
            if (endpoint == null ? a.endpoint != null : !endpoint.equals(a.endpoint)) {
                return false;
            }
            if (ttl != a.ttl) {
                return false;
            }
        }
        return true;
    }
}
