function squareFun(){
var box_size = document.getElementById("size").value;
var i, j;
//check if the size is not less than 3 and not more than 30
if(box_size<2||box_size>10){
document.write('Wrong Input');
}
else{
  //Hollow Square
document.write("Hollow Square");
document.write('<br/>');
//Draw the first row
for(i=0; i<box_size; i++)
document.write('*');
document.write('<br/>');

for(i=1; i<box_size; i++){
document.write('*');
for(j=0; j<=box_size; j++)
document.write('&nbsp');
document.write('*');
document.write('<br/>');
}

//Draw the last line
for(i=0; i<box_size; i++)
document.write('*');
document.write('<br/>');
}
}
