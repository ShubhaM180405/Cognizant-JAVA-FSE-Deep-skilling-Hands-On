import "./App.css";
import office from "./Images/office.jpg";

function App() {

  const officeList = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },

    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore"
    },

    {
      Name: "WeWork",
      Rent: 90000,
      Address: "Hyderabad"
    }

  ];

  return (

    <div className="container">

      <h1>Office Space, at Affordable Range</h1>

      <img
        src={office}
        width="30%"
        alt="Office Space"
      />

      <br /><br />

      {

        officeList.map((item, index) => (

          <div key={index} className="card">

            <h1>Name: {item.Name}</h1>

            <h3
              className={
                item.Rent <= 60000
                  ? "textRed"
                  : "textGreen"
              }
            >
              Rent: Rs. {item.Rent}
            </h3>

            <h3>
              Address: {item.Address}
            </h3>

            <hr />

          </div>

        ))

      }

    </div>

  );

}

export default App;