function drawHollowBox() 

 {
  
  var row = parseInt(document.getElementById("value").value); 
 
  var space = row-2;
 
  document.write( "<pre>" );
  
  if (row < 2 || row > 10) {

  document.write("Invalid Input. Value entered must be an integer between 2 and 10, inclusive.");
 
  }
 
  else {
 
 
  for (var i=0; i<row; i++) {
   if (i==0 || i==row-1) {
    for (var j=0; j<row; j++) 
    {
     {
      document.write("*");
 
     }
 
    }
 
  }else {
 
  document.write("*");
 
  for(var m=0; m<space; m++) 
  {
 
  document.write(" ");

  }
    document.write("*");

  }

    document.write("<br>");
  }
  
  }
  
 document.write( "</pre>" ); 

 } 
