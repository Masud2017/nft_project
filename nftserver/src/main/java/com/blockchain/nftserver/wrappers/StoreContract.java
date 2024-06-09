package com.blockchain.nftserver.wrappers;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.5.0.
 */
@SuppressWarnings("rawtypes")
public class StoreContract extends Contract {
    public static final String BINARY = "0x608060405234801561000f575f80fd5b506101fc8061001d5f395ff3fe608060405234801561000f575f80fd5b5060043610610029575f3560e01c80630226cf9e1461002d575b5f80fd5b6100476004803603810190610042919061012f565b61005d565b6040516100549190610185565b60405180910390f35b5f7ff0c55d049e61d6dcd81c1f2715f135c87551e981a34759c240851595cfcb38c78260405161008d91906101ad565b60405180910390a192915050565b5f80fd5b5f8160030b9050919050565b6100b48161009f565b81146100be575f80fd5b50565b5f813590506100cf816100ab565b92915050565b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6100fe826100d5565b9050919050565b61010e816100f4565b8114610118575f80fd5b50565b5f8135905061012981610105565b92915050565b5f80604083850312156101455761014461009b565b5b5f610152858286016100c1565b92505060206101638582860161011b565b9150509250929050565b5f819050919050565b61017f8161016d565b82525050565b5f6020820190506101985f830184610176565b92915050565b6101a7816100f4565b82525050565b5f6020820190506101c05f83018461019e565b9291505056fea26469706673582212207bf8e6dc4aa8636d7a72f02e1539e847a7836f94dece3323989697c28aa062f364736f6c63430008150033";

    public static final String FUNC_HELLOFUNCTION = "helloFunction";

    public static final Event TRANSACTION_EVENT = new Event("Transaction", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected StoreContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected StoreContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected StoreContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected StoreContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<TransactionEventResponse> getTransactionEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(TRANSACTION_EVENT, transactionReceipt);
        ArrayList<TransactionEventResponse> responses = new ArrayList<TransactionEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransactionEventResponse typedResponse = new TransactionEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static TransactionEventResponse getTransactionEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(TRANSACTION_EVENT, log);
        TransactionEventResponse typedResponse = new TransactionEventResponse();
        typedResponse.log = log;
        typedResponse.owner = (String) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<TransactionEventResponse> transactionEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getTransactionEventFromLog(log));
    }

    public Flowable<TransactionEventResponse> transactionEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSACTION_EVENT));
        return transactionEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> helloFunction(BigInteger data, String owner) {
        final Function function = new Function(
                FUNC_HELLOFUNCTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int32(data), 
                new org.web3j.abi.datatypes.Address(owner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static StoreContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new StoreContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static StoreContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new StoreContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static StoreContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new StoreContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static StoreContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new StoreContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<StoreContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(StoreContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<StoreContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(StoreContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<StoreContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(StoreContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<StoreContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(StoreContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static class TransactionEventResponse extends BaseEventResponse {
        public String owner;
    }
}
