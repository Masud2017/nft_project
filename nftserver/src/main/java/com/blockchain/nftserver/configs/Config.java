package com.blockchain.nftserver.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Config {
    @Bean
    public Web3j getWeb3j() {
        return Web3j.build(new HttpService("http://localhost:8545"));
    }
}
