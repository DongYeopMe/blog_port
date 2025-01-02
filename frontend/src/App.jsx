import React, { createContext, useEffect, useState } from 'react';
import axios from 'axios';
import { Routes, Route } from 'react-router-dom';
import Layout from './components/Layout';
import Home from './pages/Home';
import Introduction from './pages/Introduction';
import TodayLearn from './pages/TodayLearn'
import PostPage from './pages/PostPage'
import Calendar from './pages/CalendarPage.jsx';
const mockData = [{
    id: 1,
    title: "제발 이거 클릭",
    content: `# Markdown Test Document

## Introduction

This is a **Markdown** document to test various features of Markdown rendering. Below are some examples of headers, lists, links, tables, and other elements.

---

## Headers

### H3 Header
#### H4 Header
##### H5 Header

---

## Text Formatting

- **Bold text**
- *Italic text*
- ~~Strikethrough text~~

> "This is a blockquote. Markdown is simple yet powerful!"

---

## Links and Images

### Links
- [Google](https://www.google.com)
- [Markdown Guide](https://www.markdownguide.org)

### Images
![Sample Image](https://via.placeholder.com/300x150)

---

## Lists

### Unordered List
- Item 1
    - Sub-item 1.1
    - Sub-item 1.2
- Item 2
- Item 3

### Ordered List
1. First Item
2. Second Item
    1. Sub-item 2.1
    2. Sub-item 2.2
3. Third Item
`,
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
          <Route path='/TodayLearn/post/:title' element={<PostPage/>}/>
          <Route path="/Calendar" element={<Calendar/>}/>
        </Routes>
      </Layout>
    </postStateContext.Provider>
    </>
  );
}

export default App;
