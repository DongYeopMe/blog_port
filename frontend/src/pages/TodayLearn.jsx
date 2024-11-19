import { useNavigate } from "react-router-dom";
import Post from "../components/Post"
import { postStateContext } from '../App'; // Context import
import { useContext, useState } from "react";

const TodayLearn = () =>{
    const nav = useNavigate();
    const data = useContext(postStateContext);
    const [sortType, setSortType] = useState("latest");

    const onChangeSortType = (e) =>{
        setSortType(e.target.value);
    }




    return (
        <main className="flex flex-col mb-4 mt-2 gap-2">
            <h1 className="text-center">TIL</h1>
            {data.map((post)=>(
            <Post
            key={post.id}
            title={post.title} 
            description={post.description} 
            created_At = {post.created_At}></Post>
           ))}
        </main>
    );
}
export default TodayLearn;