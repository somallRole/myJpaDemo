package com.demo.frankxu.common;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class MyX509TrustManager implements X509TrustManager{
	@Override
	 public X509Certificate[] getAcceptedIssuers() {
	        return null;  
	    }

	@Override
	public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

	}

	@Override
	    public void checkServerTrusted(X509Certificate[] chain, String authType)  throws CertificateException{

		}
}
