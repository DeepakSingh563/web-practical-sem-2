import './App.css'
import Student from './components/student'

function App() {

  return (
    <div className="container">

      <h1>Student Information</h1>

      <Student
        name="Raj"
        course="B.Tech"
        marks="90"
      />

      <Student
        name="Ram"
        course="M.Tech"
        marks="95"
      />

      <Student
        name="Rohan"
        course="MCA"
        marks="99"
      />

    </div>
  )
}

export default App