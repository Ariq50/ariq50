// This function will apply the selected font size to the main area
        function changeFontSize() {
            // Get the select element from the form
            let select = document.getElementById("fontSize");
            // Get the main area element
            let main = document.getElementById("main");
            // Set the font size of the main area to the value of the selected option
            main.style.fontSize = select.value;
        }
