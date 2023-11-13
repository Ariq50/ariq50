<!DOCTYPE html>
<html lang="en">
<head>
    <title>Homework 5, Part 3</title>
    <meta charset="utf-8">
    <meta name="description"
          content="Page for Homework 5, Part 3">
    <style>
        body {
            background-color: coral;
            text-align: center;
        }

        h1 {
            color: purple;
        }

        h2 {
            color: chartreuse;
        }

        h3 {
            color: blue;
        }
    </style>
</head>
<body>
    <h1>Homework 5</h1>
    <h2>Part 3</h2>
    <form id="frm1" action="form_action.asp">
        State Name Or Abbreviation: <input type="text" name="name" id="name"><br>
        <input type="button" onclick="findInArray()" value="Submit">
        <div>
            <p id="error"></p>
            <p>State Abr: </p><p id="stateAbr"></p>
            <p>State Name: </p><p id="stateName"></p>
            <p>Capitol: </p><p id="stateCapitol"></p>
            <p>Population: </p><p id="statePopulation"></p>
        </div>
        <input type='reset' value='Reset' name='reset'>
    </form>
    <script>
        var stateCensusData = [
                ["AL", "Alabama", "Montgomery", "4,903,185"],
                ["AK", "Alaska", "Juneau", "731,545"],
                ["AZ", "Arizona", "Phoenix", "7,278,717"],
                ["AR", "Arkansas", "Little Rock", "3,017,825"],
                ["CA", "California", "Sacramento", "39,512,223"],
                ["CO", "Colorado", "Denver", "5,758,736"],
        ];

        var stateAbr = "";
        var stateName = "";
        var stateCapitol = "";
        var statePopulation = "";

        var error = "";

        function findInArray()
        {
            var inp = document.getElementById('name').value;

            inp = inp.toUpperCase();

            if(validate())
            {
                document.forms["frm1"].elements["stateAbr"].value = "";
                document.forms["frm1"].elements["stateName"].value = "";
                document.forms["frm1"].elements["stateCapitol"].value = "";
                document.forms["frm1"].elements["statePopulation"].value = "";

                var Error = document.getElementById('error');

                Error.innerHTML = error ;
            }

            else if(inp == 'AL' || inp == 'ALABAMA')
            {
                stateAbr = stateCensusData[0][0];
                stateName = stateCensusData[0][1];
                stateCapitol = stateCensusData[0][2];
                statePopulation = stateCensusData[0][3];

                var error = "";

                var Error = document.getElementById('error');

                Error.innerHTML = error ;
            } else if(inp == 'AK' || inp == 'ALASKA') 
            {
                stateAbr = stateCensusData[1][0];
                stateName = stateCensusData[1][1];
                stateCapitol = stateCensusData[1][2];
                statePopulation = stateCensusData[1][3];

                var error = "";

                var Error = document.getElementById('error');

                Error.innerHTML = error ;
            } else if(inp == 'AZ' || inp == 'ARIZONA')
            {
                stateAbr = stateCensusData[2][0];
                stateName = stateCensusData[2][1];
                stateCapitol = stateCensusData[2][2];
                statePopulation = stateCensusData[2][3];

                var error = "";

                var Error = document.getElementById('error');

                Error.innerHTML = error ;
            } else if(inp == 'AR' || inp == 'ARKANSAS')
            {
                stateAbr = stateCensusData[3][0];
                stateName = stateCensusData[3][1];
                stateCapitol = stateCensusData[3][2];
                statePopulation = stateCensusData[3][3];

                var error = "";

                var Error = document.getElementById('error');

                Error.innerHTML = error ;
            } else if(inp == 'CA' || inp == 'CALIFORNIA')
            {
                stateAbr = stateCensusData[4][0];
                stateName = stateCensusData[4][1];
                stateCapitol = stateCensusData[4][2];
                statePopulation = stateCensusData[4][3];

                var error = "";

                var Error = document.getElementById('error');

                Error.innerHTML = error ;
            } else if(inp == 'CO' || inp == 'COLORADO')
            {
                stateAbr = stateCensusData[5][0];
                stateName = stateCensusData[5][1];
                stateCapitol = stateCensusData[5][2];
                statePopulation = stateCensusData[5][3];

                var error = "";

                var Error = document.getElementById('error');

                Error.innerHTML = error ;
            }

            var StateAbr = document.getElementById('stateAbr');
            var StateName = document.getElementById('stateName');
            var StateCapitol = document.getElementById('stateCapitol');
            var StatePopulation = document.getElementById('statePopulation');
            
            StateAbr.innerHTML = stateAbr;
            StateName.innerHTML = stateName;
            StateCapitol.innerHTML = stateCapitol;
            StatePopulation.innerHTML = statePopulation;
        }
        
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
                var error = "Sorry, we do not have information about this state! We only have information about the following US states: Alabama, Alaska, Arizona,Arkansas, California, and Colorado."
                }
            }

            var Error = document.getElementById('error');

            Error.innerHTML = error ;
        }
    </script>
    <h3>
        <a href="hw5.html"> Return to Homework 5</a>
    </h3>
</body>
</html>
