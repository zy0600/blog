package org.zm.sso.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.zm.sso.utils.RSAUtils;

import javax.annotation.PostConstruct;
import java.security.PrivateKey;
import java.security.PublicKey;

@Data
@ConfigurationProperties(prefix = "rsa.key")     //指定配置文件的key
public class RsaKeyProperties {

    private String pubKeyPath;
    private String priKeyPath;

    private PublicKey publicKey;
    private PrivateKey privateKey;

    @PostConstruct
    public void createKey() throws Exception {
        this.publicKey = RSAUtils.getPublicKey(pubKeyPath);
        this.privateKey = RSAUtils.getPrivateKey(priKeyPath);
    }
}
