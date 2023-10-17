 var principal = 1000;
            var years = 5;
            var interestRates = [0.05, 0.06, 0.07];

            for(var i = 0; i < interestRates.length; i++)
            {
                var rate = interestRates[i];
                document.write("<h2>Interest Rate: " + (rate * 100) + "%</h2>");
                document.write("<table>");
                document.write("<tr><th>Year</th><th>Amount</th><th>Interest Rate</th></tr>");

                for(var j = 1; j <= years; j++)
                {
                    var amount = principal * Math.pow((1 + rate), j);
                    var interest = amount - principal;
                    document.write("<tr><td>" + j + "</td><td>" + amount.toLocaleString('en-US', {style: 'currency', currency: 
                        'USD'}) + "</td><td>" + (rate * 100) + "%</td></tr>");
                }
                document.write("</table>");
            }
