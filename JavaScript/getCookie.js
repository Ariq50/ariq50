// A function to get the value of a cookie with a given name
function getCookie(name) {
  var cookies = document.cookie.split(";"); // Split the cookie string into an array of name-value pairs
  for (var i = 0; i < cookies.length; i++) { // Loop through the array
    var cookie = cookies[i].trim(); // Remove any leading or trailing spaces
    var parts = cookie.split("="); // Split the name and value of the cookie
    if (parts[0] == name) { // If the name matches the given name
      return parts[1]; // Return the value
    }
  }
  return ""; // If no cookie with the given name is found, return an empty string
}
