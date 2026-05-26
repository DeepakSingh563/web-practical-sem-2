import { useState } from 'react'
import './App.css'

function App() {

  const [count, setCount] = useState(0)

  // Increment Function
  const increment = () => {
    setCount(count + 1)
  }

  // Decrement Function
  const decrement = () => {
    setCount(count - 1)
  }

  // Reset Function
  const reset = () => {
    setCount(0)
  }

  return (
    <div className="container">

      <h1>React Counter Application</h1>

      <h2 className="count">{count}</h2>

      <button onClick={increment}>
        Increment
      </button>

      <br /><br />

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button onClick={reset}>
        Reset
      </button>

    </div>
  )
}

export default App