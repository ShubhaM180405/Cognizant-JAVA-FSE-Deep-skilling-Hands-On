import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Shubham Sangram Bej"
        School="DAV Public School"
        total={290}
        goal={3}
      />
    </div>
  );
}

export default App;