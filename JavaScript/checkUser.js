// A function to check if the user has visited the page before
function checkUser() {
  var name = getCookie("name"); // Get the value of the name cookie
  var username = getCookie("username"); // Get the value of the username cookie
  if (name != "" && username != "") { // If both cookies are not empty
    // Display a welcome message with the name of the user
    document.getElementById("message").innerHTML = "Welcome back, " + name + "!";
  } else { // If either cookie is empty
    // Display a form for the user to enter his/her name and username
    document.getElementById("form").style.display = "block";
  }
}
