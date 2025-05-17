import React, { useEffect, useState } from "react";
import ReactDOM from "react-dom";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/hello")
      .then((res) => res.text())
      .then((data) => setMessage(data))
      .catch((err) => console.error("Fetch error:", err));
  }, []);

  return (
    <div style={{ fontSize: "24px", lineHeight: "2" }}>
      <h1>Backend Message:</h1>
      <p>{message || "Loading..."}</p>
    </div>
  );
}

ReactDOM.render(<App />, document.getElementById("root"));
