 function mathStuff(x)
            {
                var x = document.getElementById('x').value;
                var error = "";
                x = parseFloat(x);
                if(isValidFloat(x)){
                    var round = Math.round(x);
                var sqrt = Math.sqrt(x);
                sqrt = Math.round(sqrt);
                var tenths = x.toFixed(1);
                var hundredths = x.toFixed(2);
                var thousandths = x.toFixed(3);

                var X = document.getElementById('numberEntered');
                var Round = document.getElementById('round');
                var Sqrt = document.getElementById('sqrt');
                var Tenths = document.getElementById('tenths');
                var Hundredths = document.getElementById('hundredths');
                var Thousandths = document.getElementById('thousandths');

                X.innerHTML = x;
                Round.innerHTML = round;
                Sqrt.innerHTML = sqrt;
                Tenths.innerHTML = tenths;
                Hundredths.innerHTML = hundredths;
                Thousandths.innerHTML = thousandths;
                } else {
                    var error = "You need to type a number with at least 4 decimals, please try again."
                    var Error = document.getElementById('error');
                    Error.innerHTML = error ;
                } 
            }
