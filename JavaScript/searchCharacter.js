function searchCharacter() {
            // get the user input from the textarea and the input box
            var content = document.getElementById("content").value;
            content = content.toUpperCase();
            var character = document.getElementById("character").value;
            character = character.toUpperCase();
            // check if the character is valid
            if (character.length != 1) {
                alert("Please enter only one character to search.");
                return;
            }
            // count the number of occurrences of the character in the content
            var count = 0;
            for (var i = 0; i < content.length; i++) {
                if (content.charAt(i) == character) {
                    count++;
                }
            }
            // display the result in the output area or a new window
            var output = document.getElementById("output");
            if (count > 0) {
                output.value = "The character shows up " + count + " times in the content.";
            } else {
                output.value = ""; // clear the output area
                var message = "Search character not found in the content you typed.";
                var newWindow = window.open("", "", "width=300, height=100"); // open a new window
                newWindow.document.write("<p>" + message + "</p>"); // write the message
                newWindow.document.write("<button onclick='window.close()'>Close</button>"); // write a button to close the window
            }
        }
