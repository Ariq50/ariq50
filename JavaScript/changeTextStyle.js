// This function will apply the selected text styles to the main area
        function changeTextStyle() {
            // Get the checkboxes from the form
            let checkboxes = document.getElementsByName("textStyle");
            // Get the main area element
            let main = document.getElementById("main");
            // Initialize an empty string to store the text styles
            let styles = "";
            // Loop through the checkboxes and check which ones are checked
            for (let i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].checked) {
                    // Append the value of the checked checkbox to the styles string
                    styles += checkboxes[i].value + " ";
                }
            }
            // Set the font style of the main area to the styles string
            main.style.fontStyle = styles;
        }
