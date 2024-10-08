import React, { Fragment } from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import Layout from './layouts/Layout';
import LoginPage from './components/LoginPage';
import Home from './components/Home';
import { BrowserRouter } from 'react-router-dom';
import './index.css';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <Layout>
        <Home/>
    </Layout>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals