import "../stylesheets/home.scss";
import {useState} from "react";

import NavBar from "./NavBar";

const Home = ()=> {
    const [ycord,setYCord] = useState(0);
    window.addEventListener("scroll", (e)=> {
        setYCord(window.scrollY);
    });
    return (
        <>
            <NavBar stl = {{color:"red"}}/>
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