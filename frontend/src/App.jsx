import React, { createContext, useEffect, useState } from 'react';
import axios from 'axios';
import { Routes, Route } from 'react-router-dom';
import Layout from './components/Layout';
import Home from './pages/Home';
import Introduction from './pages/Introduction';
import TodayLearn from './pages/TodayLearn'
const mockData = [{
    id: 1,
    title: "Understanding Closures in JavaScript",
    content: "Closures are a powerful feature in JavaScript...",
    created_At: "2024-11-14T10:00:00Z",
    category: "TIL",
    description: "Learn how closures work and why they're useful.",
  },
  {
    id: 2,
    title: "Introduction to Docker",
    content:
      "Docker is a platform for developing, shipping, and running applications...",
    created_At: "2024-11-13T15:45:00Z",
    category: "TIL",
    description: "Understand the basics of containerization with Docker.",
  },
  {
    id: 3,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 4,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 5,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 6,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 7,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 8,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 9,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 10,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 11,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 12,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },
{
    id: 13,
    title: "What is REST API?",
    content: "REST stands for Representational State Transfer...",
    created_At: "2024-11-12T12:30:00Z",
    category: "TIL",
    description: "Learn about REST API principles and implementation.",
  },];
export const postStateContext = createContext(null);


function App() {
  const [isLoading,setIsLoading] = useState(true);

  return (
    <>
    <postStateContext.Provider value={mockData}>
      <Layout>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path='/introduction' element={<Introduction/>}/>
          <Route path='/TodayLearn' element={<TodayLearn/>}/>
        </Routes>
      </Layout>
    </postStateContext.Provider>
    </>
  );
}

export default App;
