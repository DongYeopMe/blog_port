import React,{useState} from "react";
import { Link, useNavigate } from "react-router-dom";
function Home(){
    //스텁 데이터 카테고리
    const categories = [
        { id: 1, name: "TIL", path: "/category/til" },
        { id: 2, name: "Front", path: "/category/front" },
        { id: 3, name: "Back", path: "/category/back" },
        { id: 4, name: "Dev", path: "/category/dev" },
        { id: 4, name: "voca", path: "/category/voca" },
        
    ];


    return (
        <aside className="border-x rounded mr-8 min-w-64 px-2 py-4 h-lvh">
            <nav className="flex flex-col gap-2">
                {categories.map((categories)=>(
                    <Link
                    key={categories.id}
                    to={categories.path}
                    className="">
                    {categories.name}
                    </Link>
                ))}
            </nav>
        </aside>
    )
}
export default Home;