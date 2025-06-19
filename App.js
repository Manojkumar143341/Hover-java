import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import GroupsPage from "./pages/GroupsPage";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/groups" element={<GroupsPage />} />
      </Routes>
    </Router>
  );
}

export default App;
