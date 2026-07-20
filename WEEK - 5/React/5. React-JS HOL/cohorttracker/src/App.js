import './App.css';
import CohortDetails from './Components/CohortDetails';

function App() {

  const cohorts = [

    {
      code: "INTADMDF10 - .NET FSD",
      startedOn: "22-Feb-2027",
      currentStatus: "Scheduled",
      coach: "Aathma",
      trainer: "Shubham Bej"
    },

    {
      code: "ADM21JF014 - Java FSD",
      startedOn: "10-Jun-2026",
      currentStatus: "Ongoing",
      coach: "Apoorv",
      trainer: "Satyam Bej"
    },

    {
      code: "CDBJF21025 - Java FSD",
      startedOn: "18-Jul-2026",
      currentStatus: "Ongoing",
      coach: "Aathma",
      trainer: "Soham Bej"
    }

  ];

  return (

    <div>

      <h1>Cohorts Details</h1>

      {
        cohorts.map((cohort, index) => (

          <CohortDetails
            key={index}
            cohort={cohort}
          />

        ))
      }

    </div>

  );

}

export default App;