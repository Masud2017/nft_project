import "../stylesheets/home.scss";
import {useState} from "react";

import NavBar from "./NavBar";
import { Button } from "@mui/material";

const Home = ()=> {
    const [ycord,setYCord] = useState(0);
    window.addEventListener("scroll", (e)=> {
        setYCord(window.scrollY);
    });

    async function getNonce(address) {
        return await fetch(`/nonce/${address}`)
            .then(response => response.text());
    }

    const startAuth = async ()=> {
        const accounts = await window.ethereum.request({method: 'eth_requestAccounts'});
        const address = accounts[0];


        const nonce = await getNonce(address);
        const message = `Signing a message to login:${nonce}`;
        const signature = await window.ethereum.request({method: 'personal_sign', params: [message, address]});

        // console.log("Nonce : "+nonce)

        console.log(signature)

        console.log("Your address is : ",accounts)
        console.log(address);
    }

    return (
        <>
            <NavBar stl = {{color:"red"}}/>
            <Button variant="outlined" onClick={startAuth}>Connect wallet</Button>
            This is the text.
            
            <span style = {{"position":"fixed", "background-color":"black","color":"white","padding":"10px"}}>Value of scroll  coord ;  {ycord}</span>

            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            <h4>Sample text for making scroll system</h4>
            
            
        </>
    );
}

export default Home;