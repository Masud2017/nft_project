import React, { useReducer } from 'react';
import ReactDOM from 'react-dom/client';
import Home from "./components/Home";
import reportWebVitals from './reportWebVitals';
import {createContext} from "react";
import { CssBaseline, ThemeProvider, createTheme } from '@mui/material';

const root = ReactDOM.createRoot(document.getElementById('root'));
const context = createContext({});

var theme = createTheme({
  // Theme customization goes here as usual, including tonalOffset and/or
  // contrastThreshold as the augmentColor() function relies on these
});

theme = createTheme(theme, {
  // Custom colors created with augmentColor go here
  palette: {
    salmon: theme.palette.augmentColor({
      color: {
        main: '#904B3D',
      },
      name: 'salmon',
    }),
  },

  components: {
    // Name of the component
    MuiButtonBase: {
      defaultProps: {
        // The props to change the default for.
        disableRipple: true, // No more ripple, on the whole application 💣!
      },
    },
  },
});

root.render(
  <ThemeProvider theme = {theme}>
    <CssBaseline>
    <context.Provider>
      <React.StrictMode>
        <Home/>
      </React.StrictMode>
    </context.Provider>
    </CssBaseline>
  </ThemeProvider>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
