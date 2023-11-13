function checkRadioAndCheckbox() 
        {
            var nameEntered = document.getElementById("name").value;
            var radioSelected = document.querySelector('input[name="age"]:checked');
            var checkboxChecked = document.querySelector('input[name="browser"]:checked');
            
            if (nameEntered && radioSelected && checkboxChecked) 
            {
                document.getElementById("result").innerHTML = "Thanks, your data was submitted!";
                 allInformationSubmitted();
            } else if(nameEntered == "" && radioSelected && checkboxChecked)
              {
                document.getElementById("error").innerHTML = "Please enter your user name."
              } else if(nameEntered && !radioSelected && checkboxChecked)
              {
                document.getElementById("error").innerHTML = "Please select an age option from those provided."
              } else if(nameEntered && radioSelected && !checkboxChecked)
              {
                document.getElementById("error").innerHTML = "Please select a browser option from those provided."
              } else {
                document.getElementById("error").innerHTML = "Please fill in all fields."
              }
            }
