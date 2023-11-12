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

        function findInArray()
        {
            var inp = document.getElementById('name').value;

            inp = inp.toUpperCase();

            if(inp == 'AL' || inp == 'ALABAMA')
            {
                stateAbr = stateCensusData[0][0];
                stateName = stateCensusData[0][1];
                stateCapitol = stateCensusData[0][2];
                statePopulation = stateCensusData[0][3];
            } else if(inp == 'AK' || inp == 'ALASKA') 
            {
                stateAbr = stateCensusData[1][0];
                stateName = stateCensusData[1][1];
                stateCapitol = stateCensusData[1][2];
                statePopulation = stateCensusData[1][3];
            } else if(inp == 'AZ' || inp == 'ARIZONA')
            {
                stateAbr = stateCensusData[2][0];
                stateName = stateCensusData[2][1];
                stateCapitol = stateCensusData[2][2];
                statePopulation = stateCensusData[2][3];
            } else if(inp == 'AR' || inp == 'ARKANSAS')
            {
                stateAbr = stateCensusData[3][0];
                stateName = stateCensusData[3][1];
                stateCapitol = stateCensusData[3][2];
                statePopulation = stateCensusData[3][3];
            } else if(inp == 'CA' || inp == 'CALIFORNIA')
            {
                stateAbr = stateCensusData[4][0];
                stateName = stateCensusData[4][1];
                stateCapitol = stateCensusData[4][2];
                statePopulation = stateCensusData[4][3];
            } else if(inp == 'CO' || inp == 'COLORADO')
            {
                stateAbr = stateCensusData[5][0];
                stateName = stateCensusData[5][1];
                stateCapitol = stateCensusData[5][2];
                statePopulation = stateCensusData[5][3];
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
