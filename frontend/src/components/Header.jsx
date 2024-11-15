import { useNavigate } from "react-router-dom";
const Header= ()=>{
    const nav = useNavigate();



    return (
        <header className="sticky top-0 z-50 bg-neutral-500/75 p-4 text-white backdrop-blur-md">
            <div className=" mx-auto flex flex-row mx-auto gap-x-8 md:container">
                <div onClick = {()=>nav("/")}
                className="ring-offset-background focus-visible:ring-ring cursor-pointer">Home</div>
                <div onClick = {()=>nav("/introduction")}className="cursor-pointer">소개</div>
                <div onClick = {()=>nav("/Portpolio")}
                className="cursor-pointer">포트폴리오</div>
            </div>
        </header>
    );
}
export default Header;