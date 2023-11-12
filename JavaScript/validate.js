function validate() 
        {
            var inp = document.getElementById('name').value;

            inp = inp.toUpperCase();

            if(inp == "")
            {
                var error = "Please enter a US state name."  
            } else if (!/^[a-zA-Z]*$/g.test(inp)) {
                var error = "Invalid character(s)."
            } else {
                for(var i = 0; i < 6; i++)
                {
                    if(inp != stateCensusData[i][0])
                    {
                        var error = "Sorry, we do not have information about this state! We only have information about the following US states: Alabama, Alaska, Arizona, Arkansas, California, and Colorado. "
                    }
                }
            }
            var Error = document.getElementById('error');

            Error.innerHTML = error ;
        }
