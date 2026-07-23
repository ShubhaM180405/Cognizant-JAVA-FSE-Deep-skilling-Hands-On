import { books } from "./Data";

function BookDetails() {

    return (

        <div>

            <h2>Book Details</h2>

            {

                books.map(book => (

                    <div key={book.id}>

                        <h3>{book.bname}</h3>

                        <p>{book.price}</p>

                    </div>

                ))

            }

        </div>

    );

}

export default BookDetails;