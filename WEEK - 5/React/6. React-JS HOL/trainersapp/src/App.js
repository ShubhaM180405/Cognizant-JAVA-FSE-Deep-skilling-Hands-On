import { BrowserRouter, Routes, Route, Link } from "react-router-dom";

import Home from "./Components/Home";
import TrainersList from "./Components/TrainersList";
import TrainerDetails from "./Components/TrainerDetails";

import "./App.css";

function App() {

    return (

        <BrowserRouter>

            <div>

                <h1>My Academy Trainers App</h1>

                <Link to="/">Home</Link>

                {" | "}

                <Link to="/trainers">Show Trainers</Link>

                <hr />

                <Routes>

                    <Route path="/" element={<Home />} />

                    <Route path="/trainers" element={<TrainersList />} />

                    <Route
                        path="/trainer/:trainerId"
                        element={<TrainerDetails />}
                    />

                </Routes>

            </div>

        </BrowserRouter>

    );

}

export default App;