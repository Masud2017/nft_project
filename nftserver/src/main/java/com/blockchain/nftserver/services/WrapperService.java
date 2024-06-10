package com.blockchain.nftserver.services;

import com.blockchain.nftserver.wrappers.StoreContract;
import io.reactivex.disposables.Disposable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;

@Service
public class WrapperService {
    Web3j web3j;
    @Autowired
    public WrapperService(Web3j web3j) {
        this.web3j = web3j;
    }

    public void yo() {
        Credentials credentials = Credentials.create("WALLET_PRIVATE_KEY");
        TransactionManager transactionManager = new RawTransactionManager(this.web3j,credentials,14556);
        StoreContract contract = StoreContract.load("",this.web3j,transactionManager,new DefaultGasProvider());

        Disposable result = contract.transactionEventFlowable(new EthFilter()).subscribe(event -> {
            final String owner = event.owner;
            // do something with the owner
        });


        result.dispose();
    }

}
