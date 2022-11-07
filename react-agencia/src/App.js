import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import "../node_modules/bootstrap/dist/js/bootstrap";

import "./components/Navbar";
import NavBar from "./components/Navbar";
import Home from "./views/Home";

function App() {
  return (
    <div className="App">
    < NavBar/>
    < Home />
    </div>
  );
}

export default App;
