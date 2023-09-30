function calc(x1, x2, x3)
              {
              var x1 = document.getElementById('x1').value;
              var x2 = document.getElementById('x2').value;
              var x3 = document.getElementById('x3').value;
              
              var sum = ((x1*1) + (x2*1) + (x3*1));
              var average = ((sum) / 3);
              var product = ((x1*1) * (x2*1) * (x3*1));
              var max = Math.max((x1*1), (x2*1), (x3*1));
              var min = Math.min((x1*1), (x2*1), (x3*1));

              var Sum = document.getElementById('sum');
              var Average = document.getElementById('average');
              var Product = document.getElementById('product');
              var Max = document.getElementById('max');
              var Min = document.getElementById('min');

              Sum.innerHTML = sum;
              Average.innerHTML = average;
              Product.innerHTML = product;
              Max.innerHTML = max;
              Min.innerHTML = min;
         }
