function calcFinAvg(hwAvg, midExam, finalExam, participation)
            {
                var hwAvg = document.getElementById('hwAvg').value;
                var midExam = document.getElementById('midExam').value;
                var finalExam = document.getElementById('finalExam').value;
                var participation = document.getElementById('participation').value;

                var error = "Both values must be numbers and not be less than 0 and not greater than 100!";

                if (isNaN(hwAvg) || isNaN(midExam) || isNaN(finalExam) || isNaN(participation) 
                || hwAvg < 0 || midExam < 0 || hwAvg > 100 || midExam > 100
                || finalExam < 0 || participation < 0 || finalExam > 100 || participation > 100) {
                    document.forms["frm1"].elements["hwAvg"].value = "";
                    document.forms["frm1"].elements["midExam"].value = "";
                    document.forms["frm1"].elements["finalExam"].value = "";
                    document.forms["frm1"].elements["participation"].value = "";

                    var Error = document.getElementById('error');

                    Error.innerHTML = error ;
                } else {
                    finAvg = (.5 * hwAvg) + (.2 * midExam) + (.2 * finalExam) + (.1 * participation)
                    finAvg = finAvg.toFixed(2);
                
                    var FinAvg = document.getElementById('finAvg');

                    FinAvg.innerHTML = finAvg;

                    grade = getGrade(finAvg)

                    var Grade = document.getElementById('grade');

                    Grade.innerHTML = grade;

                    var error = "";

                    var Error = document.getElementById('error');

                    Error.innerHTML = error ;
                }                      
            }
            function getGrade(finAvg) {
                if (finAvg >= 90) {
                return 'A';
                }
                if (finAvg >= 80) {
                return 'B';
                }
                if (finAvg >= 70) {
                return 'C';
                }
                if (finAvg >= 60) {
                return 'D: Student Must Retake Course';
                }
                if (finAvg < 60 && finAvg >= 0)        
                return 'F: Student Must Retake Course';          
    }
