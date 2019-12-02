package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class TurbineApplication
{

    public static void main(String[] args) {

        SpringApplication.run(TurbineApplication.class, args);
    }


    //public RestTemplate buildRestTemplate() {
    //
    //    HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
    //    // https
    //    factory.setHttpClient(getHttpsClient());
    //    return new RestTemplate(factory);
    //}
    //
    //public CloseableHttpClient getHttpsClient() {
    //
    //    try {
    //        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, new TrustStrategy()
    //        {
    //            @Override
    //            public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
    //                return true;
    //            }
    //        }).build();
    //        return HttpClients.custom().setSSLContext(sslContext).
    //                setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
    //    } catch (Exception e) {
    //        e.getStackTrace();
    //    }
    //    return null;
    //}
}