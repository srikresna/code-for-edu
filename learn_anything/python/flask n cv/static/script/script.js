function validateForm() {
    var science = document.getElementById("science").value;
    var maths = document.getElementById("maths").value;
    var c = document.getElementById("c").value;
    var datascience = document.getElementById("datascience").value;
  
    if (science == "" || maths == "" || c == "" || datascience == "") {
      alert("All fields must be filled out");
      return false;
    }
  }