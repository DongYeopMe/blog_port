import React, { Fragment } from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import Header from "./layouts/Header";
import Footer from "./layouts/Footer";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <Fragment>
        <Header />
        <App />
        <Footer />
    </Fragment>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals