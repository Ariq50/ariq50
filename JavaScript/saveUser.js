// A function to save the user's name and username as cookies
function saveUser() {
  var name = document.getElementById("name").value; // Get the value of the name input
  var username = document.getElementById("username").value; // Get the value of the username input
  if (name != "" && username != "") { // If both inputs are not empty
    setCookie("name", name); // Set the name cookie with the name value
    setCookie("username", username); // Set the username cookie with the username value
    // Reload the page
    window.location.reload();
  } else { // If either input is empty, display separate error window
    var message = "Please enter your name and username.";
    var newWindow = window.open("", "", "width=300, height=100"); // open a new window
    newWindow.document.write("<p>" + message + "</p>"); // write the message
    newWindow.document.write("<button onclick='window.close()'>Close</button>"); // write a button to close the window
  }
}
