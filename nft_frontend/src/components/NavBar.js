import { BarChart, Search, Style } from "@mui/icons-material";
import { AppBar, Box, Button, LinearProgress, Menu, Typography, createTheme } from "@mui/material";
import { useState } from "react";

import SearchIcon from '@mui/icons-material/Search';


const NavBar = (props) => {
   
    const [color,setColor] = useState(false);
    

    window.addEventListener("scroll",(e)=> {
        if (window.scrollY >= 90) {
            setColor(true);
        } else {
            setColor(false);
        }
    })
    
    
    
    return (
            <Box>
                <AppBar position={color ? "fixed" : "static"} sx={{ bgcolor: color? props.stl.color : "primary", p : .5 }}>
                    <Typography variant="h6" component="div">
                        Logo
                    </Typography>
                </AppBar>
            </Box>
        
    );
}

export default NavBar;