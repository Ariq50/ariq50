// This function will apply the selected background color to the main area
        function changeBackgroundColor() {
            // Get the radio buttons from the form
            let radios = document.getElementsByName("bgColor");
            // Get the main area element
            let main = document.getElementById("main");
            // Loop through the radio buttons and check which one is selected
            for (let i = 0; i < radios.length; i++) {
                if (radios[i].checked) {
                    // Set the background color of the main area to the value of the selected radio button
                    main.style.backgroundColor = radios[i].value;
                    break;
                }
            }
        }
