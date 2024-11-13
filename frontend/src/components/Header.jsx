const Header= ()=>{
    return (
        <header className="sticky top-0 z-50 bg-neutral-500/75 p-4 text-white backdrop-blur-md">
            <div className=" flex flex-row mx-auto gap-x-8 md:container">
                <div className="ring-offset-background focus-visible:ring-ring cursor-pointer">Home</div>
                <div className="cursor-pointer">소개</div>
                <div className="cursor-pointer">블로그</div>
            </div>
        </header>
    );
}
export default Header;