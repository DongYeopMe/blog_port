import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Routes, Route } from 'react-router-dom';
import Layout from './components/Layout';
import Home from './pages/Home';
import Introduction from './pages/Introduction';
function App() {
  const [isLoading,setIsLoading] = useState(true);

  return (
    <>
      <Layout>
      <Routes>
      <Route path="/" element={<Home/>}/>
      <Route path='/introduction' element={<Introduction/>}/>
      </Routes>
      </Layout>
    </>
  );
}

export default App;
