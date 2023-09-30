function calcWeeklyPay() 
            {
                var item1, item2, item3, item4;
                var i1, i2, i3, i4, i1Total, i2Total, i3Total, i4Total;
                var item1Earnings, item2Earnings, item3Earnings, item4Earnings;
                var totalAmountSold, totalWeeklyEarnings;

                var error = "All values must be numbers and not be less than 0!";

                item1 = document.forms["frm1"].elements["I1"].value;
                item2 = document.forms["frm1"].elements["I2"].value;
                item3 = document.forms["frm1"].elements["I3"].value;
                item4 = document.forms["frm1"].elements["I4"].value;

                i1 = parseInt(item1);
                i2 = parseInt(item2);
                i3 = parseInt(item3);
                i4 = parseInt(item4);

                    i1Total = i1;
                    i2Total = i2;
                    i3Total = i3;
                    i4Total = i4;

                    document.forms["frm1"].elements["I1Total"].value = i1Total;
                    document.forms["frm1"].elements["I2Total"].value = i2Total;
                    document.forms["frm1"].elements["I3Total"].value = i3Total;
                    document.forms["frm1"].elements["I4Total"].value = i4Total;

                    totalAmountSold = (i1 + i2 + i3 + i4);
                    document.forms["frm1"].elements["TotalAmountSold"].value = totalAmountSold;

                    totalWeeklyEarnings = (((i1 * 20.99) + (i2 * 12.75) + (i3 * 9.95) + (i4 * 35.89)) * 1.09);
                    totalWeeklyEarnings = totalWeeklyEarnings.toFixed(2);
                    document.forms["frm1"].elements["TotalWeeklyEarnings"].value = totalWeeklyEarnings;

                    item1Earnings = i1 * 20.99;
                    item1Earnings = item1Earnings.toFixed(2);
                    document.forms["frm1"].elements["Item1Earnings"].value = item1Earnings;


                    item2Earnings = i2 * 12.75;
                    item2Earnings = item2Earnings.toFixed(2);
                    document.forms["frm1"].elements["Item2Earnings"].value = item2Earnings;


                    item3Earnings = i3 * 9.95;
                    item3Earnings = item3Earnings.toFixed(2);
                    document.forms["frm1"].elements["Item3Earnings"].value = item3Earnings;


                    item4Earnings = i4 * 35.89;
                    item4Earnings = item4Earnings.toFixed(2);
                    document.forms["frm1"].elements["Item4Earnings"].value = item4Earnings;
                }
