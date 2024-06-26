// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract StoreContract {
  int32 data;

  event Transaction(address owner);

  function getStorage() view returns (uint) {
    return data;
  }

  function helloFunction(int32 data,address owner) public returns(uint) {
    data = data;
    emit Transaction(owner);
  }
}
