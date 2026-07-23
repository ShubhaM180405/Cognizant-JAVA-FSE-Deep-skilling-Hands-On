import "./App.css";

import CourseDetails from "./Components/CourseDetails";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";

function App() {

    const show = true;

    return (

        <div className="container">

            {

                show ?

                <>

                    <div className="column">

                        <CourseDetails/>

                    </div>

                    <div className="column">

                        <BookDetails/>

                    </div>

                    <div className="column">

                        <BlogDetails/>

                    </div>

                </>

                :

                <h2>No Data Available</h2>

            }

        </div>

    );

}

export default App;