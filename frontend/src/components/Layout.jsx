import Header from "../components/Header"
import Footer from "../components/Footer"
import React from "react"
import { Link, useNavigate } from "react-router-dom";

const Layout = (props) => {
    //스텁 데이터 카테고리
    const categories = [
        { id: 1, name: "홈", emozi: "📖",path: "/" },
        { id: 2, name: "소개", emozi: "📖",path: "/introduction" },
        { id: 7, name: "전체",emozi: "🏨", path: "/all"},
        { id: 3, name: "TIL", emozi: "📖",path: "/TodayLearn" },
        { id: 4, name: "Front", emozi: "📲", path: "/category/front" },
        { id: 5, name: "Back",emozi: "🗃️", path: "/category/back" },
        { id: 6, name: "Calendar",emozi: "🎫", path: "/calendar" },
        
    ];
    return (
        <div className="relative bg-neutral-50/30">
            <Header />
                <main className="container mx-auto flex flex-col p-2 sm:p-4 md:flex-row max-h-full">
                    <aside className="border-x rounded mr-8 min-w-64 px-2 py-4 h-lvh">
                        <nav className="flex flex-col gap-2">
                            {categories.map((categories)=>(
                            <Link
                            key={categories.id}
                            to={categories.path}
                            className=" flex
                            font-bold text-sm whitespace-nowrap
                            ring-offset-background focus-visible:ring-ring focus-visible:ring-2 focus-visible:ring-offset-2 focus-visible:outline-none
                            rounded-md h-10 px-4 py-3 disabled:pointer-events-none disabled:opacity-50 transition-colors">
                                <span className="mr-2">{categories.emozi}</span>
                            {categories.name}
                            </Link>
                            ))}
                        </nav>
                    </aside>
                    {props.children}
                </main>
            <Footer />
        </div>
    )
}
export default Layout