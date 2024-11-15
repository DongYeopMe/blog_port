import Header from "../components/Header"
import Footer from "../components/Footer"
import React from "react"

const Layout = (props) => {
    return (
        <div className="relative bg-neutral-50/30">
            <Header />
                <main className="container mx-auto flex flex-col p-2 sm:p-4 md:flex-row max-h-full">
                {props.children}
                </main>
            <Footer />
        </div>
    )
}
export default Layout